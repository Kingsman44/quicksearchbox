package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.nga.shared.p6349j.C81332a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1484g.p1485a.p1486a.p1487a.C17958a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51674ag;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.t */
/* compiled from: PG */
public final class C93230t extends C22538o {

    /* renamed from: d */
    public static final /* synthetic */ int f259985d = 0;

    /* renamed from: a */
    public final Optional f259986a;

    /* renamed from: b */
    public final C22871g f259987b;

    /* renamed from: c */
    public final C91142g f259988c;

    public C93230t(Optional optional, C22871g gVar, C91142g gVar2) {
        this.f259986a = optional;
        this.f259987b = gVar;
        this.f259988c = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Object obj;
        if (this.f259986a.isEmpty()) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.FAILED_PRECONDITION, "No direct action sender."));
        }
        C62921ba baVar = new C62921ba();
        baVar.mo58832e(C48775a.f126211c);
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C63010eb parserForType = C51674ag.f135026a.getParserForType();
        for (C52232kc kcVar : dwVar.f135932a) {
            if ("app_control_args".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                C51674ag agVar = (C51674ag) ((MessageLite) parserForType.mo59011j(kaVar.f137061c, baVar));
                C62940bt r6 = C62942bv.checkIsLite(C48775a.f126211c);
                agVar.mo58887l(r6);
                if (!agVar.f169962ag.mo58857o(r6.f169971d)) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No fulfillment request."));
                }
                C62940bt r62 = C62942bv.checkIsLite(C48775a.f126211c);
                agVar.mo58887l(r62);
                Object l = agVar.f169962ag.mo58854l(r62.f169971d);
                if (l == null) {
                    obj = r62.f169969b;
                } else {
                    obj = r62.mo58889c(l);
                }
                C22871g gVar = this.f259987b;
                return gVar.mo28205e(gVar.mo28210j(((C81332a) this.f259986a.get()).mo75000b(C18100a.m35256b(new C17958a(), (C52846w) obj), Optional.m71637of(C37182a.f97941dN), Optional.m71637of(C37182a.f98035fB)), "sendDirectAction", new C93227q(this)), "direct action execution failed", Exception.class, C93228r.f259983a);
            }
        }
        throw new C22371a("app_control_args");
    }
}
