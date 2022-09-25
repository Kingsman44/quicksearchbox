package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.a */
/* compiled from: PG */
final class C81872a extends C81887ao {

    /* renamed from: a */
    private C80710cl f223887a;

    /* renamed from: b */
    private boolean f223888b;

    /* renamed from: c */
    private byte f223889c;

    /* renamed from: a */
    public final C81888ap mo75380a() {
        if (this.f223889c == 1 && this.f223887a != null) {
            return new C81891b(this.f223887a, this.f223888b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f223887a == null) {
            sb.append(" edgeLights");
        }
        if (this.f223889c == 0) {
            sb.append(" userSpeaking");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75381b(C80710cl clVar) {
        if (clVar != null) {
            this.f223887a = clVar;
            return;
        }
        throw new NullPointerException("Null edgeLights");
    }

    /* renamed from: c */
    public final void mo75382c(boolean z) {
        this.f223888b = z;
        this.f223889c = 1;
    }
}
