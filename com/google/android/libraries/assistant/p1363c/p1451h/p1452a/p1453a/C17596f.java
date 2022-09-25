package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import com.google.common.p4522b.C58485gu;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.f */
/* compiled from: PG */
public final class C17596f implements C70862aj {

    /* renamed from: a */
    final Iterable f50704a;

    /* renamed from: b */
    final /* synthetic */ Iterable f50705b;

    public C17596f(Iterable iterable) {
        this.f50705b = iterable;
        this.f50704a = C58485gu.m89841i(iterable);
    }

    /* renamed from: a */
    public final void mo20121a() {
        try {
            for (C70862aj a : this.f50704a) {
                a.mo20121a();
            }
        } catch (Throwable th) {
            mo20122b(th);
            throw new C70761fa(Status.m102100d(th), (C70334de) null, true);
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        Throwable th2 = null;
        for (C70862aj b : this.f50704a) {
            try {
                b.mo20122b(th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                }
            }
        }
        if (th2 != null) {
            throw new C70761fa(Status.m102100d(th2), (C70334de) null, true);
        }
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        try {
            for (C70862aj c : this.f50704a) {
                c.mo20123c(obj);
            }
        } catch (Throwable th) {
            mo20122b(th);
            throw new C70761fa(Status.m102100d(th), (C70334de) null, true);
        }
    }
}
