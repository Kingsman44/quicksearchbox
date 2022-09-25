package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.view.View;
import androidx.lifecycle.C2384o;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.exithandler.ExitHandler;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129722e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.C129745a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129748c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129836c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129840g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129841h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129842i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128556m;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128560a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.web.base.C43264o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.p3926e.C51843bd;
import com.google.assistant.p3897e.p3921j.p3926e.C51858bs;
import com.google.assistant.p3897e.p3921j.p3926e.C51859bt;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60901do;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8406v;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.aa */
/* compiled from: PG */
public final class C129739aa {

    /* renamed from: a */
    public static final C59071e f356023a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.aa");

    /* renamed from: q */
    private static final Duration f356024q = Duration.ofMinutes(2);

    /* renamed from: b */
    public final C129787g f356025b;

    /* renamed from: c */
    public final C127120a f356026c;

    /* renamed from: d */
    public final C129566ah f356027d;

    /* renamed from: e */
    public final AccountId f356028e;

    /* renamed from: f */
    public final C58495hd f356029f;

    /* renamed from: g */
    public final C129748c f356030g;

    /* renamed from: h */
    public final C129745a f356031h;

    /* renamed from: i */
    public final C46855i f356032i;

    /* renamed from: j */
    public final C128560a f356033j;

    /* renamed from: k */
    public final C2384o f356034k;

    /* renamed from: l */
    public final ExitHandler f356035l;

    /* renamed from: m */
    public final C21370a f356036m;

    /* renamed from: n */
    public ImmersiveCanvasViewModel f356037n;

    /* renamed from: o */
    public final C128556m f356038o;

    /* renamed from: p */
    public final C129722e f356039p;

    public C129739aa(C129566ah ahVar, AccountId accountId, C129787g gVar, Map map, C127120a aVar, C129748c cVar, C129722e eVar, C129745a aVar2, C46855i iVar, C128556m mVar, C2384o oVar, C128560a aVar3, C129540c cVar2, C46439e eVar2, C127118j jVar, C21370a aVar4) {
        this.f356028e = accountId;
        this.f356025b = gVar;
        this.f356027d = ahVar;
        this.f356026c = aVar;
        this.f356029f = C58495hd.m89898l(map);
        this.f356030g = cVar;
        this.f356039p = eVar;
        this.f356031h = aVar2;
        this.f356032i = iVar;
        this.f356038o = mVar;
        this.f356033j = aVar3;
        this.f356034k = oVar;
        this.f356035l = new ExitHandler(cVar2, eVar2, jVar);
        this.f356036m = aVar4;
    }

    /* renamed from: b */
    public static C52070ec m211808b(C51885cs csVar, C129836c cVar) {
        C51858bs bsVar;
        Optional optional;
        C51843bd bdVar = C51843bd.APPLICATION_URL;
        String str = null;
        if (C51843bd.m86399a(csVar.f136083b).ordinal() == 0) {
            CanvasWebAppFragmentPeer a = cVar.mo17754z();
            String str2 = csVar.f136083b == 1 ? (String) csVar.f136084c : BuildConfig.FLAVOR;
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38495)).mo56389s("setUrl: %s", str2);
            if (!str2.equals(((C129842i) a.f356162p.get()).f356240b)) {
                if (((C129842i) a.f356162p.get()).mo109290a() == C129841h.LOADED) {
                    ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38496)).mo56386p("New application URL is different from the currently loaded one. Re-initializing web app.");
                    a.mo109271f(a.mo109269b());
                }
                C129842i iVar = (C129842i) a.f356162p.get();
                iVar.f356239a.set(C129841h.HAS_CONTENT);
                iVar.f356240b = str2;
                CanvasWebAppFragmentPeer canvasWebAppFragmentPeer = iVar.f356241c;
                canvasWebAppFragmentPeer.f356164r = canvasWebAppFragmentPeer.f356165s.mo29164d(C60901do.f165001a, CanvasWebAppFragmentPeer.f356146c.toMillis(), TimeUnit.MILLISECONDS);
                CanvasWebAppFragmentPeer canvasWebAppFragmentPeer2 = iVar.f356241c;
                canvasWebAppFragmentPeer2.f356154h.mo50428h(C46438d.m82810b(canvasWebAppFragmentPeer2.f356164r).f121541a, (Object) null, iVar.f356241c.f356163q);
            }
        }
        C51859bt btVar = csVar.f136085d;
        if (btVar == null) {
            btVar = C51859bt.f136033c;
        }
        if (btVar.f136035a != 1) {
            return C127406c.f350821b;
        }
        CanvasWebAppFragmentPeer a2 = cVar.mo17754z();
        C51859bt btVar2 = csVar.f136085d;
        if (btVar2 == null) {
            btVar2 = C51859bt.f136033c;
        }
        if (btVar2.f136035a == 1) {
            bsVar = (C51858bs) btVar2.f136036b;
        } else {
            bsVar = C51858bs.f136029b;
        }
        C129841h hVar = C129841h.NO_CONTENT;
        int ordinal = ((C129842i) a2.f356162p.get()).mo109290a().ordinal();
        if (ordinal == 0) {
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56226d()).mo56372aa(38474)).mo56386p("Perform update before the app content has been set.");
            optional = Optional.empty();
        } else if (ordinal == 1 || ordinal == 2) {
            String str3 = bsVar.f136031a;
            try {
                C8398n nVar = (C8398n) new C8393i().mo17146d(str3, C8398n.class);
                if (nVar == null) {
                    ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56226d()).mo56372aa(38476)).mo56386p("Null JSON element.");
                } else {
                    str = nVar.toString();
                }
            } catch (C8406v e) {
                ((C59052c) ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56226d()).mo56382g(e)).mo56372aa(38475)).mo56389s("Invalid Json: %s", str3);
            }
            if (str == null) {
                optional = Optional.empty();
            } else {
                String c = a2.f356159m.mo109280c(str);
                if (((C129842i) a2.f356162p.get()).mo109290a() == C129841h.LOADED) {
                    a2.f356159m.mo109279b(c).ifPresent(new C129840g(a2));
                }
                optional = Optional.m71637of(c);
            }
        } else {
            optional = Optional.empty();
        }
        if (!optional.isEmpty()) {
            return C127406c.f350821b;
        }
        ((C59052c) ((C59052c) f356023a.mo56224b()).mo56372aa(38409)).mo56386p("No updates to send. Returning Status.INTERNAL as ClientOpResult.");
        return C127406c.m208359a(C52235kf.INTERNAL);
    }

    /* renamed from: h */
    public static void m211810h(C128547d dVar, C52070ec ecVar) {
        C127125e eVar = (C127125e) C127126f.f350033d.createBuilder();
        eVar.copyOnWrite();
        C127126f fVar = (C127126f) eVar.instance;
        ecVar.getClass();
        fVar.f350036b = ecVar;
        fVar.f350035a |= 1;
        dVar.mo108511a((C127126f) eVar.build());
    }

    /* renamed from: a */
    public final C129836c mo109207a() {
        C43264o oVar = (C43264o) this.f356025b.getChildFragmentManager().f634a.mo671c("ApaWebFragment");
        if (oVar == null) {
            return null;
        }
        return (C129836c) oVar.mo17754z().mo46379a();
    }

    /* renamed from: d */
    public final void mo109208d() {
        this.f356033j.mo108518b(f356024q);
    }

    /* renamed from: e */
    public final void mo109209e(boolean z) {
        ((C59052c) ((C59052c) f356023a.mo56224b()).mo56372aa(38423)).mo56389s("setPausedState :%s", Boolean.valueOf(z));
        ImmersiveCanvasViewModel immersiveCanvasViewModel = this.f356037n;
        if (immersiveCanvasViewModel != null) {
            immersiveCanvasViewModel.f355932a = z;
        }
    }

    /* renamed from: f */
    public final void mo109210f() {
        ((C59052c) ((C59052c) f356023a.mo56224b()).mo56372aa(38425)).mo56386p("switchToWebMode");
        mo109209e(false);
        View view = this.f356025b.getView();
        view.getClass();
        View findViewById = view.findViewById(R.id.assistant_canvas_container);
        View findViewById2 = view.findViewById(R.id.assistant_canvas_header_container);
        View findViewById3 = view.findViewById(R.id.assistant_canvas_paused_content);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        findViewById3.setVisibility(4);
    }

    /* renamed from: g */
    public final boolean mo109211g() {
        ImmersiveCanvasViewModel immersiveCanvasViewModel = this.f356037n;
        if (immersiveCanvasViewModel != null) {
            return immersiveCanvasViewModel.f355932a;
        }
        return false;
    }
}
