package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24462q;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24463r;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C25121a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C25121a f68419a = new C25121a();

    private /* synthetic */ C25121a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C58974d dVar = C25128h.f68427a;
        C24462q qVar = (C24462q) C24463r.f66960c.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        String str = (String) entry.getValue();
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        str.getClass();
        tVar.f66966a |= 1;
        tVar.f66967b = str;
        String str2 = (String) entry.getKey();
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str2.getClass();
        tVar2.f66966a |= 4;
        tVar2.f66969d = str2;
        C24465t tVar3 = (C24465t) sVar.build();
        qVar.copyOnWrite();
        C24463r rVar = (C24463r) qVar.instance;
        tVar3.getClass();
        rVar.f66963b = tVar3;
        rVar.f66962a |= 1;
        return (C24463r) qVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
