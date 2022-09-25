package com.google.android.libraries.search.assistant.performer.communication;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.i */
/* compiled from: PG */
final class C35763i extends C35667db {

    /* renamed from: a */
    public String f93692a;

    /* renamed from: b */
    public String f93693b;

    /* renamed from: c */
    public C58485gu f93694c;

    /* renamed from: d */
    private C58485gu f93695d;

    /* renamed from: a */
    public final C35668dc mo39785a() {
        String str;
        C58485gu guVar;
        C58485gu guVar2;
        String str2 = this.f93692a;
        if (str2 != null && (str = this.f93693b) != null && (guVar = this.f93694c) != null && (guVar2 = this.f93695d) != null) {
            return new C35764j(str2, str, guVar, guVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93692a == null) {
            sb.append(" mimeType");
        }
        if (this.f93693b == null) {
            sb.append(" text");
        }
        if (this.f93694c == null) {
            sb.append(" attachmentUris");
        }
        if (this.f93695d == null) {
            sb.append(" recipients");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo39786b(C58485gu guVar) {
        if (guVar != null) {
            this.f93694c = guVar;
            return;
        }
        throw new NullPointerException("Null attachmentUris");
    }

    /* renamed from: c */
    public final void mo39787c(String str) {
        if (str != null) {
            this.f93692a = str;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }

    /* renamed from: d */
    public final void mo39788d(C58485gu guVar) {
        if (guVar != null) {
            this.f93695d = guVar;
            return;
        }
        throw new NullPointerException("Null recipients");
    }

    /* renamed from: e */
    public final void mo39789e(String str) {
        if (str != null) {
            this.f93693b = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
