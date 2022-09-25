package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C85653bd;
import com.google.android.apps.gsa.search.core.C85660bk;
import com.google.android.apps.gsa.search.core.C85661bl;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85663bn;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.p4552o.C60516su;
import com.google.common.p4552o.C60519sx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.k */
/* compiled from: PG */
public final class C117223k implements C117226n {

    /* renamed from: a */
    private final C85651bb f325407a;

    /* renamed from: b */
    private final C85664bo f325408b;

    /* renamed from: c */
    private final C85653bd f325409c;

    /* renamed from: d */
    private final C86054o f325410d;

    /* renamed from: e */
    private final C85661bl f325411e;

    public C117223k(C85664bo boVar, C85651bb bbVar, C85653bd bdVar, C86054o oVar) {
        this.f325407a = bbVar;
        this.f325408b = boVar;
        this.f325409c = bdVar;
        this.f325410d = oVar;
        this.f325411e = boVar.mo79190b(new C85662bm[]{C85662bm.NOW_CARDS});
    }

    /* renamed from: a */
    public final List mo103197a() {
        ArrayList arrayList = new ArrayList();
        if (this.f325409c.mo79170h(this.f325410d.mo79659F())) {
            arrayList.add(C60516su.WITH_DATA_SAVER);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo103198b() {
        ArrayList arrayList = new ArrayList();
        C85663bn a = this.f325411e.mo79175a(C85662bm.NOW_CARDS);
        if (a.f231552a == C85660bk.INELIGIBLE_GEO) {
            arrayList.add(C60519sx.GEO_NOT_SUPPORTED);
        }
        if (a.f231552a == C85660bk.INELIGIBLE_UNICORN) {
            arrayList.add(C60519sx.IS_UNICORN_ACCOUNT);
        }
        if (a.f231552a == C85660bk.INELIGIBLE_DASHER) {
            arrayList.add(C60519sx.DISABLED_BY_ADMINISTRATOR);
        }
        if (this.f325410d.mo79668a() == null) {
            arrayList.add(C60519sx.NO_USER_SIGNED_IN);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo103199c() {
        if (!this.f325411e.mo79175a(C85662bm.NOW_CARDS).mo79184b()) {
            return false;
        }
        if (!this.f325408b.mo79197l(C85662bm.NOW_CARDS) || !this.f325407a.mo79140M()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo103200d() {
        return this.f325411e.mo79175a(C85662bm.NOW_CARDS).mo79184b() && this.f325408b.mo79197l(C85662bm.NOW_CARDS) && this.f325407a.mo79140M();
    }

    /* renamed from: e */
    public final boolean mo103201e() {
        return !this.f325411e.mo79175a(C85662bm.NOW_CARDS).mo79184b();
    }
}
