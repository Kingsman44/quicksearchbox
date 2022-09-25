package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bw */
/* compiled from: PG */
public final class C111885bw {

    /* renamed from: a */
    public final long f310889a;

    /* renamed from: b */
    public final long f310890b;

    /* renamed from: c */
    public final long f310891c;

    /* renamed from: d */
    public final boolean f310892d;

    /* renamed from: e */
    public final C86124t f310893e;

    /* renamed from: f */
    private final long f310894f;

    /* renamed from: g */
    private final long f310895g;

    public C111885bw(C86124t tVar) {
        this.f310890b = tVar.mo79743a(C90063do.f249617gs);
        long a = tVar.mo79743a(C90014bt.f247747mw);
        this.f310891c = a;
        boolean e = tVar.mo79746e(C90014bt.f247322ev);
        this.f310892d = e;
        if (e) {
            this.f310889a = tVar.mo79743a(C90014bt.f247748mx);
            this.f310894f = tVar.mo79743a(C90014bt.f247746mv);
        } else {
            this.f310889a = a;
            this.f310894f = a;
        }
        this.f310895g = tVar.mo79743a(C90014bt.f247699mA);
        this.f310893e = tVar;
    }

    /* renamed from: c */
    public static int m185717c(C113405ep epVar) {
        return epVar.mo100031n().isPresent() ? 2 : 1;
    }

    /* renamed from: a */
    public final long mo99273a(String str, int i) {
        if (i - 1 != 0) {
            return this.f310893e.mo79743a(C90063do.f249483eQ);
        }
        boolean isEmpty = TextUtils.isEmpty(C113190cu.m187215c(str));
        long j = this.f310895g;
        if (!this.f310892d) {
            return j;
        }
        return j + ((isEmpty ? this.f310889a : this.f310894f) - this.f310891c);
    }

    /* renamed from: b */
    public final long mo99274b(String str, int i) {
        if (i - 1 != 0) {
            return this.f310893e.mo79743a(C90063do.f249483eQ);
        }
        return TextUtils.isEmpty(C113190cu.m187215c(str)) ? this.f310889a : this.f310894f;
    }
}
