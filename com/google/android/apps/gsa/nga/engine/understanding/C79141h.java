package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.ax.c.g;
import com.google.android.apps.gsa.nga.engine.ax.c.s;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77388am;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.h */
/* compiled from: PG */
public final class C79141h extends C78993at {

    /* renamed from: a */
    public s f217546a;

    /* renamed from: b */
    public C78977ad f217547b;

    /* renamed from: c */
    public C77388am f217548c;

    /* renamed from: d */
    public C77402o f217549d;

    /* renamed from: e */
    public C79004ba f217550e;

    /* renamed from: f */
    public g f217551f;

    /* renamed from: a */
    public final C78994au mo73752a() {
        C78977ad adVar;
        C77388am amVar;
        C77402o oVar;
        C79004ba baVar;
        g gVar;
        s sVar = this.f217546a;
        if (sVar != null && (adVar = this.f217547b) != null && (amVar = this.f217548c) != null && (oVar = this.f217549d) != null && (baVar = this.f217550e) != null && (gVar = this.f217551f) != null) {
            return new C79151i(sVar, adVar, amVar, oVar, baVar, gVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f217546a == null) {
            sb.append(" understandingResults");
        }
        if (this.f217547b == null) {
            sb.append(" priorityRunner");
        }
        if (this.f217548c == null) {
            sb.append(" scorer");
        }
        if (this.f217549d == null) {
            sb.append(" featureExtractor");
        }
        if (this.f217550e == null) {
            sb.append(" understandingStreamzEventsBuilder");
        }
        if (this.f217551f == null) {
            sb.append(" hypothesesSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
