package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83796l;
import com.google.android.apps.gsa.opa.smartspace.C83797m;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.ay */
/* compiled from: PG */
public final /* synthetic */ class C110753ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ C110766bk f308577a;

    public /* synthetic */ C110753ay(C110766bk bkVar) {
        this.f308577a = bkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C110766bk bkVar = this.f308577a;
        C50738bc bcVar = (C50738bc) obj;
        C83797m mVar = bkVar.f308634a;
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        if (!mVar.f228404b.containsKey(a)) {
            C59104x d = C83797m.f228403a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ControllerRegistry");
            ((C59052c) ((C59052c) d).mo56372aa(6846)).mo56387q("candidate producer of  type: %d is not defined", a.f131953N);
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k((C83796l) ((C69464a) mVar.f228404b.get(a)).mo17428b());
        }
        if (!axVar.mo56113h()) {
            return bkVar.f308635b.mo77189a(bcVar);
        }
        return ((C83796l) axVar.mo56107c()).mo77189a(bcVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
