package com.google.android.apps.search.assistant.surfaces.roti.p9499a;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.a.d */
/* compiled from: PG */
public final class C126760d {

    /* renamed from: a */
    public static final C59071e f349077a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.roti.a.d");

    /* renamed from: b */
    public final Context f349078b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue f349079c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final AtomicBoolean f349080d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C60887da f349081e;

    public C126760d(Context context, C60887da daVar) {
        this.f349078b = context;
        this.f349081e = daVar;
    }

    /* renamed from: a */
    public final void mo107751a(int i) {
        this.f349079c.add(Integer.valueOf(i));
        mo107752b();
    }

    /* renamed from: b */
    public final void mo107752b() {
        if (!this.f349079c.isEmpty() && this.f349080d.compareAndSet(false, true)) {
            this.f349081e.mo19398a(C47810es.m84977q(new C126757a(this)));
        }
    }
}
