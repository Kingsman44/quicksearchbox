package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.assistant.p4008y.p4009a.C53597f;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62974ct;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.oa */
/* compiled from: PG */
public final /* synthetic */ class C109755oa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109759oe f305799a;

    /* renamed from: b */
    public final /* synthetic */ C109258hw f305800b;

    public /* synthetic */ C109755oa(C109759oe oeVar, C109258hw hwVar) {
        this.f305799a = oeVar;
        this.f305800b = hwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52003hb hbVar;
        C109759oe oeVar = this.f305799a;
        C109258hw hwVar = this.f305800b;
        C53597f fVar = (C53597f) obj;
        boolean z = false;
        boolean z2 = true;
        if (fVar.f140677a == 1 && !((C52003hb) fVar.f140678b).f136479b.isEmpty()) {
            C108262cf cfVar = new C108262cf(false);
            if (fVar.f140677a == 1) {
                hbVar = (C52003hb) fVar.f140678b;
            } else {
                hbVar = C52003hb.f136476i;
            }
            cfVar.f301174d = hbVar.f136479b;
            oeVar.f305810b.mo95430s(cfVar);
            z = true;
        }
        if (fVar.f140677a == 2) {
            try {
                hwVar.mo97726s((C51965fr) fVar.f140678b, C58836b.f156633a, 73093);
            } catch (C90452a | C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C109759oe.f305809a.mo56225c()).mo56382g(e)).mo56372aa(23011)).mo56386p("ChalkboardPrefetchResponse contains invalid CardArgs");
            }
            return Boolean.valueOf(z2);
        }
        z2 = z;
        return Boolean.valueOf(z2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
