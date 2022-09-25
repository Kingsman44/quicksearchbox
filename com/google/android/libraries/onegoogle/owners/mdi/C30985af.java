package com.google.android.libraries.onegoogle.owners.mdi;

import com.google.android.libraries.onegoogle.accountmanagement.C30255b;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.owners.p2387b.C30962a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.af */
/* compiled from: PG */
final class C30985af implements C31012n {

    /* renamed from: a */
    public final C31012n f83470a;

    /* renamed from: b */
    final /* synthetic */ C30986ag f83471b;

    /* renamed from: c */
    private final C31012n f83472c;

    /* renamed from: d */
    private C58974d f83473d;

    public C30985af(C30986ag agVar, C31012n nVar, C31012n nVar2) {
        this.f83471b = agVar;
        this.f83472c = nVar;
        this.f83470a = nVar2;
    }

    /* renamed from: i */
    private final C60870cx m57843i(C58817ah ahVar) {
        C31011z zVar = new C31011z(this, ahVar);
        return C60846c.m92879h((C60870cx) ahVar.apply(this.f83472c), MdiNotAvailableException.class, C47810es.m84966f(zVar), C60826bg.f164896a);
    }

    /* renamed from: j */
    private final C60870cx m57844j(C31009x xVar, String str, int i) {
        C60870cx a = xVar.mo36674a(this.f83472c, str, i);
        C30982ac acVar = new C30982ac(this, xVar, str, i);
        return C60846c.m92879h(a, MdiNotAvailableException.class, C47810es.m84966f(acVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo36637a() {
        return m57843i(C30981ab.f83463a);
    }

    /* renamed from: b */
    public final C60870cx mo36638b(String str) {
        C60870cx a = ((C30962a) this.f83472c).f83429a.mo36666a(str);
        C31010y yVar = new C31010y(this, str);
        return C60846c.m92879h(a, MdiNotAvailableException.class, C47810es.m84966f(yVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo36639c() {
        return m57843i(C30980aa.f83462a);
    }

    /* renamed from: d */
    public final C60870cx mo36640d(String str, int i) {
        return m57844j(C30983ad.f83468a, str, i);
    }

    /* renamed from: e */
    public final C60870cx mo36641e(String str, int i) {
        return m57844j(C30984ae.f83469a, str, i);
    }

    /* renamed from: f */
    public final void mo36642f(C30255b bVar) {
        synchronized (this.f83471b.f83475b) {
            this.f83471b.f83475b.add(bVar);
            this.f83472c.mo36642f(bVar);
        }
    }

    /* renamed from: g */
    public final void mo36643g(C30255b bVar) {
        synchronized (this.f83471b.f83475b) {
            this.f83471b.f83475b.remove(bVar);
            this.f83472c.mo36643g(bVar);
        }
    }

    /* renamed from: h */
    public final void mo36675h(Exception exc) {
        synchronized (this.f83471b.f83475b) {
            if (this.f83473d == null) {
                this.f83473d = C58974d.m91134h("OneGoogle");
            }
            ((C58970a) ((C58970a) ((C58970a) this.f83473d.mo56225c()).mo56382g(exc)).mo56372aa(50334)).mo56386p("MDI Profile Sync not available on device. Reverting to backup implementation.");
            for (C30255b f : this.f83471b.f83475b) {
                this.f83470a.mo36642f(f);
            }
            C30986ag agVar = this.f83471b;
            agVar.f83474a = this.f83470a;
            for (C30255b g : agVar.f83475b) {
                this.f83472c.mo36643g(g);
            }
            this.f83471b.f83475b.clear();
        }
    }
}
