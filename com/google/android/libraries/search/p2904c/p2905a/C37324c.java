package com.google.android.libraries.search.p2904c.p2905a;

import android.content.AttributionSource;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.search.c.a.c */
/* compiled from: PG */
public final class C37324c {

    /* renamed from: a */
    private final AtomicInteger f99163a = new AtomicInteger();

    /* renamed from: b */
    private C37323b f99164b;

    /* renamed from: c */
    private AttributionSource f99165c;

    /* renamed from: a */
    public final synchronized C37323b mo40880a(AttributionSource attributionSource) {
        C37323b bVar;
        C37322a aVar = (C37322a) C37323b.f99159c.createBuilder();
        int incrementAndGet = this.f99163a.incrementAndGet();
        aVar.copyOnWrite();
        C37323b bVar2 = (C37323b) aVar.instance;
        bVar2.f99161a |= 1;
        bVar2.f99162b = incrementAndGet;
        bVar = (C37323b) aVar.build();
        this.f99164b = bVar;
        this.f99165c = attributionSource;
        return bVar;
    }

    /* renamed from: b */
    public final synchronized C58833ax mo40881b(C37323b bVar) {
        if (bVar.equals(this.f99164b)) {
            this.f99164b = null;
            AttributionSource attributionSource = this.f99165c;
            this.f99165c = null;
            return C58833ax.m90833j(attributionSource);
        }
        return C58836b.f156633a;
    }
}
