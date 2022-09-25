package com.google.android.apps.gsa.staticplugins.p7371ae;

import androidx.p060c.C0977g;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.y */
/* compiled from: PG */
final class C93803y {

    /* renamed from: a */
    private final Map f262019a = new C0977g();

    /* renamed from: b */
    private final Queue f262020b = new ArrayDeque();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C93713a mo88174a(long j) {
        Map map = this.f262019a;
        Long valueOf = Long.valueOf(j);
        C93713a aVar = (C93713a) map.get(valueOf);
        if (aVar != null) {
            return aVar;
        }
        C93713a aVar2 = new C93713a(j);
        this.f262019a.put(valueOf, aVar2);
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C93742ba mo88175b(long j) {
        C93742ba b = mo88174a(j).mo88153b();
        if (b != null) {
            return b;
        }
        return (C93742ba) this.f262020b.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo88176c(C93742ba baVar, long j) {
        if (j == 0) {
            this.f262020b.add(baVar);
        } else {
            mo88174a(j).mo88154c(baVar);
        }
    }
}
