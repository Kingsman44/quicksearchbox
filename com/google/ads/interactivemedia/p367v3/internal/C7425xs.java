package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xs */
/* compiled from: PG */
public final class C7425xs extends C7426xt {

    /* renamed from: a */
    private final C7423xq f24341a;

    /* renamed from: f */
    private final C7435yb f24342f;

    public C7425xs(C6864cy cyVar, String str, C7431xy xyVar, List list) {
        super(cyVar, str, xyVar, list);
        C7423xq xqVar;
        Uri.parse(str);
        long j = xyVar.f24361b;
        C7435yb ybVar = null;
        if (j <= 0) {
            xqVar = null;
        } else {
            xqVar = new C7423xq((String) null, xyVar.f24360a, j);
        }
        this.f24341a = xqVar;
        this.f24342f = xqVar == null ? new C7435yb(new C7423xq((String) null, 0, -1)) : ybVar;
    }

    /* renamed from: k */
    public final C7423xq mo16782k() {
        return this.f24341a;
    }

    /* renamed from: l */
    public final C7403wx mo16783l() {
        return this.f24342f;
    }

    /* renamed from: m */
    public final String mo16784m() {
        return null;
    }
}
