package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.b */
/* compiled from: PG */
final class C105861b extends C105881v {

    /* renamed from: a */
    private final Locale f295467a;

    /* renamed from: b */
    private final Locale f295468b;

    /* renamed from: c */
    private final Locale f295469c;

    public C105861b(Locale locale, Locale locale2, Locale locale3) {
        if (locale != null) {
            this.f295467a = locale;
            if (locale2 != null) {
                this.f295468b = locale2;
                if (locale3 != null) {
                    this.f295469c = locale3;
                    return;
                }
                throw new NullPointerException("Null triggerLocale");
            }
            throw new NullPointerException("Null targetLocale");
        }
        throw new NullPointerException("Null sourceLocale");
    }

    /* renamed from: a */
    public final Locale mo95116a() {
        return this.f295467a;
    }

    /* renamed from: b */
    public final Locale mo95117b() {
        return this.f295468b;
    }

    /* renamed from: c */
    public final Locale mo95118c() {
        return this.f295469c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105881v) {
            C105881v vVar = (C105881v) obj;
            return this.f295467a.equals(vVar.mo95116a()) && this.f295468b.equals(vVar.mo95117b()) && this.f295469c.equals(vVar.mo95118c());
        }
    }

    public final int hashCode() {
        return ((((this.f295467a.hashCode() ^ 1000003) * 1000003) ^ this.f295468b.hashCode()) * 1000003) ^ this.f295469c.hashCode();
    }

    public final String toString() {
        String obj = this.f295467a.toString();
        String obj2 = this.f295468b.toString();
        String obj3 = this.f295469c.toString();
        return "ProcessedTriggerIntent{sourceLocale=" + obj + ", targetLocale=" + obj2 + ", triggerLocale=" + obj3 + "}";
    }
}
