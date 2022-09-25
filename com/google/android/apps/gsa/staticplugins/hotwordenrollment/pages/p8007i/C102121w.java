package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.view.View;
import com.google.android.gms.kids.C144432d;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.w */
/* compiled from: PG */
public final /* synthetic */ class C102121w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102123y f284892a;

    public /* synthetic */ C102121w(C102123y yVar) {
        this.f284892a = yVar;
    }

    public final void onClick(View view) {
        C102123y yVar = this.f284892a;
        C144432d dVar = yVar.f284898e;
        GetParentVerificationIntentRequest getParentVerificationIntentRequest = new GetParentVerificationIntentRequest();
        getParentVerificationIntentRequest.f391020b = 1;
        getParentVerificationIntentRequest.f391021c = "fab493dd";
        getParentVerificationIntentRequest.f391022d = 1;
        C146006ab a = dVar.mo119887a(getParentVerificationIntentRequest);
        C46439e eVar = yVar.f284903j;
        C46438d dVar2 = new C46438d(C43205e.m76192b(a));
        eVar.mo50428h(dVar2.f121541a, (Object) null, yVar.f284905l);
    }
}
