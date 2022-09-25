package com.google.android.apps.gsa.search.core.p6785d;

import android.net.Uri;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.search.core.d.b */
/* compiled from: PG */
final class C85761b extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Uri f231908a;

    /* renamed from: b */
    final /* synthetic */ C58881cr f231909b;

    /* renamed from: c */
    final /* synthetic */ C85762c f231910c;

    /* renamed from: d */
    final /* synthetic */ long f231911d;

    /* renamed from: e */
    final /* synthetic */ C85763d f231912e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85761b(C85763d dVar, Uri uri, C58881cr crVar, C85762c cVar, long j) {
        super("ad-click", 1, 12);
        this.f231912e = dVar;
        this.f231908a = uri;
        this.f231909b = crVar;
        this.f231910c = cVar;
        this.f231911d = j;
    }

    public final void run() {
        this.f231912e.mo79416b(this.f231908a, this.f231909b, this.f231910c, this.f231911d);
    }
}
