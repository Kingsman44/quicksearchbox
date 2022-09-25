package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.p4522b.C58495hd;
import com.google.p4272br.C56449r;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.q */
/* compiled from: PG */
final class C79319q extends C79208br {

    /* renamed from: a */
    public C56449r f217820a;

    /* renamed from: b */
    public C58495hd f217821b;

    /* renamed from: a */
    public final C79212bv mo73830a() {
        C58495hd hdVar;
        C56449r rVar = this.f217820a;
        if (rVar != null && (hdVar = this.f217821b) != null) {
            return new C79320r(rVar, hdVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f217820a == null) {
            sb.append(" pattern");
        }
        if (this.f217821b == null) {
            sb.append(" groupNameToTokenMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
