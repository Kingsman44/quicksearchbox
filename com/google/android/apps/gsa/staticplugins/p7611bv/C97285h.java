package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C89963ab;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Callable;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.h */
/* compiled from: PG */
final class C97285h implements Callable {

    /* renamed from: a */
    final /* synthetic */ C97290m f271700a;

    /* renamed from: b */
    private final C118522by f271701b;

    public C97285h(C97290m mVar, C118522by byVar) {
        this.f271700a = mVar;
        this.f271701b = byVar;
    }

    /* renamed from: a */
    public final C60870cx call() {
        if (!this.f271700a.f271710d.mo79746e(C89963ab.f246487d)) {
            C59104x c = C97290m.f271708b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "mdh-background-task");
            ((C59052c) ((C59052c) c).mo56372aa(20918)).mo56387q("Background task %s experienced a dry run.", this.f271701b.f329106cj);
            return C118826c.f331423b;
        }
        try {
            List<String> list = (List) C97290m.f271707a.get(this.f271701b);
            list.getClass();
            C60870cx cxVar = C118826c.f331423b;
            for (String fVar : list) {
                cxVar = C60922j.m93045h(cxVar, new C97283f(this, fVar), C60826bg.f164896a);
            }
            if (this.f271700a.f271710d.mo79746e(C89995ba.f246764l)) {
                return C118826c.m197213c(cxVar);
            }
            return C60846c.m92878g(C118826c.m197213c(cxVar), C70761fa.class, C97284g.f271699a, C60826bg.f164896a);
        } catch (C70761fa e) {
            return C60856cj.m92900i(C97290m.m160990a(e));
        }
    }
}
