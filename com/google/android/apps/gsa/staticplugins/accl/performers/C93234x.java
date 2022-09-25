package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.nga.api.a.bz;
import com.google.android.apps.gsa.nga.api.a.cb;
import com.google.android.apps.gsa.nga.api.a.t;
import com.google.android.apps.gsa.nga.api.a.u;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C102999b;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3899b.p3901b.C50877d;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.x */
/* compiled from: PG */
public final class C93234x extends C22538o {

    /* renamed from: a */
    private final C93233w f259993a;

    public C93234x(C93233w wVar) {
        this.f259993a = wVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("gacs_accessory.EXECUTE")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C50877d dVar = (C50877d) m41992m(dwVar, "gacs_execute_args", C50877d.f132472c.getParserForType());
            C93233w wVar = this.f259993a;
            C59104x b = C93233w.f259990a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsExecPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13064)).mo56386p("Received client op");
            if (((Boolean) ((C58833ax) wVar.f259992c.mo27525b()).mo56106b(C93232v.f259989a).mo56109e(false)).booleanValue() && ((C58833ax) wVar.f259991b.mo27525b()).mo56113h()) {
                C59104x b2 = C93233w.f259990a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "GacsExecPerformer");
                ((C59052c) ((C59052c) b2).mo56372aa(13065)).mo56386p("Send Gacs client op to NGA");
                bz createBuilder = cb.d.createBuilder();
                t createBuilder2 = u.c.createBuilder();
                createBuilder2.copyOnWrite();
                u uVar = createBuilder2.instance;
                dVar.getClass();
                uVar.b = dVar;
                uVar.a = 2;
                u build = createBuilder2.build();
                createBuilder.copyOnWrite();
                cb cbVar = createBuilder.instance;
                build.getClass();
                cbVar.b = build;
                cbVar.a = 12;
                ((C102999b) ((C58833ax) wVar.f259991b.mo27525b()).mo56107c()).mo93556a(createBuilder.build());
            }
            return C60856cj.m92900i(C22402a.f61894b);
        }
        throw new C22428d(dyVar);
    }
}
