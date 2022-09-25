package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.android.launcher3.AutoInstallsLayout;
import com.android.launcher3.PackageSessionCommitReceiver;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.util.ManagedProfileHeuristic;
import com.evernote.android.state.BuildConfig;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.NetError;

/* compiled from: PG */
public class LauncherProvider extends ContentProvider {
    LauncherProviderChangeListener mListener;
    public DatabaseHelper mOpenHelper;

    static void addModifiedTime(ContentValues contentValues) {
        contentValues.put("modified", Long.valueOf(System.currentTimeMillis()));
    }

    private final DefaultLayoutParser getDefaultLayoutParser() {
        int i = LauncherAppState.getInstance().mInvariantDeviceProfile.defaultLayoutId;
        Context context = getContext();
        DatabaseHelper databaseHelper = this.mOpenHelper;
        return new DefaultLayoutParser(context, databaseHelper.mAppWidgetHost, databaseHelper, getContext().getResources(), i);
    }

    static long getMaxId(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM ".concat(str), (String[]) null);
        long j = (rawQuery == null || !rawQuery.moveToNext()) ? -1 : rawQuery.getLong(0);
        if (rawQuery != null) {
            rawQuery.close();
        }
        if (j != -1) {
            return j;
        }
        throw new RuntimeException("Error: could not query max id in ".concat(str));
    }

    private static final void reloadLauncherIfExternal$ar$ds() {
        LauncherAppState launcherAppState;
        if (Utilities.ATLEAST_MARSHMALLOW && Binder.getCallingPid() != Process.myPid() && (launcherAppState = LauncherAppState.INSTANCE) != null) {
            launcherAppState.reloadWorkspace();
        }
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentProviderResult[] applyBatch = super.applyBatch(arrayList);
            writableDatabase.setTransactionSuccessful();
            reloadLauncherIfExternal$ar$ds();
            return applyBatch;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        if (uri.getPathSegments().size() == 1) {
            String str = uri.getPathSegments().get(0);
            SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int length = contentValuesArr.length;
                for (int i = 0; i < length; i++) {
                    addModifiedTime(contentValuesArr[i]);
                    if (dbInsertAndCheck$ar$ds(this.mOpenHelper, writableDatabase, str, contentValuesArr[i]) < 0) {
                        return 0;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                notifyListeners();
                reloadLauncherIfExternal$ar$ds();
                return contentValuesArr.length;
            } finally {
                writableDatabase.endTransaction();
            }
        } else {
            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            r2 = 0
            if (r0 == r1) goto L_0x000c
            return r2
        L_0x000c:
            int r0 = r5.hashCode()
            r1 = -1803226544(0xffffffff9484f250, float:-1.342417E-26)
            r3 = 1
            if (r0 == r1) goto L_0x0026
            r1 = 948012892(0x3881875c, float:6.176412E-5)
            if (r0 == r1) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.String r0 = "set_boolean_setting"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0030
            r5 = 1
            goto L_0x0031
        L_0x0026:
            java.lang.String r0 = "get_boolean_setting"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0030
            r5 = 0
            goto L_0x0031
        L_0x0030:
            r5 = -1
        L_0x0031:
            java.lang.String r0 = "value"
            if (r5 == 0) goto L_0x006e
            if (r5 == r3) goto L_0x0038
            return r2
        L_0x0038:
            boolean r5 = r7.getBoolean(r0)
            android.content.Context r1 = r4.getContext()
            android.content.SharedPreferences r1 = com.android.launcher3.Utilities.getPrefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r6, r5)
            r1.apply()
            com.android.launcher3.LauncherProviderChangeListener r1 = r4.mListener
            if (r1 == 0) goto L_0x0056
            r1.onSettingsChanged(r6, r5)
        L_0x0056:
            java.lang.String r6 = "notify_backup"
            boolean r6 = r7.getBoolean(r6)
            if (r6 == 0) goto L_0x0065
            android.content.Context r6 = r4.getContext()
            com.android.launcher3.LauncherBackupAgentHelper.dataChanged(r6)
        L_0x0065:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putBoolean(r0, r5)
            return r6
        L_0x006e:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r1 = "pref_allowRotation"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0087
            android.content.Context r6 = r4.getContext()
            boolean r6 = com.android.launcher3.Utilities.isAllowRotationPrefEnabled(r6)
            r5.putBoolean(r0, r6)
            goto L_0x009c
        L_0x0087:
            android.content.Context r1 = r4.getContext()
            android.content.SharedPreferences r1 = com.android.launcher3.Utilities.getPrefs(r1)
            java.lang.String r2 = "default_value"
            boolean r7 = r7.getBoolean(r2)
            boolean r6 = r1.getBoolean(r6, r7)
            r5.putBoolean(r0, r6)
        L_0x009c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final void clearFlagEmptyDbCreated() {
        Utilities.getPrefs(getContext()).edit().remove("EMPTY_DATABASE_CREATED").commit();
    }

    public final synchronized void createEmptyDB() {
        DatabaseHelper databaseHelper = this.mOpenHelper;
        databaseHelper.createEmptyDB(databaseHelper.getWritableDatabase());
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        String str2;
        if (uri.getPathSegments().size() == 1) {
            str2 = uri.getPathSegments().get(0);
        } else if (uri.getPathSegments().size() != 2) {
            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(String.valueOf(uri))));
        } else if (TextUtils.isEmpty(str)) {
            long parseId = ContentUris.parseId(uri);
            strArr = null;
            str = "_id=" + parseId;
            str2 = uri.getPathSegments().get(0);
        } else {
            throw new UnsupportedOperationException("WHERE clause not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }
        int delete = this.mOpenHelper.getWritableDatabase().delete(str2, str, strArr);
        if (delete > 0) {
            notifyListeners();
        }
        reloadLauncherIfExternal$ar$ds();
        return delete;
    }

    public final List deleteEmptyFolders() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Cursor query = writableDatabase.query("favorites", new String[]{"_id"}, "itemType = 2 AND _id NOT IN (SELECT container FROM favorites)", (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                arrayList.add(Long.valueOf(query.getLong(0)));
            }
            query.close();
            if (arrayList.size() > 0) {
                writableDatabase.delete("favorites", Utilities.createDbSelectionQuery("_id", arrayList), (String[]) null);
            }
            writableDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            Log.e("LauncherProvider", e.getMessage(), e);
            arrayList.clear();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
        return arrayList;
    }

    public final String getType(Uri uri) {
        String str;
        String str2 = null;
        if (uri.getPathSegments().size() == 1) {
            str = uri.getPathSegments().get(0);
        } else if (uri.getPathSegments().size() != 2) {
            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(String.valueOf(uri))));
        } else if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = "_id=" + ContentUris.parseId(uri);
            str = uri.getPathSegments().get(0);
        } else {
            throw new UnsupportedOperationException("WHERE clause not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }
        return (TextUtils.isEmpty(str2) ? "vnd.android.cursor.dir/" : "vnd.android.cursor.item/").concat(String.valueOf(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        if (r9.bindAppWidgetIdIfAllowed(r11, r10) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        if (r11 > 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (dbInsertAndCheck$ar$ds(r3, r3.getWritableDatabase(), "workspaceScreens", r2) < 0) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri insert(android.net.Uri r14, android.content.ContentValues r15) {
        /*
            r13 = this;
            java.util.List r0 = r14.getPathSegments()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0137
            java.util.List r0 = r14.getPathSegments()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r3 = android.os.Binder.getCallingPid()
            int r4 = android.os.Process.myPid()
            r5 = 0
            r7 = 0
            if (r3 == r4) goto L_0x00e5
            com.android.launcher3.LauncherProvider$DatabaseHelper r3 = r13.mOpenHelper
            long r8 = r3.generateNewItemId()
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "_id"
            r15.put(r8, r4)
            java.lang.String r4 = "itemType"
            java.lang.Integer r4 = r15.getAsInteger(r4)
            if (r4 == 0) goto L_0x0078
            int r4 = r4.intValue()
            r9 = 4
            if (r4 != r9) goto L_0x0078
            java.lang.String r4 = "appWidgetId"
            boolean r9 = r15.containsKey(r4)
            if (r9 != 0) goto L_0x0078
            android.content.Context r9 = r3.mContext
            android.appwidget.AppWidgetManager r9 = android.appwidget.AppWidgetManager.getInstance(r9)
            java.lang.String r10 = "appWidgetProvider"
            java.lang.String r10 = r15.getAsString(r10)
            android.content.ComponentName r10 = android.content.ComponentName.unflattenFromString(r10)
            if (r10 == 0) goto L_0x00e4
            android.appwidget.AppWidgetHost r11 = r3.mAppWidgetHost     // Catch:{ RuntimeException -> 0x006f }
            int r11 = r11.allocateAppWidgetId()     // Catch:{ RuntimeException -> 0x006f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x006f }
            r15.put(r4, r12)     // Catch:{ RuntimeException -> 0x006f }
            boolean r4 = r9.bindAppWidgetIdIfAllowed(r11, r10)     // Catch:{ RuntimeException -> 0x006f }
            if (r4 == 0) goto L_0x00e4
            goto L_0x0078
        L_0x006f:
            r14 = move-exception
            java.lang.String r15 = "LauncherProvider"
            java.lang.String r0 = "Failed to initialize external widget"
            android.util.Log.e(r15, r0, r14)
            goto L_0x00e4
        L_0x0078:
            java.lang.String r4 = "screen"
            java.lang.Long r4 = r15.getAsLong(r4)
            long r9 = r4.longValue()
            android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "SELECT * FROM workspaceScreens WHERE _id = "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            android.database.Cursor r4 = r4.rawQuery(r11, r7)
            if (r4 == 0) goto L_0x00a4
            int r11 = r4.getCount()
            r4.close()
            if (r11 <= 0) goto L_0x00a4
            goto L_0x00e5
        L_0x00a4:
            android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()
            java.lang.String r11 = "SELECT MAX(screenRank) FROM workspaceScreens"
            android.database.Cursor r4 = r4.rawQuery(r11, r7)
            r11 = -1
            if (r4 == 0) goto L_0x00bb
            boolean r12 = r4.moveToNext()
            if (r12 == 0) goto L_0x00bb
            int r11 = r4.getInt(r2)
        L_0x00bb:
            if (r4 == 0) goto L_0x00c0
            r4.close()
        L_0x00c0:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r2.put(r8, r4)
            int r11 = r11 + r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.String r4 = "screenRank"
            r2.put(r4, r1)
            android.database.sqlite.SQLiteDatabase r1 = r3.getWritableDatabase()
            java.lang.String r4 = "workspaceScreens"
            long r1 = dbInsertAndCheck$ar$ds(r3, r1, r4, r2)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00e5
        L_0x00e4:
            return r7
        L_0x00e5:
            com.android.launcher3.LauncherProvider$DatabaseHelper r1 = r13.mOpenHelper
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
            addModifiedTime(r15)
            com.android.launcher3.LauncherProvider$DatabaseHelper r2 = r13.mOpenHelper
            long r0 = dbInsertAndCheck$ar$ds(r2, r1, r0, r15)
            int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x00f9
            return r7
        L_0x00f9:
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r14, r0)
            r13.notifyListeners()
            boolean r15 = com.android.launcher3.Utilities.ATLEAST_MARSHMALLOW
            if (r15 == 0) goto L_0x0108
            reloadLauncherIfExternal$ar$ds()
            goto L_0x0136
        L_0x0108:
            com.android.launcher3.LauncherAppState r15 = com.android.launcher3.LauncherAppState.INSTANCE
            java.lang.String r0 = "true"
            if (r15 == 0) goto L_0x011d
            java.lang.String r1 = "isExternalAdd"
            java.lang.String r1 = r14.getQueryParameter(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x011d
            r15.reloadWorkspace()
        L_0x011d:
            java.lang.String r15 = "notify"
            java.lang.String r15 = r14.getQueryParameter(r15)
            if (r15 == 0) goto L_0x012b
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x0136
        L_0x012b:
            android.content.Context r15 = r13.getContext()
            android.content.ContentResolver r15 = r15.getContentResolver()
            r15.notifyChange(r14, r7)
        L_0x0136:
            return r14
        L_0x0137:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "Invalid URI: "
            java.lang.String r14 = r0.concat(r14)
            r15.<init>(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [com.android.launcher3.AutoInstallsLayout] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.android.launcher3.AutoInstallsLayout] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void loadDefaultFavoritesIfNecessary() {
        /*
            r9 = this;
            monitor-enter(r9)
            android.content.Context r0 = r9.getContext()     // Catch:{ all -> 0x00cf }
            android.content.SharedPreferences r0 = com.android.launcher3.Utilities.getPrefs(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "EMPTY_DATABASE_CREATED"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "LauncherProvider"
            java.lang.String r1 = "loading default workspace"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00cf }
            boolean r0 = com.android.launcher3.Utilities.ATLEAST_JB_MR2     // Catch:{ all -> 0x00cf }
            r1 = 0
            if (r0 != 0) goto L_0x001f
            goto L_0x0057
        L_0x001f:
            android.content.Context r0 = r9.getContext()     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "user"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00cf }
            android.os.UserManager r2 = (android.os.UserManager) r2     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ all -> 0x00cf }
            android.os.Bundle r2 = r2.getApplicationRestrictions(r3)     // Catch:{ all -> 0x00cf }
            if (r2 != 0) goto L_0x0036
            goto L_0x0057
        L_0x0036:
            java.lang.String r3 = "workspace.configuration.package.name"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x0057
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004f }
            android.content.res.Resources r3 = r3.getResourcesForApplication(r2)     // Catch:{ NameNotFoundException -> 0x004f }
            com.android.launcher3.LauncherProvider$DatabaseHelper r4 = r9.mOpenHelper     // Catch:{ NameNotFoundException -> 0x004f }
            android.appwidget.AppWidgetHost r5 = r4.mAppWidgetHost     // Catch:{ NameNotFoundException -> 0x004f }
            com.android.launcher3.AutoInstallsLayout r1 = com.android.launcher3.AutoInstallsLayout.get(r0, r2, r3, r5, r4)     // Catch:{ NameNotFoundException -> 0x004f }
            goto L_0x0057
        L_0x004f:
            r0 = move-exception
            java.lang.String r2 = "LauncherProvider"
            java.lang.String r3 = "Target package for restricted profile not found"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00cf }
        L_0x0057:
            if (r1 != 0) goto L_0x0065
            android.content.Context r0 = r9.getContext()     // Catch:{ all -> 0x00cf }
            com.android.launcher3.LauncherProvider$DatabaseHelper r1 = r9.mOpenHelper     // Catch:{ all -> 0x00cf }
            android.appwidget.AppWidgetHost r2 = r1.mAppWidgetHost     // Catch:{ all -> 0x00cf }
            com.android.launcher3.AutoInstallsLayout r1 = com.android.launcher3.AutoInstallsLayout.get(r0, r2, r1)     // Catch:{ all -> 0x00cf }
        L_0x0065:
            if (r1 != 0) goto L_0x009f
            android.content.Context r0 = r9.getContext()     // Catch:{ all -> 0x00cf }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00cf }
            com.android.launcher3.Partner r0 = com.android.launcher3.Partner.get(r0)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x009f
            android.content.res.Resources r2 = r0.mResources     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "partner_default_layout"
            java.lang.String r4 = "xml"
            java.lang.String r5 = r0.mPackageName     // Catch:{ all -> 0x00cf }
            int r2 = r2.getIdentifier(r3, r4, r5)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x009f
            android.content.res.Resources r7 = r0.mResources     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "partner_default_layout"
            java.lang.String r3 = "xml"
            java.lang.String r0 = r0.mPackageName     // Catch:{ all -> 0x00cf }
            int r8 = r7.getIdentifier(r2, r3, r0)     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x009f
            com.android.launcher3.DefaultLayoutParser r1 = new com.android.launcher3.DefaultLayoutParser     // Catch:{ all -> 0x00cf }
            android.content.Context r4 = r9.getContext()     // Catch:{ all -> 0x00cf }
            com.android.launcher3.LauncherProvider$DatabaseHelper r6 = r9.mOpenHelper     // Catch:{ all -> 0x00cf }
            android.appwidget.AppWidgetHost r5 = r6.mAppWidgetHost     // Catch:{ all -> 0x00cf }
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00cf }
        L_0x009f:
            if (r1 != 0) goto L_0x00a6
            com.android.launcher3.DefaultLayoutParser r0 = r9.getDefaultLayoutParser()     // Catch:{ all -> 0x00cf }
            goto L_0x00a7
        L_0x00a6:
            r0 = r1
        L_0x00a7:
            r9.createEmptyDB()     // Catch:{ all -> 0x00cf }
            com.android.launcher3.LauncherProvider$DatabaseHelper r2 = r9.mOpenHelper     // Catch:{ all -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r3 = r2.getWritableDatabase()     // Catch:{ all -> 0x00cf }
            int r0 = r2.loadFavorites(r3, r0)     // Catch:{ all -> 0x00cf }
            if (r0 > 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00c8
            r9.createEmptyDB()     // Catch:{ all -> 0x00cf }
            com.android.launcher3.LauncherProvider$DatabaseHelper r0 = r9.mOpenHelper     // Catch:{ all -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r1 = r0.getWritableDatabase()     // Catch:{ all -> 0x00cf }
            com.android.launcher3.DefaultLayoutParser r2 = r9.getDefaultLayoutParser()     // Catch:{ all -> 0x00cf }
            r0.loadFavorites(r1, r2)     // Catch:{ all -> 0x00cf }
        L_0x00c8:
            r9.clearFlagEmptyDbCreated()     // Catch:{ all -> 0x00cf }
            monitor-exit(r9)
            return
        L_0x00cd:
            monitor-exit(r9)
            return
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherProvider.loadDefaultFavoritesIfNecessary():void");
    }

    /* access modifiers changed from: protected */
    public final void notifyListeners() {
        LauncherBackupAgentHelper.dataChanged(getContext());
        LauncherProviderChangeListener launcherProviderChangeListener = this.mListener;
        if (launcherProviderChangeListener != null) {
            launcherProviderChangeListener.onLauncherProviderChange();
        }
    }

    public final boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context.getApplicationContext();
        Context context2 = LauncherAppState.sContext;
        if (context2 != null) {
            String obj = context2.toString();
            String valueOf = String.valueOf(applicationContext);
            Log.w("Launcher", "setApplicationContext called twice! old=" + obj + " new=" + valueOf);
        }
        LauncherAppState.sContext = applicationContext.getApplicationContext();
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        Context context3 = getContext();
        if (Utilities.ATLEAST_O) {
            SharedPreferences prefs = Utilities.getPrefs(context3);
            if (prefs.getAll().isEmpty()) {
                prefs.edit().putBoolean("pref_add_icon_to_home", true).apply();
            } else if (!prefs.contains("pref_add_icon_to_home_initialized")) {
                new PackageSessionCommitReceiver.PrefInitTask(context3).executeOnExecutor(Utilities.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
        this.mOpenHelper = new DatabaseHelper(context);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
        LauncherAppState.sLauncherProvider = new WeakReference(this);
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        if (uri.getPathSegments().size() == 1) {
            str3 = uri.getPathSegments().get(0);
        } else if (uri.getPathSegments().size() != 2) {
            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(String.valueOf(uri))));
        } else if (TextUtils.isEmpty(str)) {
            str3 = uri.getPathSegments().get(0);
            str = "_id=" + ContentUris.parseId(uri);
            strArr2 = null;
        } else {
            throw new UnsupportedOperationException("WHERE clause not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }
        String str4 = str;
        String[] strArr3 = strArr2;
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(str3);
        Cursor query = sQLiteQueryBuilder.query(this.mOpenHelper.getWritableDatabase(), strArr, str4, strArr3, (String) null, (String) null, str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        if (uri.getPathSegments().size() == 1) {
            str2 = uri.getPathSegments().get(0);
        } else if (uri.getPathSegments().size() != 2) {
            throw new IllegalArgumentException("Invalid URI: ".concat(String.valueOf(String.valueOf(uri))));
        } else if (TextUtils.isEmpty(str)) {
            long parseId = ContentUris.parseId(uri);
            strArr = null;
            str = "_id=" + parseId;
            str2 = uri.getPathSegments().get(0);
        } else {
            throw new UnsupportedOperationException("WHERE clause not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }
        addModifiedTime(contentValues);
        int update = this.mOpenHelper.getWritableDatabase().update(str2, contentValues, str, strArr);
        if (update > 0) {
            notifyListeners();
        }
        reloadLauncherIfExternal$ar$ds();
        return update;
    }

    static long dbInsertAndCheck$ar$ds(DatabaseHelper databaseHelper, SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        if (contentValues == null) {
            throw new RuntimeException("Error: attempting to insert null values");
        } else if (contentValues.containsKey("_id")) {
            long longValue = contentValues.getAsLong("_id").longValue();
            if (str == "workspaceScreens") {
                databaseHelper.mMaxScreenId = Math.max(longValue, databaseHelper.mMaxScreenId);
            } else {
                databaseHelper.mMaxItemId = Math.max(longValue, databaseHelper.mMaxItemId);
            }
            return sQLiteDatabase.insert(str, (String) null, contentValues);
        } else {
            throw new RuntimeException("Error: attempting to add item without specifying an id");
        }
    }

    /* compiled from: PG */
    public final class DatabaseHelper extends SQLiteOpenHelper implements AutoInstallsLayout.LayoutParserCallback {
        final AppWidgetHost mAppWidgetHost;
        public final Context mContext;
        LauncherProviderChangeListener mListener;
        public long mMaxItemId = -1;
        public long mMaxScreenId = -1;

        public DatabaseHelper(Context context) {
            super(context, "launcher.db", (SQLiteDatabase.CursorFactory) null, 26);
            this.mContext = context;
            this.mAppWidgetHost = new AppWidgetHost(context, 1024);
            if (!tableExists("favorites") || !tableExists("workspaceScreens")) {
                Log.e("LauncherProvider", "Tables are missing after onCreate has been called. Trying to recreate");
                addFavoritesTable(getWritableDatabase(), true);
                addWorkspacesTable$ar$ds(getWritableDatabase(), true);
            }
            if (this.mMaxItemId == -1) {
                this.mMaxItemId = LauncherProvider.getMaxId(getWritableDatabase(), "favorites");
            }
            if (this.mMaxScreenId == -1) {
                this.mMaxScreenId = LauncherProvider.getMaxId(getWritableDatabase(), "workspaceScreens");
            }
        }

        private final void addFavoritesTable(SQLiteDatabase sQLiteDatabase, boolean z) {
            String str = true != z ? BuildConfig.FLAVOR : " IF NOT EXISTS ";
            long serialNumberForUser = UserManagerCompat.getInstance(this.mContext).getSerialNumberForUser(UserHandleCompat.myUserHandle());
            sQLiteDatabase.execSQL("CREATE TABLE " + str + "favorites (_id INTEGER PRIMARY KEY,title TEXT,intent TEXT,container INTEGER,screen INTEGER,cellX INTEGER,cellY INTEGER,spanX INTEGER,spanY INTEGER,itemType INTEGER,appWidgetId INTEGER NOT NULL DEFAULT -1,isShortcut INTEGER,iconType INTEGER,iconPackage TEXT,iconResource TEXT,icon BLOB,uri TEXT,displayMode INTEGER,appWidgetProvider TEXT,modified INTEGER NOT NULL DEFAULT 0,restored INTEGER NOT NULL DEFAULT 0,profileId INTEGER DEFAULT " + serialNumberForUser + ",rank INTEGER NOT NULL DEFAULT 0,options INTEGER NOT NULL DEFAULT 0);");
        }

        private static final boolean addIntegerColumn$ar$ds(SQLiteDatabase sQLiteDatabase, String str, long j) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("ALTER TABLE favorites ADD COLUMN " + str + " INTEGER NOT NULL DEFAULT " + j + ";");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return true;
            } catch (SQLException e) {
                Log.e("LauncherProvider", e.getMessage(), e);
                sQLiteDatabase.endTransaction();
                return false;
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }

        private static final void addWorkspacesTable$ar$ds(SQLiteDatabase sQLiteDatabase, boolean z) {
            String str = true != z ? BuildConfig.FLAVOR : " IF NOT EXISTS ";
            sQLiteDatabase.execSQL("CREATE TABLE " + str + "workspaceScreens (_id INTEGER PRIMARY KEY,screenRank INTEGER,modified INTEGER NOT NULL DEFAULT 0);");
        }

        private final boolean tableExists(String str) {
            boolean z = true;
            Cursor query = getReadableDatabase().query(true, "sqlite_master", new String[]{"tbl_name"}, "tbl_name = ?", new String[]{str}, (String) null, (String) null, (String) null, (String) null, (CancellationSignal) null);
            try {
                if (query.getCount() <= 0) {
                    z = false;
                }
                return z;
            } finally {
                query.close();
            }
        }

        static final boolean updateFolderItemsRank$ar$ds(SQLiteDatabase sQLiteDatabase, boolean z) {
            sQLiteDatabase.beginTransaction();
            if (z) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE favorites ADD COLUMN rank INTEGER NOT NULL DEFAULT 0;");
                } catch (SQLException e) {
                    Log.e("LauncherProvider", e.getMessage(), e);
                    sQLiteDatabase.endTransaction();
                    return false;
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT container, MAX(cellX) FROM favorites WHERE container IN (SELECT _id FROM favorites WHERE itemType = ?) GROUP BY container;", new String[]{Integer.toString(2)});
            while (rawQuery.moveToNext()) {
                sQLiteDatabase.execSQL("UPDATE favorites SET rank=cellX+(cellY*?) WHERE container=? AND cellX IS NOT NULL AND cellY IS NOT NULL;", new Object[]{Long.valueOf(rawQuery.getLong(1) + 1), Long.valueOf(rawQuery.getLong(0))});
            }
            rawQuery.close();
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.database.Cursor} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void convertShortcutsToLauncherActivities(android.database.sqlite.SQLiteDatabase r18) {
            /*
                r17 = this;
                java.lang.String r0 = "intent"
                java.lang.String r1 = "_id"
                java.lang.String r2 = "LauncherProvider"
                java.lang.String r3 = "itemType=1 AND profileId="
                r18.beginTransaction()
                r4 = 0
                r5 = r17
                android.content.Context r6 = r5.mContext     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                com.android.launcher3.compat.UserManagerCompat r6 = com.android.launcher3.compat.UserManagerCompat.getInstance(r6)     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                com.android.launcher3.compat.UserHandleCompat r7 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                long r6 = r6.getSerialNumberForUser(r7)     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                r8 = 2
                java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                r8 = 0
                r11[r8] = r1     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                r15 = 1
                r11[r15] = r0     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                r9.<init>(r3)     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                r9.append(r6)     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                java.lang.String r10 = "favorites"
                java.lang.String r12 = r9.toString()     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                r13 = 0
                r14 = 0
                r3 = 0
                r16 = 0
                r9 = r18
                r6 = 1
                r15 = r3
                android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLException -> 0x009d, all -> 0x0098 }
                java.lang.String r7 = "UPDATE favorites SET itemType=0 WHERE _id=?"
                r9 = r18
                android.database.sqlite.SQLiteStatement r4 = r9.compileStatement(r7)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
            L_0x0050:
                boolean r0 = r3.moveToNext()     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                if (r0 == 0) goto L_0x0077
                java.lang.String r0 = r3.getString(r7)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                android.content.Intent r0 = android.content.Intent.parseUri(r0, r8)     // Catch:{ URISyntaxException -> 0x006f }
                boolean r0 = com.android.launcher3.Utilities.isLauncherAppTarget(r0)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                if (r0 == 0) goto L_0x0050
                long r10 = r3.getLong(r1)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                r4.bindLong(r6, r10)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                r4.executeUpdateDelete()     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                goto L_0x0050
            L_0x006f:
                r0 = move-exception
                r10 = r0
                java.lang.String r0 = "Unable to parse intent"
                android.util.Log.e(r2, r0, r10)     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                goto L_0x0050
            L_0x0077:
                r18.setTransactionSuccessful()     // Catch:{ SQLException -> 0x008a, all -> 0x0088 }
                r18.endTransaction()
                if (r3 == 0) goto L_0x0082
                r3.close()
            L_0x0082:
                if (r4 == 0) goto L_0x00b3
                r4.close()
                return
            L_0x0088:
                r0 = move-exception
                goto L_0x008f
            L_0x008a:
                r0 = move-exception
                goto L_0x0095
            L_0x008c:
                r0 = move-exception
                r9 = r18
            L_0x008f:
                r1 = r4
                r4 = r3
                goto L_0x00b5
            L_0x0092:
                r0 = move-exception
                r9 = r18
            L_0x0095:
                r1 = r4
                r4 = r3
                goto L_0x00a1
            L_0x0098:
                r0 = move-exception
                r9 = r18
                r1 = r4
                goto L_0x00b5
            L_0x009d:
                r0 = move-exception
                r9 = r18
                r1 = r4
            L_0x00a1:
                java.lang.String r3 = "Error deduping shortcuts"
                android.util.Log.w(r2, r3, r0)     // Catch:{ all -> 0x00b4 }
                r18.endTransaction()
                if (r4 == 0) goto L_0x00ae
                r4.close()
            L_0x00ae:
                if (r1 == 0) goto L_0x00b3
                r1.close()
            L_0x00b3:
                return
            L_0x00b4:
                r0 = move-exception
            L_0x00b5:
                r18.endTransaction()
                if (r4 == 0) goto L_0x00bd
                r4.close()
            L_0x00bd:
                if (r1 == 0) goto L_0x00c2
                r1.close()
            L_0x00c2:
                goto L_0x00c4
            L_0x00c3:
                throw r0
            L_0x00c4:
                goto L_0x00c3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherProvider.DatabaseHelper.convertShortcutsToLauncherActivities(android.database.sqlite.SQLiteDatabase):void");
        }

        public final void createEmptyDB(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favorites");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS workspaceScreens");
            onCreate(sQLiteDatabase);
        }

        public final long generateNewItemId() {
            long j = this.mMaxItemId;
            if (j >= 0) {
                long j2 = j + 1;
                this.mMaxItemId = j2;
                return j2;
            }
            throw new RuntimeException("Error: max item id was not initialized");
        }

        public final long generateNewScreenId() {
            long j = this.mMaxScreenId;
            if (j >= 0) {
                long j2 = j + 1;
                this.mMaxScreenId = j2;
                return j2;
            }
            throw new RuntimeException("Error: max screen id was not initialized");
        }

        public final long insertAndCheck(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            return LauncherProvider.dbInsertAndCheck$ar$ds(this, sQLiteDatabase, "favorites", contentValues);
        }

        /* access modifiers changed from: package-private */
        public final int loadFavorites(SQLiteDatabase sQLiteDatabase, AutoInstallsLayout autoInstallsLayout) {
            int i;
            ArrayList arrayList = new ArrayList();
            autoInstallsLayout.mDb = sQLiteDatabase;
            try {
                i = autoInstallsLayout.parseLayout(autoInstallsLayout.mLayoutId, arrayList);
            } catch (Exception e) {
                Log.w("AutoInstalls", "Got exception parsing layout.", e);
                i = -1;
            }
            Collections.sort(arrayList);
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                contentValues.clear();
                contentValues.put("_id", (Long) arrayList.get(i2));
                contentValues.put("screenRank", Integer.valueOf(i3));
                if (LauncherProvider.dbInsertAndCheck$ar$ds(this, sQLiteDatabase, "workspaceScreens", contentValues) >= 0) {
                    i3++;
                    i2++;
                } else {
                    throw new RuntimeException("Failed initialize screen tablefrom default layout");
                }
            }
            this.mMaxItemId = LauncherProvider.getMaxId(sQLiteDatabase, "favorites");
            this.mMaxScreenId = LauncherProvider.getMaxId(sQLiteDatabase, "workspaceScreens");
            return i;
        }

        /* access modifiers changed from: package-private */
        public final void migrateLauncher2Shortcuts(SQLiteDatabase sQLiteDatabase, Uri uri) {
            Cursor cursor;
            String str;
            String str2;
            String str3;
            SQLiteDatabase sQLiteDatabase2;
            int i;
            int i2;
            SparseArray sparseArray;
            SparseArray sparseArray2;
            int i3;
            int i4;
            int i5;
            UserHandleCompat userHandleCompat;
            long j;
            String str4;
            SparseArray sparseArray3;
            String str5;
            String str6;
            String str7;
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            try {
                cursor = this.mContext.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, "title ASC");
            } catch (Exception unused) {
                cursor = null;
            }
            String str8 = "workspaceScreens";
            String str9 = "favorites";
            String str10 = "LauncherProvider";
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                        String str11 = "_id";
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("intent");
                        String str12 = "intent";
                        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("title");
                        String str13 = "title";
                        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("iconType");
                        String str14 = "iconType";
                        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("icon");
                        String str15 = "icon";
                        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("iconPackage");
                        String str16 = "iconPackage";
                        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("iconResource");
                        String str17 = "iconResource";
                        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("container");
                        String str18 = "container";
                        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("itemType");
                        String str19 = "itemType";
                        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("screen");
                        String str20 = "screen";
                        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("cellX");
                        String str21 = "cellX";
                        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("cellY");
                        String str22 = "cellY";
                        int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("uri");
                        String str23 = "uri";
                        int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("displayMode");
                        int columnIndex = cursor.getColumnIndex("profileId");
                        int i6 = columnIndexOrThrow13;
                        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
                        int i7 = columnIndexOrThrow7;
                        int i8 = invariantDeviceProfile.numColumns;
                        int i9 = invariantDeviceProfile.numRows;
                        int i10 = invariantDeviceProfile.numHotseatIcons;
                        InvariantDeviceProfile invariantDeviceProfile2 = invariantDeviceProfile;
                        HashSet hashSet = new HashSet(cursor.getCount());
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        SparseArray sparseArray4 = new SparseArray();
                        while (true) {
                            sparseArray = sparseArray4;
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            int i11 = cursor.getInt(columnIndexOrThrow9);
                            int i12 = columnIndexOrThrow9;
                            int i13 = columnIndexOrThrow6;
                            if (!(i11 == 0 || i11 == 1)) {
                                if (i11 == 2) {
                                    i11 = 2;
                                } else {
                                    sparseArray4 = sparseArray;
                                    columnIndexOrThrow9 = i12;
                                    columnIndexOrThrow6 = i13;
                                }
                            }
                            int i14 = cursor.getInt(columnIndexOrThrow11);
                            int i15 = cursor.getInt(columnIndexOrThrow12);
                            int i16 = columnIndexOrThrow12;
                            int i17 = cursor.getInt(columnIndexOrThrow10);
                            int i18 = columnIndexOrThrow10;
                            int i19 = cursor.getInt(columnIndexOrThrow8);
                            int i20 = columnIndexOrThrow8;
                            String string = cursor.getString(columnIndexOrThrow2);
                            int i21 = columnIndexOrThrow2;
                            UserManagerCompat instance = UserManagerCompat.getInstance(this.mContext);
                            int i22 = columnIndexOrThrow11;
                            if (columnIndex == -1 || cursor.isNull(columnIndex)) {
                                i4 = columnIndexOrThrow5;
                                i5 = columnIndexOrThrow4;
                                UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
                                long serialNumberForUser = instance.getSerialNumberForUser(myUserHandle);
                                userHandleCompat = myUserHandle;
                                j = serialNumberForUser;
                            } else {
                                i4 = columnIndexOrThrow5;
                                i5 = columnIndexOrThrow4;
                                j = (long) cursor.getInt(columnIndex);
                                userHandleCompat = instance.getUserForSerialNumber(j);
                            }
                            if (userHandleCompat == null) {
                                String str24 = str10;
                                Launcher.addDumpLog$ar$ds(str24, "skipping deleted user", (Exception) null);
                                str10 = str24;
                                sparseArray4 = sparseArray;
                                columnIndexOrThrow9 = i12;
                                columnIndexOrThrow6 = i13;
                                columnIndexOrThrow12 = i16;
                                columnIndexOrThrow10 = i18;
                                columnIndexOrThrow8 = i20;
                                columnIndexOrThrow2 = i21;
                                columnIndexOrThrow11 = i22;
                                columnIndexOrThrow4 = i5;
                            } else {
                                str4 = str10;
                                int i23 = columnIndex;
                                String string2 = cursor.getString(columnIndexOrThrow3);
                                long j2 = j;
                                String containerToString = LauncherSettings$Favorites.containerToString(i19);
                                StringBuilder sb = new StringBuilder();
                                int i24 = columnIndexOrThrow3;
                                sb.append("migrating \"");
                                sb.append(string2);
                                sb.append("\" (");
                                sb.append(i14);
                                sb.append(",");
                                sb.append(i15);
                                sb.append("@");
                                sb.append(containerToString);
                                sb.append("/");
                                sb.append(i17);
                                sb.append("): ");
                                sb.append(string);
                                Launcher.addDumpLog$ar$ds(str4, sb.toString(), (Exception) null);
                                if (i11 != 2) {
                                    Intent parseUri = Intent.parseUri(string, 0);
                                    ComponentName component = parseUri.getComponent();
                                    if (TextUtils.isEmpty(string)) {
                                        Launcher.addDumpLog$ar$ds(str4, "skipping empty intent", (Exception) null);
                                    } else if (component != null && !LauncherModel.isValidPackageActivity(this.mContext, component, userHandleCompat)) {
                                        Launcher.addDumpLog$ar$ds(str4, "skipping item whose component no longer exists.", (Exception) null);
                                    } else if (i19 == -100) {
                                        parseUri.setPackage((String) null);
                                        int flags = parseUri.getFlags();
                                        parseUri.setFlags(0);
                                        String uri2 = parseUri.toUri(0);
                                        parseUri.setFlags(flags);
                                        if (hashSet.contains(uri2)) {
                                            Launcher.addDumpLog$ar$ds(str4, "skipping duplicate", (Exception) null);
                                        } else {
                                            hashSet.add(uri2);
                                            i19 = -100;
                                        }
                                    }
                                    columnIndex = i23;
                                    sparseArray4 = sparseArray;
                                    columnIndexOrThrow9 = i12;
                                    columnIndexOrThrow6 = i13;
                                    columnIndexOrThrow12 = i16;
                                    columnIndexOrThrow10 = i18;
                                    columnIndexOrThrow8 = i20;
                                    columnIndexOrThrow2 = i21;
                                    columnIndexOrThrow4 = i5;
                                    columnIndexOrThrow5 = i4;
                                    columnIndexOrThrow3 = i24;
                                    str10 = str4;
                                    columnIndexOrThrow11 = i22;
                                }
                                ContentValues contentValues = new ContentValues(cursor.getColumnCount());
                                String str25 = str11;
                                contentValues.put(str25, Integer.valueOf(cursor.getInt(columnIndexOrThrow)));
                                String str26 = str12;
                                contentValues.put(str26, string);
                                int i25 = i24;
                                String str27 = str13;
                                contentValues.put(str27, cursor.getString(i25));
                                int i26 = i5;
                                int i27 = columnIndexOrThrow;
                                int i28 = i25;
                                String str28 = str14;
                                contentValues.put(str28, Integer.valueOf(cursor.getInt(i26)));
                                str14 = str28;
                                int i29 = i4;
                                byte[] blob = cursor.getBlob(i29);
                                i4 = i29;
                                String str29 = str15;
                                contentValues.put(str29, blob);
                                str15 = str29;
                                int i30 = i13;
                                String string3 = cursor.getString(i30);
                                int i31 = i30;
                                String str30 = str16;
                                contentValues.put(str30, string3);
                                str16 = str30;
                                int i32 = i7;
                                String string4 = cursor.getString(i32);
                                i7 = i32;
                                String str31 = str17;
                                contentValues.put(str31, string4);
                                str17 = str31;
                                String str32 = str19;
                                contentValues.put(str32, Integer.valueOf(i11));
                                str19 = str32;
                                contentValues.put("appWidgetId", -1);
                                int i33 = i6;
                                String string5 = cursor.getString(i33);
                                i6 = i33;
                                String str33 = str23;
                                contentValues.put(str33, string5);
                                str23 = str33;
                                int i34 = columnIndexOrThrow14;
                                columnIndexOrThrow14 = i34;
                                contentValues.put("displayMode", Integer.valueOf(cursor.getInt(i34)));
                                contentValues.put("profileId", Long.valueOf(j2));
                                if (i19 == -101) {
                                    sparseArray3 = sparseArray;
                                    sparseArray3.put(i17, contentValues);
                                    i19 = NetError.ERR_CONNECTION_RESET;
                                } else {
                                    sparseArray3 = sparseArray;
                                }
                                if (i19 != -100) {
                                    Integer valueOf = Integer.valueOf(i17);
                                    str6 = str20;
                                    contentValues.put(str6, valueOf);
                                    Integer valueOf2 = Integer.valueOf(i14);
                                    str7 = str21;
                                    contentValues.put(str7, valueOf2);
                                    Integer valueOf3 = Integer.valueOf(i15);
                                    str5 = str22;
                                    contentValues.put(str5, valueOf3);
                                } else {
                                    str6 = str20;
                                    str7 = str21;
                                    str5 = str22;
                                }
                                String str34 = str18;
                                contentValues.put(str34, Integer.valueOf(i19));
                                if (i11 != 2) {
                                    ArrayList arrayList3 = arrayList;
                                    arrayList3.add(contentValues);
                                    sparseArray4 = sparseArray3;
                                    arrayList = arrayList3;
                                    str18 = str34;
                                    str21 = str7;
                                    str11 = str25;
                                    columnIndexOrThrow4 = i26;
                                    str20 = str6;
                                    str13 = str27;
                                    str22 = str5;
                                    columnIndex = i23;
                                    columnIndexOrThrow = i27;
                                    columnIndexOrThrow9 = i12;
                                    columnIndexOrThrow6 = i31;
                                    columnIndexOrThrow12 = i16;
                                    columnIndexOrThrow10 = i18;
                                    columnIndexOrThrow8 = i20;
                                    columnIndexOrThrow2 = i21;
                                    columnIndexOrThrow3 = i28;
                                    str12 = str26;
                                    str10 = str4;
                                    columnIndexOrThrow11 = i22;
                                } else {
                                    ArrayList arrayList4 = arrayList2;
                                    arrayList4.add(contentValues);
                                    arrayList = arrayList;
                                    str18 = str34;
                                    str21 = str7;
                                    str11 = str25;
                                    columnIndexOrThrow4 = i26;
                                    arrayList2 = arrayList4;
                                    str20 = str6;
                                    str13 = str27;
                                    str22 = str5;
                                    columnIndex = i23;
                                    columnIndexOrThrow9 = i12;
                                    columnIndexOrThrow6 = i31;
                                    columnIndexOrThrow12 = i16;
                                    columnIndexOrThrow10 = i18;
                                    columnIndexOrThrow8 = i20;
                                    columnIndexOrThrow2 = i21;
                                    columnIndexOrThrow3 = i28;
                                    sparseArray4 = sparseArray3;
                                    str10 = str4;
                                    columnIndexOrThrow = i27;
                                    columnIndexOrThrow11 = i22;
                                    str12 = str26;
                                }
                            }
                            columnIndexOrThrow5 = i4;
                        }
                        str = str10;
                        String str35 = str11;
                        String str36 = str18;
                        String str37 = str20;
                        String str38 = str21;
                        String str39 = str22;
                        ArrayList arrayList5 = arrayList;
                        ArrayList arrayList6 = arrayList2;
                        SparseArray sparseArray5 = sparseArray;
                        int size = sparseArray5.size();
                        int i35 = 0;
                        while (i35 < size) {
                            int keyAt = sparseArray5.keyAt(i35);
                            ContentValues contentValues2 = (ContentValues) sparseArray5.valueAt(i35);
                            int i36 = size;
                            InvariantDeviceProfile invariantDeviceProfile3 = invariantDeviceProfile2;
                            if (keyAt == invariantDeviceProfile3.hotseatAllAppsRank) {
                                while (true) {
                                    keyAt++;
                                    i3 = i10;
                                    if (keyAt >= i3) {
                                        sparseArray2 = sparseArray5;
                                        break;
                                    } else if (sparseArray5.get(keyAt) == null) {
                                        sparseArray2 = sparseArray5;
                                        contentValues2.put(str37, Integer.valueOf(keyAt));
                                        break;
                                    } else {
                                        i10 = i3;
                                    }
                                }
                            } else {
                                sparseArray2 = sparseArray5;
                                i3 = i10;
                            }
                            if (keyAt >= i3) {
                                contentValues2.put(str36, -100);
                            }
                            i35++;
                            i10 = i3;
                            invariantDeviceProfile2 = invariantDeviceProfile3;
                            size = i36;
                            sparseArray5 = sparseArray2;
                        }
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList6);
                        arrayList7.addAll(arrayList5);
                        Iterator it = arrayList7.iterator();
                        i = 0;
                        int i37 = 0;
                        loop3:
                        while (true) {
                            int i38 = 0;
                            while (it.hasNext()) {
                                ContentValues contentValues3 = (ContentValues) it.next();
                                if (contentValues3.getAsInteger(str36).intValue() == -100) {
                                    contentValues3.put(str37, Integer.valueOf(i));
                                    contentValues3.put(str38, Integer.valueOf(i37));
                                    contentValues3.put(str39, Integer.valueOf(i38));
                                    i37 = (i37 + 1) % i8;
                                    if (i37 == 0) {
                                        i38++;
                                    }
                                    if (i38 == i9 - 1) {
                                        i = (int) generateNewScreenId();
                                    }
                                }
                            }
                            break loop3;
                        }
                        if (arrayList7.size() > 0) {
                            sQLiteDatabase.beginTransaction();
                            try {
                                Iterator it2 = arrayList7.iterator();
                                int i39 = 0;
                                while (it2.hasNext()) {
                                    ContentValues contentValues4 = (ContentValues) it2.next();
                                    SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase;
                                    if (contentValues4 != null) {
                                        String str40 = str8;
                                        String str41 = str9;
                                        try {
                                            if (LauncherProvider.dbInsertAndCheck$ar$ds(this, sQLiteDatabase4, str41, contentValues4) < 0) {
                                                sQLiteDatabase.endTransaction();
                                                cursor.close();
                                                return;
                                            }
                                            i39++;
                                            str8 = str40;
                                            str9 = str41;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    }
                                }
                                sQLiteDatabase2 = sQLiteDatabase;
                                str3 = str8;
                                str2 = str9;
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                i2 = i39;
                            } catch (Throwable th2) {
                                th = th2;
                                SQLiteDatabase sQLiteDatabase5 = sQLiteDatabase;
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        } else {
                            sQLiteDatabase2 = sQLiteDatabase;
                            str3 = str8;
                            str2 = str9;
                            i2 = 0;
                        }
                        sQLiteDatabase.beginTransaction();
                        for (int i40 = 0; i40 <= i; i40++) {
                            ContentValues contentValues5 = new ContentValues();
                            Integer valueOf4 = Integer.valueOf(i40);
                            contentValues5.put(str35, valueOf4);
                            contentValues5.put("screenRank", valueOf4);
                            if (LauncherProvider.dbInsertAndCheck$ar$ds(this, sQLiteDatabase2, str3, contentValues5) < 0) {
                                sQLiteDatabase.endTransaction();
                                cursor.close();
                                return;
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        updateFolderItemsRank$ar$ds(sQLiteDatabase2, false);
                    } else {
                        sQLiteDatabase2 = sQLiteDatabase;
                        str3 = str8;
                        str2 = str9;
                        str = str10;
                        i2 = 0;
                        i = 0;
                    }
                    cursor.close();
                } catch (URISyntaxException unused2) {
                    Launcher.addDumpLog$ar$ds(str4, "skipping invalid intent uri", (Exception) null);
                } catch (Throwable th3) {
                    cursor.close();
                    throw th3;
                }
            } else {
                sQLiteDatabase2 = sQLiteDatabase;
                str3 = str8;
                str2 = str9;
                str = str10;
                i2 = 0;
                i = 0;
            }
            Launcher.addDumpLog$ar$ds(str, "migrated " + i2 + " icons from Launcher2 into " + (i + 1) + " screens", (Exception) null);
            Utilities.getPrefs(this.mContext).edit().putBoolean("EMPTY_DATABASE_CREATED", false).commit();
            this.mMaxItemId = LauncherProvider.getMaxId(sQLiteDatabase2, str2);
            this.mMaxScreenId = LauncherProvider.getMaxId(sQLiteDatabase2, str3);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.mMaxItemId = 1;
            this.mMaxScreenId = 0;
            addFavoritesTable(sQLiteDatabase, false);
            addWorkspacesTable$ar$ds(sQLiteDatabase, false);
            AppWidgetHost appWidgetHost = this.mAppWidgetHost;
            if (appWidgetHost != null) {
                appWidgetHost.deleteHost();
                new MainThreadExecutor().execute(new Runnable() {
                    public final void run() {
                        LauncherProviderChangeListener launcherProviderChangeListener = DatabaseHelper.this.mListener;
                        if (launcherProviderChangeListener != null) {
                            launcherProviderChangeListener.onAppWidgetHostReset();
                        }
                    }
                });
            }
            this.mMaxItemId = LauncherProvider.getMaxId(sQLiteDatabase, "favorites");
            Utilities.getPrefs(this.mContext).edit().putBoolean("EMPTY_DATABASE_CREATED", true).commit();
            ManagedProfileHeuristic.processAllUsers(Collections.emptyList(), this.mContext);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Log.w("LauncherProvider", "Database version downgrade from: " + i + " to " + i2 + ". Wiping databse.");
            createEmptyDB(sQLiteDatabase);
        }

        public final boolean recreateWorkspaceTable(SQLiteDatabase sQLiteDatabase) {
            Cursor query;
            sQLiteDatabase.beginTransaction();
            try {
                query = sQLiteDatabase.query("workspaceScreens", new String[]{"_id"}, (String) null, (String[]) null, (String) null, (String) null, "screenRank");
                ArrayList arrayList = new ArrayList();
                long j = 0;
                while (query.moveToNext()) {
                    Long valueOf = Long.valueOf(query.getLong(0));
                    if (!arrayList.contains(valueOf)) {
                        arrayList.add(valueOf);
                        j = Math.max(j, valueOf.longValue());
                    }
                }
                query.close();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS workspaceScreens");
                addWorkspacesTable$ar$ds(sQLiteDatabase, false);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_id", (Long) arrayList.get(i));
                    contentValues.put("screenRank", Integer.valueOf(i));
                    LauncherProvider.addModifiedTime(contentValues);
                    sQLiteDatabase.insertOrThrow("workspaceScreens", (String) null, contentValues);
                }
                sQLiteDatabase.setTransactionSuccessful();
                this.mMaxScreenId = j;
                sQLiteDatabase.endTransaction();
                return true;
            } catch (SQLException e) {
                try {
                    Log.e("LauncherProvider", e.getMessage(), e);
                    return false;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
            if (addIntegerColumn$ar$ds(r9, "restored", 0) != false) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            com.android.launcher3.LauncherClings.markFirstRunClingDismissed(r8.mContext);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
            r9.execSQL("DELETE FROM favorites WHERE screen NOT IN (SELECT _id FROM workspaceScreens) AND container = -100");
            r9.execSQL("DELETE FROM favorites WHERE container <> -100 AND container <> -101 AND container NOT IN (SELECT _id FROM favorites WHERE itemType = 2)");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            if (addIntegerColumn$ar$ds(r9, "profileId", com.android.launcher3.compat.UserManagerCompat.getInstance(r8.mContext).getSerialNumberForUser(com.android.launcher3.compat.UserHandleCompat.myUserHandle())) == false) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (updateFolderItemsRank$ar$ds(r9, true) != false) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
            if (recreateWorkspaceTable(r9) != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
            if (addIntegerColumn$ar$ds(r9, "options", 0) == false) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            r10 = r8.mContext;
            r0 = com.android.launcher3.compat.UserManagerCompat.getInstance(r10);
            r1 = com.android.launcher3.compat.UserHandleCompat.myUserHandle();
            r2 = r0.getUserProfiles().iterator();
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
            if (r2.hasNext() == false) goto L_0x00c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
            r4 = (com.android.launcher3.compat.UserHandleCompat) r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
            if (r1.equals(r4) != false) goto L_0x0088;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
            if (r3 != null) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
            r3 = r10.getSharedPreferences("com.android.launcher3.managedusers.prefs", 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
            r4 = "user_folder_" + r0.getSerialNumberForUser(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
            if (r3.contains(r4) != false) goto L_0x0088;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
            r3.edit().putLong(r4, -1).apply();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
            convertShortcutsToLauncherActivities(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            android.util.Log.e("LauncherProvider", r10.getMessage(), r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
            r9.endTransaction();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
            throw r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r9.beginTransaction();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            r9.execSQL("ALTER TABLE favorites ADD COLUMN appWidgetProvider TEXT;");
            r9.setTransactionSuccessful();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase r9, int r10, int r11) {
            /*
                r8 = this;
                r11 = 0
                r0 = 0
                java.lang.String r2 = "LauncherProvider"
                switch(r10) {
                    case 12: goto L_0x000b;
                    case 13: goto L_0x0010;
                    case 14: goto L_0x001e;
                    case 15: goto L_0x0031;
                    case 16: goto L_0x0039;
                    case 17: goto L_0x003e;
                    case 18: goto L_0x003e;
                    case 19: goto L_0x0048;
                    case 20: goto L_0x005e;
                    case 21: goto L_0x0065;
                    case 22: goto L_0x006b;
                    case 23: goto L_0x0075;
                    case 24: goto L_0x0075;
                    case 25: goto L_0x00c8;
                    case 26: goto L_0x000a;
                    default: goto L_0x0008;
                }
            L_0x0008:
                goto L_0x00f0
            L_0x000a:
                return
            L_0x000b:
                r8.mMaxScreenId = r0
                addWorkspacesTable$ar$ds(r9, r11)
            L_0x0010:
                r9.beginTransaction()
                java.lang.String r10 = "ALTER TABLE favorites ADD COLUMN appWidgetProvider TEXT;"
                r9.execSQL(r10)     // Catch:{ SQLException -> 0x00e0 }
                r9.setTransactionSuccessful()     // Catch:{ SQLException -> 0x00e0 }
                r9.endTransaction()
            L_0x001e:
                r9.beginTransaction()
                java.lang.String r10 = "ALTER TABLE favorites ADD COLUMN modified INTEGER NOT NULL DEFAULT 0;"
                r9.execSQL(r10)     // Catch:{ SQLException -> 0x00ce }
                java.lang.String r10 = "ALTER TABLE workspaceScreens ADD COLUMN modified INTEGER NOT NULL DEFAULT 0;"
                r9.execSQL(r10)     // Catch:{ SQLException -> 0x00ce }
                r9.setTransactionSuccessful()     // Catch:{ SQLException -> 0x00ce }
                r9.endTransaction()
            L_0x0031:
                java.lang.String r10 = "restored"
                boolean r10 = addIntegerColumn$ar$ds(r9, r10, r0)
                if (r10 == 0) goto L_0x00f0
            L_0x0039:
                android.content.Context r10 = r8.mContext
                com.android.launcher3.LauncherClings.markFirstRunClingDismissed(r10)
            L_0x003e:
                java.lang.String r10 = "DELETE FROM favorites WHERE screen NOT IN (SELECT _id FROM workspaceScreens) AND container = -100"
                r9.execSQL(r10)
                java.lang.String r10 = "DELETE FROM favorites WHERE container <> -100 AND container <> -101 AND container NOT IN (SELECT _id FROM favorites WHERE itemType = 2)"
                r9.execSQL(r10)
            L_0x0048:
                android.content.Context r10 = r8.mContext
                com.android.launcher3.compat.UserManagerCompat r10 = com.android.launcher3.compat.UserManagerCompat.getInstance(r10)
                com.android.launcher3.compat.UserHandleCompat r3 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
                long r3 = r10.getSerialNumberForUser(r3)
                java.lang.String r10 = "profileId"
                boolean r10 = addIntegerColumn$ar$ds(r9, r10, r3)
                if (r10 == 0) goto L_0x00f0
            L_0x005e:
                r10 = 1
                boolean r10 = updateFolderItemsRank$ar$ds(r9, r10)
                if (r10 == 0) goto L_0x00f0
            L_0x0065:
                boolean r10 = r8.recreateWorkspaceTable(r9)
                if (r10 == 0) goto L_0x00f0
            L_0x006b:
                java.lang.String r10 = "options"
                boolean r10 = addIntegerColumn$ar$ds(r9, r10, r0)
                if (r10 != 0) goto L_0x0075
                goto L_0x00f0
            L_0x0075:
                android.content.Context r10 = r8.mContext
                com.android.launcher3.compat.UserManagerCompat r0 = com.android.launcher3.compat.UserManagerCompat.getInstance(r10)
                com.android.launcher3.compat.UserHandleCompat r1 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
                java.util.List r2 = r0.getUserProfiles()
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
            L_0x0088:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x00c8
                java.lang.Object r4 = r2.next()
                com.android.launcher3.compat.UserHandleCompat r4 = (com.android.launcher3.compat.UserHandleCompat) r4
                boolean r5 = r1.equals(r4)
                if (r5 != 0) goto L_0x0088
                if (r3 != 0) goto L_0x00a2
                java.lang.String r3 = "com.android.launcher3.managedusers.prefs"
                android.content.SharedPreferences r3 = r10.getSharedPreferences(r3, r11)
            L_0x00a2:
                long r4 = r0.getSerialNumberForUser(r4)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "user_folder_"
                r6.<init>(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                boolean r5 = r3.contains(r4)
                if (r5 != 0) goto L_0x0088
                android.content.SharedPreferences$Editor r5 = r3.edit()
                r6 = -1
                android.content.SharedPreferences$Editor r4 = r5.putLong(r4, r6)
                r4.apply()
                goto L_0x0088
            L_0x00c8:
                r8.convertShortcutsToLauncherActivities(r9)
                return
            L_0x00cc:
                r10 = move-exception
                goto L_0x00da
            L_0x00ce:
                r10 = move-exception
                java.lang.String r11 = r10.getMessage()     // Catch:{ all -> 0x00cc }
                android.util.Log.e(r2, r11, r10)     // Catch:{ all -> 0x00cc }
                r9.endTransaction()
                goto L_0x00f0
            L_0x00da:
                r9.endTransaction()
                throw r10
            L_0x00de:
                r10 = move-exception
                goto L_0x00ec
            L_0x00e0:
                r10 = move-exception
                java.lang.String r11 = r10.getMessage()     // Catch:{ all -> 0x00de }
                android.util.Log.e(r2, r11, r10)     // Catch:{ all -> 0x00de }
                r9.endTransaction()
                goto L_0x00f0
            L_0x00ec:
                r9.endTransaction()
                throw r10
            L_0x00f0:
                java.lang.String r10 = "Destroying all old data."
                android.util.Log.w(r2, r10)
                r8.createEmptyDB(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherProvider.DatabaseHelper.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }
    }
}
