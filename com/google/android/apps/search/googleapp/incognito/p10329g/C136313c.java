package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.content.DialogInterface;
import com.google.android.apps.search.googleapp.incognito.p10329g.p10330a.C136285a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.c */
/* compiled from: PG */
public final /* synthetic */ class C136313c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136316f f371154a;

    public /* synthetic */ C136313c(C136316f fVar) {
        this.f371154a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C136316f fVar = this.f371154a;
        fVar.mo112912a();
        C46459k.m82829b(fVar.f371159c.mo112927b(true), "Failed to set Incognito biometrics settings.", new Object[0]);
        C47393f.m84235f(new C136285a(), fVar.f371158b);
    }
}
