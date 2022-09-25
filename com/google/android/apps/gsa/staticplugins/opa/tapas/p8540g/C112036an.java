package com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.p4184bj.p4214f.C56028b;
import com.google.p4184bj.p4214f.C56030d;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.g.an */
/* compiled from: PG */
public final class C112036an {

    /* renamed from: c */
    private static final C59071e f311209c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.g.an");

    /* renamed from: a */
    public final C48570ad f311210a;

    /* renamed from: b */
    public final C86124t f311211b;

    public C112036an(C48570ad adVar, C86124t tVar) {
        this.f311210a = adVar;
        this.f311211b = tVar;
    }

    /* renamed from: f */
    public static Optional m185879f(C48570ad adVar, C86124t tVar) {
        if (tVar.mo79746e(C90063do.f249401co) && (adVar.f125483a & 4) != 0) {
            C56030d dVar = adVar.f125485c;
            if (dVar == null) {
                dVar = C56030d.f149209c;
            }
            return Optional.m71637of(dVar.f149211a);
        } else if ((adVar.f125483a & 1) == 0) {
            return Optional.empty();
        } else {
            C61752n nVar = adVar.f125484b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            return Optional.m71637of(nVar.f166811b);
        }
    }

    /* renamed from: i */
    public static Stream m185880i(C56030d dVar, String... strArr) {
        return Collection.EL.stream(dVar.f149212b).filter(new C112055r(C58528ij.m90008H(strArr))).filter(C112056s.f311230a).map(C112057t.f311231a);
    }

    /* renamed from: a */
    public final C58485gu mo99339a(String... strArr) {
        if (this.f311211b.mo79746e(C90063do.f249401co)) {
            C48570ad adVar = this.f311210a;
            if ((adVar.f125483a & 4) != 0) {
                C56030d dVar = adVar.f125485c;
                if (dVar == null) {
                    dVar = C56030d.f149209c;
                }
                return (C58485gu) m185880i(dVar, strArr).collect(C58370cn.f155946a);
            }
        }
        C48570ad adVar2 = this.f311210a;
        if ((adVar2.f125483a & 1) == 0) {
            return C58485gu.m89845m();
        }
        C61752n nVar = adVar2.f125484b;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        return (C58485gu) C112050m.m185897c(nVar, strArr).map(C112044g.f311218a).map(C112045h.f311219a).flatMap(C112046i.f311220a).map(C112047j.f311221a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final Optional mo99340b(String str) {
        if (this.f311211b.mo79746e(C90063do.f249401co)) {
            C56030d dVar = this.f311210a.f125485c;
            if (dVar == null) {
                dVar = C56030d.f149209c;
            }
            Optional findFirst = m185880i(dVar, str).findFirst();
            if (findFirst.isPresent()) {
                C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
                C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
                String str2 = (String) findFirst.get();
                sVar.copyOnWrite();
                C61758t tVar = (C61758t) sVar.instance;
                str2.getClass();
                tVar.f166826a = 1;
                tVar.f166827b = str2;
                iVar.copyOnWrite();
                C61748j jVar = (C61748j) iVar.instance;
                C61758t tVar2 = (C61758t) sVar.build();
                tVar2.getClass();
                jVar.f166803b = tVar2;
                jVar.f166802a = 3;
                return Optional.m71637of((C61748j) iVar.build());
            }
        }
        C48570ad adVar = this.f311210a;
        if ((1 & adVar.f125483a) != 0) {
            C61752n nVar = adVar.f125484b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            return C112050m.m185895a(nVar, str);
        }
        C59104x d = f311209c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TapasIntpnAccessor");
        ((C59052c) ((C59052c) d).mo56372aa(27481)).mo56354G("Argument %s doesn't exist in Interpretation: \n%s", str, this.f311210a);
        return Optional.empty();
    }

    /* renamed from: c */
    public final Optional mo99341c(C61748j jVar) {
        C61752n nVar;
        if (this.f311211b.mo79746e(C90063do.f249401co)) {
            int i = this.f311210a.f125483a;
        }
        if ((this.f311210a.f125483a & 1) == 0 || jVar.f166802a != 2 || !((C61752n) jVar.f166803b).f166811b.equals("ArgumentFactoryDatetimeDurationRecurrence")) {
            return Optional.empty();
        }
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        return C112050m.m185895a(nVar, "datetime").filter(C112051n.f311225a).map(C112062y.f311236a);
    }

    /* renamed from: d */
    public final Optional mo99342d() {
        if (!this.f311211b.mo79746e(C90063do.f249401co)) {
            C48570ad adVar = this.f311210a;
            if ((adVar.f125483a & 1) != 0) {
                C61752n nVar = adVar.f125484b;
                if (nVar == null) {
                    nVar = C61752n.f166808f;
                }
                return Optional.m71637of(nVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: e */
    public final Optional mo99343e() {
        return m185879f(this.f311210a, this.f311211b);
    }

    /* renamed from: h */
    public final Optional mo99345h(String str) {
        if (this.f311211b.mo79746e(C90063do.f249401co)) {
            C48570ad adVar = this.f311210a;
            if ((adVar.f125483a & 4) != 0) {
                C56030d dVar = adVar.f125485c;
                if (dVar == null) {
                    dVar = C56030d.f149209c;
                }
                return m185880i(dVar, str).findFirst();
            }
        }
        C48570ad adVar2 = this.f311210a;
        if ((1 & adVar2.f125483a) == 0) {
            return Optional.empty();
        }
        C61752n nVar = adVar2.f125484b;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        return C112050m.m185896b(nVar, str);
    }

    /* renamed from: j */
    public final boolean mo99346j() {
        return this.f311211b.mo79746e(C90063do.f249401co) ? this.f311211b.mo79746e(C90063do.f249401co) && (this.f311210a.f125483a & 4) != 0 : !this.f311211b.mo79746e(C90063do.f249401co) && 1 == (this.f311210a.f125483a & 1);
    }

    /* renamed from: k */
    public final String mo99347k() {
        if (this.f311211b.mo79746e(C90063do.f249401co)) {
            C48570ad adVar = this.f311210a;
            if ((adVar.f125483a & 4) != 0) {
                C56030d dVar = adVar.f125485c;
                if (dVar == null) {
                    dVar = C56030d.f149209c;
                }
                return ((C56028b) dVar.f149212b.get(0)).f149207c;
            }
        }
        C48570ad adVar2 = this.f311210a;
        if ((adVar2.f125483a & 1) != 0) {
            C61752n nVar = adVar2.f125484b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            return ((C61746h) nVar.f166812c.get(0)).f166796d;
        }
        throw new ArrayIndexOutOfBoundsException(0);
    }

    /* renamed from: g */
    public final Optional mo99344g(C58495hd hdVar, String str) {
        Optional optional;
        C48570ad adVar = this.f311210a;
        if ((adVar.f125483a & 1) != 0) {
            C61752n nVar = adVar.f125484b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            optional = Optional.m71637of(nVar);
        } else {
            optional = Optional.empty();
        }
        Optional flatMap = optional.flatMap(C112025ac.f311198a).filter(C112026ad.f311199a).map(C112027ae.f311200a).flatMap(new C112028af(str));
        Objects.requireNonNull(hdVar);
        return flatMap.map(new C112029ag(hdVar));
    }
}
