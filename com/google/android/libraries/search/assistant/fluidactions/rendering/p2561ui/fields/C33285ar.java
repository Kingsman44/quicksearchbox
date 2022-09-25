package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ar */
/* compiled from: PG */
final class C33285ar {

    /* renamed from: a */
    public int f89258a = 0;

    /* renamed from: b */
    public int f89259b = 10;

    /* renamed from: c */
    public int f89260c = 0;

    /* renamed from: d */
    public int f89261d = 10;

    /* renamed from: e */
    public float f89262e = 10.0f;

    /* renamed from: f */
    public float f89263f = 10.0f;

    /* renamed from: g */
    private String f89264g = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final String mo38745a(int i) {
        String str = this.f89264g;
        return i + str;
    }

    /* renamed from: b */
    public final void mo38746b(int i, int i2, int i3, int i4, String str) {
        if (!(this.f89258a == i && this.f89259b == i2)) {
            this.f89258a = i;
            this.f89259b = i2;
            this.f89262e = (float) (i2 - i);
        }
        if (!(this.f89260c == i3 && this.f89261d == i4)) {
            this.f89260c = i3;
            this.f89261d = i4;
            this.f89263f = (float) (i4 - i3);
        }
        if (!this.f89264g.equals(str)) {
            this.f89264g = str;
        }
    }
}
