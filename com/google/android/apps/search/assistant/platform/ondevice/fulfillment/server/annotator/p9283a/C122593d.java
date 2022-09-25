package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.base.C58892db;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protos.p4850an.p4851a.p4852a.C63317a;
import com.google.protos.p4850an.p4851a.p4852a.C63318b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.d */
/* compiled from: PG */
public final /* synthetic */ class C122593d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f339764a;

    /* renamed from: b */
    public final /* synthetic */ String f339765b;

    public /* synthetic */ C122593d(C80047aa aaVar, String str) {
        this.f339764a = aaVar;
        this.f339765b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80047aa aaVar = this.f339764a;
        String str = this.f339765b;
        C61746h hVar = (C61746h) obj;
        C63317a aVar = (C63317a) C63318b.f171125i.createBuilder();
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        String b = C122605p.m202015b(a);
        aVar.copyOnWrite();
        C63318b bVar = (C63318b) aVar.instance;
        b.getClass();
        bVar.f171127a |= 2;
        bVar.f171129c = b;
        C61762x xVar = hVar.f166798f;
        if (xVar == null) {
            xVar = C61762x.f166835e;
        }
        aVar.copyOnWrite();
        C63318b bVar2 = (C63318b) aVar.instance;
        xVar.getClass();
        bVar2.f171134h = xVar;
        bVar2.f171127a |= 64;
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        aVar.copyOnWrite();
        C63318b bVar3 = (C63318b) aVar.instance;
        jVar.getClass();
        bVar3.f171128b = jVar;
        bVar3.f171127a |= 1;
        int a2 = C58892db.m90995a(str.substring(0, aaVar.f219660d));
        aVar.copyOnWrite();
        C63318b bVar4 = (C63318b) aVar.instance;
        bVar4.f171127a |= 4;
        bVar4.f171130d = a2;
        int a3 = C58892db.m90995a(str.substring(aaVar.f219660d, aaVar.f219661e));
        aVar.copyOnWrite();
        C63318b bVar5 = (C63318b) aVar.instance;
        bVar5.f171127a |= 8;
        bVar5.f171131e = a3;
        double d = aaVar.f219663g;
        aVar.copyOnWrite();
        C63318b bVar6 = (C63318b) aVar.instance;
        bVar6.f171127a |= 16;
        bVar6.f171132f = (float) d;
        return (C63318b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
