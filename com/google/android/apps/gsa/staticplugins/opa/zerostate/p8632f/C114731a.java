package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.f.a */
/* compiled from: PG */
public final class C114731a extends C0658ft {

    /* renamed from: a */
    private final C114742l f318386a;

    /* renamed from: b */
    private final C28293k f318387b;

    /* renamed from: c */
    private final C86124t f318388c;

    /* renamed from: d */
    private boolean f318389d = true;

    /* renamed from: e */
    private final int f318390e;

    public C114731a(C28293k kVar, int i, C86124t tVar, C114742l lVar) {
        this.f318386a = lVar;
        this.f318387b = kVar;
        this.f318388c = tVar;
        this.f318390e = i;
    }

    /* renamed from: a */
    private final void m190183a(int i) {
        if (i >= Math.abs((int) this.f318388c.mo79743a(C90014bt.f247838oy))) {
            this.f318386a.mo101571f(this.f318387b, 22);
            this.f318389d = false;
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.f318389d) {
            int i3 = this.f318390e - 1;
            if (i3 == 0) {
                m190183a(i);
            } else if (i3 != 2) {
                m190183a(i2);
            } else if (i2 >= ((int) this.f318388c.mo79743a(C90014bt.f247838oy))) {
                C28292j jVar = new C28292j(53093);
                jVar.mo33795i(22);
                C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
                C114742l lVar = this.f318386a;
                lVar.mo101570e(e, this.f318387b);
                lVar.mo101571f(e, 22);
                this.f318389d = false;
            }
        }
    }
}
