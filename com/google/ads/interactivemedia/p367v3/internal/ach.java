package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ach */
/* compiled from: PG */
public final class ach implements abw {

    /* renamed from: a */
    private final Context f20293a;

    /* renamed from: b */
    private final abw f20294b;

    public ach(Context context) {
        this(context, C6861cv.f21762a);
    }

    /* renamed from: b */
    public final acg mo14408a() {
        return new acg(this.f20293a, ((acm) this.f20294b).mo14408a());
    }

    public ach(Context context, String str) {
        acm acm = new acm(str);
        this.f20293a = context.getApplicationContext();
        this.f20294b = acm;
    }
}
