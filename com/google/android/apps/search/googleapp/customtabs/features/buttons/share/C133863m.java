package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import android.content.Intent;
import android.content.IntentSender;
import android.databinding.C0118a;
import android.net.Uri;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58852bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.m */
/* compiled from: PG */
public final /* synthetic */ class C133863m implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C133865o f364597a;

    public /* synthetic */ C133863m(C133865o oVar) {
        this.f364597a = oVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C133865o oVar = this.f364597a;
        IntentSender intentSender = (IntentSender) obj;
        Intent intent = oVar.f364600b.getIntent();
        Uri data = intent.getData();
        if (data == null) {
            C0118a.m108p(C133865o.f364599a.mo56225c(), "The URL to share was not provided", 40160, C38505d.f101864b, 150768970);
        } else {
            String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
            Optional b = C133456e.m216615b(data);
            if (b.isPresent()) {
                data = (Uri) b.get();
            }
            oVar.mo111435a(data, stringExtra, intentSender);
        }
        oVar.f364600b.finish();
    }
}
