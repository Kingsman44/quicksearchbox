package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.v */
/* compiled from: PG */
public final /* synthetic */ class C102073v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Fragment f284765a;

    /* renamed from: b */
    public final /* synthetic */ String f284766b;

    public /* synthetic */ C102073v(Fragment fragment, String str) {
        this.f284765a = fragment;
        this.f284766b = str;
    }

    public final void run() {
        Fragment fragment = this.f284765a;
        String str = this.f284766b;
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52494c = str;
        c.mo24023e("voice_settings");
        cVar.f52492a = "speaker_id_enrollment";
        fragment.startActivityForResult(c.mo24020b().mo24031a(), 0);
    }
}
