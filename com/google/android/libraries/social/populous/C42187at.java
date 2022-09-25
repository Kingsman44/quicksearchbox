package com.google.android.libraries.social.populous;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.social.populous.at */
/* compiled from: PG */
public abstract class C42187at {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract GroupMember mo44876a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Person mo44877b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo44878c();

    /* renamed from: d */
    public final GroupMember mo44879d() {
        C58838bb.m90884s(mo44877b() != null, "Autocompletions must only contain one of: person...");
        if (mo44877b() != null) {
            mo44878c();
        }
        return mo44876a();
    }
}
