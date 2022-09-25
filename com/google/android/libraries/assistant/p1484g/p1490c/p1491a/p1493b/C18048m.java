package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.m */
/* compiled from: PG */
public final class C18048m extends C18014bw {

    /* renamed from: a */
    public String f51515a;

    /* renamed from: b */
    public Optional f51516b = Optional.empty();

    /* renamed from: c */
    private String f51517c;

    /* renamed from: d */
    private boolean f51518d;

    /* renamed from: e */
    private byte f51519e;

    /* renamed from: b */
    public final C18015bx mo23506a() {
        String str;
        String str2;
        if (this.f51519e == 1 && (str = this.f51517c) != null && (str2 = this.f51515a) != null) {
            return new C18049n(str, this.f51518d, str2, this.f51516b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51517c == null) {
            sb.append(" name");
        }
        if (this.f51519e == 0) {
            sb.append(" showErrorOnFailure");
        }
        if (this.f51515a == null) {
            sb.append(" intent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final void mo23536c(String str) {
        if (str != null) {
            this.f51515a = str;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    /* renamed from: d */
    public final void mo23537d(String str) {
        if (str != null) {
            this.f51517c = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: e */
    public final void mo23538e(String str) {
        this.f51516b = Optional.m71637of(str);
    }

    /* renamed from: f */
    public final void mo23539f(boolean z) {
        this.f51518d = z;
        this.f51519e = 1;
    }
}
