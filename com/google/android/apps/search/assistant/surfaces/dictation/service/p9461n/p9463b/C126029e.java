package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy;
import com.google.assistant.p3931f.p3939c.C52829f;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e */
/* compiled from: PG */
public final class C126029e extends C126035k {

    /* renamed from: a */
    public final String f347340a;

    /* renamed from: b */
    public final C126034j f347341b;

    /* renamed from: c */
    public final C52829f f347342c;

    /* renamed from: d */
    public final C126087cy f347343d;

    /* renamed from: e */
    public final Locale f347344e;

    /* renamed from: f */
    public final boolean f347345f;

    /* renamed from: g */
    public final boolean f347346g;

    public C126029e(String str, C126034j jVar, C52829f fVar, C126087cy cyVar, Locale locale, boolean z, boolean z2) {
        this.f347340a = str;
        this.f347341b = jVar;
        this.f347342c = fVar;
        this.f347343d = cyVar;
        this.f347344e = locale;
        this.f347345f = z;
        this.f347346g = z2;
    }

    /* renamed from: a */
    public final C126087cy mo107253a() {
        return this.f347343d;
    }

    /* renamed from: b */
    public final C126034j mo107254b() {
        return this.f347341b;
    }

    /* renamed from: c */
    public final C52829f mo107255c() {
        return this.f347342c;
    }

    /* renamed from: d */
    public final String mo107256d() {
        return this.f347340a;
    }

    /* renamed from: e */
    public final Locale mo107257e() {
        return this.f347344e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126035k) {
            C126035k kVar = (C126035k) obj;
            return this.f347340a.equals(kVar.mo107256d()) && this.f347341b.equals(kVar.mo107254b()) && this.f347342c.equals(kVar.mo107255c()) && this.f347343d.equals(kVar.mo107253a()) && this.f347344e.equals(kVar.mo107257e()) && this.f347345f == kVar.mo107260g() && this.f347346g == kVar.mo107259f();
        }
    }

    /* renamed from: f */
    public final boolean mo107259f() {
        return this.f347346g;
    }

    /* renamed from: g */
    public final boolean mo107260g() {
        return this.f347345f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.f347340a.hashCode() ^ 1000003) * 1000003) ^ this.f347341b.hashCode()) * 1000003) ^ this.f347342c.hashCode()) * 1000003) ^ this.f347343d.hashCode()) * 1000003) ^ this.f347344e.hashCode()) * 1000003) ^ (true != this.f347345f ? 1237 : 1231)) * 1000003;
        if (true == this.f347346g) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f347340a;
        String obj = this.f347341b.toString();
        String obj2 = this.f347342c.toString();
        String obj3 = this.f347343d.toString();
        String obj4 = this.f347344e.toString();
        boolean z = this.f347345f;
        boolean z2 = this.f347346g;
        return "KeyboardUiSuggestionRequest{packageName=" + str + ", fieldContext=" + obj + ", appActionsContext=" + obj2 + ", keyboardUiState=" + obj3 + ", locale=" + obj4 + ", supportsEmojiSuggestions=" + z + ", canShowLanguagePicker=" + z2 + "}";
    }
}
