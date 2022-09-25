package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.view.View;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.i */
/* compiled from: PG */
public final class C128608i {
    /* renamed from: a */
    public static AssistantChipsView m209892a(View view) {
        if (view instanceof AssistantChipsView) {
            return (AssistantChipsView) view;
        }
        String obj = C128605f.class.toString();
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalStateException("Attempt to inject a View wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
    }
}
