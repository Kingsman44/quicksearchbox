package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10186a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10264i;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10266k;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10267l;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.C49838aw;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.e */
/* compiled from: PG */
final class C10374e implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10308d f35072a;

    public C10374e(C10308d dVar) {
        this.f35072a = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C10308d dVar = this.f35072a;
        C49838aw awVar = ((C10186a) bVar).f34607a;
        C10264i iVar = (C10264i) C10267l.f34802e.createBuilder();
        C10266k kVar = C10266k.APP_SPECIFIC_PAGE;
        iVar.copyOnWrite();
        C10267l lVar = (C10267l) iVar.instance;
        lVar.f34807d = kVar.f34801d;
        lVar.f34804a |= 1;
        iVar.copyOnWrite();
        C10267l lVar2 = (C10267l) iVar.instance;
        awVar.getClass();
        lVar2.f34806c = awVar;
        lVar2.f34805b = 2;
        dVar.mo18406c((C10267l) iVar.build());
        return C47392e.f123115a;
    }
}
