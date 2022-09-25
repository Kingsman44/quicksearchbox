package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.d */
/* compiled from: PG */
public final class C96884d extends C96899s {

    /* renamed from: a */
    public C42876ab f270865a;

    /* renamed from: b */
    public C60930r f270866b;

    /* renamed from: a */
    public final C96900t mo90368a() {
        C60930r rVar;
        C42876ab abVar = this.f270865a;
        if (abVar != null && (rVar = this.f270866b) != null) {
            return new C96885e(abVar, rVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f270865a == null) {
            sb.append(" autoBubbleData");
        }
        if (this.f270866b == null) {
            sb.append(" syncCallback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
