package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.assistant.shared.appactions.b.u;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107259a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.C49840ay;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.r */
/* compiled from: PG */
final class C107317r implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C107316q f298663a;

    public C107317r(C107316q qVar) {
        this.f298663a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        Optional optional;
        C107259a aVar = (C107259a) bVar;
        C107316q qVar = this.f298663a;
        qVar.f298656a.setResult(10);
        aVar.f298545a.mo95857h().ifPresent(new C107310k(qVar));
        C107308i iVar = aVar.f298545a;
        if (iVar.mo95866p() == 4) {
            u uVar = qVar.f298662g;
            String str = (String) iVar.mo95857h().get();
            Optional i = aVar.f298545a.mo95859i();
            if (i.isEmpty() || ((C49840ay) i.get()).f129516c.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(((C49840ay) i.get()).f129516c);
            }
            uVar.e(str, optional);
        }
        return C47392e.f123115a;
    }
}
