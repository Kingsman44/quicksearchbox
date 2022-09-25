package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67284ao;
import com.google.speech.p5228m.C67300bd;
import com.google.speech.p5228m.C67302bf;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C100726ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100733ap f281612a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f281613b;

    public /* synthetic */ C100726ai(C100733ap apVar, C91006f fVar) {
        this.f281612a = apVar;
        this.f281613b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C100733ap apVar = this.f281612a;
        C91006f fVar = this.f281613b;
        C132800h hVar = (C132800h) obj;
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("FedAss Prefs Proto");
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        e.mo85279c("PolicyConfigURI").mo85276a(C90752i.m148229c(fVar2.f362321e));
        e.mo85279c("FederatedLearningSetting").mo85276a(C90752i.m148228b(Boolean.valueOf(fVar2.f362318b)));
        e.mo85279c("AccountAllowsLearning").mo85276a(C90752i.m148228b(Boolean.valueOf(fVar2.f362320d)));
        for (C67284ao aoVar : apVar.f281625d.mo92043a(hVar).f183028c) {
            C91006f e2 = fVar.mo85281e((Object) null);
            e2.mo85291r("PolicyConfig");
            e2.mo85279c("name").mo85276a(C90752i.m148229c(aoVar.f182898a));
            e2.mo85279c("version").mo85276a(C90752i.m148230d(Integer.valueOf(aoVar.f182899b)));
            C91005e c = e2.mo85279c("enabled");
            C67302bf bfVar = aoVar.f182900c;
            if (bfVar == null) {
                bfVar = C67302bf.f182938c;
            }
            c.mo85276a(C90752i.m148228b(Boolean.valueOf(bfVar.f182940a)));
            C67302bf bfVar2 = aoVar.f182900c;
            if (bfVar2 == null) {
                bfVar2 = C67302bf.f182938c;
            }
            for (C67300bd bdVar : bfVar2.f182941b) {
                C91006f e3 = e2.mo85281e((Object) null);
                e3.mo85291r("Policy");
                C91005e c2 = e3.mo85279c("name");
                int b = C67278ai.m97449b(bdVar.f182933a);
                int i = 1;
                if (b == 0) {
                    b = 1;
                }
                c2.mo85276a(C90752i.m148229c(C67278ai.m97448a(b)));
                C91005e c3 = e3.mo85279c("number");
                int b2 = C67278ai.m97449b(bdVar.f182933a);
                if (b2 != 0) {
                    i = b2;
                }
                c3.mo85276a(C90752i.m148230d(Integer.valueOf(i - 1)));
            }
        }
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        if (!zVar.f362401g) {
            return C60866ct.f164955a;
        }
        C60870cx g = C60922j.m93044g(apVar.f281623b.mo92097a(), C47810es.m84963c(new C100732ao(fVar)), apVar.f281626e);
        C100742h.m166945g(g, C100723af.f281609a, apVar.f281626e);
        return g;
    }
}
