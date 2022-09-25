package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.libraries.p1730f.C21370a;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.al */
/* compiled from: PG */
public final class C98156al {

    /* renamed from: a */
    private final int f274089a;

    /* renamed from: b */
    private final int f274090b;

    /* renamed from: c */
    private final int f274091c;

    /* renamed from: d */
    private final Queue f274092d = new PriorityQueue();

    /* renamed from: e */
    private final Object f274093e = new Object();

    /* renamed from: f */
    private final C21370a f274094f;

    /* renamed from: g */
    private Integer f274095g;

    public C98156al(C21370a aVar, int i, int i2, int i3) {
        this.f274094f = aVar;
        this.f274089a = i;
        this.f274090b = i2;
        this.f274091c = i3;
    }

    /* renamed from: c */
    private final int m162591c() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(this.f274094f.mo26870b());
    }

    /* renamed from: d */
    private final void m162592d(int i) {
        if (this.f274090b == 0 || this.f274092d.size() < this.f274089a) {
            Integer num = this.f274095g;
            if (num != null && i >= num.intValue()) {
                this.f274095g = null;
                return;
            }
            return;
        }
        this.f274092d.clear();
        this.f274095g = Integer.valueOf(i + this.f274091c);
    }

    /* renamed from: a */
    public final void mo90998a() {
        synchronized (this.f274093e) {
            int c = m162591c();
            this.f274092d.add(Integer.valueOf(c));
            Iterator it = this.f274092d.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                int i = c - this.f274090b;
                if (intValue > c || intValue < i) {
                    it.remove();
                }
            }
            m162592d(c);
        }
    }

    /* renamed from: b */
    public final boolean mo90999b() {
        boolean z;
        synchronized (this.f274093e) {
            m162592d(m162591c());
            z = this.f274095g == null;
        }
        return z;
    }
}
