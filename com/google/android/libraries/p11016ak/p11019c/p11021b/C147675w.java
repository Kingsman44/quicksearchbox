package com.google.android.libraries.p11016ak.p11019c.p11021b;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ak.c.b.w */
/* compiled from: PG */
public final /* synthetic */ class C147675w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ byte[] f398541a;

    public /* synthetic */ C147675w(byte[] bArr) {
        this.f398541a = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r7 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r7.hasNext() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        r0 = (java.util.Map.Entry) r7.next();
        ((com.google.common.util.concurrent.SettableFuture) r0.getValue()).mo57356n((com.google.protobuf.C63088z) r1.get(r0.getKey()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            byte[] r0 = r6.f398541a
            com.google.android.libraries.ak.c.b.ad r7 = (com.google.android.libraries.p11016ak.p11019c.p11021b.C147650ad) r7
            int r1 = com.google.android.libraries.p11016ak.p11019c.p11021b.C147678z.f398544a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            monitor-enter(r7)
            boolean r2 = r7.f398496d     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            return
        L_0x0012:
            com.google.android.libraries.ak.c.b.a r2 = r7.f398495c     // Catch:{ IOException -> 0x00af }
            boolean r3 = r2.mo124395c()     // Catch:{ IOException -> 0x00af }
            if (r3 != 0) goto L_0x001d
            r2.mo124393a()     // Catch:{ IOException -> 0x00af }
        L_0x001d:
            com.google.android.libraries.ak.c.b.b r2 = r7.f398493a     // Catch:{ IOException -> 0x00af }
            com.google.android.libraries.ak.c.b.a r3 = r7.f398495c     // Catch:{ IOException -> 0x00af }
            byte[] r3 = r3.mo124396d(r0)     // Catch:{ IOException -> 0x00af }
            r2.mo124405c(r3)     // Catch:{ IOException -> 0x00af }
            int r2 = r7.f398497e     // Catch:{ all -> 0x00b5 }
            int r0 = r0.length     // Catch:{ all -> 0x00b5 }
            int r2 = r2 + r0
            r7.f398497e = r2     // Catch:{ all -> 0x00b5 }
            java.util.Map r0 = r7.f398494b     // Catch:{ all -> 0x00b5 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x00b5 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ all -> 0x00b5 }
            com.google.android.libraries.ak.c.b.ab r2 = new com.google.android.libraries.ak.c.b.ab     // Catch:{ all -> 0x00b5 }
            r2.<init>(r7)     // Catch:{ all -> 0x00b5 }
            j$.util.stream.Stream r0 = r0.filter(r2)     // Catch:{ all -> 0x00b5 }
            j$.util.stream.Collector r2 = p3186j$.util.stream.Collectors.toList()     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r0.collect(r2)     // Catch:{ all -> 0x00b5 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00b5 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0053
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            return
        L_0x0053:
            java.util.Map r2 = r7.f398494b     // Catch:{ all -> 0x00b5 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00b5 }
            com.google.android.libraries.ak.c.b.ac r3 = new com.google.android.libraries.ak.c.b.ac     // Catch:{ all -> 0x00b5 }
            r3.<init>(r7)     // Catch:{ all -> 0x00b5 }
            p3186j$.util.Collection.EL.removeIf(r2, r3)     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x0065:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x0089
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00b5 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x00b5 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00b5 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00b5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b5 }
            com.google.android.libraries.ak.c.b.b r5 = r7.f398493a     // Catch:{ all -> 0x00b5 }
            com.google.protobuf.z r3 = r5.mo124404b(r3)     // Catch:{ all -> 0x00b5 }
            r1.put(r4, r3)     // Catch:{ all -> 0x00b5 }
            goto L_0x0065
        L_0x0089:
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r7 = r0.iterator()
        L_0x008e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            com.google.common.util.concurrent.SettableFuture r2 = (com.google.common.util.concurrent.SettableFuture) r2
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r1.get(r0)
            com.google.protobuf.z r0 = (com.google.protobuf.C63088z) r0
            r2.mo57356n(r0)
            goto L_0x008e
        L_0x00ae:
            return
        L_0x00af:
            r0 = move-exception
            r7.mo124399c(r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            return
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b8:
            throw r0
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11016ak.p11019c.p11021b.C147675w.accept(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
