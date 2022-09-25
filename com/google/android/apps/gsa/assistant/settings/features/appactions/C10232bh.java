package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10342bb;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10279x;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bh */
/* compiled from: PG */
public final /* synthetic */ class C10232bh implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C10233bi f34712a;

    public /* synthetic */ C10232bh(C10233bi biVar) {
        this.f34712a = biVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C49826ak akVar;
        C10233bi biVar = this.f34712a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C49823ah ahVar = (C49823ah) ((C10342bb) optional.get()).mo18443b().toBuilder();
            ahVar.copyOnWrite();
            ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
            akVar = (C49826ak) ahVar.build();
        } else {
            akVar = C49826ak.f129462q;
        }
        C10234bj bjVar = biVar.f34713a;
        C10325al alVar = bjVar.f34720g;
        C10279x xVar = bjVar.f34716c.f34812c;
        if (xVar == null) {
            xVar = C10279x.f34833d;
        }
        String str = xVar.f34836b;
        C10279x xVar2 = biVar.f34713a.f34716c.f34812c;
        if (xVar2 == null) {
            xVar2 = C10279x.f34833d;
        }
        return alVar.mo18427i(str, akVar, Optional.m71637of(Long.valueOf(xVar2.f34837c)));
    }
}
