package com.android.launcher3;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.launcher3.LauncherProvider;
import com.android.launcher3.model.GridSizeMigrationTask;

/* compiled from: PG */
public class LauncherBackupAgentHelper extends BackupAgentHelper {
    static final boolean DEBUG = false;
    private static final String KEY_LAST_NOTIFIED_TIME = "backup_manager_last_notified";
    public static final String LAUNCHER_DATA_PREFIX = "L";
    private static final String TAG = "LauncherBAHelper";
    static final boolean VERBOSE = false;
    protected LauncherBackupHelper mHelper;

    public static void dataChanged(Context context) {
        dataChanged(context, 0);
    }

    public void onCreate() {
        super.onCreate();
        LauncherBackupHelper launcherBackupHelper = new LauncherBackupHelper(this);
        this.mHelper = launcherBackupHelper;
        addHelper(LAUNCHER_DATA_PREFIX, launcherBackupHelper);
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        if (!Utilities.ATLEAST_LOLLIPOP) {
            Log.i(TAG, "You shall not pass!!!");
            Log.d(TAG, "Restore is only supported on devices running Lollipop and above.");
            return;
        }
        LauncherAppState.getLauncherProvider().createEmptyDB();
        try {
            super.onRestore(backupDataInput, i, parcelFileDescriptor);
            Cursor query = getContentResolver().query(LauncherSettings$Favorites.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
            boolean moveToNext = query.moveToNext();
            query.close();
            if (moveToNext && this.mHelper.restoreSuccessful) {
                LauncherAppState.getLauncherProvider().clearFlagEmptyDbCreated();
                LauncherClings.markFirstRunClingDismissed(this);
                if (this.mHelper.restoredBackupVersion <= 3) {
                    LauncherProvider.DatabaseHelper.updateFolderItemsRank$ar$ds(LauncherAppState.getLauncherProvider().mOpenHelper.getWritableDatabase(), false);
                }
                if (GridSizeMigrationTask.ENABLED && this.mHelper.migrationCompatibleProfileData != null) {
                    Context applicationContext = getApplicationContext();
                    LauncherBackupHelper launcherBackupHelper = this.mHelper;
                    GridSizeMigrationTask.markForMigration(applicationContext, launcherBackupHelper.widgetSizes, launcherBackupHelper.migrationCompatibleProfileData);
                }
                LauncherProvider.DatabaseHelper databaseHelper = LauncherAppState.getLauncherProvider().mOpenHelper;
                databaseHelper.convertShortcutsToLauncherActivities(databaseHelper.getWritableDatabase());
                return;
            }
        } catch (Exception e) {
            Log.e(TAG, "Restore failed", e);
        }
        LauncherAppState.getLauncherProvider().createEmptyDB();
    }

    public static void dataChanged(Context context, long j) {
        SharedPreferences prefs = Utilities.getPrefs(context);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = prefs.getLong(KEY_LAST_NOTIFIED_TIME, 0);
        if (currentTimeMillis < j2 || currentTimeMillis >= j2 + j) {
            BackupManager.dataChanged(context.getPackageName());
            prefs.edit().putLong(KEY_LAST_NOTIFIED_TIME, currentTimeMillis).apply();
        }
    }
}
