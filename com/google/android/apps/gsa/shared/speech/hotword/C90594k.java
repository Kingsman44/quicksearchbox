package com.google.android.apps.gsa.shared.speech.hotword;

import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17015l;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17143f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4580v.C60950i;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.k */
/* compiled from: PG */
public final class C90594k implements C68220f {
    /* renamed from: a */
    public static Optional m147811a(Optional optional, Optional optional2, Optional optional3, C17015l lVar, C60950i iVar) {
        Optional optional4;
        if (optional.isEmpty()) {
            optional4 = Optional.empty();
        } else if (optional2.isEmpty()) {
            optional4 = Optional.empty();
        } else if (optional3.isEmpty()) {
            optional4 = Optional.empty();
        } else {
            C17143f fVar = new C17143f();
            fVar.mo23208b((C17039af) optional.get());
            fVar.f49835b = iVar;
            fVar.f49836c = C90591h.f253268a;
            fVar.f49838e = C90592i.f253269a;
            fVar.f49837d = C90593j.f253270a;
            optional4 = Optional.m71637of(new C90590g((C90851k) optional2.get(), (C42813k) optional3.get(), lVar, fVar.mo23207a()));
        }
        C68225k.m98532d(optional4);
        return optional4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
