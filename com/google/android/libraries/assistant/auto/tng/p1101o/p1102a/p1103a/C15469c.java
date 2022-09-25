package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1103a;

import com.google.android.libraries.assistant.auto.ondevice.p710d.C11873a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15487m;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.a.c */
/* compiled from: PG */
public final class C15469c implements C15481g {

    /* renamed from: a */
    public static final C59071e f46393a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.o.a.a.c");

    /* renamed from: b */
    private final C15488n f46394b;

    /* renamed from: c */
    private final C15487m f46395c;

    /* renamed from: d */
    private final Optional f46396d;

    /* renamed from: e */
    private final Optional f46397e;

    /* renamed from: f */
    private final Executor f46398f;

    public C15469c(C15488n nVar, C37266j jVar, C15487m mVar, Executor executor, Optional optional, Optional optional2) {
        this.f46394b = nVar;
        jVar.mo40826a();
        this.f46395c = mVar;
        this.f46398f = executor;
        this.f46396d = optional;
        this.f46397e = optional2;
    }

    /* renamed from: a */
    public final C37215b mo22351a() {
        return this.f46394b;
    }

    /* renamed from: b */
    public final void mo22352b(C37254c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = cVar.mo40778b().f98906a;
        this.f46394b.mo19974a(cVar);
    }

    /* renamed from: c */
    public final void mo22353c(C37252a aVar, Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        int i = aVar.mo40778b().f98906a;
        if (optional.isPresent()) {
            this.f46394b.mo19975b(aVar, (C15474b) optional.get());
        } else {
            mo22352b(aVar);
        }
    }

    /* renamed from: d */
    public final void mo22354d(C37259h hVar, C62722b bVar, Optional optional) {
        mo22357g(hVar, bVar, optional, Optional.empty());
    }

    /* renamed from: e */
    public final void mo22355e(C37259h hVar, C12991i iVar, C62722b bVar, Optional optional) {
        Optional optional2;
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        if ((yVar.f40415a & 1) != 0) {
            C13007y yVar2 = iVar.f40383b;
            if (yVar2 == null) {
                yVar2 = C13007y.f40413d;
            }
            optional2 = Optional.m71637of(Long.valueOf(yVar2.f40416b));
        } else {
            optional2 = Optional.empty();
        }
        Optional of = Optional.m71637of(this.f46395c.mo22362a(iVar, Optional.m71637of(bVar), Optional.empty()));
        if (of.isPresent() && optional.isPresent()) {
            of = Optional.m71637of((C15474b) ((C58817ah) optional.get()).apply((C15474b) of.get()));
        }
        mo22357g(hVar, bVar, optional2, of);
    }

    /* renamed from: f */
    public final void mo22356f(C37259h hVar, C62722b bVar, Optional optional, Optional optional2) {
        if (this.f46396d.isEmpty() || this.f46397e.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            mo22357g(hVar, bVar, optional, optional2);
            return;
        }
        C60870cx b = ((C16850a) this.f46397e.get()).mo23063b();
        C11873a aVar = (C11873a) this.f46396d.get();
        C47633f g = C47633f.m84733g(b);
        Objects.requireNonNull(aVar);
        C47633f i = g.mo51516i(new C15467a(aVar), this.f46398f);
        C15468b bVar2 = new C15468b(this, optional2, hVar, bVar, optional);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(bVar2), this.f46398f);
    }

    /* renamed from: g */
    public final void mo22357g(C37259h hVar, C62722b bVar, Optional optional, Optional optional2) {
        C37252a e = hVar.mo40781e(bVar);
        C15480f.m32212a(e, optional);
        mo22353c(e, optional2);
    }
}
