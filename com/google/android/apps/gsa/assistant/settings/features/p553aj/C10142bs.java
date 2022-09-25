package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bw;
import com.google.android.apps.gsa.assistant.settings.features.av.bz;
import com.google.android.apps.gsa.assistant.settings.features.av.cy;
import com.google.android.apps.gsa.assistant.settings.features.av.cz;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72866ao;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72883t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.acx;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.bs */
/* compiled from: PG */
final class C10142bs implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10141br f34496a;

    public C10142bs(C10141br brVar) {
        this.f34496a = brVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C72883t tVar = (C72883t) bVar;
        C10141br brVar = this.f34496a;
        int a = C72866ao.m107597a(tVar.mo64584a().d);
        if (a != 0 && a == 21 && tVar.mo64585b() == 3) {
            dn dnVar = brVar.f34490c;
            aq createBuilder = ar.f.createBuilder();
            C45595b bVar2 = C45595b.GOOGLE_ASSISTANT_ANDROID_PERSONAL_RESULTS_SETTINGS;
            createBuilder.copyOnWrite();
            ar arVar = createBuilder.instance;
            arVar.b = bVar2.f119929nK;
            arVar.a |= 1;
            List list = (List) Collection.EL.stream(dnVar.b.f129041a).filter(cy.a).map(bw.a).collect(Collectors.toList());
            List list2 = (List) Collection.EL.stream(dnVar.c.f129690a).filter(cz.a).map(bz.a).collect(Collectors.toList());
            acx e = dn.e(new acx[]{dnVar.c(list2, false), dnVar.A(list, 2)});
            dnVar.G(list, 2);
            dnVar.n(list2, false);
            dnVar.h(e, createBuilder.build());
        }
        brVar.mo18277a();
        return C47392e.f123115a;
    }
}
