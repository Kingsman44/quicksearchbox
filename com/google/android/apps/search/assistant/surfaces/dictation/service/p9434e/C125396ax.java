package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ax */
/* compiled from: PG */
public final class C125396ax {

    /* renamed from: a */
    public static final C59071e f345839a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.e.ax");

    /* renamed from: b */
    public final Context f345840b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue f345841c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final AtomicBoolean f345842d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C60887da f345843e;

    public C125396ax(Context context, C60888db dbVar) {
        this.f345840b = context;
        this.f345843e = dbVar;
    }

    /* renamed from: a */
    public final void mo106958a() {
        if (!this.f345841c.isEmpty() && this.f345842d.compareAndSet(false, true)) {
            Integer num = (Integer) this.f345841c.poll();
            if (num != null) {
                C125393au auVar = new C125393au(this, num);
                C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(auVar), this.f345843e), "Error when playing audio. [SD]", new Object[0]);
                return;
            }
            throw new AssertionError("Unexpected null value after polling from non-empty list.");
        }
    }
}
