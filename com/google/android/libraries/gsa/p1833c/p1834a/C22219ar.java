package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89004ab;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.libraries.gsa.c.a.ar */
/* compiled from: PG */
public final class C22219ar extends C89004ab {

    /* renamed from: a */
    protected final Object f61344a = new Object();

    /* renamed from: b */
    public final Deque f61345b = new ArrayDeque();

    /* renamed from: c */
    public boolean f61346c = false;

    /* renamed from: d */
    private final C89068x f61347d;

    public C22219ar(C89068x xVar) {
        this.f61347d = xVar;
        m41559g(1);
    }

    /* renamed from: g */
    private final void m41559g(int i) {
        synchronized (this.f61344a) {
            while (this.f61345b.size() < i) {
                this.f61345b.add(this.f61347d.mo27472b());
            }
        }
    }

    /* renamed from: a */
    public final int mo27471a() {
        int a;
        synchronized (this.f61344a) {
            a = this.f61347d.mo27471a();
        }
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        synchronized (this.f61344a) {
            if (this.f61346c) {
                C60870cx i = C60856cj.m92900i(new C89051g(new C90457d(C89885b.HTTP_DATA_SOURCE_ABORTED_VALUE)));
                return i;
            }
            m41559g(2);
            C60870cx cxVar = (C60870cx) this.f61345b.remove();
            return cxVar;
        }
    }

    /* renamed from: c */
    public final C22219ar mo27476e() {
        C22219ar arVar;
        synchronized (this.f61344a) {
            arVar = new C22219ar(this.f61347d.mo27476e());
        }
        return arVar;
    }

    /* renamed from: d */
    public final void mo27475d() {
        synchronized (this.f61344a) {
            if (!this.f61346c) {
                this.f61347d.mo27475d();
                while (!this.f61345b.isEmpty()) {
                    C60856cj.m92911t((C60870cx) this.f61345b.remove(), new C22218aq(), C60826bg.f164896a);
                }
                this.f61346c = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo27477f() {
        boolean f;
        synchronized (this.f61344a) {
            f = this.f61347d.mo27477f();
        }
        return f;
    }
}
