package com.google.android.apps.search.googleapp.p10516t.p10517a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.search.p3025k.C38558m;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.t.a.c */
/* compiled from: PG */
public final class C139689c extends C89859i {

    /* renamed from: a */
    public final C89859i f379683a;

    /* renamed from: b */
    public final C38558m f379684b;

    /* renamed from: c */
    public final Executor f379685c;

    /* renamed from: d */
    private final C47632e f379686d = new C47632e();

    public C139689c(C89859i iVar, C38558m mVar, Executor executor) {
        this.f379683a = iVar;
        this.f379684b = mVar;
        this.f379685c = executor;
    }

    /* renamed from: a */
    public final void mo74236a(C89857g gVar) {
        C46459k.m82829b(this.f379686d.mo51512b(new C139688b(this, gVar), this.f379685c), "Failed to log an AppFlow event.", new Object[0]);
    }
}
