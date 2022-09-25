package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.content.Context;
import android.os.IBinder;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.af */
/* compiled from: PG */
public final class C119586af implements C119603aw {

    /* renamed from: a */
    public static final C59071e f333288a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.af");

    /* renamed from: b */
    public final Context f333289b;

    /* renamed from: c */
    public final Object f333290c = new Object();

    /* renamed from: d */
    public final Object f333291d = new Object();

    /* renamed from: e */
    public final List f333292e = new ArrayList();

    /* renamed from: f */
    public Optional f333293f = Optional.empty();

    /* renamed from: g */
    public C119585ae f333294g;

    /* renamed from: h */
    private final C60887da f333295h;

    public C119586af(Context context, C60887da daVar) {
        this.f333289b = context;
        this.f333295h = daVar;
    }

    /* renamed from: c */
    private final void m198474c() {
        C60870cx b = this.f333295h.mo19399b(C47810es.m84978r(new C119583ac(this)));
        C119584ad adVar = new C119584ad();
        C60856cj.m92911t(b, C47810es.m84974n(adVar), this.f333295h);
    }

    /* renamed from: a */
    public final void mo104452a(C17883am amVar) {
        synchronized (this.f333290c) {
            this.f333292e.add(amVar.toByteArray());
        }
        m198474c();
    }

    /* renamed from: b */
    public final void mo104453b(IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f333290c) {
            this.f333293f = Optional.m71637of(iBinder);
        }
        m198474c();
    }
}
