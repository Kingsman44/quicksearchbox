package com.google.android.libraries.search.assistant.p2828y.p2851l;

import android.content.Context;
import com.google.android.libraries.search.assistant.p2828y.p2859r.C37083k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.y.l.g */
/* compiled from: PG */
public final class C36999g {

    /* renamed from: c */
    private static final C59071e f96361c = C59071e.m91332i("com.google.android.libraries.search.assistant.y.l.g");

    /* renamed from: a */
    public final Context f96362a;

    /* renamed from: b */
    public final C37083k f96363b;

    /* renamed from: d */
    private final Executor f96364d;

    public C36999g(Context context, C37083k kVar, Executor executor) {
        this.f96362a = context;
        this.f96363b = kVar;
        this.f96364d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo40529a(C36996d dVar) {
        ((C59052c) ((C59052c) f96361c.mo56224b()).mo56372aa(52482)).mo56386p("Building Display Params");
        C51376fk fkVar = (C51376fk) C51379fn.f133814i.createBuilder();
        dVar.mo40524a().ifPresent(new C36997e(fkVar));
        C36998f fVar = new C36998f(this, fkVar, dVar);
        return C60856cj.m92904m(C47810es.m84978r(fVar), this.f96364d);
    }
}
