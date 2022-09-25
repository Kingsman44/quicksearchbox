package com.google.android.libraries.p3329t.p3330a;

/* renamed from: com.google.android.libraries.t.a.b */
/* compiled from: PG */
public final /* synthetic */ class C43173b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C43176e f112878a;

    public /* synthetic */ C43173b(C43176e eVar) {
        this.f112878a = eVar;
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.google.android.libraries.t.a.e r0 = r14.f112878a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Handler r2 = r0.f112882b
            android.os.Looper r2 = r2.getLooper()
            java.lang.Thread r2 = r2.getThread()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            com.google.common.base.C58838bb.m90883r(r1)
            android.content.ServiceConnection r1 = r0.f112886f
            boolean r2 = r0.mo46244d()
            if (r2 == 0) goto L_0x00d7
            if (r1 != 0) goto L_0x00e4
            android.content.Intent r1 = new android.content.Intent     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            r1.<init>()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            com.google.android.libraries.t.a.f r2 = r0.f112884d     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            android.content.ComponentName r2 = r2.mo46227b()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            android.content.Intent r1 = r1.setComponent(r2)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            com.google.android.libraries.t.a.f r2 = r0.f112884d     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            java.lang.String r2 = r2.mo46230e()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            android.content.Intent r1 = r1.setAction(r2)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            com.google.android.libraries.t.a.d r2 = new com.google.android.libraries.t.a.d     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            r2.<init>(r0)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            com.google.android.libraries.t.a.f r5 = r0.f112884d     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            android.content.Context r5 = r5.mo46228c()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            com.google.android.libraries.t.a.f r6 = r0.f112884d     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            int r6 = r6.mo46226a()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            com.google.android.libraries.t.a.f r7 = r0.f112884d     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            android.os.UserHandle r7 = r7.mo46229d()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            java.lang.Class r8 = r5.getClass()     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r9 = 4
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Class<android.content.Intent> r11 = android.content.Intent.class
            r10[r4] = r11     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Class<android.content.ServiceConnection> r11 = android.content.ServiceConnection.class
            r10[r3] = r11     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r12 = 2
            r10[r12] = r11     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Class<android.os.UserHandle> r11 = android.os.UserHandle.class
            r13 = 3
            r10[r13] = r11     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.String r11 = "bindServiceAsUser"
            java.lang.reflect.Method r8 = r8.getMethod(r11, r10)     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r9[r4] = r1     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r9[r3] = r2     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r9[r12] = r1     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r9[r13] = r7     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            java.lang.Object r1 = r8.invoke(r5, r9)     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            r1.getClass()
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            boolean r1 = r1.booleanValue()     // Catch:{ InvocationTargetException -> 0x00ac, IllegalAccessException -> 0x00a5, NoSuchMethodException -> 0x009e }
            if (r1 == 0) goto L_0x0093
            r0.f112886f = r2     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            return
        L_0x0093:
            r0.mo46243c(r2)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            java.lang.String r2 = "bindService() returned false"
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            throw r1     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
        L_0x009e:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            throw r2     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
        L_0x00a5:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            throw r2     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
        L_0x00ac:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            if (r2 == 0) goto L_0x00b4
            r1 = r2
        L_0x00b4:
            com.google.common.base.C58887cx.m90980g(r1)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
            throw r2     // Catch:{ SecurityException -> 0x00bf, IOException -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            goto L_0x00c0
        L_0x00bf:
            r1 = move-exception
        L_0x00c0:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f112888h
            r2.incrementAndGet()
            com.google.common.f.e r2 = com.google.android.libraries.p3329t.p3330a.C43176e.f112881a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Could not bind()"
            r4 = 48154(0xbc1a, float:6.7478E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
            r0.mo46242b()
            return
        L_0x00d7:
            if (r1 == 0) goto L_0x00e4
            r0.mo46243c(r1)
            r1 = 0
            r0.f112886f = r1
            com.google.android.libraries.t.b.g r0 = r0.f112885e
            r0.mo46250b(r1)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p3329t.p3330a.C43173b.run():void");
    }
}
