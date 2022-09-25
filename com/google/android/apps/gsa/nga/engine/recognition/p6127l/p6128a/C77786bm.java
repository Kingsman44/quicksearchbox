package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4541l.C59337t;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C77786bm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77787bn f214278a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f214279b;

    public /* synthetic */ C77786bm(C77787bn bnVar, InputStream inputStream) {
        this.f214278a = bnVar;
        this.f214279b = inputStream;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C77787bn bnVar = this.f214278a;
        InputStream inputStream = this.f214279b;
        Exception exc = (Exception) obj;
        if (exc instanceof C37901c) {
            bnVar.f214287h.mo72793h(C77889u.SODA, bnVar.f214282c.mo72690m());
        }
        if (!(exc instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C77787bn.f214280a.mo56226d()).mo56382g(exc)).mo56372aa(4468)).mo56386p("Soda capture finished with failure");
            bnVar.f214287h.mo72795j(13);
        }
        C59337t.m92221a(inputStream);
        bnVar.mo72824a();
    }
}
