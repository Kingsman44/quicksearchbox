package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3070g;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39385aa;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.c.a.g.d */
/* compiled from: PG */
public final class C39533d {

    /* renamed from: a */
    public static final C59071e f104092a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.g.d");

    /* renamed from: b */
    public final Executor f104093b;

    /* renamed from: c */
    public final Context f104094c;

    /* renamed from: d */
    public final C47770dh f104095d;

    /* renamed from: e */
    public final C39385aa f104096e;

    /* renamed from: f */
    public final BroadcastReceiver f104097f = new C39532c(this);

    /* renamed from: g */
    public boolean f104098g = false;

    /* renamed from: h */
    private final C47632e f104099h;

    public C39533d(Executor executor, Context context, C47770dh dhVar, C39385aa aaVar) {
        this.f104093b = executor;
        this.f104094c = context;
        this.f104095d = dhVar;
        this.f104096e = aaVar;
        this.f104099h = new C47632e();
    }

    /* renamed from: a */
    public final void mo41879a(boolean z) {
        C47632e eVar = this.f104099h;
        eVar.getClass();
        C46459k.m82829b(eVar.mo51511a(new C39530a(this, z), this.f104093b), "Failed creating BroadcastReceiver for screen on / off broadcasts.", new Object[0]);
    }
}
