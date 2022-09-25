package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119796ar;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119797as;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119798at;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119872dm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119874do;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32510c;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32519l;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32525r;
import com.google.android.libraries.search.p2871b.p2900n.p2901a.C37300a;
import com.google.android.libraries.search.p2871b.p2900n.p2901a.C37301b;
import com.google.android.libraries.search.p2871b.p2900n.p2901a.C37302c;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47561bl;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.n */
/* compiled from: PG */
final class C119764n implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C119765o f333608a;

    public C119764n(C119765o oVar) {
        this.f333608a = oVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f333608a.mo104510e((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f333608a.mo104510e(th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C119873dn dnVar;
        C32512e eVar;
        C119798at atVar;
        C119796ar arVar;
        C119798at atVar2;
        C119796ar arVar2;
        boolean z;
        C119769s sVar;
        C119769s sVar2;
        C32510c cVar;
        C119874do doVar = (C119874do) obj;
        C119765o oVar = this.f333608a;
        C59104x b = C119765o.f333609a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        ((C59052c) ((C59052c) b).mo56372aa(34579)).mo56389s("#onResponse: %s", doVar);
        int i = doVar.f333843a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            oVar.f333612d.execute(C47810es.m84977q(new C119758h(oVar)));
        } else if (i3 == 1) {
            if (i == 2) {
                dnVar = (C119873dn) doVar.f333844b;
            } else {
                dnVar = C119873dn.f333836c;
            }
            C59104x b2 = C119765o.f333609a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
            ((C59052c) ((C59052c) b2).mo56372aa(34578)).mo56389s("#onEvent: %s", dnVar);
            int a = C119872dm.m198755a(dnVar.f333838a);
            int i4 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i4 == 0) {
                oVar.f333612d.execute(C47810es.m84977q(new C119759i(oVar, dnVar)));
            } else if (i4 == 1) {
                oVar.f333612d.execute(C47810es.m84977q(new C119749a(oVar, dnVar)));
            } else if (i4 == 2) {
                oVar.f333612d.execute(C47810es.m84977q(new C119760j(oVar, dnVar)));
            } else if (i4 == 3) {
                oVar.f333612d.execute(C47810es.m84977q(new C119762l(oVar, dnVar)));
            } else if (i4 == 4) {
                oVar.f333612d.execute(C47810es.m84977q(new C119752b(oVar, dnVar)));
            } else if (i4 == 5) {
                oVar.f333612d.execute(C47810es.m84977q(new C119761k(oVar, dnVar)));
            }
        } else if (i3 == 2) {
            C32519l lVar = oVar.f333616h;
            if (i == 3) {
                eVar = (C32512e) doVar.f333844b;
            } else {
                eVar = C32512e.f87093e;
            }
            lVar.mo38121c(eVar);
        } else if (i3 == 3) {
            if (i == 4) {
                atVar = (C119798at) doVar.f333844b;
            } else {
                atVar = C119798at.f333687d;
            }
            if (atVar.f333689a == 2) {
                arVar = (C119796ar) atVar.f333690b;
            } else {
                arVar = C119796ar.f333677c;
            }
            C119793ao aoVar = arVar.f333680b;
            if (aoVar == null) {
                aoVar = C119793ao.f333670e;
            }
            C119834cb cbVar = aoVar.f333672a;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            String str = cbVar.f333767a;
            C47561bl b3 = C47562bm.f123426a.mo51423b();
            C37300a aVar = (C37300a) C37301b.f99117c.createBuilder();
            aVar.copyOnWrite();
            C37301b bVar = (C37301b) aVar.instance;
            str.getClass();
            bVar.f99119a = 1;
            bVar.f99120b = str;
            b3.mo51422a(C37302c.f99121a, (C37301b) aVar.build());
            C47558bi b4 = C47831fm.m85007b("APAConvClientOpExecution", ((C47563bn) b3).mo51424e());
            try {
                C59104x b5 = C119765o.f333609a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                ((C59052c) ((C59052c) b5).mo56372aa(34580)).mo56389s("ApaConvConnection Span created with id: %s", str);
                C119770t tVar = oVar.f333614f;
                if (doVar.f333843a == 4) {
                    atVar2 = (C119798at) doVar.f333844b;
                } else {
                    atVar2 = C119798at.f333687d;
                }
                long j = atVar2.f333691c;
                C59104x b6 = C119770t.f333628a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
                C59052c cVar2 = (C59052c) b6;
                C58976aa aaVar = C119938a.f334012b;
                Long valueOf = Long.valueOf(j);
                cVar2.mo56378ag(aaVar, valueOf);
                ((C59052c) cVar2.mo56372aa(34587)).mo56389s("#onClientOpExecutionRequest(requestCase=%s)", C119797as.m198711a(atVar2.f333689a));
                int ordinal = C119797as.m198711a(atVar2.f333689a).ordinal();
                if (ordinal == 0) {
                    if (atVar2.f333689a == 2) {
                        arVar2 = (C119796ar) atVar2.f333690b;
                    } else {
                        arVar2 = C119796ar.f333677c;
                    }
                    C51809dy dyVar = arVar2.f333679a;
                    if (dyVar == null) {
                        dyVar = C51809dy.f135933f;
                    }
                    C51809dy dyVar2 = dyVar;
                    C119670b bVar2 = tVar.f333629b;
                    C51809dy dyVar3 = arVar2.f333679a;
                    if (dyVar3 == null) {
                        dyVar3 = C51809dy.f135933f;
                    }
                    C119793ao aoVar2 = arVar2.f333680b;
                    if (aoVar2 == null) {
                        aoVar2 = C119793ao.f333670e;
                    }
                    C119769s sVar3 = new C119769s(tVar, j, dyVar2, bVar2.mo40056a(dyVar3, aoVar2));
                    synchronized (tVar.f333631d) {
                        z = !tVar.f333633f;
                        if (z) {
                            tVar.f333632e.put(valueOf, sVar3);
                        }
                    }
                    if (!z) {
                        C59081b.m91349a(C119938a.f334012b, "metadata key");
                        sVar3.mo104512a();
                    } else {
                        C59081b.m91349a(C119938a.f334012b, "metadata key");
                    }
                } else if (ordinal == 1) {
                    synchronized (tVar.f333631d) {
                        sVar = (C119769s) tVar.f333632e.get(valueOf);
                    }
                    if (sVar != null) {
                        C59104x b7 = C119770t.f333628a.mo56224b();
                        b7.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
                        C59052c cVar3 = (C59052c) b7;
                        cVar3.mo56378ag(C119938a.f334012b, valueOf);
                        ((C59052c) cVar3.mo56372aa(34584)).mo56389s("Committing session %s", sVar.f333625c);
                        synchronized (sVar) {
                            if (sVar.f333626d == null) {
                                sVar.f333626d = sVar.f333625c.mo104299a();
                                C60856cj.m92911t(sVar.f333626d, C47810es.m84974n(new C119768r(sVar)), sVar.f333627e.f333630c);
                            }
                        }
                    }
                } else if (ordinal == 2) {
                    synchronized (tVar.f333631d) {
                        sVar2 = (C119769s) tVar.f333632e.remove(valueOf);
                    }
                    if (sVar2 != null) {
                        C59104x b8 = C119770t.f333628a.mo56224b();
                        b8.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
                        C59052c cVar4 = (C59052c) b8;
                        cVar4.mo56378ag(C119938a.f334012b, valueOf);
                        ((C59052c) cVar4.mo56372aa(34583)).mo56389s("Aborting session %s", sVar2.f333625c);
                        sVar2.mo104512a();
                    }
                }
                b4.close();
            } catch (Throwable th) {
                Throwable th2 = th;
                try {
                    b4.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th2, new Object[]{th3});
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } else if (i3 == 4) {
            C32525r rVar = oVar.f333617i;
            if (i == 5) {
                cVar = (C32510c) doVar.f333844b;
            } else {
                cVar = C32510c.f87086e;
            }
            rVar.mo38128b(cVar);
        }
    }
}
