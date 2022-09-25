package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2087ay.C25624ag;
import com.google.android.libraries.lens.view.session.C27793m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.gleam.ct */
/* compiled from: PG */
public final /* synthetic */ class C26515ct implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72256a;

    /* renamed from: b */
    public final /* synthetic */ long f72257b;

    /* renamed from: c */
    public final /* synthetic */ boolean f72258c;

    public /* synthetic */ C26515ct(C26526dd ddVar, long j, boolean z) {
        this.f72256a = ddVar;
        this.f72257b = j;
        this.f72258c = z;
    }

    public final void run() {
        C26526dd ddVar = this.f72256a;
        long j = this.f72257b;
        boolean z = this.f72258c;
        C25624ag agVar = ddVar.f72297g;
        boolean z2 = false;
        agVar.f69704g.compareAndSet(false, true);
        boolean z3 = agVar.f69706i;
        C58485gu f = agVar.f69703f.mo30772f();
        int size = f.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C26504ci ciVar = (C26504ci) f.get(i);
            if (ciVar.mo31760d() == C25349y.PRE_GLEAM && ciVar.mo31758b() <= 2000) {
                z2 = true;
                break;
            }
            i++;
        }
        agVar.f69706i = z2;
        if (!z2 && z3 && !agVar.mo30740k()) {
            agVar.f69705h = agVar.f69701d.mo26871c();
        }
        agVar.mo30739j();
        C27793m mVar = ddVar.f72306p;
        if (mVar != null && !z && j == ddVar.f72296f.f69801q) {
            ddVar.f72316z.mo32194i(mVar.mo33235a(), C58833ax.m90834k(mVar));
            ddVar.f72306p = null;
        }
    }
}
