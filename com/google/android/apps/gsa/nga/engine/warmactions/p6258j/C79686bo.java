package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.ajy;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62940bt;
import com.google.protos.p4985f.p5036r.C65316b;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bo */
/* compiled from: PG */
public final /* synthetic */ class C79686bo implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C79687bp f218539a;

    /* renamed from: b */
    public final /* synthetic */ C79690bs f218540b;

    public /* synthetic */ C79686bo(C79687bp bpVar, C79690bs bsVar) {
        this.f218539a = bpVar;
        this.f218540b = bsVar;
    }

    public final Object apply(Object obj) {
        C79687bp bpVar = this.f218539a;
        C79690bs bsVar = this.f218540b;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue() && bpVar.f218542b.mo85405j(C90126fx.f251460jI)) {
            ((C58970a) ((C58970a) C79687bp.f218541a.mo56224b()).mo56372aa(5781)).mo56386p("#MWW Triggering post-execution survey");
            C79715x xVar = bpVar.f218545e;
            C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
            fVar.copyOnWrite();
            C47887u uVar = (C47887u) fVar.instance;
            uVar.f123978a = 1;
            uVar.f123979b = "Did you just say:";
            String g = bsVar.mo74199g();
            fVar.copyOnWrite();
            C47887u uVar2 = (C47887u) fVar.instance;
            g.getClass();
            uVar2.f123980c = 7;
            uVar2.f123981d = g;
            C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
            gVar.copyOnWrite();
            C47875i iVar = (C47875i) gVar.instance;
            iVar.f123947a = 1;
            iVar.f123948b = "Yes";
            C47868b a = C79715x.m127811a("👍");
            gVar.copyOnWrite();
            a.getClass();
            ((C47875i) gVar.instance).f123950d = a;
            fVar.mo51702a(gVar);
            C47873g gVar2 = (C47873g) C47875i.f123945g.createBuilder();
            gVar2.copyOnWrite();
            C47875i iVar2 = (C47875i) gVar2.instance;
            iVar2.f123947a = 1;
            iVar2.f123948b = "Not on the first try";
            C47868b a2 = C79715x.m127811a("👍👎");
            gVar2.copyOnWrite();
            a2.getClass();
            ((C47875i) gVar2.instance).f123950d = a2;
            fVar.mo51702a(gVar2);
            C47873g gVar3 = (C47873g) C47875i.f123945g.createBuilder();
            gVar3.copyOnWrite();
            C47875i iVar3 = (C47875i) gVar3.instance;
            iVar3.f123947a = 1;
            iVar3.f123948b = "No";
            C47868b a3 = C79715x.m127811a("👎");
            gVar3.copyOnWrite();
            a3.getClass();
            ((C47875i) gVar3.instance).f123950d = a3;
            fVar.mo51702a(gVar3);
            C47887u uVar3 = (C47887u) fVar.build();
            aaj aaj = (aaj) aas.f134661u.createBuilder();
            aaj.copyOnWrite();
            aas aas = (aas) aaj.instance;
            aas.f134663a |= 256;
            aas.f134670h = "WarmWordsTriggeringSurvey";
            aaj.copyOnWrite();
            aas aas2 = (aas) aaj.instance;
            aas2.f134663a |= 4;
            aas2.f134666d = xVar.f218614b.mo26870b() + 180000;
            aam aam = (aam) aap.f134650h.createBuilder();
            aam.copyOnWrite();
            aap aap = (aap) aam.instance;
            aap.f134652a |= 1;
            aap.f134653b = 92;
            int b = C65316b.m96665b(216);
            aam.copyOnWrite();
            aap aap2 = (aap) aam.instance;
            aap2.f134652a |= 4;
            aap2.f134655d = b;
            aaj.copyOnWrite();
            aas aas3 = (aas) aaj.instance;
            aap aap3 = (aap) aam.build();
            aap3.getClass();
            aas3.f134676n = aap3;
            aas3.f134663a |= 8192;
            C62940bt btVar = abc.f134692p;
            aax aax = (aax) abc.f134691o.createBuilder();
            aax.copyOnWrite();
            abc abc = (abc) aax.instance;
            uVar3.getClass();
            abc.f134698e = uVar3;
            abc.f134694a |= 2;
            aax.copyOnWrite();
            abc abc2 = (abc) aax.instance;
            abc2.f134697d = 1;
            abc2.f134694a = 1 | abc2.f134694a;
            aaj.mo58885m(btVar, (abc) aax.build());
            xVar.f218613a.sendBroadcast(new Intent().setAction("com.google.android.googlequicksearchbox.OPA_TRIGGER_CLIENT_NOTIFICATION").setClassName(xVar.f218613a, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").setPackage("com.google.android.googlequicksearchbox").putExtra("notification_args", ((aas) aaj.build()).toByteArray()).putExtra("content_source", ajy.CLIENT_GENERATED));
        }
        return bool;
    }
}
