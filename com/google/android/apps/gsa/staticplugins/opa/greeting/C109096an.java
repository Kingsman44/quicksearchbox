package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.an */
/* compiled from: PG */
final class C109096an extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ Optional f303728a;

    /* renamed from: b */
    final /* synthetic */ C109097ao f303729b;

    public C109096an(C109097ao aoVar, Optional optional) {
        this.f303729b = aoVar;
        this.f303728a = optional;
    }

    public final void onClick(View view) {
        this.f303729b.f303730a.f303789v.mo65089a(new Intent("android.intent.action.VIEW", (Uri) this.f303728a.get()));
    }
}
