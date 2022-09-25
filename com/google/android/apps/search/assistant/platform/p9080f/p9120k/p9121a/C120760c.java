package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.c */
/* compiled from: PG */
public final class C120760c {
    /* renamed from: a */
    public static final void m199936a(C37252a aVar, Throwable th) {
        if (th == null) {
            aVar.mo40781e(C62722b.OK);
        } else if (th instanceof CancellationException) {
            aVar.mo40781e(C62722b.CANCELLED);
        } else {
            C34834b bVar = C34830d.m63595b(th).f92362c;
            if (bVar == null) {
                bVar = C34834b.f92401c;
            }
            C34819a b = C34819a.m63579b(bVar);
            aVar.mo40780d(b.mo39520a(), b.mo39522e());
        }
    }
}
