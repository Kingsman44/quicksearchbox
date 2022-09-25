package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.g.f */
/* compiled from: PG */
public final /* synthetic */ class C94969f implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94976m f265680a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f265681b;

    public /* synthetic */ C94969f(C94976m mVar, byte[] bArr) {
        this.f265680a = mVar;
        this.f265681b = bArr;
    }

    public final void run() {
        C94976m mVar = this.f265680a;
        byte[] bArr = this.f265681b;
        if (!mVar.f265696f) {
            C59104x c = C94976m.f265691a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsVoiceInputManager");
            ((C59052c) ((C59052c) c).mo56372aa(17749)).mo56386p("Unexpected audio data");
            mVar.mo88884e(C48098ce.UNEXPECTED_AUDIO);
        } else if (mVar.f265698h.get()) {
            C59104x b = C94976m.f265691a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsVoiceInputManager");
            ((C59052c) ((C59052c) b).mo56372aa(17748)).mo56386p("Ignore audio data");
        } else {
            if (mVar.f265696f) {
                bArr = mVar.f265694d.mo89798c(bArr);
            }
            C37336c cVar = mVar.f265699i;
            if (cVar != null && bArr != null) {
                ((C37334a) cVar).f99173a.mo40890b(bArr.length, bArr);
            }
        }
    }
}
