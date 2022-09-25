package androidx.camera.core.p069a.p070a.p072b;

import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.core.a.a.b.e */
/* compiled from: PG */
final class C1256e implements C2166e {

    /* renamed from: a */
    final /* synthetic */ C1257f f3657a;

    public C1256e(C1257f fVar) {
        this.f3657a = fVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C1974i.m5315c(this.f3657a.f3659b == null, "The result can only set once!");
        this.f3657a.f3659b = cVar;
        return "FutureChain[" + this.f3657a + "]";
    }
}
