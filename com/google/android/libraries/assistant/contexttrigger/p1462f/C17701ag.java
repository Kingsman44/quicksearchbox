package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48889ad;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48898am;
import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.ag */
/* compiled from: PG */
public final /* synthetic */ class C17701ag implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C48917s f50896a;

    /* renamed from: b */
    public final /* synthetic */ C17696ab f50897b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f50898c;

    public /* synthetic */ C17701ag(C48917s sVar, C17696ab abVar, C63042fg fgVar) {
        this.f50896a = sVar;
        this.f50897b = abVar;
        this.f50898c = fgVar;
    }

    public final Object apply(Object obj) {
        C48917s sVar = this.f50896a;
        C17696ab abVar = this.f50897b;
        C63042fg fgVar = this.f50898c;
        C48889ad adVar = (C48889ad) ((C48892ag) obj).toBuilder();
        C48919u uVar = sVar.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        String a = C17709ao.m34990a(uVar);
        C17694a aVar = (C17694a) abVar;
        C48898am amVar = (C48898am) aVar.f50872a.toBuilder();
        amVar.copyOnWrite();
        C48899an anVar = (C48899an) amVar.instance;
        fgVar.getClass();
        anVar.f126539f = fgVar;
        anVar.f126534a |= 16;
        adVar.mo53187b(a, (C48899an) amVar.build());
        C58495hd hdVar = aVar.f50873b;
        adVar.copyOnWrite();
        ((C48892ag) adVar.instance).mo53190c().putAll(hdVar);
        return (C48892ag) adVar.build();
    }
}
