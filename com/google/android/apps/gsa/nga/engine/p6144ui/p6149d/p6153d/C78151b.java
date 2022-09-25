package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78110b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78113e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6151b.C78117b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.b */
/* compiled from: PG */
public final class C78151b implements C78113e, C78117b {

    /* renamed from: a */
    private static final Duration f215184a = Duration.ofMillis(100);

    /* renamed from: b */
    private final C83357g f215185b = new C83361k(Float.valueOf(0.0f), C78110b.class);

    /* renamed from: c */
    private final C22871g f215186c;

    /* renamed from: d */
    private final Object f215187d = new Object();

    /* renamed from: e */
    private final C60950i f215188e;

    /* renamed from: f */
    private Instant f215189f;

    public C78151b(C60950i iVar, C22871g gVar) {
        this.f215188e = iVar;
        this.f215186c = gVar;
        this.f215189f = iVar.mo57444a();
    }

    /* renamed from: a */
    public final C83358h mo73080a() {
        return this.f215185b;
    }

    /* renamed from: b */
    public final void mo73091b(float f) {
        Instant a = this.f215188e.mo57444a();
        synchronized (this.f215187d) {
            Float valueOf = Float.valueOf(f);
            if (this.f215189f.plus(f215184a).isBefore(a)) {
                C83349aj.m132647b(this.f215186c, this.f215185b, valueOf, "audioLevel");
                this.f215189f = a;
            }
        }
    }
}
