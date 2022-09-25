package com.android.launcher3;

import android.app.backup.BackupDataOutput;
import android.app.backup.BackupHelper;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.android.launcher3.backup.BackupProtos$CheckedMessage;
import com.android.launcher3.backup.BackupProtos$DeviceProfieData;
import com.android.launcher3.backup.BackupProtos$Favorite;
import com.android.launcher3.backup.BackupProtos$Journal;
import com.android.launcher3.backup.BackupProtos$Key;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.zip.CRC32;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
public final class LauncherBackupHelper implements BackupHelper {
    private static final String[] FAVORITE_PROJECTION = {"_id", "modified", "intent", "appWidgetProvider", "appWidgetId", "cellX", "cellY", "container", "icon", "iconPackage", "iconResource", "iconType", "itemType", "screen", "spanX", "spanY", "title", "profileId", "rank"};
    private static final String[] SCREEN_PROJECTION = {"_id", "modified", "screenRank"};
    private final HashSet existingKeys;
    private boolean mBackupDataWasUpdated;
    private BackupManager mBackupManager;
    private byte[] mBuffer = new byte[512];
    final Context mContext;
    private BackupProtos$DeviceProfieData mDeviceProfileData;
    private int mHotseatShift = 0;
    private IconCache mIconCache;
    private InvariantDeviceProfile mIdp;
    private final ItemTypeMatcher[] mItemTypeMatchers;
    private final ArrayList mKeys;
    private long mLastBackupRestoreTime;
    private final long mUserSerial;
    BackupProtos$DeviceProfieData migrationCompatibleProfileData;
    boolean restoreSuccessful;
    int restoredBackupVersion = 1;
    final HashSet widgetSizes = new HashSet();

    /* compiled from: PG */
    final class InvalidBackupException extends IOException {
        private static final long serialVersionUID = 8931456637211665082L;

        public InvalidBackupException(String str) {
            super(str);
        }

        public InvalidBackupException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: PG */
    final class ItemTypeMatcher {
        public final ArrayList mIntents;

        public ItemTypeMatcher(int i) {
            this.mIntents = i == 0 ? new ArrayList() : parseIntents(i);
        }

        private final ArrayList parseIntents(int i) {
            ArrayList arrayList = new ArrayList();
            XmlResourceParser xml = LauncherBackupHelper.this.mContext.getResources().getXml(i);
            try {
                DefaultLayoutParser.beginDocument(xml, "resolve");
                int depth = xml.getDepth();
                while (true) {
                    int next = xml.next();
                    if (next == 3) {
                        if (xml.getDepth() <= depth) {
                            break;
                        }
                        next = 3;
                    }
                    if (next == 1) {
                        break;
                    } else if (next == 2 && "favorite".equals(xml.getName())) {
                        arrayList.add(Intent.parseUri(DefaultLayoutParser.getAttributeValue(xml, "uri"), 0));
                    }
                }
            } catch (IOException | URISyntaxException | XmlPullParserException e) {
                Log.e("LauncherBackupHelper", "Unable to parse " + i, e);
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
            xml.close();
            return arrayList;
        }
    }

    public LauncherBackupHelper(Context context) {
        this.mContext = context;
        this.existingKeys = new HashSet();
        this.mKeys = new ArrayList();
        this.restoreSuccessful = true;
        this.mItemTypeMatchers = new ItemTypeMatcher[7];
        this.mUserSerial = UserManagerCompat.getInstance(context).getSerialNumberForUser(UserHandleCompat.myUserHandle());
    }

    private final void applyJournal(BackupProtos$Journal backupProtos$Journal) {
        this.mLastBackupRestoreTime = backupProtos$Journal.f16557t_;
        this.existingKeys.clear();
        if (backupProtos$Journal.key_.size() != 0) {
            for (BackupProtos$Key keyToBackupKey$ar$ds : backupProtos$Journal.key_) {
                this.existingKeys.add(keyToBackupKey$ar$ds(keyToBackupKey$ar$ds));
            }
        }
        this.restoredBackupVersion = backupProtos$Journal.backupVersion_;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void backupIcons(android.app.backup.BackupDataOutput r15) {
        /*
            r14 = this;
            java.lang.String r0 = "LauncherBackupHelper"
            android.content.Context r1 = r14.mContext
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.content.Context r1 = r14.mContext
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            com.android.launcher3.compat.UserHandleCompat r8 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
            java.lang.String r3 = r14.getUserSelectionArg()
            android.net.Uri r4 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI
            java.lang.String[] r5 = FAVORITE_PROJECTION
            java.lang.String r6 = "(itemType=0 OR itemType=1) AND "
            java.lang.String r6 = r6.concat(r3)
            r7 = 0
            r9 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            r3 = -1
            r2.moveToPosition(r3)     // Catch:{ all -> 0x0110 }
            r3 = 0
            r4 = 0
        L_0x0037:
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x0110 }
            if (r5 == 0) goto L_0x010c
            long r5 = r2.getLong(r3)     // Catch:{ all -> 0x0110 }
            r7 = 2
            java.lang.String r9 = r2.getString(r7)     // Catch:{ all -> 0x0110 }
            android.content.Intent r9 = android.content.Intent.parseUri(r9, r3)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            android.content.ComponentName r10 = r9.getComponent()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = r10.flattenToShortString()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r11 = 3
            com.android.launcher3.backup.BackupProtos$Key r10 = getKey$ar$edu$fa8cc1cf_0$ar$ds(r11, r10)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            java.lang.String r11 = keyToBackupKey$ar$ds(r10)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            goto L_0x0074
        L_0x005e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r10.<init>()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            java.lang.String r11 = "empty intent on application favorite: "
            r10.append(r11)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r10.append(r5)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            java.lang.String r10 = r10.toString()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            android.util.Log.w(r0, r10)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r10 = 0
            r11 = r10
        L_0x0074:
            java.util.HashSet r12 = r14.existingKeys     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            boolean r12 = r12.contains(r11)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            if (r12 == 0) goto L_0x0082
            java.util.ArrayList r7 = r14.mKeys     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r7.add(r10)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            goto L_0x0037
        L_0x0082:
            if (r11 == 0) goto L_0x0037
            r11 = 10
            if (r4 >= r11) goto L_0x00db
            com.android.launcher3.IconCache r11 = r14.mIconCache     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            android.graphics.Bitmap r9 = r11.getIcon(r9, r8)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            if (r9 == 0) goto L_0x0037
            com.android.launcher3.IconCache r11 = r14.mIconCache     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            boolean r11 = r11.isDefaultIcon(r9, r8)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            if (r11 != 0) goto L_0x0037
            com.android.launcher3.backup.BackupProtos$Resource r11 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.android.launcher3.backup.BackupProtos$Resource$Builder r11 = (com.android.launcher3.backup.BackupProtos$Resource.Builder) r11     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r11.copyOnWrite()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.android.launcher3.backup.BackupProtos$Resource r12 = (com.android.launcher3.backup.BackupProtos$Resource) r12     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            int r13 = r12.bitField0_     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r13 = r13 | 1
            r12.bitField0_ = r13     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r12.dpi_ = r1     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            byte[] r9 = com.android.launcher3.Utilities.flattenBitmap(r9)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.google.protobuf.z r9 = com.google.protobuf.C63088z.m96139A(r9)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r11.copyOnWrite()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.android.launcher3.backup.BackupProtos$Resource r12 = (com.android.launcher3.backup.BackupProtos$Resource) r12     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            int r13 = r12.bitField0_     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r7 = r7 | r13
            r12.bitField0_ = r7     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r12.data_ = r9     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.google.protobuf.bv r7 = r11.build()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            com.android.launcher3.backup.BackupProtos$Resource r7 = (com.android.launcher3.backup.BackupProtos$Resource) r7     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            java.lang.String r9 = keyToBackupKey$ar$ds(r10)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r14.writeRowToBackup(r9, r7, r15)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            java.util.ArrayList r7 = r14.mKeys     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            r7.add(r10)     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            int r4 = r4 + 1
            goto L_0x0037
        L_0x00db:
            r14.dataChanged()     // Catch:{ URISyntaxException -> 0x00f6, IOException -> 0x00e0 }
            goto L_0x0037
        L_0x00e0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r7.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = "unable to save application icon for favorite: "
            r7.append(r9)     // Catch:{ all -> 0x0110 }
            r7.append(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0110 }
            android.util.Log.e(r0, r5)     // Catch:{ all -> 0x0110 }
            goto L_0x0037
        L_0x00f6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r7.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = "invalid URI on application favorite: "
            r7.append(r9)     // Catch:{ all -> 0x0110 }
            r7.append(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0110 }
            android.util.Log.e(r0, r5)     // Catch:{ all -> 0x0110 }
            goto L_0x0037
        L_0x010c:
            r2.close()
            return
        L_0x0110:
            r15 = move-exception
            r2.close()
            goto L_0x0116
        L_0x0115:
            throw r15
        L_0x0116:
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherBackupHelper.backupIcons(android.app.backup.BackupDataOutput):void");
    }

    private static final long checkKey$ar$ds(BackupProtos$Key backupProtos$Key) {
        CRC32 crc32 = new CRC32();
        int a = BackupProtos$Key.Type.m14179a(backupProtos$Key.type_);
        if (a == 0) {
            a = 1;
        }
        crc32.update(a);
        crc32.update((int) (backupProtos$Key.id_ & 65535));
        crc32.update((int) ((backupProtos$Key.id_ >> 32) & 65535));
        if (!backupProtos$Key.name_.isEmpty()) {
            crc32.update(backupProtos$Key.name_.getBytes());
        }
        return crc32.getValue();
    }

    private final void dataChanged() {
        if (this.mBackupManager == null) {
            this.mBackupManager = new BackupManager(this.mContext);
        }
        this.mBackupManager.dataChanged();
    }

    private final int getAppVersion() {
        try {
            return this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private final BackupProtos$Journal getCurrentStateJournal() {
        BackupProtos$Journal.Builder builder = (BackupProtos$Journal.Builder) BackupProtos$Journal.DEFAULT_INSTANCE.createBuilder();
        long j = this.mLastBackupRestoreTime;
        builder.copyOnWrite();
        BackupProtos$Journal backupProtos$Journal = (BackupProtos$Journal) builder.instance;
        backupProtos$Journal.bitField0_ |= 2;
        backupProtos$Journal.f16557t_ = j;
        ArrayList arrayList = this.mKeys;
        builder.copyOnWrite();
        BackupProtos$Journal backupProtos$Journal2 = (BackupProtos$Journal) builder.instance;
        C62971cq cqVar = backupProtos$Journal2.key_;
        if (!cqVar.mo58948c()) {
            backupProtos$Journal2.key_ = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) backupProtos$Journal2.key_);
        int appVersion = getAppVersion();
        builder.copyOnWrite();
        BackupProtos$Journal backupProtos$Journal3 = (BackupProtos$Journal) builder.instance;
        backupProtos$Journal3.bitField0_ |= 1;
        backupProtos$Journal3.appVersion_ = appVersion;
        builder.copyOnWrite();
        BackupProtos$Journal backupProtos$Journal4 = (BackupProtos$Journal) builder.instance;
        backupProtos$Journal4.bitField0_ |= 16;
        backupProtos$Journal4.backupVersion_ = 4;
        BackupProtos$DeviceProfieData backupProtos$DeviceProfieData = this.mDeviceProfileData;
        builder.copyOnWrite();
        BackupProtos$Journal backupProtos$Journal5 = (BackupProtos$Journal) builder.instance;
        backupProtos$DeviceProfieData.getClass();
        backupProtos$Journal5.profile_ = backupProtos$DeviceProfieData;
        backupProtos$Journal5.bitField0_ |= 32;
        return (BackupProtos$Journal) builder.build();
    }

    private static final BackupProtos$Key getKey$ar$edu$ar$ds(int i, long j) {
        BackupProtos$Key.Builder builder = (BackupProtos$Key.Builder) BackupProtos$Key.DEFAULT_INSTANCE.createBuilder();
        builder.copyOnWrite();
        BackupProtos$Key backupProtos$Key = (BackupProtos$Key) builder.instance;
        backupProtos$Key.type_ = i;
        backupProtos$Key.bitField0_ |= 1;
        builder.copyOnWrite();
        BackupProtos$Key backupProtos$Key2 = (BackupProtos$Key) builder.instance;
        backupProtos$Key2.bitField0_ |= 4;
        backupProtos$Key2.id_ = j;
        long checkKey$ar$ds = checkKey$ar$ds((BackupProtos$Key) builder.build());
        builder.copyOnWrite();
        BackupProtos$Key backupProtos$Key3 = (BackupProtos$Key) builder.instance;
        backupProtos$Key3.bitField0_ |= 8;
        backupProtos$Key3.checksum_ = checkKey$ar$ds;
        return (BackupProtos$Key) builder.build();
    }

    private static final BackupProtos$Key getKey$ar$edu$fa8cc1cf_0$ar$ds(int i, String str) {
        BackupProtos$Key.Builder builder = (BackupProtos$Key.Builder) BackupProtos$Key.DEFAULT_INSTANCE.createBuilder();
        builder.copyOnWrite();
        BackupProtos$Key backupProtos$Key = (BackupProtos$Key) builder.instance;
        backupProtos$Key.type_ = i;
        backupProtos$Key.bitField0_ |= 1;
        builder.copyOnWrite();
        BackupProtos$Key backupProtos$Key2 = (BackupProtos$Key) builder.instance;
        str.getClass();
        backupProtos$Key2.bitField0_ |= 2;
        backupProtos$Key2.name_ = str;
        long checkKey$ar$ds = checkKey$ar$ds((BackupProtos$Key) builder.build());
        builder.copyOnWrite();
        BackupProtos$Key backupProtos$Key3 = (BackupProtos$Key) builder.instance;
        backupProtos$Key3.bitField0_ |= 8;
        backupProtos$Key3.checksum_ = checkKey$ar$ds;
        return (BackupProtos$Key) builder.build();
    }

    private final String getUserSelectionArg() {
        long serialNumberForUser = UserManagerCompat.getInstance(this.mContext).getSerialNumberForUser(UserHandleCompat.myUserHandle());
        return "profileId=" + serialNumberForUser;
    }

    private static final BackupProtos$DeviceProfieData initDeviceProfileData$ar$ds(InvariantDeviceProfile invariantDeviceProfile) {
        BackupProtos$DeviceProfieData.Builder builder = (BackupProtos$DeviceProfieData.Builder) BackupProtos$DeviceProfieData.DEFAULT_INSTANCE.createBuilder();
        int i = invariantDeviceProfile.numRows;
        builder.copyOnWrite();
        BackupProtos$DeviceProfieData backupProtos$DeviceProfieData = (BackupProtos$DeviceProfieData) builder.instance;
        backupProtos$DeviceProfieData.bitField0_ |= 1;
        backupProtos$DeviceProfieData.desktopRows_ = (float) i;
        int i2 = invariantDeviceProfile.numColumns;
        builder.copyOnWrite();
        BackupProtos$DeviceProfieData backupProtos$DeviceProfieData2 = (BackupProtos$DeviceProfieData) builder.instance;
        backupProtos$DeviceProfieData2.bitField0_ |= 2;
        backupProtos$DeviceProfieData2.desktopCols_ = (float) i2;
        int i3 = invariantDeviceProfile.numHotseatIcons;
        builder.copyOnWrite();
        BackupProtos$DeviceProfieData backupProtos$DeviceProfieData3 = (BackupProtos$DeviceProfieData) builder.instance;
        backupProtos$DeviceProfieData3.bitField0_ |= 4;
        backupProtos$DeviceProfieData3.hotseatCount_ = (float) i3;
        int i4 = invariantDeviceProfile.hotseatAllAppsRank;
        builder.copyOnWrite();
        BackupProtos$DeviceProfieData backupProtos$DeviceProfieData4 = (BackupProtos$DeviceProfieData) builder.instance;
        backupProtos$DeviceProfieData4.bitField0_ |= 8;
        backupProtos$DeviceProfieData4.allappsRank_ = i4;
        return (BackupProtos$DeviceProfieData) builder.build();
    }

    private static final boolean isReplaceableHotseatItem$ar$ds(BackupProtos$Favorite backupProtos$Favorite) {
        if (backupProtos$Favorite.container_ != -101 || (backupProtos$Favorite.bitField0_ & 4096) == 0) {
            return false;
        }
        int i = backupProtos$Favorite.itemType_;
        return i == 0 || i == 1;
    }

    private static final String keyToBackupKey$ar$ds(BackupProtos$Key backupProtos$Key) {
        return Base64.encodeToString(backupProtos$Key.toByteArray(), 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024a, code lost:
        r14 = com.android.launcher3.backup.BackupProtos$Favorite.TargetType.m14178a(r4);
        r0.copyOnWrite();
        r1 = (com.android.launcher3.backup.BackupProtos$Favorite) r0.instance;
        r2 = r14 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0257, code lost:
        if (r14 == 0) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0259, code lost:
        r1.targetType_ = r2;
        r1.bitField0_ |= com.google.android.apps.gsa.shared.logger.p7054d.C89885b.HTTP_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0263, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.android.launcher3.backup.BackupProtos$Favorite packFavorite(android.database.Cursor r14) {
        /*
            r13 = this;
            com.android.launcher3.backup.BackupProtos$Favorite r0 = com.android.launcher3.backup.BackupProtos$Favorite.DEFAULT_INSTANCE
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.android.launcher3.backup.BackupProtos$Favorite$Builder r0 = (com.android.launcher3.backup.BackupProtos$Favorite.Builder) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r1 = (com.android.launcher3.backup.BackupProtos$Favorite) r1
            int r2 = r1.bitField0_
            r3 = 2
            r2 = r2 | r3
            r1.bitField0_ = r2
            r2 = 0
            r1.itemType_ = r2
            long r4 = r14.getLong(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r1 = (com.android.launcher3.backup.BackupProtos$Favorite) r1
            int r6 = r1.bitField0_
            r7 = 1
            r6 = r6 | r7
            r1.bitField0_ = r6
            r1.id_ = r4
            r1 = 13
            int r1 = r14.getInt(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r4 = (com.android.launcher3.backup.BackupProtos$Favorite) r4
            int r5 = r4.bitField0_
            r6 = 16
            r5 = r5 | r6
            r4.bitField0_ = r5
            r4.screen_ = r1
            r1 = 7
            int r4 = r14.getInt(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r9 = 8
            r8 = r8 | r9
            r5.bitField0_ = r8
            r5.container_ = r4
            r4 = 5
            int r4 = r14.getInt(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r8 = r8 | 32
            r5.bitField0_ = r8
            r5.cellX_ = r4
            r4 = 6
            int r4 = r14.getInt(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r8 = r8 | 64
            r5.bitField0_ = r8
            r5.cellY_ = r4
            r4 = 14
            int r4 = r14.getInt(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r8 = r8 | 128(0x80, float:1.794E-43)
            r5.bitField0_ = r8
            r5.spanX_ = r4
            r4 = 15
            int r4 = r14.getInt(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r8 = r8 | 256(0x100, float:3.59E-43)
            r5.bitField0_ = r8
            r5.spanY_ = r4
            r4 = 11
            int r4 = r14.getInt(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r5.bitField0_ = r8
            r5.iconType_ = r4
            r4 = 18
            int r4 = r14.getInt(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r8 = r5.bitField0_
            r10 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r10
            r5.bitField0_ = r8
            r5.rank_ = r4
            java.lang.String r4 = r14.getString(r6)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 4
            if (r5 != 0) goto L_0x00ef
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            r4.getClass()
            int r8 = r5.bitField0_
            r8 = r8 | r6
            r5.bitField0_ = r8
            r5.title_ = r4
        L_0x00ef:
            java.lang.String r4 = r14.getString(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r8 = "LauncherBackupHelper"
            r10 = 0
            if (r5 != 0) goto L_0x0126
            android.content.Intent r4 = android.content.Intent.parseUri(r4, r2)     // Catch:{ URISyntaxException -> 0x011e }
            java.lang.String r5 = "profile"
            r4.removeExtra(r5)     // Catch:{ URISyntaxException -> 0x011c }
            java.lang.String r5 = r4.toUri(r2)     // Catch:{ URISyntaxException -> 0x011c }
            r0.copyOnWrite()     // Catch:{ URISyntaxException -> 0x011c }
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ URISyntaxException -> 0x011c }
            com.android.launcher3.backup.BackupProtos$Favorite r11 = (com.android.launcher3.backup.BackupProtos$Favorite) r11     // Catch:{ URISyntaxException -> 0x011c }
            r5.getClass()     // Catch:{ URISyntaxException -> 0x011c }
            int r12 = r11.bitField0_     // Catch:{ URISyntaxException -> 0x011c }
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r11.bitField0_ = r12     // Catch:{ URISyntaxException -> 0x011c }
            r11.intent_ = r5     // Catch:{ URISyntaxException -> 0x011c }
            goto L_0x0127
        L_0x011c:
            r5 = move-exception
            goto L_0x0120
        L_0x011e:
            r5 = move-exception
            r4 = r10
        L_0x0120:
            java.lang.String r11 = "Invalid intent"
            android.util.Log.e(r8, r11, r5)
            goto L_0x0127
        L_0x0126:
            r4 = r10
        L_0x0127:
            r5 = 12
            int r5 = r14.getInt(r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r11 = (com.android.launcher3.backup.BackupProtos$Favorite) r11
            int r12 = r11.bitField0_
            r3 = r3 | r12
            r11.bitField0_ = r3
            r11.itemType_ = r5
            if (r5 != r6) goto L_0x016e
            int r3 = r14.getInt(r6)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            int r6 = r5.bitField0_
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r5.bitField0_ = r6
            r5.appWidgetId_ = r3
            r3 = 3
            java.lang.String r14 = r14.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r14)
            if (r3 != 0) goto L_0x01d0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r3 = (com.android.launcher3.backup.BackupProtos$Favorite) r3
            r14.getClass()
            int r5 = r3.bitField0_
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r3.bitField0_ = r5
            r3.appWidgetProvider_ = r14
            goto L_0x01d0
        L_0x016e:
            if (r5 != r7) goto L_0x01d0
            int r3 = r11.iconType_
            if (r3 != 0) goto L_0x01b3
            r3 = 9
            java.lang.String r3 = r14.getString(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0194
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            r3.getClass()
            int r6 = r5.bitField0_
            r7 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r7
            r5.bitField0_ = r6
            r5.iconPackage_ = r3
        L_0x0194:
            r3 = 10
            java.lang.String r3 = r14.getString(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x01b3
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r5 = (com.android.launcher3.backup.BackupProtos$Favorite) r5
            r3.getClass()
            int r6 = r5.bitField0_
            r7 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r7
            r5.bitField0_ = r6
            r5.iconResource_ = r3
        L_0x01b3:
            byte[] r14 = r14.getBlob(r9)
            if (r14 == 0) goto L_0x01d0
            int r3 = r14.length
            if (r3 <= 0) goto L_0x01d0
            com.google.protobuf.z r14 = com.google.protobuf.C63088z.m96139A(r14)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r3 = (com.android.launcher3.backup.BackupProtos$Favorite) r3
            int r5 = r3.bitField0_
            r6 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 | r6
            r3.bitField0_ = r5
            r3.icon_ = r14
        L_0x01d0:
            com.google.protobuf.bv r14 = r0.build()
            com.android.launcher3.backup.BackupProtos$Favorite r14 = (com.android.launcher3.backup.BackupProtos$Favorite) r14
            boolean r14 = isReplaceableHotseatItem$ar$ds(r14)
            if (r14 == 0) goto L_0x0271
            if (r4 == 0) goto L_0x0271
            android.content.ComponentName r14 = r4.getComponent()
            if (r14 == 0) goto L_0x0271
            android.content.Context r14 = r13.mContext
            android.content.pm.PackageManager r14 = r14.getPackageManager()
            android.content.ComponentName r3 = r4.getComponent()     // Catch:{ NameNotFoundException -> 0x01f3 }
            android.content.pm.ActivityInfo r3 = r14.getActivityInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x01f3 }
            goto L_0x01fa
        L_0x01f3:
            r3 = move-exception
            java.lang.String r4 = "Target not found"
            android.util.Log.e(r8, r4, r3)
            r3 = r10
        L_0x01fa:
            if (r3 == 0) goto L_0x026a
            r4 = 0
        L_0x01fd:
            if (r4 >= r1) goto L_0x0271
            com.android.launcher3.LauncherBackupHelper$ItemTypeMatcher[] r5 = r13.mItemTypeMatchers
            r6 = r5[r4]
            if (r6 != 0) goto L_0x0214
            com.android.launcher3.LauncherBackupHelper$ItemTypeMatcher r6 = new com.android.launcher3.LauncherBackupHelper$ItemTypeMatcher
            int r7 = com.android.launcher3.backup.BackupProtos$Favorite.TargetType.m14178a(r4)
            int r7 = com.android.launcher3.CommonAppTypeParser.getResourceForItemType$ar$edu(r7)
            r6.<init>(r7)
            r5[r4] = r6
        L_0x0214:
            com.android.launcher3.LauncherBackupHelper$ItemTypeMatcher[] r5 = r13.mItemTypeMatchers
            r5 = r5[r4]
            java.util.ArrayList r5 = r5.mIntents
            int r6 = r5.size()
            r7 = 0
        L_0x021f:
            if (r7 >= r6) goto L_0x0267
            java.lang.Object r8 = r5.get(r7)
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r9 = r3.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r14.resolveActivity(r8, r2)
            if (r8 == 0) goto L_0x0264
            android.content.pm.ActivityInfo r9 = r8.activityInfo
            java.lang.String r9 = r9.name
            java.lang.String r11 = r3.name
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x024a
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            java.lang.String r8 = r8.name
            java.lang.String r9 = r3.targetActivity
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0264
        L_0x024a:
            int r14 = com.android.launcher3.backup.BackupProtos$Favorite.TargetType.m14178a(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.android.launcher3.backup.BackupProtos$Favorite r1 = (com.android.launcher3.backup.BackupProtos$Favorite) r1
            int r2 = r14 + -1
            if (r14 == 0) goto L_0x0263
            r1.targetType_ = r2
            int r14 = r1.bitField0_
            r2 = 262144(0x40000, float:3.67342E-40)
            r14 = r14 | r2
            r1.bitField0_ = r14
            goto L_0x0271
        L_0x0263:
            throw r10
        L_0x0264:
            int r7 = r7 + 1
            goto L_0x021f
        L_0x0267:
            int r4 = r4 + 1
            goto L_0x01fd
        L_0x026a:
            com.google.protobuf.bv r14 = r0.build()
            com.android.launcher3.backup.BackupProtos$Favorite r14 = (com.android.launcher3.backup.BackupProtos$Favorite) r14
            return r14
        L_0x0271:
            com.google.protobuf.bv r14 = r0.build()
            com.android.launcher3.backup.BackupProtos$Favorite r14 = (com.android.launcher3.backup.BackupProtos$Favorite) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherBackupHelper.packFavorite(android.database.Cursor):com.android.launcher3.backup.BackupProtos$Favorite");
    }

    private static byte[] readCheckedBytes(byte[] bArr, int i) {
        BackupProtos$CheckedMessage.Builder builder = (BackupProtos$CheckedMessage.Builder) BackupProtos$CheckedMessage.DEFAULT_INSTANCE.createBuilder();
        builder.copyOnWrite();
        BackupProtos$CheckedMessage backupProtos$CheckedMessage = (BackupProtos$CheckedMessage) builder.instance;
        backupProtos$CheckedMessage.bitField0_ |= 2;
        backupProtos$CheckedMessage.checksum_ = 0;
        builder.mergeFrom(bArr, 0, i, C62921ba.m95368a());
        CRC32 crc32 = new CRC32();
        crc32.update(((BackupProtos$CheckedMessage) builder.instance).payload_.mo59174N());
        if (((BackupProtos$CheckedMessage) builder.instance).checksum_ == crc32.getValue()) {
            return ((BackupProtos$CheckedMessage) builder.instance).payload_.mo59174N();
        }
        throw new C62974ct("checksum does not match");
    }

    private static final MessageLite unpackProto$ar$ds(MessageLite messageLite, byte[] bArr, int i) {
        return messageLite.toBuilder().mergeFrom(readCheckedBytes(bArr, i)).build();
    }

    private static final byte[] writeCheckedBytes$ar$ds(MessageLite messageLite) {
        BackupProtos$CheckedMessage.Builder builder = (BackupProtos$CheckedMessage.Builder) BackupProtos$CheckedMessage.DEFAULT_INSTANCE.createBuilder();
        builder.copyOnWrite();
        BackupProtos$CheckedMessage backupProtos$CheckedMessage = (BackupProtos$CheckedMessage) builder.instance;
        backupProtos$CheckedMessage.bitField0_ |= 2;
        backupProtos$CheckedMessage.checksum_ = 0;
        C63088z byteString = messageLite.toByteString();
        builder.copyOnWrite();
        BackupProtos$CheckedMessage backupProtos$CheckedMessage2 = (BackupProtos$CheckedMessage) builder.instance;
        byteString.getClass();
        backupProtos$CheckedMessage2.bitField0_ |= 1;
        backupProtos$CheckedMessage2.payload_ = byteString;
        CRC32 crc32 = new CRC32();
        crc32.update(((BackupProtos$CheckedMessage) builder.instance).payload_.mo59174N());
        long value = crc32.getValue();
        builder.copyOnWrite();
        BackupProtos$CheckedMessage backupProtos$CheckedMessage3 = (BackupProtos$CheckedMessage) builder.instance;
        backupProtos$CheckedMessage3.bitField0_ |= 2;
        backupProtos$CheckedMessage3.checksum_ = value;
        return ((BackupProtos$CheckedMessage) builder.build()).toByteArray();
    }

    private static final void writeJournal$ar$ds(ParcelFileDescriptor parcelFileDescriptor, BackupProtos$Journal backupProtos$Journal) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            fileOutputStream.write(writeCheckedBytes$ar$ds(backupProtos$Journal));
            fileOutputStream.close();
        } catch (IOException e) {
            Log.w("LauncherBackupHelper", "failed to write backup journal", e);
        }
    }

    private final void writeRowToBackup(String str, MessageLite messageLite, BackupDataOutput backupDataOutput) {
        byte[] writeCheckedBytes$ar$ds = writeCheckedBytes$ar$ds(messageLite);
        int length = writeCheckedBytes$ar$ds.length;
        backupDataOutput.writeEntityHeader(str, length);
        backupDataOutput.writeEntityData(writeCheckedBytes$ar$ds, length);
        this.mBackupDataWasUpdated = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x040a, code lost:
        if (r7 == false) goto L_0x042d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void performBackup(android.os.ParcelFileDescriptor r27, android.app.backup.BackupDataOutput r28, android.os.ParcelFileDescriptor r29) {
        /*
            r26 = this;
            r1 = r26
            r2 = r28
            r3 = r29
            java.lang.String r4 = "failed to close the journal"
            com.android.launcher3.backup.BackupProtos$Journal r0 = com.android.launcher3.backup.BackupProtos$Journal.DEFAULT_INSTANCE
            com.google.protobuf.bn r0 = r0.createBuilder()
            r5 = r0
            com.android.launcher3.backup.BackupProtos$Journal$Builder r5 = (com.android.launcher3.backup.BackupProtos$Journal.Builder) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.android.launcher3.backup.BackupProtos$Journal r0 = (com.android.launcher3.backup.BackupProtos$Journal) r0
            int r6 = r0.bitField0_
            r7 = 1
            r6 = r6 | r7
            r0.bitField0_ = r6
            r6 = 0
            r0.appVersion_ = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.android.launcher3.backup.BackupProtos$Journal r0 = (com.android.launcher3.backup.BackupProtos$Journal) r0
            int r8 = r0.bitField0_
            r9 = 2
            r8 = r8 | r9
            r0.bitField0_ = r8
            r10 = 0
            r0.f16557t_ = r10
            java.lang.String r10 = "LauncherBackupHelper"
            if (r27 != 0) goto L_0x003e
            com.google.protobuf.bv r0 = r5.build()
            com.android.launcher3.backup.BackupProtos$Journal r0 = (com.android.launcher3.backup.BackupProtos$Journal) r0
            goto L_0x00ab
        L_0x003e:
            java.io.FileInputStream r11 = new java.io.FileInputStream
            java.io.FileDescriptor r0 = r27.getFileDescriptor()
            r11.<init>(r0)
            int r0 = r11.available()     // Catch:{ IOException -> 0x009e }
            r12 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 >= r12) goto L_0x0090
            byte[] r12 = new byte[r0]     // Catch:{ IOException -> 0x009e }
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0055:
            if (r0 <= 0) goto L_0x0089
            int r16 = r11.read(r12, r14, r7)     // Catch:{ IOException -> 0x006c }
            if (r16 <= 0) goto L_0x0062
            int r0 = r0 - r16
            int r14 = r14 + r16
            goto L_0x0068
        L_0x0062:
            java.lang.String r0 = "unexpected end of file while reading journal."
            android.util.Log.w(r10, r0)     // Catch:{ IOException -> 0x006c }
            r0 = 0
        L_0x0068:
            r8 = r14
            r14 = r12
            r12 = r0
            goto L_0x006f
        L_0x006c:
            r8 = r14
            r12 = 0
            r14 = 0
        L_0x006f:
            byte[] r0 = readCheckedBytes(r14, r8)     // Catch:{ ct -> 0x0080 }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0080 }
            r5.mergeFrom((byte[]) r0, (com.google.protobuf.C62921ba) r9)     // Catch:{ ct -> 0x0080 }
            r12 = r14
            r0 = 0
            r9 = 2
            r13 = 1
        L_0x007e:
            r14 = r8
            goto L_0x0055
        L_0x0080:
            r0 = move-exception
            r15 = r0
            r5.clear()     // Catch:{ IOException -> 0x009e }
            r0 = r12
            r12 = r14
            r9 = 2
            goto L_0x007e
        L_0x0089:
            if (r13 != 0) goto L_0x0090
            java.lang.String r0 = "could not find a valid journal"
            android.util.Log.w(r10, r0, r15)     // Catch:{ IOException -> 0x009e }
        L_0x0090:
            r11.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x00a5
        L_0x0094:
            r0 = move-exception
            r8 = r0
            android.util.Log.w(r10, r4, r8)
            goto L_0x00a5
        L_0x009a:
            r0 = move-exception
            r2 = r0
            goto L_0x043e
        L_0x009e:
            r0 = move-exception
            android.util.Log.w(r10, r4, r0)     // Catch:{ all -> 0x009a }
            r11.close()     // Catch:{ IOException -> 0x0094 }
        L_0x00a5:
            com.google.protobuf.bv r0 = r5.build()
            com.android.launcher3.backup.BackupProtos$Journal r0 = (com.android.launcher3.backup.BackupProtos$Journal) r0
        L_0x00ab:
            android.content.Context r4 = r1.mContext
            android.content.ContentResolver r18 = r4.getContentResolver()
            android.net.Uri r19 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI
            java.lang.String[] r4 = FAVORITE_PROJECTION
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r4
            android.database.Cursor r5 = r18.query(r19, r20, r21, r22, r23)
            if (r5 != 0) goto L_0x00c6
        L_0x00c3:
            r2 = r3
            goto L_0x0437
        L_0x00c6:
            r5.close()
            com.android.launcher3.LauncherAppState r5 = com.android.launcher3.LauncherAppState.INSTANCE
            if (r5 == 0) goto L_0x00c3
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r5 = r1.mDeviceProfileData
            if (r5 != 0) goto L_0x00e3
            com.android.launcher3.LauncherAppState r5 = com.android.launcher3.LauncherAppState.getInstance()
            com.android.launcher3.InvariantDeviceProfile r8 = r5.mInvariantDeviceProfile
            r1.mIdp = r8
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r8 = initDeviceProfileData$ar$ds(r8)
            r1.mDeviceProfileData = r8
            com.android.launcher3.IconCache r5 = r5.mIconCache
            r1.mIconCache = r5
        L_0x00e3:
            long r8 = r0.f16557t_
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r11 = "lastBackupTime = "
            r5.<init>(r11)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r10, r5)
            java.util.ArrayList r5 = r1.mKeys
            r5.clear()
            r1.applyJournal(r0)
            long r8 = java.lang.System.currentTimeMillis()
            r1.mBackupDataWasUpdated = r6
            android.content.Context r5 = r1.mContext     // Catch:{ IOException -> 0x0427 }
            android.content.ContentResolver r20 = r5.getContentResolver()     // Catch:{ IOException -> 0x0427 }
            android.net.Uri r21 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ IOException -> 0x0427 }
            java.lang.String r23 = r26.getUserSelectionArg()     // Catch:{ IOException -> 0x0427 }
            r24 = 0
            r25 = 0
            r22 = r4
            android.database.Cursor r4 = r20.query(r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x0427 }
            r5 = -1
            r4.moveToPosition(r5)     // Catch:{ all -> 0x0422 }
        L_0x011e:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x0422 }
            r12 = 4
            if (r11 == 0) goto L_0x0158
            long r13 = r4.getLong(r6)     // Catch:{ all -> 0x0422 }
            long r18 = r4.getLong(r7)     // Catch:{ all -> 0x0422 }
            com.android.launcher3.backup.BackupProtos$Key r11 = getKey$ar$edu$ar$ds(r7, r13)     // Catch:{ all -> 0x0422 }
            java.util.ArrayList r13 = r1.mKeys     // Catch:{ all -> 0x0422 }
            r13.add(r11)     // Catch:{ all -> 0x0422 }
            java.lang.String r13 = keyToBackupKey$ar$ds(r11)     // Catch:{ all -> 0x0422 }
            java.util.HashSet r14 = r1.existingKeys     // Catch:{ all -> 0x0422 }
            boolean r13 = r14.contains(r13)     // Catch:{ all -> 0x0422 }
            if (r13 == 0) goto L_0x014c
            long r13 = r1.mLastBackupRestoreTime     // Catch:{ all -> 0x0422 }
            int r15 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x014c
            int r13 = r1.restoredBackupVersion     // Catch:{ all -> 0x0422 }
            if (r13 >= r12) goto L_0x011e
        L_0x014c:
            com.android.launcher3.backup.BackupProtos$Favorite r12 = r1.packFavorite(r4)     // Catch:{ all -> 0x0422 }
            java.lang.String r11 = keyToBackupKey$ar$ds(r11)     // Catch:{ all -> 0x0422 }
            r1.writeRowToBackup(r11, r12, r2)     // Catch:{ all -> 0x0422 }
            goto L_0x011e
        L_0x0158:
            r4.close()     // Catch:{ IOException -> 0x0427 }
            android.content.Context r4 = r1.mContext     // Catch:{ IOException -> 0x0427 }
            android.content.ContentResolver r18 = r4.getContentResolver()     // Catch:{ IOException -> 0x0427 }
            android.net.Uri r19 = com.android.launcher3.LauncherSettings$WorkspaceScreens.CONTENT_URI     // Catch:{ IOException -> 0x0427 }
            java.lang.String[] r20 = SCREEN_PROJECTION     // Catch:{ IOException -> 0x0427 }
            r21 = 0
            r22 = 0
            r23 = 0
            android.database.Cursor r4 = r18.query(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x0427 }
            r4.moveToPosition(r5)     // Catch:{ all -> 0x041d }
        L_0x0172:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x041d }
            if (r11 == 0) goto L_0x01d9
            long r13 = r4.getLong(r6)     // Catch:{ all -> 0x041d }
            long r18 = r4.getLong(r7)     // Catch:{ all -> 0x041d }
            r11 = 2
            com.android.launcher3.backup.BackupProtos$Key r13 = getKey$ar$edu$ar$ds(r11, r13)     // Catch:{ all -> 0x041d }
            java.util.ArrayList r11 = r1.mKeys     // Catch:{ all -> 0x041d }
            r11.add(r13)     // Catch:{ all -> 0x041d }
            java.lang.String r11 = keyToBackupKey$ar$ds(r13)     // Catch:{ all -> 0x041d }
            java.util.HashSet r14 = r1.existingKeys     // Catch:{ all -> 0x041d }
            boolean r11 = r14.contains(r11)     // Catch:{ all -> 0x041d }
            if (r11 == 0) goto L_0x019c
            long r14 = r1.mLastBackupRestoreTime     // Catch:{ all -> 0x041d }
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0172
        L_0x019c:
            com.android.launcher3.backup.BackupProtos$Screen r11 = com.android.launcher3.backup.BackupProtos$Screen.DEFAULT_INSTANCE     // Catch:{ all -> 0x041d }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ all -> 0x041d }
            com.android.launcher3.backup.BackupProtos$Screen$Builder r11 = (com.android.launcher3.backup.BackupProtos$Screen.Builder) r11     // Catch:{ all -> 0x041d }
            long r14 = r4.getLong(r6)     // Catch:{ all -> 0x041d }
            r11.copyOnWrite()     // Catch:{ all -> 0x041d }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ all -> 0x041d }
            com.android.launcher3.backup.BackupProtos$Screen r12 = (com.android.launcher3.backup.BackupProtos$Screen) r12     // Catch:{ all -> 0x041d }
            int r6 = r12.bitField0_     // Catch:{ all -> 0x041d }
            r6 = r6 | r7
            r12.bitField0_ = r6     // Catch:{ all -> 0x041d }
            r12.id_ = r14     // Catch:{ all -> 0x041d }
            r6 = 2
            int r12 = r4.getInt(r6)     // Catch:{ all -> 0x041d }
            r11.copyOnWrite()     // Catch:{ all -> 0x041d }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ all -> 0x041d }
            com.android.launcher3.backup.BackupProtos$Screen r14 = (com.android.launcher3.backup.BackupProtos$Screen) r14     // Catch:{ all -> 0x041d }
            int r15 = r14.bitField0_     // Catch:{ all -> 0x041d }
            r15 = r15 | r6
            r14.bitField0_ = r15     // Catch:{ all -> 0x041d }
            r14.rank_ = r12     // Catch:{ all -> 0x041d }
            com.google.protobuf.bv r6 = r11.build()     // Catch:{ all -> 0x041d }
            com.android.launcher3.backup.BackupProtos$Screen r6 = (com.android.launcher3.backup.BackupProtos$Screen) r6     // Catch:{ all -> 0x041d }
            java.lang.String r11 = keyToBackupKey$ar$ds(r13)     // Catch:{ all -> 0x041d }
            r1.writeRowToBackup(r11, r6, r2)     // Catch:{ all -> 0x041d }
            r6 = 0
            r12 = 4
            goto L_0x0172
        L_0x01d9:
            r4.close()     // Catch:{ IOException -> 0x0427 }
            r1.backupIcons(r2)     // Catch:{ IOException -> 0x0427 }
            android.content.Context r4 = r1.mContext     // Catch:{ IOException -> 0x0427 }
            android.content.ContentResolver r19 = r4.getContentResolver()     // Catch:{ IOException -> 0x0427 }
            android.content.Context r4 = r1.mContext     // Catch:{ IOException -> 0x0427 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ IOException -> 0x0427 }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ IOException -> 0x0427 }
            int r4 = r4.densityDpi     // Catch:{ IOException -> 0x0427 }
            java.lang.String r6 = r26.getUserSelectionArg()     // Catch:{ IOException -> 0x0427 }
            java.lang.String r11 = "itemType=4 AND "
            java.lang.String r22 = r11.concat(r6)     // Catch:{ IOException -> 0x0427 }
            android.net.Uri r20 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ IOException -> 0x0427 }
            java.lang.String[] r21 = FAVORITE_PROJECTION     // Catch:{ IOException -> 0x0427 }
            r23 = 0
            r24 = 0
            android.database.Cursor r6 = r19.query(r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0427 }
            android.content.Context r11 = r1.mContext     // Catch:{ IOException -> 0x0427 }
            com.android.launcher3.compat.AppWidgetManagerCompat r11 = com.android.launcher3.compat.AppWidgetManagerCompat.getInstance(r11)     // Catch:{ IOException -> 0x0427 }
            r6.moveToPosition(r5)     // Catch:{ all -> 0x0418 }
            r12 = 0
        L_0x0211:
            boolean r13 = r6.moveToNext()     // Catch:{ all -> 0x0418 }
            if (r13 == 0) goto L_0x0398
            r13 = 0
            long r14 = r6.getLong(r13)     // Catch:{ all -> 0x0418 }
            r13 = 3
            java.lang.String r5 = r6.getString(r13)     // Catch:{ all -> 0x0418 }
            android.content.ComponentName r20 = android.content.ComponentName.unflattenFromString(r5)     // Catch:{ all -> 0x0418 }
            if (r20 == 0) goto L_0x0231
            r7 = 4
            com.android.launcher3.backup.BackupProtos$Key r5 = getKey$ar$edu$fa8cc1cf_0$ar$ds(r7, r5)     // Catch:{ all -> 0x0418 }
            java.lang.String r7 = keyToBackupKey$ar$ds(r5)     // Catch:{ all -> 0x0418 }
            goto L_0x0247
        L_0x0231:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0418 }
            r5.<init>()     // Catch:{ all -> 0x0418 }
            java.lang.String r7 = "empty intent on appwidget: "
            r5.append(r7)     // Catch:{ all -> 0x0418 }
            r5.append(r14)     // Catch:{ all -> 0x0418 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0418 }
            android.util.Log.w(r10, r5)     // Catch:{ all -> 0x0418 }
            r5 = 0
            r7 = 0
        L_0x0247:
            java.util.HashSet r14 = r1.existingKeys     // Catch:{ all -> 0x0418 }
            boolean r14 = r14.contains(r7)     // Catch:{ all -> 0x0418 }
            if (r14 == 0) goto L_0x025a
            int r14 = r1.restoredBackupVersion     // Catch:{ all -> 0x0418 }
            if (r14 < r13) goto L_0x025a
            java.util.ArrayList r7 = r1.mKeys     // Catch:{ all -> 0x0418 }
            r7.add(r5)     // Catch:{ all -> 0x0418 }
            goto L_0x038c
        L_0x025a:
            if (r7 == 0) goto L_0x038c
            r7 = 5
            if (r12 >= r7) goto L_0x0384
            r7 = 4
            int r13 = r6.getInt(r7)     // Catch:{ all -> 0x0418 }
            com.android.launcher3.LauncherAppWidgetProviderInfo r7 = r11.getLauncherAppWidgetInfo(r13)     // Catch:{ all -> 0x0418 }
            if (r7 == 0) goto L_0x038c
            com.android.launcher3.backup.BackupProtos$Widget r13 = com.android.launcher3.backup.BackupProtos$Widget.DEFAULT_INSTANCE     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget$Builder r13 = (com.android.launcher3.backup.BackupProtos$Widget.Builder) r13     // Catch:{ all -> 0x0418 }
            android.content.ComponentName r14 = r7.provider     // Catch:{ all -> 0x0418 }
            java.lang.String r14 = r14.flattenToShortString()     // Catch:{ all -> 0x0418 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r15 = (com.android.launcher3.backup.BackupProtos$Widget) r15     // Catch:{ all -> 0x0418 }
            r14.getClass()     // Catch:{ all -> 0x0418 }
            r21 = r11
            int r11 = r15.bitField0_     // Catch:{ all -> 0x0418 }
            r20 = 1
            r11 = r11 | 1
            r15.bitField0_ = r11     // Catch:{ all -> 0x0418 }
            r15.provider_ = r14     // Catch:{ all -> 0x0418 }
            java.lang.String r11 = r7.label     // Catch:{ all -> 0x0418 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r14 = (com.android.launcher3.backup.BackupProtos$Widget) r14     // Catch:{ all -> 0x0418 }
            r11.getClass()     // Catch:{ all -> 0x0418 }
            int r15 = r14.bitField0_     // Catch:{ all -> 0x0418 }
            r17 = 2
            r15 = r15 | 2
            r14.bitField0_ = r15     // Catch:{ all -> 0x0418 }
            r14.label_ = r11     // Catch:{ all -> 0x0418 }
            android.content.ComponentName r11 = r7.configure     // Catch:{ all -> 0x0418 }
            if (r11 == 0) goto L_0x02aa
            r11 = 1
            goto L_0x02ab
        L_0x02aa:
            r11 = 0
        L_0x02ab:
            r13.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r14 = (com.android.launcher3.backup.BackupProtos$Widget) r14     // Catch:{ all -> 0x0418 }
            int r15 = r14.bitField0_     // Catch:{ all -> 0x0418 }
            r22 = 4
            r15 = r15 | 4
            r14.bitField0_ = r15     // Catch:{ all -> 0x0418 }
            r14.configure_ = r11     // Catch:{ all -> 0x0418 }
            int r11 = r7.icon     // Catch:{ all -> 0x0418 }
            if (r11 == 0) goto L_0x0347
            com.android.launcher3.backup.BackupProtos$Resource r11 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Resource$Builder r11 = (com.android.launcher3.backup.BackupProtos$Resource.Builder) r11     // Catch:{ all -> 0x0418 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Resource r14 = (com.android.launcher3.backup.BackupProtos$Resource) r14     // Catch:{ all -> 0x0418 }
            int r15 = r14.bitField0_     // Catch:{ all -> 0x0418 }
            r20 = 1
            r15 = r15 | 1
            r14.bitField0_ = r15     // Catch:{ all -> 0x0418 }
            r15 = 0
            r14.dpi_ = r15     // Catch:{ all -> 0x0418 }
            com.google.protobuf.z r14 = com.google.protobuf.C63088z.f170246b     // Catch:{ all -> 0x0418 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r15 = r11.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Resource r15 = (com.android.launcher3.backup.BackupProtos$Resource) r15     // Catch:{ all -> 0x0418 }
            r14.getClass()     // Catch:{ all -> 0x0418 }
            int r3 = r15.bitField0_     // Catch:{ all -> 0x0418 }
            r17 = 2
            r3 = r3 | 2
            r15.bitField0_ = r3     // Catch:{ all -> 0x0418 }
            r15.data_ = r14     // Catch:{ all -> 0x0418 }
            com.android.launcher3.IconCache r3 = r1.mIconCache     // Catch:{ all -> 0x0418 }
            android.content.ComponentName r14 = r7.provider     // Catch:{ all -> 0x0418 }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x0418 }
            int r15 = r7.icon     // Catch:{ all -> 0x0418 }
            android.graphics.drawable.Drawable r3 = r3.getFullResIcon((java.lang.String) r14, (int) r15)     // Catch:{ all -> 0x0418 }
            android.content.Context r14 = r1.mContext     // Catch:{ all -> 0x0418 }
            r15 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Bitmap r3 = com.android.launcher3.Utilities.createIconBitmap((android.graphics.drawable.Drawable) r3, (android.content.Context) r14, (float) r15)     // Catch:{ all -> 0x0418 }
            byte[] r3 = com.android.launcher3.Utilities.flattenBitmap(r3)     // Catch:{ all -> 0x0418 }
            com.google.protobuf.z r3 = com.google.protobuf.C63088z.m96139A(r3)     // Catch:{ all -> 0x0418 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Resource r14 = (com.android.launcher3.backup.BackupProtos$Resource) r14     // Catch:{ all -> 0x0418 }
            int r15 = r14.bitField0_     // Catch:{ all -> 0x0418 }
            r17 = 2
            r15 = r15 | 2
            r14.bitField0_ = r15     // Catch:{ all -> 0x0418 }
            r14.data_ = r3     // Catch:{ all -> 0x0418 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r3 = r11.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Resource r3 = (com.android.launcher3.backup.BackupProtos$Resource) r3     // Catch:{ all -> 0x0418 }
            int r14 = r3.bitField0_     // Catch:{ all -> 0x0418 }
            r15 = 1
            r14 = r14 | r15
            r3.bitField0_ = r14     // Catch:{ all -> 0x0418 }
            r3.dpi_ = r4     // Catch:{ all -> 0x0418 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r3 = r13.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r3 = (com.android.launcher3.backup.BackupProtos$Widget) r3     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Resource r11 = (com.android.launcher3.backup.BackupProtos$Resource) r11     // Catch:{ all -> 0x0418 }
            r11.getClass()     // Catch:{ all -> 0x0418 }
            r3.icon_ = r11     // Catch:{ all -> 0x0418 }
            int r11 = r3.bitField0_     // Catch:{ all -> 0x0418 }
            r11 = r11 | 8
            r3.bitField0_ = r11     // Catch:{ all -> 0x0418 }
            goto L_0x0349
        L_0x0347:
            r17 = 2
        L_0x0349:
            android.graphics.Point r3 = r7.getMinSpans$ar$ds()     // Catch:{ all -> 0x0418 }
            int r7 = r3.x     // Catch:{ all -> 0x0418 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r11 = r13.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r11 = (com.android.launcher3.backup.BackupProtos$Widget) r11     // Catch:{ all -> 0x0418 }
            int r14 = r11.bitField0_     // Catch:{ all -> 0x0418 }
            r14 = r14 | 32
            r11.bitField0_ = r14     // Catch:{ all -> 0x0418 }
            r11.minSpanX_ = r7     // Catch:{ all -> 0x0418 }
            int r3 = r3.y     // Catch:{ all -> 0x0418 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r7 = r13.instance     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r7 = (com.android.launcher3.backup.BackupProtos$Widget) r7     // Catch:{ all -> 0x0418 }
            int r11 = r7.bitField0_     // Catch:{ all -> 0x0418 }
            r11 = r11 | 64
            r7.bitField0_ = r11     // Catch:{ all -> 0x0418 }
            r7.minSpanY_ = r3     // Catch:{ all -> 0x0418 }
            com.google.protobuf.bv r3 = r13.build()     // Catch:{ all -> 0x0418 }
            com.android.launcher3.backup.BackupProtos$Widget r3 = (com.android.launcher3.backup.BackupProtos$Widget) r3     // Catch:{ all -> 0x0418 }
            java.lang.String r7 = keyToBackupKey$ar$ds(r5)     // Catch:{ all -> 0x0418 }
            r1.writeRowToBackup(r7, r3, r2)     // Catch:{ all -> 0x0418 }
            java.util.ArrayList r3 = r1.mKeys     // Catch:{ all -> 0x0418 }
            r3.add(r5)     // Catch:{ all -> 0x0418 }
            int r12 = r12 + 1
            goto L_0x0390
        L_0x0384:
            r21 = r11
            r17 = 2
            r26.dataChanged()     // Catch:{ all -> 0x0418 }
            goto L_0x0390
        L_0x038c:
            r21 = r11
            r17 = 2
        L_0x0390:
            r3 = r29
            r11 = r21
            r5 = -1
            r7 = 1
            goto L_0x0211
        L_0x0398:
            r6.close()     // Catch:{ IOException -> 0x0427 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ IOException -> 0x0427 }
            r3.<init>()     // Catch:{ IOException -> 0x0427 }
            java.util.ArrayList r4 = r1.mKeys     // Catch:{ IOException -> 0x0427 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0427 }
        L_0x03a6:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x0427 }
            if (r5 == 0) goto L_0x03ba
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x0427 }
            com.android.launcher3.backup.BackupProtos$Key r5 = (com.android.launcher3.backup.BackupProtos$Key) r5     // Catch:{ IOException -> 0x0427 }
            java.lang.String r5 = keyToBackupKey$ar$ds(r5)     // Catch:{ IOException -> 0x0427 }
            r3.add(r5)     // Catch:{ IOException -> 0x0427 }
            goto L_0x03a6
        L_0x03ba:
            java.util.HashSet r4 = r1.existingKeys     // Catch:{ IOException -> 0x0427 }
            r4.removeAll(r3)     // Catch:{ IOException -> 0x0427 }
            java.util.HashSet r3 = r1.existingKeys     // Catch:{ IOException -> 0x0427 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0427 }
        L_0x03c5:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0427 }
            if (r4 == 0) goto L_0x03d9
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0427 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0427 }
            r5 = -1
            r2.writeEntityHeader(r4, r5)     // Catch:{ IOException -> 0x0427 }
            r4 = 1
            r1.mBackupDataWasUpdated = r4     // Catch:{ IOException -> 0x0427 }
            goto L_0x03c5
        L_0x03d9:
            r4 = 1
            java.util.HashSet r3 = r1.existingKeys     // Catch:{ IOException -> 0x0427 }
            r3.clear()     // Catch:{ IOException -> 0x0427 }
            boolean r3 = r1.mBackupDataWasUpdated     // Catch:{ IOException -> 0x0427 }
            if (r3 != 0) goto L_0x040c
            int r3 = r0.bitField0_     // Catch:{ IOException -> 0x0427 }
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0407
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = r0.profile_     // Catch:{ IOException -> 0x0427 }
            if (r3 != 0) goto L_0x03ef
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = com.android.launcher3.backup.BackupProtos$DeviceProfieData.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0427 }
        L_0x03ef:
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r5 = r1.mDeviceProfileData     // Catch:{ IOException -> 0x0427 }
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x0427 }
            if (r3 == 0) goto L_0x0407
            int r3 = r0.backupVersion_     // Catch:{ IOException -> 0x0427 }
            r5 = 4
            if (r3 != r5) goto L_0x0407
            int r0 = r0.appVersion_     // Catch:{ IOException -> 0x0427 }
            int r3 = r26.getAppVersion()     // Catch:{ IOException -> 0x0427 }
            if (r0 == r3) goto L_0x0405
            goto L_0x0407
        L_0x0405:
            r7 = 0
            goto L_0x0408
        L_0x0407:
            r7 = 1
        L_0x0408:
            r1.mBackupDataWasUpdated = r7     // Catch:{ IOException -> 0x0427 }
            if (r7 == 0) goto L_0x042d
        L_0x040c:
            r1.mLastBackupRestoreTime = r8     // Catch:{ IOException -> 0x0427 }
            java.lang.String r0 = "#"
            com.android.launcher3.backup.BackupProtos$Journal r3 = r26.getCurrentStateJournal()     // Catch:{ IOException -> 0x0427 }
            r1.writeRowToBackup(r0, r3, r2)     // Catch:{ IOException -> 0x0427 }
            goto L_0x042d
        L_0x0418:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0427 }
            throw r0     // Catch:{ IOException -> 0x0427 }
        L_0x041d:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0427 }
            throw r0     // Catch:{ IOException -> 0x0427 }
        L_0x0422:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0427 }
            throw r0     // Catch:{ IOException -> 0x0427 }
        L_0x0427:
            r0 = move-exception
            java.lang.String r2 = "launcher backup has failed"
            android.util.Log.e(r10, r2, r0)
        L_0x042d:
            com.android.launcher3.backup.BackupProtos$Journal r0 = r26.getCurrentStateJournal()
            r2 = r29
            writeJournal$ar$ds(r2, r0)
            return
        L_0x0437:
            r26.dataChanged()
            writeJournal$ar$ds(r2, r0)
            return
        L_0x043e:
            r11.close()     // Catch:{ IOException -> 0x0442 }
            goto L_0x0447
        L_0x0442:
            r0 = move-exception
            r3 = r0
            android.util.Log.w(r10, r4, r3)
        L_0x0447:
            goto L_0x0449
        L_0x0448:
            throw r2
        L_0x0449:
            goto L_0x0448
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherBackupHelper.performBackup(android.os.ParcelFileDescriptor, android.app.backup.BackupDataOutput, android.os.ParcelFileDescriptor):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x0464 A[Catch:{ ct | IllegalArgumentException -> 0x04ae, IOException -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x047a A[Catch:{ ct | IllegalArgumentException -> 0x04ae, IOException -> 0x04b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void restoreEntity(android.app.backup.BackupDataInputStream r15) {
        /*
            r14 = this;
            java.lang.String r0 = "#"
            java.lang.String r1 = "LauncherBackupHelper"
            java.lang.String r2 = "invalid key read from stream"
            boolean r3 = r14.restoreSuccessful
            if (r3 != 0) goto L_0x000b
            return
        L_0x000b:
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = r14.mDeviceProfileData
            if (r3 != 0) goto L_0x0029
            com.android.launcher3.InvariantDeviceProfile r3 = new com.android.launcher3.InvariantDeviceProfile
            android.content.Context r4 = r14.mContext
            r3.<init>(r4)
            r14.mIdp = r3
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = initDeviceProfileData$ar$ds(r3)
            r14.mDeviceProfileData = r3
            com.android.launcher3.IconCache r3 = new com.android.launcher3.IconCache
            android.content.Context r4 = r14.mContext
            com.android.launcher3.InvariantDeviceProfile r5 = r14.mIdp
            r3.<init>(r4, r5)
            r14.mIconCache = r3
        L_0x0029:
            int r3 = r15.size()
            byte[] r4 = r14.mBuffer
            int r4 = r4.length
            if (r4 >= r3) goto L_0x0036
            byte[] r4 = new byte[r3]
            r14.mBuffer = r4
        L_0x0036:
            byte[] r4 = r14.mBuffer     // Catch:{ IOException -> 0x04b7 }
            r5 = 0
            r15.read(r4, r5, r3)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r15 = r15.getKey()     // Catch:{ IOException -> 0x04b7 }
            boolean r4 = r0.equals(r15)     // Catch:{ IOException -> 0x04b7 }
            r6 = 4
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0154
            java.util.ArrayList r15 = r14.mKeys     // Catch:{ IOException -> 0x04b7 }
            boolean r15 = r15.isEmpty()     // Catch:{ IOException -> 0x04b7 }
            if (r15 == 0) goto L_0x0131
            com.android.launcher3.backup.BackupProtos$Journal r15 = com.android.launcher3.backup.BackupProtos$Journal.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Journal$Builder r15 = (com.android.launcher3.backup.BackupProtos$Journal.Builder) r15     // Catch:{ IOException -> 0x04b7 }
            r15.copyOnWrite()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r0 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Journal r0 = (com.android.launcher3.backup.BackupProtos$Journal) r0     // Catch:{ IOException -> 0x04b7 }
            int r2 = r0.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r2 = r2 | r8
            r0.bitField0_ = r2     // Catch:{ IOException -> 0x04b7 }
            r0.appVersion_ = r5     // Catch:{ IOException -> 0x04b7 }
            r15.copyOnWrite()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r0 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Journal r0 = (com.android.launcher3.backup.BackupProtos$Journal) r0     // Catch:{ IOException -> 0x04b7 }
            int r2 = r0.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r2 = r2 | r7
            r0.bitField0_ = r2     // Catch:{ IOException -> 0x04b7 }
            r9 = 0
            r0.f16557t_ = r9     // Catch:{ IOException -> 0x04b7 }
            byte[] r0 = r14.mBuffer     // Catch:{ IOException -> 0x04b7 }
            byte[] r0 = readCheckedBytes(r0, r3)     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.b r15 = r15.mergeFrom((byte[]) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Journal$Builder r15 = (com.android.launcher3.backup.BackupProtos$Journal.Builder) r15     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r15 = r15.build()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Journal r15 = (com.android.launcher3.backup.BackupProtos$Journal) r15     // Catch:{ IOException -> 0x04b7 }
            r14.applyJournal(r15)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r0 = r14.mDeviceProfileData     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r2 = r15.profile_     // Catch:{ IOException -> 0x04b7 }
            if (r2 != 0) goto L_0x0098
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r2 = com.android.launcher3.backup.BackupProtos$DeviceProfieData.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
        L_0x0098:
            int r15 = r15.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r15 = r15 & 32
            if (r15 == 0) goto L_0x012d
            float r15 = r2.desktopCols_     // Catch:{ IOException -> 0x04b7 }
            r3 = 0
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            goto L_0x012d
        L_0x00a7:
            int r3 = r0.allappsRank_     // Catch:{ IOException -> 0x04b7 }
            float r4 = (float) r3     // Catch:{ IOException -> 0x04b7 }
            float r9 = r2.hotseatCount_     // Catch:{ IOException -> 0x04b7 }
            int r10 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r10 < 0) goto L_0x00b4
            r14.mHotseatShift = r5     // Catch:{ IOException -> 0x04b7 }
            r10 = 1
            goto L_0x00b5
        L_0x00b4:
            r10 = 0
        L_0x00b5:
            int r11 = r2.allappsRank_     // Catch:{ IOException -> 0x04b7 }
            if (r3 < r11) goto L_0x00c6
            float r12 = r0.hotseatCount_     // Catch:{ IOException -> 0x04b7 }
            float r12 = r12 - r4
            float r4 = (float) r11     // Catch:{ IOException -> 0x04b7 }
            float r9 = r9 - r4
            int r4 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x00c6
            int r3 = r3 - r11
            r14.mHotseatShift = r3     // Catch:{ IOException -> 0x04b7 }
            goto L_0x00c9
        L_0x00c6:
            if (r10 != 0) goto L_0x00c9
            goto L_0x012e
        L_0x00c9:
            float r3 = r0.desktopCols_     // Catch:{ IOException -> 0x04b7 }
            int r15 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x00d8
            float r15 = r0.desktopRows_     // Catch:{ IOException -> 0x04b7 }
            float r0 = r2.desktopRows_     // Catch:{ IOException -> 0x04b7 }
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 < 0) goto L_0x00d8
            goto L_0x012d
        L_0x00d8:
            boolean r15 = com.android.launcher3.model.GridSizeMigrationTask.ENABLED     // Catch:{ IOException -> 0x04b7 }
            if (r15 == 0) goto L_0x012e
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r15 = com.android.launcher3.backup.BackupProtos$DeviceProfieData.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData$Builder r15 = (com.android.launcher3.backup.BackupProtos$DeviceProfieData.Builder) r15     // Catch:{ IOException -> 0x04b7 }
            float r0 = r2.desktopCols_     // Catch:{ IOException -> 0x04b7 }
            r15.copyOnWrite()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r3 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = (com.android.launcher3.backup.BackupProtos$DeviceProfieData) r3     // Catch:{ IOException -> 0x04b7 }
            int r4 = r3.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r4 = r4 | r7
            r3.bitField0_ = r4     // Catch:{ IOException -> 0x04b7 }
            r3.desktopCols_ = r0     // Catch:{ IOException -> 0x04b7 }
            float r0 = r2.desktopRows_     // Catch:{ IOException -> 0x04b7 }
            r15.copyOnWrite()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r3 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = (com.android.launcher3.backup.BackupProtos$DeviceProfieData) r3     // Catch:{ IOException -> 0x04b7 }
            int r4 = r3.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r4 = r4 | r8
            r3.bitField0_ = r4     // Catch:{ IOException -> 0x04b7 }
            r3.desktopRows_ = r0     // Catch:{ IOException -> 0x04b7 }
            float r0 = r2.hotseatCount_     // Catch:{ IOException -> 0x04b7 }
            r15.copyOnWrite()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r3 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r3 = (com.android.launcher3.backup.BackupProtos$DeviceProfieData) r3     // Catch:{ IOException -> 0x04b7 }
            int r4 = r3.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r4 = r4 | r6
            r3.bitField0_ = r4     // Catch:{ IOException -> 0x04b7 }
            r3.hotseatCount_ = r0     // Catch:{ IOException -> 0x04b7 }
            int r0 = r2.allappsRank_     // Catch:{ IOException -> 0x04b7 }
            r15.copyOnWrite()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r2 = (com.android.launcher3.backup.BackupProtos$DeviceProfieData) r2     // Catch:{ IOException -> 0x04b7 }
            int r3 = r2.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r3 = r3 | 8
            r2.bitField0_ = r3     // Catch:{ IOException -> 0x04b7 }
            r2.allappsRank_ = r0     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r15 = r15.build()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r15 = (com.android.launcher3.backup.BackupProtos$DeviceProfieData) r15     // Catch:{ IOException -> 0x04b7 }
            r14.migrationCompatibleProfileData = r15     // Catch:{ IOException -> 0x04b7 }
        L_0x012d:
            r5 = 1
        L_0x012e:
            r14.restoreSuccessful = r5     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x0131:
            java.util.ArrayList r15 = r14.mKeys     // Catch:{ IOException -> 0x04b7 }
            java.lang.Object r15 = r15.get(r5)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Key r15 = (com.android.launcher3.backup.BackupProtos$Key) r15     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r15 = keyToBackupKey$ar$ds(r15)     // Catch:{ IOException -> 0x04b7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04b7 }
            r0.<init>()     // Catch:{ IOException -> 0x04b7 }
            r0.append(r15)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r15 = " received after #"
            r0.append(r15)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r15 = r0.toString()     // Catch:{ IOException -> 0x04b7 }
            android.util.Log.wtf(r1, r15)     // Catch:{ IOException -> 0x04b7 }
            r14.restoreSuccessful = r5     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x0154:
            java.util.HashSet r4 = r14.existingKeys     // Catch:{ IOException -> 0x04b7 }
            boolean r4 = r4.isEmpty()     // Catch:{ IOException -> 0x04b7 }
            if (r4 != 0) goto L_0x0166
            java.util.HashSet r4 = r14.existingKeys     // Catch:{ IOException -> 0x04b7 }
            boolean r4 = r4.contains(r15)     // Catch:{ IOException -> 0x04b7 }
            if (r4 == 0) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            return
        L_0x0166:
            byte[] r4 = android.util.Base64.decode(r15, r5)     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            com.android.launcher3.backup.BackupProtos$Key r10 = com.android.launcher3.backup.BackupProtos$Key.DEFAULT_INSTANCE     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (byte[]) r4, (com.google.protobuf.C62921ba) r9)     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            com.android.launcher3.backup.BackupProtos$Key r4 = (com.android.launcher3.backup.BackupProtos$Key) r4     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            long r9 = r4.checksum_     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            long r11 = checkKey$ar$ds(r4)     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x049c
            java.util.ArrayList r15 = r14.mKeys     // Catch:{ IOException -> 0x04b7 }
            r15.add(r4)     // Catch:{ IOException -> 0x04b7 }
            int r15 = r4.type_     // Catch:{ IOException -> 0x04b7 }
            int r15 = com.android.launcher3.backup.BackupProtos$Key.Type.m14179a(r15)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "_id"
            if (r15 != 0) goto L_0x0191
            goto L_0x0289
        L_0x0191:
            if (r15 == r8) goto L_0x0289
            if (r15 == r7) goto L_0x025a
            r2 = 3
            if (r15 == r2) goto L_0x021a
            byte[] r15 = r14.mBuffer     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Widget r2 = com.android.launcher3.backup.BackupProtos$Widget.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.MessageLite r15 = unpackProto$ar$ds(r2, r15, r3)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Widget r15 = (com.android.launcher3.backup.BackupProtos$Widget) r15     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Resource r2 = r15.icon_     // Catch:{ IOException -> 0x04b7 }
            if (r2 != 0) goto L_0x01a8
            com.android.launcher3.backup.BackupProtos$Resource r2 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
        L_0x01a8:
            int r2 = r2.bitField0_     // Catch:{ IOException -> 0x04b7 }
            r2 = r2 & r7
            if (r2 == 0) goto L_0x01f4
            com.android.launcher3.backup.BackupProtos$Resource r2 = r15.icon_     // Catch:{ IOException -> 0x04b7 }
            if (r2 != 0) goto L_0x01b3
            com.android.launcher3.backup.BackupProtos$Resource r2 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
        L_0x01b3:
            com.google.protobuf.z r2 = r2.data_     // Catch:{ IOException -> 0x04b7 }
            byte[] r2 = r2.mo59174N()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Resource r3 = r15.icon_     // Catch:{ IOException -> 0x04b7 }
            if (r3 != 0) goto L_0x01bf
            com.android.launcher3.backup.BackupProtos$Resource r3 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
        L_0x01bf:
            com.google.protobuf.z r3 = r3.data_     // Catch:{ IOException -> 0x04b7 }
            int r3 = r3.mo59031d()     // Catch:{ IOException -> 0x04b7 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r2, r5, r3)     // Catch:{ IOException -> 0x04b7 }
            if (r8 != 0) goto L_0x01db
            java.lang.String r2 = "failed to unpack widget icon for "
            java.lang.String r3 = r4.name_     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ IOException -> 0x04b7 }
            android.util.Log.w(r1, r2)     // Catch:{ IOException -> 0x04b7 }
            goto L_0x01f4
        L_0x01db:
            com.android.launcher3.IconCache r6 = r14.mIconCache     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = r15.provider_     // Catch:{ IOException -> 0x04b7 }
            android.content.ComponentName r7 = android.content.ComponentName.unflattenFromString(r2)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Resource r2 = r15.icon_     // Catch:{ IOException -> 0x04b7 }
            if (r2 != 0) goto L_0x01e9
            com.android.launcher3.backup.BackupProtos$Resource r2 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
        L_0x01e9:
            int r2 = r2.dpi_     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r9 = r15.label_     // Catch:{ IOException -> 0x04b7 }
            long r10 = r14.mUserSerial     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.InvariantDeviceProfile r12 = r14.mIdp     // Catch:{ IOException -> 0x04b7 }
            r6.preloadIcon$ar$ds(r7, r8, r9, r10, r12)     // Catch:{ IOException -> 0x04b7 }
        L_0x01f4:
            java.util.HashSet r2 = r14.widgetSizes     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r3 = r15.provider_     // Catch:{ IOException -> 0x04b7 }
            int r4 = r15.minSpanX_     // Catch:{ IOException -> 0x04b7 }
            int r15 = r15.minSpanY_     // Catch:{ IOException -> 0x04b7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04b7 }
            r5.<init>()     // Catch:{ IOException -> 0x04b7 }
            r5.append(r3)     // Catch:{ IOException -> 0x04b7 }
            r5.append(r0)     // Catch:{ IOException -> 0x04b7 }
            r5.append(r4)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r0 = ","
            r5.append(r0)     // Catch:{ IOException -> 0x04b7 }
            r5.append(r15)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r15 = r5.toString()     // Catch:{ IOException -> 0x04b7 }
            r2.add(r15)     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x021a:
            byte[] r15 = r14.mBuffer     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Resource r0 = com.android.launcher3.backup.BackupProtos$Resource.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.MessageLite r15 = unpackProto$ar$ds(r0, r15, r3)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Resource r15 = (com.android.launcher3.backup.BackupProtos$Resource) r15     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.z r0 = r15.data_     // Catch:{ IOException -> 0x04b7 }
            byte[] r0 = r0.mo59174N()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.z r2 = r15.data_     // Catch:{ IOException -> 0x04b7 }
            int r2 = r2.mo59031d()     // Catch:{ IOException -> 0x04b7 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r0, r5, r2)     // Catch:{ IOException -> 0x04b7 }
            if (r8 != 0) goto L_0x0246
            java.lang.String r15 = "failed to unpack icon for "
            java.lang.String r0 = r4.name_     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r15 = r15.concat(r0)     // Catch:{ IOException -> 0x04b7 }
            android.util.Log.w(r1, r15)     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x0246:
            com.android.launcher3.IconCache r6 = r14.mIconCache     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r0 = r4.name_     // Catch:{ IOException -> 0x04b7 }
            android.content.ComponentName r7 = android.content.ComponentName.unflattenFromString(r0)     // Catch:{ IOException -> 0x04b7 }
            int r15 = r15.dpi_     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r9 = ""
            long r10 = r14.mUserSerial     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.InvariantDeviceProfile r12 = r14.mIdp     // Catch:{ IOException -> 0x04b7 }
            r6.preloadIcon$ar$ds(r7, r8, r9, r10, r12)     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x025a:
            byte[] r15 = r14.mBuffer     // Catch:{ IOException -> 0x04b7 }
            android.content.Context r0 = r14.mContext     // Catch:{ IOException -> 0x04b7 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Screen r4 = com.android.launcher3.backup.BackupProtos$Screen.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.MessageLite r15 = unpackProto$ar$ds(r4, r15, r3)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Screen r15 = (com.android.launcher3.backup.BackupProtos$Screen) r15     // Catch:{ IOException -> 0x04b7 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ IOException -> 0x04b7 }
            r3.<init>()     // Catch:{ IOException -> 0x04b7 }
            long r4 = r15.id_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r4)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "screenRank"
            int r15 = r15.rank_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r15)     // Catch:{ IOException -> 0x04b7 }
            android.net.Uri r15 = com.android.launcher3.LauncherSettings$WorkspaceScreens.CONTENT_URI     // Catch:{ IOException -> 0x04b7 }
            r0.insert(r15, r3)     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x0289:
            byte[] r15 = r14.mBuffer     // Catch:{ IOException -> 0x04b7 }
            android.content.Context r0 = r14.mContext     // Catch:{ IOException -> 0x04b7 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r4 = com.android.launcher3.backup.BackupProtos$Favorite.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.MessageLite r15 = unpackProto$ar$ds(r4, r15, r3)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r15 = (com.android.launcher3.backup.BackupProtos$Favorite) r15     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bn r15 = r15.toBuilder()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite$Builder r15 = (com.android.launcher3.backup.BackupProtos$Favorite.Builder) r15     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r3 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r3 = (com.android.launcher3.backup.BackupProtos$Favorite) r3     // Catch:{ IOException -> 0x04b7 }
            int r4 = r3.screen_     // Catch:{ IOException -> 0x04b7 }
            int r3 = r3.container_     // Catch:{ IOException -> 0x04b7 }
            r7 = -101(0xffffffffffffff9b, float:NaN)
            if (r3 != r7) goto L_0x02ae
            int r3 = r14.mHotseatShift     // Catch:{ IOException -> 0x04b7 }
            int r4 = r4 + r3
        L_0x02ae:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ IOException -> 0x04b7 }
            r3.<init>()     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            long r9 = r9.id_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "screen"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "container"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.container_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "cellX"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.cellX_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "cellY"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.cellY_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "spanX"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.spanX_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "spanY"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.spanY_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "rank"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.rank_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r2 = (com.android.launcher3.backup.BackupProtos$Favorite) r2     // Catch:{ IOException -> 0x04b7 }
            int r9 = r2.itemType_     // Catch:{ IOException -> 0x04b7 }
            if (r9 != r8) goto L_0x035f
            java.lang.String r9 = "iconType"
            int r2 = r2.iconType_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r9, r2)     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r2 = (com.android.launcher3.backup.BackupProtos$Favorite) r2     // Catch:{ IOException -> 0x04b7 }
            int r9 = r2.iconType_     // Catch:{ IOException -> 0x04b7 }
            if (r9 != 0) goto L_0x0350
            java.lang.String r9 = "iconPackage"
            java.lang.String r2 = r2.iconPackage_     // Catch:{ IOException -> 0x04b7 }
            r3.put(r9, r2)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = "iconResource"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r9 = r9.iconResource_     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
        L_0x0350:
            java.lang.String r2 = "icon"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.z r9 = r9.icon_     // Catch:{ IOException -> 0x04b7 }
            byte[] r9 = r9.mo59174N()     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
        L_0x035f:
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r2 = (com.android.launcher3.backup.BackupProtos$Favorite) r2     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = r2.title_     // Catch:{ IOException -> 0x04b7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r9 = "title"
            if (r2 != 0) goto L_0x0377
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r2 = (com.android.launcher3.backup.BackupProtos$Favorite) r2     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = r2.title_     // Catch:{ IOException -> 0x04b7 }
            r3.put(r9, r2)     // Catch:{ IOException -> 0x04b7 }
            goto L_0x037c
        L_0x0377:
            java.lang.String r2 = ""
            r3.put(r9, r2)     // Catch:{ IOException -> 0x04b7 }
        L_0x037c:
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r2 = (com.android.launcher3.backup.BackupProtos$Favorite) r2     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r2 = r2.intent_     // Catch:{ IOException -> 0x04b7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x04b7 }
            if (r2 != 0) goto L_0x0393
            java.lang.String r2 = "intent"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r9 = r9.intent_     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
        L_0x0393:
            java.lang.String r2 = "itemType"
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.itemType_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r2, r9)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.compat.UserHandleCompat r2 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r9 = "profileId"
            android.content.Context r10 = r14.mContext     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.compat.UserManagerCompat r10 = com.android.launcher3.compat.UserManagerCompat.getInstance(r10)     // Catch:{ IOException -> 0x04b7 }
            long r10 = r10.getSerialNumberForUser(r2)     // Catch:{ IOException -> 0x04b7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r9, r2)     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r2 = r14.migrationCompatibleProfileData     // Catch:{ IOException -> 0x04b7 }
            if (r2 != 0) goto L_0x03bf
            com.android.launcher3.backup.BackupProtos$DeviceProfieData r2 = r14.mDeviceProfileData     // Catch:{ IOException -> 0x04b7 }
        L_0x03bf:
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r10 = r9.itemType_     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r11 = "restored"
            if (r10 != r6) goto L_0x041b
            java.lang.String r4 = r9.appWidgetProvider_     // Catch:{ IOException -> 0x04b7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x04b7 }
            if (r4 != 0) goto L_0x03dc
            java.lang.String r4 = "appWidgetProvider"
            com.google.protobuf.bv r6 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r6 = (com.android.launcher3.backup.BackupProtos$Favorite) r6     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r6 = r6.appWidgetProvider_     // Catch:{ IOException -> 0x04b7 }
            r3.put(r4, r6)     // Catch:{ IOException -> 0x04b7 }
        L_0x03dc:
            java.lang.String r4 = "appWidgetId"
            com.google.protobuf.bv r6 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r6 = (com.android.launcher3.backup.BackupProtos$Favorite) r6     // Catch:{ IOException -> 0x04b7 }
            int r6 = r6.appWidgetId_     // Catch:{ IOException -> 0x04b7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r4, r6)     // Catch:{ IOException -> 0x04b7 }
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r11, r4)     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r15 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r15 = (com.android.launcher3.backup.BackupProtos$Favorite) r15     // Catch:{ IOException -> 0x04b7 }
            int r4 = r15.cellX_     // Catch:{ IOException -> 0x04b7 }
            int r6 = r15.spanX_     // Catch:{ IOException -> 0x04b7 }
            int r4 = r4 + r6
            float r4 = (float) r4     // Catch:{ IOException -> 0x04b7 }
            float r6 = r2.desktopCols_     // Catch:{ IOException -> 0x04b7 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x0411
            int r4 = r15.cellY_     // Catch:{ IOException -> 0x04b7 }
            int r15 = r15.spanY_     // Catch:{ IOException -> 0x04b7 }
            int r4 = r4 + r15
            float r15 = (float) r4     // Catch:{ IOException -> 0x04b7 }
            float r2 = r2.desktopRows_     // Catch:{ IOException -> 0x04b7 }
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x0411
            goto L_0x048c
        L_0x0411:
            r14.restoreSuccessful = r5     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.LauncherBackupHelper$InvalidBackupException r15 = new com.android.launcher3.LauncherBackupHelper$InvalidBackupException     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r0 = "Widget not in screen bounds, aborting restore"
            r15.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x04b7 }
            throw r15     // Catch:{ IOException -> 0x04b7 }
        L_0x041b:
            com.google.protobuf.bv r9 = r15.build()     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            boolean r9 = isReplaceableHotseatItem$ar$ds(r9)     // Catch:{ IOException -> 0x04b7 }
            if (r9 == 0) goto L_0x0455
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.targetType_     // Catch:{ IOException -> 0x04b7 }
            int r9 = com.android.launcher3.backup.BackupProtos$Favorite.TargetType.m14178a(r9)     // Catch:{ IOException -> 0x04b7 }
            if (r9 != 0) goto L_0x0434
            goto L_0x0455
        L_0x0434:
            if (r9 == r8) goto L_0x0455
            java.lang.String r9 = "Added item type flag"
            android.util.Log.e(r1, r9)     // Catch:{ IOException -> 0x04b7 }
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r9 = (com.android.launcher3.backup.BackupProtos$Favorite) r9     // Catch:{ IOException -> 0x04b7 }
            int r9 = r9.targetType_     // Catch:{ IOException -> 0x04b7 }
            int r9 = com.android.launcher3.backup.BackupProtos$Favorite.TargetType.m14178a(r9)     // Catch:{ IOException -> 0x04b7 }
            if (r9 != 0) goto L_0x0448
            r9 = 1
        L_0x0448:
            int r9 = r9 + -1
            int r6 = r9 << 4
            r6 = r6 | r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r11, r6)     // Catch:{ IOException -> 0x04b7 }
            goto L_0x045c
        L_0x0455:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x04b7 }
            r3.put(r11, r6)     // Catch:{ IOException -> 0x04b7 }
        L_0x045c:
            com.google.protobuf.bv r15 = r15.instance     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.backup.BackupProtos$Favorite r15 = (com.android.launcher3.backup.BackupProtos$Favorite) r15     // Catch:{ IOException -> 0x04b7 }
            int r6 = r15.container_     // Catch:{ IOException -> 0x04b7 }
            if (r6 != r7) goto L_0x047a
            float r15 = (float) r4     // Catch:{ IOException -> 0x04b7 }
            float r6 = r2.hotseatCount_     // Catch:{ IOException -> 0x04b7 }
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x0470
            int r15 = r2.allappsRank_     // Catch:{ IOException -> 0x04b7 }
            if (r4 == r15) goto L_0x0470
            goto L_0x048c
        L_0x0470:
            r14.restoreSuccessful = r5     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.LauncherBackupHelper$InvalidBackupException r15 = new com.android.launcher3.LauncherBackupHelper$InvalidBackupException     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r0 = "Item not in hotseat bounds, aborting restore"
            r15.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x04b7 }
            throw r15     // Catch:{ IOException -> 0x04b7 }
        L_0x047a:
            int r4 = r15.cellX_     // Catch:{ IOException -> 0x04b7 }
            float r4 = (float) r4     // Catch:{ IOException -> 0x04b7 }
            float r6 = r2.desktopCols_     // Catch:{ IOException -> 0x04b7 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0492
            int r15 = r15.cellY_     // Catch:{ IOException -> 0x04b7 }
            float r15 = (float) r15     // Catch:{ IOException -> 0x04b7 }
            float r2 = r2.desktopRows_     // Catch:{ IOException -> 0x04b7 }
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 >= 0) goto L_0x0492
        L_0x048c:
            android.net.Uri r15 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ IOException -> 0x04b7 }
            r0.insert(r15, r3)     // Catch:{ IOException -> 0x04b7 }
            return
        L_0x0492:
            r14.restoreSuccessful = r5     // Catch:{ IOException -> 0x04b7 }
            com.android.launcher3.LauncherBackupHelper$InvalidBackupException r15 = new com.android.launcher3.LauncherBackupHelper$InvalidBackupException     // Catch:{ IOException -> 0x04b7 }
            java.lang.String r0 = "Item not in desktop bounds, aborting restore"
            r15.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x04b7 }
            throw r15     // Catch:{ IOException -> 0x04b7 }
        L_0x049c:
            com.android.launcher3.LauncherBackupHelper$InvalidBackupException r0 = new com.android.launcher3.LauncherBackupHelper$InvalidBackupException     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            r3.<init>(r2)     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            r3.append(r15)     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            java.lang.String r15 = r3.toString()     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            r0.<init>((java.lang.String) r15)     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
            throw r0     // Catch:{ ct -> 0x04b0, IllegalArgumentException -> 0x04ae }
        L_0x04ae:
            r15 = move-exception
            goto L_0x04b1
        L_0x04b0:
            r15 = move-exception
        L_0x04b1:
            com.android.launcher3.LauncherBackupHelper$InvalidBackupException r0 = new com.android.launcher3.LauncherBackupHelper$InvalidBackupException     // Catch:{ IOException -> 0x04b7 }
            r0.<init>((java.lang.Throwable) r15)     // Catch:{ IOException -> 0x04b7 }
            throw r0     // Catch:{ IOException -> 0x04b7 }
        L_0x04b7:
            r15 = move-exception
            java.lang.String r0 = "ignoring unparsable backup entry"
            android.util.Log.w(r1, r0, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherBackupHelper.restoreEntity(android.app.backup.BackupDataInputStream):void");
    }

    public final void writeNewStateDescription(ParcelFileDescriptor parcelFileDescriptor) {
        writeJournal$ar$ds(parcelFileDescriptor, getCurrentStateJournal());
    }
}
