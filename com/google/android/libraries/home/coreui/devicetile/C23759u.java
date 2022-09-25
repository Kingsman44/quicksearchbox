package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.C23728c;
import com.google.android.libraries.home.coreui.devicetile.model.C23730e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.u */
/* compiled from: PG */
final class C23759u extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C23656ab f65117a;

    /* renamed from: b */
    final /* synthetic */ String f65118b;

    /* renamed from: c */
    final /* synthetic */ boolean f65119c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23759u(C23656ab abVar, String str, boolean z) {
        super(0);
        this.f65117a = abVar;
        this.f65118b = str;
        this.f65119c = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        ((C23674at) this.f65117a).f64761l.performHapticFeedback(6);
        this.f65117a.mo29002b(new C23728c(this.f65118b, !this.f65119c, (C23730e) null));
        return C69788q.f186170a;
    }
}
