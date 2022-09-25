package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9551c;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b.C130352d;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2828y.p2829a.C36840i;
import com.google.android.libraries.search.assistant.p2828y.p2829a.C36849r;
import com.google.assistant.p3897e.p3902c.p3907c.C51117h;
import com.google.assistant.p3897e.p3917i.p3918a.C51234ad;
import com.google.assistant.p3897e.p3917i.p3918a.C51235ae;
import com.google.assistant.p3897e.p3917i.p3918a.C51242al;
import com.google.assistant.p3897e.p3917i.p3918a.C51244an;
import com.google.assistant.p3897e.p3917i.p3918a.C51246ap;
import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.p4746a.C62883b;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.c.b */
/* compiled from: PG */
public final class C127210b implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350252a = C130352d.f357259b;

    /* renamed from: b */
    private final C36840i f350253b;

    public C127210b(C36840i iVar) {
        this.f350253b = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        Optional optional;
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C36840i iVar2 = this.f350253b;
        if (iVar2.f95980a.f86990a.isEmpty()) {
            optional = Optional.empty();
            C69664n.m101060f(optional, "empty()");
        } else {
            C51242al alVar = (C51242al) C51244an.f133412b.createBuilder();
            C69664n.m101060f(alVar, "newBuilder()");
            C51246ap a = C69664n.m101061g(alVar, "builder");
            for (Map.Entry entry : iVar2.f95980a.f86990a.entrySet()) {
                String str = (String) entry.getKey();
                Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C51244an) a.f133415a.instance).f133414a));
                C69664n.m101060f(unmodifiableMap, "_builder.getDialogsMap()");
                new C62884c(unmodifiableMap);
                C51234ad adVar = (C51234ad) C51235ae.f133392b.createBuilder();
                C69664n.m101060f(adVar, "newBuilder()");
                C69664n.m101061g(adVar, "builder");
                C52829f fVar = (C52829f) ((C32433a) entry.getValue()).mo38059a().mo62784e();
                if (fVar != null) {
                    for (C52825b bVar : fVar.f138613a) {
                        List unmodifiableList = Collections.unmodifiableList(((C51235ae) adVar.instance).f133394a);
                        C69664n.m101060f(unmodifiableList, "_builder.getActionsList()");
                        new C62883b(unmodifiableList);
                        C69664n.m101060f(bVar, "appAction");
                        C51117h a2 = C36849r.m65547a(bVar);
                        C69664n.m101061g(a2, "value");
                        adVar.copyOnWrite();
                        C51235ae aeVar = (C51235ae) adVar.instance;
                        a2.getClass();
                        C62971cq cqVar = aeVar.f133394a;
                        if (!cqVar.mo58948c()) {
                            aeVar.f133394a = C62942bv.mutableCopy(cqVar);
                        }
                        aeVar.f133394a.add(a2);
                    }
                }
                C62942bv build = adVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C51235ae aeVar2 = (C51235ae) build;
                C69664n.m101061g(str, "key");
                C69664n.m101061g(aeVar2, "value");
                C51242al alVar2 = a.f133415a;
                str.getClass();
                aeVar2.getClass();
                alVar2.copyOnWrite();
                C51244an anVar = (C51244an) alVar2.instance;
                C62995dn dnVar = anVar.f133414a;
                if (!dnVar.f170058b) {
                    anVar.f133414a = dnVar.mo58980a();
                }
                anVar.f133414a.put(str, aeVar2);
            }
            optional = Optional.m71637of(a.mo53560a());
            C69664n.m101060f(optional, "of(\n      backgroundAppA…}\n        }\n      }\n    )");
        }
        Optional map = optional.map(C127209a.f350251a);
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a3 = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        a3.mo38303b(C69664n.m101061g(azVar, "builder").mo38305a());
        return C60856cj.m92900i(map.orElse(a3.mo38302a()));
    }
}
