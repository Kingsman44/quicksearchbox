package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.common.p4522b.C58487gw;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.t.h.aw */
/* compiled from: PG */
public final /* synthetic */ class C118403aw implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123723aq f328640a;

    public /* synthetic */ C118403aw(C123723aq aqVar) {
        this.f328640a = aqVar;
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
        C123723aq aqVar = this.f328640a;
        C58487gw gwVar = C118426bs.f328679a;
        return aqVar.f341741c.equals(((ComponentName) obj).getClassName());
    }
}
