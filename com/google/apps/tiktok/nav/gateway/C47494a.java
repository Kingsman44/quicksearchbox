package com.google.apps.tiktok.nav.gateway;

import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.apps.tiktok.nav.gateway.a */
/* compiled from: PG */
public final class C47494a extends C47502h {

    /* renamed from: a */
    public List f123318a;

    /* renamed from: b */
    public C58485gu f123319b;

    /* renamed from: c */
    private List f123320c;

    /* renamed from: a */
    public final C47503i mo51351a() {
        List list;
        List list2 = this.f123320c;
        if (list2 != null && (list = this.f123318a) != null) {
            return new C47495b(list2, list, this.f123319b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f123320c == null) {
            sb.append(" initialSelectors");
        }
        if (this.f123318a == null) {
            sb.append(" accountUiCallbacks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo51352b(List list) {
        if (list != null) {
            this.f123320c = list;
            return;
        }
        throw new NullPointerException("Null initialSelectors");
    }
}
