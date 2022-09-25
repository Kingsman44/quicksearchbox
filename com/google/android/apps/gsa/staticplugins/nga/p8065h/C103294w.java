package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80458f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80459g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80461i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.w */
/* compiled from: PG */
public final /* synthetic */ class C103294w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ double f288094a;

    /* renamed from: b */
    public final /* synthetic */ C80460h f288095b;

    public /* synthetic */ C103294w(double d, C80460h hVar) {
        this.f288094a = d;
        this.f288095b = hVar;
    }

    public final void accept(Object obj) {
        double d = this.f288094a;
        C80460h hVar = this.f288095b;
        Map.Entry entry = (Map.Entry) obj;
        C80458f fVar = (C80458f) C80459g.f220824d.createBuilder();
        C80461i iVar = (C80461i) C80462j.f220829e.createBuilder();
        String c = ((C103295x) entry.getKey()).mo93704c();
        iVar.copyOnWrite();
        C80462j jVar = (C80462j) iVar.instance;
        c.getClass();
        jVar.f220831a |= 1;
        jVar.f220832b = c;
        int a = ((C103295x) entry.getKey()).mo93702a();
        iVar.copyOnWrite();
        C80462j jVar2 = (C80462j) iVar.instance;
        jVar2.f220831a |= 4;
        jVar2.f220834d = a;
        double max = Math.max(((Double) entry.getValue()).doubleValue() / d, 0.01d);
        iVar.copyOnWrite();
        C80462j jVar3 = (C80462j) iVar.instance;
        jVar3.f220831a |= 2;
        jVar3.f220833c = max;
        fVar.copyOnWrite();
        C80459g gVar = (C80459g) fVar.instance;
        C80462j jVar4 = (C80462j) iVar.build();
        jVar4.getClass();
        gVar.f220828c = jVar4;
        gVar.f220826a |= 2;
        if (((C103295x) entry.getKey()).mo93703b().isPresent()) {
            String str = (String) ((C103295x) entry.getKey()).mo93703b().get();
            fVar.copyOnWrite();
            C80459g gVar2 = (C80459g) fVar.instance;
            str.getClass();
            gVar2.f220826a |= 1;
            gVar2.f220827b = str;
        }
        C80459g gVar3 = (C80459g) fVar.build();
        hVar.copyOnWrite();
        C80465m mVar = (C80465m) hVar.instance;
        C80465m mVar2 = C80465m.f220842e;
        gVar3.getClass();
        mVar.mo74333c();
        mVar.f220846c.add(gVar3);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
