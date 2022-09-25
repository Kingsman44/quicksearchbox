package androidx.navigation;

import java.util.Iterator;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5482l.C69731k;

/* renamed from: androidx.navigation.u */
/* compiled from: PG */
final class C3900u extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C3825ax f12495a;

    /* renamed from: b */
    final /* synthetic */ C3807af f12496b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3900u(C3825ax axVar, C3807af afVar) {
        super(1);
        this.f12495a = axVar;
        this.f12496b = afVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C3825ax f;
        C69731k c;
        C3841bi biVar = (C3841bi) obj;
        C69664n.m101061g(biVar, "$this$navOptions");
        C3898s sVar = C3898s.f12493a;
        C3875e eVar = new C3875e();
        sVar.mo5761a(eVar);
        C3839bg bgVar = biVar.f12399a;
        bgVar.f12383c = eVar.f12444a;
        bgVar.f12384d = eVar.f12445b;
        bgVar.f12385e = -1;
        bgVar.f12386f = -1;
        if ((this.f12495a instanceof C3834bb) && (f = this.f12496b.mo8046f()) != null && (c = C3823av.m11045c(f)) != null) {
            C3825ax axVar = this.f12495a;
            Iterator a = c.mo5191a();
            while (true) {
                if (a.hasNext()) {
                    if (C69664n.m101066l((C3825ax) a.next(), axVar)) {
                        break;
                    }
                } else {
                    int i = C3834bb.f12373m;
                    int i2 = C3827az.m11055a(this.f12496b.mo8047g()).f12360i;
                    C3899t tVar = C3899t.f12494a;
                    biVar.f12401c = i2;
                    biVar.f12402d = false;
                    C3872cm cmVar = new C3872cm();
                    tVar.mo5761a(cmVar);
                    biVar.f12402d = false;
                    biVar.f12403e = cmVar.f12438a;
                    break;
                }
            }
        }
        return C69788q.f186170a;
    }
}
