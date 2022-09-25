package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.g */
/* compiled from: PG */
public final /* synthetic */ class C11850g implements C58817ah {
    public final Object apply(Object obj) {
        C58835az azVar = (C58835az) obj;
        C58974d dVar = C11853j.f38149a;
        List list = (List) azVar.f156631a;
        List list2 = (List) azVar.f156632b;
        if (!list.isEmpty()) {
            return C58833ax.m90834k(C15669a.m32463b(list, list2));
        }
        ((C58970a) ((C58970a) C11853j.f38149a.mo56225c()).mo56372aa(43551)).mo56386p("Cannot handle AnalyzerResponse in Call builder since client ops are missing");
        return C58836b.f156633a;
    }
}
