package com.google.android.apps.search.googleapp.discover.p10189g;

import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.C6095af;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21284c;
import com.google.android.libraries.elements.interfaces.C21318y;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40062d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40066f;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40075o;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40076p;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40083w;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40303a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57080av;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.p5168d.p5169a.C66184b;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.h */
/* compiled from: PG */
public final class C134337h {

    /* renamed from: e */
    private static final C59071e f365915e = C59071e.m91331h();

    /* renamed from: a */
    public final C134331b f365916a;

    /* renamed from: b */
    public final C135200t f365917b;

    /* renamed from: c */
    public final boolean f365918c;

    /* renamed from: d */
    public C134334e f365919d;

    /* renamed from: f */
    private final C40083w f365920f;

    /* renamed from: g */
    private final C134333d f365921g;

    /* renamed from: h */
    private final C40480q f365922h;

    /* renamed from: i */
    private final C69802a f365923i = new C69802a();

    public C134337h(C134331b bVar, C40083w wVar, C134333d dVar, C40480q qVar, C135200t tVar, boolean z) {
        C69664n.m101061g(qVar, "xUiKitTracer");
        this.f365916a = bVar;
        this.f365920f = wVar;
        this.f365921g = dVar;
        this.f365922h = qVar;
        this.f365917b = tVar;
        this.f365918c = z;
    }

    /* renamed from: a */
    public final void mo111740a(C40027ah ahVar, C40305b bVar, String str, C134766q qVar) {
        C69664n.m101061g(bVar, "xUiKit");
        C69664n.m101061g(str, "sessionId");
        C69664n.m101061g(qVar, "tngDiscoverSurface");
        C134334e eVar = this.f365919d;
        if (eVar != null) {
            eVar.f365905a = ahVar;
        }
        if (eVar != null) {
            eVar.f365906b = bVar;
        }
        if (eVar != null) {
            eVar.f365907c = str;
        }
        if (eVar != null) {
            eVar.f365908d = qVar;
        }
        LithoView lithoView = (LithoView) this.f365916a.getView();
        if (lithoView == null) {
            C59052c cVar = (C59052c) f365915e.mo56226d();
            cVar.mo56379ah(new C59094n(40301));
            cVar.mo56386p("Cannot set view - null fragment view");
            return;
        }
        C40066f j = bVar.mo32551j();
        C57080av avVar = this.f365921g.f365902b;
        if (avVar == null) {
            avVar = C57080av.f152377b;
        }
        C57784p pVar = avVar.f152379a;
        if (pVar == null) {
            pVar = C57784p.f154382f;
        }
        C66184b bVar2 = pVar.f154386c;
        if (bVar2 == null) {
            bVar2 = C66184b.f179967b;
        }
        j.mo42169b(bVar2);
        C40062d i = bVar.mo32550i();
        C57080av avVar2 = this.f365921g.f365902b;
        if (avVar2 == null) {
            avVar2 = C57080av.f152377b;
        }
        C57784p pVar2 = avVar2.f152379a;
        if (pVar2 == null) {
            pVar2 = C57784p.f154382f;
        }
        C57776h hVar = pVar2.f154387d;
        if (hVar == null) {
            hVar = C57776h.f154365b;
        }
        i.mo42164a(hVar);
        C6411u uVar = lithoView.f17940p;
        C40303a aVar = (C40303a) C40306b.f105885a.createBuilder();
        C62940bt btVar = C134589g.f366529e;
        C134589g gVar = this.f365921g.f365903c;
        if (gVar == null) {
            gVar = C134589g.f366528d;
        }
        aVar.mo58885m(btVar, gVar);
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…Context)\n        .build()");
        C40306b bVar3 = (C40306b) build;
        C21318y B = C21319z.m40292B();
        ((C21284c) B).f59603a = lithoView;
        B.mo26841r(false);
        C21319z p = B.mo26839p();
        C21249as e = bVar.mo32546e();
        C57080av avVar3 = this.f365921g.f365902b;
        if (avVar3 == null) {
            avVar3 = C57080av.f152377b;
        }
        C57784p pVar3 = avVar3.f152379a;
        if (pVar3 == null) {
            pVar3 = C57784p.f154382f;
        }
        C63070h hVar2 = pVar3.f154385b;
        if (hVar2 == null) {
            hVar2 = C63070h.f170215c;
        }
        byte[] N = hVar2.f170218b.mo59174N();
        C40083w wVar = this.f365920f;
        C40075o c = C40076p.m69597c();
        c.mo42068b(bVar3);
        C6095af b = ComponentTree.m15673b(uVar, e.mo26712b(uVar, p, N, wVar.mo42171a(c.mo42067a(), this.f365922h, ahVar, new C134335f(this, str, qVar)), this.f365923i));
        b.f18000f = bVar.mo32543a();
        b.f17998d = false;
        lithoView.mo12729B(b.mo12841a());
        ViewParent parent = lithoView.getParent();
        C69664n.m101059e(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior C = BottomSheetBehavior.m78767C((View) parent);
        C69664n.m101060f(C, "from(lithoView.parent as View)");
        lithoView.f17943s = new C134336g(this, lithoView, C);
    }
}
