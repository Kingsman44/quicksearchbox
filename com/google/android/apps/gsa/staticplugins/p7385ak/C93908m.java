package com.google.android.apps.gsa.staticplugins.p7385ak;

import com.google.android.apps.gsa.f.a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51060ex;
import com.google.assistant.p3897e.p3902c.p3907c.C51061ey;
import com.google.assistant.p3897e.p3902c.p3907c.C51099gi;
import com.google.assistant.p3897e.p3902c.p3907c.C51100gj;
import com.google.assistant.p3897e.p3921j.C51692at;
import com.google.assistant.p3897e.p3921j.C51693au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63070h;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4985f.p5030q.p5032b.C65039ax;
import com.google.protos.p4985f.p5030q.p5032b.C65042b;
import com.google.protos.p4985f.p5030q.p5032b.C65057d;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65761as;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.m */
/* compiled from: PG */
public final /* synthetic */ class C93908m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262257a;

    /* renamed from: b */
    public final /* synthetic */ String f262258b;

    public /* synthetic */ C93908m(C93914s sVar, String str) {
        this.f262257a = sVar;
        this.f262258b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C65057d dVar;
        C93914s sVar = this.f262257a;
        String str = this.f262258b;
        C65039ax axVar = (C65039ax) obj;
        if (axVar.f176128a.size() == 0) {
            C59104x d = C93914s.f262266a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
            ((C59052c) ((C59052c) d).mo56372aa(19317)).mo56386p("No snapshot from geller is available yet.");
        } else if (axVar.f176128a.size() > 1) {
            C59104x d2 = C93914s.f262266a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
            ((C59052c) ((C59052c) d2).mo56372aa(19316)).mo56387q("exactly 1 corpus snapshot is expected, got %d", axVar.f176128a.size());
        } else {
            C65042b bVar = (C65042b) axVar.f176128a.get(0);
            int i = 2;
            if (bVar.f176139a == 2) {
                dVar = (C65057d) bVar.f176140b;
            } else {
                dVar = C65057d.f176173d;
            }
            if (dVar.f176177c.isEmpty()) {
                C59104x d3 = C93914s.f262266a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
                ((C59052c) ((C59052c) d3).mo56372aa(19315)).mo56386p("missing version info.");
            } else {
                try {
                    C58976aa aaVar = C58975e.f156826a;
                    String str2 = dVar.f176177c;
                    if (str2 != null) {
                        C58480gp e = C58485gu.m89837e();
                        HashSet hashSet = new HashSet();
                        for (C65768az azVar : dVar.f176176b) {
                            if (!hashSet.contains(azVar.f178798d)) {
                                hashSet.add(azVar.f178798d);
                                String str3 = azVar.f178798d;
                                C51692at atVar = (C51692at) C51693au.f135615c.createBuilder();
                                C51099gi giVar = (C51099gi) C51100gj.f133015c.createBuilder();
                                C51060ex exVar = (C51060ex) C51061ey.f132958e.createBuilder();
                                exVar.copyOnWrite();
                                C51061ey eyVar = (C51061ey) exVar.instance;
                                eyVar.f132962c = i;
                                eyVar.f132960a |= i;
                                C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                                esVar.copyOnWrite();
                                C51058ev evVar = (C51058ev) esVar.instance;
                                str3.getClass();
                                evVar.f132943a |= 1;
                                evVar.f132944b = str3;
                                exVar.copyOnWrite();
                                C51061ey eyVar2 = (C51061ey) exVar.instance;
                                C51058ev evVar2 = (C51058ev) esVar.build();
                                evVar2.getClass();
                                eyVar2.f132961b = evVar2;
                                eyVar2.f132960a |= 1;
                                giVar.copyOnWrite();
                                C51100gj gjVar = (C51100gj) giVar.instance;
                                C51061ey eyVar3 = (C51061ey) exVar.build();
                                eyVar3.getClass();
                                gjVar.f133018b = eyVar3;
                                gjVar.f133017a = 1;
                                atVar.copyOnWrite();
                                C51693au auVar = (C51693au) atVar.instance;
                                C51100gj gjVar2 = (C51100gj) giVar.build();
                                gjVar2.getClass();
                                auVar.f135618b = gjVar2;
                                auVar.f135617a |= 1;
                                e.mo55395g((C51693au) atVar.build());
                                i = 2;
                            }
                        }
                        HashMap hashMap = new HashMap();
                        for (C65768az azVar2 : dVar.f176175a) {
                            if (!hashMap.containsKey(azVar2.f178798d)) {
                                hashMap.put(azVar2.f178798d, azVar2);
                            } else {
                                C65768az azVar3 = (C65768az) hashMap.get(azVar2.f178798d);
                                azVar3.getClass();
                                C65139d dVar2 = azVar3.f178796b;
                                if (dVar2 == null) {
                                    dVar2 = C65139d.f176307e;
                                }
                                long j = dVar2.f176310b;
                                C65139d dVar3 = azVar2.f178796b;
                                if (dVar3 == null) {
                                    dVar3 = C65139d.f176307e;
                                }
                                if (j < dVar3.f176310b) {
                                    hashMap.put(azVar2.f178798d, azVar2);
                                }
                            }
                        }
                        for (C65768az azVar4 : hashMap.values()) {
                            C63070h hVar = azVar4.f178799e;
                            if (hVar == null) {
                                hVar = C63070h.f170215c;
                            }
                            C65761as asVar = (C65761as) C62942bv.parseFrom((C62942bv) C65761as.f178776d, hVar.f170218b, C62921ba.f169869a);
                            C51692at atVar2 = (C51692at) C51693au.f135615c.createBuilder();
                            C51099gi giVar2 = (C51099gi) C51100gj.f133015c.createBuilder();
                            C51060ex exVar2 = (C51060ex) C51061ey.f132958e.createBuilder();
                            exVar2.copyOnWrite();
                            C51061ey eyVar4 = (C51061ey) exVar2.instance;
                            eyVar4.f132962c = 1;
                            eyVar4.f132960a |= 2;
                            C63042fg i2 = C62953e.m95484i(asVar.f178780c);
                            exVar2.copyOnWrite();
                            C51061ey eyVar5 = (C51061ey) exVar2.instance;
                            i2.getClass();
                            eyVar5.f132963d = i2;
                            eyVar5.f132960a |= 4;
                            C51058ev evVar3 = asVar.f178779b;
                            if (evVar3 == null) {
                                evVar3 = C51058ev.f132941o;
                            }
                            exVar2.copyOnWrite();
                            C51061ey eyVar6 = (C51061ey) exVar2.instance;
                            evVar3.getClass();
                            eyVar6.f132961b = evVar3;
                            eyVar6.f132960a |= 1;
                            giVar2.copyOnWrite();
                            C51100gj gjVar3 = (C51100gj) giVar2.instance;
                            C51061ey eyVar7 = (C51061ey) exVar2.build();
                            eyVar7.getClass();
                            gjVar3.f133018b = eyVar7;
                            gjVar3.f133017a = 1;
                            atVar2.copyOnWrite();
                            C51693au auVar2 = (C51693au) atVar2.instance;
                            C51100gj gjVar4 = (C51100gj) giVar2.build();
                            gjVar4.getClass();
                            auVar2.f135618b = gjVar4;
                            auVar2.f135617a |= 1;
                            e.mo55395g((C51693au) atVar2.build());
                        }
                        C58485gu f = e.mo55394f();
                        if (f != null) {
                            sVar.f262272i.mo88213a(str, new a(f, str2));
                        } else {
                            throw new NullPointerException("Null deltaSinceLastSync");
                        }
                    } else {
                        throw new NullPointerException("Null versionInfo");
                    }
                } catch (C62974ct e2) {
                    C59104x d4 = C93914s.f262266a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
                    ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e2)).mo56372aa(19314)).mo56386p("Failed to parse element data.");
                }
            }
        }
        return C118826c.f331422a;
    }
}
