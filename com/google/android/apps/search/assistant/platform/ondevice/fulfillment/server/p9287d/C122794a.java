package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a */
/* compiled from: PG */
public final class C122794a extends C122827b {

    /* renamed from: a */
    public final Locale f340144a;

    /* renamed from: b */
    public final C122463r f340145b;

    public C122794a(Locale locale, C122463r rVar) {
        this.f340144a = locale;
        if (rVar != null) {
            this.f340145b = rVar;
            return;
        }
        throw new NullPointerException("Null configurationParams");
    }

    /* renamed from: a */
    public final C122463r mo105738a() {
        return this.f340145b;
    }

    /* renamed from: b */
    public final Locale mo105739b() {
        return this.f340144a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122827b) {
            C122827b bVar = (C122827b) obj;
            return this.f340144a.equals(bVar.mo105739b()) && this.f340145b.equals(bVar.mo105738a());
        }
    }

    public final int hashCode() {
        return ((this.f340144a.hashCode() ^ 1000003) * 1000003) ^ this.f340145b.hashCode();
    }

    public final String toString() {
        String obj = this.f340144a.toString();
        String obj2 = this.f340145b.toString();
        return "LifecycleArguments{locale=" + obj + ", configurationParams=" + obj2 + "}";
    }
}
