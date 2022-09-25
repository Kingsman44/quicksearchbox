package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63126b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.c.f.a.r */
/* compiled from: PG */
public final class C17293r {
    /* renamed from: a */
    public static final Throwable m34513a(Throwable th, C63126b bVar) {
        if (th instanceof CancellationException) {
            return th;
        }
        C34834b bVar2 = C34830d.m63595b(th).f92362c;
        if (bVar2 == null) {
            bVar2 = C34834b.f92401c;
        }
        return C34830d.m63596c(C34819a.m63579b(bVar2)) ? new C17279d(bVar, th) : th;
    }
}
