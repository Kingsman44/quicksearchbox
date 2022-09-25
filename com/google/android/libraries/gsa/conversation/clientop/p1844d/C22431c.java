package com.google.android.libraries.gsa.conversation.clientop.p1844d;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.apr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.d.c */
/* compiled from: PG */
public final class C22431c extends C22538o {

    /* renamed from: a */
    private final C22430b f61949a;

    public C22431c(C22430b bVar) {
        this.f61949a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("execution.WAIT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            apr apr = (apr) m41992m(dwVar, "wait_args", apr.f135577d.getParserForType());
            C22430b bVar = this.f61949a;
            if ((apr.f135579a & 1) != 0) {
                return C60856cj.m92902k(C47810es.m84965e(new C22429a(apr)), apr.f135580b, TimeUnit.MILLISECONDS, bVar.f61948a);
            }
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Wait time not set."));
        }
        throw new C22428d(dyVar);
    }
}
