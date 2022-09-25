package com.android.launcher3.compat;

import android.content.Context;
import com.android.launcher3.Utilities;
import java.util.HashMap;

/* compiled from: PG */
public abstract class PackageInstallerCompat {
    public static final int STATUS_FAILED = 2;
    public static final int STATUS_INSTALLED = 0;
    public static final int STATUS_INSTALLING = 1;
    private static PackageInstallerCompat sInstance;
    private static final Object sInstanceLock = new Object();

    /* compiled from: PG */
    public final class PackageInstallInfo {
        public final String packageName;
        public int progress;
        public int state;

        public PackageInstallInfo(String str) {
            this.packageName = str;
        }

        public PackageInstallInfo(String str, int i, int i2) {
            this.packageName = str;
            this.state = i;
            this.progress = i2;
        }
    }

    public static PackageInstallerCompat getInstance(Context context) {
        PackageInstallerCompat packageInstallerCompat;
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                if (Utilities.ATLEAST_LOLLIPOP) {
                    sInstance = new PackageInstallerCompatVL(context);
                } else {
                    sInstance = new PackageInstallerCompatV16();
                }
            }
            packageInstallerCompat = sInstance;
        }
        return packageInstallerCompat;
    }

    public abstract void onStop();

    public abstract HashMap updateAndGetActiveSessionCache();
}
