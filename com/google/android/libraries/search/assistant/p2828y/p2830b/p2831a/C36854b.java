package com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a;

import com.google.android.libraries.assistant.portable.p1586b.C19066aj;
import com.google.android.libraries.assistant.portable.p1586b.C19081m;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.common.base.C58869cf;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5131b.C65845n;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.y.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C36854b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C36854b f95999a = new C36854b();

    private /* synthetic */ C36854b() {
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
        C58869cf cfVar = C36858f.f96003a;
        C19088t tVar = ((C65845n) obj).f178995b;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        C19081m mVar = tVar.f53542h;
        if (mVar == null) {
            mVar = C19081m.f53515g;
        }
        C19066aj ajVar = mVar.f53519c;
        if (ajVar == null) {
            ajVar = C19066aj.f53483e;
        }
        return new C62963cj(ajVar.f53487c, C19066aj.f53482d).contains(C51209d.TYPED);
    }
}
