package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.p2248h.C29495ae;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.view.q.be */
/* compiled from: PG */
public final class C27611be implements C29495ae {

    /* renamed from: a */
    private final C42876ab f75444a;

    /* renamed from: b */
    private final C26243ad f75445b;

    /* renamed from: c */
    private final C60888db f75446c;

    public C27611be(C42876ab abVar, C60888db dbVar, C26243ad adVar) {
        this.f75444a = abVar;
        this.f75446c = dbVar;
        this.f75445b = adVar;
    }

    /* renamed from: a */
    public final C60870cx mo19281a(C28728bf bfVar) {
        if (!this.f75445b.mo31464k(C26242ac.MDD_ENABLED)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C60870cx d = this.f75444a.mo46042d();
        C27610bd bdVar = new C27610bd(bfVar);
        return C60922j.m93044g(d, C47810es.m84963c(bdVar), this.f75446c);
    }
}
