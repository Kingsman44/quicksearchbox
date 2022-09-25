package com.google.android.apps.search.assistant.verticals.p9880a.p9891g;

import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130353c;
import com.google.android.libraries.assistant.p1484g.p1485a.p1486a.p1487a.C17958a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33885c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51674ag;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.g.c */
/* compiled from: PG */
public final class C130394c implements C35472h {

    /* renamed from: a */
    public static final C59071e f357331a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.a.g.c");

    /* renamed from: b */
    public final Executor f357332b;

    /* renamed from: c */
    public final C33885c f357333c;

    /* renamed from: d */
    public final C130353c f357334d;

    /* renamed from: e */
    private final C34053bp f357335e;

    public C130394c(C33885c cVar, C130353c cVar2, C34053bp bpVar, Executor executor) {
        this.f357333c = cVar;
        this.f357334d = cVar2;
        this.f357335e = bpVar;
        this.f357332b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        Object obj;
        ((C59052c) ((C59052c) f357331a.mo56224b()).mo56372aa(39425)).mo56386p("performing device.EXECUTE_APP_CONTROL ClientOp");
        C36183e.m64586d(dyVar, "device.EXECUTE_APP_CONTROL");
        try {
            C51674ag agVar = (C51674ag) C36183e.m64585c(dyVar, "app_control_args", C51674ag.f135026a.getParserForType()).get();
            C62940bt r0 = C62942bv.checkIsLite(C48775a.f126211c);
            agVar.mo58887l(r0);
            if (!agVar.f169962ag.mo58857o(r0.f169971d)) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "No fulfillment request."));
            }
            C62940bt r02 = C62942bv.checkIsLite(C48775a.f126211c);
            agVar.mo58887l(r02);
            Object l = agVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C18100a b = C18100a.m35256b(new C17958a(), (C52846w) obj);
            C60870cx c = this.f357334d.mo106973c(this.f357335e);
            C130392a aVar = new C130392a(this, b);
            return C60922j.m93045h(c, C47810es.m84966f(aVar), this.f357332b);
        } catch (C62974ct | NoSuchElementException unused) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Failed to get app control args."));
        }
    }
}
