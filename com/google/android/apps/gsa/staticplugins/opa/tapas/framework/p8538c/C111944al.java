package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.al */
/* compiled from: PG */
public final /* synthetic */ class C111944al implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111948ap f310994a;

    /* renamed from: b */
    public final /* synthetic */ C48672ag f310995b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f310996c;

    /* renamed from: d */
    public final /* synthetic */ long f310997d;

    /* renamed from: e */
    public final /* synthetic */ C121492b f310998e;

    /* renamed from: f */
    public final /* synthetic */ String f310999f;

    public /* synthetic */ C111944al(C111948ap apVar, C48672ag agVar, C113405ep epVar, long j, C121492b bVar, String str) {
        this.f310994a = apVar;
        this.f310995b = agVar;
        this.f310996c = epVar;
        this.f310997d = j;
        this.f310998e = bVar;
        this.f310999f = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118831d dVar;
        C111948ap apVar = this.f310994a;
        C48672ag agVar = this.f310995b;
        C113405ep epVar = this.f310996c;
        long j = this.f310997d;
        C121492b bVar = this.f310998e;
        String str = this.f310999f;
        C113408es esVar = (C113408es) obj;
        if (agVar.equals(C48672ag.TAPAS_SERVER)) {
            ((C112705m) apVar.f311013b.mo27525b()).mo99680o(epVar.mo100033p(), epVar.mo100016a(), 1);
        }
        C112686ax axVar = (C112686ax) apVar.f311014c.mo27525b();
        long a = apVar.mo99307a(j);
        agVar.name();
        int ordinal = agVar.ordinal();
        if (ordinal == 1) {
            dVar = axVar.f312373g;
        } else if (ordinal == 2) {
            dVar = axVar.f312374h;
        } else if (ordinal == 5) {
            dVar = axVar.f312370d;
        } else if (ordinal == 7) {
            dVar = axVar.f312368b;
        } else if (ordinal == 10) {
            dVar = axVar.f312369c;
        } else if (ordinal == 15) {
            dVar = axVar.f312371e;
        } else if (ordinal == 20) {
            dVar = axVar.f312372f;
        } else if (ordinal != 30) {
            switch (ordinal) {
                case 24:
                    dVar = axVar.f312375i;
                    break;
                case 25:
                    dVar = axVar.f312376j;
                    break;
                case 26:
                    dVar = axVar.f312377k;
                    break;
                default:
                    dVar = null;
                    break;
            }
        } else {
            dVar = axVar.f312378l;
        }
        if (dVar != null) {
            dVar.mo104025g(a);
        }
        apVar.mo99310e(agVar, 1, epVar, j);
        bVar.mo105191d();
        ((C113389c) apVar.f311015d.mo27525b()).mo99641p(epVar.mo100016a(), agVar, 2, esVar.mo100053o().size());
        C111948ap.f311012a.mo105240i(agVar.name() + "_SUCCESS_COUNT" + str);
        C121537f fVar = C111948ap.f311012a;
        String str2 = agVar.name() + "_NUM_FETCHED_SUGGESTIONS" + str;
        long j2 = 0;
        if (!(esVar == null || esVar.mo100053o() == null)) {
            j2 = (long) esVar.mo100053o().size();
        }
        fVar.mo105239h(str2, j2);
        if (esVar == null || esVar.mo100053o() == null) {
            esVar = C113408es.f314036b;
        }
        apVar.mo99309c(esVar, epVar, j, agVar.name(), 1, (Exception) null);
    }
}
