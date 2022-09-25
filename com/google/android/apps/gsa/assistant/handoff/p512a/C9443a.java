package com.google.android.apps.gsa.assistant.handoff.p512a;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.a.a */
/* compiled from: PG */
public final class C9443a {
    /* renamed from: a */
    public static final Intent m23961a(Intent intent, int i, int i2) {
        Intent intent2 = new Intent();
        intent2.putExtras(intent);
        intent2.putExtra("resume", 1);
        intent2.putExtra("resume_type", 1);
        intent2.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.assistant.handoff.AssistantHandoffActivity");
        return intent2;
    }
}
