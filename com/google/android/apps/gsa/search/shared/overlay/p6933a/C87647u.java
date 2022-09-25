package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.overlay.C87660i;
import com.google.android.apps.gsa.search.shared.overlay.C87663l;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.u */
/* compiled from: PG */
public final class C87647u extends C88499t {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236906a;

    protected C87647u(C87625ad adVar) {
        this.f236906a = adVar;
    }

    /* renamed from: e */
    public final void mo17566e(int i, int i2, boolean z) {
        if (this.f236906a.f236773C.mo81951w()) {
            if ((i2 & 1) == 0 || !this.f236906a.f236775E.mo81876F()) {
                this.f236906a.mo81797ad(i, i2, z);
            }
        }
    }

    /* renamed from: f */
    public final void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
        if (this.f236906a.f236773C.mo81951w()) {
            C87641o oVar = this.f236906a.f236771A;
            int S = ((SearchError) parcelableVoiceAction.f236008a).mo81139S();
            String string = S != 0 ? oVar.f236900a.f236874p.getResources().getString(S) : BuildConfig.FLAVOR;
            SearchPlate searchPlate = oVar.f236900a.f236778H;
            C58976aa aaVar = C58975e.f156826a;
            searchPlate.f240688H = string;
            searchPlate.mo82674g();
        }
    }

    /* renamed from: fO */
    public final void mo49088fO(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f236906a.f236773C.mo81951w()) {
            intent.setExtrasClassLoader(getClass().getClassLoader());
            if (intent.getBooleanExtra("com.google.android.search.core.extra.EXTRA_STAY_BOUND_TO_SERVICE_AFTER_INTENT_LAUNCH", false)) {
                intent.removeExtra("com.google.android.search.core.extra.EXTRA_STAY_BOUND_TO_SERVICE_AFTER_INTENT_LAUNCH");
                this.f236906a.f236801aD = true;
            }
            if (this.f236906a.f236843at && intent.getBooleanExtra("scrim_transition_to_solid", false)) {
                C87660i iVar = this.f236906a.f236777G;
                if (!iVar.f236925c.isRunning()) {
                    iVar.f236925c.start();
                }
                intent.removeExtra("scrim_transition_to_solid");
            }
            if (this.f236906a.f236776F.isShown() && this.f236906a.f236879u.isShown() && (this.f236906a.f236778H.f240689I.mo82766k() || this.f236906a.f236777G.f236925c.isRunning())) {
                C87625ad adVar = this.f236906a;
                if (adVar.f236836am == null) {
                    adVar.f236836am = intent;
                } else if (intent.getBooleanExtra("LAUNCH_EXTERNAL_ACTIVITY", false)) {
                    this.f236906a.f236836am = intent;
                }
            } else if (this.f236906a.f236840aq.mo65089a(intent)) {
                if (intent.getComponent() != null && intent.getComponent().getClassName().equals("com.google.android.apps.gsa.velour.dynamichosts.TransparentVelvetDynamicHostActivity")) {
                    this.f236906a.f236845av = true;
                }
                C87625ad adVar2 = this.f236906a;
                adVar2.f236846aw = true;
                adVar2.f236849az = true;
                adVar2.mo81804ak();
            }
        }
    }

    /* renamed from: g */
    public final void mo17568g(int i) {
        if (this.f236906a.f236773C.mo81951w()) {
            C87641o oVar = this.f236906a.f236771A;
            C58976aa aaVar = C58975e.f156826a;
            oVar.f236900a.f236778H.mo82692s(i, false);
            C87663l lVar = this.f236906a.f236837an;
            if (lVar != null) {
                if (!(i == 2 || i == 3)) {
                    if (i == 10) {
                        i = 10;
                    }
                }
                if (!lVar.f236915a && !lVar.f236943l && !lVar.f236939h) {
                    lVar.mo81866a();
                    lVar.f236939h = true;
                    lVar.f236944m = true;
                }
            }
            if (i == 9) {
                C87625ad adVar = this.f236906a;
                adVar.f236846aw = false;
                adVar.f236845av = false;
            }
        }
    }

    /* renamed from: h */
    public final void mo17569h(Query query, List list, CardDecision cardDecision, int i) {
        C59104x d = C87625ad.f236770n.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SearchOverlay");
        ((C59052c) ((C59052c) d).mo56372aa(9692)).mo56386p("This shouldn't be called as GEL doesn't support showing voice actions.");
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        if (this.f236906a.f236773C.mo81951w()) {
            C87641o oVar = this.f236906a.f236771A;
            C58976aa aaVar = C58975e.f156826a;
            oVar.f236900a.f236778H.f240734g.mo82732q(str, str2);
        }
    }

    /* renamed from: iJ */
    public final void mo17571iJ(ServiceEventData serviceEventData) {
        if (this.f236906a.f236773C.mo81951w()) {
            this.f236906a.mo76807c(serviceEventData);
        }
    }

    /* renamed from: iK */
    public final void mo17572iK(int i, String str, String str2) {
        if (this.f236906a.f236773C.mo81951w()) {
            C87641o oVar = this.f236906a.f236771A;
            if ((33554432 & i) != 0) {
                oVar.f236900a.f236828ae = true;
            }
            oVar.f236900a.mo81804ak();
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            oVar.f236900a.f236778H.mo82679l(i, str, str2, false);
        }
    }

    /* renamed from: iL */
    public final void mo17573iL(String str, String str2) {
        if (this.f236906a.f236773C.mo81951w()) {
            C87641o oVar = this.f236906a.f236771A;
            C58976aa aaVar = C58975e.f156826a;
            oVar.f236900a.f236778H.f240734g.mo82726k(str);
        }
    }

    /* renamed from: j */
    public final void mo17574j(int i) {
        if (this.f236906a.f236773C.mo81951w()) {
            this.f236906a.f236878t.mo85096c(i);
        }
    }

    /* renamed from: k */
    public final void mo81841k() {
        if (this.f236906a.f236773C.mo81951w()) {
            this.f236906a.f236771A.mo44288b();
        }
    }

    /* renamed from: l */
    public final void mo81842l(Response response) {
        this.f236906a.mo81776I(response);
    }

    /* renamed from: m */
    public final void mo49089m(byte[] bArr) {
        C59104x d = C87625ad.f236770n.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SearchOverlay");
        ((C59052c) ((C59052c) d).mo56372aa(9691)).mo56386p("This shouldn't be called as GEL doesn't support clockwork result.");
    }

    /* renamed from: n */
    public final void mo81843n() {
        if (this.f236906a.f236773C.mo81951w()) {
            this.f236906a.f236771A.mo44293h();
        }
    }
}
