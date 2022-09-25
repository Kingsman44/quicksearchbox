package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.assist.C9386c;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.apps.gsa.assist.C9407e;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.C9417g;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62963cj;
import com.google.protos.p4985f.p4988b.p4990b.C64736b;
import com.google.protos.p4985f.p4988b.p4990b.C64738d;
import com.google.protos.p4985f.p4988b.p4990b.C64741g;
import com.google.protos.p4985f.p4988b.p4990b.C64742h;
import com.google.protos.p4985f.p4988b.p4990b.C64743i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.l */
/* compiled from: PG */
public final /* synthetic */ class C92963l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C92970s f259317a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f259318b;

    /* renamed from: c */
    public final /* synthetic */ C64741g f259319c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f259320d;

    public /* synthetic */ C92963l(C92970s sVar, C60870cx cxVar, C64741g gVar, C60870cx cxVar2) {
        this.f259317a = sVar;
        this.f259318b = cxVar;
        this.f259319c = gVar;
        this.f259320d = cxVar2;
    }

    public final Object call() {
        C64738d dVar;
        C92970s sVar = this.f259317a;
        C60870cx cxVar = this.f259318b;
        C64741g gVar = this.f259319c;
        C60870cx cxVar2 = this.f259320d;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        if (!axVar.mo56113h() && !new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.DIRECT_ACTION_DATA)) {
            sVar.f259331c.mo19974a(C37182a.f98256z.mo40805c(C62722b.NOT_FOUND));
            ((C59052c) ((C59052c) C92970s.f259329a.mo56226d()).mo56372aa(13233)).mo56386p("Null assist data future.");
            return sVar.mo87493b(C52235kf.NOT_FOUND, "Null assist data future.");
        } else if (!new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.SCREENSHOT) || (axVar.mo56113h() && (((C9418h) axVar.mo56107c()).f32716a & 2) != 0)) {
            if (new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.DIRECT_ACTION_DATA)) {
                dVar = (C64738d) ((C58833ax) C60856cj.m92910s(cxVar2)).mo56109e(C64738d.f175490b);
            } else {
                dVar = C64738d.f175490b;
            }
            C9418h hVar = (C9418h) axVar.mo56107c();
            if (!sVar.f259333e.mo79746e(C90125fw.f250935n)) {
                C62963cj cjVar = new C62963cj(gVar.f175496a, C64741g.f175493b);
                if (!cjVar.isEmpty()) {
                    if (!cjVar.contains(C64736b.SCREENSHOT)) {
                        C9417g gVar2 = (C9417g) hVar.toBuilder();
                        gVar2.copyOnWrite();
                        C9418h hVar2 = (C9418h) gVar2.instance;
                        hVar2.f32719d = null;
                        hVar2.f32716a &= -3;
                        hVar = (C9418h) gVar2.build();
                    }
                    boolean contains = cjVar.contains(C64736b.APP_PACKAGE_METADATA);
                    boolean contains2 = cjVar.contains(C64736b.WEB_URI);
                    C9417g gVar3 = (C9417g) hVar.toBuilder();
                    gVar3.copyOnWrite();
                    ((C9418h) gVar3.instance).f32717b = C9418h.emptyProtobufList();
                    ArrayList arrayList = new ArrayList();
                    for (C9410f fVar : hVar.f32717b) {
                        C9407e eVar = (C9407e) C9410f.f32690f.createBuilder();
                        if (contains) {
                            String str = fVar.f32693b;
                            eVar.copyOnWrite();
                            C9410f fVar2 = (C9410f) eVar.instance;
                            str.getClass();
                            fVar2.f32692a |= 1;
                            fVar2.f32693b = str;
                            int i = fVar.f32694c;
                            eVar.copyOnWrite();
                            C9410f fVar3 = (C9410f) eVar.instance;
                            fVar3.f32692a |= 2;
                            fVar3.f32694c = i;
                            int i2 = fVar.f32695d;
                            eVar.copyOnWrite();
                            C9410f fVar4 = (C9410f) eVar.instance;
                            fVar4.f32692a |= 4;
                            fVar4.f32695d = i2;
                        }
                        for (C9405d dVar2 : fVar.f32696e) {
                            C9386c cVar = (C9386c) C9405d.f32673k.createBuilder();
                            if (contains2) {
                                String str2 = dVar2.f32679e;
                                cVar.copyOnWrite();
                                C9405d dVar3 = (C9405d) cVar.instance;
                                str2.getClass();
                                dVar3.f32675a |= 8;
                                dVar3.f32679e = str2;
                            }
                            eVar.mo17658a(cVar);
                        }
                        arrayList.add((C9410f) eVar.build());
                    }
                    gVar3.copyOnWrite();
                    C9418h hVar3 = (C9418h) gVar3.instance;
                    hVar3.mo17673a();
                    C62947c.addAll((Iterable) arrayList, (List) hVar3.f32717b);
                    hVar = (C9418h) gVar3.build();
                }
            }
            sVar.f259331c.mo19974a(C37182a.f97742A.mo40805c(C62722b.OK));
            C64742h hVar4 = (C64742h) C64743i.f175499e.createBuilder();
            hVar4.copyOnWrite();
            C64743i iVar = (C64743i) hVar4.instance;
            hVar.getClass();
            iVar.f175502b = hVar;
            iVar.f175501a |= 1;
            hVar4.copyOnWrite();
            C64743i iVar2 = (C64743i) hVar4.instance;
            dVar.getClass();
            iVar2.f175504d = dVar;
            iVar2.f175501a |= 4;
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.OK;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            hVar4.copyOnWrite();
            C64743i iVar3 = (C64743i) hVar4.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            iVar3.f175503c = kgVar2;
            iVar3.f175501a |= 2;
            return C22402a.m41821a("fetch_assist_data_result", "assistant.api.client_op.FetchAssistDataResult", hVar4.build());
        } else {
            sVar.f259331c.mo19974a(C37182a.f98256z.mo40805c(C62722b.NOT_FOUND));
            ((C59052c) ((C59052c) C92970s.f259329a.mo56226d()).mo56372aa(13232)).mo56386p("Null screenshot future.");
            return sVar.mo87493b(C52235kf.NOT_FOUND, "Null screenshot future.");
        }
    }
}
