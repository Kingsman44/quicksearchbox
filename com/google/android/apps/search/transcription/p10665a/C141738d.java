package com.google.android.apps.search.transcription.p10665a;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.transcription.a.d */
/* compiled from: PG */
public final class C141738d {

    /* renamed from: a */
    public static final C59071e f384712a = C59071e.m91332i("com.google.android.apps.search.transcription.a.d");

    /* renamed from: b */
    public final Context f384713b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue f384714c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final AtomicBoolean f384715d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C60887da f384716e;

    public C141738d(Context context, C60888db dbVar) {
        this.f384713b = context;
        this.f384716e = dbVar;
    }

    /* renamed from: a */
    public final void mo116699a(int i) {
        this.f384714c.add(Integer.valueOf(i));
        mo116700b();
    }

    /* renamed from: b */
    public final void mo116700b() {
        if (!this.f384714c.isEmpty() && this.f384715d.compareAndSet(false, true)) {
            this.f384716e.mo19398a(C47810es.m84977q(new C141735a(this)));
        }
    }
}
