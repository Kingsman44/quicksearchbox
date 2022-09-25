package com.google.android.apps.search.googleapp.p10310h;

import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;

/* renamed from: com.google.android.apps.search.googleapp.h.t */
/* compiled from: PG */
public final class C136139t {

    /* renamed from: a */
    private final long f370772a;

    public C136139t(long j) {
        this.f370772a = j;
    }

    /* renamed from: a */
    public final C38510a mo112792a() {
        long j = this.f370772a;
        if (j == 1) {
            return C38510a.OPT_IN;
        }
        if (j == 2) {
            return C38510a.OPT_OUT;
        }
        return C38510a.DEFAULT;
    }

    /* renamed from: b */
    public final boolean mo112793b(boolean z) {
        long j = this.f370772a;
        if (j == 1) {
            return true;
        }
        if (j == 2) {
            return false;
        }
        return z;
    }
}
