package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6584be.C84824a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cu */
/* compiled from: PG */
public final class C116637cu extends C116780ib {

    /* renamed from: a */
    public final C84824a f323487a;

    /* renamed from: b */
    public long f323488b = 0;

    /* renamed from: c */
    public long f323489c = -1;

    /* renamed from: d */
    public int f323490d = -1;

    /* renamed from: e */
    public boolean f323491e;

    /* renamed from: f */
    public boolean f323492f;

    /* renamed from: g */
    private boolean f323493g;

    public C116637cu(C68214a aVar, C84824a aVar2) {
        super(aVar, 196);
        this.f323487a = aVar2;
    }

    /* renamed from: e */
    public static boolean m193558e(int i, C116625ci ciVar, C116740gp gpVar) {
        boolean z = false;
        if (i == 4 && gpVar.mo102913j() && !ciVar.mo102805i()) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* renamed from: g */
    public final boolean mo102817g(boolean z) {
        if (this.f323492f == z) {
            return false;
        }
        this.f323492f = z;
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("LogoHeaderState");
        fVar.mo85279c("visible").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323491e)));
        fVar.mo85279c("isDots").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323493g)));
        fVar.mo85279c("shouldFadeOut").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323492f)));
    }

    /* renamed from: i */
    public final boolean mo102818i(boolean z) {
        if (this.f323493g == z) {
            return false;
        }
        this.f323493g = z;
        return true;
    }

    /* renamed from: j */
    public final boolean mo102819j(boolean z) {
        if (this.f323491e == z) {
            return false;
        }
        this.f323491e = z;
        return true;
    }
}
