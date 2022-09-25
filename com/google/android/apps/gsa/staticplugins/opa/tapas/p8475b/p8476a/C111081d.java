package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8476a;

import android.app.ActivityManager;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48623bl;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48624bm;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48625bn;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48626bo;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C111081d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111082e f309308a;

    public /* synthetic */ C111081d(C111082e eVar) {
        this.f309308a = eVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C111082e eVar = this.f309308a;
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = eVar.f309310b.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        C48623bl blVar = (C48623bl) C48626bo.f125662f.createBuilder();
        C48624bm bmVar = C48624bm.STOPPED;
        blVar.copyOnWrite();
        ((C48626bo) blVar.instance).f125664a = bmVar.getNumber();
        C48624bm bmVar2 = C48624bm.STOPPED;
        blVar.copyOnWrite();
        ((C48626bo) blVar.instance).f125665b = bmVar2.getNumber();
        C48624bm bmVar3 = C48624bm.STOPPED;
        blVar.copyOnWrite();
        ((C48626bo) blVar.instance).f125666c = bmVar3.getNumber();
        C48625bn bnVar = C48625bn.NOT_RESERVED;
        blVar.copyOnWrite();
        ((C48626bo) blVar.instance).f125667d = bnVar.getNumber();
        C48625bn bnVar2 = C48625bn.NOT_RESERVED;
        blVar.copyOnWrite();
        ((C48626bo) blVar.instance).f125668e = bnVar2.getNumber();
        for (ActivityManager.RunningServiceInfo next : ((ActivityManager) eVar.f309309a.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (next.service.getClassName().equals("com.google.android.apps.fitness.activemode.service.ActiveModeService")) {
                C48624bm bmVar4 = C48624bm.STARTED_OR_PAUSED;
                blVar.copyOnWrite();
                ((C48626bo) blVar.instance).f125664a = bmVar4.getNumber();
            } else if (next.service.getClassName().equals("com.nike.plusgps.runtracking.inrunservice.InRunService")) {
                C48624bm bmVar5 = C48624bm.STARTED_OR_PAUSED;
                blVar.copyOnWrite();
                ((C48626bo) blVar.instance).f125665b = bmVar5.getNumber();
            } else if (next.service.getClassName().equals("com.runtastic.android.service.impl.RuntasticService")) {
                C48624bm bmVar6 = C48624bm.STARTED_OR_PAUSED;
                blVar.copyOnWrite();
                ((C48626bo) blVar.instance).f125666c = bmVar6.getNumber();
            } else if (next.service.getClassName().equals("com.ubercab.push.UberFirebaseMessagingService")) {
                C48625bn bnVar3 = C48625bn.RESERVED;
                blVar.copyOnWrite();
                ((C48626bo) blVar.instance).f125667d = bnVar3.getNumber();
            } else if (next.service.getClassName().equals("com.lyft.android.gcm.services.GcmService")) {
                C48625bn bnVar4 = C48625bn.RESERVED;
                blVar.copyOnWrite();
                ((C48626bo) blVar.instance).f125668e = bnVar4.getNumber();
            }
        }
        C48626bo boVar = (C48626bo) blVar.build();
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        boVar.getClass();
        bxVar.f125707b = boVar;
        bxVar.f125706a = 5;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
