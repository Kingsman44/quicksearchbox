package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.assistant.p3886c.C50693ae;
import com.google.assistant.p3886c.C50697ai;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50746bk;
import com.google.assistant.p3886c.C50760by;
import com.google.assistant.p3886c.C50761bz;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.k */
/* compiled from: PG */
public final /* synthetic */ class C117365k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117366l f325812a;

    /* renamed from: b */
    public final /* synthetic */ C83802r f325813b;

    public /* synthetic */ C117365k(C117366l lVar, C83802r rVar) {
        this.f325812a = lVar;
        this.f325813b = rVar;
    }

    public final Object apply(Object obj) {
        Object obj2;
        C117366l lVar = this.f325812a;
        C83802r rVar = this.f325813b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) lVar.f325814a.mo56226d()).mo56372aa(33096)).mo56386p("convertSmartspaceCard(): null card");
            return axVar;
        }
        C50738bc bcVar = (C50738bc) rVar.mo77094d().mo56111f();
        if (bcVar == null) {
            return axVar;
        }
        C50706ar arVar = bcVar.f132044k;
        if (arVar == null) {
            arVar = C50706ar.f131960a;
        }
        C62940bt r2 = C62942bv.checkIsLite(C50693ae.f131889h);
        arVar.mo58887l(r2);
        Object l = arVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj2 = r2.f169969b;
        } else {
            obj2 = r2.mo58889c(l);
        }
        C50693ae aeVar = (C50693ae) obj2;
        long j = aeVar.f131895e;
        C50790cn cnVar = (C50790cn) ((C50818do) axVar.mo56107c()).toBuilder();
        if ((aeVar.f131891a & 16) != 0) {
            C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
            C50731p pVar = C50731p.START_ACTIVITY;
            qVar.copyOnWrite();
            C50733r rVar2 = (C50733r) qVar.instance;
            rVar2.f132024b = pVar.f132020d;
            rVar2.f132023a |= 1;
            String str = aeVar.f131896f;
            qVar.copyOnWrite();
            C50733r rVar3 = (C50733r) qVar.instance;
            str.getClass();
            rVar3.f132023a |= 2;
            rVar3.f132025c = str;
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            C50733r rVar4 = (C50733r) qVar.build();
            rVar4.getClass();
            doVar.f132316m = rVar4;
            doVar.f132304a |= 2048;
        } else {
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132316m = null;
            doVar2.f132304a &= -2049;
        }
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        C62940bt btVar = C50761bz.f132094e;
        C50760by byVar = (C50760by) C50761bz.f132093d.createBuilder();
        C50697ai aiVar = aeVar.f131892b;
        if (aiVar == null) {
            aiVar = C50697ai.f131903b;
        }
        byVar.copyOnWrite();
        C50761bz bzVar = (C50761bz) byVar.instance;
        aiVar.getClass();
        bzVar.f132097b = aiVar;
        bzVar.f132096a |= 2;
        byVar.copyOnWrite();
        C50761bz bzVar2 = (C50761bz) byVar.instance;
        bzVar2.f132096a |= 4;
        bzVar2.f132098c = j;
        diVar.mo58885m(btVar, (C50761bz) byVar.build());
        C58833ax b = C92025g.m151033b(bcVar);
        if (b.mo56113h()) {
            diVar.mo58885m(C50746bk.f132060c, (C50746bk) b.mo56107c());
        }
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        C50813dj djVar = (C50813dj) diVar.build();
        djVar.getClass();
        doVar3.f132329z = djVar;
        doVar3.f132304a |= 33554432;
        return C58833ax.m90834k((C50818do) cnVar.build());
    }
}
