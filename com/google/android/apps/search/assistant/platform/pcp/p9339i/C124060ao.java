package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ao */
/* compiled from: PG */
public final /* synthetic */ class C124060ao implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C124060ao f342653a = new C124060ao();

    private /* synthetic */ C124060ao() {
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
        if (((Map) obj) != null) {
            return true;
        }
        C59104x c = C124081bi.f342709a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.DataFetch");
        ((C59052c) ((C59052c) c).mo56372aa(35395)).mo56386p("A sync has failed.");
        return false;
    }
}
