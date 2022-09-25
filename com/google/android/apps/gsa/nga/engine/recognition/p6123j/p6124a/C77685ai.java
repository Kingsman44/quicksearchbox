package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.ai */
/* compiled from: PG */
final class C77685ai implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C77687ak f213971a;

    public C77685ai(C77687ak akVar) {
        this.f213971a = akVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C77687ak.f213973a.mo56226d()).mo56382g(th)).mo56372aa(4385)).mo56389s("Audio capture session for utterance %s finished with failure", this.f213971a.f213977e.f218924a.c());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Void voidR = (Void) obj;
        C58974d dVar = C77687ak.f213973a;
        this.f213971a.f213977e.f218924a.c();
    }
}
