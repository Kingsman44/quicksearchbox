package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10011e;

import java.lang.reflect.InvocationHandler;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.e.a */
/* compiled from: PG */
public final /* synthetic */ class C131721a implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ C131725e f359849a;

    public /* synthetic */ C131721a(C131725e eVar) {
        this.f359849a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            com.google.android.apps.search.assistant.verticals.ambient.trigger.e.e r0 = r6.f359849a
            java.lang.String r8 = r8.getName()
            int r1 = r8.hashCode()
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L_0x0031
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L_0x0027
            r2 = 2074622789(0x7ba83b45, float:1.747016E36)
            if (r1 == r2) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r1 = "onUidImportance"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x003b
            r8 = 0
            goto L_0x003c
        L_0x0027:
            java.lang.String r1 = "hashCode"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x003b
            r8 = 1
            goto L_0x003c
        L_0x0031:
            java.lang.String r1 = "equals"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x003b
            r8 = 2
            goto L_0x003c
        L_0x003b:
            r8 = -1
        L_0x003c:
            if (r8 == 0) goto L_0x0058
            if (r8 == r4) goto L_0x004f
            if (r8 == r3) goto L_0x0044
            goto L_0x0101
        L_0x0044:
            r8 = r9[r5]
            if (r7 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L_0x004f:
            int r7 = r0.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L_0x0058:
            com.google.android.apps.search.assistant.verticals.ambient.trigger.e.h r7 = r0.f359855a
            android.app.ActivityManager r8 = r7.f359858a     // Catch:{ RuntimeException -> 0x007b }
            java.util.List r8 = r8.getRunningTasks(r4)     // Catch:{ RuntimeException -> 0x007b }
            if (r8 == 0) goto L_0x0076
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0069
            goto L_0x0076
        L_0x0069:
            java.lang.Object r8 = r8.get(r5)
            android.app.ActivityManager$RunningTaskInfo r8 = (android.app.ActivityManager.RunningTaskInfo) r8
            android.content.ComponentName r8 = r8.topActivity
            j$.util.Optional r8 = p3186j$.util.Optional.ofNullable(r8)
            goto L_0x007f
        L_0x0076:
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            goto L_0x007f
        L_0x007b:
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
        L_0x007f:
            com.google.android.apps.search.assistant.verticals.ambient.trigger.e.f r9 = com.google.android.apps.search.assistant.verticals.ambient.trigger.p10011e.C131726f.f359856a
            j$.util.Optional r8 = r8.map(r9)
            java.lang.String r9 = ""
            java.lang.Object r8 = r8.orElse(r9)
            java.lang.String r8 = (java.lang.String) r8
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.HOME"
            android.content.Intent r0 = r0.addCategory(r1)
            android.content.pm.PackageManager r1 = r7.f359860c
            r2 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r0, r2)
            if (r0 == 0) goto L_0x00a8
            android.content.pm.ActivityInfo r9 = r0.activityInfo
            java.lang.String r9 = r9.packageName
        L_0x00a8:
            java.lang.String r0 = r7.f359861d
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00ff
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00ff
            j$.util.Optional r9 = r7.f359862e
            if (r9 == 0) goto L_0x00ff
            com.google.apps.tiktok.tracing.dh r9 = r7.f359859b
            java.lang.String r0 = "LauncherVisibilityTriggerSource#notifyListener"
            com.google.apps.tiktok.tracing.ax r9 = r9.mo51613c(r0)
            j$.util.Optional r0 = r7.f359862e     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.search.assistant.verticals.ambient.trigger.d r0 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d) r0     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g.b r1 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8220g.C106558b.f297133a     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.search.assistant.verticals.ambient.trigger.c r1 = com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c.m214153c(r1)     // Catch:{ all -> 0x00e1 }
            com.google.common.util.concurrent.cx r0 = r0.mo110075a(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "forwardEvent.onFailure(): failed to onTrigger."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e1 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r1, r2)     // Catch:{ all -> 0x00e1 }
            if (r9 == 0) goto L_0x00ff
            r9.close()
            goto L_0x00ff
        L_0x00e1:
            r7 = move-exception
            if (r9 == 0) goto L_0x00fe
            r9.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00fe
        L_0x00e8:
            r8 = move-exception
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00fe }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r9[r5] = r0     // Catch:{ Exception -> 0x00fe }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.reflect.Method r9 = r0.getDeclaredMethod(r1, r9)     // Catch:{ Exception -> 0x00fe }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00fe }
            r0[r5] = r8     // Catch:{ Exception -> 0x00fe }
            r9.invoke(r7, r0)     // Catch:{ Exception -> 0x00fe }
        L_0x00fe:
            throw r7
        L_0x00ff:
            r7.f359861d = r8
        L_0x0101:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.trigger.p10011e.C131721a.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
