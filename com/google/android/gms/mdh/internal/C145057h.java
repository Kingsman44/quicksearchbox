package com.google.android.gms.mdh.internal;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.mdh.internal.h */
/* compiled from: PG */
public final class C145057h {

    /* renamed from: a */
    public final List f392117a = new ArrayList();

    /* renamed from: b */
    public boolean f392118b;

    /* renamed from: c */
    public final C146010af f392119c;

    /* renamed from: d */
    public final /* synthetic */ C145060k f392120d;

    /* renamed from: e */
    private final C145059j f392121e;

    public C145057h(C145060k kVar, C146010af afVar, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        this.f392120d = kVar;
        this.f392119c = afVar;
        this.f392121e = new C145059j(kVar, syncPolicy, latestFootprintFilter);
    }

    /* renamed from: a */
    public final void mo120581a() {
        this.f392118b = true;
        this.f392120d.f392127b.mo119290u(1, this.f392121e).mo122493l(this.f392120d.f392126a, new C145056g(this));
    }
}
