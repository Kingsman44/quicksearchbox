package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119109a;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119110b;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119111c;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119112d;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119114f;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119115g;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.h.a.a.a.a.n */
/* compiled from: PG */
public final class C119089n {
    /* renamed from: a */
    public static C119111c m197745a(Throwable th) {
        if (th instanceof C70761fa) {
            C70761fa faVar = (C70761fa) th;
            Status.Code code = Status.Code.OK;
            int ordinal = faVar.f188571a.getCode().ordinal();
            if (ordinal == 1) {
                return new C119114f(faVar);
            }
            if (ordinal == 3) {
                return new C119109a(faVar);
            }
            if (ordinal == 4) {
                return new C119110b(faVar);
            }
            if (ordinal == 13) {
                return new C119115g(faVar);
            }
            if (ordinal != 14) {
                return new C119111c(faVar.getMessage(), faVar);
            }
            return new C119112d(faVar);
        } else if (th instanceof C119111c) {
            return (C119111c) th;
        } else {
            return new C119111c(th.getMessage(), th);
        }
    }
}
