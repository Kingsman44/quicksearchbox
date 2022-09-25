package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72866ao;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72883t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.bl */
/* compiled from: PG */
final class C10135bl implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10134bk f34480a;

    public C10135bl(C10134bk bkVar) {
        this.f34480a = bkVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C72883t tVar = (C72883t) bVar;
        C10134bk bkVar = this.f34480a;
        int a = C72866ao.m107597a(tVar.mo64584a().d);
        if (a != 0 && a == 20 && tVar.mo64585b() == 3) {
            dn dnVar = bkVar.f34472d;
            String str = bkVar.f34470b;
            aq createBuilder = ar.f.createBuilder();
            C45595b bVar2 = C45595b.GOOGLE_ASSISTANT_ANDROID_PERSONAL_RESULTS_SETTINGS;
            createBuilder.copyOnWrite();
            ar arVar = createBuilder.instance;
            arVar.b = bVar2.f119929nK;
            arVar.a |= 1;
            dnVar.v(str, false, createBuilder.build());
        }
        bkVar.mo18271a();
        return C47392e.f123115a;
    }
}
