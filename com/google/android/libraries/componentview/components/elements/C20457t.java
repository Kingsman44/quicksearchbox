package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import com.google.android.libraries.componentview.components.elements.p1696a.C20381f;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.elements.t */
/* compiled from: PG */
public class C20457t extends C20446i {
    public C20457t(Context context, C56425d dVar, C20537f fVar, Executor executor, ExecutorService executorService, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, executorService, caVar, atVar);
    }

    /* renamed from: kF */
    public final C20381f mo25384kF(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20381f.f57304g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return (C20381f) obj;
    }

    /* renamed from: kG */
    public final C56425d mo25385kG(C56425d dVar, C20381f fVar) {
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C20381f.f57304g, fVar);
        return (C56425d) cVar.build();
    }
}
