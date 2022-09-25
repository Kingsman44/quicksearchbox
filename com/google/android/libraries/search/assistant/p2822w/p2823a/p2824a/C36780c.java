package com.google.android.libraries.search.assistant.p2822w.p2823a.p2824a;

import com.google.android.libraries.search.assistant.p2822w.p2823a.C36781b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5030q.C65267ht;
import com.google.protos.p4985f.p5030q.C65283ii;
import com.google.protos.p4985f.p5030q.C65287im;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.w.a.a.c */
/* compiled from: PG */
public final class C36780c implements C65267ht {

    /* renamed from: a */
    public static final /* synthetic */ int f95843a = 0;

    /* renamed from: c */
    private final Executor f95844c;

    /* renamed from: d */
    private final Map f95845d;

    public C36780c(Executor executor, Map map) {
        this.f95844c = executor;
        this.f95845d = map;
    }

    /* renamed from: a */
    public final C60870cx mo40392a(C65283ii iiVar) {
        if (this.f95845d.containsKey(C65753ak.PORTABLE_PROVIDER)) {
            return C60922j.m93045h(((C36781b) this.f95845d.get(C65753ak.PORTABLE_PROVIDER)).mo40394a(), C47810es.m84966f(new C36779b(iiVar)), this.f95844c);
        }
        return C60856cj.m92899h(new Exception("Attempting to access non-existent PORTABLE_PROVIDER corpus"));
    }

    /* renamed from: b */
    public final C60870cx mo40393b(C65287im imVar) {
        if (this.f95845d.containsKey(C65753ak.PORTABLE_PROVIDER)) {
            return C60922j.m93045h(((C36781b) this.f95845d.get(C65753ak.PORTABLE_PROVIDER)).mo40394a(), C47810es.m84966f(new C36778a(imVar)), this.f95844c);
        }
        return C60856cj.m92899h(new Exception("Attempting to access non-existent PORTABLE_PROVIDER corpus"));
    }
}
