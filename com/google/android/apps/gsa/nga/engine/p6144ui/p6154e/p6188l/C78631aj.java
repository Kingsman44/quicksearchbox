package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.api.C74733m;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.aj */
/* compiled from: PG */
final class C78631aj extends C74733m {

    /* renamed from: a */
    final /* synthetic */ C78632ak f216520a;

    public C78631aj(C78632ak akVar) {
        this.f216520a = akVar;
    }

    /* renamed from: e */
    public final void mo71116e(ProtoLiteParcelable protoLiteParcelable) {
        try {
            C80833al alVar = (C80833al) protoLiteParcelable.mo84191d(C80833al.f221756c.getParserForType());
            if (alVar == null) {
                ((C59052c) ((C59052c) C78632ak.f216521a.mo56226d()).mo56372aa(5256)).mo56386p("Empty message");
            } else {
                this.f216520a.f216524d.mo73553b(alVar);
            }
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C78632ak.f216521a.mo56225c()).mo56382g(e)).mo56372aa(5257)).mo56386p("Could not parse message");
        }
    }
}
