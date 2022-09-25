package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.os.Trace;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ap */
/* compiled from: PG */
public class C90797ap implements C90858r {

    /* renamed from: a */
    private final C90858r f253912a;

    /* renamed from: b */
    private final C90476a f253913b;

    public C90797ap(C90858r rVar, C90476a aVar) {
        this.f253912a = rVar;
        this.f253913b = aVar;
    }

    /* renamed from: a */
    public final void mo85115a(C58881cr crVar, Runnable runnable) {
        this.f253912a.mo85115a(crVar, new C90796ao(this, crVar, runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo85123c(C58881cr crVar, Runnable runnable) {
        if (Trace.isEnabled()) {
            try {
                C91030n.m148695a((String) crVar.mo6453a(), this.f253913b);
                runnable.run();
            } finally {
                C91030n.m148696b(this.f253913b);
            }
        } else {
            runnable.run();
        }
    }
}
