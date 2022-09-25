package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.r */
/* compiled from: PG */
public final /* synthetic */ class C9708r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9711u f33538a;

    public /* synthetic */ C9708r(C9711u uVar) {
        this.f33538a = uVar;
    }

    public final void onClick(View view) {
        this.f33538a.startActivity(new Intent("android.settings.ASSIST_GESTURE_SETTINGS"));
    }
}
