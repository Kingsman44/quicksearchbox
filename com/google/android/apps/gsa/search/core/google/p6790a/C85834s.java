package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21677g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51265bh;
import com.google.assistant.p3897e.p3917i.p3918a.C51267bj;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52520uu;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.s */
/* compiled from: PG */
public final /* synthetic */ class C85834s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C52522uw f232083a;

    /* renamed from: b */
    public final /* synthetic */ C51265bh f232084b;

    public /* synthetic */ C85834s(C52522uw uwVar, C51265bh bhVar) {
        this.f232083a = uwVar;
        this.f232084b = bhVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C52522uw uwVar = this.f232083a;
        C51265bh bhVar = this.f232084b;
        int a = ((C21677g) obj).mo27069b().mo27066a();
        C58976aa aaVar = C58975e.f156826a;
        C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
        usVar.copyOnWrite();
        C52522uw uwVar2 = (C52522uw) usVar.instance;
        uwVar2.f137867b = 1;
        uwVar2.f137866a |= 1;
        int a2 = C52520uu.m86644a(a);
        usVar.copyOnWrite();
        C52522uw uwVar3 = (C52522uw) usVar.instance;
        int i = a2 - 1;
        if (a2 != 0) {
            uwVar3.f137874i = i;
            uwVar3.f137866a |= 128;
            long j = uwVar.f137869d;
            usVar.copyOnWrite();
            C52522uw uwVar4 = (C52522uw) usVar.instance;
            uwVar4.f137866a |= 4;
            uwVar4.f137869d = j;
            if (a == 1 || a == 3) {
                String str = uwVar.f137870e;
                usVar.copyOnWrite();
                C52522uw uwVar5 = (C52522uw) usVar.instance;
                str.getClass();
                uwVar5.f137866a |= 8;
                uwVar5.f137870e = str;
                String str2 = uwVar.f137871f;
                usVar.copyOnWrite();
                C52522uw uwVar6 = (C52522uw) usVar.instance;
                str2.getClass();
                uwVar6.f137866a |= 16;
                uwVar6.f137871f = str2;
            }
            C52522uw uwVar7 = (C52522uw) usVar.build();
            bhVar.copyOnWrite();
            C51270bm bmVar = (C51270bm) bhVar.instance;
            C51270bm bmVar2 = C51270bm.f133476f;
            uwVar7.getClass();
            bmVar.f133482e = uwVar7;
            bmVar.f133478a |= 16;
            C51267bj b = C85841z.m137917b(uwVar7);
            bhVar.copyOnWrite();
            C51270bm bmVar3 = (C51270bm) bhVar.instance;
            b.getClass();
            bmVar3.f133481d = b;
            bmVar3.f133478a |= 8;
            return C58833ax.m90834k((C51270bm) bhVar.build());
        }
        throw null;
    }
}
