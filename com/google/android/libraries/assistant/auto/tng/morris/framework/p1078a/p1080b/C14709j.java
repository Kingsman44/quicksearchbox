package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3861at.C50081jw;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.afo;
import com.google.assistant.p3897e.p3921j.afp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.j */
/* compiled from: PG */
public final class C14709j {

    /* renamed from: a */
    public final Context f44459a;

    /* renamed from: b */
    public final C21370a f44460b;

    public C14709j(Context context, C21370a aVar) {
        this.f44459a = context;
        this.f44460b = aVar;
    }

    /* renamed from: a */
    public static void m30935a(C50081jw jwVar, C14749d dVar, Duration duration) {
        C58976aa aaVar = C58975e.f156826a;
        afo afo = (afo) afp.f135012b.createBuilder();
        afo.copyOnWrite();
        afp afp = (afp) afo.instance;
        jwVar.getClass();
        C62971cq cqVar = afp.f135014a;
        if (!cqVar.mo58948c()) {
            afp.f135014a = C62942bv.mutableCopy(cqVar);
        }
        afp.f135014a.add(jwVar);
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.RingInfoInput";
        C63088z byteString = ((afp) afo.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "communication.RING_INFO";
        dsVar.mo53729a("ring_info_input", (C52230ka) jzVar.build());
        dVar.mo21716c(C14984b.m31504b((C51805du) dsVar.build(), C60214n.f162914g, "and.opa.morris.phone", false, C14533mt.STARTUP_ON_CALL_ANNOUNCE, duration));
    }
}
