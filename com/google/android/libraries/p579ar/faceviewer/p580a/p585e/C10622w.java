package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.android.libraries.p579ar.faceviewer.runtime.ExperienceJni;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.w */
/* compiled from: PG */
public final class C10622w implements AutoCloseable {

    /* renamed from: a */
    public final ExperienceJni f35494a;

    public C10622w(ExperienceJni experienceJni) {
        this.f35494a = experienceJni;
    }

    public final void close() {
        ExperienceJni experienceJni = this.f35494a;
        long j = experienceJni.f35575b;
        if (j != 0) {
            experienceJni.nativeDestroy(j);
            experienceJni.f35575b = 0;
        }
    }
}
