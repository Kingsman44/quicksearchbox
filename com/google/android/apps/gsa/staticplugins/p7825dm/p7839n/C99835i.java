package com.google.android.apps.gsa.staticplugins.p7825dm.p7839n;

import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85285e;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.n.i */
/* compiled from: PG */
public final /* synthetic */ class C99835i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f279297a;

    public /* synthetic */ C99835i(String str) {
        this.f279297a = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = this.f279297a;
        C89057m mVar = (C89057m) obj;
        String a = mVar.mo82999g().mo83000a("Content-Type", (String) null);
        if (!C58837ba.m90859h(a)) {
            byte[] f = mVar.mo83036f();
            if (f == null) {
                throw new NullPointerException("Null data");
            } else if (a != null) {
                return new C99827a(str, f, a);
            } else {
                throw new NullPointerException("Null contentType");
            }
        } else {
            throw new C85285e();
        }
    }
}
