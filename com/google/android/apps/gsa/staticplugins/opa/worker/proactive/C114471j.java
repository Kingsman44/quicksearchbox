package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.assistant.p3803ag.p3809c.C49081ft;
import com.google.assistant.p3803ag.p3809c.C49083fv;
import com.google.assistant.p3803ag.p3809c.C49085fx;
import com.google.assistant.p3803ag.p3809c.C49087fz;
import com.google.assistant.p3803ag.p3809c.C49089ga;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5036r.C65316b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.j */
/* compiled from: PG */
public final /* synthetic */ class C114471j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114476o f317420a;

    /* renamed from: b */
    public final /* synthetic */ aaj f317421b;

    /* renamed from: c */
    public final /* synthetic */ int f317422c;

    /* renamed from: d */
    public final /* synthetic */ int f317423d;

    public /* synthetic */ C114471j(C114476o oVar, int i, int i2, aaj aaj) {
        this.f317420a = oVar;
        this.f317422c = i;
        this.f317423d = i2;
        this.f317421b = aaj;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        int a;
        C114476o oVar = this.f317420a;
        int i = this.f317422c;
        int i2 = this.f317423d;
        aaj aaj = this.f317421b;
        for (C49089ga gaVar : ((C49078fq) obj).f126940b) {
            if (gaVar.f126950a == i - 1 && gaVar.f126951b == C65316b.m96665b(i2) && gaVar.f126955f) {
                aax aax = (aax) ((abc) aaj.mo58881i(abc.f134692p)).toBuilder();
                int i3 = gaVar.f126952c;
                aax.copyOnWrite();
                abc abc = (abc) aax.instance;
                abc.f134694a |= 32;
                abc.f134700g = i3;
                if (!gaVar.f126956g.isEmpty()) {
                    String str = gaVar.f126956g;
                    aax.copyOnWrite();
                    abc abc2 = (abc) aax.instance;
                    str.getClass();
                    abc2.f134694a |= 512;
                    abc2.f134704k = str;
                }
                int a2 = C49087fz.m85364a(gaVar.f126957h);
                if (a2 != 0 && a2 == 3) {
                    aax.copyOnWrite();
                    abc abc3 = (abc) aax.instance;
                    abc3.f134699f = 2;
                    abc3.f134694a |= 16;
                }
                int a3 = C49081ft.m85361a(gaVar.f126958i);
                if (a3 != 0 && a3 == 2) {
                    aax.copyOnWrite();
                    abc abc4 = (abc) aax.instance;
                    abc4.f134706m = 1;
                    abc4.f134694a |= 1024;
                }
                if (!oVar.f317435h.f94592j || (a = C49083fv.m85362a(gaVar.f126959j)) == 0 || a == 1) {
                    aax.copyOnWrite();
                    abc abc5 = (abc) aax.instance;
                    abc5.f134707n = 0;
                    abc5.f134694a |= 2048;
                }
                int a4 = C49085fx.m85363a(gaVar.f126960k);
                if (a4 != 0 && a4 == 2) {
                    aaj.copyOnWrite();
                    aas aas = (aas) aaj.instance;
                    aas aas2 = aas.f134661u;
                    aas.f134663a |= 1048576;
                    aas.f134682t = true;
                }
                if (gaVar.f126953d <= 0.0f || oVar.f317431d.nextFloat() >= gaVar.f126953d) {
                    cxVar = C60856cj.m92900i(aax);
                } else {
                    cxVar = C60922j.m93044g(C60922j.m93044g(oVar.f317433f.mo40095a(), C47810es.m84963c(new C114473l(oVar)), oVar.f317429b), C47810es.m84963c(new C114474m(oVar, aax)), oVar.f317429b);
                }
                return C60922j.m93044g(cxVar, C47810es.m84963c(new C114472k(aaj)), oVar.f317429b);
            }
        }
        C59104x b = C114476o.f317428a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClientNotificationsMngr");
        ((C59052c) ((C59052c) b).mo56372aa(28959)).mo56386p("Notification client push failed.");
        return C60856cj.m92899h(new C114475n());
    }
}
