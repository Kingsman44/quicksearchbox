package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.auto.p450a.p451a.C8898bp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.m */
/* compiled from: PG */
public final /* synthetic */ class C101343m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282833a;

    /* renamed from: b */
    public final /* synthetic */ VoiceSessionConfig f282834b;

    /* renamed from: c */
    public final /* synthetic */ ClientStateSnapshot f282835c;

    public /* synthetic */ C101343m(C101325be beVar, VoiceSessionConfig voiceSessionConfig, ClientStateSnapshot clientStateSnapshot) {
        this.f282833a = beVar;
        this.f282834b = voiceSessionConfig;
        this.f282835c = clientStateSnapshot;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101325be beVar = this.f282833a;
        VoiceSessionConfig voiceSessionConfig = this.f282834b;
        ClientStateSnapshot clientStateSnapshot = this.f282835c;
        C13054p pVar = C13054p.IDLE;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C8898bp bpVar = C8898bp.EVENT_TYPE_UNSPECIFIED;
        int ordinal = ((C13054p) obj).ordinal();
        if (ordinal == 0) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(20013)).mo56386p("startOrQueueVoiceSession(): Start a voice or media rec session");
            beVar.mo92237n("#startVoiceSessionInternal", new C101305ap(beVar, voiceSessionConfig, clientStateSnapshot));
        } else if (ordinal == 1) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56372aa(20011)).mo56386p("Cannot start voice session while media rec is ongoing");
        } else if (ordinal == 2) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(20012)).mo56386p("startOrQueueVoiceSession(): Queueing voice session on stopped media rec");
            beVar.f282773c.mo20155h(beVar.mo92233j(voiceSessionConfig, clientStateSnapshot));
        }
    }
}
