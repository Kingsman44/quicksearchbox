package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.o */
/* compiled from: PG */
public final /* synthetic */ class C99923o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279545a;

    /* renamed from: b */
    public final /* synthetic */ Uri f279546b;

    public /* synthetic */ C99923o(C99908ah ahVar, Uri uri) {
        this.f279545a = ahVar;
        this.f279546b = uri;
    }

    public final void run() {
        C99908ah ahVar = this.f279545a;
        ahVar.f279491l.mo65089a(new Intent("android.intent.action.VIEW", this.f279546b).setPackage("com.google.android.apps.maps"));
    }
}
