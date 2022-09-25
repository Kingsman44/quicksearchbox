package com.google.android.apps.gsa.shared.p6973ad;

import android.location.Location;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.shared.ad.b */
/* compiled from: PG */
public final /* synthetic */ class C89086b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C89086b f241425a = new C89086b();

    private /* synthetic */ C89086b() {
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            return C58833ax.m90834k(location);
        }
        ((C58970a) ((C58970a) C89090f.f241430a.mo56224b()).mo56372aa(10730)).mo56386p("[LocationSupplier] Current location is null");
        return C58836b.f156633a;
    }
}
