package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.h */
/* compiled from: PG */
final class C9475h implements C91096f {

    /* renamed from: a */
    final /* synthetic */ AssistantHandoffActivity f32909a;

    public C9475h(AssistantHandoffActivity assistantHandoffActivity) {
        this.f32909a = assistantHandoffActivity;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        this.f32909a.onActivityResult(0, i, intent);
        return true;
    }
}
