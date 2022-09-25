package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import com.google.android.apps.gsa.nga.engine.education.pie.C75860c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80188ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80189aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.l */
/* compiled from: PG */
public final /* synthetic */ class C75783l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75784m f210322a;

    public /* synthetic */ C75783l(C75784m mVar) {
        this.f210322a = mVar;
    }

    public final void accept(Object obj) {
        C80244ck ckVar = (C80244ck) obj;
        C75860c cVar = this.f210322a.f210326c;
        C80188ai aiVar = (C80188ai) C80189aj.f220013e.createBuilder();
        aiVar.copyOnWrite();
        C80189aj ajVar = (C80189aj) aiVar.instance;
        ajVar.f220016b = 1;
        ajVar.f220015a = 1 | ajVar.f220015a;
        aiVar.copyOnWrite();
        C80189aj ajVar2 = (C80189aj) aiVar.instance;
        ajVar2.f220015a |= 2;
        ajVar2.f220017c = false;
        aiVar.copyOnWrite();
        C80189aj ajVar3 = (C80189aj) aiVar.instance;
        ckVar.getClass();
        ajVar3.f220018d = ckVar;
        ajVar3.f220015a |= 4;
        cVar.mo71919b((C80189aj) aiVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
