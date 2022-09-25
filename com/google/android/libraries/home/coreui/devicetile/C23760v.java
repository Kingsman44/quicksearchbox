package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.C23730e;
import com.google.android.libraries.home.coreui.devicetile.model.C23731f;
import com.google.android.libraries.home.coreui.devicetile.model.C23749x;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.v */
/* compiled from: PG */
final class C23760v extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C23656ab f65120a;

    /* renamed from: b */
    final /* synthetic */ boolean f65121b;

    /* renamed from: c */
    final /* synthetic */ String f65122c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23760v(C23656ab abVar, boolean z, String str) {
        super(0);
        this.f65120a = abVar;
        this.f65121b = z;
        this.f65122c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        ((C23674at) this.f65120a).f64761l.performHapticFeedback(6);
        if (this.f65121b) {
            this.f65120a.mo29002b(C23749x.f65098a);
        } else {
            this.f65120a.mo29002b(new C23731f(this.f65122c, (C23730e) null));
        }
        return C69788q.f186170a;
    }
}
