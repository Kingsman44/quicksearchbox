package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.q */
/* compiled from: PG */
public final /* synthetic */ class C124769q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C124773u f344184a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f344185b;

    public /* synthetic */ C124769q(C124773u uVar, Throwable th) {
        this.f344184a = uVar;
        this.f344185b = th;
    }

    public final Object call() {
        C124773u uVar = this.f344184a;
        Throwable th = this.f344185b;
        C59104x c = C124774v.f344195a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36294)).mo56386p("Error sending S3Request");
        uVar.f344190a.mo20122b(th);
        return null;
    }
}
