package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.material.tabs.C44909l;
import com.google.assistant.p3861at.C50270qw;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ai */
/* compiled from: PG */
public final /* synthetic */ class C9896ai implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9907at f33955a;

    public /* synthetic */ C9896ai(C9907at atVar) {
        this.f33955a = atVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C9907at atVar = this.f33955a;
        C50282rh rhVar = ((act) obj).f128876C;
        if (rhVar == null) {
            rhVar = C50282rh.f130762c;
        }
        if (!atVar.f33987r.equals(rhVar)) {
            C50282rh rhVar2 = atVar.f33987r;
            if (rhVar.f130765b.size() == rhVar2.f130765b.size()) {
                int i = 0;
                while (true) {
                    if (i < rhVar.f130765b.size()) {
                        if (!((C50270qw) rhVar.f130765b.get(i)).f130728a.equals(((C50270qw) rhVar2.f130765b.get(i)).f130728a)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                atVar.f33987r = rhVar;
                C9972p pVar = atVar.f33979j;
                pVar.f34153a.mo5708l(atVar.f33987r);
            }
            View view = atVar.f33972c.getView();
            if (view != null) {
                atVar.mo18110d();
                int a = atVar.f33991v.mo48401a();
                atVar.mo18108b(rhVar, view);
                C44909l b = atVar.f33991v.mo48406b(a);
                if (b != null) {
                    b.mo48441a();
                }
            }
            atVar.f33987r = rhVar;
            C9972p pVar2 = atVar.f33979j;
            pVar2.f34153a.mo5708l(atVar.f33987r);
        }
    }
}
