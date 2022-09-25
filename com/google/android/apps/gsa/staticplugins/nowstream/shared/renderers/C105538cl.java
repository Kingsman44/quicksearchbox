package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.support.p033v7.widget.C0653fo;
import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105721ad;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105741t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cl */
/* compiled from: PG */
final class C105538cl implements C91826c {

    /* renamed from: a */
    public int f294431a = 500;

    /* renamed from: b */
    final /* synthetic */ C105539cm f294432b;

    /* renamed from: c */
    private int f294433c = 0;

    public C105538cl(C105539cm cmVar) {
        this.f294432b = cmVar;
    }

    /* renamed from: a */
    public final void mo94874a() {
        if (!this.f294432b.f294436c.mo86295v()) {
            C59104x d = C105539cm.f294434a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(22352)).mo56386p("maybeRequestNextPage returning early because proxy not connected");
            return;
        }
        C105721ad adVar = this.f294432b.f294440g;
        if (adVar != null) {
            C105741t tVar = adVar.f295016q;
            C0653fo o = tVar.f295102b.mo86290o();
            long a = tVar.mo95027a(o, 0, o.getChildCount());
            C105741t tVar2 = adVar.f295016q;
            C0653fo o2 = tVar2.f295102b.mo86290o();
            long a2 = tVar2.mo95027a(o2, o2.getChildCount() - 1, -1);
            C58976aa aaVar = C58975e.f156826a;
            if (a != 0 && a2 != 0) {
                this.f294432b.f294437d.mo94689t(a, a2);
            }
        }
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        if (this.f294432b.f63126Q.mo28316z() && str.equals(this.f294432b.f294436c.mo86291p())) {
            int i3 = this.f294433c + i2;
            this.f294433c = i3;
            if (Math.abs(i3) > this.f294431a) {
                mo94874a();
                this.f294433c = 0;
            }
        }
    }

    /* renamed from: h */
    public final void mo86307h(View view, String str, int i) {
        if (this.f294432b.f63126Q.mo28316z() && str.equals(this.f294432b.f294436c.mo86291p())) {
            C58976aa aaVar = C58975e.f156826a;
            if (i != 1 && this.f294433c != 0) {
                mo94874a();
                if (i == 0) {
                    this.f294433c = 0;
                }
            }
        }
    }
}
