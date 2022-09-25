package com.google.android.apps.search.googleapp.tabs.manager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10117aa.C133103au;
import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.tabs.manager.p10525b.C139733b;
import com.google.android.apps.search.googleapp.tabs.manager.p10525b.C139734c;
import com.google.android.apps.search.googleapp.tabs.manager.p10526c.C139736a;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139711c;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.dataservice.p3638c.C46752i;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63033ey;
import com.google.protobuf.C63077o;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ac */
/* compiled from: PG */
public final class C139720ac implements C139761b, C139768i {

    /* renamed from: A */
    private static final C63033ey f379765A = C63033ey.m95859a("should_ignore_source_on_back_press");

    /* renamed from: a */
    public static final C63033ey f379766a = C63033ey.m95859a("should_maintain_scroll_on_next_load");

    /* renamed from: b */
    public static final C59071e f379767b = C59071e.m91332i("com.google.android.apps.search.googleapp.tabs.manager.ac");

    /* renamed from: z */
    private static final C58495hd f379768z;

    /* renamed from: B */
    private final C133411h f379769B;

    /* renamed from: c */
    public final C139746m f379770c;

    /* renamed from: d */
    public final AccountId f379771d;

    /* renamed from: e */
    public final C139748o f379772e;

    /* renamed from: f */
    public final C133103au f379773f;

    /* renamed from: g */
    public final C133081f f379774g;

    /* renamed from: h */
    public final C46855i f379775h;

    /* renamed from: i */
    public final C47770dh f379776i;

    /* renamed from: j */
    public final C139733b f379777j;

    /* renamed from: k */
    public final C46439e f379778k;

    /* renamed from: l */
    public final C139795f f379779l;

    /* renamed from: m */
    public final C28306ab f379780m;

    /* renamed from: n */
    public final C28443m f379781n;

    /* renamed from: o */
    public final C133118a f379782o;

    /* renamed from: p */
    public final C47477n f379783p;

    /* renamed from: q */
    public final C139736a f379784q;

    /* renamed from: r */
    public final boolean f379785r;

    /* renamed from: s */
    public final C136370a f379786s;

    /* renamed from: t */
    public final boolean f379787t;

    /* renamed from: u */
    public final boolean f379788u;

    /* renamed from: v */
    public final C46756m f379789v = new C139719ab(this);

    /* renamed from: w */
    public final C46755l f379790w;

    /* renamed from: x */
    public final C46440f f379791x;

    /* renamed from: y */
    public final C46401p f379792y;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C139711c.GOOGLE_APP_BROWSER, C139779t.GOOGLE_APP_BROWSER);
        f379768z = gzVar.mo55427f(false);
    }

    public C139720ac(C139746m mVar, AccountId accountId, C139748o oVar, InstanceStateStoreFactory instanceStateStoreFactory, C133103au auVar, C133081f fVar, C46855i iVar, C47770dh dhVar, C139733b bVar, C46439e eVar, C139795f fVar2, C28306ab abVar, C28443m mVar2, C133118a aVar, C133411h hVar, C47477n nVar, C139736a aVar2, boolean z, C136370a aVar3, boolean z2, boolean z3) {
        C46753j jVar = new C46753j();
        jVar.f122102a = new C139754u(this);
        jVar.mo50771b(C139755v.f379860a);
        jVar.f122103b = new C46752i();
        this.f379790w = jVar.mo50770a();
        this.f379791x = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                String str = (String) obj;
                ((C59052c) ((C59052c) ((C59052c) C139720ac.f379767b.mo56225c()).mo56382g(th)).mo56372aa(41411)).mo56386p("Failed to get the browser Intent.");
            }

            /* renamed from: d */
            public final void mo18067c(String str, Intent intent) {
                if (intent == null) {
                    C139795f fVar = C139720ac.this.f379779l;
                    Uri parse = Uri.parse(str);
                    C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
                    C139851q qVar = C139851q.TABS_MANAGER;
                    iVar.copyOnWrite();
                    C139823j jVar = (C139823j) iVar.instance;
                    jVar.f380069b = qVar.f380143m;
                    jVar.f380068a = 1 | jVar.f380068a;
                    fVar.mo115250a(parse, (C139823j) iVar.build());
                    return;
                }
                C139720ac acVar = C139720ac.this;
                if (!acVar.f379772e.f379853c || !acVar.f379786s.mo112949a()) {
                    try {
                        C47810es.m84979s(C139720ac.this.f379770c.requireContext(), intent);
                    } catch (ActivityNotFoundException e) {
                        ((C59052c) ((C59052c) ((C59052c) C139720ac.f379767b.mo56225c()).mo56382g(e)).mo56372aa(41412)).mo56386p("Unable to launch the browser intent.");
                    }
                } else {
                    C139720ac acVar2 = C139720ac.this;
                    C135459e eVar = (C135459e) C135458d.m219648a(intent).toBuilder();
                    eVar.copyOnWrite();
                    C135462h hVar = (C135462h) eVar.instance;
                    hVar.f369061a |= 128;
                    hVar.f369069i = true;
                    C135462h hVar2 = (C135462h) eVar.build();
                    C139765f fVar2 = (C139765f) C139767h.f379869k.createBuilder();
                    C139779t tVar = C139779t.GOOGLE_APP_BROWSER;
                    fVar2.copyOnWrite();
                    C139767h hVar3 = (C139767h) fVar2.instance;
                    hVar3.f379872b = tVar.f379907i;
                    hVar3.f379871a |= 1;
                    boolean z = acVar2.f379787t;
                    fVar2.copyOnWrite();
                    C139767h hVar4 = (C139767h) fVar2.instance;
                    hVar4.f379871a |= 2;
                    hVar4.f379873c = !z;
                    String str2 = hVar2.f369065e;
                    fVar2.copyOnWrite();
                    C139767h hVar5 = (C139767h) fVar2.instance;
                    str2.getClass();
                    hVar5.f379871a |= 128;
                    hVar5.f379880j = str2;
                    C139769j jVar2 = (C139769j) C139770k.f379882c.createBuilder();
                    jVar2.copyOnWrite();
                    C139770k kVar = (C139770k) jVar2.instance;
                    hVar2.getClass();
                    kVar.f379885b = hVar2;
                    kVar.f379884a = 4;
                    C139770k kVar2 = (C139770k) jVar2.build();
                    fVar2.copyOnWrite();
                    C139767h hVar6 = (C139767h) fVar2.instance;
                    kVar2.getClass();
                    hVar6.f379877g = kVar2;
                    hVar6.f379871a |= 16;
                    C139760a aVar = new C139760a((C139767h) fVar2.build());
                    C139746m mVar = C139720ac.this.f379770c;
                    mVar.getClass();
                    C47393f.m84236g(aVar, mVar);
                }
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
            }
        };
        this.f379770c = mVar;
        this.f379771d = accountId;
        this.f379772e = oVar;
        this.f379773f = auVar;
        this.f379774g = fVar;
        this.f379775h = iVar;
        this.f379776i = dhVar;
        this.f379777j = bVar;
        this.f379778k = eVar;
        this.f379779l = fVar2;
        this.f379780m = abVar;
        this.f379781n = mVar2;
        this.f379782o = aVar;
        this.f379769B = hVar;
        this.f379783p = nVar;
        this.f379784q = aVar2;
        this.f379785r = z;
        this.f379786s = aVar3;
        this.f379787t = z2;
        this.f379788u = z3;
        InstanceStateStoreFactory instanceStateStoreFactory2 = instanceStateStoreFactory;
        this.f379792y = instanceStateStoreFactory.mo50325a("boolean_instance_state_store", C63077o.f170228b);
    }

    /* renamed from: a */
    public static C139746m m227166a(AccountId accountId, C139748o oVar) {
        C139746m mVar = new C139746m();
        C68324h.m98669f(mVar);
        C47247a.m84047b(mVar, accountId);
        C47243l.m84039a(mVar, oVar);
        return mVar;
    }

    /* renamed from: b */
    public final void mo111219b(C139779t tVar) {
        mo115199m();
    }

    /* renamed from: c */
    public final void mo111220c(C139775p pVar) {
        this.f379769B.mo111132a(true);
    }

    /* renamed from: d */
    public final void mo111221d() {
        RecyclerView recyclerView = (RecyclerView) this.f379770c.requireView().findViewById(R.id.googleapp_tabs_manager_recycler);
        recyclerView.setItemAnimator(new C139724af());
        if (recyclerView != null) {
            recyclerView.scrollToPosition(this.f379790w.getItemCount() - 1);
        }
        mo115198l(false);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111222e() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo111223f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C46370ah a = this.f379792y.mo50378a(f379765A);
        if (a != null && ((C63077o) a.f121384a).f170230a) {
            return false;
        }
        C139748o oVar = this.f379772e;
        if (!oVar.f379853c) {
            return false;
        }
        C139712d dVar = oVar.f379852b;
        if (dVar == null) {
            dVar = C139712d.f379748d;
        }
        C139711c a2 = C139711c.m227153a(dVar.f379751b);
        if (a2 == null) {
            a2 = C139711c.UNKNOWN;
        }
        C58495hd hdVar = f379768z;
        if (!hdVar.containsKey(a2)) {
            return false;
        }
        C139779t tVar = (C139779t) hdVar.getOrDefault(a2, C139779t.HOME_SCREEN);
        if (tVar == C139779t.GOOGLE_APP_BROWSER && !this.f379786s.mo112949a()) {
            return false;
        }
        C47393f.m84236g(C139762c.m227230b(tVar), this.f379770c);
        return true;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo111225h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo111226i() {
        return true;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo111227j() {
        return true;
    }

    /* renamed from: k */
    public final void mo115197k(Optional optional) {
        if (this.f379772e.f379853c) {
            C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar = C139779t.SEARCH;
            fVar.copyOnWrite();
            C139767h hVar = (C139767h) fVar.instance;
            hVar.f379872b = tVar.f379907i;
            hVar.f379871a |= 1;
            fVar.copyOnWrite();
            C139767h hVar2 = (C139767h) fVar.instance;
            hVar2.f379871a |= 2;
            hVar2.f379873c = true;
            optional.ifPresent(new C139753t(fVar));
            C47393f.m84237h(new C139760a((C139767h) fVar.build()), this.f379770c.requireView());
        } else if (optional.isPresent()) {
            C133125j jVar = (C133125j) optional.get();
            Context context = this.f379770c.getContext();
            String str = jVar.f362924d;
            String str2 = jVar.f362925e;
            if (!C58837ba.m90859h(str)) {
                C136128i a = C139734c.m227200a();
                C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                eVar.copyOnWrite();
                C137418g gVar = (C137418g) eVar.instance;
                str.getClass();
                gVar.f373769a = 1 | gVar.f373769a;
                gVar.f373770b = str;
                a.mo112775j(Optional.m71637of((C137418g) eVar.build()));
                a.mo112772g(Optional.m71637of(str2));
                C139734c.m227201b(context, a.mo112766a());
            }
        } else {
            C139734c.m227201b(this.f379770c.getContext(), C139734c.m227200a().mo112766a());
        }
    }

    /* renamed from: l */
    public final void mo115198l(boolean z) {
        this.f379792y.mo50381d(f379766a, C63077o.m96099a(z));
    }

    /* renamed from: m */
    public final void mo115199m() {
        this.f379792y.mo50381d(f379765A, C63077o.m96099a(true));
    }
}
