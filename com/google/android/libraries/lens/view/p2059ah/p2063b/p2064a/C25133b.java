package com.google.android.libraries.lens.view.p2059ah.p2063b.p2064a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24462q;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24463r;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.ah.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C25133b implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ List f68438a;

    public /* synthetic */ C25133b(List list) {
        this.f68438a = list;
    }

    public final void accept(Object obj, Object obj2) {
        List list = this.f68438a;
        String str = (String) obj;
        String str2 = (String) obj2;
        C24462q qVar = (C24462q) C24463r.f66960c.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        str2.getClass();
        tVar.f66966a |= 1;
        tVar.f66967b = str2;
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 4;
        tVar2.f66969d = str;
        C24465t tVar3 = (C24465t) sVar.build();
        qVar.copyOnWrite();
        C24463r rVar = (C24463r) qVar.instance;
        tVar3.getClass();
        rVar.f66963b = tVar3;
        rVar.f66962a |= 1;
        list.add((C24463r) qVar.build());
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
