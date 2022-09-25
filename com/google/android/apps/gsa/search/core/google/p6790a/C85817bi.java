package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.bi */
/* compiled from: PG */
public final class C85817bi {

    /* renamed from: a */
    private final C21370a f232049a;

    /* renamed from: b */
    private final C68214a f232050b;

    /* renamed from: c */
    private final C86124t f232051c;

    /* renamed from: d */
    private C85814bf f232052d = null;

    public C85817bi(C68214a aVar, C21370a aVar2, C86124t tVar) {
        this.f232049a = aVar2;
        this.f232050b = aVar;
        this.f232051c = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C51331dt mo79463a(Query query, boolean z) {
        C51331dt dtVar;
        C85814bf bfVar;
        boolean isDeviceLocked = ((C84516aa) this.f232050b.mo27525b()).f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        if (!isDeviceLocked) {
            this.f232052d = null;
            return C51331dt.FULLY_TRUSTED;
        }
        boolean z2 = true;
        boolean z3 = this.f232051c.mo79746e(C90014bt.f247391gK) && z;
        if (!query.mo84466dt()) {
            dtVar = C51331dt.FULLY_TRUSTED;
        } else if (query.mo84456dj() || z3) {
            dtVar = C51331dt.TRUSTED;
        } else {
            dtVar = C51331dt.UNTRUSTED;
        }
        if (this.f232051c.mo79746e(C90014bt.f247553jN)) {
            if (this.f232052d == null || this.f232049a.mo26871c() - ((C85830o) this.f232052d).f232078b.longValue() >= 10000) {
                z2 = false;
            }
            if (z2 && (bfVar = this.f232052d) != null) {
                C51331dt dtVar2 = ((C85830o) bfVar).f232077a;
                C51331dt dtVar3 = C51331dt.FULLY_TRUSTED;
                if (dtVar == dtVar3 || dtVar2 == dtVar3 || dtVar == (dtVar3 = C51331dt.TRUSTED) || dtVar2 == dtVar3) {
                    dtVar = dtVar3;
                }
            }
            if (!z2 && !query.mo84456dj()) {
                this.f232052d = null;
            } else if (dtVar != null) {
                this.f232052d = new C85830o(dtVar, Long.valueOf(this.f232049a.mo26871c()));
            } else {
                throw new NullPointerException("Null triggerTrustLevel");
            }
            return dtVar;
        }
        this.f232052d = null;
        return dtVar;
    }
}
