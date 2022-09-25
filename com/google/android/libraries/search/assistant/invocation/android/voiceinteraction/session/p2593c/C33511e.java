package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.content.Intent;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.e */
/* compiled from: PG */
public final class C33511e {
    /* renamed from: a */
    public static final ComponentName m62106a(AssistStructure assistStructure, AssistContent assistContent) {
        Intent intent;
        ComponentName activityComponent;
        if (assistStructure != null && (activityComponent = assistStructure.getActivityComponent()) != null) {
            return activityComponent;
        }
        if (assistContent == null || (intent = assistContent.getIntent()) == null) {
            return null;
        }
        return intent.getComponent();
    }
}
