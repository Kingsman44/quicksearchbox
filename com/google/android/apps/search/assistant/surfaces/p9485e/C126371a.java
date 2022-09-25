package com.google.android.apps.search.assistant.surfaces.p9485e;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a */
/* compiled from: PG */
public final class C126371a {
    /* renamed from: a */
    public final Throwable mo107571a(Throwable th) {
        if (th.getCause() == null) {
            return th;
        }
        Throwable cause = th.getCause();
        C69664n.m101059e(cause, "null cannot be cast to non-null type kotlin.Throwable");
        return mo107571a(cause);
    }
}
