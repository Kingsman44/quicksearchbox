package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f.C104852a;
import com.google.android.apps.p489g.p494d.C9203cl;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.p2460r.p2469c.C32086aq;
import com.google.android.libraries.p2460r.p2469c.C32145w;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57436dg;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57440dk;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.aa */
/* compiled from: PG */
public final class C104858aa extends C104348l {

    /* renamed from: y */
    public static final C59071e f292218y = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.f.aa");

    /* renamed from: A */
    public C32145w f292219A;

    /* renamed from: B */
    public int f292220B = 0;

    /* renamed from: C */
    private final C58881cr f292221C;

    /* renamed from: D */
    private final C104859ab f292222D;

    /* renamed from: E */
    private final C104891q f292223E;

    /* renamed from: F */
    private C104899y f292224F;

    /* renamed from: G */
    private final C32086aq f292225G;

    /* renamed from: H */
    private final C104898x f292226H;

    /* renamed from: z */
    final C32058a f292227z;

    public C104858aa(Context context, C104350n nVar, C58881cr crVar, C104859ab abVar, C32086aq aqVar) {
        super(context, nVar);
        this.f292221C = crVar;
        this.f292222D = abVar;
        this.f292225G = aqVar;
        C104350n nVar2 = this.f290314i;
        this.f292227z = new C104900z(this, context, nVar2.f290331a);
        this.f292226H = nVar2.f290347q ? new C104898x(this.f290312g) : null;
        this.f292223E = new C104891q();
    }

    /* renamed from: M */
    private final View m173833M() {
        C32145w a = this.f292225G.mo37865a(new C104896v(this), this.f292227z, this.f292223E, this.f290307b, this.f292226H);
        this.f292219A = a;
        return a.mo37954a();
    }

    /* renamed from: I */
    public final void mo94110I(C104852a aVar) {
        C9278v vVar = aVar.f292195a;
        if (vVar instanceof C9278v) {
            mo94126s(vVar);
            C104891q qVar = this.f292223E;
            C7718hj hjVar = vVar.f32174H;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            C7746ik a = C7746ik.m22834a(hjVar.f26966g);
            if (a == null) {
                a = C7746ik.UNKNOWN;
            }
            qVar.f292295a = a;
            mo94020e();
        }
        if (this.f290314i.f290344n.mo56113h() && this.f292224F == null) {
            C104899y yVar = new C104899y(this.f292219A);
            this.f292224F = yVar;
            ((C91825b) this.f290314i.f290344n.mo56107c()).mo86302a(yVar);
        }
    }

    /* renamed from: L */
    public final C7718hj mo94381L() {
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & LinearLayoutManager.INVALID_OFFSET) == 0) {
            return null;
        }
        C7718hj hjVar = vVar.f32174H;
        return hjVar == null ? C7718hj.f26927af : hjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return m173833M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return m173833M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        C7669fo foVar;
        C104859ab abVar = this.f292222D;
        C7718hj hjVar = this.f290310e.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26955a & 4) != 0) {
            C7718hj hjVar2 = this.f290310e.f32174H;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            foVar = hjVar2.f26968i;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
        } else {
            foVar = null;
        }
        if (foVar != null) {
            abVar.f292228a.put(foVar, this);
        }
        ArrayList arrayList = new ArrayList();
        C9203cl clVar = this.f290310e.f32218y;
        if (clVar == null) {
            clVar = C9203cl.f31796e;
        }
        for (C7669fo foVar2 : clVar.f31801d) {
            C57440dk dkVar = (C57440dk) ((C58495hd) this.f292221C.mo6453a()).getOrDefault(foVar2, (Object) null);
            if (dkVar != null) {
                arrayList.add(dkVar);
            } else {
                this.f292223E.mo37848a(C58485gu.m89846n(C57404cb.ERR_MISSING_SHARED_STATE));
                C59104x c = f292218y.mo56225c();
                c.mo56378ag(C58975e.f156826a, "PietPresenter");
                ((C59052c) ((C59052c) c).mo56372aa(22065)).mo56389s("Missing shared state for content id=%s", foVar2);
            }
        }
        C9203cl clVar2 = this.f290310e.f32218y;
        if (clVar2 == null) {
            clVar2 = C9203cl.f31796e;
        }
        C57438di diVar = clVar2.f31799b;
        if (diVar == null) {
            diVar = C57438di.f153417i;
        }
        C32145w wVar = this.f292219A;
        int i = this.f292220B;
        C9203cl clVar3 = this.f290310e.f32218y;
        if (((clVar3 == null ? C9203cl.f31796e : clVar3).f31798a & 2) != 0) {
            if (clVar3 == null) {
                clVar3 = C9203cl.f31796e;
            }
            if (clVar3.f31800c == null) {
                C57436dg dgVar = C57436dg.f153415a;
            }
        }
        wVar.mo37957d(diVar, i, arrayList);
    }

    /* renamed from: q */
    public final void mo94036q() {
        C7669fo foVar;
        C104859ab abVar = this.f292222D;
        C7718hj hjVar = this.f290310e.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26955a & 4) != 0) {
            C7718hj hjVar2 = this.f290310e.f32174H;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            foVar = hjVar2.f26968i;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
        } else {
            foVar = null;
        }
        if (foVar != null) {
            abVar.f292228a.remove(foVar);
        }
        super.mo94036q();
        this.f292219A.mo37956c();
        C104899y yVar = this.f292224F;
        if (yVar != null) {
            ((C91825b) this.f290314i.f290344n.mo56107c()).mo86304c(yVar);
            this.f292224F = null;
        }
    }
}
