package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cm */
/* compiled from: PG */
public final class C103967cm {

    /* renamed from: a */
    private long f289353a = 0;

    /* renamed from: b */
    private long f289354b = 0;

    /* renamed from: c */
    private final HashSet f289355c = new HashSet();

    /* renamed from: d */
    private final HashMap f289356d = new HashMap();

    /* renamed from: e */
    private int f289357e = 2;

    /* renamed from: g */
    private final void m171915g() {
        Iterator it = this.f289355c.iterator();
        while (it.hasNext()) {
            ((C103966cl) it.next()).mo93907a(this.f289357e, this.f289353a, this.f289354b);
        }
    }

    /* renamed from: h */
    private final synchronized void m171916h(int i) {
        this.f289357e = i;
        m171915g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo93909b(C80627v vVar, long j) {
        vVar.name();
        Long l = (Long) this.f289356d.put(vVar, Long.valueOf(j));
        if (l == null || l.longValue() != j) {
            this.f289354b = Collection.EL.stream(this.f289356d.values()).mapToLong(C103965ck.f289352a).sum();
            m171915g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo93910c(long j) {
        this.f289353a = j;
        m171915g();
    }

    /* renamed from: d */
    public final synchronized void mo93911d(C103966cl clVar) {
        this.f289355c.add(clVar);
        clVar.mo93907a(this.f289357e, this.f289353a, this.f289354b);
    }

    /* renamed from: e */
    public final synchronized void mo93912e(C103966cl clVar) {
        this.f289355c.remove(clVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo93913f(int i) {
        int i2 = this.f289357e;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 5) {
            m171916h(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo93908a() {
        int i = this.f289357e;
        if (i == 0) {
            throw null;
        } else if (i == 5) {
            m171916h(2);
        }
    }
}
