package com.google.android.libraries.web.contrib.debug;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.web.contrib.debug.c */
/* compiled from: PG */
public abstract class C43471c {
    /* renamed from: a */
    public abstract DebugFeature mo46550a();

    /* renamed from: b */
    public abstract void mo46551b(C43474f fVar);

    /* renamed from: c */
    public abstract void mo46552c(int i);

    /* renamed from: d */
    public final DebugFeature mo46555d() {
        DebugFeature a = mo46550a();
        C58838bb.m90869d(a.mo46542d() > 0, "Web state capacity must be greater than 0.");
        return a;
    }
}
