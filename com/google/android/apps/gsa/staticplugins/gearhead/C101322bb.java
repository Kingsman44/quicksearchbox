package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.bb */
/* compiled from: PG */
public final /* synthetic */ class C101322bb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101324bd f282738a;

    /* renamed from: b */
    public final /* synthetic */ VoiceSessionConfig f282739b;

    /* renamed from: c */
    public final /* synthetic */ ClientStateSnapshot f282740c;

    public /* synthetic */ C101322bb(C101324bd bdVar, VoiceSessionConfig voiceSessionConfig, ClientStateSnapshot clientStateSnapshot) {
        this.f282738a = bdVar;
        this.f282739b = voiceSessionConfig;
        this.f282740c = clientStateSnapshot;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101324bd bdVar = this.f282738a;
        VoiceSessionConfig voiceSessionConfig = this.f282739b;
        ClientStateSnapshot clientStateSnapshot = this.f282740c;
        ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(19982)).mo56386p("Prewarming failed");
        bdVar.f282742a.mo92239q(voiceSessionConfig, clientStateSnapshot);
    }
}
