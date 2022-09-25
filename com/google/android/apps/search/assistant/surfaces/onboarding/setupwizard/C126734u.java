package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.content.Intent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.u */
/* compiled from: PG */
public abstract class C126734u {
    /* renamed from: a */
    public abstract int mo107714a();

    /* renamed from: b */
    public final Intent mo107733b() {
        Intent intent = new Intent("com.google.android.apps.search.assistant.SUW_WRAPPED");
        intent.putExtra("intent_extra_screen_type", mo107714a());
        return intent;
    }
}
