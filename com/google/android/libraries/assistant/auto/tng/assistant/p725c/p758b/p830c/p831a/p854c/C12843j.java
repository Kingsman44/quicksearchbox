package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.j */
/* compiled from: PG */
final class C12843j {
    /* renamed from: a */
    static final List m29090a(int i, Map map) {
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C51175f fVar = (C51175f) map.get(valueOf);
            if (fVar != null) {
                return fVar.f133211e;
            }
            C59104x c = C12844k.f40077a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvDeltaStreamProc");
            ((C59052c) ((C59052c) c).mo56372aa(44487)).mo56387q("#getInteractionIdsInBasicBlock failed. BasicBlock with id %d is null.", i);
        }
        return new ArrayList();
    }
}
