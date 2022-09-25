package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.w */
/* compiled from: PG */
public final /* synthetic */ class C76071w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76043ar f210958a;

    public /* synthetic */ C76071w(C76043ar arVar) {
        this.f210958a = arVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C76043ar arVar = this.f210958a;
        C118826c cVar = (C118826c) obj;
        synchronized (arVar.f210901b) {
            if (!arVar.f210918s) {
                if (arVar.mo72023e().equals((C76090f) arVar.f210915p.get())) {
                    cxVar = C118826c.f331423b;
                } else {
                    arVar.f210918s = true;
                    arVar.f210919t = Optional.m71637of(new SettableFuture());
                    arVar.mo72029k();
                }
            }
            cxVar = (C60870cx) arVar.f210919t.get();
        }
        return cxVar;
    }
}
