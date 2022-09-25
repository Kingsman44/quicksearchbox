package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.s3.producers.q */
/* compiled from: PG */
final class C84318q extends C90888av {

    /* renamed from: a */
    final C84326y f229464a;

    /* renamed from: b */
    final C60870cx f229465b;

    /* renamed from: c */
    final List f229466c;

    public C84318q(C84326y yVar, C60870cx cxVar, List list) {
        super("RemoveWhenDone", 1, 0);
        this.f229464a = yVar;
        this.f229465b = cxVar;
        this.f229466c = list;
    }

    public final void run() {
        this.f229466c.remove(this.f229465b);
        if (this.f229466c.isEmpty()) {
            this.f229464a.mo77847hk();
        }
    }
}
