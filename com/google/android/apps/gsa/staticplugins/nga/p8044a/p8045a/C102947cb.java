package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82349bx;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.aea;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cb */
/* compiled from: PG */
public final /* synthetic */ class C102947cb implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102962cq f287464a;

    /* renamed from: b */
    public final /* synthetic */ long f287465b;

    public /* synthetic */ C102947cb(C102962cq cqVar, long j) {
        this.f287464a = cqVar;
        this.f287465b = j;
    }

    public final void run() {
        C102962cq cqVar = this.f287464a;
        long j = this.f287465b;
        boolean equals = ((C102909ar) cqVar.f287513m.mo27525b()).mo93526f().equals(aea.DASHER_ACCOUNT_PRESENT);
        C83305i iVar = (C83305i) cqVar.f287512l.mo27525b();
        boolean c = ((C74714bo) cqVar.f287503c.mo27525b()).mo71081c();
        String b = ((C83305i) cqVar.f287512l.mo27525b()).mo75577b();
        if (b != null) {
            iVar.mo75579d(new C82349bx("NGA_FIRST_GET_STATE_LATENCY", Double.valueOf((double) j), c, equals, b));
            return;
        }
        throw new NullPointerException("Null deviceRamGb");
    }
}
