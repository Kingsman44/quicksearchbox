package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f;

import android.content.Intent;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.C106602a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106599k;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106521b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106526d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106555d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107048a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107058b;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import com.google.assistant.p4016z.C53732q;
import com.google.assistant.p4016z.C53734s;
import com.google.common.base.C58851bo;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.C62953e;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.d */
/* compiled from: PG */
public final class C107039d implements C106602a, C90991b {

    /* renamed from: a */
    public final C58974d f298071a;

    /* renamed from: b */
    private final C107040e f298072b;

    /* renamed from: c */
    private final Set f298073c;

    /* renamed from: d */
    private final C83807w f298074d;

    /* renamed from: e */
    private final C90021c f298075e;

    /* renamed from: f */
    private final C83785c f298076f;

    /* renamed from: g */
    private final C107048a f298077g;

    public C107039d(Set set, C90021c cVar, C91022f fVar, C107040e eVar, C83807w wVar, C83564a aVar, C83785c cVar2, C107048a aVar2) {
        this.f298073c = set;
        this.f298075e = cVar;
        this.f298072b = eVar;
        this.f298074d = wVar;
        C58974d a = aVar.mo76900a("AA.Context");
        this.f298071a = a;
        this.f298076f = cVar2;
        this.f298077g = aVar2;
        ((C58970a) ((C58970a) a.mo56224b()).mo56372aa(23444)).mo56387q("Forwarding trigger sources: %d", ((C58733pz) set).f156501f);
        fVar.mo85301a(this);
    }

    /* renamed from: a */
    public final C60870cx mo95591a(Intent intent) {
        C60870cx cxVar;
        Intent intent2 = intent;
        C47558bi a = C47831fm.m85006a("AmbientAssistantIntentHandler#handleIntent");
        try {
            if (!this.f298075e.mo79746e(C90017bw.f247872N)) {
                C60870cx cxVar2 = C118826c.f331423b;
                a.close();
                return cxVar2;
            }
            String action = intent.getAction();
            ((C58970a) ((C58970a) this.f298071a.mo56224b()).mo56372aa(23440)).mo56389s("handleIntent(): action:%s", action);
            if ("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH".equals(action)) {
                C60870cx i = this.f298076f.mo77127i();
                a.close();
                return i;
            } else if (!"com.google.android.apps.gsa.staticplugins.opa.ambient.context.ACTION_PROCESS_TRIGGER".equals(action)) {
                C60870cx cxVar3 = C118826c.f331423b;
                a.close();
                return cxVar3;
            } else {
                byte[] byteArrayExtra = intent2.getByteArrayExtra("stats");
                if (byteArrayExtra == null) {
                    ((C58970a) ((C58970a) this.f298071a.mo56226d()).mo56372aa(23449)).mo56386p("Interactor stats not available");
                } else {
                    C106600l lVar = (C106600l) C62942bv.parseFrom((C62942bv) C106600l.f297227d, byteArrayExtra, C62921ba.m95368a());
                    this.f298074d.mo77192a(C118569b.SMARTSPACE_SEARCH_PROCESS_STARTED_COUNT, true != lVar.f297230b ? 0 : 1);
                    if (lVar.f297230b) {
                        ((C58970a) ((C58970a) this.f298071a.mo56224b()).mo56372aa(23448)).mo56387q("Metric SMARTSPACE_SEARCH_PROCESS_STARTED_COUNT += %d", 1);
                    }
                    if (lVar.f297231c.size() != 0) {
                        this.f298074d.mo77192a(C118569b.SMARTSPACE_SEARCH_PROCESS_DOWN_COUNT, (long) lVar.f297231c.size());
                        ((C58970a) ((C58970a) this.f298071a.mo56224b()).mo56372aa(23446)).mo56387q("Metric SMARTSPACE_SEARCH_PROCESS_DOWN_COUNT += %d", lVar.f297231c.size());
                        C107048a aVar = this.f298077g;
                        for (C106599k kVar : lVar.f297231c) {
                            C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
                            int i2 = kVar.f297224b;
                            if (i2 == 3) {
                                C106586c cVar = (C106586c) kVar.f297225c;
                                bkVar.copyOnWrite();
                                C53715bm bmVar = (C53715bm) bkVar.instance;
                                cVar.getClass();
                                bmVar.f141024b = cVar;
                                bmVar.f141023a = 2;
                            } else if (i2 == 2) {
                                C106555d dVar = (C106555d) kVar.f297225c;
                                bkVar.copyOnWrite();
                                C53715bm bmVar2 = (C53715bm) bkVar.instance;
                                dVar.getClass();
                                bmVar2.f141024b = dVar;
                                bmVar2.f141023a = 1;
                            }
                            long nextLong = C58851bo.f156649a.nextLong();
                            long j = nextLong;
                            aVar.mo95743c((C53715bm) bkVar.build(), nextLong, kVar.f297226d);
                            C53732q qVar = (C53732q) C53734s.f141066i.createBuilder();
                            qVar.copyOnWrite();
                            C53734s sVar = (C53734s) qVar.instance;
                            sVar.f141075h = 7;
                            sVar.f141068a |= 512;
                            C53734s sVar2 = (C53734s) qVar.build();
                            C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
                            C63042fg i3 = C62953e.m95484i(kVar.f297226d + 1);
                            ajVar.copyOnWrite();
                            C53686ak akVar = (C53686ak) ajVar.instance;
                            i3.getClass();
                            akVar.f140918d = i3;
                            akVar.f140915a |= 1;
                            ajVar.copyOnWrite();
                            C53686ak akVar2 = (C53686ak) ajVar.instance;
                            sVar2.getClass();
                            akVar2.f140917c = sVar2;
                            akVar2.f140916b = 2;
                            ajVar.copyOnWrite();
                            C53686ak akVar3 = (C53686ak) ajVar.instance;
                            akVar3.f140915a = 2 | akVar3.f140915a;
                            akVar3.f140919e = j;
                            ((C107058b) aVar.f298089b.mo17428b()).mo95744a((C53686ak) ajVar.build());
                        }
                    }
                }
                String stringExtra = intent2.getStringExtra("source");
                stringExtra.getClass();
                C106526d a2 = C106526d.m177303a(stringExtra);
                C106546e eVar = (C106546e) C106546e.f297121d.get(a2);
                if (eVar == null) {
                    ((C58970a) ((C58970a) this.f298071a.mo56226d()).mo56372aa(23441)).mo56389s("Unknown trigger source: %s", a2);
                    C60870cx cxVar4 = C118826c.f331423b;
                    a.close();
                    return cxVar4;
                }
                byte[] byteArrayExtra2 = intent2.getByteArrayExtra("event");
                if (byteArrayExtra2 == null) {
                    ((C58970a) ((C58970a) this.f298071a.mo56226d()).mo56372aa(23443)).mo56386p("Could not parse event.");
                    cxVar = C118826c.f331423b;
                } else {
                    try {
                        MessageLite messageLite = (MessageLite) eVar.mo95558c().mo59010i(byteArrayExtra2);
                        Collection.EL.stream(this.f298073c).filter(new C107019a(eVar)).forEach(new C107037b(this, messageLite));
                        cxVar = this.f298072b.mo95738a(eVar, messageLite);
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) this.f298071a.mo56226d()).mo56382g(e)).mo56372aa(23442)).mo56386p("Could not parse event.");
                        cxVar = C118826c.f331423b;
                    }
                }
                a.mo51417a(cxVar);
                a.close();
                return cxVar;
            }
        } catch (C62974ct e2) {
            ((C58970a) ((C58970a) ((C58970a) this.f298071a.mo56226d()).mo56382g(e2)).mo56372aa(23447)).mo56386p("Could not parse interactor stats.");
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                a.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th2, new Object[]{th3});
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AmbientAssistantIntentHandler");
        C58801sm G = ((C58471gg) this.f298073c).mo55229u().listIterator(0);
        while (G.hasNext()) {
            fVar.mo85286m((C106521b) G.next());
        }
        fVar.mo85286m(this.f298072b);
    }
}
