package com.google.android.libraries.home.coreui.devicetile.p1954a;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.a.d */
/* compiled from: PG */
public class C23642d {

    /* renamed from: a */
    private final String f64659a;

    /* renamed from: b */
    private final boolean f64660b;

    public /* synthetic */ C23642d(String str, boolean z, int i) {
        boolean z2 = true;
        str = 1 == (i & 1) ? BuildConfig.FLAVOR : str;
        z2 = (i & 2) != 0 ? false : z2;
        this.f64659a = str;
        this.f64660b = z2 & z;
    }

    /* renamed from: a */
    public String mo28966a() {
        return this.f64659a;
    }

    /* renamed from: b */
    public boolean mo28976b() {
        return this.f64660b;
    }

    /* renamed from: c */
    public boolean mo28977c() {
        return false;
    }
}
