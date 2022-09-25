package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.support.p031v4.app.C0167am;
import com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9497a.C126686a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ak */
/* compiled from: PG */
final class C126697ak implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C126696aj f348924a;

    public C126697ak(C126696aj ajVar) {
        this.f348924a = ajVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C126686a aVar = (C126686a) bVar;
        C126696aj ajVar = this.f348924a;
        C0167am activity = ajVar.f348920b.getActivity();
        if (activity == null) {
            return C47392e.f123115a;
        }
        if (ajVar.f348921c || ajVar.f348922d) {
            C126728o.m207278c(ajVar.f348920b);
        } else {
            String str = aVar.f348880a;
            activity.setResult(aVar.f348881b);
            ajVar.mo107690a(str);
        }
        return C47392e.f123115a;
    }
}
