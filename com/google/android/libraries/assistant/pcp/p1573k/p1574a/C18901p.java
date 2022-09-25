package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.p */
/* compiled from: PG */
public final /* synthetic */ class C18901p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Duration f53185a;

    public /* synthetic */ C18901p(Duration duration) {
        this.f53185a = duration;
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
        C18906u uVar = (C18906u) obj;
        boolean z = uVar.mo24155b().longValue() >= this.f53185a.toMillis();
        if (!z) {
            C59104x b = C18907v.f53191a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
            ((C59052c) ((C59052c) b).mo56372aa(47393)).mo56354G("#getMostlyUsedMediaApps() filtering out {%s} {%s} because insufficient usage.", uVar.mo24154a().name, uVar.mo24154a().packageName);
        }
        return z;
    }
}
