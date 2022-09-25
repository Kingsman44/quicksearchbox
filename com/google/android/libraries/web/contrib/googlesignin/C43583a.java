package com.google.android.libraries.web.contrib.googlesignin;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.a */
/* compiled from: PG */
final class C43583a extends C43586d {

    /* renamed from: a */
    public int f113774a;

    /* renamed from: d */
    private WebFeatureConfig f113775d;

    /* renamed from: a */
    public final GoogleSignInFeature mo46637a() {
        int i;
        WebFeatureConfig webFeatureConfig = this.f113775d;
        if (webFeatureConfig != null && (i = this.f113774a) != 0) {
            return new AutoValue_GoogleSignInFeature(webFeatureConfig, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f113775d == null) {
            sb.append(" config");
        }
        if (this.f113774a == 0) {
            sb.append(" googleSignInPolicy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo46638b(WebFeatureConfig webFeatureConfig) {
        this.f113775d = webFeatureConfig;
    }
}
