package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.g */
/* compiled from: PG */
final class C126330g extends C126292aa {

    /* renamed from: a */
    public final Locale f348005a;

    /* renamed from: b */
    public final String f348006b;

    /* renamed from: c */
    public final C119299u f348007c;

    /* renamed from: d */
    public final Duration f348008d;

    /* renamed from: e */
    public final C119297s f348009e;

    /* renamed from: f */
    public final long f348010f;

    public C126330g(Locale locale, String str, C119299u uVar, Duration duration, C119297s sVar, long j) {
        this.f348005a = locale;
        this.f348006b = str;
        this.f348007c = uVar;
        this.f348008d = duration;
        this.f348009e = sVar;
        this.f348010f = j;
    }

    /* renamed from: a */
    public final long mo107508a() {
        return this.f348010f;
    }

    /* renamed from: b */
    public final C119297s mo107509b() {
        return this.f348009e;
    }

    /* renamed from: c */
    public final C119299u mo107510c() {
        return this.f348007c;
    }

    /* renamed from: d */
    public final C126349z mo107511d() {
        return new C126329f(this);
    }

    /* renamed from: e */
    public final Duration mo107512e() {
        return this.f348008d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126292aa) {
            C126292aa aaVar = (C126292aa) obj;
            return this.f348005a.equals(aaVar.mo107514g()) && this.f348006b.equals(aaVar.mo107513f()) && this.f348007c.equals(aaVar.mo107510c()) && this.f348008d.equals(aaVar.mo107512e()) && this.f348009e.equals(aaVar.mo107509b()) && this.f348010f == aaVar.mo107508a();
        }
    }

    /* renamed from: f */
    public final String mo107513f() {
        return this.f348006b;
    }

    /* renamed from: g */
    public final Locale mo107514g() {
        return this.f348005a;
    }

    public final int hashCode() {
        int hashCode = this.f348005a.hashCode();
        int hashCode2 = this.f348006b.hashCode();
        int hashCode3 = this.f348007c.hashCode();
        int hashCode4 = this.f348008d.hashCode();
        int hashCode5 = this.f348009e.hashCode();
        long j = this.f348010f;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String obj = this.f348005a.toString();
        String str = this.f348006b;
        String num = Integer.toString(this.f348007c.getNumber());
        String obj2 = this.f348008d.toString();
        String num2 = Integer.toString(this.f348009e.getNumber());
        long j = this.f348010f;
        return "DictationParams{initialSpokenLocale=" + obj + ", initialText=" + str + ", initialStickiness=" + num + ", idleTimeout=" + obj2 + ", requester=" + num2 + ", dictationId=" + j + "}";
    }
}
