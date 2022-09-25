package com.google.android.apps.gsa.tasks;

import android.util.Base64;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.tasks.cd */
/* compiled from: PG */
public abstract class C118529cd {

    /* renamed from: a */
    private static final C59071e f329112a = C59071e.m91332i("com.google.android.apps.gsa.tasks.cd");

    /* renamed from: a */
    static C118485at m196772a(String str) {
        if (str == null) {
            return C118485at.f328861h;
        }
        try {
            return (C118485at) C62942bv.parseFrom((C62942bv) C118485at.f328861h, Base64.decode(str, 11), C62921ba.m95368a());
        } catch (C62974ct | IllegalArgumentException e) {
            C59104x c = f329112a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TaskServiceHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34002)).mo56386p("Failed to decode ServiceExecutionData due to corrupted data.");
            return C118485at.f328861h;
        }
    }

    /* renamed from: b */
    public abstract C60870cx mo103736b(Class cls, C118485at atVar);
}
