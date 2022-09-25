package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.apr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.cm */
/* compiled from: PG */
public final class C35948cm implements C35472h {

    /* renamed from: a */
    private final C60888db f94122a;

    public C35948cm(C60888db dbVar) {
        this.f94122a = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (dyVar.f135936b.equals("execution.WAIT")) {
            apr apr = (apr) C36183e.m64584b(dyVar, "wait_args", apr.f135577d.getParserForType());
            if ((apr.f135579a & 1) != 0) {
                return C60856cj.m92902k(C47810es.m84965e(new C35947cl(apr)), apr.f135580b, TimeUnit.MILLISECONDS, this.f94122a);
            }
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Wait time not set."));
        }
        throw new C35471g(String.format("ClientOp is incorrect. Expected %1$s but instead got %2$s", new Object[]{"execution.WAIT", dyVar.f135936b}));
    }
}
