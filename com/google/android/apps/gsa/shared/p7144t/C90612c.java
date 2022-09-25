package com.google.android.apps.gsa.shared.p7144t;

import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21550g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21539g;
import com.google.common.util.concurrent.C60843bx;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.shared.t.c */
/* compiled from: PG */
public final class C90612c extends C60843bx {

    /* renamed from: a */
    public final SettableFuture f253286a = new SettableFuture();

    /* renamed from: b */
    public final C21539g f253287b;

    public C90612c(C21539g gVar) {
        this.f253287b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo57326c() {
        return this.f253286a;
    }

    public final boolean cancel(boolean z) {
        this.f253287b.f59939a.mo117320e();
        return super.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ Future mo57321d() {
        return this.f253286a;
    }

    public final /* synthetic */ Object get() {
        return (C21550g) super.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f253286a;
    }

    public final String toString() {
        return "[GcorePendingResultListenableFuture] ".concat(String.valueOf(this.f253286a.toString()));
    }
}
