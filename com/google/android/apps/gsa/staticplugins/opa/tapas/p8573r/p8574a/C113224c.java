package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8574a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113246a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113501m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.p3791b.C48692b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48722d;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.a.c */
/* compiled from: PG */
public final class C113224c extends C113225d {
    /* renamed from: a */
    public final void mo99911a(C48722d dVar, C113501m mVar) {
        mVar.mo99921c(C58495hd.m89898l(Collections.unmodifiableMap(dVar.f126080j)));
    }

    /* renamed from: d */
    public final void mo99912d(C48722d dVar, C113501m mVar) {
        if ((dVar.f126071a & 256) != 0) {
            Objects.requireNonNull(dVar);
            ((C113246a) mVar).f313602l = Optional.m71637of(new C113222a(dVar));
        }
    }

    /* renamed from: e */
    public final void mo99913e(C48722d dVar, C113501m mVar) {
        mVar.mo99922d(C58495hd.m89898l(Collections.unmodifiableMap(dVar.f126081k)));
    }

    /* renamed from: f */
    public final void mo99914f(C113502n nVar, C48692b bVar) {
        C58495hd b = nVar.mo100037b();
        bVar.copyOnWrite();
        C48722d dVar = (C48722d) bVar.instance;
        C48722d dVar2 = C48722d.f126069m;
        C62995dn dnVar = dVar.f126080j;
        if (!dnVar.f170058b) {
            dVar.f126080j = dnVar.mo58980a();
        }
        dVar.f126080j.putAll(b);
    }

    /* renamed from: g */
    public final void mo99915g(C113502n nVar, C48692b bVar) {
        Optional q = nVar.mo99957q();
        Objects.requireNonNull(bVar);
        q.ifPresent(new C113223b(bVar));
    }
}
