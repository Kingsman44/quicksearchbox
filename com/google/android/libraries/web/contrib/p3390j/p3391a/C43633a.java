package com.google.android.libraries.web.contrib.p3390j.p3391a;

import android.text.TextUtils;

/* renamed from: com.google.android.libraries.web.contrib.j.a.a */
/* compiled from: PG */
final class C43633a extends C43636d {

    /* renamed from: a */
    public String f113879a;

    /* renamed from: b */
    public int f113880b;

    /* renamed from: c */
    private TextUtils.TruncateAt f113881c;

    public C43633a() {
    }

    public C43633a(C43637e eVar) {
        C43634b bVar = (C43634b) eVar;
        this.f113879a = bVar.f113882a;
        this.f113881c = bVar.f113883b;
        this.f113880b = bVar.f113884c;
    }

    /* renamed from: a */
    public final C43637e mo46657a() {
        TextUtils.TruncateAt truncateAt;
        int i;
        String str = this.f113879a;
        if (str != null && (truncateAt = this.f113881c) != null && (i = this.f113880b) != 0) {
            return new C43634b(str, truncateAt, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f113879a == null) {
            sb.append(" displayText");
        }
        if (this.f113881c == null) {
            sb.append(" displayTextTruncation");
        }
        if (this.f113880b == 0) {
            sb.append(" iconType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo46658b(String str) {
        if (str != null) {
            this.f113879a = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: c */
    public final void mo46659c(TextUtils.TruncateAt truncateAt) {
        if (truncateAt != null) {
            this.f113881c = truncateAt;
            return;
        }
        throw new NullPointerException("Null displayTextTruncation");
    }
}
