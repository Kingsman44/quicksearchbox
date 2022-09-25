package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.aj.g */
/* compiled from: PG */
public final class C84547g implements C84551k, C58881cr {

    /* renamed from: a */
    public static final C59071e f230083a = C59071e.m91332i("com.google.android.apps.gsa.search.core.aj.g");

    /* renamed from: b */
    public final Object f230084b = new Object();

    /* renamed from: c */
    public final List f230085c = new ArrayList(20);

    /* renamed from: d */
    public final List f230086d = new ArrayList(20);

    /* renamed from: e */
    private final C84544d f230087e;

    public C84547g(C84544d dVar) {
        new AtomicInteger();
        dVar.getClass();
        this.f230087e = dVar;
    }

    /* renamed from: f */
    private final void m135218f(C84550j... jVarArr) {
        int i;
        int i2;
        synchronized (this.f230084b) {
            for (C84550j jVar : jVarArr) {
                if (this.f230086d.isEmpty()) {
                    i = 0;
                } else {
                    List list = this.f230086d;
                    i = ((Integer) list.get(list.size() - 1)).intValue();
                }
                if (jVar == null) {
                    i2 = 0;
                } else {
                    i2 = jVar.mo78277b();
                }
                this.f230086d.add(Integer.valueOf(i + i2));
                this.f230085c.add(jVar);
            }
            this.f230084b.notifyAll();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        return new C84545e(this);
    }

    /* renamed from: b */
    public final String mo78272b() {
        String sb;
        String str;
        synchronized (this.f230084b) {
            StringBuilder sb2 = new StringBuilder("[");
            for (C84550j jVar : this.f230085c) {
                if (jVar == null) {
                    str = "N";
                } else {
                    str = jVar.mo78269a();
                }
                sb2.append(str);
            }
            sb2.append("]");
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: c */
    public final void mo78273c(C84552l lVar) {
        m135218f(lVar);
    }

    /* renamed from: d */
    public final void mo78274d() {
        m135218f(null);
        this.f230087e.mo78262b();
    }

    /* renamed from: e */
    public final void mo78275e(C90456c cVar) {
        m135218f(new C84546f(cVar), null);
        this.f230087e.mo78263c(cVar);
    }

    public final String toString() {
        return String.format("ChunkBuffer%s", new Object[]{mo78272b()});
    }
}
