package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.d */
/* compiled from: PG */
public final class C126027d extends C126034j {

    /* renamed from: a */
    public final boolean f347332a;

    /* renamed from: b */
    public final boolean f347333b;

    /* renamed from: c */
    public final boolean f347334c;

    /* renamed from: d */
    public final boolean f347335d;

    /* renamed from: e */
    public final int f347336e;

    public C126027d(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f347336e = i;
        this.f347332a = z;
        this.f347333b = z2;
        this.f347334c = z3;
        this.f347335d = z4;
    }

    /* renamed from: a */
    public final boolean mo107244a() {
        return this.f347333b;
    }

    /* renamed from: b */
    public final boolean mo107245b() {
        return this.f347332a;
    }

    /* renamed from: c */
    public final boolean mo107246c() {
        return this.f347335d;
    }

    /* renamed from: d */
    public final boolean mo107247d() {
        return this.f347334c;
    }

    /* renamed from: e */
    public final int mo107248e() {
        return this.f347336e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126034j) {
            C126034j jVar = (C126034j) obj;
            return this.f347336e == jVar.mo107248e() && this.f347332a == jVar.mo107245b() && this.f347333b == jVar.mo107244a() && this.f347334c == jVar.mo107247d() && this.f347335d == jVar.mo107246c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((this.f347336e ^ 1000003) * 1000003) ^ (true != this.f347332a ? 1237 : 1231)) * 1000003) ^ (true != this.f347333b ? 1237 : 1231)) * 1000003) ^ (true != this.f347334c ? 1237 : 1231)) * 1000003;
        if (true == this.f347335d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.f347336e;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NORMAL_TEXT" : "WEB_EDIT_TEXT" : "EMAIL_SUBJECT" : "EMAIL_ADDRESS" : "UNKNOWN";
        boolean z = this.f347332a;
        boolean z2 = this.f347333b;
        boolean z3 = this.f347334c;
        boolean z4 = this.f347335d;
        return "KeyboardUiSuggestionFieldContext{fieldType=" + str + ", hasText=" + z + ", acceptsUndo=" + z2 + ", supportsSendAction=" + z3 + ", supportsSearchAction=" + z4 + "}";
    }
}
