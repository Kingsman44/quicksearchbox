package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

/* renamed from: com.google.android.libraries.ac.b.c.b.b */
/* compiled from: PG */
public final class C146805b extends C146813j {

    /* renamed from: a */
    private final boolean f396360a;

    /* renamed from: b */
    private final Long f396361b;

    public C146805b(boolean z, Long l) {
        this.f396360a = z;
        this.f396361b = l;
    }

    /* renamed from: a */
    public final Long mo123672a() {
        return this.f396361b;
    }

    /* renamed from: b */
    public final boolean mo123673b() {
        return this.f396360a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f396361b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146813j
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.ac.b.c.b.j r5 = (com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146813j) r5
            boolean r1 = r4.f396360a
            boolean r3 = r5.mo123673b()
            if (r1 != r3) goto L_0x002a
            java.lang.Long r1 = r4.f396361b
            if (r1 != 0) goto L_0x001e
            java.lang.Long r5 = r5.mo123672a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.Long r5 = r5.mo123672a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146805b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((true != this.f396360a ? 1237 : 1231) ^ 1000003) * 1000003;
        Long l = this.f396361b;
        return i ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        boolean z = this.f396360a;
        Long l = this.f396361b;
        return "CoreFootprintsPendingChangeResponse{accepted=" + z + ", serverAssignedTimestamp=" + l + "}";
    }
}
