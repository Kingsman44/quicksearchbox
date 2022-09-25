package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12180f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a */
/* compiled from: PG */
public final class C12693a extends C12860d {

    /* renamed from: a */
    private C12093d f39753a;

    /* renamed from: b */
    private C12180f f39754b;

    /* renamed from: c */
    private C12991i f39755c;

    /* renamed from: d */
    private Optional f39756d = Optional.empty();

    /* renamed from: a */
    public final C12861e mo20729a() {
        C12180f fVar;
        C12991i iVar;
        C12093d dVar = this.f39753a;
        if (dVar != null && (fVar = this.f39754b) != null && (iVar = this.f39755c) != null) {
            return new C12716b(dVar, fVar, iVar, this.f39756d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39753a == null) {
            sb.append(" audioClient");
        }
        if (this.f39754b == null) {
            sb.append(" conversationDeltaResponse");
        }
        if (this.f39755c == null) {
            sb.append(" assistantRequestConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20730b(C12991i iVar) {
        if (iVar != null) {
            this.f39755c = iVar;
            return;
        }
        throw new NullPointerException("Null assistantRequestConfig");
    }

    /* renamed from: c */
    public final void mo20731c(C12093d dVar) {
        if (dVar != null) {
            this.f39753a = dVar;
            return;
        }
        throw new NullPointerException("Null audioClient");
    }

    /* renamed from: d */
    public final void mo20732d(C12180f fVar) {
        if (fVar != null) {
            this.f39754b = fVar;
            return;
        }
        throw new NullPointerException("Null conversationDeltaResponse");
    }

    /* renamed from: e */
    public final void mo20733e(Optional optional) {
        if (optional != null) {
            this.f39756d = optional;
            return;
        }
        throw new NullPointerException("Null unifiedAssistantRequestConfig");
    }
}
