package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.service.voice.VoiceInteractionSession;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2591a.C33502b;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.g */
/* compiled from: PG */
final class C120022g extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C120031p f334164a;

    /* renamed from: b */
    final /* synthetic */ VoiceInteractionSession.AssistState f334165b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120022g(C120031p pVar, VoiceInteractionSession.AssistState assistState) {
        super(0);
        this.f334164a = pVar;
        this.f334165b = assistState;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C33502b bVar = this.f334164a.f334189e;
        VoiceInteractionSession.AssistState assistState = this.f334165b;
        C69664n.m101061g(assistState, "assistState");
        bVar.mo38920h(new AssistStateCompat(assistState.getAssistData(), assistState.getAssistStructure(), assistState.getAssistContent(), assistState.getIndex(), Integer.valueOf(assistState.getCount()), 32), this.f334165b.getActivityId());
        return C69788q.f186170a;
    }
}
