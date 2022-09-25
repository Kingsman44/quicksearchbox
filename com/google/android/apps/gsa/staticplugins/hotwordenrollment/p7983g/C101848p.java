package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.p */
/* compiled from: PG */
final class C101848p extends C90888av {

    /* renamed from: a */
    final /* synthetic */ int f284084a;

    /* renamed from: b */
    final /* synthetic */ C101849q f284085b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101848p(C101849q qVar, int i) {
        super("Retry hotword model check", 1, 4);
        this.f284085b = qVar;
        this.f284084a = i;
    }

    public final void run() {
        if (!(this.f284085b.f257139b.value instanceof C60873d.C60875b)) {
            this.f284085b.mo92623c(this.f284084a + 1);
            return;
        }
        C59104x d = C101849q.f284086c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) d).mo56372aa(20648)).mo56386p("#checkHotwordModelPresent cancelled.");
        this.f284085b.f284087d.mo83702b(C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_CANCELLED);
        this.f284085b.f284088e = false;
    }
}
