package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import android.util.SparseArray;
import com.android.launcher3.IconCache;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.compat.PackageInstallerCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.util.LongArrayMap;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
public class PackageInstallerCompatVL extends PackageInstallerCompat {
    final SparseArray mActiveSessions = new SparseArray();
    private final IconCache mCache;
    private final PackageInstaller.SessionCallback mCallback;
    final PackageInstaller mInstaller;
    private final Handler mWorker;

    public PackageInstallerCompatVL(Context context) {
        C54521 r0 = new PackageInstaller.SessionCallback() {
            private void pushSessionDisplayToLauncher(int i) {
                PackageInstaller.SessionInfo sessionInfo = PackageInstallerCompatVL.this.mInstaller.getSessionInfo(i);
                if (sessionInfo != null && sessionInfo.getAppPackageName() != null) {
                    PackageInstallerCompatVL.this.addSessionInfoToCahce(sessionInfo, UserHandleCompat.myUserHandle());
                    LauncherAppState launcherAppState = LauncherAppState.INSTANCE;
                    if (launcherAppState != null) {
                        LauncherModel.runOnWorkerThread(new Runnable(sessionInfo.getAppPackageName()) {
                            final /* synthetic */ String val$packageName;

                            {
                                this.val$packageName = r2;
                            }

                            public final void run() {
                                synchronized (LauncherModel.sBgLock) {
                                    ArrayList arrayList = new ArrayList();
                                    UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
                                    LongArrayMap.ValueIterator valueIterator = new LongArrayMap.ValueIterator();
                                    while (valueIterator.hasNext()) {
                                        ItemInfo itemInfo = (ItemInfo) valueIterator.next();
                                        if (itemInfo instanceof ShortcutInfo) {
                                            ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo;
                                            ComponentName targetComponent = shortcutInfo.getTargetComponent();
                                            if (shortcutInfo.hasStatusFlag(3) && targetComponent != null && this.val$packageName.equals(targetComponent.getPackageName())) {
                                                if (shortcutInfo.hasStatusFlag(2)) {
                                                    LauncherModel.this.mIconCache.getTitleAndIcon(shortcutInfo, shortcutInfo.promisedIntent, myUserHandle, shortcutInfo.shouldUseLowResIcon());
                                                } else {
                                                    shortcutInfo.updateIcon(LauncherModel.this.mIconCache, shortcutInfo.shouldUseLowResIcon());
                                                }
                                                arrayList.add(shortcutInfo);
                                            }
                                        }
                                    }
                                    LauncherModel.this.bindUpdatedShortcuts(arrayList, myUserHandle);
                                }
                            }
                        });
                    }
                }
            }

            public void onActiveChanged(int i, boolean z) {
            }

            public void onBadgingChanged(int i) {
                pushSessionDisplayToLauncher(i);
            }

            public void onCreated(int i) {
                pushSessionDisplayToLauncher(i);
            }

            public void onFinished(int i, boolean z) {
                String str = (String) PackageInstallerCompatVL.this.mActiveSessions.get(i);
                PackageInstallerCompatVL.this.mActiveSessions.remove(i);
                if (str != null) {
                    PackageInstallerCompatVL.this.sendUpdate(new PackageInstallerCompat.PackageInstallInfo(str, true != z ? 2 : 0, 0));
                }
            }

            public void onProgressChanged(int i, float f) {
                PackageInstaller.SessionInfo sessionInfo = PackageInstallerCompatVL.this.mInstaller.getSessionInfo(i);
                if (sessionInfo != null && sessionInfo.getAppPackageName() != null) {
                    PackageInstallerCompatVL.this.sendUpdate(new PackageInstallerCompat.PackageInstallInfo(sessionInfo.getAppPackageName(), 1, (int) (sessionInfo.getProgress() * 100.0f)));
                }
            }
        };
        this.mCallback = r0;
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        this.mInstaller = packageInstaller;
        this.mCache = LauncherAppState.getInstance().mIconCache;
        Handler handler = new Handler(LauncherModel.sWorkerThread.getLooper());
        this.mWorker = handler;
        packageInstaller.registerSessionCallback(r0, handler);
    }

    public void addSessionInfoToCahce(PackageInstaller.SessionInfo sessionInfo, UserHandleCompat userHandleCompat) {
        String appPackageName = sessionInfo.getAppPackageName();
        if (appPackageName != null) {
            this.mCache.cachePackageInstallInfo(appPackageName, userHandleCompat, sessionInfo.getAppIcon(), sessionInfo.getAppLabel());
        }
    }

    public void onStop() {
        this.mInstaller.unregisterSessionCallback(this.mCallback);
    }

    public void sendUpdate(PackageInstallerCompat.PackageInstallInfo packageInstallInfo) {
        LauncherAppState launcherAppState = LauncherAppState.INSTANCE;
        if (launcherAppState != null) {
            LauncherModel.runOnWorkerThread(new Runnable(packageInstallInfo) {
                final /* synthetic */ PackageInstallerCompat.PackageInstallInfo val$installInfo;

                {
                    this.val$installInfo = r2;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r6 = this;
                        java.lang.Object r0 = com.android.launcher3.LauncherModel.sBgLock
                        monitor-enter(r0)
                        java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x009c }
                        r1.<init>()     // Catch:{ all -> 0x009c }
                        com.android.launcher3.compat.PackageInstallerCompat$PackageInstallInfo r2 = r6.val$installInfo     // Catch:{ all -> 0x009c }
                        int r2 = r2.state     // Catch:{ all -> 0x009c }
                        if (r2 != 0) goto L_0x0010
                        monitor-exit(r0)     // Catch:{ all -> 0x009c }
                        return
                    L_0x0010:
                        com.android.launcher3.util.LongArrayMap r2 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x009c }
                        com.android.launcher3.util.LongArrayMap$ValueIterator r3 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x009c }
                        r3.<init>()     // Catch:{ all -> 0x009c }
                    L_0x0017:
                        boolean r2 = r3.hasNext()     // Catch:{ all -> 0x009c }
                        if (r2 == 0) goto L_0x005c
                        java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x009c }
                        com.android.launcher3.ItemInfo r2 = (com.android.launcher3.ItemInfo) r2     // Catch:{ all -> 0x009c }
                        boolean r4 = r2 instanceof com.android.launcher3.ShortcutInfo     // Catch:{ all -> 0x009c }
                        if (r4 == 0) goto L_0x0017
                        com.android.launcher3.ShortcutInfo r2 = (com.android.launcher3.ShortcutInfo) r2     // Catch:{ all -> 0x009c }
                        android.content.ComponentName r4 = r2.getTargetComponent()     // Catch:{ all -> 0x009c }
                        r5 = 3
                        boolean r5 = r2.hasStatusFlag(r5)     // Catch:{ all -> 0x009c }
                        if (r5 == 0) goto L_0x0017
                        if (r4 == 0) goto L_0x0017
                        com.android.launcher3.compat.PackageInstallerCompat$PackageInstallInfo r5 = r6.val$installInfo     // Catch:{ all -> 0x009c }
                        java.lang.String r5 = r5.packageName     // Catch:{ all -> 0x009c }
                        java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x009c }
                        boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x009c }
                        if (r4 == 0) goto L_0x0017
                        com.android.launcher3.compat.PackageInstallerCompat$PackageInstallInfo r4 = r6.val$installInfo     // Catch:{ all -> 0x009c }
                        int r4 = r4.progress     // Catch:{ all -> 0x009c }
                        r2.setInstallProgress(r4)     // Catch:{ all -> 0x009c }
                        com.android.launcher3.compat.PackageInstallerCompat$PackageInstallInfo r4 = r6.val$installInfo     // Catch:{ all -> 0x009c }
                        int r4 = r4.state     // Catch:{ all -> 0x009c }
                        r5 = 2
                        if (r4 != r5) goto L_0x0058
                        int r4 = r2.status     // Catch:{ all -> 0x009c }
                        r4 = r4 & -5
                        r2.status = r4     // Catch:{ all -> 0x009c }
                    L_0x0058:
                        r1.add(r2)     // Catch:{ all -> 0x009c }
                        goto L_0x0017
                    L_0x005c:
                        java.util.ArrayList r2 = com.android.launcher3.LauncherModel.sBgAppWidgets     // Catch:{ all -> 0x009c }
                        java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x009c }
                    L_0x0062:
                        boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009c }
                        if (r3 == 0) goto L_0x0088
                        java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009c }
                        com.android.launcher3.LauncherAppWidgetInfo r3 = (com.android.launcher3.LauncherAppWidgetInfo) r3     // Catch:{ all -> 0x009c }
                        android.content.ComponentName r4 = r3.providerName     // Catch:{ all -> 0x009c }
                        java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x009c }
                        com.android.launcher3.compat.PackageInstallerCompat$PackageInstallInfo r5 = r6.val$installInfo     // Catch:{ all -> 0x009c }
                        java.lang.String r5 = r5.packageName     // Catch:{ all -> 0x009c }
                        boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
                        if (r4 == 0) goto L_0x0062
                        com.android.launcher3.compat.PackageInstallerCompat$PackageInstallInfo r4 = r6.val$installInfo     // Catch:{ all -> 0x009c }
                        int r4 = r4.progress     // Catch:{ all -> 0x009c }
                        r3.installProgress = r4     // Catch:{ all -> 0x009c }
                        r1.add(r3)     // Catch:{ all -> 0x009c }
                        goto L_0x0062
                    L_0x0088:
                        boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x009c }
                        if (r2 != 0) goto L_0x009a
                        com.android.launcher3.LauncherModel$2$1 r2 = new com.android.launcher3.LauncherModel$2$1     // Catch:{ all -> 0x009c }
                        r2.<init>(r1)     // Catch:{ all -> 0x009c }
                        com.android.launcher3.LauncherModel r1 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x009c }
                        com.android.launcher3.DeferredHandler r1 = r1.mHandler     // Catch:{ all -> 0x009c }
                        r1.post(r2)     // Catch:{ all -> 0x009c }
                    L_0x009a:
                        monitor-exit(r0)     // Catch:{ all -> 0x009c }
                        return
                    L_0x009c:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x009c }
                        goto L_0x00a0
                    L_0x009f:
                        throw r1
                    L_0x00a0:
                        goto L_0x009f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.C53352.run():void");
                }
            });
        }
    }

    public HashMap updateAndGetActiveSessionCache() {
        HashMap hashMap = new HashMap();
        UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
        for (PackageInstaller.SessionInfo next : this.mInstaller.getAllSessions()) {
            addSessionInfoToCahce(next, myUserHandle);
            if (next.getAppPackageName() != null) {
                hashMap.put(next.getAppPackageName(), Integer.valueOf((int) (next.getProgress() * 100.0f)));
                this.mActiveSessions.put(next.getSessionId(), next.getAppPackageName());
            }
        }
        return hashMap;
    }
}
