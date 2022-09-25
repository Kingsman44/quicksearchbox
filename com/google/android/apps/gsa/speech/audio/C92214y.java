package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.android.apps.gsa.speech.audio.y */
/* compiled from: PG */
public final class C92214y {

    /* renamed from: a */
    private a f257091a;

    /* renamed from: b */
    private Long f257092b;

    /* renamed from: c */
    private Long f257093c;

    /* renamed from: d */
    private final C21370a f257094d;

    public C92214y(C21370a aVar) {
        this.f257094d = aVar;
    }

    /* renamed from: a */
    public final synchronized a mo86890a() {
        if (this.f257093c == null) {
            return null;
        }
        long c = this.f257094d.mo26871c();
        Long l = this.f257093c;
        l.getClass();
        long longValue = l.longValue();
        C58976aa aaVar = C58975e.f156826a;
        if (c - longValue > 30000) {
            return null;
        }
        return this.f257091a;
    }

    /* renamed from: b */
    public final synchronized void mo86891b(long j, a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        this.f257092b = Long.valueOf(j);
        this.f257091a = aVar;
        this.f257093c = Long.valueOf(this.f257094d.mo26871c());
    }

    /* renamed from: c */
    public final synchronized void mo86892c(long j) {
        C58976aa aaVar = C58975e.f156826a;
        C58832aw.m90831a(Long.valueOf(j), this.f257092b);
    }

    @ProguardMustNotDelete
    public synchronized a getAudio(Long l) {
        boolean z = false;
        if (this.f257091a != null && C58832aw.m90831a(l, this.f257092b)) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            return null;
        }
        return this.f257091a;
    }
}
