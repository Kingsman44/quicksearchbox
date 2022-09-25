package com.google.android.remotesearch;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.remotesearch.h */
/* compiled from: PG */
public final /* synthetic */ class C45222h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C45225k f118010a;

    /* renamed from: b */
    public final /* synthetic */ long f118011b;

    public /* synthetic */ C45222h(C45225k kVar, long j) {
        this.f118010a = kVar;
        this.f118011b = j;
    }

    public final void run() {
        C45225k kVar = this.f118010a;
        if (this.f118011b < kVar.f118016c.get()) {
            C59104x d = C45225k.f118014a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PublicSession");
            ((C59052c) ((C59052c) d).mo56372aa(54268)).mo56386p("A client event has been sent after end session. Delaying the disposing of SearchServiceClient");
            kVar.mo49085b();
            return;
        }
        kVar.f118015b.mo81934f();
    }
}
