package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.ace;
import com.google.assistant.p3897e.p3921j.acg;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.w */
/* compiled from: PG */
public final class C93184w extends C22538o {

    /* renamed from: b */
    public static final /* synthetic */ int f259887b = 0;

    /* renamed from: c */
    private static final C59071e f259888c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.h.w");

    /* renamed from: a */
    public final C58833ax f259889a;

    /* renamed from: d */
    private final C86124t f259890d;

    /* renamed from: e */
    private final C86034c f259891e;

    public C93184w(C86124t tVar, C58833ax axVar, C86034c cVar) {
        this.f259890d = tVar;
        this.f259889a = axVar;
        this.f259891e = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C59071e eVar2 = f259888c;
        C59104x b = eVar2.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NotifMarkDiscReadPerf");
        ((C59052c) ((C59052c) b).mo56372aa(13382)).mo56386p("#perform");
        if (!dyVar.f135936b.equals("notification.MARK_DISCLAIMER_READ")) {
            throw new C22428d(dyVar);
        } else if (!this.f259890d.mo79746e(C90086ek.f250252D)) {
            C59104x d = eVar2.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifMarkDiscReadPerf");
            ((C59052c) ((C59052c) d).mo56372aa(13385)).mo56386p("#perform: received clientOp when can't handle");
            throw new C22428d(dyVar);
        } else if (this.f259889a.mo56113h()) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            acg acg = (acg) m41992m(dwVar, "mark_disclaimer_read_args", acg.f134804c.getParserForType());
            if ((acg.f134806a & 1) != 0) {
                ace ace = acg.f134807b;
                if (ace == null) {
                    ace = ace.f134800b;
                }
                if (ace.f134802a) {
                    return C60922j.m93044g(C60838bs.m92859i(C60922j.m93045h(C60838bs.m92859i(this.f259891e.mo79697b()), new C93182u(this), C60826bg.f164896a)), C93183v.f259886a, C60826bg.f164896a);
                }
                return C60856cj.m92900i(C22402a.f61894b);
            }
            throw new C22534k();
        } else {
            C59104x d2 = eVar2.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotifMarkDiscReadPerf");
            ((C59052c) ((C59052c) d2).mo56372aa(13384)).mo56386p("#perform: received clientOp when can't access data");
            throw new C22428d(dyVar);
        }
    }
}
