package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119784af;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119871dl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120512i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.at */
/* compiled from: PG */
public final /* synthetic */ class C119963at implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119966aw f334058a;

    public /* synthetic */ C119963at(C119966aw awVar) {
        this.f334058a = awVar;
    }

    public final void accept(Object obj) {
        C119966aw awVar = this.f334058a;
        C119871dl dlVar = (C119871dl) C119873dn.f333836c.createBuilder();
        C119784af afVar = (C119784af) C119785ag.f333648b.createBuilder();
        int a = ((C120512i) obj).mo104785a();
        afVar.copyOnWrite();
        ((C119785ag) afVar.instance).f333650a = a;
        dlVar.copyOnWrite();
        C119873dn dnVar = (C119873dn) dlVar.instance;
        C119785ag agVar = (C119785ag) afVar.build();
        agVar.getClass();
        dnVar.f333839b = agVar;
        dnVar.f333838a = 2;
        awVar.mo104590b((C119873dn) dlVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
