package com.google.android.apps.p453b.p457b.p460b.p463c;

import com.google.common.base.C58838bb;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.net.p4726a.p4728b.C62723a;
import com.google.net.p4726a.p4728b.C62724b;

/* renamed from: com.google.android.apps.b.b.b.c.b */
/* compiled from: PG */
public class C9014b extends Exception {

    /* renamed from: a */
    public final transient C62724b f31142a;

    public C9014b(C62722b bVar, Throwable th) {
        super(th);
        C58838bb.m90868c(bVar != C62722b.OK);
        C62723a aVar = (C62723a) C62724b.f169416g.createBuilder();
        int i = bVar.f169415s;
        aVar.copyOnWrite();
        C62724b bVar2 = (C62724b) aVar.instance;
        bVar2.f169418a |= 8;
        bVar2.f169422e = i;
        String th2 = th.toString();
        aVar.copyOnWrite();
        C62724b bVar3 = (C62724b) aVar.instance;
        th2.getClass();
        bVar3.f169418a |= 4;
        bVar3.f169421d = th2;
        this.f31142a = (C62724b) aVar.build();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9014b(C62724b bVar) {
        super((bVar.f169418a & 4) != 0 ? bVar.f169421d : null);
        this.f31142a = bVar;
    }
}
