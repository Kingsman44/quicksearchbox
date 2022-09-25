package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.s3.b */
/* compiled from: PG */
final class C84284b extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C84286d f229362a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84284b(C84286d dVar) {
        super("FakeNetRecognitionRnr", 1, 0);
        this.f229362a = dVar;
    }

    public final void run() {
        C84286d dVar = this.f229362a;
        C90476a aVar = C91018d.f254254a;
        try {
            dVar.f229366c.mo87118a().mo20440jJ(new C84285c(dVar));
        } catch (C90523o e) {
            C59104x d = C84286d.f229364a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FakeNetRecognitionRnr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7147)).mo56386p("Unexpected NetworkRecognizeException.");
            int i = C90755l.f253831a;
        }
    }
}
