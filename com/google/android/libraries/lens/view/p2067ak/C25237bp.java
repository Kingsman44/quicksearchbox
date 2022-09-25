package com.google.android.libraries.lens.view.p2067ak;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.bp */
/* compiled from: PG */
public final /* synthetic */ class C25237bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25241bt f68689a;

    public /* synthetic */ C25237bp(C25241bt btVar) {
        this.f68689a = btVar;
    }

    public final Object apply(Object obj) {
        C25241bt btVar = this.f68689a;
        MessageLite messageLite = (MessageLite) obj;
        synchronized (btVar) {
            btVar.f68695d = messageLite;
            if (!btVar.f68694c.isEmpty()) {
                C58485gu j = C58485gu.m89842j(btVar.f68694c);
                btVar.f68694c.clear();
                btVar.mo30363c(new C25235bn(j));
            }
        }
        return null;
    }
}
