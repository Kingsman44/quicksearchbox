package p5462h.p5483m;

import java.util.List;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: h.m.z */
/* compiled from: PG */
final class C69777z extends C69665o implements C69630p {

    /* renamed from: a */
    final /* synthetic */ List f186152a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69777z(List list) {
        super(2);
        this.f186152a = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo5192a(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r0 = "$this$$receiver"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r0)
            java.util.List r6 = r12.f186152a
            int r0 = r6.size()
            r1 = 1
            r2 = 0
            r7 = 0
            if (r0 != r1) goto L_0x0062
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = p5462h.p5463a.C69540x.m100825G(r6)
            goto L_0x003b
        L_0x0026:
            java.util.Iterator r0 = r6.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x0052
            r0 = r1
        L_0x003b:
            java.lang.String r0 = (java.lang.String) r0
            r1 = 4
            int r13 = p5462h.p5483m.C69764m.m101186C(r13, r0, r14, r2, r1)
            if (r13 >= 0) goto L_0x0047
        L_0x0044:
            r14 = r7
            goto L_0x00f3
        L_0x0047:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            h.i r14 = new h.i
            r14.<init>(r13, r0)
            goto L_0x00f3
        L_0x0052:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Collection has more than one element."
            r13.<init>(r14)
            throw r13
        L_0x005a:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            java.lang.String r14 = "Collection is empty."
            r13.<init>(r14)
            throw r13
        L_0x0062:
            h.j.c r0 = new h.j.c
            if (r14 >= 0) goto L_0x0067
            r14 = 0
        L_0x0067:
            int r1 = r13.length()
            r0.<init>(r14, r1)
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L_0x00b2
            int r14 = r0.f186059a
            int r1 = r0.f186060b
            int r0 = r0.f186061c
            if (r0 <= 0) goto L_0x007c
            if (r14 <= r1) goto L_0x0080
        L_0x007c:
            if (r0 >= 0) goto L_0x0044
            if (r1 > r14) goto L_0x0044
        L_0x0080:
            java.util.Iterator r3 = r6.iterator()
        L_0x0084:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r8 = r13
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r5.length()
            boolean r5 = p5462h.p5483m.C69764m.m101235n(r5, r8, r14, r9, r2)
            if (r5 == 0) goto L_0x0084
            goto L_0x00a0
        L_0x009f:
            r4 = r7
        L_0x00a0:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00ae
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            h.i r14 = new h.i
            r14.<init>(r13, r4)
            goto L_0x00f3
        L_0x00ae:
            if (r14 == r1) goto L_0x0044
            int r14 = r14 + r0
            goto L_0x0080
        L_0x00b2:
            int r14 = r0.f186059a
            int r8 = r0.f186060b
            int r9 = r0.f186061c
            if (r9 <= 0) goto L_0x00bc
            if (r14 <= r8) goto L_0x00c0
        L_0x00bc:
            if (r9 >= 0) goto L_0x0044
            if (r8 > r14) goto L_0x0044
        L_0x00c0:
            java.util.Iterator r10 = r6.iterator()
        L_0x00c4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r11 = r10.next()
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r5 = 0
            r2 = r13
            r3 = r14
            boolean r0 = p5462h.p5483m.C69764m.m101206z(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c4
            goto L_0x00e1
        L_0x00e0:
            r11 = r7
        L_0x00e1:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00ef
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            h.i r14 = new h.i
            r14.<init>(r13, r11)
            goto L_0x00f3
        L_0x00ef:
            if (r14 == r8) goto L_0x0044
            int r14 = r14 + r9
            goto L_0x00c0
        L_0x00f3:
            if (r14 == 0) goto L_0x0109
            java.lang.Object r13 = r14.f186052a
            java.lang.Object r14 = r14.f186053b
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r14.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            h.i r0 = new h.i
            r0.<init>(r13, r14)
            return r0
        L_0x0109:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5483m.C69777z.mo5192a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
