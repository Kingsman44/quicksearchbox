package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.app.KeyguardManager;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.Window;
import androidx.activity.C0800m;
import com.google.android.apps.gsa.binaries.satin.app.C74172ne;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128245a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9791a.C129009a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129019e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129023i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.p9808a.C129288b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129321j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util.lockednavigation.C129340a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129584b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129612d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d.C129382x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9870a.C130150a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130186a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.ah */
/* compiled from: PG */
public final class C130158ah implements C129321j {

    /* renamed from: a */
    public static final C59071e f356856a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.ah");

    /* renamed from: A */
    public final C37215b f356857A;

    /* renamed from: B */
    public final boolean f356858B;

    /* renamed from: C */
    public final C0800m f356859C = new C130156af(this);

    /* renamed from: D */
    ResponseInfoViewModel f356860D;

    /* renamed from: E */
    public TtsViewModel f356861E;

    /* renamed from: F */
    public ResetFocusViewModel f356862F;

    /* renamed from: G */
    public C129584b f356863G;

    /* renamed from: H */
    public final C130150a f356864H;

    /* renamed from: b */
    public final C130279p f356865b;

    /* renamed from: c */
    public final C130299r f356866c;

    /* renamed from: d */
    public final AccountId f356867d;

    /* renamed from: e */
    public final C127120a f356868e;

    /* renamed from: f */
    public final C58495hd f356869f;

    /* renamed from: g */
    public final C46855i f356870g;

    /* renamed from: h */
    public final C129009a f356871h;

    /* renamed from: i */
    public final C129566ah f356872i;

    /* renamed from: j */
    public final C129019e f356873j;

    /* renamed from: k */
    public final C130277n f356874k;

    /* renamed from: l */
    public final C129382x f356875l;

    /* renamed from: m */
    public final C130186a f356876m;

    /* renamed from: n */
    public final C130169as f356877n;

    /* renamed from: o */
    public final C127118j f356878o;

    /* renamed from: p */
    public final C129540c f356879p;

    /* renamed from: q */
    public final C130171au f356880q;

    /* renamed from: r */
    public final KeyguardManager f356881r;

    /* renamed from: s */
    public final C130149a f356882s;

    /* renamed from: t */
    public final C128245a f356883t;

    /* renamed from: u */
    public final C21370a f356884u;

    /* renamed from: v */
    public final C129612d f356885v;

    /* renamed from: w */
    public final boolean f356886w;

    /* renamed from: x */
    public final C129340a f356887x;

    /* renamed from: y */
    public final boolean f356888y;

    /* renamed from: z */
    public final boolean f356889z;

    public C130158ah(C130279p pVar, C130299r rVar, C129566ah ahVar, AccountId accountId, C127120a aVar, Map map, C130277n nVar, Map map2, C74172ne neVar, C46855i iVar, C129009a aVar2, C130150a aVar3, C129382x xVar, C130186a aVar4, C130169as asVar, C127118j jVar, C129540c cVar, C130171au auVar, KeyguardManager keyguardManager, C130149a aVar5, C128245a aVar6, C129340a aVar7, C21370a aVar8, C129612d dVar, C37215b bVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f356865b = pVar;
        this.f356866c = rVar;
        this.f356867d = accountId;
        this.f356868e = aVar;
        this.f356869f = C58495hd.m89898l(map);
        this.f356874k = nVar;
        this.f356875l = xVar;
        this.f356878o = jVar;
        this.f356879p = cVar;
        Map map3 = map2;
        this.f356873j = new C129019e(map2, (Executor) neVar.f206647a.a.p.mo17428b());
        this.f356870g = iVar;
        this.f356871h = aVar2;
        this.f356872i = ahVar;
        this.f356864H = aVar3;
        this.f356876m = aVar4;
        this.f356880q = auVar;
        this.f356877n = asVar;
        this.f356881r = keyguardManager;
        this.f356882s = aVar5;
        this.f356883t = aVar6;
        this.f356884u = aVar8;
        this.f356885v = dVar;
        this.f356857A = bVar;
        this.f356886w = z;
        this.f356887x = aVar7;
        this.f356888y = z2;
        this.f356889z = z3;
        this.f356858B = z4;
    }

    /* renamed from: g */
    public static void m212490g(C128547d dVar, C52070ec ecVar) {
        C127125e eVar = (C127125e) C127126f.f350033d.createBuilder();
        eVar.copyOnWrite();
        C127126f fVar = (C127126f) eVar.instance;
        ecVar.getClass();
        fVar.f350036b = ecVar;
        fVar.f350035a |= 1;
        dVar.mo108511a((C127126f) eVar.build());
    }

    /* renamed from: a */
    public final void mo108967a() {
        C129584b bVar = this.f356863G;
        if (bVar != null) {
            bVar.mo109119a("KEY_SUGGESTIONS");
        }
    }

    /* renamed from: b */
    public final /* synthetic */ C69788q mo109537b() {
        C129584b bVar = this.f356863G;
        if (bVar != null) {
            bVar.mo109119a("CLIENT_OP");
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final void mo109538c(int i) {
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : this.f356866c.getChildFragmentManager().f634a.mo677i()) {
            if (fragment.getId() == R.id.assistant_response_layer_content) {
                arrayList.add(fragment);
            }
        }
        if (!arrayList.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayList.get(0);
            if (fragment2 instanceof C129288b) {
                C129288b bVar = (C129288b) fragment2;
                if (bVar.mo17754z().f355106b.requireView().findViewById(R.id.assistant_header_root).getVisibility() != i) {
                    bVar.mo17754z().f355106b.requireView().findViewById(R.id.assistant_header_root).setVisibility(i);
                    if (arrayList.size() >= 2) {
                        Fragment fragment3 = (Fragment) arrayList.get(1);
                        if (i == 0 && (fragment3 instanceof C129244g)) {
                            C129244g gVar = (C129244g) fragment3;
                            gVar.mo17754z().mo108933c(false);
                            gVar.mo17754z().mo108932b(false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo109539d(Optional optional, int i) {
        FragmentManager childFragmentManager = this.f356866c.getChildFragmentManager();
        if (childFragmentManager.f634a.mo670b(i) == null && optional.isPresent()) {
            Optional b = ((C129023i) optional.get()).mo108196b();
            if (b.isPresent()) {
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo689v(i, (Fragment) b.get(), (String) null);
                aVar.mo509f();
            }
        }
    }

    /* renamed from: e */
    public final void mo109540e() {
        this.f356866c.requireView().findViewById(R.id.assistant_response_lock_affordance).setVisibility(true != this.f356881r.isKeyguardLocked() ? 8 : 0);
    }

    /* renamed from: f */
    public final void mo109541f(boolean z) {
        Window window = this.f356866c.requireActivity().getWindow();
        if (z) {
            window.addFlags(6815744);
        } else {
            window.clearFlags(524288);
            window.clearFlags(C89885b.NOW_VALUE);
        }
        this.f356866c.requireActivity().setShowWhenLocked(z);
        this.f356866c.requireActivity().setTurnScreenOn(z);
    }
}
