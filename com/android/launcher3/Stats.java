package com.android.launcher3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class Stats {
    public final String mLaunchBroadcastPermission;
    public final Launcher mLauncher;

    /* compiled from: PG */
    public interface LaunchSourceProvider {
        void fillInLaunchSourceData(View view, Bundle bundle);
    }

    /* compiled from: PG */
    public final class LaunchSourceUtils {
        public static void populateSourceDataFromAncestorProvider(View view, Bundle bundle) {
            LaunchSourceProvider launchSourceProvider;
            if (view != null) {
                ViewParent parent = view.getParent();
                while (true) {
                    launchSourceProvider = null;
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    } else if (parent instanceof LaunchSourceProvider) {
                        launchSourceProvider = (LaunchSourceProvider) parent;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (launchSourceProvider != null) {
                    launchSourceProvider.fillInLaunchSourceData(view, bundle);
                }
            }
        }
    }

    public Stats(Launcher launcher) {
        this.mLauncher = launcher;
        this.mLaunchBroadcastPermission = launcher.getResources().getString(R.string.receive_launch_broadcasts_permission);
    }
}
