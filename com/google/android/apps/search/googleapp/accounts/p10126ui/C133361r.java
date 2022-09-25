package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133234q;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.incognito.p10322c.C136242b;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30333c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30484y;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.r */
/* compiled from: PG */
public final class C133361r implements C46852f {

    /* renamed from: b */
    private static final C59071e f363381b = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.r");

    /* renamed from: a */
    public final C136242b f363382a;

    /* renamed from: c */
    private final Fragment f363383c;

    /* renamed from: d */
    private final boolean f363384d;

    /* renamed from: e */
    private final C30465f f363385e;

    /* renamed from: f */
    private final boolean f363386f;

    /* renamed from: g */
    private final C30465f f363387g;

    /* renamed from: h */
    private final boolean f363388h;

    /* renamed from: i */
    private final C30484y f363389i;

    /* renamed from: j */
    private final AtomicBoolean f363390j;

    /* renamed from: k */
    private final C30484y f363391k;

    /* renamed from: l */
    private final AtomicReference f363392l;

    /* renamed from: m */
    private final AtomicBoolean f363393m;

    /* renamed from: n */
    private final C30305n f363394n;

    /* renamed from: o */
    private final C133255c f363395o;

    public C133361r(Fragment fragment, boolean z, C30484y yVar, AtomicBoolean atomicBoolean, C30484y yVar2, AtomicReference atomicReference, C30465f fVar, AtomicBoolean atomicBoolean2, boolean z2, C30465f fVar2, boolean z3, C30305n nVar, C136242b bVar, C133255c cVar) {
        this.f363383c = fragment;
        this.f363390j = atomicBoolean;
        this.f363391k = yVar2;
        this.f363384d = z;
        this.f363385e = fVar;
        this.f363386f = z2;
        this.f363387g = fVar2;
        this.f363388h = z3;
        this.f363389i = yVar;
        this.f363392l = atomicReference;
        this.f363393m = atomicBoolean2;
        this.f363394n = nVar;
        this.f363382a = bVar;
        this.f363395o = cVar;
    }

    /* renamed from: c */
    private final boolean m216435c() {
        C0167am activity = this.f363383c.getActivity();
        return activity != null && activity.getIntent().hasExtra("AGSA_CLASSIC_INTENT_EXTRA");
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f363381b.mo56225c()).mo56382g(th)).mo56372aa(40011)).mo56386p("Error while subscribing to account menu data service");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C133234q qVar = (C133234q) obj;
        boolean z = true;
        boolean z2 = qVar.mo111031c() && !m216435c();
        this.f363392l.set(qVar.mo111029a());
        this.f363390j.set(qVar.mo111035g());
        C30484y yVar = this.f363391k;
        yVar.f82337c = qVar.mo111036h();
        yVar.mo36105d();
        this.f363385e.mo36077c(!z2 && this.f363384d && qVar.mo111030b());
        this.f363393m.set(z2);
        this.f363387g.mo36077c(this.f363386f && qVar.mo111037i());
        C30484y yVar2 = this.f363389i;
        if (!this.f363388h && !qVar.mo111034f()) {
            z = false;
        }
        yVar2.f82337c = z;
        yVar2.mo36105d();
        if (z2) {
            ((C30313v) this.f363394n.mo35866q().mo56107c()).f81975a.add(new C133360q(this, qVar));
        }
        boolean c = m216435c();
        C0167am activity = this.f363383c.getActivity();
        if (activity != null && C136126g.m221194h(activity.getIntent())) {
            C0167am activity2 = this.f363383c.getActivity();
            if (activity2 != null) {
                Intent intent = activity2.getIntent();
                C136126g.m221195i(intent);
                activity2.setIntent(intent);
            }
        } else if (!c) {
            return;
        }
        this.f363395o.mo111051b();
        C30333c.m56496b(this.f363383c, this.f363394n).mo35898a().mo35896b();
    }
}
