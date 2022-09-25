package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.aw */
/* compiled from: PG */
public final class C79427aw {

    /* renamed from: a */
    private int f218090a = 0;

    /* renamed from: b */
    private int f218091b = 0;

    /* renamed from: a */
    public final synchronized int mo74050a() {
        int i;
        i = this.f218090a;
        this.f218090a = i + 1;
        return i;
    }

    /* renamed from: b */
    public final synchronized OptionalInt mo74051b() {
        int i = this.f218091b;
        if (i == this.f218090a) {
            return OptionalInt.empty();
        }
        this.f218091b = i + 1;
        return OptionalInt.m71640of(i);
    }
}
