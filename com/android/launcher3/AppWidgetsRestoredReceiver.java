package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
public class AppWidgetsRestoredReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if ("android.appwidget.action.APPWIDGET_HOST_RESTORED".equals(intent.getAction())) {
            int[] intArrayExtra = intent2.getIntArrayExtra("appWidgetOldIds");
            int[] intArrayExtra2 = intent2.getIntArrayExtra("appWidgetIds");
            if (intArrayExtra.length == intArrayExtra2.length) {
                ContentResolver contentResolver = context.getContentResolver();
                final ArrayList arrayList = new ArrayList();
                AppWidgetManager instance = AppWidgetManager.getInstance(context);
                for (int i = 0; i < intArrayExtra.length; i++) {
                    int i2 = intArrayExtra[i];
                    int i3 = intArrayExtra2[i];
                    Log.i("AppWidgetsRestoredReceiver", "Widget state restore id " + i2 + " => " + i3);
                    int i4 = true != LauncherModel.isValidProvider(instance.getAppWidgetInfo(intArrayExtra2[i])) ? 2 : 4;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("appWidgetId", Integer.valueOf(intArrayExtra2[i]));
                    contentValues.put("restored", Integer.valueOf(i4));
                    String[] strArr = {Integer.toString(intArrayExtra[i])};
                    if (contentResolver.update(LauncherSettings$Favorites.CONTENT_URI, contentValues, "appWidgetId=? and (restored & 1) = 1", strArr) == 0) {
                        Cursor query = contentResolver.query(LauncherSettings$Favorites.CONTENT_URI, new String[]{"appWidgetId"}, "appWidgetId=?", strArr, (String) null);
                        try {
                            if (!query.moveToFirst()) {
                                arrayList.add(Integer.valueOf(intArrayExtra2[i]));
                            }
                        } finally {
                            query.close();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    final AppWidgetHost appWidgetHost = new AppWidgetHost(context, 1024);
                    new AsyncTask() {
                        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                            Void[] voidArr = (Void[]) objArr;
                            for (Integer num : arrayList) {
                                appWidgetHost.deleteAppWidgetId(num.intValue());
                                new StringBuilder("Widget no longer present, appWidgetId=").append(num);
                                Log.e("AppWidgetsRestoredReceiver", "Widget no longer present, appWidgetId=".concat(String.valueOf(num)));
                            }
                            return null;
                        }
                    }.executeOnExecutor(Utilities.THREAD_POOL_EXECUTOR, new Void[0]);
                }
                LauncherAppState launcherAppState = LauncherAppState.INSTANCE;
                if (launcherAppState != null) {
                    launcherAppState.reloadWorkspace();
                    return;
                }
                return;
            }
            Log.e("AppWidgetsRestoredReceiver", "Invalid host restored received");
        }
    }
}
