package com.google.android.apps.search.googleapp.launcher.p10341b.p10350h;

import com.google.android.apps.search.googleapp.incognito.p10323d.C136244b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10343b.C136445b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.C136460b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.h.b */
/* compiled from: PG */
public final class C136488b implements C47352j {

    /* renamed from: a */
    public static final Duration f371593a = Duration.ofHours(24);

    /* renamed from: b */
    public final C21370a f371594b;

    /* renamed from: c */
    public final C136445b f371595c;

    /* renamed from: d */
    private final boolean f371596d;

    /* renamed from: e */
    private final boolean f371597e;

    /* renamed from: f */
    private final C60887da f371598f;

    /* renamed from: g */
    private final C136460b f371599g;

    public C136488b(boolean z, C136244b bVar, C60887da daVar, C136460b bVar2, C21370a aVar, C136445b bVar3) {
        this.f371596d = z;
        boolean z2 = true;
        if (!bVar.f371033a.mo112857a() && !bVar.f371034b) {
            z2 = false;
        }
        this.f371597e = z2;
        this.f371598f = daVar;
        this.f371599g = bVar2;
        this.f371594b = aVar;
        this.f371595c = bVar3;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f371597e || !this.f371596d) {
            return C60856cj.m92900i(false);
        }
        C60870cx d = this.f371599g.f371526a.mo46042d();
        C136487a aVar = new C136487a(this);
        return C60922j.m93044g(d, C47810es.m84963c(aVar), this.f371598f);
    }
}
