package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.p */
/* compiled from: PG */
final class C77884p extends C77563ap {

    /* renamed from: a */
    private final Optional f214542a;

    /* renamed from: b */
    private final boolean f214543b;

    /* renamed from: c */
    private final C58485gu f214544c;

    /* renamed from: d */
    private final Optional f214545d;

    public C77884p(Optional optional, boolean z, C58485gu guVar, Optional optional2) {
        this.f214542a = optional;
        this.f214543b = z;
        this.f214544c = guVar;
        this.f214545d = optional2;
    }

    /* renamed from: a */
    public final C58485gu mo72668a() {
        return this.f214544c;
    }

    /* renamed from: b */
    public final Optional mo72669b() {
        return this.f214545d;
    }

    /* renamed from: c */
    public final Optional mo72670c() {
        return this.f214542a;
    }

    /* renamed from: d */
    public final boolean mo72671d() {
        return this.f214543b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77563ap) {
            C77563ap apVar = (C77563ap) obj;
            return this.f214542a.equals(apVar.mo72670c()) && this.f214543b == apVar.mo72671d() && C58597ky.m90218i(this.f214544c, apVar.mo72668a()) && this.f214545d.equals(apVar.mo72669b());
        }
    }

    public final int hashCode() {
        return ((((((this.f214542a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f214543b ? 1237 : 1231)) * 1000003) ^ this.f214544c.hashCode()) * 1000003) ^ this.f214545d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f214542a);
        boolean z = this.f214543b;
        String obj = this.f214544c.toString();
        String valueOf2 = String.valueOf(this.f214545d);
        return "SpeakerInfo{recognitionEngine=" + valueOf + ", isSpeakerEnrolled=" + z + ", confidences=" + obj + ", accumulatedConfidence=" + valueOf2 + "}";
    }
}
