package com.google.android.libraries.lens.view.filters;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.main.C27383ds;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2113h.p2132j.C26892g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.lens.view.filters.ap */
/* compiled from: PG */
public final class C25909ap {

    /* renamed from: a */
    public final AccountId f70382a;

    /* renamed from: b */
    public final C26892g f70383b;

    /* renamed from: c */
    public final C25989d f70384c;

    /* renamed from: d */
    public final C25901ah f70385d;

    /* renamed from: e */
    public final C26586ff f70386e;

    /* renamed from: f */
    public final C25941f f70387f;

    /* renamed from: g */
    public final C28443m f70388g;

    /* renamed from: h */
    public final C25225bd f70389h;

    /* renamed from: i */
    public final C60888db f70390i;

    /* renamed from: j */
    public final C28306ab f70391j;

    /* renamed from: k */
    public final C28310af f70392k;

    /* renamed from: l */
    public final boolean f70393l;

    /* renamed from: m */
    public C25928bg f70394m;

    /* renamed from: n */
    public LvfButtonsView f70395n;

    /* renamed from: o */
    public C26505cj f70396o;

    /* renamed from: p */
    public C25752a f70397p;

    /* renamed from: q */
    public C25752a f70398q;

    /* renamed from: r */
    public boolean f70399r;

    /* renamed from: s */
    public C27383ds f70400s;

    /* renamed from: t */
    final C25908ao f70401t = new C25908ao(this);

    /* renamed from: u */
    private final C27481an f70402u;

    /* renamed from: v */
    private final C24974a f70403v;

    public C25909ap(AccountId accountId, C26892g gVar, C25989d dVar, C25901ah ahVar, C26586ff ffVar, C25941f fVar, C28443m mVar, C25225bd bdVar, C60888db dbVar, C28306ab abVar, C28310af afVar, boolean z, C27481an anVar, C24974a aVar) {
        this.f70382a = accountId;
        this.f70383b = gVar;
        this.f70384c = dVar;
        this.f70385d = ahVar;
        this.f70386e = ffVar;
        this.f70387f = fVar;
        this.f70388g = mVar;
        this.f70389h = bdVar;
        this.f70390i = dbVar;
        this.f70391j = abVar;
        this.f70392k = afVar;
        this.f70393l = z;
        this.f70402u = anVar;
        this.f70403v = aVar;
    }

    /* renamed from: a */
    public final float mo31066a() {
        if (this.f70399r && !mo31070e()) {
            return 0.0f;
        }
        C25752a aVar = this.f70397p;
        aVar.getClass();
        return ((Boolean) aVar.mo3842a()).booleanValue() ? 0.0f : 1.0f;
    }

    /* renamed from: b */
    public final void mo31067b() {
        float a = mo31066a();
        LvfButtonsView lvfButtonsView = this.f70395n;
        lvfButtonsView.getClass();
        lvfButtonsView.setAlpha(a);
        LvfButtonsView lvfButtonsView2 = this.f70395n;
        lvfButtonsView2.getClass();
        int i = 4;
        lvfButtonsView2.setVisibility(a == 0.0f ? 4 : 0);
        View findViewById = this.f70385d.requireView().findViewById(R.id.shutter_button_view);
        findViewById.getClass();
        if (!this.f70399r || !mo31070e()) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo31068c() {
        LvfButtonsView lvfButtonsView = this.f70395n;
        lvfButtonsView.getClass();
        int i = 1;
        if (true == this.f70399r) {
            i = 4;
        }
        lvfButtonsView.setImportantForAccessibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r1.f70397p;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31069d() {
        /*
            r1 = this;
            com.google.android.libraries.lens.view.d.a r0 = r1.f70398q
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.mo3842a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0022
            com.google.android.libraries.lens.view.d.a r0 = r1.f70397p
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.mo3842a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0022
            r0 = 1
            return r0
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.filters.C25909ap.mo31069d():boolean");
    }

    /* renamed from: e */
    public final boolean mo31070e() {
        return this.f70402u.mo33017b() && !(this.f70385d.getResources().getConfiguration().orientation == 2 && !C24974a.m46225a(this.f70403v.f68122a));
    }
}
