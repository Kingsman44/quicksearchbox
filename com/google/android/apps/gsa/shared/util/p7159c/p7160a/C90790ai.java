package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ai */
/* compiled from: PG */
public final class C90790ai implements C90783ab {

    /* renamed from: a */
    public static final C59071e f253888a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.a.ai");

    /* renamed from: b */
    public final long f253889b;

    /* renamed from: c */
    public final C21370a f253890c;

    /* renamed from: d */
    public volatile C90789ah f253891d;

    /* renamed from: e */
    public final Object f253892e = new Object();

    /* renamed from: f */
    public int f253893f;

    /* renamed from: g */
    boolean f253894g;

    /* renamed from: h */
    private final long f253895h;

    /* renamed from: i */
    private final C90783ab f253896i;

    /* renamed from: j */
    private final C90783ab f253897j;

    public C90790ai(C21370a aVar, C90783ab abVar, C90783ab abVar2, int i, int i2) {
        this.f253895h = (long) i;
        this.f253889b = (long) i2;
        this.f253890c = aVar;
        this.f253897j = abVar;
        this.f253896i = abVar2;
        this.f253891d = null;
        this.f253893f = 0;
        this.f253894g = false;
    }

    /* renamed from: a */
    public final void mo85115a(C58881cr crVar, Runnable runnable) {
        boolean z;
        synchronized (this.f253892e) {
            z = true;
            this.f253893f++;
            if (!this.f253894g) {
                this.f253894g = true;
            } else {
                z = false;
            }
        }
        if (z) {
            mo85118c();
        }
        this.f253896i.mo85115a(crVar, new C90786ae(this, crVar, runnable));
    }

    /* renamed from: b */
    public final void mo85114b(C58881cr crVar, Runnable runnable, long j) {
        boolean z;
        synchronized (this.f253892e) {
            z = true;
            this.f253893f++;
            if (!this.f253894g) {
                this.f253894g = true;
            } else {
                z = false;
            }
        }
        if (z) {
            mo85118c();
        }
        this.f253896i.mo85114b(crVar, new C90786ae(this, crVar, runnable), j);
    }

    /* renamed from: c */
    public final void mo85118c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f253897j.mo85114b(C90787af.f253883a, new C90788ag(this), this.f253895h);
    }

    /* renamed from: d */
    public final void mo85119d() {
        this.f253891d = null;
        synchronized (this.f253892e) {
            this.f253893f--;
        }
    }
}
