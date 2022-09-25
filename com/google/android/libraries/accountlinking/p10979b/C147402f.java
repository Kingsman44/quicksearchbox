package com.google.android.libraries.accountlinking.p10979b;

import com.google.android.libraries.accountlinking.p10981d.C147423c;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.accountlinking.b.f */
/* compiled from: PG */
public final /* synthetic */ class C147402f implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C147402f f397918a = new C147402f();

    private /* synthetic */ C147402f() {
    }

    public final C60870cx apply(Object obj) {
        Throwable th = (Throwable) obj;
        Status b = C147423c.m240343b(th);
        if (b != null && (b.getCode() == Status.Code.NOT_FOUND || b.getCode() == Status.Code.ABORTED)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        throw C147423c.m240342a(th);
    }
}
