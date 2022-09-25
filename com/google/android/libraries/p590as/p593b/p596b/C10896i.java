package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10874b;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10876d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.as.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C10896i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C10896i f35986a = new C10896i();

    private /* synthetic */ C10896i() {
    }

    public final Object apply(Object obj) {
        C58974d dVar = C10948j.f36065a;
        C10874b a = C10874b.m25893a(((C10876d) obj).f35955a);
        if (a == null) {
            a = C10874b.SETTING_UNSPECIFIED;
        }
        if (!a.equals(C10874b.SETTING_UNSPECIFIED)) {
            return a;
        }
        ((C58970a) ((C58970a) C10948j.f36065a.mo56224b()).mo56372aa(53958)).mo56386p("Defaulting LP download condition to WIFI_ONLY as user has not edited settings.");
        return C10874b.WIFI_ONLY;
    }
}
