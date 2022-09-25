package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10262g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10263h;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10268m;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10269n;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10279x;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cu */
/* compiled from: PG */
public final class C10302cu {
    /* renamed from: a */
    public static void m25218a(Fragment fragment, String str, Optional optional) {
        C10279x xVar;
        C10268m mVar = (C10268m) C10269n.f34808d.createBuilder();
        mVar.copyOnWrite();
        C10269n nVar = (C10269n) mVar.instance;
        str.getClass();
        nVar.f34810a |= 1;
        nVar.f34811b = str;
        if (optional.isPresent()) {
            xVar = (C10279x) optional.get();
        } else {
            xVar = C10279x.f34833d;
        }
        mVar.copyOnWrite();
        C10269n nVar2 = (C10269n) mVar.instance;
        xVar.getClass();
        nVar2.f34812c = xVar;
        nVar2.f34810a |= 2;
        C10228bd bdVar = new C10228bd();
        C68324h.m98669f(bdVar);
        C47243l.m84039a(bdVar, (C10269n) mVar.build());
        bdVar.showNow(fragment.getChildFragmentManager(), "ConfirmationDialog");
    }

    /* renamed from: b */
    public static void m25219b(Fragment fragment, C10273r rVar) {
        C10262g gVar = (C10262g) C10263h.f34789f.createBuilder();
        C49826ak akVar = rVar.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        gVar.copyOnWrite();
        C10263h hVar = (C10263h) gVar.instance;
        akVar.getClass();
        hVar.f34793c = akVar;
        hVar.f34792b = 1;
        long j = rVar.f34822d;
        gVar.copyOnWrite();
        C10263h hVar2 = (C10263h) gVar.instance;
        hVar2.f34791a = 1 | hVar2.f34791a;
        hVar2.f34794d = j;
        C49838aw awVar = rVar.f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        gVar.copyOnWrite();
        C10263h hVar3 = (C10263h) gVar.instance;
        awVar.getClass();
        hVar3.f34795e = awVar;
        hVar3.f34791a |= 2;
        C10421s.m25380a((C10263h) gVar.build()).showNow(fragment.getChildFragmentManager(), "AppShortcutDialog");
    }
}
