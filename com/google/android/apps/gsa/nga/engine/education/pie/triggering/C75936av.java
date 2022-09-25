package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.av */
/* compiled from: PG */
public final class C75936av implements C75864b {

    /* renamed from: b */
    private static final Duration f210685b = Duration.ofSeconds(10);

    /* renamed from: a */
    public final C75910k f210686a;

    /* renamed from: c */
    private final C22871g f210687c;

    /* renamed from: d */
    private final C91142g f210688d;

    public C75936av(C75910k kVar, C22871g gVar, C91142g gVar2) {
        this.f210686a = kVar;
        this.f210687c = gVar;
        this.f210688d = gVar2;
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        if (this.f210688d.mo85405j(C90126fx.f251350hE)) {
            this.f210687c.mo28213m("[NGA] SimpleAppOpenTrigger", f210685b.toMillis(), new C75935au(this));
        }
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
    }
}
