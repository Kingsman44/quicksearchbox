package com.facebook.litho;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.bf */
/* compiled from: PG */
public final class C6125bf extends C6264fg implements C6236ej {

    /* renamed from: d */
    private final AtomicInteger f18116d = new AtomicInteger(0);

    /* renamed from: e */
    private final int f18117e;

    public C6125bf(int i) {
        super(i);
        this.f18117e = i;
    }

    /* renamed from: a */
    public final Object mo13030a(Context context, C6091ab abVar) {
        Object a;
        synchronized (this) {
            a = this.f18505b.mo5126a();
            this.f18506c = Math.max(0, this.f18506c - 1);
        }
        if (a != null) {
            return a;
        }
        this.f18116d.incrementAndGet();
        return abVar.mo12797P(context);
    }
}
