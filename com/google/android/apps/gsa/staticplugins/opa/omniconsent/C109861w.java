package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.udc.C146067i;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.p10875a.C146057j;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21535c;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21539g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21628b;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21745b;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21747d;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21749f;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21751h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50363uh;
import com.google.assistant.p3861at.C50364ui;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.adw;
import com.google.assistant.p3861at.adz;
import com.google.assistant.p3861at.aec;
import com.google.assistant.p3861at.aed;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.w */
/* compiled from: PG */
public final /* synthetic */ class C109861w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109782ab f306109a;

    /* renamed from: b */
    public final /* synthetic */ C83884ar f306110b;

    /* renamed from: c */
    public final /* synthetic */ C109864z f306111c;

    /* renamed from: d */
    public final /* synthetic */ C109864z f306112d;

    public /* synthetic */ C109861w(C109782ab abVar, C83884ar arVar, C109864z zVar, C109864z zVar2) {
        this.f306109a = abVar;
        this.f306110b = arVar;
        this.f306111c = zVar;
        this.f306112d = zVar2;
    }

    public final void run() {
        C21529b a;
        int i;
        C109782ab abVar = this.f306109a;
        C83884ar arVar = this.f306110b;
        C109864z zVar = this.f306111c;
        C109864z zVar2 = this.f306112d;
        try {
            C109814j jVar = abVar.f305906f;
            ((C59052c) ((C59052c) C109814j.f306019a.mo56224b()).mo56372aa(25244)).mo56386p("fetch: starting CMS fetch");
            a = jVar.f306022d.mo98170a();
            C21535c a2 = a.mo26987a();
            if (a2.f59933a.mo119068b()) {
                long a3 = jVar.f306024f.mo79743a(C90014bt.f247459hZ);
                C21745b bVar = jVar.f306025g;
                C21747d dVar = jVar.f306026h;
                UdcCacheRequest udcCacheRequest = new UdcCacheRequest(C109814j.f306020b);
                C143840l lVar = C146067i.f394787a;
                C21539g gVar = new C21539g(C146057j.m237909a(C21544l.m40656c(a), udcCacheRequest), C21745b.f60049a);
                C21539g b = jVar.f306023e.mo27028b(a, (Account) jVar.f306021c.mo77278a().mo56107c());
                C21749f fVar = (C21749f) gVar.mo26995b(a3, TimeUnit.MILLISECONDS);
                C21628b bVar2 = (C21628b) b.mo26995b(a3, TimeUnit.MILLISECONDS);
                int i2 = ((C21543k) fVar.mo26997c()).f59946b.f389621g;
                int a4 = bVar2.mo26997c().mo26998a();
                if (a4 == 15 || i2 == 15) {
                    throw new C109813i(1);
                } else if (a4 == 0 && i2 == 0) {
                    int i3 = 3;
                    if (fVar.mo27085a().mo27084a().size() == 2) {
                        C58833ax b2 = C109814j.m182893b(fVar, C56116b.DEVICE_INFO_DEVICE_LEVEL);
                        C58833ax b3 = C109814j.m182893b(fVar, C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL);
                        if (!b2.mo56113h() || !b3.mo56113h()) {
                            throw new C109813i(3);
                        }
                        adw adw = (adw) aed.f129097f.createBuilder();
                        adz a5 = jVar.mo98169a((C21751h) b2.mo56107c());
                        adw.copyOnWrite();
                        aed aed = (aed) adw.instance;
                        a5.getClass();
                        aed.f129100b = a5;
                        aed.f129099a |= 1;
                        adz a6 = jVar.mo98169a((C21751h) b3.mo56107c());
                        adw.copyOnWrite();
                        aed aed2 = (aed) adw.instance;
                        a6.getClass();
                        aed2.f129101c = a6;
                        aed2.f129099a |= 2;
                        if (bVar2.mo27025d()) {
                            i = 2;
                        } else {
                            i = (!bVar2.mo27024b() || !bVar2.mo27029g()) ? 4 : 3;
                        }
                        if (bVar2.mo27027f()) {
                            i3 = 2;
                        } else if (!bVar2.mo27024b() || !bVar2.mo27029g()) {
                            i3 = 4;
                        }
                        aec c = C109814j.m182894c(i);
                        adw.copyOnWrite();
                        aed aed3 = (aed) adw.instance;
                        c.getClass();
                        aed3.f129102d = c;
                        aed3.f129099a |= 4;
                        aec c2 = C109814j.m182894c(i3);
                        adw.copyOnWrite();
                        aed aed4 = (aed) adw.instance;
                        c2.getClass();
                        aed4.f129103e = c2;
                        aed4.f129099a |= 8;
                        aed aed5 = (aed) adw.build();
                        a.f59932a.mo119132g();
                        C58976aa aaVar = C58975e.f156826a;
                        l lVar2 = abVar.f305903c;
                        Account account = (Account) abVar.f305902b.mo77278a().mo56107c();
                        acu acu = (acu) acv.f128920X.createBuilder();
                        C50363uh uhVar = (C50363uh) C50364ui.f131105e.createBuilder();
                        int m = arVar.mo77268m();
                        uhVar.copyOnWrite();
                        C50364ui uiVar = (C50364ui) uhVar.instance;
                        int i4 = m - 1;
                        if (m != 0) {
                            uiVar.f131108b = i4;
                            uiVar.f131107a |= 1;
                            uhVar.copyOnWrite();
                            C50364ui uiVar2 = (C50364ui) uhVar.instance;
                            aed5.getClass();
                            uiVar2.f131109c = aed5;
                            uiVar2.f131107a |= 2;
                            if (abVar.f305909i.mo102285c()) {
                                String a7 = abVar.f305909i.mo102283a();
                                uhVar.copyOnWrite();
                                C50364ui uiVar3 = (C50364ui) uhVar.instance;
                                uiVar3.f131107a |= 4;
                                uiVar3.f131110d = a7;
                            }
                            acu.copyOnWrite();
                            acv acv = (acv) acu.instance;
                            C50364ui uiVar4 = (C50364ui) uhVar.build();
                            uiVar4.getClass();
                            acv.f128926E = uiVar4;
                            acv.f128946b |= 64;
                            abVar.f305907g.mo28213m("Cancel getSettingsUi", abVar.f305904d.mo79743a(C90014bt.f247514ib), new C109862x(zVar, zVar2, lVar2.i(account, (acv) acu.build(), C50144me.f130361d, zVar, zVar2, (String) null, abVar.getClass().getSimpleName())));
                            return;
                        }
                        throw null;
                    }
                    throw new C109813i(3);
                } else {
                    throw new C109813i(2);
                }
            } else {
                ((C59052c) ((C59052c) C109814j.f306019a.mo56225c()).mo56372aa(25245)).mo56387q("connectAndFetch: connection error = %d", a2.f59933a.f389574c);
                throw new C109813i(4);
            }
        } catch (C109813i e) {
            C59104x c3 = C109782ab.f305901a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "OmniConsentReqHelper");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(25262)).mo56386p("Caught exception during cmsFetchController");
            zVar.f306122a.cancel(true);
            zVar2.f306122a.cancel(true);
        } catch (Throwable th) {
            a.f59932a.mo119132g();
            throw th;
        }
    }
}
