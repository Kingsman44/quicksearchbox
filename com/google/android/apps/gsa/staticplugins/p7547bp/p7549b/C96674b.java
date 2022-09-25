package com.google.android.apps.gsa.staticplugins.p7547bp.p7549b;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.C87359a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90190c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90191d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90192e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90193f;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90194g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99403at;
import com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99414k;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.C99430a;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.p7784a.C99431a;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.p7784a.C99432b;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1905c.p1906a.p1907a.C23176b;
import com.google.android.libraries.gsa.monet.tools.p1905c.p1908b.C23177a;
import com.google.android.libraries.gsa.monet.tools.p1905c.p1909c.p1910a.C23178a;
import com.google.android.libraries.gsa.monet.tools.p1905c.p1909c.p1910a.C23179b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bp.b.b */
/* compiled from: PG */
public final class C96674b implements C87359a {

    /* renamed from: a */
    public final C23052c f270466a;

    /* renamed from: b */
    public final C23177a f270467b;

    /* renamed from: c */
    public final Class f270468c;

    /* renamed from: d */
    public final Map f270469d = new HashMap();

    /* renamed from: e */
    public final Map f270470e = new HashMap();

    /* renamed from: f */
    public C58495hd f270471f;

    /* renamed from: g */
    public C58485gu f270472g;

    /* renamed from: h */
    public C58833ax f270473h = C58836b.f156633a;

    /* renamed from: i */
    public C23028x f270474i;

    public C96674b(C23052c cVar, List list, Class cls) {
        this.f270466a = cVar;
        this.f270472g = C58485gu.m89842j(list);
        this.f270468c = cls;
        this.f270467b = new C23177a(cVar, C90194g.f251964a);
        cVar.mo28427o(new C96673a(this));
    }

    /* renamed from: a */
    public final C58833ax mo81028a() {
        for (Enum enumR : C58597ky.m90216g(this.f270472g)) {
            C58833ax axVar = (C58833ax) this.f270469d.get(enumR);
            axVar.getClass();
            if (axVar.mo56113h()) {
                return axVar;
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo90307b() {
        C90192e eVar;
        ArrayList<C58833ax> arrayList = new ArrayList<>();
        C58485gu guVar = this.f270472g;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C58833ax axVar = (C58833ax) this.f270469d.get((Enum) guVar.get(i));
            axVar.getClass();
            arrayList.add(axVar);
        }
        C23177a aVar = this.f270467b;
        C90190c cVar = (C90190c) C90193f.f251961b.createBuilder();
        for (C58833ax axVar2 : arrayList) {
            if (axVar2.mo56113h()) {
                C90191d dVar = (C90191d) C90192e.f251957c.createBuilder();
                int ordinal = ((Enum) axVar2.mo56107c()).ordinal();
                dVar.copyOnWrite();
                C90192e eVar2 = (C90192e) dVar.instance;
                eVar2.f251959a |= 1;
                eVar2.f251960b = ordinal;
                eVar = (C90192e) dVar.build();
            } else {
                eVar = C90192e.f251957c;
            }
            cVar.copyOnWrite();
            C90193f fVar = (C90193f) cVar.instance;
            eVar.getClass();
            C62971cq cqVar = fVar.f251963a;
            if (!cqVar.mo58948c()) {
                fVar.f251963a = C62942bv.mutableCopy(cqVar);
            }
            fVar.f251963a.add(eVar);
        }
        C23176b bVar = aVar.f63564a;
        Bundle bundle = new Bundle();
        String str = bVar.f63561b;
        C23178a aVar2 = (C23178a) C23179b.f63565a.createBuilder();
        aVar2.mo58885m(bVar.f63562c, (C90193f) cVar.build());
        bundle.putParcelable(str, C23245b.m43556a((C23179b) aVar2.build()));
        bVar.f63560a.mo28332B(bundle);
    }

    /* renamed from: c */
    public final void mo90308c(C58495hd hdVar, C58495hd hdVar2) {
        C58833ax axVar;
        boolean z = false;
        boolean z2 = false;
        for (Enum enumR : C58597ky.m90216g(this.f270472g)) {
            C58833ax axVar2 = (C58833ax) hdVar2.get(enumR);
            axVar2.getClass();
            C58833ax axVar3 = (C58833ax) hdVar.get(enumR);
            axVar3.getClass();
            if (!axVar3.equals(axVar2)) {
                if (axVar3.mo56113h() && this.f270470e.get(axVar3.mo56107c()) != null) {
                    C96682j jVar = (C96682j) this.f270470e.get(axVar3.mo56107c());
                    C58893dc.m90996a(jVar);
                    jVar.mo90312d(2);
                }
                z = true;
            }
            if (axVar2.mo56113h() && this.f270470e.get(axVar2.mo56107c()) != null) {
                C96682j jVar2 = (C96682j) this.f270470e.get(axVar2.mo56107c());
                C58893dc.m90996a(jVar2);
                jVar2.mo90312d(true != z2 ? 3 : 4);
                z2 = true;
            }
        }
        mo90307b();
        if (this.f270473h.mo56113h() && z) {
            C99403at atVar = ((C99414k) this.f270473h.mo56107c()).f278203a;
            for (C99431a aVar : C58597ky.m90216g(C99430a.f278220a)) {
                C58833ax axVar4 = (C58833ax) hdVar2.get(aVar);
                axVar4.getClass();
                C58833ax axVar5 = (C58833ax) hdVar.get(aVar);
                axVar5.getClass();
                if (!axVar4.equals(axVar5) && axVar4.mo56113h()) {
                    C99432b bVar = C99432b.INVALID_SURFACE;
                    C90208n nVar = C90208n.UNKNOWN_TAB;
                    int ordinal = ((C99432b) axVar4.mo56107c()).ordinal();
                    if ((ordinal == 5 || ordinal == 6) && !atVar.f278082B && atVar.mo91431s()) {
                        atVar.f278117l.mo78576a();
                        atVar.f278082B = true;
                    }
                }
            }
            C58833ax a = atVar.f278126u.mo81028a();
            if (a.mo56113h()) {
                axVar = C58833ax.m90834k((C99432b) a.mo56107c());
            } else {
                axVar = C58836b.f156633a;
            }
            ((C23251a) atVar.f278110e.mo91441g()).mo28730f(C58833ax.m90834k(C99430a.m164908a(axVar)), false);
            atVar.mo91428p();
            atVar.mo91422j();
            atVar.f278127v.mo80998a();
        }
    }
}
