package com.google.android.apps.gsa.shared.util.p7188v.p7189a;

import com.google.android.apps.p464c.p465a.p466a.p467a.p468a.C9015a;
import com.google.android.apps.p464c.p465a.p466a.p467a.p468a.C9016b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.util.v.a.g */
/* compiled from: PG */
public final /* synthetic */ class C91134g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Set f254456a;

    public /* synthetic */ C91134g(Set set) {
        this.f254456a = set;
    }

    public final Object apply(Object obj) {
        Set set = this.f254456a;
        C9015a aVar = (C9015a) ((C9016b) obj).toBuilder();
        aVar.copyOnWrite();
        ((C9016b) aVar.instance).f31148d = C62942bv.emptyProtobufList();
        if (set == null) {
            aVar.copyOnWrite();
            C9016b bVar = (C9016b) aVar.instance;
            bVar.f31145a |= 2;
            bVar.f31147c = false;
            aVar.copyOnWrite();
            ((C9016b) aVar.instance).f31148d = C62942bv.emptyProtobufList();
        } else {
            aVar.copyOnWrite();
            C9016b bVar2 = (C9016b) aVar.instance;
            bVar2.f31145a |= 2;
            bVar2.f31147c = true;
            aVar.mo17310a(set);
        }
        return (C9016b) aVar.build();
    }
}
