package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.g */
/* compiled from: PG */
final class C26180g extends C26138ag {

    /* renamed from: a */
    public final C58485gu f71132a;

    /* renamed from: b */
    public final String f71133b;

    /* renamed from: c */
    public final Locale f71134c;

    /* renamed from: d */
    public final C58495hd f71135d;

    /* renamed from: e */
    public final C58495hd f71136e;

    /* renamed from: f */
    public final boolean f71137f;

    public C26180g(C58485gu guVar, String str, Locale locale, C58495hd hdVar, C58495hd hdVar2, boolean z) {
        this.f71132a = guVar;
        this.f71133b = str;
        this.f71134c = locale;
        this.f71135d = hdVar;
        this.f71136e = hdVar2;
        this.f71137f = z;
    }

    /* renamed from: a */
    public final C58485gu mo31374a() {
        return this.f71132a;
    }

    /* renamed from: b */
    public final C58495hd mo31375b() {
        return this.f71136e;
    }

    /* renamed from: c */
    public final C58495hd mo31376c() {
        return this.f71135d;
    }

    /* renamed from: d */
    public final String mo31377d() {
        return this.f71133b;
    }

    /* renamed from: e */
    public final Locale mo31378e() {
        return this.f71134c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26138ag) {
            C26138ag agVar = (C26138ag) obj;
            return C58597ky.m90218i(this.f71132a, agVar.mo31374a()) && this.f71133b.equals(agVar.mo31377d()) && this.f71134c.equals(agVar.mo31378e()) && this.f71135d.equals(agVar.mo31376c()) && this.f71136e.equals(agVar.mo31375b()) && this.f71137f == agVar.mo31379f();
        }
    }

    /* renamed from: f */
    public final boolean mo31379f() {
        return this.f71137f;
    }

    public final int hashCode() {
        return ((((((((((this.f71132a.hashCode() ^ 1000003) * 1000003) ^ this.f71133b.hashCode()) * 1000003) ^ this.f71134c.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f71135d.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f71136e.entrySet())) * 1000003) ^ (true != this.f71137f ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f71132a.toString();
        String str = this.f71133b;
        String obj2 = this.f71134c.toString();
        String obj3 = this.f71135d.toString();
        String obj4 = this.f71136e.toString();
        boolean z = this.f71137f;
        return "SearchDataParameters{locales=" + obj + ", searchQuery=" + str + ", selectedLocale=" + obj2 + ", downloadStates=" + obj3 + ", downloadProgresses=" + obj4 + ", isConnected=" + z + "}";
    }
}
