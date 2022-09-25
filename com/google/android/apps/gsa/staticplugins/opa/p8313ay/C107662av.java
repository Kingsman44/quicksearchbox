package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.av */
/* compiled from: PG */
public final class C107662av {

    /* renamed from: a */
    public final C86124t f299653a;

    /* renamed from: b */
    public boolean f299654b;

    /* renamed from: c */
    public boolean f299655c;

    /* renamed from: d */
    private final C68214a f299656d;

    /* renamed from: e */
    private boolean f299657e;

    /* renamed from: f */
    private final AtomicBoolean f299658f = new AtomicBoolean(true);

    /* renamed from: g */
    private int f299659g;

    public C107662av(C68214a aVar, C86124t tVar) {
        this.f299656d = aVar;
        this.f299653a = tVar;
        m178752g();
    }

    /* renamed from: g */
    private final void m178752g() {
        this.f299654b = false;
        this.f299657e = false;
        this.f299655c = false;
        this.f299659g = 1;
    }

    /* renamed from: a */
    public final void mo96205a(C89849ae aeVar) {
        if (this.f299653a.mo79746e(C90063do.f249404cr)) {
            C58976aa aaVar = C58975e.f156826a;
            aeVar.name();
            ((C89859i) this.f299656d.mo27525b()).mo83702b(aeVar);
        }
    }

    /* renamed from: b */
    public final void mo96206b(C89849ae aeVar, Optional optional, Optional optional2) {
        if (this.f299653a.mo79746e(C90063do.f249404cr)) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            Objects.requireNonNull(ajVar);
            optional.ifPresent(new C107660at(ajVar));
            C59568x xVar = (C59568x) ((C59569y) optional2.orElseGet(C107661au.f299652a)).toBuilder();
            int i = this.f299659g;
            xVar.copyOnWrite();
            C59569y yVar = (C59569y) xVar.instance;
            int i2 = i - 1;
            if (i != 0) {
                yVar.f158071d = i2;
                yVar.f158068a |= 16;
                boolean andSet = this.f299658f.getAndSet(false);
                xVar.copyOnWrite();
                C59569y yVar2 = (C59569y) xVar.instance;
                yVar2.f158068a |= 64;
                yVar2.f158073f = andSet;
                C59569y yVar3 = (C59569y) xVar.build();
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                yVar3.getClass();
                cbVar.f160107as = yVar3;
                cbVar.f160122c |= 512;
                C89856f fVar = new C89856f();
                fVar.f246201a = aeVar;
                fVar.f246203c = (C59687cb) ajVar.build();
                C89857g a = fVar.mo83699a();
                if (this.f299653a.mo79746e(C90063do.f249404cr)) {
                    C58976aa aaVar = C58975e.f156826a;
                    ((C89859i) this.f299656d.mo27525b()).mo74236a(a);
                }
                m178752g();
                return;
            }
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo96207c() {
        this.f299657e = true;
        mo96205a(C89849ae.AGSA_TEXT_TAPAS_INLINE_SUGGESTION_CLICK);
    }

    /* renamed from: d */
    public final void mo96208d(C59529cz czVar, C59569y yVar) {
        mo96206b(C89849ae.AGSA_TEXT_TAPAS_SUGGESTION_SUBMIT, Optional.m71637of(czVar), Optional.m71637of(yVar));
    }

    /* renamed from: e */
    public final void mo96209e(Optional optional) {
        if (this.f299653a.mo79746e(C90029ch.f248215aB) && this.f299655c) {
            mo96206b(C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_DISMISS, optional, Optional.empty());
        } else if (this.f299654b) {
            mo96206b(C89849ae.AGSA_TEXT_TAPAS_DISMISS_AFTER_ATTENTION, optional, Optional.empty());
        } else if (this.f299657e) {
            mo96206b(C89849ae.AGSA_TEXT_TAPAS_DISMISS_AFTER_INLINE_SUGGESTION_CLICK, optional, Optional.empty());
        } else {
            mo96206b(C89849ae.AGSA_TEXT_EXPERIENCE_DISMISS, optional, Optional.empty());
        }
    }

    /* renamed from: f */
    public final void mo96210f(int i) {
        if (!(this.f299659g == 6 && i == 5)) {
            this.f299659g = i;
        }
        mo96205a(C89849ae.AGSA_TEXT_START);
    }
}
