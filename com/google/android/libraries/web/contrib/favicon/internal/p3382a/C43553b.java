package com.google.android.libraries.web.contrib.favicon.internal.p3382a;

import com.google.android.libraries.web.contrib.favicon.C43542a;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3354a.C43317a;
import com.google.android.libraries.web.p3353c.p3354a.C43321e;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.web.contrib.favicon.internal.a.b */
/* compiled from: PG */
public final class C43553b implements C43317a, C43321e {

    /* renamed from: a */
    public final C44080d f113717a;

    /* renamed from: b */
    public final C46778cv f113718b;

    /* renamed from: c */
    private final C60888db f113719c;

    /* renamed from: d */
    private Future f113720d;

    public C43553b(C44078b bVar, C46778cv cvVar, C60888db dbVar) {
        this.f113717a = bVar.mo47044a(C44082a.f114755a, "com.google.android.libraries.web.contrib.favicon.FaviconDataService_WebModel", C43542a.f113702a);
        this.f113718b = cvVar;
        this.f113719c = dbVar;
    }

    /* renamed from: a */
    public final void mo46415a(C43376u uVar) {
        this.f113720d = this.f113719c.mo29164d(C47810es.m84977q(new C43552a(this)), 10000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void mo46420b(C43376u uVar) {
        Future future = this.f113720d;
        if (future != null) {
            future.cancel(true);
        }
    }
}
