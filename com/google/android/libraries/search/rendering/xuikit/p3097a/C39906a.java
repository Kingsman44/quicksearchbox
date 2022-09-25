package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40028ai;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a */
/* compiled from: PG */
public final class C39906a extends C40075o {

    /* renamed from: a */
    public C40028ai f104922a;

    /* renamed from: b */
    private C40306b f104923b;

    /* renamed from: a */
    public final C40076p mo42067a() {
        C40306b bVar;
        C40028ai aiVar = this.f104922a;
        if (aiVar != null && (bVar = this.f104923b) != null) {
            return new C39992b(aiVar, bVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104922a == null) {
            sb.append(" viewsVisibilityTracker");
        }
        if (this.f104923b == null) {
            sb.append(" clientContext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo42068b(C40306b bVar) {
        if (bVar != null) {
            this.f104923b = bVar;
            return;
        }
        throw new NullPointerException("Null clientContext");
    }
}
