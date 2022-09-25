package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.c */
/* compiled from: PG */
final class C102203c extends C102201ae {

    /* renamed from: a */
    public final C92380d f285180a;

    /* renamed from: b */
    public final boolean f285181b;

    public C102203c(C92380d dVar, boolean z) {
        this.f285180a = dVar;
        this.f285181b = z;
    }

    /* renamed from: a */
    public final C92380d mo92952a() {
        return this.f285180a;
    }

    /* renamed from: b */
    public final boolean mo92953b() {
        return this.f285181b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102201ae) {
            C102201ae aeVar = (C102201ae) obj;
            return this.f285180a.equals(aeVar.mo92952a()) && this.f285181b == aeVar.mo92953b();
        }
    }

    public final int hashCode() {
        return ((this.f285180a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f285181b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f285180a.toString();
        boolean z = this.f285181b;
        return "VoiceMatchConsentParams{enrollmentConfig=" + obj + ", hasLinkedDevices=" + z + "}";
    }
}
