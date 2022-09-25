package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import androidx.activity.result.C0816c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.ak */
/* compiled from: PG */
public final class C129354ak {

    /* renamed from: a */
    public static final C59071e f355248a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.d.ak");

    /* renamed from: b */
    public final C129351ah f355249b;

    /* renamed from: c */
    public final C127118j f355250c;

    /* renamed from: d */
    public C0816c f355251d;

    /* renamed from: e */
    private final C126988i f355252e;

    public C129354ak(C129351ah ahVar, C127118j jVar, C126988i iVar) {
        this.f355249b = ahVar;
        this.f355250c = jVar;
        this.f355252e = iVar;
    }

    /* renamed from: a */
    public final String mo108982a() {
        C126985f a = C126985f.m207727a(this.f355252e.f349676f);
        if (a == null) {
            a = C126985f.ERROR_UNKNOWN;
        }
        if (a == C126985f.ERROR_AUDIO_PERMISSION_DENIED) {
            return "android.permission.RECORD_AUDIO";
        }
        throw new IllegalStateException("Unsupported permission type");
    }

    /* renamed from: b */
    public final void mo108983b() {
        C0816c cVar = this.f355251d;
        cVar.getClass();
        cVar.mo526b("android.permission.RECORD_AUDIO");
    }
}
