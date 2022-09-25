package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.v */
/* compiled from: PG */
public final /* synthetic */ class C109125v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303885a;

    /* renamed from: b */
    public final /* synthetic */ Uri f303886b;

    public /* synthetic */ C109125v(C109100ar arVar, Uri uri) {
        this.f303885a = arVar;
        this.f303886b = uri;
    }

    public final void onClick(View view) {
        C109100ar arVar = this.f303885a;
        Uri uri = this.f303886b;
        arVar.f303793z.mo28211k(arVar.f303758W.mo101392b("opa_nest_growth_promo_interaction_count", 0), "Update Nest Promo Interaction Count", new C109129z(arVar));
        arVar.f303789v.mo65089a(new Intent("android.intent.action.VIEW", uri));
    }
}
