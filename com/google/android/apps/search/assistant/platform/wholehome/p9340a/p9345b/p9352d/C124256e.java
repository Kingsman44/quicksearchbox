package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9352d;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import com.google.assistant.p3741aa.C48170e;
import com.google.assistant.p3741aa.C48171f;
import com.google.assistant.p3741aa.C48172g;
import com.google.assistant.p3741aa.C48173h;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.d.e */
/* compiled from: PG */
public final /* synthetic */ class C124256e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124258g f343068a;

    /* renamed from: b */
    public final /* synthetic */ C124206v f343069b;

    public /* synthetic */ C124256e(C124258g gVar, C124206v vVar) {
        this.f343068a = gVar;
        this.f343069b = vVar;
    }

    public final void run() {
        C52078ek ekVar;
        C52078ek ekVar2;
        C52070ec ecVar;
        C124258g gVar = this.f343068a;
        C48173h hVar = this.f343069b.f342967b;
        if (hVar == null) {
            hVar = C48173h.f124650e;
        }
        C48170e eVar = (C48170e) C48173h.f124650e.createBuilder();
        if ((hVar.f124652a & 1) != 0) {
            boolean z = hVar.f124653b;
            eVar.copyOnWrite();
            C48173h hVar2 = (C48173h) eVar.instance;
            hVar2.f124652a |= 1;
            hVar2.f124653b = z;
        }
        if ((hVar.f124652a & 2) != 0) {
            C63088z zVar = hVar.f124655d;
            eVar.copyOnWrite();
            C48173h hVar3 = (C48173h) eVar.instance;
            zVar.getClass();
            hVar3.f124652a |= 2;
            hVar3.f124655d = zVar;
        }
        for (C48172g gVar2 : hVar.f124654c) {
            C52235kf kfVar = C52235kf.OK;
            ArrayList arrayList = new ArrayList();
            if (!gVar2.f124647c.isEmpty()) {
                C52083ep epVar = (C52083ep) gVar2.f124647c.get(0);
                if (epVar.f136692b == 3) {
                    ekVar2 = (C52078ek) epVar.f136693c;
                } else {
                    ekVar2 = C52078ek.f136671f;
                }
                if (ekVar2.f136674b == 3) {
                    ecVar = (C52070ec) ekVar2.f136675c;
                } else {
                    ecVar = C52070ec.f136651d;
                }
                C52236kg kgVar = ecVar.f136654b;
                if (kgVar == null) {
                    kgVar = C52236kg.f137089d;
                }
                kfVar = C52235kf.m86549a(kgVar.f137092b);
                if (kfVar == null) {
                    kfVar = C52235kf.OK;
                }
            }
            if (kfVar == C52235kf.DEADLINE_EXCEEDED || kfVar == C52235kf.UNAVAILABLE || kfVar == C52235kf.UNAUTHENTICATED) {
                String str = gVar2.f124646b;
                if (!gVar.f343074c.containsKey(str)) {
                    ((C59052c) ((C59052c) C124259h.f343076a.mo56225c()).mo56372aa(36135)).mo56389s("Device id: %s does not exist in deviceIdInteractionIdMap generated from ExecuteInteractionDeltaRequest.", str);
                } else {
                    for (Integer intValue : (List) gVar.f343074c.get(str)) {
                        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                        int intValue2 = intValue.intValue();
                        eoVar.copyOnWrite();
                        C52083ep epVar2 = (C52083ep) eoVar.instance;
                        epVar2.f136691a |= 2;
                        epVar2.f136695e = intValue2;
                        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
                        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
                        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
                        kdVar.copyOnWrite();
                        C52236kg kgVar2 = (C52236kg) kdVar.instance;
                        kgVar2.f137092b = kfVar.f137088t;
                        kgVar2.f137091a |= 1;
                        dzVar.copyOnWrite();
                        C52070ec ecVar2 = (C52070ec) dzVar.instance;
                        C52236kg kgVar3 = (C52236kg) kdVar.build();
                        kgVar3.getClass();
                        ecVar2.f136654b = kgVar3;
                        ecVar2.f136653a |= 1;
                        ejVar.copyOnWrite();
                        C52078ek ekVar3 = (C52078ek) ejVar.instance;
                        C52070ec ecVar3 = (C52070ec) dzVar.build();
                        ecVar3.getClass();
                        ekVar3.f136675c = ecVar3;
                        ekVar3.f136674b = 3;
                        eoVar.copyOnWrite();
                        C52083ep epVar3 = (C52083ep) eoVar.instance;
                        C52078ek ekVar4 = (C52078ek) ejVar.build();
                        ekVar4.getClass();
                        epVar3.f136693c = ekVar4;
                        epVar3.f136692b = 3;
                        arrayList.add((C52083ep) eoVar.build());
                    }
                }
            } else {
                for (C52083ep epVar4 : gVar2.f124647c) {
                    if (epVar4.f136692b == 3) {
                        ekVar = (C52078ek) epVar4.f136693c;
                    } else {
                        ekVar = C52078ek.f136671f;
                    }
                    if (ekVar.f136674b == 3) {
                        arrayList.add(epVar4);
                    }
                }
            }
            C48171f fVar = (C48171f) C48172g.f124643f.createBuilder();
            fVar.copyOnWrite();
            C48172g gVar3 = (C48172g) fVar.instance;
            gVar3.mo53145a();
            C62947c.addAll((Iterable) arrayList, (List) gVar3.f124647c);
            C62971cq cqVar = gVar2.f124648d;
            fVar.copyOnWrite();
            C48172g gVar4 = (C48172g) fVar.instance;
            C62971cq cqVar2 = gVar4.f124648d;
            if (!cqVar2.mo58948c()) {
                gVar4.f124648d = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) gVar4.f124648d);
            if ((gVar2.f124645a & 1) != 0) {
                String str2 = gVar2.f124646b;
                fVar.copyOnWrite();
                C48172g gVar5 = (C48172g) fVar.instance;
                str2.getClass();
                gVar5.f124645a |= 1;
                gVar5.f124646b = str2;
            }
            if ((gVar2.f124645a & 2) != 0) {
                long j = gVar2.f124649e;
                fVar.copyOnWrite();
                C48172g gVar6 = (C48172g) fVar.instance;
                gVar6.f124645a |= 2;
                gVar6.f124649e = j;
            }
            eVar.mo53143a(fVar);
        }
        gVar.f343073b.mo20123c((C48173h) eVar.build());
        gVar.f343073b.mo20121a();
        gVar.f343075d.f343078c.mo106353a(Optional.empty());
    }
}
