package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b;

import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.assistant.p3861at.C49959fi;
import com.google.assistant.p3861at.C49982ge;
import com.google.assistant.p3861at.C49986gi;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45593d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.e */
/* compiled from: PG */
public final class C101888e {

    /* renamed from: a */
    private final C74555u f284196a;

    /* renamed from: b */
    private final C101860a f284197b;

    /* renamed from: c */
    private final C86124t f284198c;

    /* renamed from: d */
    private final C101610b f284199d;

    public C101888e(C74555u uVar, C101860a aVar, C86124t tVar, C101610b bVar) {
        this.f284196a = uVar;
        this.f284197b = aVar;
        this.f284198c = tVar;
        this.f284199d = bVar;
    }

    /* renamed from: a */
    public final C49982ge mo92667a() {
        C49959fi fiVar = this.f284197b.mo92637b().f128887N;
        if (fiVar == null) {
            fiVar = C49959fi.f129877f;
        }
        C49986gi giVar = fiVar.f129883e;
        if (giVar == null) {
            giVar = C49986gi.f129937b;
        }
        C49982ge geVar = giVar.f129939a;
        return geVar == null ? C49982ge.f129927g : geVar;
    }

    /* renamed from: b */
    public final C45593d mo92668b() {
        if (!mo92669c()) {
            return C45593d.V2;
        }
        C45593d a = C45593d.m81281a(mo92667a().f129932d);
        return a == null ? C45593d.VOICE_MATCH_CONSENT_VERSION_UNSPECIFIED : a;
    }

    /* renamed from: c */
    public final boolean mo92669c() {
        s sVar = s.a;
        int ordinal = this.f284196a.mo70884b().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.f284199d.mo92421b() && this.f284198c.mo79746e(C90082eg.f249889aE);
            }
            if (ordinal != 2) {
                return false;
            }
            return this.f284198c.mo79746e(C90082eg.f249889aE);
        } else if (this.f284196a.mo70887e().mo70857f()) {
            return this.f284198c.mo79746e(C90082eg.f249885aA);
        } else {
            return this.f284199d.mo92421b() && this.f284198c.mo79746e(C90082eg.f249889aE);
        }
    }
}
