package com.google.android.libraries.elements.p1727f;

import android.util.Log;
import com.facebook.litho.LithoView;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.p5166b.C66093b;
import com.google.protos.youtube.elements.p5166b.C66101f;

/* renamed from: com.google.android.libraries.elements.f.d */
/* compiled from: PG */
public final /* synthetic */ class C21155d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21160i f59340a;

    /* renamed from: b */
    public final /* synthetic */ C66093b f59341b;

    public /* synthetic */ C21155d(C21160i iVar, C66093b bVar) {
        this.f59340a = iVar;
        this.f59341b = bVar;
    }

    public final void run() {
        C21160i iVar = this.f59340a;
        C66093b bVar = this.f59341b;
        C66101f fVar = bVar.f179726a;
        if (fVar == null) {
            fVar = C66101f.f179747d;
        }
        LithoView c = iVar.mo26175c(fVar.f179750b);
        if (c == null) {
            Log.w("ElementsDebugger", "Highlight requested for non-existing LithoView: ".concat(String.valueOf(fVar.f179750b)));
            return;
        }
        C21166o oVar = (C21166o) C21168q.m39749c(c).get(fVar.f179751c);
        if (oVar != null) {
            C66128bg bgVar = bVar.f179727b;
            if (bgVar == null) {
                bgVar = C66128bg.f179829a;
            }
            synchronized (oVar.f59370e) {
                Component component = oVar.f59367b;
                if (component != null) {
                    component.debugSetModel(bgVar.toByteArray());
                } else {
                    oVar.f59366a.mo25988lL(C21279bv.m40120d(bgVar));
                }
            }
        }
    }
}
