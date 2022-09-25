package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.g */
/* compiled from: PG */
final class C114024g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C58833ax f315674a;

    /* renamed from: b */
    final /* synthetic */ Activity f315675b;

    /* renamed from: c */
    final /* synthetic */ Runnable f315676c;

    /* renamed from: d */
    final /* synthetic */ C91097g f315677d;

    public C114024g(C58833ax axVar, Activity activity, Runnable runnable, C91097g gVar) {
        this.f315674a = axVar;
        this.f315675b = activity;
        this.f315676c = runnable;
        this.f315677d = gVar;
    }

    public final void onClick(View view) {
        if (this.f315674a.mo56113h()) {
            boolean isDeviceLocked = ((C106171l) this.f315674a.mo56107c()).f296304b.f230023b.isDeviceLocked();
            C58976aa aaVar = C58975e.f156826a;
            if (isDeviceLocked) {
                ((C106171l) this.f315674a.mo56107c()).mo95343g(1, this.f315675b, new C114033p((C106171l) this.f315674a.mo56107c(), this.f315676c), this.f315677d);
                return;
            }
        }
        this.f315676c.run();
    }
}
