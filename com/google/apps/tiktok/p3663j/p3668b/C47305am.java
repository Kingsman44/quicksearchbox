package com.google.apps.tiktok.p3663j.p3668b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.j.b.am */
/* compiled from: PG */
public abstract class C47305am {
    /* renamed from: d */
    public static C47305am m84125d(C47305am amVar, C47305am amVar2) {
        C58838bb.m90883r(amVar.mo51170c().equals(amVar2.mo51170c()));
        HashSet hashSet = new HashSet();
        C58833ax axVar = C58836b.f156633a;
        hashSet.addAll(amVar.mo51170c());
        long min = Math.min(amVar.mo51168a(), amVar2.mo51168a());
        C58833ax b = amVar.mo51169b();
        C58833ax b2 = amVar2.mo51169b();
        if (b.mo56113h() && b2.mo56113h()) {
            axVar = C58833ax.m90834k(Long.valueOf(Math.min(((Long) b.mo56107c()).longValue(), ((Long) b2.mo56107c()).longValue())));
        } else if (b.mo56113h()) {
            axVar = b;
        } else if (b2.mo56113h()) {
            axVar = b2;
        }
        return new C47284a(hashSet, min, axVar);
    }

    /* renamed from: a */
    public abstract long mo51168a();

    /* renamed from: b */
    public abstract C58833ax mo51169b();

    /* renamed from: c */
    public abstract Set mo51170c();
}
