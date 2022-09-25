package com.google.android.gms.cast.framework.media;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.media.be */
/* compiled from: PG */
public final class C143499be {

    /* renamed from: a */
    public final Set f389121a = new HashSet();

    /* renamed from: b */
    public final long f389122b;

    /* renamed from: c */
    public boolean f389123c;

    /* renamed from: d */
    final /* synthetic */ C143500bf f389124d;

    /* renamed from: e */
    private final Runnable f389125e;

    public C143499be(C143500bf bfVar, long j) {
        this.f389124d = bfVar;
        this.f389122b = j;
        this.f389125e = new C143498bd(this);
    }

    /* renamed from: a */
    public final void mo118760a() {
        this.f389124d.f389128c.removeCallbacks(this.f389125e);
        this.f389123c = true;
        this.f389124d.f389128c.postDelayed(this.f389125e, this.f389122b);
    }

    /* renamed from: b */
    public final void mo118761b() {
        this.f389124d.f389128c.removeCallbacks(this.f389125e);
        this.f389123c = false;
    }
}
