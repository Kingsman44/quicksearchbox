package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.libraries.search.p2904c.C37671hr;
import com.google.android.libraries.search.p2904c.C37672hs;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.c */
/* compiled from: PG */
public final class C81030c {

    /* renamed from: a */
    private final AtomicInteger f222094a = new AtomicInteger();

    /* renamed from: a */
    public final C37672hs mo74823a() {
        C37671hr hrVar = (C37671hr) C37672hs.f100056c.createBuilder();
        int andIncrement = this.f222094a.getAndIncrement();
        hrVar.copyOnWrite();
        C37672hs hsVar = (C37672hs) hrVar.instance;
        hsVar.f100058a |= 1;
        hsVar.f100059b = andIncrement;
        return (C37672hs) hrVar.build();
    }
}
