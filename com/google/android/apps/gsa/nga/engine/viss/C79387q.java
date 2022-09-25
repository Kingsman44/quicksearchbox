package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.apps.gsa.nga.engine.b.e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.q */
/* compiled from: PG */
final class C79387q extends C79373c {

    /* renamed from: a */
    final /* synthetic */ NgaVoiceInteractionSessionService f218010a;

    public C79387q(NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService) {
        this.f218010a = ngaVoiceInteractionSessionService;
    }

    /* renamed from: a */
    public final void mo73945a(IBinder iBinder, Bundle bundle, int i) {
        C59071e eVar = NgaVoiceInteractionSessionService.f217951a;
        C58976aa aaVar = C58975e.f156826a;
        this.f218010a.mo73927d(7);
        C79370ac a = this.f218010a.mo73924a(bundle);
        NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService = this.f218010a;
        e eVar2 = ngaVoiceInteractionSessionService.f217959f;
        if (eVar2 == null || C79369ab.m127349b(((C79366a) a).f217981b)) {
            ngaVoiceInteractionSessionService.mo73928e(a, iBinder, bundle, i);
        } else {
            eVar2.c().mo4106b(new C79386p(this, a, iBinder, bundle, i), C60826bg.f164896a);
        }
    }
}
