package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.silk.event.C41889a;
import com.google.android.libraries.silk.event.C41895c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56826c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56828e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56829f;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.e.f */
/* compiled from: PG */
public final class C40506f extends BroadcastReceiver {

    /* renamed from: a */
    public static final C59071e f106272a = C59071e.m91331h();

    /* renamed from: b */
    public final C41889a f106273b;

    /* renamed from: c */
    public final Executor f106274c;

    /* renamed from: d */
    public boolean f106275d;

    /* renamed from: e */
    private final Context f106276e;

    /* renamed from: f */
    private final Executor f106277f;

    /* renamed from: g */
    private C56828e f106278g = C56828e.UNKNOWN;

    /* renamed from: h */
    private C41895c f106279h;

    /* renamed from: i */
    private boolean f106280i;

    public C40506f(Context context, C41889a aVar, Executor executor) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "coordinator");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f106276e = context;
        this.f106273b = aVar;
        this.f106277f = executor;
        this.f106274c = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo42475a(C41895c cVar) {
        if (!this.f106275d) {
            this.f106279h = cVar;
            if (cVar != null && !this.f106280i) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                this.f106276e.registerReceiver(this, intentFilter);
                this.f106280i = true;
            } else if (cVar == null && this.f106280i) {
                try {
                    this.f106276e.unregisterReceiver(this);
                    this.f106280i = false;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo42476b(C56828e eVar) {
        if (this.f106278g != eVar && !this.f106275d) {
            this.f106278g = eVar;
            C41895c cVar = this.f106279h;
            if (cVar != null) {
                C56826c cVar2 = (C56826c) C56829f.f151628c.createBuilder();
                C69664n.m101060f(cVar2, "newBuilder()");
                C69664n.m101061g(cVar2, "builder");
                C69664n.m101061g(eVar, "value");
                cVar2.copyOnWrite();
                C56829f fVar = (C56829f) cVar2.instance;
                fVar.f151631b = eVar.f151627d;
                fVar.f151630a |= 1;
                C62942bv build = cVar2.build();
                C69664n.m101060f(build, "_builder.build()");
                cVar.mo44351a((C56829f) build);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C69664n.m101061g(context, "context");
        if (intent != null && intent.getAction() != null) {
            this.f106274c.execute(C47810es.m84977q(new C40505e(this, intent)));
        }
    }
}
