package com.google.android.libraries.onegoogle.accountmenu.features;

import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30438f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.t */
/* compiled from: PG */
public abstract class C30637t extends C30636s {
    /* renamed from: a */
    public abstract C58833ax mo36339a();

    /* renamed from: b */
    public final C58833ax mo36153b() {
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C58833ax mo36146c() {
        if (!mo36339a().mo56113h()) {
            return C58836b.f156633a;
        }
        C30628k d = C30629l.m57238d();
        C58836b bVar = C58836b.f156633a;
        C58833ax k = C58833ax.m90834k((C133301h) mo36339a().mo56107c());
        C58838bb.m90869d(k.mo56113h(), "Either storage or backup & sync card retriever has to be set.");
        ((C30544e) d).f82514b = C58833ax.m90834k(new C30438f(k, bVar));
        d.mo36205b(true);
        return C58833ax.m90834k(d.mo36204a());
    }

    /* renamed from: d */
    public final C58833ax mo36147d() {
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public final C58485gu mo36148e() {
        return C58485gu.m89845m();
    }
}
