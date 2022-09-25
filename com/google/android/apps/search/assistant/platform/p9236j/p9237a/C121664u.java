package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.os.CancellationSignal;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.u */
/* compiled from: PG */
final class C121664u extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ CancellationSignal f337549a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121664u(CancellationSignal cancellationSignal) {
        super(1);
        this.f337549a = cancellationSignal;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        this.f337549a.cancel();
        return C69788q.f186170a;
    }
}
