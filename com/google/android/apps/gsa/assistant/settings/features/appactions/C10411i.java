package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.i */
/* compiled from: PG */
final class C10411i implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10308d f35118a;

    public C10411i(C10308d dVar) {
        this.f35118a = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C10308d dVar = this.f35118a;
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52492a = "app_integrations";
        Bundle bundle = new Bundle();
        bundle.putString("assistant_settings_app_integrations_extra", ((C10416n) bVar).mo18356a());
        cVar.f52493b = bundle;
        dVar.f34922a.startActivityForResult(c.mo24020b().mo24031a(), 0);
        return C47392e.f123115a;
    }
}
