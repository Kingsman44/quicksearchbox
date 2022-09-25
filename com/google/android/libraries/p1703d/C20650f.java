package com.google.android.libraries.p1703d;

import android.app.PendingIntent;

/* renamed from: com.google.android.libraries.d.f */
/* compiled from: PG */
public final class C20650f extends C20666v {

    /* renamed from: a */
    public PendingIntent f57899a;

    /* renamed from: b */
    private String f57900b;

    /* renamed from: a */
    public final C20667w mo25620a() {
        PendingIntent pendingIntent;
        String str = this.f57900b;
        if (str != null && (pendingIntent = this.f57899a) != null) {
            return new C20651g(str, pendingIntent);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f57900b == null) {
            sb.append(" title");
        }
        if (this.f57899a == null) {
            sb.append(" pendingIntent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo25621b(String str) {
        if (str != null) {
            this.f57900b = str;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
