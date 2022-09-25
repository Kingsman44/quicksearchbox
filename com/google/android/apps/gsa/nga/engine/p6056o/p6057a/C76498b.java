package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79074e;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.b */
/* compiled from: PG */
public abstract class C76498b implements C76526t {

    /* renamed from: a */
    protected final C79851ai f211700a;

    /* renamed from: b */
    protected final C74757n f211701b;

    /* renamed from: c */
    protected final C74965n f211702c;

    public C76498b(C74757n nVar, C74965n nVar2, C79851ai aiVar) {
        this.f211701b = nVar;
        this.f211702c = nVar2;
        this.f211700a = aiVar;
    }

    /* renamed from: a */
    public C78983aj mo72214a() {
        C79074e eVar = new C79074e();
        eVar.mo73745b(this.f211701b);
        return eVar.mo73744a();
    }

    /* renamed from: b */
    public abstract C82838ch mo72215b();

    /* renamed from: c */
    public final C60870cx mo72219c() {
        if (!mo72220e()) {
            return C81442m.f222851a;
        }
        int a = C82919fh.m132428a(mo72215b().f225877b);
        if (a == 0) {
            a = 1;
        }
        C79850ah c = this.f211700a.mo74252c(a, this.f211702c.mo71336k());
        try {
            C60870cx d = mo72216d();
            c.mo74256c(d);
            if (c != null) {
                c.mo74255b();
            }
            return d;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C60870cx mo72216d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo72220e() {
        int b = this.f211701b.mo71152e().mo71143b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            return true;
        } else {
            if (i == 1) {
                return false;
            }
            throw new AssertionError();
        }
    }
}
