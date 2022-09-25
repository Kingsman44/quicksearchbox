package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.j */
/* compiled from: PG */
public final /* synthetic */ class C133559j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133570u f363883a;

    public /* synthetic */ C133559j(C133570u uVar) {
        this.f363883a = uVar;
    }

    public final Object apply(Object obj) {
        C133570u uVar = this.f363883a;
        C133545an anVar = (C133545an) ((C133546ao) obj).toBuilder();
        int d = uVar.mo111262d();
        int i = d - 1;
        if (d != 0) {
            if (i == 0) {
                boolean b = uVar.mo111260b();
                anVar.copyOnWrite();
                C133546ao aoVar = (C133546ao) anVar.instance;
                aoVar.f363861a |= 2;
                aoVar.f363863c = b;
            } else if (i == 1) {
                boolean b2 = uVar.mo111260b();
                anVar.copyOnWrite();
                C133546ao aoVar2 = (C133546ao) anVar.instance;
                aoVar2.f363861a |= 4;
                aoVar2.f363864d = b2;
            }
            if (uVar.mo111261c() == 2) {
                anVar.copyOnWrite();
                C133546ao aoVar3 = (C133546ao) anVar.instance;
                aoVar3.f363861a |= 1;
                aoVar3.f363862b = true;
            }
            return (C133546ao) anVar.build();
        }
        throw null;
    }
}
