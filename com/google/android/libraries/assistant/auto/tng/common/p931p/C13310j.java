package com.google.android.libraries.assistant.auto.tng.common.p931p;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.p.j */
/* compiled from: PG */
public final /* synthetic */ class C13310j implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13310j f41030a = new C13310j();

    private /* synthetic */ C13310j() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        C57987f fVar = new C57987f();
        if (th instanceof CancellationException) {
            fVar.f155056f.mo54589f(true);
        } else {
            ((C59052c) ((C59052c) ((C59052c) C13314n.f41034a.mo56226d()).mo56382g(th)).mo56372aa(44756)).mo56386p("asyncSource failed");
            fVar.f155056f.mo54590g(th);
        }
        return fVar;
    }
}
