package com.google.android.libraries.assistant.auto.tng.common.p931p;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.p.h */
/* compiled from: PG */
public final class C13308h implements C57981b {

    /* renamed from: a */
    public static final C59071e f41025a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.p.h");

    /* renamed from: b */
    public final C58485gu f41026b;

    /* renamed from: c */
    public final Executor f41027c;

    /* renamed from: d */
    public final Executor f41028d;

    public C13308h(C58485gu guVar, Executor executor) {
        this.f41026b = guVar;
        this.f41027c = new C60904dr(executor);
        this.f41028d = executor;
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C13307g gVar = new C13307g(this, aVar);
        C13301a aVar2 = new C13301a(gVar);
        return C60856cj.m92905n(C47810es.m84965e(aVar2), gVar.f41024d.f41027c);
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        C58485gu guVar = this.f41026b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C57981b) guVar.get(i)).mo20388jK();
        }
    }
}
