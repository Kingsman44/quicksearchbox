package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.n */
/* compiled from: PG */
public final class C101624n implements C101610b {

    /* renamed from: a */
    private final C74555u f283575a;

    /* renamed from: b */
    private final C86124t f283576b;

    /* renamed from: c */
    private final bm f283577c;

    public C101624n(C74555u uVar, C86124t tVar, bm bmVar) {
        this.f283575a = uVar;
        this.f283576b = tVar;
        this.f283577c = bmVar;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo92420a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo92421b() {
        af afVar = af.a;
        int ordinal = this.f283575a.mo70887e().mo70854b().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    return false;
                }
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new AssertionError();
                    } else if (this.f283575a.mo70887e().mo70853a().mo70881e()) {
                        return false;
                    }
                }
            }
            if (this.f283575a.mo70886d().mo70847a().d() == 2) {
                return true;
            }
        }
        return this.f283577c.s() && this.f283576b.mo79746e(C90082eg.f249882Y);
    }
}
