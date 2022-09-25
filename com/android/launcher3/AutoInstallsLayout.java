package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Patterns;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.chromium.net.NetError;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
public class AutoInstallsLayout {
    private static final String HOTSEAT_CONTAINER_NAME = LauncherSettings$Favorites.containerToString(NetError.ERR_CONNECTION_RESET);
    final AppWidgetHost mAppWidgetHost;
    protected final LayoutParserCallback mCallback;
    private final int mColumnCount;
    final Context mContext;
    protected SQLiteDatabase mDb;
    private final int mHotseatAllAppsRank;
    protected final int mLayoutId;
    protected final PackageManager mPackageManager;
    protected final String mRootTag;
    private final int mRowCount;
    protected final Resources mSourceRes;
    private final long[] mTemp = new long[2];
    final ContentValues mValues;

    /* compiled from: PG */
    public class AppShortcutParser implements TagParser {
        protected AppShortcutParser() {
        }

        /* access modifiers changed from: protected */
        public long invalidPackageOrClass(XmlResourceParser xmlResourceParser) {
            Log.w("AutoInstalls", "Skipping invalid <favorite> with no component");
            return -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x006f, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
            android.util.Log.e("AutoInstalls", "Unable to add favorite: " + r0 + "/" + r1, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x008d, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r3 = new android.content.ComponentName(r8.this$0.mPackageManager.currentToCanonicalPackageNames(new java.lang.String[]{r0})[0], r1);
            r7 = r3;
            r3 = r8.this$0.mPackageManager.getActivityInfo(r3, 0);
            r2 = r7;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long parseAndAdd(android.content.res.XmlResourceParser r9) {
            /*
                r8 = this;
                java.lang.String r0 = "packageName"
                java.lang.String r0 = com.android.launcher3.AutoInstallsLayout.getAttributeValue(r9, r0)
                java.lang.String r1 = "className"
                java.lang.String r1 = com.android.launcher3.AutoInstallsLayout.getAttributeValue(r9, r1)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x008e
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L_0x008e
                r9 = 0
                android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0027 }
                r2.<init>(r0, r1)     // Catch:{ NameNotFoundException -> 0x0027 }
                com.android.launcher3.AutoInstallsLayout r3 = com.android.launcher3.AutoInstallsLayout.this     // Catch:{ NameNotFoundException -> 0x0027 }
                android.content.pm.PackageManager r3 = r3.mPackageManager     // Catch:{ NameNotFoundException -> 0x0027 }
                android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0027 }
                goto L_0x0046
            L_0x0027:
                com.android.launcher3.AutoInstallsLayout r2 = com.android.launcher3.AutoInstallsLayout.this     // Catch:{ NameNotFoundException -> 0x006f }
                android.content.pm.PackageManager r2 = r2.mPackageManager     // Catch:{ NameNotFoundException -> 0x006f }
                r3 = 1
                java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ NameNotFoundException -> 0x006f }
                r3[r9] = r0     // Catch:{ NameNotFoundException -> 0x006f }
                java.lang.String[] r2 = r2.currentToCanonicalPackageNames(r3)     // Catch:{ NameNotFoundException -> 0x006f }
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x006f }
                r2 = r2[r9]     // Catch:{ NameNotFoundException -> 0x006f }
                r3.<init>(r2, r1)     // Catch:{ NameNotFoundException -> 0x006f }
                com.android.launcher3.AutoInstallsLayout r2 = com.android.launcher3.AutoInstallsLayout.this     // Catch:{ NameNotFoundException -> 0x006f }
                android.content.pm.PackageManager r2 = r2.mPackageManager     // Catch:{ NameNotFoundException -> 0x006f }
                android.content.pm.ActivityInfo r2 = r2.getActivityInfo(r3, r9)     // Catch:{ NameNotFoundException -> 0x006f }
                r7 = r3
                r3 = r2
                r2 = r7
            L_0x0046:
                android.content.Intent r4 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x006f }
                java.lang.String r5 = "android.intent.action.MAIN"
                r6 = 0
                r4.<init>(r5, r6)     // Catch:{ NameNotFoundException -> 0x006f }
                java.lang.String r5 = "android.intent.category.LAUNCHER"
                android.content.Intent r4 = r4.addCategory(r5)     // Catch:{ NameNotFoundException -> 0x006f }
                android.content.Intent r2 = r4.setComponent(r2)     // Catch:{ NameNotFoundException -> 0x006f }
                r4 = 270532608(0x10200000, float:3.1554436E-29)
                android.content.Intent r2 = r2.setFlags(r4)     // Catch:{ NameNotFoundException -> 0x006f }
                com.android.launcher3.AutoInstallsLayout r4 = com.android.launcher3.AutoInstallsLayout.this     // Catch:{ NameNotFoundException -> 0x006f }
                android.content.pm.PackageManager r5 = r4.mPackageManager     // Catch:{ NameNotFoundException -> 0x006f }
                java.lang.CharSequence r3 = r3.loadLabel(r5)     // Catch:{ NameNotFoundException -> 0x006f }
                java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x006f }
                long r0 = r4.addShortcut(r3, r2, r9)     // Catch:{ NameNotFoundException -> 0x006f }
                return r0
            L_0x006f:
                r9 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to add favorite: "
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r0 = "/"
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = "AutoInstalls"
                java.lang.String r1 = r2.toString()
                android.util.Log.e(r0, r1, r9)
                r0 = -1
                return r0
            L_0x008e:
                long r0 = r8.invalidPackageOrClass(r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.AutoInstallsLayout.AppShortcutParser.parseAndAdd(android.content.res.XmlResourceParser):long");
        }
    }

    /* compiled from: PG */
    public final class AppWidgetParser implements TagParser {
        protected AppWidgetParser() {
        }

        public final long parseAndAdd(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "packageName");
            String attributeValue2 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "className");
            long j = -1;
            if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(attributeValue2)) {
                ComponentName componentName = new ComponentName(attributeValue, attributeValue2);
                try {
                    AutoInstallsLayout.this.mPackageManager.getReceiverInfo(componentName, 0);
                } catch (Exception unused) {
                    componentName = new ComponentName(AutoInstallsLayout.this.mPackageManager.currentToCanonicalPackageNames(new String[]{attributeValue})[0], attributeValue2);
                    try {
                        AutoInstallsLayout.this.mPackageManager.getReceiverInfo(componentName, 0);
                    } catch (Exception unused2) {
                    }
                }
                AutoInstallsLayout.this.mValues.put("spanX", AutoInstallsLayout.getAttributeValue(xmlResourceParser, "spanX"));
                AutoInstallsLayout.this.mValues.put("spanY", AutoInstallsLayout.getAttributeValue(xmlResourceParser, "spanY"));
                Bundle bundle = new Bundle();
                int depth = xmlResourceParser.getDepth();
                while (true) {
                    int next = xmlResourceParser.next();
                    if (next == 3) {
                        if (xmlResourceParser.getDepth() <= depth) {
                            AppWidgetManager instance = AppWidgetManager.getInstance(AutoInstallsLayout.this.mContext);
                            try {
                                int allocateAppWidgetId = AutoInstallsLayout.this.mAppWidgetHost.allocateAppWidgetId();
                                if (!instance.bindAppWidgetIdIfAllowed(allocateAppWidgetId, componentName)) {
                                    return -1;
                                }
                                AutoInstallsLayout.this.mValues.put("itemType", 4);
                                AutoInstallsLayout.this.mValues.put("appWidgetId", Integer.valueOf(allocateAppWidgetId));
                                AutoInstallsLayout.this.mValues.put("appWidgetProvider", componentName.flattenToString());
                                AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
                                autoInstallsLayout.mValues.put("_id", Long.valueOf(autoInstallsLayout.mCallback.generateNewItemId()));
                                AutoInstallsLayout autoInstallsLayout2 = AutoInstallsLayout.this;
                                j = autoInstallsLayout2.mCallback.insertAndCheck(autoInstallsLayout2.mDb, autoInstallsLayout2.mValues);
                                if (j < 0) {
                                    AutoInstallsLayout.this.mAppWidgetHost.deleteAppWidgetId(allocateAppWidgetId);
                                    return j;
                                }
                                if (!bundle.isEmpty()) {
                                    Intent intent = new Intent("com.android.launcher.action.APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE");
                                    intent.setComponent(componentName);
                                    intent.putExtras(bundle);
                                    intent.putExtra("appWidgetId", allocateAppWidgetId);
                                    AutoInstallsLayout.this.mContext.sendBroadcast(intent);
                                }
                                return j;
                            } catch (RuntimeException unused3) {
                            }
                        }
                    } else if (next != 2) {
                        continue;
                    } else if ("extra".equals(xmlResourceParser.getName())) {
                        String attributeValue3 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "key");
                        String attributeValue4 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "value");
                        if (attributeValue3 != null && attributeValue4 != null) {
                            bundle.putString(attributeValue3, attributeValue4);
                        }
                    } else {
                        throw new RuntimeException("Widgets can contain only extras");
                    }
                }
                throw new RuntimeException("Widget extras must have a key and value");
            }
            return -1;
        }
    }

    /* compiled from: PG */
    public final class AutoInstallParser implements TagParser {
        protected AutoInstallParser() {
        }

        public final long parseAndAdd(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "packageName");
            String attributeValue2 = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "className");
            if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(attributeValue2)) {
                return -1;
            }
            AutoInstallsLayout.this.mValues.put("restored", 2);
            Intent flags = new Intent("android.intent.action.MAIN", (Uri) null).addCategory("android.intent.category.LAUNCHER").setComponent(new ComponentName(attributeValue, attributeValue2)).setFlags(270532608);
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            return autoInstallsLayout.addShortcut(autoInstallsLayout.mContext.getString(R.string.package_state_unknown), flags, 0);
        }
    }

    /* compiled from: PG */
    public class FolderParser implements TagParser {
        private final HashMap mFolderElements;

        public FolderParser(HashMap hashMap) {
            this.mFolderElements = hashMap;
        }

        public long parseAndAdd(XmlResourceParser xmlResourceParser) {
            String str;
            String str2;
            String str3;
            XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            int attributeResourceValue$ar$ds = AutoInstallsLayout.getAttributeResourceValue$ar$ds(xmlResourceParser2, "title");
            if (attributeResourceValue$ar$ds != 0) {
                str = AutoInstallsLayout.this.mSourceRes.getString(attributeResourceValue$ar$ds);
            } else {
                str = AutoInstallsLayout.this.mContext.getResources().getString(R.string.folder_name);
            }
            AutoInstallsLayout.this.mValues.put("title", str);
            AutoInstallsLayout.this.mValues.put("itemType", 2);
            AutoInstallsLayout.this.mValues.put("spanX", 1);
            AutoInstallsLayout.this.mValues.put("spanY", 1);
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            autoInstallsLayout.mValues.put("_id", Long.valueOf(autoInstallsLayout.mCallback.generateNewItemId()));
            AutoInstallsLayout autoInstallsLayout2 = AutoInstallsLayout.this;
            long insertAndCheck = autoInstallsLayout2.mCallback.insertAndCheck(autoInstallsLayout2.mDb, autoInstallsLayout2.mValues);
            if (insertAndCheck < 0) {
                return -1;
            }
            ContentValues contentValues = new ContentValues(AutoInstallsLayout.this.mValues);
            ArrayList arrayList = new ArrayList();
            int depth = xmlResourceParser.getDepth();
            int i = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == 3) {
                    if (xmlResourceParser.getDepth() <= depth) {
                        if (arrayList.size() >= 2) {
                            return insertAndCheck;
                        }
                        Uri contentUri = LauncherSettings$Favorites.getContentUri(insertAndCheck);
                        if (contentUri.getPathSegments().size() == 1) {
                            str3 = contentUri.getPathSegments().get(0);
                            str2 = null;
                        } else if (contentUri.getPathSegments().size() != 2) {
                            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(String.valueOf(contentUri))));
                        } else if (TextUtils.isEmpty((CharSequence) null)) {
                            long parseId = ContentUris.parseId(contentUri);
                            str2 = "_id=" + parseId;
                            str3 = contentUri.getPathSegments().get(0);
                        } else {
                            throw new UnsupportedOperationException("WHERE clause not supported: ".concat(String.valueOf(String.valueOf(contentUri))));
                        }
                        AutoInstallsLayout.this.mDb.delete(str3, str2, (String[]) null);
                        if (arrayList.size() != 1) {
                            return -1;
                        }
                        ContentValues contentValues2 = new ContentValues();
                        AutoInstallsLayout.copyInteger(contentValues, contentValues2, "container");
                        AutoInstallsLayout.copyInteger(contentValues, contentValues2, "screen");
                        AutoInstallsLayout.copyInteger(contentValues, contentValues2, "cellX");
                        AutoInstallsLayout.copyInteger(contentValues, contentValues2, "cellY");
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        AutoInstallsLayout.this.mDb.update("favorites", contentValues2, "_id=" + longValue, (String[]) null);
                        return longValue;
                    }
                } else if (next == 2) {
                    AutoInstallsLayout.this.mValues.clear();
                    AutoInstallsLayout.this.mValues.put("container", Long.valueOf(insertAndCheck));
                    AutoInstallsLayout.this.mValues.put("rank", Integer.valueOf(i));
                    TagParser tagParser = (TagParser) this.mFolderElements.get(xmlResourceParser.getName());
                    if (tagParser != null) {
                        long parseAndAdd = tagParser.parseAndAdd(xmlResourceParser2);
                        if (parseAndAdd >= 0) {
                            arrayList.add(Long.valueOf(parseAndAdd));
                            i++;
                        }
                    } else {
                        throw new RuntimeException("Invalid folder item ".concat(String.valueOf(xmlResourceParser.getName())));
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* compiled from: PG */
    public interface LayoutParserCallback {
        long generateNewItemId();

        long insertAndCheck(SQLiteDatabase sQLiteDatabase, ContentValues contentValues);
    }

    /* compiled from: PG */
    public class ShortcutParser implements TagParser {
        private final Resources mIconRes;

        public ShortcutParser(Resources resources) {
            this.mIconRes = resources;
        }

        public final long parseAndAdd(XmlResourceParser xmlResourceParser) {
            Intent parseIntent;
            Drawable drawable;
            int attributeResourceValue$ar$ds = AutoInstallsLayout.getAttributeResourceValue$ar$ds(xmlResourceParser, "title");
            int attributeResourceValue$ar$ds2 = AutoInstallsLayout.getAttributeResourceValue$ar$ds(xmlResourceParser, "icon");
            if (attributeResourceValue$ar$ds == 0 || attributeResourceValue$ar$ds2 == 0 || (parseIntent = parseIntent(xmlResourceParser)) == null || (drawable = this.mIconRes.getDrawable(attributeResourceValue$ar$ds2)) == null) {
                return -1;
            }
            AutoInstallsLayout autoInstallsLayout = AutoInstallsLayout.this;
            ItemInfo.writeBitmap(autoInstallsLayout.mValues, Utilities.createIconBitmap(drawable, autoInstallsLayout.mContext, 1.0f));
            AutoInstallsLayout.this.mValues.put("iconType", 0);
            AutoInstallsLayout.this.mValues.put("iconPackage", this.mIconRes.getResourcePackageName(attributeResourceValue$ar$ds2));
            AutoInstallsLayout.this.mValues.put("iconResource", this.mIconRes.getResourceName(attributeResourceValue$ar$ds2));
            parseIntent.setFlags(270532608);
            AutoInstallsLayout autoInstallsLayout2 = AutoInstallsLayout.this;
            return autoInstallsLayout2.addShortcut(autoInstallsLayout2.mSourceRes.getString(attributeResourceValue$ar$ds), parseIntent, 1);
        }

        /* access modifiers changed from: protected */
        public Intent parseIntent(XmlResourceParser xmlResourceParser) {
            String attributeValue = AutoInstallsLayout.getAttributeValue(xmlResourceParser, "url");
            if (TextUtils.isEmpty(attributeValue) || !Patterns.WEB_URL.matcher(attributeValue).matches()) {
                return null;
            }
            return new Intent("android.intent.action.VIEW", (Uri) null).setData(Uri.parse(attributeValue));
        }
    }

    /* compiled from: PG */
    public interface TagParser {
        long parseAndAdd(XmlResourceParser xmlResourceParser);
    }

    public AutoInstallsLayout(Context context, AppWidgetHost appWidgetHost, LayoutParserCallback layoutParserCallback, Resources resources, int i, String str) {
        this.mContext = context;
        this.mAppWidgetHost = appWidgetHost;
        this.mCallback = layoutParserCallback;
        this.mPackageManager = context.getPackageManager();
        this.mValues = new ContentValues();
        this.mRootTag = str;
        this.mSourceRes = resources;
        this.mLayoutId = i;
        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
        this.mHotseatAllAppsRank = invariantDeviceProfile.hotseatAllAppsRank;
        this.mRowCount = invariantDeviceProfile.numRows;
        this.mColumnCount = invariantDeviceProfile.numColumns;
    }

    protected static final void beginDocument(XmlPullParser xmlPullParser, String str) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    String name = xmlPullParser.getName();
                    throw new XmlPullParserException("Unexpected start tag: found " + name + ", expected " + str);
                }
                return;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = java.lang.Integer.parseInt(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String convertToDistanceFromEnd(java.lang.String r1, int r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0011
            int r0 = java.lang.Integer.parseInt(r1)
            if (r0 >= 0) goto L_0x0011
            int r2 = r2 + r0
            java.lang.String r1 = java.lang.Integer.toString(r2)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.AutoInstallsLayout.convertToDistanceFromEnd(java.lang.String, int):java.lang.String");
    }

    static void copyInteger(ContentValues contentValues, ContentValues contentValues2, String str) {
        contentValues2.put(str, contentValues.getAsInteger(str));
    }

    static AutoInstallsLayout get(Context context, AppWidgetHost appWidgetHost, LayoutParserCallback layoutParserCallback) {
        Pair findSystemApk = Utilities.findSystemApk("android.autoinstalls.config.action.PLAY_AUTO_INSTALL", context.getPackageManager());
        if (findSystemApk == null) {
            return null;
        }
        return get(context, (String) findSystemApk.first, (Resources) findSystemApk.second, appWidgetHost, layoutParserCallback);
    }

    protected static int getAttributeResourceValue$ar$ds(XmlResourceParser xmlResourceParser, String str) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto/com.android.launcher3", str, 0);
        return attributeResourceValue == 0 ? xmlResourceParser.getAttributeResourceValue((String) null, str, 0) : attributeResourceValue;
    }

    protected static String getAttributeValue(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto/com.android.launcher3", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue((String) null, str) : attributeValue;
    }

    /* access modifiers changed from: protected */
    public long addShortcut(String str, Intent intent, int i) {
        long generateNewItemId = this.mCallback.generateNewItemId();
        this.mValues.put("intent", intent.toUri(0));
        this.mValues.put("title", str);
        this.mValues.put("itemType", Integer.valueOf(i));
        this.mValues.put("spanX", 1);
        this.mValues.put("spanY", 1);
        this.mValues.put("_id", Long.valueOf(generateNewItemId));
        if (this.mCallback.insertAndCheck(this.mDb, this.mValues) < 0) {
            return -1;
        }
        return generateNewItemId;
    }

    /* access modifiers changed from: protected */
    public HashMap getFolderElementsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("appicon", new AppShortcutParser());
        hashMap.put("autoinstall", new AutoInstallParser());
        hashMap.put("shortcut", new ShortcutParser(this.mSourceRes));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public HashMap getLayoutElementsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("appicon", new AppShortcutParser());
        hashMap.put("autoinstall", new AutoInstallParser());
        hashMap.put("folder", new FolderParser(getFolderElementsMap()));
        hashMap.put("appwidget", new AppWidgetParser());
        hashMap.put("shortcut", new ShortcutParser(this.mSourceRes));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void parseContainerAndScreen(XmlResourceParser xmlResourceParser, long[] jArr) {
        if (HOTSEAT_CONTAINER_NAME.equals(getAttributeValue(xmlResourceParser, "container"))) {
            jArr[0] = -101;
            long parseLong = Long.parseLong(getAttributeValue(xmlResourceParser, "rank"));
            if (parseLong >= ((long) this.mHotseatAllAppsRank)) {
                parseLong++;
            }
            jArr[1] = parseLong;
            return;
        }
        jArr[0] = -100;
        jArr[1] = Long.parseLong(getAttributeValue(xmlResourceParser, "screen"));
    }

    /* access modifiers changed from: protected */
    public final int parseLayout(int i, ArrayList arrayList) {
        XmlResourceParser xml = this.mSourceRes.getXml(i);
        beginDocument(xml, this.mRootTag);
        int depth = xml.getDepth();
        HashMap layoutElementsMap = getLayoutElementsMap();
        int i2 = 0;
        while (true) {
            int next = xml.next();
            if (next == 3) {
                if (xml.getDepth() <= depth) {
                    break;
                }
                next = 3;
            }
            int i3 = 1;
            if (next == 1) {
                break;
            } else if (next == 2) {
                if ("include".equals(xml.getName())) {
                    int attributeResourceValue$ar$ds = getAttributeResourceValue$ar$ds(xml, "workspace");
                    if (attributeResourceValue$ar$ds != 0) {
                        i3 = parseLayout(attributeResourceValue$ar$ds, arrayList);
                        i2 += i3;
                    }
                } else {
                    this.mValues.clear();
                    parseContainerAndScreen(xml, this.mTemp);
                    long[] jArr = this.mTemp;
                    long j = jArr[0];
                    long j2 = jArr[1];
                    this.mValues.put("container", Long.valueOf(j));
                    ContentValues contentValues = this.mValues;
                    Long valueOf = Long.valueOf(j2);
                    contentValues.put("screen", valueOf);
                    this.mValues.put("cellX", convertToDistanceFromEnd(getAttributeValue(xml, "x"), this.mColumnCount));
                    this.mValues.put("cellY", convertToDistanceFromEnd(getAttributeValue(xml, "y"), this.mRowCount));
                    TagParser tagParser = (TagParser) layoutElementsMap.get(xml.getName());
                    if (tagParser != null && tagParser.parseAndAdd(xml) >= 0) {
                        if (!arrayList.contains(valueOf) && j == -100) {
                            arrayList.add(valueOf);
                        }
                        i2 += i3;
                    }
                }
                i3 = 0;
                i2 += i3;
            }
        }
        return i2;
    }

    static AutoInstallsLayout get(Context context, String str, Resources resources, AppWidgetHost appWidgetHost, LayoutParserCallback layoutParserCallback) {
        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
        String format = String.format(Locale.ENGLISH, "default_layout_%dx%d_h%s", new Object[]{Integer.valueOf(invariantDeviceProfile.numColumns), Integer.valueOf(invariantDeviceProfile.numRows), Integer.valueOf(invariantDeviceProfile.numHotseatIcons)});
        int identifier = resources.getIdentifier(format, "xml", str);
        if (identifier == 0) {
            Log.d("AutoInstalls", "Formatted layout: " + format + " not found. Trying layout without hosteat");
            format = String.format(Locale.ENGLISH, "default_layout_%dx%d", new Object[]{Integer.valueOf(invariantDeviceProfile.numColumns), Integer.valueOf(invariantDeviceProfile.numRows)});
            identifier = resources.getIdentifier(format, "xml", str);
        }
        if (identifier == 0) {
            Log.d("AutoInstalls", "Formatted layout: " + format + " not found. Trying the default layout");
            identifier = resources.getIdentifier("default_layout", "xml", str);
        }
        if (identifier != 0) {
            return new AutoInstallsLayout(context, appWidgetHost, layoutParserCallback, resources, identifier, "workspace");
        }
        Log.e("AutoInstalls", "Layout definition not found in package: ".concat(String.valueOf(str)));
        return null;
    }
}
