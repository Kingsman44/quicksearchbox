package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.p7238g.C91733c;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91734d;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7718hj;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.av */
/* compiled from: PG */
public final class C91317av extends C91953ad {

    /* renamed from: a */
    private final C91307al f254856a;

    /* renamed from: b */
    private final Collection f254857b;

    /* renamed from: c */
    private final boolean f254858c;

    public C91317av(C91307al alVar, Collection collection, boolean z) {
        this.f254856a = alVar;
        this.f254857b = collection;
        this.f254858c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo85609b(C7718hj hjVar) {
        for (C7718hj g : this.f254857b) {
            if (C91978bb.m150941g(hjVar, g)) {
                if (this.f256451g) {
                    if (this.f254858c) {
                        this.f254856a.mo85602c(hjVar, C58485gu.m89845m());
                    } else {
                        C91307al alVar = this.f254856a;
                        C58485gu m = C58485gu.m89845m();
                        synchronized (alVar.f254819a) {
                            C91733c cVar = (C91733c) C91734d.f255848e.createBuilder();
                            cVar.copyOnWrite();
                            C91734d dVar = (C91734d) cVar.instance;
                            dVar.f255850a |= 2;
                            dVar.f255853d = false;
                            cVar.copyOnWrite();
                            C91734d dVar2 = (C91734d) cVar.instance;
                            hjVar.getClass();
                            dVar2.f255851b = hjVar;
                            dVar2.f255850a |= 1;
                            cVar.mo86232a(m);
                            alVar.mo85600a().mo86230a((C91734d) cVar.build());
                            alVar.f254822d = true;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
