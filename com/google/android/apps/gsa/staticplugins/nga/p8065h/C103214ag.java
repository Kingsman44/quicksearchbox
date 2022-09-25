package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80461i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ag */
/* compiled from: PG */
public final /* synthetic */ class C103214ag implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C80460h f287979a;

    /* renamed from: b */
    public final /* synthetic */ double f287980b;

    public /* synthetic */ C103214ag(C80460h hVar, double d) {
        this.f287979a = hVar;
        this.f287980b = d;
    }

    public final void accept(Object obj, Object obj2) {
        C80460h hVar = this.f287979a;
        double d = this.f287980b;
        C103217aj ajVar = (C103217aj) obj;
        C80461i iVar = (C80461i) C80462j.f220829e.createBuilder();
        String b = ajVar.mo93716b();
        iVar.copyOnWrite();
        C80462j jVar = (C80462j) iVar.instance;
        b.getClass();
        jVar.f220831a |= 1;
        jVar.f220832b = b;
        double doubleValue = ((Double) obj2).doubleValue();
        iVar.copyOnWrite();
        C80462j jVar2 = (C80462j) iVar.instance;
        jVar2.f220831a |= 2;
        jVar2.f220833c = (doubleValue / d) + 0.01d;
        int a = ajVar.mo93715a();
        iVar.copyOnWrite();
        C80462j jVar3 = (C80462j) iVar.instance;
        jVar3.f220831a |= 4;
        jVar3.f220834d = a;
        C80462j jVar4 = (C80462j) iVar.build();
        hVar.copyOnWrite();
        C80465m mVar = (C80465m) hVar.instance;
        C80465m mVar2 = C80465m.f220842e;
        jVar4.getClass();
        mVar.mo74334d();
        mVar.f220847d.add(jVar4);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
