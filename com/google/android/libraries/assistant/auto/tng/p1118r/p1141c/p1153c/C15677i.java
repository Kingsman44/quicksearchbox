package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c;

import com.google.android.libraries.assistant.auto.tng.gmm.p990b.C13575a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16884b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.c.i */
/* compiled from: PG */
public final class C15677i {

    /* renamed from: a */
    public static final C59071e f46801a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.c.i");

    /* renamed from: b */
    public final Executor f46802b;

    /* renamed from: c */
    public final C16884b f46803c;

    /* renamed from: d */
    private final C58833ax f46804d;

    public C15677i(C58833ax axVar, Executor executor, C16884b bVar) {
        this.f46804d = axVar;
        this.f46802b = executor;
        this.f46803c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo22502a(String str) {
        ((C59052c) ((C59052c) f46801a.mo56224b()).mo56372aa(46251)).mo56389s("Send destination %s to Gmm Offroad Search API.", str);
        if (!this.f46804d.mo56113h()) {
            return C60856cj.m92900i(false);
        }
        C60870cx b = ((C13575a) this.f46804d.mo56107c()).mo21173b(str);
        C15676h hVar = C15676h.f46800a;
        return C60922j.m93044g(b, C47810es.m84963c(hVar), this.f46802b);
    }
}
