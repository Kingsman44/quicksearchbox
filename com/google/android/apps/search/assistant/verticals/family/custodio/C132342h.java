package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.h */
/* compiled from: PG */
public final /* synthetic */ class C132342h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132347m f361264a;

    public /* synthetic */ C132342h(C132347m mVar) {
        this.f361264a = mVar;
    }

    public final void onClick(View view) {
        C132347m mVar = this.f361264a;
        mVar.f361279k.mo19974a(C37176a.f97021dg);
        C47709i.m84861a(mVar.f361270b, new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/assistant/?p=parental_controls")));
    }
}
