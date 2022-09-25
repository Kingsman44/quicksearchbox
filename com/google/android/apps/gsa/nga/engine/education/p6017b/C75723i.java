package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80344cl;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.i */
/* compiled from: PG */
public final /* synthetic */ class C75723i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C75723i f210182a = new C75723i();

    private /* synthetic */ C75723i() {
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
        C80295aq aqVar;
        C80344cl clVar;
        C80394g gVar = (C80394g) obj;
        C58528ij ijVar = C75727m.f210187b;
        if (gVar.f220647a == 2) {
            aqVar = (C80295aq) gVar.f220648b;
        } else {
            aqVar = C80295aq.f220357c;
        }
        if (aqVar.f220359a == 22) {
            clVar = (C80344cl) aqVar.f220360b;
        } else {
            clVar = C80344cl.f220460d;
        }
        C80590x a = C80590x.m128211a(clVar.f220463b);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        return ijVar.contains(a);
    }
}
