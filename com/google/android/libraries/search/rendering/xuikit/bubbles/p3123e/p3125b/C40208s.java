package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40258l;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40108a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a.C40186d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a.C40187e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a.C40190h;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40221d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40532a;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40537f;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40538g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57817n;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s */
/* compiled from: PG */
public final class C40208s implements C40538g, C40532a {

    /* renamed from: a */
    public static final C59071e f105639a = C59071e.m91331h();

    /* renamed from: b */
    public final C40206q f105640b;

    /* renamed from: c */
    public final AccountId f105641c;

    /* renamed from: d */
    public final C40203n f105642d;

    /* renamed from: e */
    public final Optional f105643e;

    /* renamed from: f */
    public final C46801dp f105644f;

    /* renamed from: g */
    public final C40190h f105645g;

    /* renamed from: h */
    public final C40364q f105646h;

    /* renamed from: i */
    public final C47477n f105647i;

    /* renamed from: j */
    public final C40358k f105648j;

    /* renamed from: k */
    public C28439i f105649k;

    /* renamed from: l */
    public C56943g f105650l;

    /* renamed from: m */
    public final C40111d f105651m;

    /* renamed from: n */
    public final C40258l f105652n;

    /* renamed from: o */
    private final C40358k f105653o;

    /* renamed from: p */
    private final C40182a f105654p;

    /* renamed from: q */
    private final C57695ab f105655q;

    public C40208s(C40206q qVar, AccountId accountId, C40203n nVar, Optional optional, C46801dp dpVar, C40190h hVar, C40364q qVar2, C40358k kVar, C40182a aVar, C40258l lVar, C47477n nVar2) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(optional, "authTokenProviderOptional");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(qVar2, "logMetadataFactory");
        C69664n.m101061g(kVar, "applicationLevelCounters");
        C69664n.m101061g(aVar, "bubbleDataStoreManager");
        C69664n.m101061g(lVar, "bubblesModelManager");
        this.f105640b = qVar;
        this.f105641c = accountId;
        this.f105642d = nVar;
        this.f105643e = optional;
        this.f105644f = dpVar;
        this.f105645g = hVar;
        this.f105646h = qVar2;
        this.f105653o = kVar;
        this.f105654p = aVar;
        this.f105652n = lVar;
        this.f105647i = nVar2;
        C57695ab abVar = C57695ab.XBLEND_BUBBLES_ANDROID;
        this.f105655q = abVar;
        this.f105648j = kVar.mo42414a(abVar);
        this.f105651m = new C40108a(qVar.f105634b);
    }

    /* renamed from: i */
    public static final ProgressBar m69816i(View view) {
        return (ProgressBar) view.findViewById(R.id.xbubble_fragment_loading_indicator);
    }

    /* renamed from: j */
    static /* synthetic */ void m69817j(C40208s sVar) {
        View requireView = sVar.f105642d.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        ProgressBar i = m69816i(requireView);
        if (i != null) {
            i.setVisibility(8);
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m69818l(C40208s sVar) {
        View requireView = sVar.f105642d.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        View a = sVar.mo42312a();
        if (a != null) {
            a.setVisibility(8);
        }
        View findViewById = requireView.findViewById(R.id.xbubble_fragment_indicators_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = requireView.findViewById(R.id.xbubble_fragment_error_message);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final View mo42312a() {
        C40537f b = mo42313b();
        if (b != null) {
            return b.requireView();
        }
        return null;
    }

    /* renamed from: b */
    public final C40537f mo42313b() {
        Fragment c = this.f105642d.getChildFragmentManager().f634a.mo671c("XBlendFragment");
        if (c instanceof C40537f) {
            return (C40537f) c;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo42314c() {
        C40221d a = this.f105652n.mo42357a(this.f105651m);
        if (a != null) {
            a.mo42328a(1);
        }
    }

    /* renamed from: d */
    public final void mo42315d() {
        C40221d a = this.f105652n.mo42357a(this.f105651m);
        if (a != null) {
            a.mo42328a(2);
        }
    }

    /* renamed from: e */
    public final C46689ag mo42316e() {
        int a = C40195f.m69792a(this.f105640b.f105637e);
        if (a != 0 && a == 2) {
            return this.f105645g.mo42303a(this.f105651m, C40186d.f105571a);
        }
        return this.f105645g.mo42303a(this.f105651m, C40187e.f105572a);
    }

    /* renamed from: f */
    public final C57695ab mo42317f() {
        return this.f105655q;
    }

    /* renamed from: g */
    public final Optional mo42318g() {
        C40182a aVar = this.f105654p;
        C21232ab abVar = (C21232ab) aVar.f105562b.get(this.f105651m);
        if (abVar == null) {
            C59052c cVar = (C59052c) f105639a.mo56225c();
            cVar.mo56379ah(new C59094n(53285));
            cVar.mo56386p("A Bubble is set-up without shared datastore");
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            return empty;
        }
        Optional of = Optional.m71637of(abVar);
        C69664n.m101060f(of, "of(dataStore)");
        return of;
    }

    /* renamed from: h */
    public final Optional mo42319h() {
        Optional ofNullable = Optional.ofNullable(this.f105649k);
        C69664n.m101060f(ofNullable, "ofNullable(parentClientVisualElement)");
        return ofNullable;
    }

    /* renamed from: k */
    public final /* synthetic */ void mo42320k(C57817n nVar) {
        C69664n.m101061g(nVar, "xBlendNewVeTreeLoggingMetadata");
    }
}
