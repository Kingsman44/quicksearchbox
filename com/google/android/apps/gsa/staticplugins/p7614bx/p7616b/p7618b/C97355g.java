package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97319ad;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97322ag;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97324b;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.b.g */
/* compiled from: PG */
public final class C97355g implements C23113i {

    /* renamed from: a */
    private final C97353e f271883a;

    public C97355g(C97353e eVar) {
        this.f271883a = eVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ParticleDiscTooltipEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onClick")) {
                C97353e eVar = this.f271883a;
                C58976aa aaVar = C58975e.f156826a;
                Set<C97319ad> set = ((C97322ag) eVar).f271846c;
                if (set != null) {
                    for (C97319ad a : set) {
                        a.mo90641a();
                    }
                }
            } else if (str.equals("onDismissRequested")) {
                C97353e eVar2 = this.f271883a;
                C58976aa aaVar2 = C58975e.f156826a;
                ((C97322ag) eVar2).f271845b.mo80998a();
            } else if (str.equals("onFailedToShow")) {
                C97353e eVar3 = this.f271883a;
                C58976aa aaVar3 = C58975e.f156826a;
                ((C97322ag) eVar3).f271845b.mo80998a();
            } else if (str.equals("onShow")) {
                C97353e eVar4 = this.f271883a;
                C58976aa aaVar4 = C58975e.f156826a;
                C97322ag agVar = (C97322ag) eVar4;
                ((C97324b) agVar.f271844a).f271848b.mo28730f(true, false);
                Set<C97319ad> set2 = agVar.f271846c;
                if (set2 != null) {
                    for (C97319ad c : set2) {
                        c.mo90643c();
                    }
                }
            }
        }
    }
}
