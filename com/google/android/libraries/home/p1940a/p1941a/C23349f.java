package com.google.android.libraries.home.p1940a.p1941a;

import androidx.p060c.C0977g;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.home.p1940a.p1943c.C23415ar;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1946d.C23610k;
import com.google.android.libraries.home.p1940a.p1946d.C23611l;
import com.google.android.libraries.home.p1955d.p1956a.C23765a;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64284ac;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64285ad;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64286ae;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64288ag;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64289ah;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64301at;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64302au;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64324bp;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64326br;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5381j.p5382a.C68786a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.a.f */
/* compiled from: PG */
public final class C23349f {
    /* renamed from: a */
    public static final C64308b m43785a(Collection collection) {
        String str;
        C69664n.m101061g(collection, "params");
        C64301at atVar = (C64301at) C64302au.f173853h.createBuilder();
        C69664n.m101060f(atVar, "newBuilder()");
        atVar.copyOnWrite();
        C64302au auVar = (C64302au) atVar.instance;
        auVar.f173855a |= 1;
        auVar.f173857c = BuildConfig.FLAVOR;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C23415ar arVar = (C23415ar) it.next();
            C0977g gVar = new C0977g();
            C58565jt jtVar = new C58565jt(((C58759qy) arVar.f63988b).f156534a);
            while (jtVar.hasNext()) {
                C23544dr drVar = (C23544dr) jtVar.next();
                C69664n.m101059e(drVar, "null cannot be cast to non-null type com.google.android.libraries.home.automation.model.HomeAutomationParameter<*>");
                if (!drVar.mo28879g()) {
                    C59052c cVar = (C59052c) C23350g.f63883a.mo56226d();
                    Optional j = drVar.mo28914j();
                    cVar.mo56379ah(new C59094n(48662));
                    cVar.mo56389s("Parameter type %s should be writable.", j);
                } else {
                    C52023hv hvVar = null;
                    if (C68786a.m99301c()) {
                        C23611l a = C23610k.m44070a(drVar);
                        str = a != null ? a.mo28938c(drVar) : null;
                    } else {
                        Optional ofNullable = Optional.ofNullable(drVar.mo28876d());
                        C69664n.m101060f(ofNullable, "ofNullable(functionNameString)");
                        str = (String) C23765a.m44264a(ofNullable);
                    }
                    if (str == null) {
                        C59052c cVar2 = (C59052c) C23350g.f63883a.mo56226d();
                        String simpleName = drVar.getClass().getSimpleName();
                        cVar2.mo56379ah(new C59094n(48661));
                        cVar2.mo56389s("Function name is null for parameter %s", simpleName);
                    } else {
                        Object obj = gVar.get(str);
                        if (obj == null) {
                            C64286ae aeVar = (C64286ae) C64289ah.f173826f.createBuilder();
                            C69664n.m101060f(aeVar, "newBuilder()");
                            C64326br a2 = C69664n.m101061g(aeVar, "builder");
                            List unmodifiableList = Collections.unmodifiableList(((C64289ah) a2.f173909a.instance).f173829b);
                            C69664n.m101060f(unmodifiableList, "_builder.getObjectList()");
                            new C62883b(unmodifiableList);
                            C64284ac acVar = (C64284ac) C64285ad.f173815c.createBuilder();
                            C69664n.m101060f(acVar, "newBuilder()");
                            C69664n.m101061g(acVar, "builder");
                            String str2 = arVar.f63987a;
                            C69664n.m101061g(str2, "value");
                            acVar.copyOnWrite();
                            C64285ad adVar = (C64285ad) acVar.instance;
                            str2.getClass();
                            adVar.f173817a |= 1;
                            adVar.f173818b = str2;
                            C62942bv build = acVar.build();
                            C69664n.m101060f(build, "_builder.build()");
                            C64285ad adVar2 = (C64285ad) build;
                            C69664n.m101061g(adVar2, "value");
                            C64286ae aeVar2 = a2.f173909a;
                            aeVar2.copyOnWrite();
                            C64289ah ahVar = (C64289ah) aeVar2.instance;
                            adVar2.getClass();
                            ahVar.mo59269a();
                            ahVar.f173829b.add(adVar2);
                            C64286ae aeVar3 = a2.f173909a;
                            aeVar3.copyOnWrite();
                            C64289ah ahVar2 = (C64289ah) aeVar3.instance;
                            ahVar2.f173828a |= 2;
                            ahVar2.f173831d = str;
                            C64288ag agVar = C64288ag.EXECUTION;
                            C69664n.m101061g(agVar, "value");
                            C64286ae aeVar4 = a2.f173909a;
                            aeVar4.copyOnWrite();
                            C64289ah ahVar3 = (C64289ah) aeVar4.instance;
                            ahVar3.f173830c = agVar.f173825e;
                            ahVar3.f173828a |= 1;
                            obj = a2.mo59273a();
                            gVar.put(str, obj);
                        }
                        C64289ah ahVar4 = (C64289ah) obj;
                        if (C68786a.m99301c()) {
                            C23611l a3 = C23610k.m44070a(drVar);
                            if (a3 != null) {
                                hvVar = a3.mo28937b(drVar);
                            }
                        } else if (drVar.mo28913i().isPresent()) {
                            C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
                            C69664n.m101060f(hsVar, "newBuilder()");
                            C52058q a4 = C69664n.m101061g(hsVar, "builder");
                            Object obj2 = drVar.mo28913i().get();
                            C69664n.m101060f(obj2, "parameterBase.executionParameterName.get()");
                            a4.mo53775b((String) obj2);
                            C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
                            C69664n.m101060f(htVar, "it");
                            drVar.mo28889e(htVar);
                            C62942bv build2 = htVar.build();
                            C69664n.m101060f(build2, "newBuilder()\n           …                 .build()");
                            a4.mo53776c((C52022hu) build2);
                            hvVar = a4.mo53774a();
                        }
                        if (hvVar != null) {
                            C69664n.m101060f(ahVar4, "objectRequest");
                            C62934bn builder = ahVar4.toBuilder();
                            C69664n.m101060f(builder, "this.toBuilder()");
                            C64326br a5 = C69664n.m101061g((C64286ae) builder, "builder");
                            List unmodifiableList2 = Collections.unmodifiableList(((C64289ah) a5.f173909a.instance).f173832e);
                            C69664n.m101060f(unmodifiableList2, "_builder.getParamList()");
                            new C62883b(unmodifiableList2);
                            C64286ae aeVar5 = a5.f173909a;
                            aeVar5.copyOnWrite();
                            C64289ah ahVar5 = (C64289ah) aeVar5.instance;
                            C62971cq cqVar = ahVar5.f173832e;
                            if (!cqVar.mo58948c()) {
                                ahVar5.f173832e = C62942bv.mutableCopy(cqVar);
                            }
                            ahVar5.f173832e.add(hvVar);
                            gVar.put(str, a5.mo59273a());
                        }
                    }
                }
            }
            for (C64289ah ahVar6 : gVar.values()) {
                atVar.copyOnWrite();
                C64302au auVar2 = (C64302au) atVar.instance;
                ahVar6.getClass();
                auVar2.mo59270a();
                auVar2.f173856b.add(ahVar6);
            }
        }
        C64279a aVar = (C64279a) C64308b.f173874c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C64324bp a6 = C69664n.m101061g(aVar, "builder");
        C62942bv build3 = atVar.build();
        C69664n.m101060f(build3, "semanticExecutionRequest.build()");
        a6.mo59272b((C64302au) build3);
        return a6.mo59271a();
    }
}
