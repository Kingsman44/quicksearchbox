package com.google.android.apps.search.assistant.verticals.contextdebug;

import com.google.android.libraries.search.assistant.p2566g.C33406aa;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50537e;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50544l;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50548p;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50550r;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50551s;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50556x;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.n */
/* compiled from: PG */
public final /* synthetic */ class C132044n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132052v f360411a;

    /* renamed from: b */
    public final /* synthetic */ C50544l f360412b;

    /* renamed from: c */
    public final /* synthetic */ String f360413c;

    public /* synthetic */ C132044n(C132052v vVar, C50544l lVar, String str) {
        this.f360411a = vVar;
        this.f360412b = lVar;
        this.f360413c = str;
    }

    public final C60870cx apply(Object obj) {
        C132052v vVar = this.f360411a;
        C50544l lVar = this.f360412b;
        String str = this.f360413c;
        C33406aa aaVar = (C33406aa) obj;
        C43968o oVar = vVar.f360435n;
        if (oVar == null) {
            return C60866ct.f164955a;
        }
        C50540h a = vVar.mo110394a();
        C50537e eVar = (C50537e) a.toBuilder();
        C50540h hVar = aaVar.f89470b;
        if (hVar == null) {
            hVar = C50540h.f131534h;
        }
        C62971cq cqVar = hVar.f131538b;
        eVar.copyOnWrite();
        C50540h hVar2 = (C50540h) eVar.instance;
        C62971cq cqVar2 = hVar2.f131538b;
        if (!cqVar2.mo58948c()) {
            hVar2.f131538b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) hVar2.f131538b);
        C50540h hVar3 = aaVar.f89470b;
        if (hVar3 == null) {
            hVar3 = C50540h.f131534h;
        }
        C62971cq cqVar3 = hVar3.f131539c;
        eVar.copyOnWrite();
        C50540h hVar4 = (C50540h) eVar.instance;
        C62971cq cqVar4 = hVar4.f131539c;
        if (!cqVar4.mo58948c()) {
            hVar4.f131539c = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) cqVar3, (List) hVar4.f131539c);
        if (lVar.f131548a.size() > 0) {
            eVar.copyOnWrite();
            ((C50540h) eVar.instance).f131540d = C50540h.emptyProtobufList();
            Stream filter = Collection.EL.stream(a.f131540d).filter(new C132045o(C58528ij.m90006F(new C62963cj(lVar.f131548a, C50544l.f131545b))));
            Objects.requireNonNull(eVar);
            filter.forEach(new C132046p(eVar));
        }
        C50540h hVar5 = aaVar.f89470b;
        if (hVar5 == null) {
            hVar5 = C50540h.f131534h;
        }
        eVar.mo53406a(hVar5.f131540d);
        C50548p pVar = (C50548p) C50556x.f131574g.createBuilder();
        C50550r rVar = (C50550r) C50551s.f131563c.createBuilder();
        rVar.copyOnWrite();
        C50551s sVar = (C50551s) rVar.instance;
        C50540h hVar6 = (C50540h) eVar.build();
        hVar6.getClass();
        sVar.f131566b = hVar6;
        sVar.f131565a |= 1;
        pVar.copyOnWrite();
        C50556x xVar = (C50556x) pVar.instance;
        C50551s sVar2 = (C50551s) rVar.build();
        sVar2.getClass();
        xVar.f131577b = sVar2;
        xVar.f131576a |= 1;
        pVar.copyOnWrite();
        C50556x xVar2 = (C50556x) pVar.instance;
        str.getClass();
        xVar2.f131576a |= 16;
        xVar2.f131581f = str;
        return C132052v.m214503b(oVar, (C50556x) pVar.build());
    }
}
