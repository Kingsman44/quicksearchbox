package com.google.android.apps.gsa.nga.engine.p5964av.p5967c;

import com.google.android.apps.gsa.nga.engine.p5964av.C75054b;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.h */
/* compiled from: PG */
public final /* synthetic */ class C75147h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ i f209558a;

    /* renamed from: b */
    public final /* synthetic */ C75054b f209559b;

    public /* synthetic */ C75147h(i iVar, C75054b bVar) {
        this.f209558a = iVar;
        this.f209559b = bVar;
    }

    public final void run() {
        i iVar = this.f209558a;
        C75054b bVar = this.f209559b;
        C58485gu guVar = (C58485gu) iVar.c.mo27525b();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            i.d((C75157e) guVar.get(i), bVar);
        }
        for (C75155d d : (Set) iVar.a.mo27525b()) {
            i.d(d, bVar);
        }
        for (C75155d d2 : iVar.b) {
            i.d(d2, bVar);
        }
    }
}
