package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110121g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8630d.C114715a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.b */
/* compiled from: PG */
public final /* synthetic */ class C114996b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115050d f319169a;

    public /* synthetic */ C114996b(C115050d dVar) {
        this.f319169a = dVar;
    }

    public final void onClick(View view) {
        C115050d dVar = this.f319169a;
        if (dVar.f319372i.mo56113h()) {
            Iterator it = ((C114715a) dVar.f319372i.mo56107c()).f318324a.f306812b.f306850h.iterator();
            while (it.hasNext()) {
                C110121g gVar = (C110121g) ((WeakReference) it.next()).get();
                if (gVar == null) {
                    it.remove();
                } else {
                    gVar.mo98326b();
                }
            }
        }
    }
}
