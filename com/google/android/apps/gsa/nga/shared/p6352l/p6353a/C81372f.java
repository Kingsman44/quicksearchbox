package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import com.google.android.apps.gsa.shared.p6995aq.C89256a;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.f */
/* compiled from: PG */
public final class C81372f {

    /* renamed from: a */
    private static final C58495hd f222718a = C58495hd.m89903q(0, C81371e.THREE_BUTTON, 1, C81371e.TWO_BUTTON, 2, C81371e.GESTURE, 3, C81371e.SAMSUNG_GESTURE);

    /* renamed from: b */
    private final C89256a f222719b;

    public C81372f(C89256a aVar) {
        this.f222719b = aVar;
    }

    /* renamed from: a */
    public final C81371e mo75051a() {
        return (C81371e) f222718a.getOrDefault(Integer.valueOf(this.f222719b.mo83216d()), C81371e.THREE_BUTTON);
    }
}
