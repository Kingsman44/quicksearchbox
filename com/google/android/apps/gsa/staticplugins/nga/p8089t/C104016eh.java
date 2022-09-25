package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.api.C74719bw;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.eh */
/* compiled from: PG */
public final /* synthetic */ class C104016eh implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289427a;

    /* renamed from: b */
    public final /* synthetic */ boolean f289428b;

    public /* synthetic */ C104016eh(C104026er erVar, boolean z) {
        this.f289427a = erVar;
        this.f289428b = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104026er erVar = this.f289427a;
        boolean z = this.f289428b;
        C118826c cVar = (C118826c) obj;
        erVar.f289463q.mo93873h();
        if (erVar.mo93923g()) {
            ((C74719bw) erVar.f289455i.mo27525b()).mo71088c();
            ((C103967cm) erVar.f289459m.mo27525b()).mo93913f(5);
            ((C103964cj) erVar.f289460n.mo27525b()).mo93904e();
            return C118826c.f331423b;
        }
        if (z) {
            ((C103967cm) erVar.f289459m.mo27525b()).mo93913f(6);
            ((C103964cj) erVar.f289460n.mo27525b()).mo93906g(6);
        } else {
            ((C103967cm) erVar.f289459m.mo27525b()).mo93913f(2);
            ((C103964cj) erVar.f289460n.mo27525b()).mo93906g(6);
        }
        return C60856cj.m92899h(new Exception("Not all data is present after download"));
    }
}
