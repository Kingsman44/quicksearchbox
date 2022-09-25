package com.google.android.apps.gsa.sidekick.main.p7203f;

import android.accounts.Account;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.a */
/* compiled from: PG */
public final class C91371a extends C91377g {

    /* renamed from: a */
    public Account f254932a;

    /* renamed from: b */
    public byte f254933b;

    /* renamed from: c */
    private boolean f254934c;

    /* renamed from: d */
    private boolean f254935d;

    /* renamed from: e */
    private boolean f254936e;

    /* renamed from: a */
    public final C91378h mo85669a() {
        if (this.f254933b == 15) {
            return new C91372b(this.f254932a, this.f254934c, this.f254935d, this.f254936e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f254933b & 1) == 0) {
            sb.append(" ignoreNetworkAvailability");
        }
        if ((this.f254933b & 2) == 0) {
            sb.append(" includeLocation");
        }
        if ((this.f254933b & 4) == 0) {
            sb.append(" includeAnsweredQuestions");
        }
        if ((this.f254933b & 8) == 0) {
            sb.append(" abortIfNoActions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo85670b(boolean z) {
        this.f254934c = z;
        this.f254933b = (byte) (this.f254933b | 1);
    }

    /* renamed from: c */
    public final void mo85671c(boolean z) {
        this.f254936e = z;
        this.f254933b = (byte) (this.f254933b | 4);
    }

    /* renamed from: d */
    public final void mo85672d(boolean z) {
        this.f254935d = z;
        this.f254933b = (byte) (this.f254933b | 2);
    }
}
