package com.google.android.libraries.surveys.internal.p3322b;

import android.util.Log;
import com.google.android.libraries.surveys.C43028e;

/* renamed from: com.google.android.libraries.surveys.internal.b.a */
/* compiled from: PG */
public final class C43034a {

    /* renamed from: a */
    final /* synthetic */ C43035b f112557a;

    public C43034a(C43035b bVar) {
        this.f112557a = bVar;
    }

    /* renamed from: a */
    public final void mo46055a() {
        synchronized (C43035b.f112559b) {
            if (!C43035b.f112559b.get()) {
                Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            C43035b.f112559b.set(false);
        }
        C43035b bVar = this.f112557a;
        bVar.f112567j = System.currentTimeMillis();
        C43028e eVar = bVar.f112560c;
        if (eVar != null) {
            eVar.mo33739g(bVar.f112561d.mo46048a());
        }
    }

    /* renamed from: b */
    public final void mo46056b() {
        C43035b.m75938a();
        C43035b bVar = this.f112557a;
        C43028e eVar = bVar.f112560c;
        if (eVar != null) {
            eVar.mo33740h(bVar.f112561d.mo46048a());
        }
    }
}
