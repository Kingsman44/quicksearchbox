package com.google.android.apps.gsa.assistant.handoff;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ah */
/* compiled from: PG */
class C9451ah extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f32872a;

    /* renamed from: b */
    private final Object f32873b = new Object();

    /* renamed from: c */
    private boolean f32874c = false;

    /* renamed from: b */
    public final C68314a mo17696b() {
        if (this.f32872a == null) {
            synchronized (this.f32873b) {
                if (this.f32872a == null) {
                    this.f32872a = new C68314a(this);
                }
            }
        }
        return this.f32872a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17696b().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f32874c) {
            this.f32874c = true;
            ((C9476i) mo17696b().mo17653jN()).mo17704a((AssistantHandoffActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo17696b().mo60324b();
    }
}
