package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.common.base.C58810aa;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.av */
/* compiled from: PG */
class C122012av extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C122014ax axVar = (C122014ax) obj;
        C122029l lVar = C122029l.UNKNOWN_STATE;
        int ordinal = axVar.ordinal();
        if (ordinal == 0) {
            return C122029l.UNKNOWN_STATE;
        }
        if (ordinal == 1) {
            return C122029l.SHOWN;
        }
        if (ordinal == 2) {
            return C122029l.HIDDEN;
        }
        if (ordinal == 3) {
            return C122029l.CREATED;
        }
        if (ordinal == 4) {
            return C122029l.DESTROYED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(axVar.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo17536c(Object obj) {
        C122029l lVar = (C122029l) obj;
        C122014ax axVar = C122014ax.UNKNOWN_STATE;
        int ordinal = lVar.ordinal();
        if (ordinal == 0) {
            return C122014ax.UNKNOWN_STATE;
        }
        if (ordinal == 1) {
            return C122014ax.SHOWN;
        }
        if (ordinal == 2) {
            return C122014ax.HIDDEN;
        }
        if (ordinal == 3) {
            return C122014ax.CREATED;
        }
        if (ordinal == 4) {
            return C122014ax.DESTROYED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(lVar.getNumber())));
    }
}
