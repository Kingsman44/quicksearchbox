package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.speech.p5202d.p5203a.C66488a;
import com.google.speech.p5202d.p5203a.C66489b;

/* renamed from: com.google.android.apps.gsa.z.e.a.c.a */
/* compiled from: PG */
public final class C118981a {
    /* renamed from: a */
    public static C66489b m197532a(C90021c cVar, boolean z) {
        C66488a aVar = (C66488a) C66489b.f180789h.createBuilder();
        aVar.copyOnWrite();
        C66489b bVar = (C66489b) aVar.instance;
        bVar.f180791a |= 4096;
        bVar.f180795e = true;
        if (!z || !cVar.mo79746e(C90086ek.f250250B)) {
            aVar.copyOnWrite();
            C66489b bVar2 = (C66489b) aVar.instance;
            bVar2.f180791a |= 2048;
            bVar2.f180794d = false;
            return (C66489b) aVar.build();
        } else if (cVar.mo79746e(C90086ek.f250255G)) {
            int a = (int) cVar.mo79743a(C90086ek.f250305ad);
            aVar.copyOnWrite();
            C66489b bVar3 = (C66489b) aVar.instance;
            bVar3.f180791a |= 65536;
            bVar3.f180796f = a;
            aVar.copyOnWrite();
            C66489b bVar4 = (C66489b) aVar.instance;
            bVar4.f180791a |= C89885b.S3REQUEST_VALUE;
            bVar4.f180797g = a;
            aVar.copyOnWrite();
            C66489b bVar5 = (C66489b) aVar.instance;
            bVar5.f180791a |= 4;
            bVar5.f180792b = a;
            aVar.copyOnWrite();
            C66489b bVar6 = (C66489b) aVar.instance;
            bVar6.f180791a |= 8;
            bVar6.f180793c = a;
            aVar.copyOnWrite();
            C66489b bVar7 = (C66489b) aVar.instance;
            bVar7.f180791a |= 2048;
            bVar7.f180794d = true;
            return (C66489b) aVar.build();
        } else {
            aVar.copyOnWrite();
            C66489b bVar8 = (C66489b) aVar.instance;
            bVar8.f180791a |= 2048;
            bVar8.f180794d = true;
            return (C66489b) aVar.build();
        }
    }
}
