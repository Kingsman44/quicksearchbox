package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6893d.C87300a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87332o;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90083eh;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5451f.p5452a.p5453a.p5454a.C69381ac;
import p5451f.p5452a.p5453a.p5454a.C69390al;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.g */
/* compiled from: PG */
public final /* synthetic */ class C100008g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100023v f279708a;

    public /* synthetic */ C100008g(C100023v vVar) {
        this.f279708a = vVar;
    }

    public final void run() {
        C60870cx cxVar;
        C100023v vVar = this.f279708a;
        C87332o oVar = vVar.f279733h;
        oVar.f235884i = vVar.f279734i;
        oVar.f235885j = C58833ax.m90834k(vVar.f63405W);
        if (!vVar.f279732g.mo79746e(C89972ak.f246535J) || !vVar.f279728c.mo81003b().mo84420dA()) {
            C60856cj.m92900i(false);
        } else {
            vVar.f279733h.mo80976d(C69381ac.SRP, C69390al.VAAV2_VOICE_SEARCH_PROMOTION);
        }
        if (!vVar.f279732g.mo79746e(C90053de.f248978k) || !vVar.f279728c.mo81003b().mo84420dA()) {
            C60856cj.m92900i(false);
        } else {
            vVar.f279733h.mo80976d(C69381ac.SRP, C69390al.VOICE_MATCH_PROMOTION);
        }
        if (vVar.f279732g.mo79746e(C90110fh.f250633ae)) {
            vVar.f279733h.mo80976d(C69381ac.SRP, C69390al.DARK_MODE_PROMOTION);
        } else {
            C60856cj.m92900i(false);
        }
        C22871g gVar = vVar.f279729d;
        if (!vVar.f279732g.mo79746e(C90083eh.f250093d) || C89257aa.m145197o(vVar.f279735j)) {
            cxVar = C60856cj.m92900i(false);
        } else {
            C22871g gVar2 = vVar.f279729d;
            cxVar = gVar2.mo28209i(C60856cj.m92897f(gVar2.mo28209i(vVar.f279738m.mo46042d(), "checkIfCooldownTimeHasPassed", new C100011j(vVar)), vVar.f279736k.mo78803a()), "checkPromoCardCooldownAndInstallWidgetSupportByDefaultLauncher", C100009h.f279709a);
        }
        gVar.mo28210j(cxVar, "isQSBPromoCardEnabled", new C100017p(vVar));
        if (!vVar.f279732g.mo79746e(C89972ak.f246572m) || !vVar.f279728c.mo81003b().mo84420dA() || vVar.f279728c.mo81003b().f252767f != QueryTriggerType.AGA_SEARCHPLATE_MIC) {
            C60856cj.m92900i(false);
        } else {
            vVar.f279733h.mo80976d(C69381ac.SRP, C69390al.APVS_SHORTCUT_PROMOTION);
        }
        if (vVar.f279732g.mo79746e(C89972ak.f246558af) && vVar.f279739n.mo56113h() && vVar.f279734i.mo56113h()) {
            ((C87300a) vVar.f279739n.mo56107c()).mo80950c((C87334q) vVar.f279734i.mo56107c());
            ((C87300a) vVar.f279739n.mo56107c()).mo80948a(vVar.f63405W, C69381ac.SRP);
        }
    }
}
