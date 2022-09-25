package androidx.navigation;

import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2383n;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.l */
/* compiled from: PG */
final class C3891l extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C3892m f12475a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3891l(C3892m mVar) {
        super(0);
        this.f12475a = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        if (this.f12475a.f12481f.f6612c.mo5788a(C2383n.CREATED)) {
            C3892m mVar = this.f12475a;
            return ((C3889j) new C2368bp((C2371bs) mVar, (C2363bk) new C3888i(mVar)).mo5770a(C3889j.class)).f12473a;
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }
}
