package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123741bh;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.libraries.logging.C28260b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.assistant.p3980n.p3985c.C53021l;
import com.google.assistant.p3980n.p3985c.C53023n;
import com.google.assistant.p3980n.p3985c.C53024o;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4816ai.p4818b.C63203i;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bz */
/* compiled from: PG */
public final /* synthetic */ class C18853bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18868cn f53095a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f53096b;

    /* renamed from: c */
    public final /* synthetic */ Set f53097c;

    public /* synthetic */ C18853bz(C18868cn cnVar, C53306j jVar, Set set) {
        this.f53095a = cnVar;
        this.f53096b = jVar;
        this.f53097c = set;
    }

    public final C60870cx apply(Object obj) {
        C58331bb bbVar;
        C123742bi biVar;
        C123742bi biVar2;
        C123742bi biVar3;
        C123730ax axVar;
        C18868cn cnVar = this.f53095a;
        C53306j jVar = this.f53096b;
        Set set = this.f53097c;
        List list = (List) obj;
        C58833ax axVar2 = list.get(0) == null ? C58836b.f156633a : (C58833ax) list.get(0);
        C58833ax axVar3 = list.get(1) == null ? C58836b.f156633a : (C58833ax) list.get(1);
        if (axVar3.mo56113h()) {
            bbVar = new C58331bb();
            cnVar.f53117c = C28260b.m52825a();
            int i = 0;
            for (C118363e eVar : ((C118365g) axVar3.mo56107c()).f328544a) {
                if (eVar.f328535b == 5 && !((C123730ax) eVar.f328536c).f341769a.isEmpty()) {
                    if (eVar.f328535b == 5) {
                        axVar = (C123730ax) eVar.f328536c;
                    } else {
                        axVar = C123730ax.f341767b;
                    }
                    for (C123728av avVar : axVar.f341769a) {
                        if (!cnVar.f53119e.mo24225a(avVar.f341756b)) {
                            ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47474)).mo56389s("Non audio player app {%s} filtered out when merging with Potter recommendations.", avVar.f341756b);
                        } else {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            ArrayList arrayList = new ArrayList();
                            for (C52560wg builder : avVar.f341758d) {
                                C52559wf wfVar = (C52559wf) builder.toBuilder();
                                C63203i iVar = (C63203i) C63204j.f170749e.createBuilder();
                                iVar.copyOnWrite();
                                C63204j jVar2 = (C63204j) iVar.instance;
                                jVar2.f170753c = 3;
                                jVar2.f170754d = Integer.valueOf(i);
                                C60218r rVar = cnVar.f53117c;
                                iVar.copyOnWrite();
                                C63204j jVar3 = (C63204j) iVar.instance;
                                rVar.getClass();
                                jVar3.f170752b = rVar;
                                jVar3.f170751a = 2;
                                wfVar.copyOnWrite();
                                C52560wg wgVar = (C52560wg) wfVar.instance;
                                C63204j jVar4 = (C63204j) iVar.build();
                                jVar4.getClass();
                                wgVar.f137953i = jVar4;
                                wgVar.f137945a |= 8192;
                                arrayList.add((C52560wg) wfVar.build());
                                i++;
                            }
                            arrayDeque.addAll(arrayList);
                            bbVar.mo54920x(avVar.f341756b, arrayDeque);
                            ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47473)).mo56359L("App {%s/%s} size {%s} to be merged with Potter recommendations.", avVar.f341756b, avVar.f341757c, Integer.valueOf(avVar.f341758d.size()));
                        }
                    }
                }
            }
        } else {
            bbVar = new C58331bb();
        }
        C58331bb bbVar2 = bbVar;
        if (axVar2.mo56113h()) {
            C118365g gVar = (C118365g) axVar2.mo56107c();
            C123741bh bhVar = (C123741bh) C123742bi.f341800b.createBuilder();
            ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47467)).mo56387q("Potter proactive data list size %s", gVar.f328544a.size());
            for (C118363e eVar2 : gVar.f328544a) {
                C59052c cVar = (C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47468);
                if (eVar2.f328535b == 6) {
                    biVar2 = (C123742bi) eVar2.f328536c;
                } else {
                    biVar2 = C123742bi.f341800b;
                }
                cVar.mo56387q("Potter media section size %s", biVar2.f341802a.size());
                if (eVar2.f328535b == 6) {
                    biVar3 = (C123742bi) eVar2.f328536c;
                } else {
                    biVar3 = C123742bi.f341800b;
                }
                for (C53020k kVar : biVar3.f341802a) {
                    C59052c cVar2 = (C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47469);
                    C53024o oVar = kVar.f138973b;
                    if (oVar == null) {
                        oVar = C53024o.f138977d;
                    }
                    int b = C53023n.m86772b(oVar.f138981c);
                    if (b == 0) {
                        b = 1;
                    }
                    cVar2.mo56352E("Potter media section type %s size %s", C53023n.m86771a(b), kVar.f138974c.size());
                    C52567wn wnVar = C52567wn.UNKNOWN;
                    C53024o oVar2 = kVar.f138973b;
                    if (oVar2 == null) {
                        oVar2 = C53024o.f138977d;
                    }
                    int b2 = C53023n.m86772b(oVar2.f138981c);
                    if (b2 == 0) {
                        b2 = 1;
                    }
                    int i2 = b2 - 1;
                    if (i2 == 1) {
                        bhVar.mo106122b(cnVar.mo24200c(kVar, bbVar2, jVar, set, false));
                    } else if (i2 == 2) {
                        bhVar.mo106122b(cnVar.mo24200c(kVar, bbVar2, jVar, set, true));
                    }
                }
            }
            biVar = (C123742bi) bhVar.build();
        } else {
            C123741bh bhVar2 = (C123741bh) C123742bi.f341800b.createBuilder();
            ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47470)).mo56386p("#mergeMediaRecommendationWithOnDeviceMedia() Potter future fails or empty.");
            C53019j jVar5 = (C53019j) C53020k.f138970d.createBuilder();
            Iterator it = bbVar2.mo54950C().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                boolean z = false;
                for (Queue<C52560wg> it2 : (Collection) it.next()) {
                    for (C52560wg d : it2) {
                        z = C18868cn.m36292d(jVar5, d, jVar, set);
                    }
                }
                if (z) {
                    ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47471)).mo56386p("#mergeMediaRecommendationWithOnDeviceMedia() One on-device media app content has been added.");
                    break;
                }
            }
            if (!Collections.unmodifiableList(((C53020k) jVar5.instance).f138974c).isEmpty()) {
                C53021l lVar = (C53021l) C53024o.f138977d.createBuilder();
                lVar.copyOnWrite();
                C53024o oVar3 = (C53024o) lVar.instance;
                oVar3.f138981c = 2;
                oVar3.f138979a |= 4;
                jVar5.copyOnWrite();
                C53020k kVar2 = (C53020k) jVar5.instance;
                C53024o oVar4 = (C53024o) lVar.build();
                oVar4.getClass();
                kVar2.f138973b = oVar4;
                kVar2.f138972a |= 1;
                bhVar2.mo106122b(jVar5);
            }
            biVar = (C123742bi) bhVar2.build();
        }
        if (!cnVar.f53123i.contains(Integer.valueOf(jVar.f139793X)) || (!biVar.f341802a.isEmpty() && !Collection.EL.stream(biVar.f341802a).flatMap(C18851bx.f53093a).allMatch(C18852by.f53094a))) {
            return C60856cj.m92900i(biVar);
        }
        ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47475)).mo56386p("No on-device or potter media recommendations. Querying fallback Google Podcast and News recommendations.");
        return C60922j.m93044g(C60922j.m93045h(cnVar.f53120f.mo24192a(C18868cn.f53116b, jVar, C58485gu.m89845m()), C47810es.m84966f(new C18855ca(cnVar)), cnVar.f53121g), C47810es.m84963c(new C18856cb(cnVar, biVar, jVar)), cnVar.f53121g);
    }
}
