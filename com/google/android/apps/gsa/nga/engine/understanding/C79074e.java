package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e */
/* compiled from: PG */
public final class C79074e extends C78982ai {

    /* renamed from: a */
    public Optional f217428a = Optional.empty();

    /* renamed from: b */
    private C74757n f217429b;

    /* renamed from: a */
    public final C78983aj mo73744a() {
        C74757n nVar = this.f217429b;
        if (nVar != null) {
            return new C79113f(nVar, this.f217428a);
        }
        throw new IllegalStateException("Missing required properties: query");
    }

    /* renamed from: b */
    public final void mo73745b(C74757n nVar) {
        if (nVar != null) {
            this.f217429b = nVar;
            return;
        }
        throw new NullPointerException("Null query");
    }
}
