package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78527aj;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78528ak;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78529al;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78530am;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78533ap;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78554i;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78561p;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78563r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78567v;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80727db;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80791fl;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.af */
/* compiled from: PG */
public final class C78356af {

    /* renamed from: a */
    public final C78530am f215718a;

    /* renamed from: b */
    public Optional f215719b = Optional.empty();

    /* renamed from: c */
    public Optional f215720c = Optional.empty();

    /* renamed from: d */
    public Optional f215721d = Optional.empty();

    /* renamed from: e */
    public Optional f215722e = Optional.empty();

    /* renamed from: f */
    public C78533ap f215723f;

    /* renamed from: g */
    public C78533ap f215724g;

    /* renamed from: h */
    public C78533ap f215725h;

    /* renamed from: i */
    private Optional f215726i = Optional.empty();

    /* renamed from: j */
    private Optional f215727j = Optional.empty();

    /* renamed from: k */
    private final int f215728k;

    private C78356af(int i) {
        C78533ap apVar = C78533ap.f216277a;
        this.f215723f = apVar;
        this.f215724g = apVar;
        this.f215725h = apVar;
        this.f215728k = i;
        this.f215718a = C78540aw.m126175d();
    }

    /* renamed from: c */
    static C78356af m125854c(int i) {
        C78533ap apVar;
        C78356af afVar = new C78356af(i);
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    afVar.f215723f = C78533ap.f216281e;
                    C78533ap apVar2 = C78533ap.f216277a;
                    afVar.f215724g = apVar2;
                    afVar.f215725h = apVar2;
                } else if (i2 == 2) {
                    afVar.f215723f = C78533ap.f216281e;
                    afVar.f215724g = C78533ap.f216279c;
                    apVar = C78533ap.f216277a;
                }
                return afVar;
            }
            afVar.f215723f = C78533ap.f216281e;
            apVar = C78533ap.f216279c;
            afVar.f215724g = apVar;
            afVar.f215725h = apVar;
            return afVar;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C78540aw mo73311a() {
        int i;
        ((C78518aa) this.f215718a).f216257a = C78563r.m126231b(this.f215723f);
        ((C78518aa) this.f215718a).f216258b = C78554i.m126206a(this.f215724g);
        ((C78518aa) this.f215718a).f216259c = C78567v.m126238a(this.f215725h);
        int i2 = this.f215728k;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                if (this.f215727j.isPresent()) {
                    ((C78518aa) this.f215718a).f216258b = C78554i.m126207b((C80722cx) this.f215727j.get());
                } else if (this.f215721d.isPresent()) {
                    ((C78518aa) this.f215718a).f216257a = C78563r.m126230a((C80787fh) this.f215721d.get());
                }
                this.f215720c.ifPresent(new C78498x(this));
            } else if (i3 == 1) {
                Optional optional = this.f215722e;
                C78530am amVar = this.f215718a;
                Objects.requireNonNull(amVar);
                optional.ifPresent(new C78352ab(amVar));
                if (this.f215727j.isPresent()) {
                    C78530am amVar2 = this.f215718a;
                    C80722cx cxVar = (C80722cx) this.f215727j.get();
                    C80791fl flVar = (C80791fl) C80792fm.f221696l.createBuilder();
                    String k = cxVar.mo74502k();
                    flVar.copyOnWrite();
                    k.getClass();
                    ((C80792fm) flVar.instance).f221699b = k;
                    String j = cxVar.mo74501j();
                    flVar.copyOnWrite();
                    j.getClass();
                    ((C80792fm) flVar.instance).f221698a = j;
                    String i4 = cxVar.mo74500i();
                    flVar.copyOnWrite();
                    i4.getClass();
                    ((C80792fm) flVar.instance).f221708k = i4;
                    C80831aj e = cxVar.mo74494e();
                    flVar.copyOnWrite();
                    e.getClass();
                    ((C80792fm) flVar.instance).f221701d = e;
                    C78540aw awVar = C78540aw.f216294a;
                    C80587u a = cxVar.mo74490a();
                    a.getClass();
                    if (a.equals(C80587u.CLICK_SUGGESTION_TEXT_SECOND_LINE_ONLY)) {
                        i = 4;
                    } else {
                        C80587u a2 = cxVar.mo74490a();
                        a2.getClass();
                        i = a2.equals(C80587u.CLICK_DISABLED) ? 5 : 2;
                    }
                    flVar.copyOnWrite();
                    ((C80792fm) flVar.instance).f221707j = i - 2;
                    Optional h = cxVar.mo74498h();
                    Objects.requireNonNull(flVar);
                    h.ifPresent(new C78527aj(flVar));
                    C80727db d = cxVar.mo74493d();
                    flVar.copyOnWrite();
                    d.getClass();
                    ((C80792fm) flVar.instance).f221700c = d;
                    cxVar.mo74496f().ifPresent(new C78528ak(flVar));
                    int o = cxVar.mo74506o();
                    int i5 = o - 1;
                    if (o != 0) {
                        if (i5 == 0) {
                            flVar.copyOnWrite();
                            ((C80792fm) flVar.instance).f221705h = 0;
                        } else if (i5 == 1) {
                            flVar.copyOnWrite();
                            ((C80792fm) flVar.instance).f221705h = 1;
                        } else if (i5 == 2) {
                            flVar.copyOnWrite();
                            ((C80792fm) flVar.instance).f221705h = 2;
                        }
                        Optional g = cxVar.mo74497g();
                        Objects.requireNonNull(flVar);
                        g.ifPresent(new C78529al(flVar));
                        C80792fm fmVar = (C80792fm) flVar.build();
                        fmVar.getClass();
                        ((C78518aa) amVar2).f216257a = new C78561p(fmVar);
                    } else {
                        throw null;
                    }
                } else {
                    this.f215720c.ifPresent(new C78353ac(this));
                }
            } else if (i3 == 2) {
                if (this.f215727j.isPresent()) {
                    ((C78518aa) this.f215718a).f216258b = C78554i.m126207b((C80722cx) this.f215727j.get());
                    Optional optional2 = this.f215721d;
                    C78530am amVar3 = this.f215718a;
                    Objects.requireNonNull(amVar3);
                    optional2.ifPresent(new C78499y(amVar3));
                } else {
                    if (this.f215721d.isPresent()) {
                        ((C78518aa) this.f215718a).f216257a = C78563r.m126230a((C80787fh) this.f215721d.get());
                    }
                    this.f215720c.ifPresent(new C78500z(this));
                }
                this.f215726i.ifPresent(new C78351aa(this));
            }
            Optional optional3 = this.f215719b;
            C78530am amVar4 = this.f215718a;
            Objects.requireNonNull(amVar4);
            optional3.ifPresent(new C78354ad(amVar4));
            return this.f215718a.mo73434a();
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo73312b(Optional optional, Optional optional2, Optional optional3, Optional optional4, C78537at atVar) {
        this.f215727j = optional;
        this.f215726i = optional2;
        this.f215721d = optional3;
        this.f215722e = optional4;
        this.f215720c = Optional.m71637of(atVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo73313d(C78393bp bpVar) {
        mo73312b(bpVar.mo73356c(), bpVar.mo73357d(), bpVar.mo73358e(), bpVar.mo73359f(), (C78537at) bpVar.mo73355b().mo76657c());
    }
}
