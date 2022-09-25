package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119871dl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119897p;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119901t;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120698m;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120699n;
import com.google.protobuf.C62912at;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C119961ar implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119966aw f334056a;

    public /* synthetic */ C119961ar(C119966aw awVar) {
        this.f334056a = awVar;
    }

    public final void accept(Object obj) {
        C119904w wVar;
        C119966aw awVar = this.f334056a;
        C120698m mVar = (C120698m) obj;
        if (mVar != C120698m.FINISHED) {
            C119834cb cbVar = awVar.f334069d;
            C119871dl dlVar = (C119871dl) C119873dn.f333836c.createBuilder();
            C119901t tVar = (C119901t) C119903v.f333904d.createBuilder();
            tVar.copyOnWrite();
            cbVar.getClass();
            ((C119903v) tVar.instance).f333908c = cbVar;
            C120699n nVar = C120699n.EMPTY;
            int ordinal = mVar.ordinal();
            if (ordinal == 0) {
                C119897p pVar = (C119897p) C119899r.f333900c.createBuilder();
                C62912at atVar = C62912at.f169862a;
                pVar.copyOnWrite();
                C119899r rVar = (C119899r) pVar.instance;
                atVar.getClass();
                rVar.f333903b = atVar;
                rVar.f333902a = 1;
                C119899r rVar2 = (C119899r) pVar.build();
                tVar.copyOnWrite();
                C119903v vVar = (C119903v) tVar.instance;
                rVar2.getClass();
                vVar.f333907b = rVar2;
                vVar.f333906a = 1;
                wVar = C119966aw.m198870a(tVar);
            } else if (ordinal == 1) {
                C119897p pVar2 = (C119897p) C119899r.f333900c.createBuilder();
                C62912at atVar2 = C62912at.f169862a;
                pVar2.copyOnWrite();
                C119899r rVar3 = (C119899r) pVar2.instance;
                atVar2.getClass();
                rVar3.f333903b = atVar2;
                rVar3.f333902a = 2;
                C119899r rVar4 = (C119899r) pVar2.build();
                tVar.copyOnWrite();
                C119903v vVar2 = (C119903v) tVar.instance;
                rVar4.getClass();
                vVar2.f333907b = rVar4;
                vVar2.f333906a = 1;
                wVar = C119966aw.m198870a(tVar);
            } else if (ordinal == 2) {
                C119897p pVar3 = (C119897p) C119899r.f333900c.createBuilder();
                C62912at atVar3 = C62912at.f169862a;
                pVar3.copyOnWrite();
                C119899r rVar5 = (C119899r) pVar3.instance;
                atVar3.getClass();
                rVar5.f333903b = atVar3;
                rVar5.f333902a = 3;
                C119899r rVar6 = (C119899r) pVar3.build();
                tVar.copyOnWrite();
                C119903v vVar3 = (C119903v) tVar.instance;
                rVar6.getClass();
                vVar3.f333907b = rVar6;
                vVar3.f333906a = 1;
                wVar = C119966aw.m198870a(tVar);
            } else if (ordinal == 3) {
                C62912at atVar4 = C62912at.f169862a;
                tVar.copyOnWrite();
                C119903v vVar4 = (C119903v) tVar.instance;
                atVar4.getClass();
                vVar4.f333907b = atVar4;
                vVar4.f333906a = 4;
                wVar = C119966aw.m198870a(tVar);
            } else if (ordinal == 4 || ordinal == 5) {
                C62912at atVar5 = C62912at.f169862a;
                tVar.copyOnWrite();
                C119903v vVar5 = (C119903v) tVar.instance;
                atVar5.getClass();
                vVar5.f333907b = atVar5;
                vVar5.f333906a = 2;
                wVar = C119966aw.m198870a(tVar);
            } else {
                throw new AssertionError(mVar);
            }
            dlVar.copyOnWrite();
            C119873dn dnVar = (C119873dn) dlVar.instance;
            wVar.getClass();
            dnVar.f333839b = wVar;
            dnVar.f333838a = 1;
            awVar.mo104590b((C119873dn) dlVar.build());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
