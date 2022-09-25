package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3886c.p3887a.C50674j;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C131017bd implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f358416a;

    /* renamed from: b */
    public final /* synthetic */ Optional f358417b;

    public /* synthetic */ C131017bd(Optional optional, Optional optional2) {
        this.f358416a = optional;
        this.f358417b = optional2;
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
        Optional optional = this.f358416a;
        Optional optional2 = this.f358417b;
        C50674j jVar = (C50674j) obj;
        Duration duration = C131043cc.f358455a;
        if (!optional.isEmpty()) {
            C50672h hVar = jVar.f131824b;
            if (hVar == null) {
                hVar = C50672h.f131816d;
            }
            C106531e a = C106531e.m177306a(hVar.f131819b);
            if (a == null) {
                a = C106531e.UNKNOWN;
            }
            if (!a.equals(optional.get())) {
                return false;
            }
        }
        if (optional2.isEmpty()) {
            return true;
        }
        C50672h hVar2 = jVar.f131824b;
        if (hVar2 == null) {
            hVar2 = C50672h.f131816d;
        }
        if (!hVar2.f131820c.equals(optional2.get())) {
            return false;
        }
        return true;
    }
}
