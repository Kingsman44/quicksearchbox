package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.x */
/* compiled from: PG */
final class C89874x extends C89854d {

    /* renamed from: a */
    private final C89851ag f246233a;

    /* renamed from: b */
    private final C22804a f246234b;

    /* renamed from: c */
    private final C22804a f246235c;

    /* renamed from: d */
    private final C58541iw f246236d;

    /* renamed from: e */
    private final int f246237e;

    public C89874x(C89851ag agVar, int i, C22804a aVar, C22804a aVar2, C58541iw iwVar) {
        this.f246233a = agVar;
        this.f246237e = i;
        this.f246234b = aVar;
        this.f246235c = aVar2;
        this.f246236d = iwVar;
    }

    /* renamed from: a */
    public final C89851ag mo83691a() {
        return this.f246233a;
    }

    /* renamed from: b */
    public final C22804a mo83692b() {
        return this.f246235c;
    }

    /* renamed from: c */
    public final C22804a mo83693c() {
        return this.f246234b;
    }

    /* renamed from: d */
    public final C58541iw mo83694d() {
        return this.f246236d;
    }

    /* renamed from: e */
    public final int mo83695e() {
        return this.f246237e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.f246234b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.shared.logger.p7051b.C89854d
            r2 = 0
            if (r1 == 0) goto L_0x004e
            com.google.android.apps.gsa.shared.logger.b.d r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89854d) r5
            com.google.android.apps.gsa.shared.logger.b.ag r1 = r4.f246233a
            com.google.android.apps.gsa.shared.logger.b.ag r3 = r5.mo83691a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004e
            int r1 = r4.f246237e
            int r3 = r5.mo83695e()
            if (r1 != r3) goto L_0x004e
            com.google.android.libraries.gsa.f.a.a r1 = r4.f246234b
            if (r1 != 0) goto L_0x002a
            com.google.android.libraries.gsa.f.a.a r1 = r5.mo83693c()
            if (r1 != 0) goto L_0x004e
            goto L_0x0035
        L_0x002a:
            com.google.android.libraries.gsa.f.a.a r3 = r5.mo83693c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0035
            goto L_0x004e
        L_0x0035:
            com.google.android.libraries.gsa.f.a.a r1 = r4.f246235c
            com.google.android.libraries.gsa.f.a.a r3 = r5.mo83692b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004e
            com.google.common.b.iw r1 = r4.f246236d
            com.google.common.b.iw r5 = r5.mo83694d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x004e
            return r0
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.logger.p7051b.C89874x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f246233a.hashCode() ^ 1000003) * 1000003) ^ this.f246237e) * 1000003;
        C22804a aVar = this.f246234b;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f246235c.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f246236d);
    }

    public final String toString() {
        String num = Integer.toString(this.f246233a.f246200fb);
        String num2 = Integer.toString(this.f246237e - 1);
        String valueOf = String.valueOf(this.f246234b);
        String obj = this.f246235c.toString();
        String obj2 = this.f246236d.toString();
        return "AppFlowData{flowType=" + num + ", status=" + num2 + ", startEvent=" + valueOf + ", endEvent=" + obj + ", events=" + obj2 + "}";
    }
}
