package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53437nw;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C14660a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14660a f44282a = new C14660a();

    private /* synthetic */ C14660a() {
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
        C53435nu nuVar = (C53435nu) obj;
        C53437nw nwVar = nuVar.f140247l;
        if (nwVar == null) {
            nwVar = C53437nw.f140250i;
        }
        if (nwVar.f140258g == C16327aa.NAVIGATE_HOME.f48064H) {
            return true;
        }
        C53437nw nwVar2 = nuVar.f140247l;
        if (nwVar2 == null) {
            nwVar2 = C53437nw.f140250i;
        }
        return nwVar2.f140258g == C16327aa.NAVIGATE_WORK.f48064H;
    }
}
