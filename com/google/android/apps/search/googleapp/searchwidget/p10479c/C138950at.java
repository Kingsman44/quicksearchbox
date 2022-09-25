package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p337aa.C6619f;
import com.google.protobuf.C62910ar;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.at */
/* compiled from: PG */
public final /* synthetic */ class C138950at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377903a;

    /* renamed from: b */
    public final /* synthetic */ C6619f f377904b;

    public /* synthetic */ C138950at(C138963bf bfVar, C6619f fVar) {
        this.f377903a = bfVar;
        this.f377904b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C138963bf bfVar = this.f377903a;
        C6619f fVar = this.f377904b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60866ct.f164955a;
        }
        C62910ar arVar = (C62910ar) optional.get();
        ((C59052c) ((C59052c) C138963bf.f377919a.mo56224b()).mo56372aa(41335)).mo56386p("#scheduleDoodleDownload::schedule");
        ((C59052c) ((C59052c) C138963bf.f377919a.mo56224b()).mo56372aa(41336)).mo56389s("#scheduleDoodleDownload, workDelay: %s", arVar);
        C60870cx b = bfVar.f377927i.f377963f.mo50546b(C138977i.m225787a(arVar));
        C60931s f = C47810es.m84966f(new C138953aw(bfVar, fVar));
        return C60922j.m93045h(b, C47810es.m84966f(f), bfVar.f377926h);
    }
}
