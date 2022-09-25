package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.internal.arn;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ad */
/* compiled from: PG */
final class C6711ad extends C6744bj {
    private arn obstructions;

    public C6747bm build() {
        String str = this.obstructions == null ? " obstructions" : BuildConfig.FLAVOR;
        if (str.isEmpty()) {
            return new C6712ae(this.obstructions);
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    public C6744bj obstructions(List list) {
        this.obstructions = arn.m19405l(list);
        return this;
    }
}
