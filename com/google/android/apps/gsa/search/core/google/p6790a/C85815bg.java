package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.contacts.ap;
import com.google.assistant.p3897e.p3917i.p3918a.C51601nt;
import com.google.assistant.p3897e.p3917i.p3918a.C51602nu;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.bg */
/* compiled from: PG */
final class C85815bg implements C58817ah {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ap apVar = (ap) obj;
        C51601nt ntVar = (C51601nt) C51602nu.f134484e.createBuilder();
        String str = apVar.c;
        ntVar.copyOnWrite();
        C51602nu nuVar = (C51602nu) ntVar.instance;
        str.getClass();
        nuVar.f134486a |= 1;
        nuVar.f134487b = str;
        double d = apVar.d;
        ntVar.copyOnWrite();
        C51602nu nuVar2 = (C51602nu) ntVar.instance;
        nuVar2.f134486a |= 2;
        nuVar2.f134488c = (float) d;
        if ((apVar.a & 8) != 0) {
            adm adm = apVar.e;
            if (adm == null) {
                adm = adm.f134889h;
            }
            ntVar.copyOnWrite();
            C51602nu nuVar3 = (C51602nu) ntVar.instance;
            adm.getClass();
            nuVar3.f134489d = adm;
            nuVar3.f134486a |= 4;
        }
        return (C51602nu) ntVar.build();
    }
}
