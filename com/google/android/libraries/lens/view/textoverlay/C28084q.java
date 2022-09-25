package com.google.android.libraries.lens.view.textoverlay;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.android.libraries.lens.common.text.selection.p2009ui.C24178s;
import com.google.android.libraries.lens.view.p2069am.C25336l;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.q */
/* compiled from: PG */
public final /* synthetic */ class C28084q implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76439a;

    public /* synthetic */ C28084q(C28093z zVar) {
        this.f76439a = zVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C28093z zVar = this.f76439a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            zVar.mo33554f();
            return;
        }
        C25336l lVar = (C25336l) axVar.mo56107c();
        C24178s sVar = zVar.f76456i;
        if (sVar != null && sVar.mo29638d()) {
            C24178s sVar2 = zVar.f76456i;
            C24146d dVar = sVar2.f66068a;
            dVar.getClass();
            if (dVar.mo29551d() == lVar.f68959a) {
                C24146d dVar2 = sVar2.f66069b;
                dVar2.getClass();
                if (dVar2.mo29551d() == lVar.f68960b) {
                    return;
                }
            }
        }
        zVar.mo33554f();
        zVar.mo33552c().post(new C28080m(zVar, lVar));
    }
}
