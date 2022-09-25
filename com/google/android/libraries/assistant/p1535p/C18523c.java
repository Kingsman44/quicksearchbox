package com.google.android.libraries.assistant.p1535p;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.assistant.p.c */
/* compiled from: PG */
public final class C18523c extends C18509a {

    /* renamed from: a */
    public String f52492a;

    /* renamed from: b */
    public Bundle f52493b;

    /* renamed from: c */
    public String f52494c;

    /* renamed from: d */
    public String f52495d;

    /* renamed from: a */
    public final Bundle mo24019a() {
        Bundle bundle = this.f52493b;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Property \"featureArguments\" has not been set");
    }

    /* renamed from: b */
    public final C18522b mo24020b() {
        String str;
        Bundle bundle = this.f52493b;
        if (bundle != null && (str = this.f52495d) != null) {
            return new C18524d(this.f52492a, bundle, this.f52494c, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f52493b == null) {
            sb.append(" featureArguments");
        }
        if (this.f52495d == null) {
            sb.append(" gsaPackageName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: f */
    public final void mo24024f(String str) {
        this.f52492a = str;
    }

    /* renamed from: h */
    public final void mo24026h(Bundle bundle) {
        this.f52493b = bundle;
    }
}
