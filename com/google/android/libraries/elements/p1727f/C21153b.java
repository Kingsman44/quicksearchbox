package com.google.android.libraries.elements.p1727f;

import android.util.Log;
import android.util.Pair;
import com.facebook.litho.C6110au;
import com.facebook.litho.LithoView;
import com.google.protos.youtube.elements.p5166b.C66070ad;
import com.google.protos.youtube.elements.p5166b.C66101f;

/* renamed from: com.google.android.libraries.elements.f.b */
/* compiled from: PG */
public final /* synthetic */ class C21153b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21160i f59337a;

    /* renamed from: b */
    public final /* synthetic */ C66070ad f59338b;

    public /* synthetic */ C21153b(C21160i iVar, C66070ad adVar) {
        this.f59337a = iVar;
        this.f59338b = adVar;
    }

    public final void run() {
        C21160i iVar = this.f59337a;
        C66070ad adVar = this.f59338b;
        iVar.f59350b.mo26202b();
        for (C66101f fVar : adVar.f179670a) {
            LithoView c = iVar.mo26175c(fVar.f179750b);
            if (c == null) {
                Log.w("ElementsDebugger", "Highlight requested for non-existing LithoView: ".concat(String.valueOf(fVar.f179750b)));
            } else {
                C6110au a = C21168q.m39747a(C6110au.m15899e(c), fVar.f179751c);
                if (a == null) {
                    Log.w("ElementsDebugger", "Highlight requested for non-existing Component: ".concat(String.valueOf(fVar.f179751c)));
                } else {
                    C21171t tVar = iVar.f59350b;
                    LithoView g = a.mo12863g();
                    if (g != null) {
                        C21170s sVar = new C21170s(a);
                        tVar.f59388a.add(Pair.create(g, sVar));
                        g.addOnAttachStateChangeListener(tVar);
                        g.getOverlay().add(sVar);
                        g.invalidate();
                    }
                }
            }
        }
    }
}
