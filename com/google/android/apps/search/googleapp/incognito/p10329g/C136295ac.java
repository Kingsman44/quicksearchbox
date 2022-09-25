package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.search.googleapp.incognito.p10329g.p10330a.C136287c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.ac */
/* compiled from: PG */
public final /* synthetic */ class C136295ac implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136297ae f371109a;

    public /* synthetic */ C136295ac(C136297ae aeVar) {
        this.f371109a = aeVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C136297ae aeVar = this.f371109a;
        C47709i.m84861a(aeVar.f371112b, new Intent("android.settings.SECURITY_SETTINGS"));
        C47393f.m84235f(new C136287c(), aeVar.f371112b);
    }
}
