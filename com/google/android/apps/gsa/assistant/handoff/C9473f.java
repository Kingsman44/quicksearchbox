package com.google.android.apps.gsa.assistant.handoff;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.f */
/* compiled from: PG */
public final /* synthetic */ class C9473f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ AssistantHandoffActivity f32906a;

    public /* synthetic */ C9473f(AssistantHandoffActivity assistantHandoffActivity) {
        this.f32906a = assistantHandoffActivity;
    }

    public final void run() {
        AssistantHandoffActivity assistantHandoffActivity = this.f32906a;
        if (!assistantHandoffActivity.f32841d.mo77970g(assistantHandoffActivity)) {
            C58976aa aaVar = C58975e.f156826a;
            assistantHandoffActivity.f32846i.mo28212l("Finish activity", new C9471d(assistantHandoffActivity));
            return;
        }
        assistantHandoffActivity.f32846i.mo28212l("Handle intent", new C9472e(assistantHandoffActivity));
    }
}
