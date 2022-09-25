package com.google.android.libraries.lens.view.p2056af;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.af.bf */
/* compiled from: PG */
public final /* synthetic */ class C25061bf implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C25061bf f68306a = new C25061bf();

    private /* synthetic */ C25061bf() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            java.io.File r7 = (java.io.File) r7
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "cpufreq/cpuinfo_max_freq"
            r0.<init>(r7, r1)     // Catch:{ Exception -> 0x004c }
            java.nio.file.Path r7 = r0.toPath()     // Catch:{ Exception -> 0x004c }
            java.nio.charset.Charset r0 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x004c }
            java.io.BufferedReader r7 = java.nio.file.Files.newBufferedReader(r7, r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = r7.readLine()     // Catch:{ all -> 0x002c }
            r0.getClass()
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x002c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x002c }
            j$.util.stream.Stream r0 = p3186j$.util.stream.Stream.CC.m71935of(r0)     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x0050
            r7.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x002c:
            r0 = move-exception
            if (r7 == 0) goto L_0x004b
            r7.close()     // Catch:{ all -> 0x0033 }
            goto L_0x004b
        L_0x0033:
            r7 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004b }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x004b }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x004b }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004b }
            r1[r4] = r7     // Catch:{ Exception -> 0x004b }
            r2.invoke(r0, r1)     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            throw r0     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            j$.util.stream.Stream r0 = p3186j$.util.stream.Stream.CC.empty()
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2056af.C25061bf.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
