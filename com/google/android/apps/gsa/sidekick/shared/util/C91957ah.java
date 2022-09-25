package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ah */
/* compiled from: PG */
public final class C91957ah {
    /* renamed from: a */
    public static final C7752iq m150910a(C7718hj hjVar, C7708h hVar, long j, C7669fo foVar) {
        C7751ip ipVar = (C7751ip) C7752iq.f27124E.createBuilder();
        ipVar.copyOnWrite();
        C7752iq iqVar = (C7752iq) ipVar.instance;
        iqVar.f27131a |= 16;
        iqVar.f27140j = j / 1000;
        int offset = TimeZone.getDefault().getOffset(j);
        ipVar.copyOnWrite();
        C7752iq iqVar2 = (C7752iq) ipVar.instance;
        iqVar2.f27131a |= 32;
        iqVar2.f27141k = (int) (((long) offset) / 1000);
        ipVar.copyOnWrite();
        C7752iq iqVar3 = (C7752iq) ipVar.instance;
        hVar.getClass();
        iqVar3.f27133c = hVar;
        iqVar3.f27132b = 1;
        if (hjVar != null) {
            ipVar.copyOnWrite();
            C7752iq iqVar4 = (C7752iq) ipVar.instance;
            iqVar4.f27135e = hjVar;
            iqVar4.f27134d = 2;
        }
        if (foVar != null) {
            ipVar.copyOnWrite();
            C7752iq iqVar5 = (C7752iq) ipVar.instance;
            iqVar5.f27126A = foVar;
            iqVar5.f27131a = 16777216 | iqVar5.f27131a;
        } else if (!(hjVar == null || (hjVar.f26955a & 4) == 0)) {
            C7669fo foVar2 = hjVar.f26968i;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            ipVar.copyOnWrite();
            C7752iq iqVar6 = (C7752iq) ipVar.instance;
            foVar2.getClass();
            iqVar6.f27126A = foVar2;
            iqVar6.f27131a |= 16777216;
        }
        return (C7752iq) ipVar.build();
    }
}
