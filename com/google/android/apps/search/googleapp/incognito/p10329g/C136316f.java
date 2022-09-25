package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.content.Context;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136235e;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136240j;
import com.google.android.apps.search.googleapp.incognito.p10331h.p10332a.C136342d;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.f */
/* compiled from: PG */
public final class C136316f {

    /* renamed from: a */
    public final Context f371157a;

    /* renamed from: b */
    public final C136312b f371158b;

    /* renamed from: c */
    public final C136342d f371159c;

    /* renamed from: d */
    public final long f371160d;

    /* renamed from: e */
    public final C133148g f371161e;

    /* renamed from: f */
    private final C136240j f371162f;

    public C136316f(Context context, C136312b bVar, C136240j jVar, C136342d dVar, long j, C133148g gVar) {
        this.f371157a = context;
        this.f371158b = bVar;
        this.f371162f = jVar;
        this.f371159c = dVar;
        this.f371160d = j;
        this.f371161e = gVar;
        bVar.setCancelable(false);
    }

    /* renamed from: a */
    public final void mo112912a() {
        C46459k.m82829b(this.f371162f.f371025a.mo46039a(C136235e.f371020a, C60826bg.f164896a), "Failed to set enable_biometrics_dialog_shown.", new Object[0]);
    }
}
