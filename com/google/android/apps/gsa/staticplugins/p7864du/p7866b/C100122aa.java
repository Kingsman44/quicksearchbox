package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.Cursor;
import com.google.android.apps.gsa.store.C118310ah;
import com.google.common.p4522b.C58758qx;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.aa */
/* compiled from: PG */
public final class C100122aa {

    /* renamed from: a */
    public final Cursor f279951a;

    /* renamed from: b */
    private final Set f279952b = C58758qx.m90653k();

    public C100122aa(Cursor cursor) {
        this.f279951a = cursor;
    }

    /* renamed from: a */
    public final void mo91750a(C118310ah ahVar) {
        this.f279952b.add(ahVar);
    }

    /* renamed from: b */
    public final void mo91751b() {
        if (!this.f279951a.isClosed()) {
            this.f279951a.close();
            for (C118310ah a : this.f279952b) {
                a.mo91775a();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo91752c() {
        return this.f279951a.isClosed();
    }
}
