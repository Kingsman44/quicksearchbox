package com.google.android.libraries.p1730f.p1731a;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21384g;
import com.google.android.libraries.p1730f.C21385h;

/* renamed from: com.google.android.libraries.f.a.h */
/* compiled from: PG */
public final class C21378h implements C21370a {

    /* renamed from: a */
    private final Context f59770a;

    /* renamed from: b */
    private C21373c f59771b;

    /* renamed from: c */
    private C21373c f59772c;

    public C21378h(Context context) {
        this.f59770a = context;
    }

    /* renamed from: a */
    public final long mo26869a() {
        return SystemClock.currentThreadTimeMillis();
    }

    /* renamed from: b */
    public final long mo26870b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public final long mo26871c() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final long mo26872d() {
        return C21374d.m40426a();
    }

    /* renamed from: e */
    public final long mo26873e() {
        return System.nanoTime();
    }

    /* renamed from: f */
    public final long mo26874f() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: g */
    public final void mo26880g(C21384g gVar) {
        if (this.f59771b == null) {
            this.f59771b = new C21373c(this.f59770a, "android.intent.action.TIME_SET", C21377g.f59769a);
        }
        this.f59771b.mo26877a(gVar);
    }

    /* renamed from: h */
    public final void mo26881h(C21385h hVar) {
        if (this.f59772c == null) {
            this.f59772c = new C21373c(this.f59770a, "android.intent.action.TIME_TICK", C21376f.f59768a);
        }
        this.f59772c.mo26877a(hVar);
    }

    /* renamed from: i */
    public final void mo26882i(C21384g gVar) {
        C21373c cVar = this.f59771b;
        if (cVar != null) {
            cVar.mo26878b(gVar);
            if (this.f59771b.mo26879c()) {
                this.f59771b = null;
            }
        }
    }

    /* renamed from: j */
    public final void mo26883j(C21385h hVar) {
        C21373c cVar = this.f59772c;
        if (cVar != null) {
            cVar.mo26878b(hVar);
            if (this.f59772c.mo26879c()) {
                this.f59772c = null;
            }
        }
    }
}
