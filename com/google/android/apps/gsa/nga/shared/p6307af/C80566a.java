package com.google.android.apps.gsa.nga.shared.p6307af;

import com.google.android.apps.gsa.nga.shared.p6328ap.C80983c;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80984d;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80986f;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123702a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123790s;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a */
/* compiled from: PG */
public final class C80566a {

    /* renamed from: a */
    private final C80987g f221150a;

    public C80566a(C80987g gVar) {
        this.f221150a = gVar;
    }

    /* renamed from: a */
    public final C123733b mo74351a(Optional optional) {
        Optional optional2;
        C123702a aVar = (C123702a) C123733b.f341776d.createBuilder();
        if (optional.isPresent()) {
            C123791t tVar = (C123791t) optional.get();
            aVar.copyOnWrite();
            C123733b bVar = (C123733b) aVar.instance;
            tVar.getClass();
            bVar.f341780b = tVar;
            bVar.f341779a |= 1;
        } else {
            C80987g gVar = this.f221150a;
            Optional e = gVar.mo74768e();
            if (e.isEmpty()) {
                optional2 = Optional.empty();
            } else {
                optional2 = C80987g.m128859c(e).map(C80983c.f221996a).map(new C80984d(gVar));
            }
            if (optional2.isPresent()) {
                C123790s sVar = (C123790s) C123791t.f341978d.createBuilder();
                String a = ((C80986f) optional2.get()).mo74763a();
                sVar.copyOnWrite();
                C123791t tVar2 = (C123791t) sVar.instance;
                a.getClass();
                tVar2.f341980a |= 1;
                tVar2.f341981b = a;
                boolean b = ((C80986f) optional2.get()).mo74764b();
                sVar.copyOnWrite();
                C123791t tVar3 = (C123791t) sVar.instance;
                tVar3.f341980a |= 2;
                tVar3.f341982c = b;
                aVar.copyOnWrite();
                C123733b bVar2 = (C123733b) aVar.instance;
                C123791t tVar4 = (C123791t) sVar.build();
                tVar4.getClass();
                bVar2.f341780b = tVar4;
                bVar2.f341779a |= 1;
            }
        }
        return (C123733b) aVar.build();
    }
}
