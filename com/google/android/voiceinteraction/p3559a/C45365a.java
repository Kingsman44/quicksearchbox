package com.google.android.voiceinteraction.p3559a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.Locale;

/* renamed from: com.google.android.voiceinteraction.a.a */
/* compiled from: PG */
public final class C45365a extends C45368d {

    /* renamed from: a */
    private final int f118731a;

    /* renamed from: b */
    private final int f118732b;

    /* renamed from: c */
    private final Locale f118733c;

    /* renamed from: d */
    private final String f118734d;

    /* renamed from: e */
    private final C58485gu f118735e;

    public C45365a(int i, int i2, Locale locale, String str, C58485gu guVar) {
        this.f118731a = i;
        this.f118732b = i2;
        if (locale != null) {
            this.f118733c = locale;
            this.f118734d = str;
            if (guVar != null) {
                this.f118735e = guVar;
                return;
            }
            throw new NullPointerException("Null supportedUsers");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final int mo49455a() {
        return this.f118731a;
    }

    /* renamed from: b */
    public final int mo49456b() {
        return this.f118732b;
    }

    /* renamed from: c */
    public final C58485gu mo49457c() {
        return this.f118735e;
    }

    /* renamed from: d */
    public final String mo49458d() {
        return this.f118734d;
    }

    /* renamed from: e */
    public final Locale mo49459e() {
        return this.f118733c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45368d) {
            C45368d dVar = (C45368d) obj;
            return this.f118731a == dVar.mo49455a() && this.f118732b == dVar.mo49456b() && this.f118733c.equals(dVar.mo49459e()) && this.f118734d.equals(dVar.mo49458d()) && C58597ky.m90218i(this.f118735e, dVar.mo49457c());
        }
    }

    public final int hashCode() {
        return ((((((((this.f118731a ^ 1000003) * 1000003) ^ this.f118732b) * 1000003) ^ this.f118733c.hashCode()) * 1000003) ^ this.f118734d.hashCode()) * 1000003) ^ this.f118735e.hashCode();
    }

    public final String toString() {
        int i = this.f118731a;
        int i2 = this.f118732b;
        String obj = this.f118733c.toString();
        String str = this.f118734d;
        String obj2 = this.f118735e.toString();
        return "KeyphraseCompat{id=" + i + ", recognitionModes=" + i2 + ", locale=" + obj + ", text=" + str + ", supportedUsers=" + obj2 + "}";
    }
}
