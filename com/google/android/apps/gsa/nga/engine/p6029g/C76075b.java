package com.google.android.apps.gsa.nga.engine.p6029g;

import com.google.android.apps.gsa.nga.engine.p5973ax.p5976e.C75177b;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.b */
/* compiled from: PG */
final class C76075b extends C76090f {

    /* renamed from: a */
    private final boolean f210962a;

    /* renamed from: b */
    private final boolean f210963b;

    /* renamed from: c */
    private final Optional f210964c;

    /* renamed from: d */
    private final Locale f210965d;

    /* renamed from: e */
    private final C120124o f210966e;

    /* renamed from: f */
    private final C75177b f210967f;

    /* renamed from: g */
    private final C58485gu f210968g;

    public C76075b(boolean z, boolean z2, Optional optional, Locale locale, C120124o oVar, C75177b bVar, C58485gu guVar) {
        this.f210962a = z;
        this.f210963b = z2;
        this.f210964c = optional;
        this.f210965d = locale;
        this.f210966e = oVar;
        this.f210967f = bVar;
        this.f210968g = guVar;
    }

    /* renamed from: a */
    public final C75177b mo72035a() {
        return this.f210967f;
    }

    /* renamed from: b */
    public final C120124o mo72036b() {
        return this.f210966e;
    }

    /* renamed from: c */
    public final C58485gu mo72037c() {
        return this.f210968g;
    }

    /* renamed from: d */
    public final Optional mo72038d() {
        return this.f210964c;
    }

    /* renamed from: e */
    public final Locale mo72039e() {
        return this.f210965d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76090f) {
            C76090f fVar = (C76090f) obj;
            return this.f210962a == fVar.mo72041f() && this.f210963b == fVar.mo72042g() && this.f210964c.equals(fVar.mo72038d()) && this.f210965d.equals(fVar.mo72039e()) && this.f210966e.equals(fVar.mo72036b()) && this.f210967f.equals(fVar.mo72035a()) && C58597ky.m90218i(this.f210968g, fVar.mo72037c());
        }
    }

    /* renamed from: f */
    public final boolean mo72041f() {
        return this.f210962a;
    }

    /* renamed from: g */
    public final boolean mo72042g() {
        return this.f210963b;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f210962a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f210963b) {
            i = 1231;
        }
        return ((((((((((i2 ^ i) * 1000003) ^ this.f210964c.hashCode()) * 1000003) ^ this.f210965d.hashCode()) * 1000003) ^ this.f210966e.hashCode()) * 1000003) ^ this.f210967f.hashCode()) * 1000003) ^ this.f210968g.hashCode();
    }

    public final String toString() {
        boolean z = this.f210962a;
        boolean z2 = this.f210963b;
        String valueOf = String.valueOf(this.f210964c);
        String obj = this.f210965d.toString();
        String obj2 = this.f210966e.toString();
        String obj3 = this.f210967f.toString();
        String obj4 = this.f210968g.toString();
        return "NgaConfiguration{ngaEnabled=" + z + ", ngaOnDeviceEnabled=" + z2 + ", primaryAccount=" + valueOf + ", primaryAssistantLocale=" + obj + ", currentPlatformVariance=" + obj2 + ", tngFlags=" + obj3 + ", assistantLocales=" + obj4 + "}";
    }
}
