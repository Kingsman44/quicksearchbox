package com.google.android.libraries.onegoogle.accountmenu.cards;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.k */
/* compiled from: PG */
public final class C30443k extends C30400ca {

    /* renamed from: a */
    public C30418cs f82245a;

    /* renamed from: b */
    public C30394bv f82246b;

    /* renamed from: c */
    public C58833ax f82247c = C58836b.f156633a;

    /* renamed from: d */
    private C30397by f82248d;

    /* renamed from: a */
    public final C30401cb mo35971a() {
        C30394bv bvVar;
        C30397by byVar;
        C30418cs csVar = this.f82245a;
        if (csVar != null && (bvVar = this.f82246b) != null && (byVar = this.f82248d) != null) {
            return new C30444l(csVar, bvVar, this.f82247c, byVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f82245a == null) {
            sb.append(" cardIcon");
        }
        if (this.f82246b == null) {
            sb.append(" titleData");
        }
        if (this.f82248d == null) {
            sb.append(" visualElementsInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35972b(C30397by byVar) {
        if (byVar != null) {
            this.f82248d = byVar;
            return;
        }
        throw new NullPointerException("Null visualElementsInfo");
    }
}
