package com.google.android.libraries.web.weblayer.p3448b.p3449a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.web.weblayer.b.a.b */
/* compiled from: PG */
public final class C44124b {

    /* renamed from: a */
    public final Executor f114844a;

    /* renamed from: b */
    public volatile int f114845b = 1;

    /* renamed from: c */
    private final C44315a f114846c;

    public C44124b(Executor executor, C44315a aVar) {
        this.f114844a = executor;
        this.f114846c = aVar;
    }

    /* renamed from: a */
    public final boolean mo47086a() {
        C19559g.m37304c();
        int i = 2;
        boolean z = false;
        if (this.f114845b != 1) {
            return this.f114845b == 2;
        }
        if (this.f114846c.mo47219j() && this.f114846c.mo47210a() >= 99) {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        this.f114845b = i;
        return z;
    }
}
