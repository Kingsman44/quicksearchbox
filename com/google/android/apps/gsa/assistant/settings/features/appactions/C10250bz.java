package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10192g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bz */
/* compiled from: PG */
final class C10250bz implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10249by f34762a;

    public C10250bz(C10249by byVar) {
        this.f34762a = byVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C10192g gVar = (C10192g) bVar;
        C10249by byVar = this.f34762a;
        C10273r rVar = gVar.f34615a;
        if (gVar.f34616b) {
            C10302cu.m25219b(byVar.f34745c, rVar);
        } else {
            byVar.f34755m = Optional.m71637of(rVar);
            byVar.f34756n = Optional.m71637of(C10383ae.m25345a(rVar));
            byVar.f34757o = Optional.m71637of(true);
            C46439e eVar = byVar.f34753k;
            C10325al alVar = byVar.f34747e;
            C49838aw awVar = ((C10273r) byVar.f34756n.get()).f34820b;
            if (awVar == null) {
                awVar = C49838aw.f129504g;
            }
            String str = awVar.f129507b;
            C49826ak akVar = ((C10273r) byVar.f34756n.get()).f34821c;
            if (akVar == null) {
                akVar = C49826ak.f129462q;
            }
            eVar.mo50445g(new C46438d(alVar.mo18427i(str, akVar, Optional.m71637of(Long.valueOf(((C10273r) byVar.f34756n.get()).f34822d)))), new C46436b((Object) null), byVar.f34754l);
        }
        return C47392e.f123115a;
    }
}
