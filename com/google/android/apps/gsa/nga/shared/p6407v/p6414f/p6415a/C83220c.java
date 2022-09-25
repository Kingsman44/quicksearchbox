package com.google.android.apps.gsa.nga.shared.p6407v.p6414f.p6415a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.C83217a;
import com.google.assistant.p3745ab.p3771w.C48418e;
import com.google.common.base.C58810aa;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.f.a.c */
/* compiled from: PG */
class C83220c extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo17535b(Object obj) {
        C83217a aVar = (C83217a) obj;
        C48418e eVar = C48418e.ON_DEVICE_STACK_STATUS_UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return C48418e.ON_DEVICE_STACK_STATUS_UNKNOWN;
        }
        if (ordinal == 1) {
            return C48418e.ON_DEVICE_STACK_ENABLED;
        }
        if (ordinal == 3) {
            return C48418e.ON_DEVICE_STACK_DISABLED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aVar.f226840e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo17536c(Object obj) {
        C48418e eVar = (C48418e) obj;
        C83217a aVar = C83217a.UNKNOWN;
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return C83217a.UNKNOWN;
        }
        if (ordinal == 1) {
            return C83217a.NGA;
        }
        if (ordinal == 2) {
            return C83217a.PANTHERA;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(eVar.f125126d)));
    }
}
