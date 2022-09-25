package com.google.android.libraries.assistant.pcp.p1573k;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.pcp.k.w */
/* compiled from: PG */
public final /* synthetic */ class C18943w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C52559wf f53247a;

    public /* synthetic */ C18943w(C52559wf wfVar) {
        this.f53247a = wfVar;
    }

    public final Object apply(Object obj) {
        C52559wf wfVar = this.f53247a;
        C51012dc dcVar = (C51012dc) obj;
        C52568wo woVar = ((C52560wg) wfVar.instance).f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) woVar.toBuilder();
        wjVar.copyOnWrite();
        C52568wo woVar2 = (C52568wo) wjVar.instance;
        dcVar.getClass();
        woVar2.f138004k = dcVar;
        woVar2.f137994a |= 1024;
        wfVar.copyOnWrite();
        C52560wg wgVar = (C52560wg) wfVar.instance;
        C52568wo woVar3 = (C52568wo) wjVar.build();
        woVar3.getClass();
        wgVar.f137950f = woVar3;
        wgVar.f137945a |= 8;
        return (C52560wg) wfVar.build();
    }
}
