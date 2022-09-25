package com.google.android.libraries.mdi.download.p2243e;

import android.content.Context;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.e.j */
/* compiled from: PG */
public final class C29360j {

    /* renamed from: a */
    public Context f79584a;

    /* renamed from: b */
    public C58881cr f79585b;

    /* renamed from: c */
    public C58833ax f79586c;

    /* renamed from: d */
    public C58833ax f79587d;

    /* renamed from: e */
    private Executor f79588e;

    public C29360j() {
        C58836b bVar = C58836b.f156633a;
        this.f79586c = bVar;
        this.f79587d = bVar;
    }

    /* renamed from: a */
    public final C29361k mo34696a() {
        return new C29348ab(this.f79584a, this.f79587d, this.f79588e, this.f79586c, this.f79585b);
    }

    /* renamed from: b */
    public final void mo34697b(Executor executor) {
        executor.getClass();
        this.f79588e = new C60904dr(executor);
    }
}
