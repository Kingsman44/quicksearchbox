package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.C23744s;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.p */
/* compiled from: PG */
final class C23754p extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C23656ab f65104a;

    /* renamed from: b */
    final /* synthetic */ boolean f65105b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23754p(C23656ab abVar, boolean z) {
        super(0);
        this.f65104a = abVar;
        this.f65105b = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        ((C23674at) this.f65104a).f64761l.performHapticFeedback(6);
        this.f65104a.mo29002b(new C23744s(this.f65105b));
        return C69788q.f186170a;
    }
}
