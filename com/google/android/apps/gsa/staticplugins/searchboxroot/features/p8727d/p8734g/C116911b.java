package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8734g;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88552c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.common.p4537i.C59291p;
import com.google.common.p4537i.C59294s;
import java.nio.charset.Charset;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.g.b */
/* compiled from: PG */
public final class C116911b implements C88552c, C89200e {

    /* renamed from: a */
    private final C86124t f324601a;

    /* renamed from: b */
    private C88543c f324602b;

    public C116911b(C86124t tVar) {
        this.f324601a = tVar;
    }

    /* renamed from: c */
    public final int mo82214c(C88616t tVar) {
        if (TextUtils.isEmpty(tVar.f239556a.mo84352bk()) || !this.f324601a.mo79746e(C90085ej.f250162am)) {
            return 1;
        }
        String c = this.f324602b.mo82184c();
        if (TextUtils.isEmpty(c)) {
            return 1;
        }
        C59291p e = C59294s.m92134d().mo56748e();
        e.mo56757i(c, Charset.forName("UTF-8"));
        tVar.f239562g.mo55429h("hsid", e.mo56758p().toString());
        return 1;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324602b = ((C88614r) obj).f239530a;
    }
}
