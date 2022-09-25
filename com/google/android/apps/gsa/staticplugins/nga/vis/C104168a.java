package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.service.voice.VoiceInteractionSessionService;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.ars;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.a */
/* compiled from: PG */
abstract class C104168a extends VoiceInteractionSessionService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f289750a;

    /* renamed from: b */
    private final Object f289751b = new Object();

    /* renamed from: c */
    private boolean f289752c = false;

    /* renamed from: a */
    public final C68326i mo93984a() {
        if (this.f289750a == null) {
            synchronized (this.f289751b) {
                if (this.f289750a == null) {
                    this.f289750a = new C68326i(this);
                }
            }
        }
        return this.f289750a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93984a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f289752c) {
            this.f289752c = true;
            amb amb = (amb) mo93984a().mo17653jN();
            aqy aqy = amb.f197807b;
            C69464a aVar = aqy.aT;
            C69464a aVar2 = aqy.fu;
            ars ars = aqy.b;
            C69464a aVar3 = ars.f200335he;
            C69464a aVar4 = amb.f197735H;
            C69464a aVar5 = aqy.bq;
            C69464a aVar6 = amb.f197736I;
            asp asp = aqy.a;
            C69464a aVar7 = asp.f202697bv;
            C69464a aVar8 = asp.f202810eB;
            aso aso = aqy.d;
            asp asp2 = asp;
            C69464a aVar9 = aVar;
            aqy aqy2 = aqy;
            C104197ap apVar = r3;
            C69464a aVar10 = aVar9;
            C104197ap apVar2 = new C104197ap(aVar10, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aso.f201721eU, amb.f197737J, aqy.aU, amb.f197738K, ars.f199917K, amb.f197739L, aqy2.aW, asp2.f202676ba, aso.f201722eV, asp2.f202595Z, aqy2.bs, asp2.f202593X);
            NgaRemoteVoiceInteractionSessionService ngaRemoteVoiceInteractionSessionService = (NgaRemoteVoiceInteractionSessionService) this;
            ngaRemoteVoiceInteractionSessionService.f289747b = apVar;
            ngaRemoteVoiceInteractionSessionService.f289748c = C68219e.m98518a(amb.f197807b.a.f202697bv);
            ngaRemoteVoiceInteractionSessionService.f289749d = amb.f197807b.b.mo67587rf();
        }
        super.onCreate();
    }
}
