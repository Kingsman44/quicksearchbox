package com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.p6314a;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6278c.C80151b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80638b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80639c;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80640d;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81045c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81046d;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81047e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81048f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.base.C58889cz;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ai.a.a.c */
/* compiled from: PG */
public final class C80636c implements C80642f {

    /* renamed from: a */
    static final Duration f221375a = Duration.ofMinutes(5);

    /* renamed from: b */
    private final C58247c f221376b;

    /* renamed from: c */
    private final C83334w f221377c;

    /* renamed from: d */
    private final AtomicInteger f221378d = new AtomicInteger();

    public C80636c(C58889cz czVar, C83334w wVar) {
        C58254i iVar = new C58254i();
        iVar.mo54822f(f221375a.getSeconds(), TimeUnit.SECONDS);
        iVar.mo54823g(5);
        iVar.mo54824h(czVar);
        this.f221376b = iVar.mo54817a();
        this.f221377c = wVar;
    }

    /* renamed from: a */
    public final C80640d mo74375a(C80638b bVar) {
        C80639c cVar = (C80639c) C80640d.f221396c.createBuilder();
        int andIncrement = this.f221378d.getAndIncrement();
        cVar.copyOnWrite();
        C80640d dVar = (C80640d) cVar.instance;
        dVar.f221398a |= 1;
        dVar.f221399b = andIncrement;
        C80640d dVar2 = (C80640d) cVar.build();
        C83334w wVar = this.f221377c;
        C82887ec ecVar = C82887ec.CLIENT_CONFIGURATION;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        bVar.getClass();
        eaVar.f225980b = bVar;
        eaVar.f225979a = 99;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
        ((C58206am) this.f221376b).f155647a.put(dVar2, bVar);
        return dVar2;
    }

    /* renamed from: b */
    public final Optional mo74376b(C80640d dVar, boolean z) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null || (bVar.f221381a & 4) == 0) {
            return Optional.empty();
        }
        C81048f fVar = bVar.f221384d;
        if (fVar == null) {
            fVar = C81048f.f222138d;
        }
        if (z) {
            return Optional.m71637of(fVar);
        }
        if (fVar.f222140a == 1) {
            C81047e eVar = (C81047e) fVar.toBuilder();
            C81045c cVar = (C81045c) ((C81046d) fVar.f222141b).toBuilder();
            cVar.copyOnWrite();
            C81046d dVar2 = (C81046d) cVar.instance;
            dVar2.f222127a |= 1;
            dVar2.f222128b = false;
            eVar.copyOnWrite();
            C81048f fVar2 = (C81048f) eVar.instance;
            C81046d dVar3 = (C81046d) cVar.build();
            dVar3.getClass();
            fVar2.f222141b = dVar3;
            fVar2.f222140a = 1;
            fVar = (C81048f) eVar.build();
        }
        return Optional.m71637of(fVar);
    }

    /* renamed from: c */
    public final Optional mo74377c(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return Optional.empty();
        }
        if ((bVar.f221381a & 1024) == 0) {
            return Optional.empty();
        }
        C37462ck ckVar = bVar.f221392l;
        if (ckVar == null) {
            ckVar = C37462ck.f99442c;
        }
        return Optional.m71637of(ckVar);
    }

    /* renamed from: d */
    public final Optional mo74378d(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return Optional.empty();
        }
        if ((bVar.f221381a & 16) == 0) {
            return Optional.empty();
        }
        C37672hs hsVar = bVar.f221386f;
        if (hsVar == null) {
            hsVar = C37672hs.f100056c;
        }
        return Optional.m71637of(hsVar);
    }

    /* renamed from: e */
    public final Optional mo74379e(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return Optional.empty();
        }
        if ((bVar.f221381a & 8) == 0) {
            return Optional.empty();
        }
        C80471b a = C80471b.m128170a(bVar.f221385e);
        if (a == null) {
            a = C80471b.SODA;
        }
        return Optional.m71637of(a);
    }

    /* renamed from: f */
    public final Optional mo74380f(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return Optional.empty();
        }
        if ((bVar.f221381a & 4096) == 0) {
            return Optional.empty();
        }
        cf cfVar = bVar.f221394n;
        if (cfVar == null) {
            cfVar = cf.c;
        }
        return Optional.m71637of(cfVar);
    }

    /* renamed from: g */
    public final boolean mo74381g(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        return bVar != null && bVar.f221383c;
    }

    /* renamed from: h */
    public final boolean mo74382h(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return false;
        }
        return bVar.f221391k;
    }

    /* renamed from: i */
    public final boolean mo74383i(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return false;
        }
        return bVar.f221389i;
    }

    /* renamed from: j */
    public final boolean mo74384j(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return false;
        }
        return bVar.f221390j;
    }

    /* renamed from: k */
    public final boolean mo74385k(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return false;
        }
        return bVar.f221388h;
    }

    /* renamed from: l */
    public final boolean mo74386l(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (!(bVar == null || (bVar.f221381a & 4) == 0)) {
            C81048f fVar = bVar.f221384d;
            if (fVar == null) {
                fVar = C81048f.f222138d;
            }
            C80151b bVar2 = fVar.f222142c;
            if (bVar2 != null) {
                return bVar2.f219944b;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo74387m(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return false;
        }
        return bVar.f221387g;
    }

    /* renamed from: n */
    public final boolean mo74388n(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        return bVar == null || bVar.f221382b;
    }

    /* renamed from: o */
    public final boolean mo74389o(C80640d dVar) {
        C80638b bVar = (C80638b) ((C58206am) this.f221376b).f155647a.mo54792f(dVar);
        if (bVar == null) {
            return false;
        }
        return bVar.f221393m;
    }
}
