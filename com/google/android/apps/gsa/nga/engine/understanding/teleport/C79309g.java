package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.g */
/* compiled from: PG */
abstract class C79309g {
    /* renamed from: c */
    static C79309g m127241c(int i, int i2) {
        boolean z = true;
        C58838bb.m90868c(i >= 0);
        if (i > i2) {
            z = false;
        }
        C58838bb.m90868c(z);
        return new C79317o(i, i2);
    }

    /* renamed from: a */
    public abstract int mo73868a();

    /* renamed from: b */
    public abstract int mo73869b();
}
