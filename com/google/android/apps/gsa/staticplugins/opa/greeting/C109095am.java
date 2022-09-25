package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.am */
/* compiled from: PG */
public final /* synthetic */ class C109095am implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109097ao f303726a;

    /* renamed from: b */
    public final /* synthetic */ Optional f303727b;

    public /* synthetic */ C109095am(C109097ao aoVar, Optional optional) {
        this.f303726a = aoVar;
        this.f303727b = optional;
    }

    public final void onClick(View view) {
        C109097ao aoVar = this.f303726a;
        aoVar.f303730a.f303789v.mo65089a(new Intent("android.intent.action.VIEW", (Uri) this.f303727b.get()));
    }
}
