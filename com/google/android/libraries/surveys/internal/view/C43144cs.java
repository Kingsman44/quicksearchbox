package com.google.android.libraries.surveys.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: com.google.android.libraries.surveys.internal.view.cs */
/* compiled from: PG */
final class C43144cs extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ String f112829a;

    /* renamed from: b */
    final /* synthetic */ C43145ct f112830b;

    public C43144cs(C43145ct ctVar, String str) {
        this.f112830b = ctVar;
        this.f112829a = str;
    }

    public final void onClick(View view) {
        this.f112830b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f112829a)));
    }
}
