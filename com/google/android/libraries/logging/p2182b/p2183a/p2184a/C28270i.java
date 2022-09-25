package com.google.android.libraries.logging.p2182b.p2183a.p2184a;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.common.api.C143842n;
import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.logging.b.a.a.i */
/* compiled from: PG */
public final class C28270i extends C28266e {

    /* renamed from: a */
    C143658k f76939a;

    /* renamed from: b */
    C143658k f76940b;

    /* renamed from: c */
    private final Context f76941c;

    /* renamed from: d */
    private final Executor f76942d;

    public C28270i(Context context, Executor executor) {
        this.f76941c = context;
        this.f76942d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo33771a(C28265d dVar, C60870cx cxVar) {
        return C60846c.m92879h(C60922j.m93045h(cxVar, new C28269h(this, dVar.mo33760c(), new C28267f(dVar), dVar.mo33765g(), dVar.mo33758a()), this.f76942d), C143842n.class, C28268g.f76933a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final synchronized C143658k mo33772b(C28259b bVar) {
        int i = bVar.f76911b - 1;
        if (i == 0 || i == 1) {
            if (this.f76939a == null) {
                this.f76939a = C143658k.m233373b(this.f76941c, "NOOP_LOG_SOURCE_NAME").mo118952a();
            }
            return this.f76939a;
        } else if (i != 2) {
            return null;
        } else {
            if (this.f76940b == null) {
                this.f76940b = C143658k.m233374c(this.f76941c, "NOOP_LOG_SOURCE_NAME").mo118952a();
            }
            return this.f76940b;
        }
    }
}
