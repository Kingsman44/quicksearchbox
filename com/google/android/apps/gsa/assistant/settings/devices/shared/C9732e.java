package com.google.android.apps.gsa.assistant.settings.devices.shared;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83823ad;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83865y;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.shared.e */
/* compiled from: PG */
public final class C9732e {

    /* renamed from: a */
    private final C58833ax f33619a;

    /* renamed from: b */
    private final h f33620b;

    public C9732e(C58833ax axVar, h hVar) {
        this.f33619a = axVar;
        this.f33620b = hVar;
    }

    /* renamed from: b */
    public static int m24475b(boolean z) {
        return !z ? 2 : 3;
    }

    /* renamed from: a */
    public final void mo17997a(Activity activity, int i, C58485gu guVar) {
        Account a = this.f33620b.a();
        if (a != null) {
            C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
            String str = a.name;
            aeVar.copyOnWrite();
            C83825af afVar = (C83825af) aeVar.instance;
            str.getClass();
            afVar.f228449a |= 1;
            afVar.f228450b = str;
            C83825af afVar2 = (C83825af) aeVar.build();
            C83865y yVar = (C83865y) C83823ad.f228441e.createBuilder();
            yVar.mo77206a(guVar);
            yVar.copyOnWrite();
            C83823ad adVar = (C83823ad) yVar.instance;
            adVar.f228445c = 1;
            adVar.f228443a |= 1;
            yVar.copyOnWrite();
            C83823ad adVar2 = (C83823ad) yVar.instance;
            adVar2.f228446d = i - 1;
            adVar2.f228443a |= 2;
            C83823ad adVar3 = (C83823ad) yVar.build();
            C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
            cVar.copyOnWrite();
            C83841av avVar = (C83841av) cVar.instance;
            afVar2.getClass();
            avVar.f228481b = afVar2;
            avVar.f228480a = 1;
            cVar.copyOnWrite();
            C83841av avVar2 = (C83841av) cVar.instance;
            adVar3.getClass();
            avVar2.f228483d = adVar3;
            avVar2.f228482c = 5;
            ((C83819a) this.f33619a.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
        }
    }
}
