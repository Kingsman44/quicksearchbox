package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121091a;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121092b;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.i */
/* compiled from: PG */
public final /* synthetic */ class C121081i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121092b f336492a;

    public /* synthetic */ C121081i(C121092b bVar) {
        this.f336492a = bVar;
    }

    public final Object apply(Object obj) {
        C121092b bVar = this.f336492a;
        act act = (act) obj;
        ((C59052c) ((C59052c) C121083k.f336494a.mo56224b()).mo56372aa(35706)).mo56386p("MobileLocaleSettingsDataMigration running now.");
        C121091a aVar = (C121091a) bVar.toBuilder();
        aVar.copyOnWrite();
        C121092b bVar2 = (C121092b) aVar.instance;
        bVar2.f336506a &= -2;
        bVar2.f336507b = C121092b.f336504e.f336507b;
        aVar.copyOnWrite();
        ((C121092b) aVar.instance).f336508c = C62942bv.emptyProtobufList();
        aVar.copyOnWrite();
        C121092b bVar3 = (C121092b) aVar.instance;
        bVar3.f336506a |= 2;
        bVar3.f336509d = true;
        if ((act.f128894a & 524288) != 0) {
            C49946ew ewVar = act.f128911r;
            if (ewVar == null) {
                ewVar = C49946ew.f129824q;
            }
            if (!ewVar.f129830e.isEmpty()) {
                C49946ew ewVar2 = act.f128911r;
                C49946ew ewVar3 = ewVar2 == null ? C49946ew.f129824q : ewVar2;
                if (ewVar2 == null) {
                    ewVar2 = C49946ew.f129824q;
                }
                String str = (String) ewVar2.f129830e.get(0);
                aVar.copyOnWrite();
                C121092b bVar4 = (C121092b) aVar.instance;
                str.getClass();
                bVar4.f336506a = 1 | bVar4.f336506a;
                bVar4.f336507b = str;
                for (String a : ewVar3.f129830e) {
                    aVar.mo105048a(a);
                }
                return (C121092b) aVar.build();
            }
        }
        return (C121092b) aVar.build();
    }
}
