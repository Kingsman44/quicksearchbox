package com.google.android.apps.gsa.nga.shared.p6350k.p6351a;

import com.google.android.apps.gsa.nga.shared.p6350k.C81342b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.k.a.c */
/* compiled from: PG */
public final class C81341c implements C81342b {

    /* renamed from: a */
    public static final Duration f222628a = Duration.ofSeconds(10);

    /* renamed from: b */
    public static final String f222629b = String.format("Only %s dynamic actions are supported.", new Object[]{C58485gu.m89847o("search", "checkout")});

    /* renamed from: c */
    public static final String f222630c = String.format("%s parameter is required for %s dynamic action.", new Object[]{"SEARCH_QUERY", "search"});

    /* renamed from: d */
    public final Optional f222631d;

    /* renamed from: e */
    public final C22871g f222632e;

    public C81341c(Optional optional, C22871g gVar) {
        this.f222631d = optional;
        this.f222632e = gVar;
    }
}
