package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80461i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.az */
/* compiled from: PG */
public final /* synthetic */ class C103233az implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80460h f288002a;

    /* renamed from: b */
    public final /* synthetic */ double f288003b;

    public /* synthetic */ C103233az(C80460h hVar, double d) {
        this.f288002a = hVar;
        this.f288003b = d;
    }

    public final void accept(Object obj) {
        C80460h hVar = this.f288002a;
        double d = this.f288003b;
        Map.Entry entry = (Map.Entry) obj;
        C80461i iVar = (C80461i) C80462j.f220829e.createBuilder();
        String b = ((C103235ba) entry.getKey()).mo93720b();
        iVar.copyOnWrite();
        C80462j jVar = (C80462j) iVar.instance;
        b.getClass();
        jVar.f220831a |= 1;
        jVar.f220832b = b;
        double doubleValue = ((Double) entry.getValue()).doubleValue();
        iVar.copyOnWrite();
        C80462j jVar2 = (C80462j) iVar.instance;
        jVar2.f220831a |= 2;
        jVar2.f220833c = (doubleValue / d) + 0.01d;
        int a = ((C103235ba) entry.getKey()).mo93719a();
        iVar.copyOnWrite();
        C80462j jVar3 = (C80462j) iVar.instance;
        jVar3.f220831a |= 4;
        jVar3.f220834d = a;
        C80462j jVar4 = (C80462j) iVar.build();
        hVar.copyOnWrite();
        C80465m mVar = (C80465m) hVar.instance;
        C80465m mVar2 = C80465m.f220842e;
        jVar4.getClass();
        mVar.mo74332b();
        mVar.f220845b.add(jVar4);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
