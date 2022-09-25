package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.p */
/* compiled from: PG */
public final /* synthetic */ class C9706p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9711u f33536a;

    public /* synthetic */ C9706p(C9711u uVar) {
        this.f33536a = uVar;
    }

    public final void onClick(View view) {
        C9711u uVar = this.f33536a;
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "context");
        Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
        intent.putExtra(":settings:show_fragment_args", bundle);
        uVar.startActivity(intent);
    }
}
