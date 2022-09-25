package com.google.android.libraries.p11016ak.p11017a;

import com.google.android.libraries.p11016ak.p11022d.C147703a;
import com.google.android.libraries.p11016ak.p11022d.C147704b;
import com.google.android.libraries.p11016ak.p11022d.C147705c;
import com.google.android.libraries.p11016ak.p11022d.C147706d;
import com.google.android.libraries.p11016ak.p11022d.C147707e;
import com.google.android.libraries.p11016ak.p11022d.C147708f;
import com.google.android.libraries.p11016ak.p11022d.C147709g;
import com.google.android.libraries.p11016ak.p11022d.C147710h;
import com.google.android.libraries.p11016ak.p11022d.C147711i;
import com.google.android.libraries.p11016ak.p11022d.C147712j;
import com.google.android.libraries.p11016ak.p11022d.C147713k;
import com.google.android.libraries.p11016ak.p11022d.C147714l;
import com.google.android.libraries.p11016ak.p11022d.C147715m;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.ak.a.f */
/* compiled from: PG */
public final class C147617f {
    /* renamed from: a */
    public static C147705c m240686a(Throwable th) {
        if (th instanceof C70761fa) {
            C70761fa faVar = (C70761fa) th;
            Status.Code code = Status.Code.OK;
            switch (faVar.f188571a.getCode().ordinal()) {
                case 1:
                    return new C147711i(faVar);
                case 2:
                    return new C147715m(faVar);
                case 3:
                    return new C147703a((Throwable) faVar);
                case 4:
                    return new C147704b(faVar);
                case 7:
                    return new C147709g(faVar);
                case 8:
                    return new C147712j(faVar);
                case 9:
                    return new C147706d(faVar);
                case 10:
                    return new C147710h(faVar);
                case 11:
                    return new C147708f(faVar);
                case 13:
                    return new C147713k(faVar);
                case 14:
                    return new C147707e(faVar);
                case 16:
                    return new C147714l(faVar);
                default:
                    return new C147705c(faVar.getMessage(), faVar);
            }
        } else if (th instanceof C147705c) {
            return (C147705c) th;
        } else {
            return new C147705c(th.getMessage(), th);
        }
    }
}
