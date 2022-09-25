package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import com.google.android.apps.gsa.shared.p7117n.p7118a.p7119a.C90357a;
import com.google.android.apps.gsa.shared.p7117n.p7118a.p7119a.C90358b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.c */
/* compiled from: PG */
public final /* synthetic */ class C98567c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C98567c f275298a = new C98567c();

    private /* synthetic */ C98567c() {
    }

    public final Object apply(Object obj) {
        C90357a aVar = (C90357a) ((C90358b) obj).toBuilder();
        aVar.copyOnWrite();
        C90358b bVar = (C90358b) aVar.instance;
        bVar.f252351a |= 2;
        bVar.f252352b = false;
        aVar.copyOnWrite();
        ((C90358b) aVar.instance).f252353c = C62942bv.emptyProtobufList();
        return (C90358b) aVar.build();
    }
}
