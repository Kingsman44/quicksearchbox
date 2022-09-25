package com.google.android.apps.search.transcription.p10670f;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;

/* renamed from: com.google.android.apps.search.transcription.f.e */
/* compiled from: PG */
final class C141863e extends C141768a {

    /* renamed from: a */
    private C39226b f384961a;

    /* renamed from: b */
    private int f384962b;

    /* renamed from: c */
    private byte f384963c;

    /* renamed from: a */
    public final C141808b mo116714a() {
        C39226b bVar;
        if (this.f384963c == 1 && (bVar = this.f384961a) != null) {
            return new C141866f(bVar, this.f384962b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f384961a == null) {
            sb.append(" attributionId");
        }
        if (this.f384963c == 0) {
            sb.append(" callingUidToBlame");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo116715b(C39226b bVar) {
        if (bVar != null) {
            this.f384961a = bVar;
            return;
        }
        throw new NullPointerException("Null attributionId");
    }

    /* renamed from: c */
    public final void mo116716c(int i) {
        this.f384962b = i;
        this.f384963c = 1;
    }
}
