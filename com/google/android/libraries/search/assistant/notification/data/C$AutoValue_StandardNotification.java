package com.google.android.libraries.search.assistant.notification.data;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.$AutoValue_StandardNotification  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_StandardNotification extends StandardNotification {

    /* renamed from: a */
    public final String f92495a;

    /* renamed from: b */
    public final String f92496b;

    /* renamed from: c */
    public final Optional f92497c;

    /* renamed from: d */
    public final Optional f92498d;

    /* renamed from: e */
    public final Optional f92499e;

    /* renamed from: f */
    public final boolean f92500f;

    /* renamed from: g */
    public final String f92501g;

    /* renamed from: h */
    public final Optional f92502h;

    /* renamed from: i */
    public final Optional f92503i;

    /* renamed from: j */
    public final Optional f92504j;

    /* renamed from: k */
    public final CharSequence f92505k;

    public C$AutoValue_StandardNotification(String str, String str2, Optional optional, Optional optional2, Optional optional3, boolean z, String str3, Optional optional4, Optional optional5, Optional optional6, CharSequence charSequence) {
        if (str != null) {
            this.f92495a = str;
            if (str2 != null) {
                this.f92496b = str2;
                if (optional != null) {
                    this.f92497c = optional;
                    if (optional2 != null) {
                        this.f92498d = optional2;
                        if (optional3 != null) {
                            this.f92499e = optional3;
                            this.f92500f = z;
                            if (str3 != null) {
                                this.f92501g = str3;
                                if (optional4 != null) {
                                    this.f92502h = optional4;
                                    if (optional5 != null) {
                                        this.f92503i = optional5;
                                        if (optional6 != null) {
                                            this.f92504j = optional6;
                                            if (charSequence != null) {
                                                this.f92505k = charSequence;
                                                return;
                                            }
                                            throw new NullPointerException("Null contentBody");
                                        }
                                        throw new NullPointerException("Null contentHeader");
                                    }
                                    throw new NullPointerException("Null contentCreationTimeMillis");
                                }
                                throw new NullPointerException("Null postTimeMillis");
                            }
                            throw new NullPointerException("Null key");
                        }
                        throw new NullPointerException("Null chime");
                    }
                    throw new NullPointerException("Null category");
                }
                throw new NullPointerException("Null attachments");
            }
            throw new NullPointerException("Null packageName");
        }
        throw new NullPointerException("Null appName");
    }

    /* renamed from: a */
    public final Optional mo39574a() {
        return this.f92504j;
    }

    /* renamed from: b */
    public final CharSequence mo39575b() {
        return this.f92505k;
    }

    /* renamed from: d */
    public final Optional mo39545d() {
        return this.f92497c;
    }

    /* renamed from: e */
    public final Optional mo39546e() {
        return this.f92498d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardNotification) {
            StandardNotification standardNotification = (StandardNotification) obj;
            return this.f92495a.equals(standardNotification.mo39563t()) && this.f92496b.equals(standardNotification.mo39566v()) && this.f92497c.equals(standardNotification.mo39545d()) && this.f92498d.equals(standardNotification.mo39546e()) && this.f92499e.equals(standardNotification.mo39548f()) && this.f92500f == standardNotification.mo39567w() && this.f92501g.equals(standardNotification.mo39565u()) && this.f92502h.equals(standardNotification.mo39561r()) && this.f92503i.equals(standardNotification.mo39549g()) && this.f92504j.equals(standardNotification.mo39574a()) && this.f92505k.equals(standardNotification.mo39575b());
        }
    }

    /* renamed from: f */
    public final Optional mo39548f() {
        return this.f92499e;
    }

    /* renamed from: g */
    public final Optional mo39549g() {
        return this.f92503i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f92495a.hashCode() ^ 1000003) * 1000003) ^ this.f92496b.hashCode()) * 1000003) ^ this.f92497c.hashCode()) * 1000003) ^ this.f92498d.hashCode()) * 1000003) ^ this.f92499e.hashCode()) * 1000003) ^ (true != this.f92500f ? 1237 : 1231)) * 1000003) ^ this.f92501g.hashCode()) * 1000003) ^ this.f92502h.hashCode()) * 1000003) ^ this.f92503i.hashCode()) * 1000003) ^ this.f92504j.hashCode()) * 1000003) ^ this.f92505k.hashCode();
    }

    /* renamed from: r */
    public final Optional mo39561r() {
        return this.f92502h;
    }

    /* renamed from: t */
    public final String mo39563t() {
        return this.f92495a;
    }

    public final String toString() {
        String str = this.f92495a;
        String str2 = this.f92496b;
        String obj = this.f92497c.toString();
        String obj2 = this.f92498d.toString();
        String obj3 = this.f92499e.toString();
        boolean z = this.f92500f;
        String str3 = this.f92501g;
        String obj4 = this.f92502h.toString();
        String obj5 = this.f92503i.toString();
        String obj6 = this.f92504j.toString();
        String obj7 = this.f92505k.toString();
        return "StandardNotification{appName=" + str + ", packageName=" + str2 + ", attachments=" + obj + ", category=" + obj2 + ", chime=" + obj3 + ", doesAlert=" + z + ", key=" + str3 + ", postTimeMillis=" + obj4 + ", contentCreationTimeMillis=" + obj5 + ", contentHeader=" + obj6 + ", contentBody=" + obj7 + "}";
    }

    /* renamed from: u */
    public final String mo39565u() {
        return this.f92501g;
    }

    /* renamed from: v */
    public final String mo39566v() {
        return this.f92496b;
    }

    /* renamed from: w */
    public final boolean mo39567w() {
        return this.f92500f;
    }
}
