package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.p11022d.C147704b;
import com.google.android.libraries.p11016ak.p11022d.C147707e;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60916ec;

/* renamed from: com.google.android.libraries.ak.c.p */
/* compiled from: PG */
public final /* synthetic */ class C147692p implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C147692p f398589a = new C147692p();

    private /* synthetic */ C147692p() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        Throwable th = (Exception) obj;
        int i = C147693q.f398590a;
        if (th instanceof C60916ec) {
            th = th.getCause();
        }
        return (th instanceof C147707e) || (th instanceof C147704b);
    }
}
