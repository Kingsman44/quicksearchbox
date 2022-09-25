package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10190e;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10262g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10263h;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.C49849bg;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ay */
/* compiled from: PG */
final class C10219ay implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10216av f34690a;

    public C10219ay(C10216av avVar) {
        this.f34690a = avVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C10190e eVar = (C10190e) bVar;
        C10201ag agVar = this.f34690a.f34668d;
        C49849bg bgVar = eVar.f34613a;
        Optional optional = eVar.f34614b;
        C10262g gVar = (C10262g) C10263h.f34789f.createBuilder();
        optional.ifPresent(new C10195aa(gVar));
        gVar.copyOnWrite();
        C10263h hVar = (C10263h) gVar.instance;
        bgVar.getClass();
        hVar.f34793c = bgVar;
        hVar.f34792b = 5;
        C10421s.m25380a((C10263h) gVar.build()).showNow(agVar.getChildFragmentManager(), "AppShortcutDialog");
        return C47392e.f123115a;
    }
}
