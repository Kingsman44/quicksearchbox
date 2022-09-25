package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8574a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113246a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113501m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48692b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48722d;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import com.google.assistant.p3825an.p3830c.p3831a.C49348y;
import com.google.common.base.C58810aa;
import com.google.common.p4522b.C58495hd;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54773u;
import com.google.protobuf.C62995dn;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.a.d */
/* compiled from: PG */
abstract class C113225d extends C58810aa {
    /* renamed from: a */
    public abstract void mo99911a(C48722d dVar, C113501m mVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo17535b(Object obj) {
        C48722d dVar = (C48722d) obj;
        C113501m n = C113502n.m187946n();
        if ((dVar.f126071a & 1) != 0) {
            ((C113246a) n).f313591a = Optional.m71637of(dVar.f126072b);
        }
        if ((dVar.f126071a & 2) != 0) {
            ((C113246a) n).f313592b = Optional.m71637of(dVar.f126073c);
        }
        if ((dVar.f126071a & 4) != 0) {
            C48582b a = C48582b.m85243a(dVar.f126074d);
            if (a == null) {
                a = C48582b.UNKNOWN_ACTION;
            }
            ((C113246a) n).f313593c = Optional.m71637of(a);
        }
        if ((dVar.f126071a & 8) != 0) {
            C54758f fVar = dVar.f126075e;
            if (fVar == null) {
                fVar = C54758f.f143676b;
            }
            ((C113246a) n).f313594d = Optional.m71637of(fVar);
        }
        if ((dVar.f126071a & 16) != 0) {
            C54773u uVar = dVar.f126076f;
            if (uVar == null) {
                uVar = C54773u.f143704c;
            }
            ((C113246a) n).f313596f = Optional.m71637of(uVar);
        }
        if ((dVar.f126071a & 32) != 0) {
            C49308c cVar = dVar.f126077g;
            if (cVar == null) {
                cVar = C49308c.f127443c;
            }
            ((C113246a) n).f313597g = Optional.m71637of(cVar);
        }
        if ((dVar.f126071a & 64) != 0) {
            C49348y a2 = C49348y.m85417a(dVar.f126078h);
            if (a2 == null) {
                a2 = C49348y.PRIORITY_NONE;
            }
            ((C113246a) n).f313598h = Optional.m71637of(a2);
        }
        if ((dVar.f126071a & 128) != 0) {
            ((C113246a) n).f313599i = Optional.m71637of(dVar.f126079i);
        }
        mo99911a(dVar, n);
        mo99913e(dVar, n);
        if ((dVar.f126071a & 256) != 0) {
            mo99912d(dVar, n);
        }
        return n.mo99919a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17536c(Object obj) {
        C113502n nVar = (C113502n) obj;
        C48692b bVar = (C48692b) C48722d.f126069m.createBuilder();
        if (nVar.mo100043g().isPresent() && nVar.mo100043g().isPresent()) {
            String str = (String) nVar.mo100043g().get();
            bVar.copyOnWrite();
            C48722d dVar = (C48722d) bVar.instance;
            str.getClass();
            dVar.f126071a |= 1;
            dVar.f126072b = str;
        }
        if (nVar.mo100047j().isPresent() && nVar.mo100047j().isPresent()) {
            String str2 = (String) nVar.mo100047j().get();
            bVar.copyOnWrite();
            C48722d dVar2 = (C48722d) bVar.instance;
            str2.getClass();
            dVar2.f126071a |= 2;
            dVar2.f126073c = str2;
        }
        if (nVar.mo100042f().isPresent() && nVar.mo100042f().isPresent()) {
            bVar.copyOnWrite();
            C48722d dVar3 = (C48722d) bVar.instance;
            dVar3.f126074d = ((C48582b) nVar.mo100042f().get()).f125574q;
            dVar3.f126071a |= 4;
        }
        if (nVar.mo100046i().isPresent() && nVar.mo100046i().isPresent()) {
            C54758f fVar = (C54758f) nVar.mo100046i().get();
            bVar.copyOnWrite();
            C48722d dVar4 = (C48722d) bVar.instance;
            fVar.getClass();
            dVar4.f126075e = fVar;
            dVar4.f126071a |= 8;
        }
        if (nVar.mo100040e().isPresent() && nVar.mo100040e().isPresent()) {
            C54773u uVar = (C54773u) nVar.mo100040e().get();
            bVar.copyOnWrite();
            C48722d dVar5 = (C48722d) bVar.instance;
            uVar.getClass();
            dVar5.f126076f = uVar;
            dVar5.f126071a |= 16;
        }
        if (nVar.mo100048k().isPresent() && nVar.mo100048k().isPresent()) {
            C49308c cVar = (C49308c) nVar.mo100048k().get();
            bVar.copyOnWrite();
            C48722d dVar6 = (C48722d) bVar.instance;
            cVar.getClass();
            dVar6.f126077g = cVar;
            dVar6.f126071a |= 32;
        }
        if (nVar.mo100050m().isPresent() && nVar.mo100050m().isPresent()) {
            bVar.copyOnWrite();
            C48722d dVar7 = (C48722d) bVar.instance;
            dVar7.f126078h = ((C49348y) nVar.mo100050m().get()).getNumber();
            dVar7.f126071a |= 64;
        }
        if (nVar.mo100049l().isPresent() && nVar.mo100049l().isPresent()) {
            String str3 = (String) nVar.mo100049l().get();
            bVar.copyOnWrite();
            C48722d dVar8 = (C48722d) bVar.instance;
            str3.getClass();
            dVar8.f126071a |= 128;
            dVar8.f126079i = str3;
        }
        mo99914f(nVar, bVar);
        C58495hd l = C58495hd.m89898l(nVar.mo100038c());
        bVar.copyOnWrite();
        C48722d dVar9 = (C48722d) bVar.instance;
        C62995dn dnVar = dVar9.f126081k;
        if (!dnVar.f170058b) {
            dVar9.f126081k = dnVar.mo58980a();
        }
        dVar9.f126081k.putAll(l);
        mo99915g(nVar, bVar);
        return (C48722d) bVar.build();
    }

    /* renamed from: d */
    public abstract void mo99912d(C48722d dVar, C113501m mVar);

    /* renamed from: e */
    public void mo99913e(C48722d dVar, C113501m mVar) {
        throw null;
    }

    /* renamed from: f */
    public abstract void mo99914f(C113502n nVar, C48692b bVar);

    /* renamed from: g */
    public abstract void mo99915g(C113502n nVar, C48692b bVar);
}
