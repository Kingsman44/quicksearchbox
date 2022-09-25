package com.google.android.libraries.gsa.conversation.p1852f;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.gsa.conversation.f.e */
/* compiled from: PG */
final class C22578e extends C22591r {

    /* renamed from: a */
    private final boolean f62220a;

    /* renamed from: b */
    private final C58833ax f62221b;

    /* renamed from: c */
    private final C58833ax f62222c;

    /* renamed from: d */
    private final int f62223d;

    /* renamed from: e */
    private final int f62224e;

    public C22578e(boolean z, int i, C58833ax axVar, C58833ax axVar2, int i2) {
        this.f62220a = z;
        this.f62223d = i;
        this.f62221b = axVar;
        this.f62222c = axVar2;
        this.f62224e = i2;
    }

    /* renamed from: a */
    public final C58833ax mo27678a() {
        return this.f62222c;
    }

    /* renamed from: b */
    public final C58833ax mo27679b() {
        return this.f62221b;
    }

    /* renamed from: c */
    public final boolean mo27680c() {
        return this.f62220a;
    }

    /* renamed from: d */
    public final int mo27681d() {
        return this.f62224e;
    }

    /* renamed from: e */
    public final int mo27682e() {
        return this.f62223d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22591r) {
            C22591r rVar = (C22591r) obj;
            return this.f62220a == rVar.mo27680c() && this.f62223d == rVar.mo27682e() && this.f62221b.equals(rVar.mo27679b()) && this.f62222c.equals(rVar.mo27678a()) && this.f62224e == rVar.mo27681d();
        }
    }

    public final int hashCode() {
        return (((((((((true != this.f62220a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f62223d) * 1000003) ^ this.f62221b.hashCode()) * 1000003) ^ this.f62222c.hashCode()) * 1000003) ^ this.f62224e;
    }

    public final String toString() {
        boolean z = this.f62220a;
        int i = this.f62223d;
        String str = i != 1 ? i != 2 ? "MUSIC_SEARCH" : "DICTATION" : "DEFAULT";
        String valueOf = String.valueOf(this.f62221b);
        String valueOf2 = String.valueOf(this.f62222c);
        int i2 = this.f62224e;
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? "VOICE_TYPING" : "MAGIC_MIC" : "DIALOG_FOLLOW_ON" : "UNKNOWN";
        return "VoiceInputParams{isFromServer=" + z + ", recognizerMode=" + str + ", requestMetadata=" + valueOf + ", interactionMetadata=" + valueOf2 + ", openMicMode=" + str2 + "}";
    }
}
