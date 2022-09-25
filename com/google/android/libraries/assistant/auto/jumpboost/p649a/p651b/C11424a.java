package com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b;

import android.content.SharedPreferences;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.b.a */
/* compiled from: PG */
final class C11424a implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ C11425b f37184a;

    public C11424a(C11425b bVar) {
        this.f37184a = bVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C69664n.m101061g(sharedPreferences, "sharedPreferences");
        C11425b bVar = this.f37184a;
        synchronized (bVar) {
            if (bVar.f37187b && bVar.mo19960d()) {
                bVar.mo19959c();
                bVar.f37186a.mo41686a("HOTWORD_SETTING_CHANGED");
            }
        }
    }
}
