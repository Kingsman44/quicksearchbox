package com.google.android.libraries.storage.p3304a.p3306b;

import com.google.android.libraries.storage.p3304a.p3307c.C42767t;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.common.p4522b.C58557jl;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.b.a */
/* compiled from: PG */
public final class C42737a {

    /* renamed from: a */
    private OutputStream f111996a;

    /* renamed from: b */
    private C42767t f111997b;

    /* renamed from: a */
    public final void mo45838a(List list) {
        OutputStream outputStream = (OutputStream) C58557jl.m90131l(list);
        if (outputStream instanceof C42767t) {
            this.f111997b = (C42767t) outputStream;
            this.f111996a = (OutputStream) list.get(0);
        }
    }

    /* renamed from: b */
    public final void mo45839b() {
        if (this.f111997b != null) {
            this.f111996a.flush();
            this.f111997b.mo45847a();
            return;
        }
        throw new C42768u("Cannot sync underlying stream");
    }
}
