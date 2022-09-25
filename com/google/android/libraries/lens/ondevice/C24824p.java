package com.google.android.libraries.lens.ondevice;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.ondevice.p */
/* compiled from: PG */
public abstract class C24824p {
    /* renamed from: a */
    public abstract C24825q mo29794a();

    /* renamed from: b */
    public final C24825q mo30024b() {
        C24825q a = mo29794a();
        C58838bb.m90869d(a.mo29798c().mo56113h() == a.mo29799d().mo56113h(), "Must provide both ServerQueryEngine and ServerQueryExecutor");
        return a;
    }
}
