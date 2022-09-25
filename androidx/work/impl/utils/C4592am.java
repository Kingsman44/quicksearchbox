package androidx.work.impl.utils;

import androidx.work.C4380ad;
import androidx.work.C4392ap;
import androidx.work.impl.p207b.C4509r;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.utils.am */
/* compiled from: PG */
public final class C4592am {

    /* renamed from: a */
    public static final String f14478a = C4380ad.m12561i("WorkTimer");

    /* renamed from: b */
    public final C4392ap f14479b;

    /* renamed from: c */
    public final Map f14480c = new HashMap();

    /* renamed from: d */
    public final Map f14481d = new HashMap();

    /* renamed from: e */
    public final Object f14482e = new Object();

    public C4592am(C4392ap apVar) {
        this.f14479b = apVar;
    }

    /* renamed from: a */
    public final void mo9547a(C4509r rVar) {
        synchronized (this.f14482e) {
            if (((C4591al) this.f14480c.remove(rVar)) != null) {
                C4380ad h = C4380ad.m12560h();
                String str = f14478a;
                h.mo9309a(str, "Stopping timer for " + rVar);
                this.f14481d.remove(rVar);
            }
        }
    }
}
