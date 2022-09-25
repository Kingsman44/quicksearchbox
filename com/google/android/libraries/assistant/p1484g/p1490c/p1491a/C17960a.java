package com.google.android.libraries.assistant.p1484g.p1490c.p1491a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.assistant.g.c.a.a */
/* compiled from: PG */
final class C17960a extends C18094h {

    /* renamed from: a */
    private Uri f51421a;

    /* renamed from: b */
    private String f51422b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23506a() {
        String str;
        Uri uri = this.f51421a;
        if (uri != null && (str = this.f51422b) != null) {
            return new C17963b(uri, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51421a == null) {
            sb.append(" uri");
        }
        if (this.f51422b == null) {
            sb.append(" mimeType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo23507b(String str) {
        if (str != null) {
            this.f51422b = str;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }

    /* renamed from: c */
    public final void mo23508c(Uri uri) {
        if (uri != null) {
            this.f51421a = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
