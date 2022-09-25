package com.google.android.libraries.elements.p1714d.p1719e;

import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a.C20935b;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1722b.C20967d;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.d.e.l */
/* compiled from: PG */
public final /* synthetic */ class C21050l {
    /* renamed from: a */
    public static Optional m39554a(Optional optional, C69464a aVar, C20967d dVar, Optional optional2) {
        if (((Boolean) optional.orElse(false)).booleanValue()) {
            return Optional.m71637of(new C20935b(aVar, dVar, (ExecutorRegistry) optional2.orElse(null)));
        }
        return Optional.empty();
    }
}
