package com.google.android.libraries.lens.view.infopanel.p2140b;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.x */
/* compiled from: PG */
public final class C27036x implements C21266bi {

    /* renamed from: a */
    private final C25070bo f73686a;

    /* renamed from: b */
    private final C25043ao f73687b;

    /* renamed from: c */
    private final boolean f73688c;

    public C27036x(C25070bo boVar, C25043ao aoVar, boolean z) {
        this.f73686a = boVar;
        this.f73687b = aoVar;
        this.f73688c = z;
    }

    /* renamed from: g */
    private final void m50169g(boolean z) {
        this.f73686a.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_RESULTS_PANEL_IMAGE_LOAD_SUCCESS_RATE, true != z ? 0 : 1);
        if (this.f73688c) {
            ((C19569f) this.f73687b.f68259k.mo6453a()).mo24824b(true != z ? C59203do.f157270a : 1.0d, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo26752a(int i) {
        m50169g(false);
    }

    /* renamed from: b */
    public final void mo26753b(int i) {
    }

    /* renamed from: c */
    public final void mo26754c(int i) {
    }

    /* renamed from: d */
    public final void mo26755d(int i) {
    }

    /* renamed from: e */
    public final void mo26756e(int i) {
        m50169g(true);
    }

    /* renamed from: f */
    public final void mo26757f(int i) {
    }
}
