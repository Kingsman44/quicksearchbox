package com.google.android.libraries.p579ar.faceviewer.runtime;

import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10616q;
import com.google.research.xeno.effect.C66417t;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.faceviewer.runtime.a */
/* compiled from: PG */
public final /* synthetic */ class C10663a implements C66417t {

    /* renamed from: a */
    public final /* synthetic */ ExperienceJni f35581a;

    /* renamed from: b */
    public final /* synthetic */ List f35582b;

    /* renamed from: c */
    public final /* synthetic */ C10616q f35583c;

    public /* synthetic */ C10663a(ExperienceJni experienceJni, List list, C10616q qVar) {
        this.f35581a = experienceJni;
        this.f35582b = list;
        this.f35583c = qVar;
    }

    /* renamed from: a */
    public final void mo18708a(long j) {
        ExperienceJni experienceJni = this.f35581a;
        List list = this.f35582b;
        C10616q qVar = this.f35583c;
        experienceJni.nativeActivateItems(experienceJni.f35575b, list, j, NativeCallback.m25659a(qVar));
    }
}
