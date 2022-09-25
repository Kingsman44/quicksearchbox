package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p838e;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.apr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.e.b */
/* compiled from: PG */
public final class C12760b extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f39912a = 0;

    /* renamed from: b */
    private final ScheduledExecutorService f39913b;

    public C12760b(ScheduledExecutorService scheduledExecutorService) {
        this.f39913b = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (!dyVar.f135936b.equals("execution.WAIT")) {
            return C60856cj.m92900i(C12788a.f39966a);
        }
        try {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            apr apr = (apr) m41992m(dwVar, "wait_args", apr.f135577d.getParserForType());
            if ((apr.f135579a & 1) == 0) {
                return C60856cj.m92900i(C12788a.m29055b(C52235kf.INVALID_ARGUMENT, "Wait time not set."));
            }
            C12759a aVar = new C12759a(apr);
            return C60856cj.m92902k(C47810es.m84965e(aVar), apr.f135580b, TimeUnit.MILLISECONDS, this.f39913b);
        } catch (C22371a | C62974ct unused) {
            return C60856cj.m92900i(C12788a.f39966a);
        }
    }
}
