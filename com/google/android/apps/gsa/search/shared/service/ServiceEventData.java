package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public class ServiceEventData extends EventData {
    public static final Parcelable.Creator CREATOR = new C87683ak();

    /* renamed from: a */
    public final C88246uo f236959a;

    public ServiceEventData(C88246uo uoVar, Parcelable parcelable) {
        super(parcelable);
        this.f236959a = uoVar;
    }

    /* renamed from: a */
    public final byte[] mo81911a() {
        return this.f236959a.toByteArray();
    }

    /* renamed from: e */
    public final Object mo81918e(C62917ay ayVar) {
        C88246uo uoVar = this.f236959a;
        C62940bt r1 = C62942bv.checkIsLite(ayVar);
        uoVar.mo58887l(r1);
        C58838bb.m90868c(uoVar.f169962ag.mo58857o(r1.f169971d));
        C88246uo uoVar2 = this.f236959a;
        C62940bt r3 = C62942bv.checkIsLite(ayVar);
        uoVar2.mo58887l(r3);
        Object l = uoVar2.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            return r3.f169969b;
        }
        return r3.mo58889c(l);
    }
}
