package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import android.os.Parcelable;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.proactive.C84170f;
import com.google.android.apps.gsa.search.core.p6519al.p6634ca.C85051a;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91432n;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91434p;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91439u;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91406e;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7210e.C91420a;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7212g.C91425b;
import com.google.android.apps.gsa.sidekick.shared.cards.C91678ag;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91833a;
import com.google.android.apps.gsa.sidekick.shared.monet.util.ClientControllerAction;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104461x;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104477m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7693gl;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7851mh;
import com.google.p375ai.p378b.C8025st;
import com.google.p375ai.p378b.C8034tb;
import com.google.p375ai.p378b.C8074uo;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62921ba;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dy */
/* compiled from: PG */
public final class C104638dy extends C104535ac implements C104461x {

    /* renamed from: j */
    private final C104477m f291335j;

    public C104638dy(C23052c cVar, C104477m mVar, C91097g gVar, C85051a aVar, C85142a aVar2, C22871g gVar2, C91434p pVar, C91439u uVar, C91420a aVar3, C91833a aVar4, C91406e eVar, C8142xb xbVar, C86124t tVar, C91417d dVar, C118827a aVar5, C91643a aVar6, C58833ax axVar, C91678ag agVar, C85461a aVar7, C91713a aVar8, C84170f fVar, C91432n nVar, C87334q qVar) {
        super(cVar, mVar, gVar, aVar, aVar2, gVar2, pVar, uVar, aVar3, aVar4, (C91425b) null, eVar, xbVar, tVar, dVar, aVar5, aVar6, axVar, agVar, aVar7, aVar8, fVar, nVar, qVar);
        this.f291335j = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo94235D(String str) {
        ((C104595ci) this.f291335j).f291174c.mo28730f(str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo94240I(C7851mh mhVar) {
        ArrayList arrayList = new ArrayList((Collection) ((C104595ci) this.f291335j).f291177f.f63720e);
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                C7851mh mhVar2 = (C7851mh) C23245b.m43557b((ProtoParcelable) arrayList.get(i), C7851mh.f27519f.getParserForType(), C62921ba.m95368a(), true);
                if (mhVar2 != null && (mhVar2.f27521a & 2) != 0 && (mhVar.f27521a & 2) != 0 && mhVar2.f27524d.equals(mhVar.f27524d)) {
                    arrayList.set(i, C23245b.m43556a(mhVar));
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        ((C104595ci) this.f291335j).f291177f.mo28730f(C58485gu.m89842j(arrayList), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo94242K(C8074uo uoVar) {
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if ("EVENT_ENTRY_CLICK".equals(str)) {
            this.f290762i.mo85746f((ClientControllerAction) parcelable);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C7718hj hjVar;
        C7718hj hjVar2;
        int i = 1;
        C104491ah ahVar = (C104491ah) C23245b.m43557b(protoParcelable, C104491ah.f290608o.getParserForType(), C62921ba.m95368a(), true);
        ahVar.getClass();
        C23251a aVar = ((C104595ci) this.f291335j).f291179h;
        C8025st stVar = ahVar.f290611b;
        if (stVar == null) {
            stVar = C8025st.f28178h;
        }
        aVar.mo28730f(C58833ax.m90834k(C23245b.m43556a(stVar)), false);
        C23251a aVar2 = ((C104595ci) this.f291335j).f291178g;
        C8034tb tbVar = ahVar.f290612c;
        if (tbVar == null) {
            tbVar = C8034tb.f28222f;
        }
        aVar2.mo28730f(C58833ax.m90834k(C23245b.m43556a(tbVar)), false);
        C23251a aVar3 = ((C104595ci) this.f291335j).f291175d;
        C9278v vVar = ahVar.f290613d;
        if (vVar == null) {
            vVar = C9278v.f32165Z;
        }
        aVar3.mo28730f(C58833ax.m90834k(C23245b.m43556a(vVar)), false);
        C23251a aVar4 = ((C104595ci) this.f291335j).f291176e;
        int a = C7693gl.m22807a(ahVar.f290614e);
        if (a != 0) {
            i = a;
        }
        aVar4.mo28730f(Integer.valueOf(i - 1), false);
        ((C104595ci) this.f291335j).f291172a.mo28730f(Integer.valueOf(ahVar.f290622m), false);
        ((C104595ci) this.f291335j).f291180i.mo28730f(Boolean.valueOf(ahVar.f290623n), false);
        C58480gp e = C58485gu.m89837e();
        for (C7851mh a2 : mo94232A()) {
            e.mo55395g(C23245b.m43556a(a2));
        }
        ((C104595ci) this.f291335j).f291177f.mo28730f(e.mo55394f(), false);
        if ((ahVar.f290610a & 64) != 0) {
            ((C104595ci) this.f291335j).f291173b.mo28730f(C58833ax.m90834k(Integer.valueOf(ahVar.f290617h)), false);
        }
        if ((ahVar.f290610a & 128) != 0) {
            ((C104595ci) this.f291335j).f291181j.mo28730f(C58833ax.m90834k(Integer.valueOf(ahVar.f290618i)), false);
        }
        int i2 = ahVar.f290619j;
        int i3 = ahVar.f290621l;
        int i4 = ahVar.f290620k;
        C9278v vVar2 = ahVar.f290613d;
        if (vVar2 == null) {
            vVar2 = C9278v.f32165Z;
        }
        C7718hj hjVar3 = vVar2.f32174H;
        if (hjVar3 == null) {
            hjVar3 = C7718hj.f26927af;
        }
        C7718hj hjVar4 = hjVar3;
        int i5 = ahVar.f290610a;
        if ((i5 & 16) != 0) {
            C7718hj hjVar5 = ahVar.f290615f;
            if (hjVar5 == null) {
                hjVar5 = C7718hj.f26927af;
            }
            hjVar = hjVar5;
        } else {
            hjVar = null;
        }
        if ((i5 & 32) != 0) {
            C7718hj hjVar6 = ahVar.f290616g;
            if (hjVar6 == null) {
                hjVar6 = C7718hj.f26927af;
            }
            hjVar2 = hjVar6;
        } else {
            hjVar2 = null;
        }
        mo94233B(i2, i3, i4, hjVar4, hjVar, hjVar2);
        super.mo94241J();
    }

    /* renamed from: z */
    public final C7718hj mo94246z() {
        ProtoParcelable protoParcelable = (ProtoParcelable) ((C58833ax) ((C104595ci) this.f291335j).f291175d.f63720e).mo56107c();
        if (protoParcelable == null) {
            return null;
        }
        C9278v vVar = (C9278v) C23245b.m43557b(protoParcelable, C9278v.f32165Z.getParserForType(), C62921ba.m95368a(), true);
        vVar.getClass();
        C7718hj hjVar = vVar.f32174H;
        return hjVar == null ? C7718hj.f26927af : hjVar;
    }
}
