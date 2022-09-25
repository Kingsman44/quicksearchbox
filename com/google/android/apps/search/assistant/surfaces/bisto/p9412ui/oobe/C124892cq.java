package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.p10712d.C142324bc;
import com.google.apps.tiktok.dataservice.local.C46854h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cq */
/* compiled from: PG */
public final /* synthetic */ class C124892cq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124894cs f344594a;

    public /* synthetic */ C124892cq(C124894cs csVar) {
        this.f344594a = csVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void accept(Object obj) {
        C124894cs csVar = this.f344594a;
        C142324bc bcVar = (C142324bc) obj;
        csVar.f344606k = bcVar;
        if (bcVar.f386131q) {
            int i = csVar.f344609n;
            if (i == 0) {
                throw null;
            } else if (i != 2) {
                if (!csVar.f344607l) {
                    C46854h hVar = csVar.f344605j;
                    hVar.getClass();
                    hVar.mo50866a(csVar);
                    return;
                }
                return;
            }
        }
        csVar.mo106710c();
    }
}
