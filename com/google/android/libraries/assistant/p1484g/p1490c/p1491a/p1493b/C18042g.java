package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.g */
/* compiled from: PG */
public final class C18042g extends C17981aq {

    /* renamed from: a */
    public String f51494a;

    /* renamed from: b */
    public Optional f51495b = Optional.empty();

    /* renamed from: c */
    private Optional f51496c = Optional.empty();

    /* renamed from: d */
    private String f51497d;

    /* renamed from: e */
    private boolean f51498e;

    /* renamed from: f */
    private byte f51499f;

    /* renamed from: b */
    public final C17982ar mo23506a() {
        String str;
        String str2;
        if (this.f51499f == 1 && (str = this.f51497d) != null && (str2 = this.f51494a) != null) {
            return new C18043h(this.f51496c, str, this.f51498e, str2, this.f51495b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51497d == null) {
            sb.append(" name");
        }
        if (this.f51499f == 0) {
            sb.append(" showErrorOnFailure");
        }
        if (this.f51494a == null) {
            sb.append(" intent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo23545c(String str) {
        this.f51496c = Optional.m71637of(str);
    }

    /* renamed from: d */
    public final void mo23516d(String str) {
        if (str != null) {
            this.f51494a = str;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    /* renamed from: e */
    public final void mo23517e(String str) {
        if (str != null) {
            this.f51497d = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: f */
    public final void mo23518f(String str) {
        this.f51495b = Optional.m71637of(str);
    }

    /* renamed from: g */
    public final void mo23519g(boolean z) {
        this.f51498e = z;
        this.f51499f = 1;
    }
}
