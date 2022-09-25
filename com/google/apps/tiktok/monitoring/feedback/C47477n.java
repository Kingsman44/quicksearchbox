package com.google.apps.tiktok.monitoring.feedback;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.n */
/* compiled from: PG */
public final class C47477n {

    /* renamed from: a */
    private final C47463aa f123280a;

    /* renamed from: b */
    private final C58833ax f123281b;

    /* renamed from: c */
    private final C69464a f123282c;

    public C47477n(C47463aa aaVar, C58833ax axVar, C69464a aVar) {
        this.f123280a = aaVar;
        if (!axVar.mo56113h() || ((AccountId) axVar.mo56107c()).mo50068a() != -1) {
            this.f123281b = axVar;
        } else {
            this.f123281b = C58836b.f156633a;
        }
        this.f123282c = aVar;
    }

    /* renamed from: a */
    public final void mo51336a(C47475l lVar) {
        ((C47476m) this.f123282c.mo17428b()).mo51335a(this.f123281b, lVar, this.f123280a);
    }
}
