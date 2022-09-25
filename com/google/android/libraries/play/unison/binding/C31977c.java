package com.google.android.libraries.play.unison.binding;

import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.c */
/* compiled from: PG */
final class C31977c implements C31983i {

    /* renamed from: a */
    public final Object f85975a;

    /* renamed from: b */
    private final C31982h f85976b;

    public C31977c(Object obj, C31982h hVar) {
        C69664n.m101061g(hVar, "selectedBindableStateManager");
        this.f85975a = obj;
        this.f85976b = hVar;
    }

    /* renamed from: a */
    public final void mo37743a(Parcelable parcelable) {
        Object obj = this.f85975a;
        if (obj != null) {
            this.f85976b.mo37721c(obj, parcelable);
        }
    }
}
