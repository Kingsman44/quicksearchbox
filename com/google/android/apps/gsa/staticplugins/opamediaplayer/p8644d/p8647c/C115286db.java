package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52575wv;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.db */
/* compiled from: PG */
public final /* synthetic */ class C115286db implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C115315ed f319907a;

    /* renamed from: b */
    public final /* synthetic */ int f319908b;

    public /* synthetic */ C115286db(C115315ed edVar, int i) {
        this.f319907a = edVar;
        this.f319908b = i;
    }

    public final Object apply(Object obj) {
        C52583xc xcVar;
        C115315ed edVar = this.f319907a;
        int i = this.f319908b;
        C52176ia iaVar = (C52176ia) obj;
        int i2 = edVar.mo101954a().f319951a.f136916d;
        C52174hz hzVar = (C52174hz) iaVar.f136914b.get(i2);
        C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder(iaVar);
        C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder(hzVar);
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder(woVar);
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 26) {
            xcVar = (C52583xc) woVar2.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52575wv wvVar = (C52575wv) C52583xc.f138063o.createBuilder(xcVar);
        C52579wz wzVar = C52579wz.INCOMPLETE;
        wvVar.copyOnWrite();
        C52583xc xcVar2 = (C52583xc) wvVar.instance;
        xcVar2.f138066b = wzVar.f138049f;
        xcVar2.f138065a |= 1;
        wvVar.copyOnWrite();
        C52583xc xcVar3 = (C52583xc) wvVar.instance;
        xcVar3.f138065a |= 2;
        xcVar3.f138067c = i;
        C52583xc xcVar4 = (C52583xc) wvVar.build();
        wjVar.copyOnWrite();
        C52568wo woVar3 = (C52568wo) wjVar.instance;
        xcVar4.getClass();
        woVar3.f137997d = xcVar4;
        woVar3.f137996c = 26;
        hwVar.copyOnWrite();
        C52174hz hzVar2 = (C52174hz) hwVar.instance;
        C52568wo woVar4 = (C52568wo) wjVar.build();
        woVar4.getClass();
        hzVar2.f136897d = woVar4;
        hzVar2.f136894a |= 8;
        hvVar.mo53810f(i2, hwVar);
        return (C52176ia) hvVar.build();
    }
}
