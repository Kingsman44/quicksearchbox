package com.google.android.libraries.search.assistant.p2868z.p2869a;

import com.google.assistant.p3861at.acx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.z.a.i */
/* compiled from: PG */
final class C37171i extends C37167e {

    /* renamed from: a */
    private final acx f96777a;

    /* renamed from: b */
    private final Optional f96778b;

    /* renamed from: c */
    private final String f96779c;

    /* renamed from: d */
    private final Optional f96780d;

    public C37171i(acx acx, Optional optional, String str, Optional optional2) {
        this.f96777a = acx;
        this.f96778b = optional;
        this.f96779c = str;
        this.f96780d = optional2;
    }

    /* renamed from: a */
    public final acx mo40679a() {
        return this.f96777a;
    }

    /* renamed from: b */
    public final Optional mo40680b() {
        return this.f96778b;
    }

    /* renamed from: c */
    public final Optional mo40681c() {
        return this.f96780d;
    }

    /* renamed from: d */
    public final String mo40682d() {
        return this.f96779c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37167e) {
            C37167e eVar = (C37167e) obj;
            return this.f96777a.equals(eVar.mo40679a()) && this.f96778b.equals(eVar.mo40680b()) && this.f96779c.equals(eVar.mo40682d()) && this.f96780d.equals(eVar.mo40681c());
        }
    }

    public final int hashCode() {
        return ((((((this.f96777a.hashCode() ^ 1000003) * 1000003) ^ this.f96778b.hashCode()) * 1000003) ^ this.f96779c.hashCode()) * 1000003) ^ this.f96780d.hashCode();
    }

    public final String toString() {
        String obj = this.f96777a.toString();
        String valueOf = String.valueOf(this.f96778b);
        String str = this.f96779c;
        String valueOf2 = String.valueOf(this.f96780d);
        return "AssistantSettingsUpdateRequest{settingsUiUpdate=" + obj + ", impersonatedUser=" + valueOf + ", sourceId=" + str + ", versionInfo=" + valueOf2 + "}";
    }
}
