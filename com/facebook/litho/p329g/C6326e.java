package com.facebook.litho.p329g;

import com.facebook.litho.C6381hf;
import com.facebook.litho.widget.C6491cw;
import com.facebook.litho.widget.C6527ee;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.g.e */
/* compiled from: PG */
public final class C6326e {

    /* renamed from: a */
    public final List f18718a = new ArrayList();

    /* renamed from: b */
    public C6335n f18719b;

    /* renamed from: c */
    public C6325d f18720c;

    /* renamed from: d */
    public int f18721d;

    private C6326e() {
    }

    /* renamed from: c */
    static C6326e m16970c(int i, C6335n nVar, boolean z) {
        C6326e eVar = new C6326e();
        eVar.f18721d = i;
        eVar.f18719b = nVar;
        eVar.f18720c = z ? new C6325d() : null;
        return eVar;
    }

    /* renamed from: d */
    static C6326e m16971d(C6326e eVar, C6326e eVar2) {
        int i = 0;
        C6325d dVar = null;
        C6326e c = m16970c(0, (C6335n) null, false);
        int i2 = eVar != null ? eVar.f18721d : 0;
        if (eVar2 != null) {
            i = eVar2.f18721d;
        }
        List list = c.f18718a;
        C6325d dVar2 = eVar != null ? eVar.f18720c : null;
        if (eVar2 != null) {
            dVar = eVar2.f18720c;
        }
        if (eVar != null) {
            for (C6324c c2 : eVar.f18718a) {
                list.add(C6324c.m16966c(c2));
            }
        }
        if (eVar2 != null) {
            for (C6324c d : eVar2.f18718a) {
                list.add(C6324c.m16967d(d, i2));
            }
        }
        c.f18721d = i2 + i;
        if (dVar2 == null) {
            dVar2 = dVar;
        } else if (dVar != null) {
            dVar2 = dVar2.mo13332a(dVar);
        }
        c.f18720c = dVar2;
        return c;
    }

    /* renamed from: e */
    public static List m16972e(List list, C6381hf hfVar) {
        if (hfVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new C6527ee((C6491cw) list.get(i), hfVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo13336a() {
        return this.f18718a.size();
    }

    /* renamed from: b */
    public final C6324c mo13337b(int i) {
        return (C6324c) this.f18718a.get(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13338f(com.facebook.litho.p329g.C6324c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.List r2 = r0.f18718a
            r2.add(r1)
            int r2 = r1.f18702b
            r3 = -3
            r4 = -1
            r5 = 1
            r6 = 0
            if (r2 == r3) goto L_0x0021
            if (r2 == r4) goto L_0x001e
            if (r2 == r5) goto L_0x001c
            r7 = 3
            if (r2 == r7) goto L_0x001a
            r9 = 0
            goto L_0x0025
        L_0x001a:
            r9 = -1
            goto L_0x0025
        L_0x001c:
            r9 = 1
            goto L_0x0025
        L_0x001e:
            int r7 = r1.f18705e
            goto L_0x0024
        L_0x0021:
            int r7 = r1.f18705e
            int r7 = -r7
        L_0x0024:
            r9 = r7
        L_0x0025:
            int r7 = r0.f18721d
            int r7 = r7 + r9
            r0.f18721d = r7
            com.facebook.litho.g.d r7 = r0.f18720c
            if (r7 == 0) goto L_0x0078
            if (r2 == r3) goto L_0x0062
            r3 = -2
            if (r2 == r3) goto L_0x0059
            if (r2 == r4) goto L_0x0052
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0044
            r1 = 2
            r10 = 0
            r11 = 0
            if (r2 == r1) goto L_0x0040
            r12 = 1
            goto L_0x0057
        L_0x0040:
            r12 = 0
            r13 = 0
            r14 = 1
            goto L_0x0069
        L_0x0044:
            r10 = 1
            r11 = 0
            goto L_0x0056
        L_0x0047:
            int r1 = r1.f18705e
            r16 = r1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x006c
        L_0x0052:
            int r1 = r1.f18705e
            r11 = r1
            r10 = 0
        L_0x0056:
            r12 = 0
        L_0x0057:
            r13 = 0
            goto L_0x0068
        L_0x0059:
            int r1 = r1.f18705e
            r15 = r1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            goto L_0x006a
        L_0x0062:
            int r1 = r1.f18705e
            r13 = r1
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0068:
            r14 = 0
        L_0x0069:
            r15 = 0
        L_0x006a:
            r16 = 0
        L_0x006c:
            com.facebook.litho.g.d r1 = new com.facebook.litho.g.d
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.facebook.litho.g.d r1 = r7.mo13332a(r1)
            r0.f18720c = r1
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.p329g.C6326e.mo13338f(com.facebook.litho.g.c):void");
    }

    /* renamed from: g */
    public final void mo13339g(int i, C6491cw cwVar, C6381hf hfVar, Object obj) {
        C6335n nVar = this.f18719b;
        if (nVar != null) {
            cwVar.mo13535q(nVar.f18740k);
        }
        mo13338f(C6324c.m16965b(1, i, new C6527ee(cwVar, hfVar), (Object) null, obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13340h() {
        for (C6324c cVar : this.f18718a) {
            cVar.f18706f = null;
            cVar.f18707g = null;
            cVar.f18708h = null;
            cVar.f18709i = null;
        }
        this.f18718a.clear();
        this.f18720c = null;
        this.f18721d = 0;
    }

    /* renamed from: i */
    public final void mo13341i(int i, C6491cw cwVar, C6381hf hfVar, Object obj, Object obj2) {
        mo13338f(C6324c.m16965b(2, i, new C6527ee(cwVar, hfVar), obj, obj2));
    }
}
