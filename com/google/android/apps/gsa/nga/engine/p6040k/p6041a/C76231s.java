package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.s */
/* compiled from: PG */
public final class C76231s {

    /* renamed from: a */
    public final Context f211243a;

    /* renamed from: b */
    public final C91142g f211244b;

    public C76231s(Context context, C91142g gVar) {
        this.f211243a = context;
        this.f211244b = gVar;
    }

    /* renamed from: a */
    public static C58485gu m122803a(Collection collection) {
        return (C58485gu) Collection.EL.stream(collection).flatMap(C76230r.f211242a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final Optional mo72144b(java.util.Collection collection) {
        if (Collection.EL.stream(collection).anyMatch(C76227o.f211239a)) {
            return Optional.empty();
        }
        return Collection.EL.stream(collection).map(C76228p.f211240a).filter(new C76229q(this)).findFirst();
    }
}
