package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.common.p4522b.C58758qx;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.am */
/* compiled from: PG */
final class C79417am {

    /* renamed from: a */
    public final AtomicBoolean f218056a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f218057b = new AtomicBoolean(true);

    /* renamed from: c */
    public final Set f218058c = C58758qx.m90653k();

    /* renamed from: a */
    public final boolean mo74027a() {
        return this.f218056a.get() || !this.f218057b.get() || !this.f218058c.isEmpty();
    }
}
