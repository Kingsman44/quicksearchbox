package com.google.android.apps.gsa.staticplugins.recently;

import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.a */
/* compiled from: PG */
public final /* synthetic */ class C116017a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C116017a f321698a = new C116017a();

    private /* synthetic */ C116017a() {
    }

    public final Object apply(Object obj) {
        try {
            return (C22831b) C62942bv.parseFrom((C62942bv) C22831b.f62860b, (byte[]) obj);
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }
}
