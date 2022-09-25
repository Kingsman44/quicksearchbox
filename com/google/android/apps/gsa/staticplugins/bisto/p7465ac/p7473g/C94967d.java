package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94928z;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.g.d */
/* compiled from: PG */
public final /* synthetic */ class C94967d implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94976m f265677a;

    /* renamed from: b */
    public final /* synthetic */ C94928z f265678b;

    public /* synthetic */ C94967d(C94976m mVar, C94928z zVar) {
        this.f265677a = mVar;
        this.f265678b = zVar;
    }

    public final void run() {
        C94976m mVar = this.f265677a;
        C94928z zVar = this.f265678b;
        if (!mVar.f265696f) {
            mVar.f265696f = true;
            mVar.f265698h.set(false);
            if (zVar.mo88787a() == 1) {
                mVar.f265694d.mo89796a(zVar.mo88789c(), zVar.mo88788b());
                return;
            }
            return;
        }
        C59104x c = C94976m.f265691a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsVoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(17750)).mo56386p("Already decoding!");
    }
}
