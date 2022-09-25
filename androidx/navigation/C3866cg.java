package androidx.navigation;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.cg */
/* compiled from: PG */
final class C3866cg extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C3868ci f12424a;

    /* renamed from: b */
    final /* synthetic */ C3840bh f12425b;

    /* renamed from: c */
    final /* synthetic */ C3864ce f12426c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3866cg(C3868ci ciVar, C3840bh bhVar, C3864ce ceVar) {
        super(1);
        this.f12424a = ciVar;
        this.f12425b = bhVar;
        this.f12426c = ceVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C3825ax b;
        C3892m mVar = (C3892m) obj;
        C69664n.m101061g(mVar, "backStackEntry");
        C3825ax axVar = mVar.f12477b;
        if (true != (axVar instanceof C3825ax)) {
            axVar = null;
        }
        if (axVar == null || (b = this.f12424a.mo8075b(axVar, mVar.f12478c, this.f12425b, this.f12426c)) == null) {
            return null;
        }
        return C69664n.m101066l(b, axVar) ? mVar : this.f12424a.mo8120f().mo8125a(b, b.mo8085c(mVar.f12478c));
    }
}
