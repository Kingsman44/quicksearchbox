package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.r */
/* compiled from: PG */
final class C79388r implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C79370ac f218011a;

    /* renamed from: b */
    final /* synthetic */ IBinder f218012b;

    /* renamed from: c */
    final /* synthetic */ int f218013c;

    /* renamed from: d */
    final /* synthetic */ NgaVoiceInteractionSessionService f218014d;

    public C79388r(NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService, C79370ac acVar, IBinder iBinder, int i) {
        this.f218014d = ngaVoiceInteractionSessionService;
        this.f218011a = acVar;
        this.f218012b = iBinder;
        this.f218013c = i;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = NgaVoiceInteractionSessionService.f217951a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NgaViss");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(5557)).mo56389s("prepareAndStartNewApaRemoteSession gRPC failed, configuration:%s", this.f218011a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f218014d.mo73929f(this.f218011a, this.f218012b, (Bundle) obj, this.f218013c);
    }
}
