package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95662k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.x */
/* compiled from: PG */
final class C95825x extends C95288a {

    /* renamed from: a */
    public volatile boolean f268301a;

    /* renamed from: b */
    boolean f268302b;

    /* renamed from: c */
    final /* synthetic */ C95826y f268303c;

    /* renamed from: d */
    private final List f268304d;

    /* renamed from: e */
    private final int f268305e;

    /* renamed from: f */
    private volatile boolean f268306f;

    public C95825x(C95826y yVar, boolean z, List list, int i) {
        this.f268303c = yVar;
        this.f268302b = z;
        this.f268304d = list;
        this.f268305e = i;
    }

    /* renamed from: a */
    public final void mo89205a() {
        C59071e eVar = C95826y.f268307a;
        C58976aa aaVar = C58975e.f156826a;
        this.f268302b = false;
    }

    /* renamed from: b */
    public final void mo89206b() {
        C59071e eVar = C95826y.f268307a;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268302b) {
            this.f268303c.f268328n.mo90144e();
        }
        if (this.f268301a && !this.f268306f) {
            this.f268303c.f268329o.mo89667b(this.f268304d, C142359ck.PERFORM_VOICE_INPUT, this.f268305e);
        }
    }

    /* renamed from: c */
    public final void mo89207c() {
        C59071e eVar = C95826y.f268307a;
        C58976aa aaVar = C58975e.f156826a;
        this.f268306f = true;
        if (this.f268301a) {
            C95294af a = this.f268303c.f268319e.mo89222a();
            C95826y yVar = this.f268303c;
            C95825x xVar = new C95825x(yVar, this.f268302b, this.f268304d, this.f268305e);
            C95662k kVar = yVar.f268331q;
            if (kVar == null) {
                C89655j.m145957a("No button handler");
                this.f268303c.f268329o.mo89667b(this.f268304d, (C142359ck) null, this.f268305e);
            } else if (kVar.mo89630b(a, xVar)) {
                this.f268303c.f268329o.mo89667b(this.f268304d, C142359ck.EXPAND_ANNOUNCEMENT, this.f268305e);
            } else {
                C95826y yVar2 = this.f268303c;
                yVar2.f268331q.mo89631c(a, xVar, yVar2.mo89792c());
                this.f268303c.f268329o.mo89667b(this.f268304d, C142359ck.FETCH_ANNOUNCEMENTS, this.f268305e);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo89208d() {
        C59071e eVar = C95826y.f268307a;
        C58976aa aaVar = C58975e.f156826a;
        return this.f268301a;
    }
}
