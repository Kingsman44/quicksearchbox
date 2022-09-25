package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.engine.ag.c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.x */
/* compiled from: PG */
public final class C75903x extends C75891l {

    /* renamed from: c */
    private static final Duration f210614c = Duration.ofSeconds(2);

    /* renamed from: a */
    public final c f210615a;

    /* renamed from: b */
    public final String f210616b;

    /* renamed from: d */
    private final C22871g f210617d;

    public C75903x(C75892m mVar, String str, c cVar, C22871g gVar) {
        super(mVar);
        this.f210616b = str;
        this.f210615a = cVar;
        this.f210617d = gVar;
    }

    /* renamed from: f */
    public final int mo71939f() {
        return 1;
    }

    /* renamed from: i */
    public final void mo71940i() {
        super.mo71940i();
        this.f210617d.mo28213m("[NGA] WaitForForegroundAppState.activate", f210614c.toMillis(), new C75902w(this));
    }
}
