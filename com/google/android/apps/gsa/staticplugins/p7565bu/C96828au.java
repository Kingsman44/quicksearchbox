package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82304af;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.au */
/* compiled from: PG */
public final class C96828au {

    /* renamed from: a */
    public static final C59071e f270774a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bu.au");

    /* renamed from: b */
    public static final C118522by f270775b = C118522by.MDD_CELLULAR_CHARGING_TASK;

    /* renamed from: c */
    public static final Duration f270776c = Duration.ofSeconds(1);

    /* renamed from: d */
    public static final Duration f270777d = Duration.ofSeconds(5);

    /* renamed from: e */
    public static final Duration f270778e = Duration.ofSeconds(40);

    /* renamed from: f */
    public static final AtomicLong f270779f = new AtomicLong(1);

    /* renamed from: g */
    public final Object f270780g;

    /* renamed from: h */
    public final Set f270781h = EnumSet.noneOf(C65753ak.class);

    /* renamed from: i */
    public Optional f270782i = Optional.empty();

    /* renamed from: j */
    public long f270783j;

    /* renamed from: k */
    public final C96826as f270784k;

    /* renamed from: l */
    public final C22871g f270785l;

    /* renamed from: m */
    public final C22871g f270786m;

    /* renamed from: n */
    public final Optional f270787n;

    /* renamed from: o */
    public final C118561t f270788o;

    public C96828au(C96826as asVar, C22871g gVar, C22871g gVar2, C118561t tVar, Optional optional) {
        Object obj = new Object();
        this.f270780g = obj;
        this.f270784k = asVar;
        this.f270788o = tVar;
        this.f270785l = gVar2;
        this.f270786m = gVar;
        this.f270787n = optional;
        synchronized (obj) {
            this.f270783j = f270779f.getAndIncrement();
        }
    }

    /* renamed from: a */
    public final void mo90364a(int i) {
        this.f270787n.ifPresent(new C96823ap(new C82304af("GDD_TASK_SCHEDULER_RESULT", i != 1 ? i != 2 ? "EXCEPTION_IN_POPULATOR" : "TIMEOUT" : "SUCCESS")));
    }
}
