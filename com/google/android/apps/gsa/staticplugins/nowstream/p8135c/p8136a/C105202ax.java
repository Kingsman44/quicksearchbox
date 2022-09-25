package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5451f.p5452a.p5453a.p5454a.C69381ac;
import p5451f.p5452a.p5453a.p5454a.C69390al;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C105202ax implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C105207bb f293419a;

    public /* synthetic */ C105202ax(C105207bb bbVar) {
        this.f293419a = bbVar;
    }

    public final void run() {
        C60870cx cxVar;
        C105207bb bbVar = this.f293419a;
        bbVar.f293426b.f235884i = C58833ax.m90834k(bbVar.f293425a);
        bbVar.f293426b.f235885j = C58833ax.m90834k(bbVar.f63405W);
        bbVar.f293426b.mo80976d(C69381ac.LOBBY, C69390al.HOMECSREEN_DEEPLINK_DEFAULT_PROMOTION);
        if (bbVar.f293802l.mo79746e(C89972ak.f246547V)) {
            bbVar.f293426b.mo80976d(C69381ac.LOBBY, C69390al.MANDALORIAN_AR_PROMOTION);
        } else {
            C60856cj.m92900i(false);
        }
        if (bbVar.f293802l.mo79746e(C90110fh.f250633ae)) {
            bbVar.f293426b.mo80976d(C69381ac.LOBBY, C69390al.DARK_MODE_PROMOTION);
        } else {
            C60856cj.m92900i(false);
        }
        if (!bbVar.f293802l.mo79746e(C89972ak.f246567h) || !((String) bbVar.f293427c.mo94598c().f63720e).equals("and.now.n")) {
            C60856cj.m92900i(false);
        } else {
            bbVar.f293426b.mo80976d(C69381ac.LOBBY, C69390al.DISCOVER_ENTRYPOINT_PROMOTION);
        }
        if (bbVar.f293802l.mo79746e(C89972ak.f246545T)) {
            C22871g gVar = bbVar.f293428d;
            if (C89257aa.m145197o(bbVar.f293430f)) {
                cxVar = C60856cj.m92900i(false);
            } else {
                C22871g gVar2 = bbVar.f293428d;
                cxVar = gVar2.mo28209i(C60856cj.m92897f(gVar2.mo28209i(bbVar.f293431m.mo46042d(), "checkIfCooldownTimeHasPassed", new C105206ba(bbVar)), bbVar.f293429e.mo78803a()), "checkPromoCardCooldownAndInstallWidgetSupportByDefaultLauncher", C105204az.f293421a);
            }
            gVar.mo28210j(cxVar, "isQSBPromoCardEnabled", new C105203ay(bbVar));
        } else {
            C60856cj.m92900i(false);
        }
        if (bbVar.f293802l.mo79746e(C89972ak.f246574o)) {
            bbVar.f293426b.mo80976d(C69381ac.LOBBY, (C69390al) null);
        } else {
            C60856cj.m92900i(false);
        }
    }
}
