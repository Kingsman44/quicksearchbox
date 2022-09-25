package com.google.android.apps.gsa.opaonboarding;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.opaonboarding.af */
/* compiled from: PG */
final class C83872af implements C83956t {

    /* renamed from: a */
    private final Runnable f228522a;

    public C83872af(Runnable runnable) {
        this.f228522a = runnable;
    }

    /* renamed from: c */
    public final C58833ax mo77209c() {
        this.f228522a.run();
        return C58836b.f156633a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f228522a);
        return "RunnableSequence{runnable=" + valueOf + "}";
    }
}
