package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p836c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.p1007i.C13635a;
import com.google.android.libraries.assistant.p1484g.p1485a.p1486a.p1487a.C17958a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51674ag;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.c.d */
/* compiled from: PG */
public final class C12757d extends C22538o {

    /* renamed from: b */
    public static final /* synthetic */ int f39906b = 0;

    /* renamed from: a */
    public final C13635a f39907a;

    /* renamed from: c */
    private final Executor f39908c;

    public C12757d(C13635a aVar, Executor executor) {
        this.f39907a = aVar;
        this.f39908c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Object obj;
        if (!dyVar.f135936b.equals("device.EXECUTE_APP_CONTROL")) {
            return C60856cj.m92900i(C12788a.m29055b(C52235kf.INVALID_ARGUMENT, "Unexpected op."));
        }
        try {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51674ag agVar = (C51674ag) m41992m(dwVar, "app_control_args", C51674ag.f135026a.getParserForType());
            C62940bt r4 = C62942bv.checkIsLite(C48775a.f126211c);
            agVar.mo58887l(r4);
            if (!agVar.f169962ag.mo58857o(r4.f169971d)) {
                return C60856cj.m92900i(C12788a.m29055b(C52235kf.INVALID_ARGUMENT, "No fulfillment request."));
            }
            C17958a aVar = new C17958a();
            C62940bt r0 = C62942bv.checkIsLite(C48775a.f126211c);
            agVar.mo58887l(r0);
            Object l = agVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C18100a b = C18100a.m35256b(aVar, (C52846w) obj);
            C60870cx a = this.f39907a.mo20096a(false);
            C12754a aVar2 = new C12754a(this, b);
            C60870cx h = C60922j.m93045h(a, C47810es.m84966f(aVar2), this.f39908c);
            C12755b bVar = new C12755b(b);
            return C60922j.m93044g(h, C47810es.m84963c(bVar), this.f39908c);
        } catch (C22371a | C62974ct unused) {
            return C60856cj.m92900i(C12788a.m29055b(C52235kf.INVALID_ARGUMENT, "Failed to get app control args."));
        }
    }
}
