package com.android.launcher3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
public final class WallpaperChangedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        LauncherAppState.getInstance().mWallpaperChangedSinceLastCheck = true;
    }
}
