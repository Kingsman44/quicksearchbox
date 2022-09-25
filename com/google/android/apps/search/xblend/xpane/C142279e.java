package com.google.android.apps.search.xblend.xpane;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.xblend.p10708c.C142271a;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40534c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.xblend.xpane.e */
/* compiled from: PG */
public final class C142279e implements C45987ay, C40534c {

    /* renamed from: c */
    private static final C59071e f385999c = C59071e.m91331h();

    /* renamed from: a */
    public final XPaneActivity f386000a;

    /* renamed from: b */
    public C142272b f386001b;

    /* renamed from: d */
    private final C45989b f386002d;

    public C142279e(XPaneActivity xPaneActivity, C45989b bVar) {
        C69664n.m101061g(bVar, "accountController");
        this.f386000a = xPaneActivity;
        this.f386002d = bVar;
        C142271a aVar = (C142271a) C142272b.f385977e.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        this.f386001b = C69664n.m101061g(aVar, "builder").mo117099a();
        bVar.mo50082e(this);
    }

    /* renamed from: f */
    private final void m231018f(AccountId accountId) {
        C0154a aVar = new C0154a(this.f386000a.f727a.f739a.f744e);
        C142284j jVar = (C142284j) C142286l.f386008e.createBuilder();
        C69664n.m101060f(jVar, "newBuilder()");
        C69664n.m101061g(jVar, "builder");
        C56943g gVar = this.f386001b.f385980b;
        if (gVar == null) {
            gVar = C56943g.f151982f;
        }
        C69664n.m101060f(gVar, "xPaneParams.address");
        C69664n.m101061g(gVar, "value");
        jVar.copyOnWrite();
        C142286l lVar = (C142286l) jVar.instance;
        gVar.getClass();
        lVar.f386011b = gVar;
        lVar.f386010a |= 1;
        boolean z = this.f386001b.f385982d;
        jVar.copyOnWrite();
        C142286l lVar2 = (C142286l) jVar.instance;
        lVar2.f386010a |= 2;
        lVar2.f386012c = z;
        C62942bv build = jVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C142283i iVar = new C142283i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C47243l.m84039a(iVar, (C142286l) build);
        aVar.mo689v(R.id.xblend_xpane_fragment_container_view, iVar, "XPaneFragmentPeer");
        aVar.mo509f();
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C59052c cVar = (C59052c) f385999c.mo56224b();
        cVar.mo56379ah(new C59094n(42047));
        cVar.mo56389s("onAccountChanged %s", awVar);
        if (this.f386001b.f385981c) {
            this.f386000a.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        AccountId accountId = awVar.f120815a.f120816a;
        C69664n.m101060f(accountId, "accountContext.getAccountId()");
        m231018f(accountId);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "reason");
        if (!(th instanceof C46054v) || !(th.getCause() instanceof C32209j)) {
            C59052c cVar = (C59052c) ((C59052c) f385999c.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(42048));
            cVar.mo56386p("Account exception.");
            this.f386000a.finish();
            return;
        }
        this.f386002d.mo50081d(C58485gu.m89846n(C32169d.class));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    /* renamed from: e */
    public final void mo42493e(C56943g gVar, boolean z) {
        C69664n.m101061g(gVar, "xBlendAddress");
        C142271a aVar = (C142271a) this.f386001b.toBuilder();
        aVar.copyOnWrite();
        C142272b bVar = (C142272b) aVar.instance;
        gVar.getClass();
        bVar.f385980b = gVar;
        bVar.f385979a |= 1;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "xPaneParams.toBuilder().…ss(xBlendAddress).build()");
        this.f386001b = (C142272b) build;
        C142283i iVar = (C142283i) this.f386000a.f727a.f739a.f744e.f634a.mo670b(R.id.xblend_xpane_fragment_container_view);
        C142287m f = iVar != null ? iVar.mo17754z() : null;
        if (f == null) {
            throw new IllegalStateException("No XPaneFragment found.");
        } else if (z) {
            C69664n.m101061g(gVar, "xBlendAddress");
            f.f386020g = gVar;
            f.mo117120n(true);
        } else {
            m231018f(f.f386016c);
        }
    }
}
