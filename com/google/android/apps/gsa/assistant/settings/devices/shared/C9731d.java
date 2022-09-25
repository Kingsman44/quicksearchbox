package com.google.android.apps.gsa.assistant.settings.devices.shared;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.shared.d */
/* compiled from: PG */
final class C9731d extends ClickableSpan {

    /* renamed from: a */
    private final Context f33617a;

    /* renamed from: b */
    private final String f33618b;

    public C9731d(Context context, String str) {
        this.f33617a = context;
        this.f33618b = str;
    }

    public final void onClick(View view) {
        this.f33617a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f33618b)));
    }
}
