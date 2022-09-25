package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89058n;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.c.a.bv */
/* compiled from: PG */
final class C22250bv {

    /* renamed from: a */
    public static final C59071e f61452a = C59071e.m91332i("com.google.android.libraries.gsa.c.a.bv");

    /* renamed from: b */
    public final C89037bh f61453b;

    /* renamed from: c */
    public final C89058n f61454c;

    /* renamed from: d */
    public final long f61455d;

    /* renamed from: e */
    public final long f61456e;

    /* renamed from: f */
    public final long f61457f;

    /* renamed from: g */
    public final long f61458g;

    /* renamed from: h */
    public final C89061q f61459h;

    /* renamed from: i */
    public final boolean f61460i;

    /* renamed from: j */
    public C22249bu f61461j;

    /* renamed from: k */
    public volatile boolean f61462k;

    /* renamed from: l */
    public volatile boolean f61463l;

    /* renamed from: m */
    public volatile boolean f61464m;

    /* renamed from: n */
    volatile boolean f61465n;

    /* renamed from: o */
    volatile boolean f61466o;

    /* renamed from: p */
    public volatile int f61467p = -1;

    /* renamed from: q */
    public volatile int f61468q = -1;

    /* renamed from: r */
    private final C22871g f61469r;

    public C22250bv(C22871g gVar, C89037bh bhVar, C89058n nVar, C89061q qVar, long j, long j2, long j3, long j4, boolean z) {
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        this.f61469r = gVar;
        this.f61453b = bhVar;
        this.f61454c = nVar;
        this.f61459h = qVar;
        boolean z2 = false;
        C58838bb.m90872g(j5 > 0, "Invalid response timeout: %s", j5);
        this.f61455d = j5;
        C58838bb.m90872g(j6 > 0, "Invalid read timeout: %s", j6);
        this.f61456e = j6;
        if (j7 == -1) {
            this.f61465n = true;
        } else {
            if (j7 > 0 && j7 < j6 && j7 < j5) {
                z2 = true;
            }
            C58838bb.m90872g(z2, "Invalid no progress timeout: %s", j7);
        }
        this.f61457f = j7;
        this.f61458g = j8;
        if (j8 == 0) {
            this.f61466o = true;
        }
        this.f61460i = z;
    }

    /* renamed from: a */
    public final void mo27506a(long j) {
        this.f61469r.mo28213m("TimeoutMonitorTask", j, new C22248bt(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27507b() {
        this.f61454c.mo82968l();
        this.f61462k = true;
    }
}
