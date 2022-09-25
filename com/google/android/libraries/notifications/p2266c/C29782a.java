package com.google.android.libraries.notifications.p2266c;

import android.content.BroadcastReceiver;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.c.a */
/* compiled from: PG */
public final class C29782a {

    /* renamed from: a */
    private final BroadcastReceiver.PendingResult f80706a;

    /* renamed from: b */
    private final boolean f80707b;

    /* renamed from: c */
    private final int f80708c;

    /* renamed from: d */
    private boolean f80709d;

    public C29782a(BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.f80706a = pendingResult;
        this.f80707b = z;
        this.f80708c = i;
    }

    /* renamed from: a */
    public final synchronized void mo34977a() {
        if (this.f80709d) {
            C30058b.m55789a("BroadcastAsyncOperation", "Already finished BroadcastAsyncOperation [%d]", Integer.valueOf(this.f80708c));
            return;
        }
        if (this.f80707b) {
            this.f80706a.setResultCode(-1);
        }
        this.f80706a.finish();
        this.f80709d = true;
        C30058b.m55789a("BroadcastAsyncOperation", "Finished BroadcastAsyncOperation [%d]", Integer.valueOf(this.f80708c));
    }

    public final String toString() {
        int i = this.f80708c;
        return "BroadcastAsyncOperation{executionId=" + i + "}";
    }
}
