package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.x */
/* compiled from: PG */
final class C82016x extends C82002j {

    /* renamed from: a */
    private final String f224212a;

    /* renamed from: b */
    private final Integer f224213b;

    /* renamed from: c */
    private final Integer f224214c;

    /* renamed from: d */
    private final int f224215d;

    public C82016x(String str, Integer num, Integer num2, int i) {
        this.f224212a = str;
        this.f224213b = num;
        this.f224214c = num2;
        this.f224215d = i;
    }

    /* renamed from: a */
    public final int mo75440a() {
        return this.f224215d;
    }

    /* renamed from: d */
    public final Integer mo75441d() {
        return this.f224214c;
    }

    /* renamed from: e */
    public final Integer mo75442e() {
        return this.f224213b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f224214c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f224213b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.j r5 = (com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j) r5
            java.lang.String r1 = r4.f224212a
            java.lang.String r3 = r5.mo75443f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004b
            java.lang.Integer r1 = r4.f224213b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r5.mo75442e()
            if (r1 != 0) goto L_0x004b
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r5.mo75442e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004b
        L_0x002c:
            java.lang.Integer r1 = r4.f224214c
            if (r1 != 0) goto L_0x0037
            java.lang.Integer r1 = r5.mo75441d()
            if (r1 != 0) goto L_0x004b
            goto L_0x0042
        L_0x0037:
            java.lang.Integer r3 = r5.mo75441d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            int r1 = r4.f224215d
            int r5 = r5.mo75440a()
            if (r1 != r5) goto L_0x004b
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82016x.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo75443f() {
        return this.f224212a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f224212a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f224213b;
        int i2 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        Integer num2 = this.f224214c;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f224215d;
    }

    public final String toString() {
        String str = this.f224212a;
        Integer num = this.f224213b;
        Integer num2 = this.f224214c;
        int i = this.f224215d;
        return "AsyncInflaterInput{debugName=" + str + ", titleFontRes=" + num + ", textFontRes=" + num2 + ", titleFontSizeSp=" + i + "}";
    }
}
