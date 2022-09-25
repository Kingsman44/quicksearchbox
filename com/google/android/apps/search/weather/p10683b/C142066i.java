package com.google.android.apps.search.weather.p10683b;

import android.content.Context;
import com.google.android.apps.search.weather.p10687f.C142090c;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.p3090o.C39838p;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import com.google.p4017at.p4060h.p4075e.p4076a.C54266b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.weather.b.i */
/* compiled from: PG */
public final class C142066i implements C142059b {

    /* renamed from: i */
    public static final /* synthetic */ int f385447i = 0;

    /* renamed from: b */
    public final Context f385448b;

    /* renamed from: c */
    public final C46407v f385449c;

    /* renamed from: d */
    public final C142090c f385450d;

    /* renamed from: e */
    public final C38683aa f385451e;

    /* renamed from: f */
    public final C46682c f385452f;

    /* renamed from: g */
    public final C39838p f385453g;

    /* renamed from: h */
    public final Executor f385454h;

    public C142066i(Context context, C46407v vVar, C142090c cVar, C38683aa aaVar, C46682c cVar2, C39838p pVar, Executor executor) {
        this.f385448b = context;
        this.f385449c = vVar;
        this.f385450d = cVar;
        this.f385451e = aaVar;
        this.f385452f = cVar2;
        this.f385453g = pVar;
        this.f385454h = executor;
    }

    /* renamed from: a */
    public final C46689ag mo116995a(C54266b bVar) {
        return new C142065h(this, bVar);
    }
}
