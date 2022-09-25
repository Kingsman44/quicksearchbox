package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.bl */
/* compiled from: PG */
public final class C104337bl {

    /* renamed from: a */
    public final C21370a f290279a;

    /* renamed from: b */
    public final Object f290280b = new Object();

    /* renamed from: c */
    public final LongSparseArray f290281c = new LongSparseArray();

    /* renamed from: d */
    public final LongSparseArray f290282d = new LongSparseArray();

    public C104337bl(C21370a aVar) {
        this.f290279a = aVar;
    }

    /* renamed from: a */
    public final void mo94097a(C7718hj hjVar) {
        long b = this.f290279a.mo26870b();
        synchronized (this.f290280b) {
            long b2 = C91994m.m150995b(hjVar);
            if (this.f290282d.indexOfKey(b2) < 0) {
                this.f290282d.put(b2, Long.valueOf(b));
            }
        }
    }
}
