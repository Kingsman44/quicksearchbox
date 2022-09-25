package com.google.android.apps.gsa.staticplugins.chime.p7661f;

import android.net.TrafficStats;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.libraries.notifications.C29986f;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2294i.p2295a.C30018a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f.a */
/* compiled from: PG */
public final class C97700a {

    /* renamed from: a */
    public final C29823n f272810a;

    /* renamed from: b */
    public final C86124t f272811b;

    /* renamed from: c */
    private final C86054o f272812c;

    /* renamed from: d */
    private final C30018a f272813d;

    public C97700a(C29823n nVar, C30018a aVar, C86054o oVar, C97710b bVar, C86124t tVar) {
        this.f272810a = nVar;
        this.f272813d = aVar;
        this.f272812c = oVar;
        oVar.mo79675i(bVar);
        this.f272811b = tVar;
    }

    /* renamed from: d */
    public static boolean m161946d(C29820k kVar) {
        C29986f b = kVar.mo35002b();
        return b == C29986f.REGISTERED || b == C29986f.FAILED_REGISTRATION || b == C29986f.PENDING_REGISTRATION;
    }

    /* renamed from: e */
    private final void m161947e(String str) {
        TrafficStats.setThreadStatsTag(61);
        this.f272813d.mo35343b(str);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final void mo90793a(boolean z) {
        if (this.f272811b.mo79746e(C90081ef.f249857z)) {
            mo90795c(z);
        } else {
            mo90794b();
        }
    }

    /* renamed from: b */
    public final void mo90794b() {
        for (String e : this.f272812c.mo79685s()) {
            m161947e(e);
        }
    }

    /* renamed from: c */
    public final void mo90795c(boolean z) {
        String F = this.f272812c.mo79659F();
        if (F != null) {
            if (z) {
                for (C29820k kVar : this.f272810a.mo35089c()) {
                    if (m161946d(kVar) && !kVar.mo35009h().equals(F)) {
                        this.f272813d.mo35342a(kVar.mo35009h());
                    }
                }
            }
            m161947e(F);
        }
    }
}
