package com.google.android.apps.search.googleapp.discover.p10189g;

import android.content.Context;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0358as;
import com.facebook.litho.C6095af;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134463a;
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
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40341d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.p5168d.p5169a.C66184b;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.p */
/* compiled from: PG */
public final class C134345p implements C134463a {

    /* renamed from: a */
    public static final C59071e f365937a = C59071e.m91331h();

    /* renamed from: b */
    public final Fragment f365938b;

    /* renamed from: c */
    public final C69464a f365939c;

    /* renamed from: d */
    public final C47770dh f365940d;

    /* renamed from: e */
    public final C135200t f365941e;

    /* renamed from: f */
    public final AccountId f365942f;

    /* renamed from: g */
    public final boolean f365943g;

    /* renamed from: h */
    public final C134766q f365944h;

    /* renamed from: i */
    public C0358as f365945i;

    /* renamed from: j */
    private final C40083w f365946j;

    /* renamed from: k */
    private final C40480q f365947k;

    public C134345p(Fragment fragment, C40083w wVar, C69464a aVar, C40480q qVar, C47770dh dhVar, C135200t tVar, AccountId accountId, boolean z, C134766q qVar2) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(aVar, "xUiKitProvider");
        C69664n.m101061g(qVar, "xUiKitTracer");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(qVar2, "tngDiscoverSurface");
        this.f365938b = fragment;
        this.f365946j = wVar;
        this.f365939c = aVar;
        this.f365947k = qVar;
        this.f365940d = dhVar;
        this.f365941e = tVar;
        this.f365942f = accountId;
        this.f365943g = z;
        this.f365944h = qVar2;
    }

    /* renamed from: a */
    public final LithoView mo111747a(Context context, C57784p pVar, C40027ah ahVar, C134589g gVar, C69802a aVar) {
        LithoView lithoView = new LithoView(context);
        Object b = this.f365939c.mo17428b();
        C69664n.m101060f(b, "xUiKitProvider.get()");
        C40305b bVar = (C40305b) b;
        C40066f j = bVar.mo32551j();
        C66184b bVar2 = pVar.f154386c;
        if (bVar2 == null) {
            bVar2 = C66184b.f179967b;
        }
        j.mo42169b(bVar2);
        C40062d i = bVar.mo32550i();
        C57776h hVar = pVar.f154387d;
        if (hVar == null) {
            hVar = C57776h.f154365b;
        }
        i.mo42164a(hVar);
        C6411u uVar = lithoView.f17940p;
        C40303a aVar2 = (C40303a) C40306b.f105885a.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C40341d a = C69664n.m101061g(aVar2, "builder");
        C62940bt btVar = C134589g.f366529e;
        C69664n.m101060f(btVar, "discoverClientContext");
        a.mo42405b(btVar, gVar);
        C40306b a2 = a.mo42404a();
        C21318y B = C21319z.m40292B();
        ((C21284c) B).f59603a = lithoView;
        B.mo26841r(false);
        C21319z p = B.mo26839p();
        C21249as e = bVar.mo32546e();
        C63070h hVar2 = pVar.f154385b;
        if (hVar2 == null) {
            hVar2 = C63070h.f170215c;
        }
        byte[] N = hVar2.f170218b.mo59174N();
        C40083w wVar = this.f365946j;
        C40075o c = C40076p.m69597c();
        c.mo42068b(a2);
        C6095af b2 = ComponentTree.m15673b(uVar, e.mo26712b(uVar, p, N, wVar.mo42171a(c.mo42067a(), this.f365947k, ahVar, new C134341l(this, gVar)), aVar));
        b2.f18000f = bVar.mo32543a();
        b2.f17998d = false;
        lithoView.mo12729B(b2.mo12841a());
        return lithoView;
    }

    /* renamed from: b */
    public final void mo111748b() {
        C0260w wVar = (C0260w) this.f365938b.getChildFragmentManager().f634a.mo671c("BottomSheetDialogFragment");
        if (wVar != null) {
            wVar.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo111749c() {
        C0358as asVar = this.f365945i;
        if (asVar != null && asVar.isShowing()) {
            C0358as asVar2 = this.f365945i;
            C69664n.m101058d(asVar2);
            asVar2.dismiss();
        }
        this.f365945i = null;
    }

    /* renamed from: g */
    public final void mo111496g() {
        mo111749c();
        mo111748b();
    }

    /* renamed from: h */
    public final void mo111497h() {
    }
}
