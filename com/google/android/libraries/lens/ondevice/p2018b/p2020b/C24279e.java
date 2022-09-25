package com.google.android.libraries.lens.ondevice.p2018b.p2020b;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.ondevice.b.b.e */
/* compiled from: PG */
public abstract class C24279e {
    /* renamed from: a */
    public abstract C24280f mo29808a();

    /* renamed from: b */
    public final C24280f mo29823b() {
        C24280f a = mo29808a();
        boolean z = true;
        if (!a.mo29810b().mo56113h() && !a.mo29812d().mo56113h()) {
            z = false;
        }
        C58838bb.m90869d(z, "Must provide either bitmap or textInputs");
        return a;
    }
}
