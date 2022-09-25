package com.google.android.apps.gsa.staticplugins.smartspace.p8759a.p8760a;

import com.google.android.apps.gsa.staticplugins.smartspace.p8759a.C117337a;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50814dk;
import com.google.assistant.p3886c.C50816dm;
import com.google.assistant.p3886c.C50817dn;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.a.a.b */
/* compiled from: PG */
public final class C117339b implements C117337a {

    /* renamed from: a */
    private static final C59071e f325708a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.a.a.b");

    /* renamed from: b */
    private final C60950i f325709b;

    public C117339b(C60950i iVar) {
        this.f325709b = iVar;
    }

    /* renamed from: a */
    public final C50818do mo103265a(C50818do doVar) {
        C50817dn dnVar = doVar.f132295A;
        if (dnVar == null) {
            dnVar = C50817dn.f132287e;
        }
        C50814dk dkVar = (C50814dk) dnVar.toBuilder();
        C50817dn dnVar2 = (C50817dn) dkVar.instance;
        if ((dnVar2.f132289a & 8) != 0) {
            C50816dm dmVar = dnVar2.f132292d;
            if (dmVar == null) {
                dmVar = C50816dm.f132281e;
            }
            if (dmVar.f132286d.isEmpty()) {
                C59104x c = f325708a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CalendarScoreGen");
                ((C59052c) ((C59052c) c).mo56372aa(33083)).mo56386p("Checkpoints are empty. Event start time is missing.");
            } else {
                long epochMilli = this.f325709b.mo57444a().toEpochMilli();
                C50816dm dmVar2 = ((C50817dn) dkVar.instance).f132292d;
                if (dmVar2 == null) {
                    dmVar2 = C50816dm.f132281e;
                }
                long a = dmVar2.f132286d.mo58927a(0);
                C50816dm dmVar3 = ((C50817dn) dkVar.instance).f132292d;
                long j = (dmVar3 == null ? C50816dm.f132281e : dmVar3).f132284b;
                if (dmVar3 == null) {
                    dmVar3 = C50816dm.f132281e;
                }
                long j2 = dmVar3.f132285c;
                float round = (epochMilli <= j || epochMilli >= a) ? 0.0f : ((float) Math.round(((float) (1.0d / (Math.exp((double) (((float) Duration.ofMillis(epochMilli - ((j + a) / 2)).toMinutes()) * -0.5f)) + 1.0d))) * 10.0f)) / 10.0f;
                if (epochMilli >= a && epochMilli <= j2) {
                    round = 1.0f;
                }
                dkVar.copyOnWrite();
                C50817dn dnVar3 = (C50817dn) dkVar.instance;
                dnVar3.f132289a |= 2;
                dnVar3.f132291c = round;
            }
        } else {
            C59104x c2 = f325708a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "CalendarScoreGen");
            ((C59052c) ((C59052c) c2).mo56372aa(33084)).mo56386p("Calendar card does not have important time points");
        }
        dkVar.copyOnWrite();
        C50817dn dnVar4 = (C50817dn) dkVar.instance;
        dnVar4.f132289a |= 1;
        dnVar4.f132290b = 0.0f;
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        C50817dn dnVar5 = (C50817dn) dkVar.build();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        dnVar5.getClass();
        doVar2.f132295A = dnVar5;
        doVar2.f132304a |= 67108864;
        return (C50818do) cnVar.build();
    }
}
