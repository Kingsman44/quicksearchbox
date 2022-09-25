package com.google.android.libraries.notifications.p2293h;

/* renamed from: com.google.android.libraries.notifications.h.b */
/* compiled from: PG */
final class C30009b extends C30016i {

    /* renamed from: a */
    private final boolean f81228a;

    /* renamed from: b */
    private final C30015h f81229b;

    public C30009b(boolean z, C30015h hVar) {
        this.f81228a = z;
        this.f81229b = hVar;
    }

    /* renamed from: a */
    public final C30015h mo35319a() {
        return this.f81229b;
    }

    /* renamed from: b */
    public final boolean mo35320b() {
        return this.f81228a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f81229b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.p2293h.C30016i
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.notifications.h.i r5 = (com.google.android.libraries.notifications.p2293h.C30016i) r5
            boolean r1 = r4.f81228a
            boolean r3 = r5.mo35320b()
            if (r1 != r3) goto L_0x002a
            com.google.android.libraries.notifications.h.h r1 = r4.f81229b
            if (r1 != 0) goto L_0x001e
            com.google.android.libraries.notifications.h.h r5 = r5.mo35319a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.android.libraries.notifications.h.h r5 = r5.mo35319a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2293h.C30009b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((true != this.f81228a ? 1237 : 1231) ^ 1000003) * 1000003;
        C30015h hVar = this.f81229b;
        return i ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        boolean z = this.f81228a;
        String valueOf = String.valueOf(this.f81229b);
        return "InterceptionResult{isIntercepted=" + z + ", dropReason=" + valueOf + "}";
    }
}
