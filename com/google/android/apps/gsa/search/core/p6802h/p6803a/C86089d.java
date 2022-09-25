package com.google.android.apps.gsa.search.core.p6802h.p6803a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90008bn;
import com.google.android.gms.clearcut.C143627d;
import com.google.android.libraries.gcoreclient.p1761g.p1762a.C21525a;
import com.google.android.libraries.gcoreclient.p1809y.p1810a.C21742c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58820ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.search.core.h.a.d */
/* compiled from: PG */
public final class C86089d implements C86091a {

    /* renamed from: a */
    public final C86338r f232688a;

    /* renamed from: b */
    private final C86124t f232689b;

    /* renamed from: c */
    private final C22871g f232690c;

    /* renamed from: d */
    private final C21525a f232691d;

    public C86089d(C86338r rVar, C86124t tVar, Context context, C22871g gVar) {
        this.f232688a = rVar;
        this.f232689b = tVar;
        this.f232691d = new C21525a(new C143627d(context));
        this.f232690c = gVar;
    }

    /* renamed from: a */
    public final C58833ax mo79719a() {
        int i = this.f232688a.getInt("boot_count", 0);
        if (i == 0) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo79720b() {
        C21742c cVar = new C21742c(this.f232691d.f59929a.mo118951a(), C58820ak.f156611a);
        cVar.mo27082c(new C86087b(this));
        cVar.mo27080a(new C86088c(this));
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        int a = (int) this.f232689b.mo79743a(C90008bn.f246887a);
        if (a > 0) {
            this.f232690c.mo28213m("fetch GMSCore boot count", (long) a, new C86086a(this));
            return;
        }
        mo79720b();
    }
}
