package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.search.core.google.p6790a.C85805ax;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;

/* renamed from: com.google.android.apps.gsa.search.core.google.be */
/* compiled from: PG */
public final class C85882be implements C85983e {

    /* renamed from: a */
    private final C86124t f232208a;

    /* renamed from: b */
    private final C85805ax f232209b;

    public C85882be(C86124t tVar, C85805ax axVar) {
        this.f232208a = tVar;
        this.f232209b = axVar;
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        boolean z = this.f232209b.mo79449a(query) == C51313db.SEARCH;
        if (this.f232208a.mo79746e(C90014bt.f247384gD)) {
            if (!query.mo84421dB()) {
                if (z) {
                    z = true;
                } else {
                    return;
                }
            }
            cVar.mo79638d("lh", true != z ? "0" : "1");
        }
    }
}
