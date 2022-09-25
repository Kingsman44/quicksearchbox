package com.google.android.apps.gsa.sidekick.main.p7199b;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.c */
/* compiled from: PG */
public abstract class C91263c implements C90991b {
    /* renamed from: a */
    public abstract double mo85523a();

    /* renamed from: b */
    public abstract double mo85524b();

    /* renamed from: c */
    public abstract float mo85525c();

    /* renamed from: e */
    public abstract long mo85526e();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(mo85526e())));
        fVar.mo85279c("latitude").mo85276a(C90752i.m148233g(String.format("%.2f", new Object[]{Double.valueOf(mo85523a())})));
        fVar.mo85279c("longitude").mo85276a(C90752i.m148233g(String.format("%.2f", new Object[]{Double.valueOf(mo85524b())})));
        fVar.mo85279c("radius").mo85277b("%.1f", C90752i.m148230d(Float.valueOf(mo85525c())));
    }
}
