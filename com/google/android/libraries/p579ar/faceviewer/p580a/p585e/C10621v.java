package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.p579ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.p579ar.faceviewer.runtime.NativeCallback;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.v */
/* compiled from: PG */
public final /* synthetic */ class C10621v implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C10622w f35493a;

    public /* synthetic */ C10621v(C10622w wVar) {
        this.f35493a = wVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        ExperienceJni experienceJni = this.f35493a.f35494a;
        experienceJni.nativePreloadAllItems(experienceJni.f35575b, NativeCallback.m25659a(C10616q.m25590a(cVar)));
        return "Experience.preloadAllItems";
    }
}
