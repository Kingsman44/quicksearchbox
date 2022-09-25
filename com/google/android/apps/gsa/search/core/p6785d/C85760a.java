package com.google.android.apps.gsa.search.core.p6785d;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.d.a */
/* compiled from: PG */
public final /* synthetic */ class C85760a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85763d f231902a;

    /* renamed from: b */
    public final /* synthetic */ C58881cr f231903b;

    /* renamed from: c */
    public final /* synthetic */ Uri f231904c;

    /* renamed from: d */
    public final /* synthetic */ Uri f231905d;

    /* renamed from: e */
    public final /* synthetic */ C85762c f231906e;

    /* renamed from: f */
    public final /* synthetic */ long f231907f;

    public /* synthetic */ C85760a(C85763d dVar, C58881cr crVar, Uri uri, Uri uri2, C85762c cVar, long j) {
        this.f231902a = dVar;
        this.f231903b = crVar;
        this.f231904c = uri;
        this.f231905d = uri2;
        this.f231906e = cVar;
        this.f231907f = j;
    }

    public final void run() {
        C85763d dVar = this.f231902a;
        C58881cr crVar = this.f231903b;
        Uri uri = this.f231904c;
        Uri uri2 = this.f231905d;
        C85762c cVar = this.f231906e;
        long j = this.f231907f;
        C22872h.m42743c(C86593a.class);
        if (crVar != dVar.f231914a) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        dVar.f231914a = null;
        if (uri2 != null) {
            cVar.mo79414a(uri, uri2, j);
        }
    }
}
