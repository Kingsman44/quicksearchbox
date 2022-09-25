package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.p5900ag.C74831y;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83008q;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83009r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bx */
/* compiled from: PG */
public final /* synthetic */ class C77052bx implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C83008q f212667a;

    public /* synthetic */ C77052bx(C83008q qVar) {
        this.f212667a = qVar;
    }

    public final void accept(Object obj) {
        C83008q qVar = this.f212667a;
        C74831y yVar = (C74831y) obj;
        long a = yVar.mo71222a();
        qVar.copyOnWrite();
        C83009r rVar = (C83009r) qVar.instance;
        C83009r rVar2 = C83009r.f226516e;
        rVar.f226518a |= 2;
        rVar.f226520c = a;
        String g = yVar.mo71228g();
        qVar.copyOnWrite();
        C83009r rVar3 = (C83009r) qVar.instance;
        g.getClass();
        rVar3.f226518a |= 4;
        rVar3.f226521d = g;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
