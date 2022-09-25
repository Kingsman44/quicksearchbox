package com.google.android.apps.gsa.staticplugins.opa.morris2.p8382d;

import androidx.lifecycle.C2383n;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.android.concurrent.C58301z;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.d.e */
/* compiled from: PG */
public final /* synthetic */ class C109496e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109500i f304960a;

    /* renamed from: b */
    public final /* synthetic */ C14499lm f304961b;

    /* renamed from: c */
    public final /* synthetic */ int f304962c;

    public /* synthetic */ C109496e(C109500i iVar, int i, C14499lm lmVar) {
        this.f304960a = iVar;
        this.f304962c = i;
        this.f304961b = lmVar;
    }

    public final void run() {
        C109500i iVar = this.f304960a;
        int i = this.f304962c;
        C14499lm lmVar = this.f304961b;
        if (iVar.f304978m.f6612c == C2383n.CREATED && i == 1) {
            C58976aa aaVar = C58975e.f156826a;
            iVar.f304975j.mo21424b(C37182a.f97950dW.mo40813g());
            iVar.f304967b.mo21876h(iVar);
            iVar.f304978m.mo5794f(C2383n.STARTED);
            iVar.f304970e.mo21571c();
            iVar.f304975j.mo21424b(C37182a.f97951dX.mo40813g());
            iVar.f304978m.mo5794f(C2383n.RESUMED);
            if (iVar.f304983r == null) {
                iVar.f304982q = C58869cf.m90936b(new C58903m(',')).mo56155i(iVar.f304971f.mo79758x(C90051dc.f248905cg));
                iVar.f304983r = C58301z.m89281a(iVar.f304980o, iVar.f304971f.mo79743a(C90051dc.f248805aM), iVar.f304971f.mo79743a(C90051dc.f248806aN), TimeUnit.MILLISECONDS, iVar.f304973h, iVar.f304979n);
            }
            i = 1;
        }
        if (iVar.mo97863h() && i == 5) {
            iVar.mo97868j();
        }
        iVar.f304969d.mo98013a(lmVar, true);
        iVar.f304968c.mo21976d(lmVar, true);
        if (i == 5) {
            iVar.f304970e.mo21572d();
        }
    }
}
