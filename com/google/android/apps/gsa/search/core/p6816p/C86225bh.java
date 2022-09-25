package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90456c;

/* renamed from: com.google.android.apps.gsa.search.core.p.bh */
/* compiled from: PG */
public final class C86225bh extends RuntimeException implements C90456c {
    public C86225bh(long j) {
        super("Received rendered cards kill switch with retry delay " + j + " ms");
    }

    /* renamed from: a */
    public final int mo79843a() {
        return C89885b.GWS_RENDERED_CARDS_KILL_SWITCH_VALUE;
    }

    /* renamed from: b */
    public final int mo79844b() {
        return 211;
    }

    /* renamed from: c */
    public final Exception mo79845c() {
        return this;
    }

    /* renamed from: d */
    public final boolean mo79846d() {
        return false;
    }
}
