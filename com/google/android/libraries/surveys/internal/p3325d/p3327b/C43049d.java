package com.google.android.libraries.surveys.internal.p3325d.p3327b;

import android.os.CountDownTimer;
import com.google.p4281bu.p4282a.C56582h;

/* renamed from: com.google.android.libraries.surveys.internal.d.b.d */
/* compiled from: PG */
final class C43049d extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ C56582h f112597a;

    /* renamed from: b */
    final /* synthetic */ C43050e f112598b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43049d(C43050e eVar, long j, C56582h hVar) {
        super(j, 100);
        this.f112598b = eVar;
        this.f112597a = hVar;
    }

    public final void onFinish() {
        C43050e eVar = this.f112598b;
        eVar.f112603e.mo33737a(eVar.mo46073e(this.f112597a));
    }

    public final void onTick(long j) {
    }
}
