package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.nlp.p4735b.p4736a.p4738b.C62829k;
import com.google.nlp.p4735b.p4736a.p4738b.C62835q;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.y */
/* compiled from: PG */
public final /* synthetic */ class C79072y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79073z f217420a;

    /* renamed from: b */
    public final /* synthetic */ boolean f217421b;

    public /* synthetic */ C79072y(C79073z zVar, boolean z) {
        this.f217420a = zVar;
        this.f217421b = z;
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
        C79073z zVar = this.f217420a;
        boolean z = this.f217421b;
        C62835q qVar = (C62835q) obj;
        if (!qVar.f169682c) {
            return true;
        }
        if (!z) {
            return false;
        }
        if ((qVar.f169680a & 64) == 0) {
            return true;
        }
        C62829k kVar = qVar.f169683d;
        if (kVar == null) {
            kVar = C62829k.f169662b;
        }
        return zVar.mo73798b(kVar);
    }
}
