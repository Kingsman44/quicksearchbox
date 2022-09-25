package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a;

import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101771k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.d */
/* compiled from: PG */
public final class C101580d implements C101771k {

    /* renamed from: b */
    private static final C59071e f283451b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.d");

    /* renamed from: a */
    public final C101771k f283452a;

    public C101580d(C101609t tVar, C74555u uVar) {
        C101608s sVar;
        z b = uVar.mo70885c().mo70898b();
        ((C59052c) ((C59052c) f283451b.mo56224b()).mo56372aa(20266)).mo56389s("homeFlowType = %s", b);
        z zVar = z.a;
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            C101605p i = C101606q.m168035i();
            i.mo92362h(true);
            i.mo92363i(true);
            i.mo92359e(true);
            i.mo92360f(true);
            i.mo92358d(true);
            i.mo92361g(true);
            sVar = tVar.mo92424a(i.mo92355a());
        } else if (ordinal == 1) {
            C101605p i2 = C101606q.m168035i();
            i2.mo92360f(true);
            sVar = tVar.mo92424a(i2.mo92355a());
        } else if (ordinal == 2) {
            C101605p i3 = C101606q.m168035i();
            i3.mo92362h(true);
            i3.mo92363i(true);
            i3.mo92356b(true);
            sVar = tVar.mo92424a(i3.mo92355a());
        } else if (ordinal == 3) {
            C101605p i4 = C101606q.m168035i();
            i4.mo92362h(true);
            i4.mo92363i(true);
            i4.mo92356b(true);
            i4.mo92359e(true);
            i4.mo92360f(true);
            sVar = tVar.mo92424a(i4.mo92355a());
        } else if (ordinal == 4) {
            C101605p i5 = C101606q.m168035i();
            i5.mo92357c(true);
            i5.mo92361g(true);
            i5.mo92362h(true);
            i5.mo92359e(true);
            i5.mo92360f(true);
            i5.mo92358d(true);
            i5.mo92363i(true);
            sVar = tVar.mo92424a(i5.mo92355a());
        } else {
            throw new AssertionError();
        }
        this.f283452a = sVar;
    }
}
