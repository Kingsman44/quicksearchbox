package androidx.constraintlayout.p079a.p082b.p083a;

import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b.a.n */
/* compiled from: PG */
final class C1629n {

    /* renamed from: a */
    public static int f4526a;

    /* renamed from: b */
    C1633r f4527b = null;

    /* renamed from: c */
    final ArrayList f4528c = new ArrayList();

    public C1629n(C1633r rVar) {
        f4526a++;
        this.f4527b = rVar;
    }

    /* renamed from: a */
    public final long mo4588a(C1622g gVar, long j) {
        C1633r rVar = gVar.f4512d;
        if (rVar instanceof C1627l) {
            return j;
        }
        int size = gVar.f4518j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C1620e eVar = (C1620e) gVar.f4518j.get(i);
            if (eVar instanceof C1622g) {
                C1622g gVar2 = (C1622g) eVar;
                if (gVar2.f4512d != rVar) {
                    j2 = Math.min(j2, mo4588a(gVar2, ((long) gVar2.f4513e) + j));
                }
            }
        }
        if (gVar != rVar.f4545k) {
            return j2;
        }
        long a = j - rVar.mo4570a();
        return Math.min(Math.min(j2, mo4588a(rVar.f4544j, a)), a - ((long) rVar.f4544j.f4513e));
    }

    /* renamed from: b */
    public final long mo4589b(C1622g gVar, long j) {
        C1633r rVar = gVar.f4512d;
        if (rVar instanceof C1627l) {
            return j;
        }
        int size = gVar.f4518j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C1620e eVar = (C1620e) gVar.f4518j.get(i);
            if (eVar instanceof C1622g) {
                C1622g gVar2 = (C1622g) eVar;
                if (gVar2.f4512d != rVar) {
                    j2 = Math.max(j2, mo4589b(gVar2, ((long) gVar2.f4513e) + j));
                }
            }
        }
        if (gVar != rVar.f4544j) {
            return j2;
        }
        long a = j + rVar.mo4570a();
        return Math.max(Math.max(j2, mo4589b(rVar.f4545k, a)), a - ((long) rVar.f4545k.f4513e));
    }
}
