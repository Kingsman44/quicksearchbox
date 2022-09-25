package com.google.android.apps.gsa.assist.p506e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C91070p;

/* renamed from: com.google.android.apps.gsa.assist.e.b */
/* compiled from: PG */
public final class C9409b {

    /* renamed from: a */
    private final Context f32688a;

    /* renamed from: b */
    private final ComponentName f32689b;

    public C9409b(Context context, ComponentName componentName) {
        this.f32688a = context;
        this.f32689b = componentName;
    }

    /* renamed from: a */
    public final void mo17662a(boolean z) {
        Intent intent = new Intent("com.google.android.voiceinteraction.DISABLE_CONTEXT");
        intent.putExtra("extra_disable_context", z);
        intent.setComponent(this.f32689b);
        C91070p.m148777b(this.f32688a, intent);
    }
}
