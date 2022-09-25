package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80902aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.g */
/* compiled from: PG */
public final /* synthetic */ class C45399g implements C80902aq {

    /* renamed from: a */
    public static final /* synthetic */ C45399g f118770a = new C45399g();

    private /* synthetic */ C45399g() {
    }

    /* renamed from: a */
    public final void mo49513a(Throwable th) {
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(54597)).mo56386p("Failed to record hotword rejection timestamp in proto data store..");
    }
}
