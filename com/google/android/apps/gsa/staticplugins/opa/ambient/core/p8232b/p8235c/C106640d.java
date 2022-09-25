package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8235c;

import com.google.assistant.p3897e.p3929l.p3930a.C52748d;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C106640d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106644h f297295a;

    public /* synthetic */ C106640d(C106644h hVar) {
        this.f297295a = hVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C106644h hVar = this.f297295a;
        if ((((C52748d) obj).f138423a & 32) != 0) {
            return true;
        }
        ((C58970a) ((C58970a) hVar.f297301c.mo56224b()).mo56372aa(23177)).mo56386p("AssistantDevice has no human friendly name.");
        return false;
    }
}
