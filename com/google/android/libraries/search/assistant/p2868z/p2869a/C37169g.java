package com.google.android.libraries.search.assistant.p2868z.p2869a;

import com.google.assistant.p3861at.acv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.z.a.g */
/* compiled from: PG */
final class C37169g extends C37164b {

    /* renamed from: a */
    private final acv f96768a;

    /* renamed from: b */
    private final Optional f96769b;

    /* renamed from: c */
    private final Optional f96770c;

    /* renamed from: d */
    private final String f96771d;

    /* renamed from: e */
    private final Optional f96772e;

    public C37169g(acv acv, Optional optional, Optional optional2, String str, Optional optional3) {
        this.f96768a = acv;
        this.f96769b = optional;
        this.f96770c = optional2;
        this.f96771d = str;
        this.f96772e = optional3;
    }

    /* renamed from: a */
    public final acv mo40671a() {
        return this.f96768a;
    }

    /* renamed from: b */
    public final Optional mo40672b() {
        return this.f96770c;
    }

    /* renamed from: c */
    public final Optional mo40673c() {
        return this.f96769b;
    }

    /* renamed from: d */
    public final Optional mo40674d() {
        return this.f96772e;
    }

    /* renamed from: e */
    public final String mo40675e() {
        return this.f96771d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37164b) {
            C37164b bVar = (C37164b) obj;
            return this.f96768a.equals(bVar.mo40671a()) && this.f96769b.equals(bVar.mo40673c()) && this.f96770c.equals(bVar.mo40672b()) && this.f96771d.equals(bVar.mo40675e()) && this.f96772e.equals(bVar.mo40674d());
        }
    }

    public final int hashCode() {
        return ((((((((this.f96768a.hashCode() ^ 1000003) * 1000003) ^ this.f96769b.hashCode()) * 1000003) ^ this.f96770c.hashCode()) * 1000003) ^ this.f96771d.hashCode()) * 1000003) ^ this.f96772e.hashCode();
    }

    public final String toString() {
        String obj = this.f96768a.toString();
        String valueOf = String.valueOf(this.f96769b);
        String valueOf2 = String.valueOf(this.f96770c);
        String str = this.f96771d;
        String valueOf3 = String.valueOf(this.f96772e);
        return "AssistantSettingsGetRequest{settingsUiSelector=" + obj + ", impersonatedUser=" + valueOf + ", clientCapabilities=" + valueOf2 + ", sourceId=" + str + ", versionInfo=" + valueOf3 + "}";
    }
}
