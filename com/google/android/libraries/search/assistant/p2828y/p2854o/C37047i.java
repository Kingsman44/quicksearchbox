package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.p1963i.p1964a.C23820c;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.search.assistant.y.o.i */
/* compiled from: PG */
final class C37047i {

    /* renamed from: a */
    private final Geller f96519a;

    /* renamed from: b */
    private final String f96520b;

    public C37047i(Geller geller, String str) {
        this.f96519a = geller;
        this.f96520b = str;
    }

    /* renamed from: a */
    public final C65033ar mo40589a(String str) {
        try {
            return (C65033ar) C23820c.m44350a(this.f96519a.mo27182i(this.f96520b, C65753ak.PKG, str, C65031ap.f176100j, C63662ac.f172144a));
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return C65033ar.f176111c;
        }
    }

    /* renamed from: b */
    public final C65033ar mo40590b(long j) {
        try {
            return (C65033ar) C23820c.m44350a(this.f96519a.mo27207r(this.f96520b, C65753ak.PKG, j, j, C63662ac.f172144a));
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return C65033ar.f176111c;
        }
    }
}
