package com.google.android.apps.gsa.opa.p6447h;

import android.hardware.display.DisplayManager;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.C81921a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opa.h.j */
/* compiled from: PG */
final class C83704j implements DisplayManager.DisplayListener {

    /* renamed from: a */
    final /* synthetic */ C83705k f228154a;

    public C83704j(C83705k kVar) {
        this.f228154a = kVar;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (!C81921a.m130165c(this.f228154a.f228156b)) {
            C59104x b = C83705k.f228155a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SeDisCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(6806)).mo56386p("Dflt dspl not off, dismiss");
            this.f228154a.mo77028a();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
