package com.google.apps.tiktok.monitoring.feedback;

import android.net.Uri;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.e */
/* compiled from: PG */
public final class C47467e extends C47486w {

    /* renamed from: a */
    public String f123263a;

    /* renamed from: b */
    private Uri f123264b;

    /* renamed from: c */
    private C58485gu f123265c;

    /* renamed from: a */
    public final C47488y mo51320a() {
        Uri uri;
        if (this.f123265c == null) {
            this.f123265c = C58485gu.m89845m();
        }
        String str = this.f123263a;
        if (str != null && (uri = this.f123264b) != null) {
            return new C47468f(str, uri, this.f123265c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f123263a == null) {
            sb.append(" helpCenterContext");
        }
        if (this.f123264b == null) {
            sb.append(" fallbackSupportUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo51321b(Uri uri) {
        if (uri != null) {
            this.f123264b = uri;
            return;
        }
        throw new NullPointerException("Null fallbackSupportUri");
    }
}
