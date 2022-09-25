package com.google.android.libraries.notifications.data.impl;

import com.google.android.libraries.notifications.data.C29795i;
import com.google.android.libraries.notifications.data.C29819j;
import com.google.android.libraries.notifications.data.C29828s;
import com.google.android.libraries.notifications.data.C29829t;
import com.google.android.libraries.notifications.data.impl.room.C29814b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.notifications.data.impl.i */
/* compiled from: PG */
public final /* synthetic */ class C29804i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C29805j f80817a;

    /* renamed from: b */
    public final /* synthetic */ C29828s f80818b;

    public /* synthetic */ C29804i(C29805j jVar, C29828s sVar) {
        this.f80817a = jVar;
        this.f80818b = sVar;
    }

    public final Object call() {
        C29805j jVar = this.f80817a;
        C29795i iVar = new C29795i(this.f80818b);
        iVar.mo35078d(jVar.f80820b.mo26870b());
        C29828s a = iVar.mo35075a();
        C29819j jVar2 = (C29819j) a;
        C29828s a2 = jVar.f80819a.mo35115z().mo35116a(jVar2.f80836b);
        if (a2 == null) {
            jVar.f80819a.mo35115z().mo35120e(a);
            return C29829t.INSERTED;
        } else if (a2.mo35122b() >= jVar2.f80837c) {
            return C29829t.REJECTED_SAME_VERSION;
        } else {
            C29814b z = jVar.f80819a.mo35115z();
            long a3 = a2.mo35121a();
            C29795i iVar2 = new C29795i(a);
            iVar2.mo35076b(a3);
            z.mo35119d(iVar2.mo35075a());
            return C29829t.REPLACED;
        }
    }
}
