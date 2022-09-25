package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d;

import android.content.Context;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.c.a.d.h */
/* compiled from: PG */
public final class C39493h {

    /* renamed from: a */
    public static final C59071e f104012a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.d.h");

    /* renamed from: b */
    public final Context f104013b;

    /* renamed from: c */
    public final C42813k f104014c;

    /* renamed from: d */
    public final Executor f104015d;

    /* renamed from: e */
    public final Executor f104016e;

    /* renamed from: f */
    public final Executor f104017f;

    /* renamed from: g */
    public C39492g f104018g;

    public C39493h(Context context, C42813k kVar, Executor executor, Executor executor2, Executor executor3) {
        this.f104013b = context;
        this.f104014c = kVar;
        this.f104015d = executor;
        this.f104016e = executor2;
        this.f104017f = executor3;
    }

    /* renamed from: a */
    public final C60870cx mo41862a() {
        return C59417y.m92320f(new C39488c(this), 5, this.f104016e);
    }

    /* renamed from: b */
    public final void mo41863b() {
        C58976aa aaVar = C58975e.f156826a;
        C39492g gVar = this.f104018g;
        if (gVar != null) {
            this.f104013b.unbindService(gVar);
        }
    }
}
