package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4851a.p4852a.C63317a;
import com.google.protos.p4850an.p4851a.p4852a.C63318b;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.r */
/* compiled from: PG */
public final /* synthetic */ class C122607r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122607r f339778a = new C122607r();

    private /* synthetic */ C122607r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Collection collection = (Collection) ((Map.Entry) obj).getValue();
        if (collection.isEmpty()) {
            return Optional.empty();
        }
        C63318b bVar = (C63318b) Collection.EL.stream(collection).findFirst().get();
        float floatValue = ((Float) Collection.EL.stream(collection).map(C122610u.f339781a).reduce(Float.valueOf(0.0f), C122611v.f339782a)).floatValue();
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C63618g gVar = (C63618g) C63624h.f172070b.createBuilder();
        gVar.mo59220a((C58485gu) Collection.EL.stream(collection).map(C122612w.f339783a).flatMap(C122613x.f339784a).collect(C58370cn.f155946a));
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C63624h hVar = (C63624h) gVar.build();
        hVar.getClass();
        jVar.f166803b = hVar;
        jVar.f166802a = 15;
        C61748j jVar2 = (C61748j) iVar.build();
        C63317a aVar = (C63317a) C63318b.f171125i.createBuilder();
        aVar.copyOnWrite();
        C63318b bVar2 = (C63318b) aVar.instance;
        bVar2.f171127a |= 16;
        bVar2.f171132f = floatValue;
        int i = bVar.f171130d;
        aVar.copyOnWrite();
        C63318b bVar3 = (C63318b) aVar.instance;
        bVar3.f171127a |= 4;
        bVar3.f171130d = i;
        int i2 = bVar.f171131e;
        aVar.copyOnWrite();
        C63318b bVar4 = (C63318b) aVar.instance;
        bVar4.f171127a |= 8;
        bVar4.f171131e = i2;
        String b = C122605p.m202015b(C80080z.APP);
        aVar.copyOnWrite();
        C63318b bVar5 = (C63318b) aVar.instance;
        b.getClass();
        bVar5.f171127a |= 2;
        bVar5.f171129c = b;
        C61762x xVar = bVar.f171134h;
        if (xVar == null) {
            xVar = C61762x.f166835e;
        }
        aVar.copyOnWrite();
        C63318b bVar6 = (C63318b) aVar.instance;
        xVar.getClass();
        bVar6.f171134h = xVar;
        bVar6.f171127a |= 64;
        aVar.copyOnWrite();
        C63318b bVar7 = (C63318b) aVar.instance;
        jVar2.getClass();
        bVar7.f171128b = jVar2;
        bVar7.f171127a |= 1;
        return Optional.m71637of((C63318b) aVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
