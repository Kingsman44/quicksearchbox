package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.e */
/* compiled from: PG */
public final /* synthetic */ class C110671e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C110671e f308392a = new C110671e();

    private /* synthetic */ C110671e() {
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
        C53420nf nfVar;
        C53366lf lfVar = (C53366lf) obj;
        C59071e eVar = C110679m.f308400a;
        if (lfVar.f140037b == 4) {
            nfVar = (C53420nf) lfVar.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        C53250gy gyVar = nfVar.f140176j;
        if (gyVar == null) {
            gyVar = C53250gy.f139586c;
        }
        return gyVar.f139588a == 22;
    }
}
