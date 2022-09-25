package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.training.C29725a;
import com.google.android.libraries.micore.learning.training.util.StatusOr;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.e */
/* compiled from: PG */
final class C29733e implements NativeExampleIterator {

    /* renamed from: a */
    final C29725a f80500a;

    /* renamed from: b */
    final /* synthetic */ C29725a f80501b;

    /* renamed from: c */
    final /* synthetic */ C29734f f80502c;

    public C29733e(C29734f fVar, C29725a aVar) {
        this.f80502c = fVar;
        this.f80501b = aVar;
        this.f80500a = aVar;
    }

    public final void close() {
        this.f80502c.f80506d.mo57646b(new C29731c(this, this.f80501b));
    }

    public final StatusOr next() {
        return (StatusOr) this.f80502c.f80506d.mo57645a(new C29732d(this));
    }
}
