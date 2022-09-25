package com.google.android.libraries.search.assistant.invocation.utils;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p3186j$.util.function.BiFunction;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.libraries.search.assistant.invocation.utils.f */
/* compiled from: PG */
public final class C34722f {

    /* renamed from: a */
    public static final C59071e f92148a = C59071e.m91332i("com.google.android.libraries.search.assistant.invocation.utils.f");

    /* renamed from: a */
    public static C70761fa m63458a(Throwable th, String str) {
        C70761fa faVar;
        String concat = "Failure from ".concat(String.valueOf(str));
        if (th instanceof TimeoutException) {
            faVar = new C70761fa(Status.f186907e.mo61678e(th).mo61677b(concat), (C70334de) null, true);
        } else if (th instanceof C34820a) {
            faVar = new C70761fa(Status.m102100d(th).mo61677b(concat), C34829c.m63592a(((C34820a) th).mo23265a()), true);
        } else {
            faVar = new C70761fa(Status.m102100d(th).mo61677b(concat), (C70334de) null, true);
        }
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) f92148a.mo56226d()).mo56382g(faVar)).mo56372aa(51427)).mo56389s("Failure from %s", str);
        }
        return faVar;
    }

    /* renamed from: b */
    public static void m63459b(C60870cx cxVar, C70862aj ajVar, BiFunction biFunction, String str, Executor executor) {
        ((C70883v) ajVar).mo62583d(new C34720d(cxVar));
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C34721e(biFunction, C70148al.m102135m(), ajVar, str)), executor);
    }
}
