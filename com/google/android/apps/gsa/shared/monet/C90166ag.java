package com.google.android.apps.gsa.shared.monet;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87992ld;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87993le;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88000ll;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88001lm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88004lp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88005lq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88006lr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88007ls;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22970am;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23106i;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23107j;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.monet.ag */
/* compiled from: PG */
public final class C90166ag implements C22970am {

    /* renamed from: a */
    private final C87680ah f251931a;

    /* renamed from: b */
    private final C90348s f251932b;

    /* renamed from: c */
    private boolean f251933c = false;

    public C90166ag(C87680ah ahVar, C90348s sVar) {
        this.f251931a = ahVar;
        this.f251932b = sVar;
    }

    /* renamed from: f */
    private final void m146730f(C87991lc lcVar, Parcelable parcelable) {
        String str = this.f251932b.f252332a;
        lcVar.copyOnWrite();
        C88012lx lxVar = (C88012lx) lcVar.instance;
        C88012lx lxVar2 = C88012lx.f238010e;
        str.getClass();
        lxVar.f238012a |= 512;
        lxVar.f238015d = str;
        C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_EVENT);
        jVar.mo82014b(C87987kz.f237952a, (C88012lx) lcVar.build());
        if (parcelable != null) {
            jVar.mo82015c(parcelable);
        }
        this.f251931a.mo81961c(jVar.mo82013a());
    }

    /* renamed from: a */
    public final void mo28353a(Bundle bundle, String str) {
        if (this.f251933c) {
            C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
            C88000ll llVar = (C88000ll) C88001lm.f237981c.createBuilder();
            llVar.copyOnWrite();
            C88001lm lmVar = (C88001lm) llVar.instance;
            str.getClass();
            lmVar.f237983a |= 1;
            lmVar.f237984b = str;
            lcVar.copyOnWrite();
            C88012lx lxVar = (C88012lx) lcVar.instance;
            C88001lm lmVar2 = (C88001lm) llVar.build();
            lmVar2.getClass();
            lxVar.f238014c = lmVar2;
            lxVar.f238013b = 1;
            m146730f(lcVar, bundle);
        }
    }

    /* renamed from: b */
    public final void mo28354b(HierarchyState hierarchyState, C23129y yVar, ProtoParcelable protoParcelable) {
        if (this.f251933c) {
            C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
            C88004lp lpVar = (C88004lp) C88005lq.f237991c.createBuilder();
            C23106i iVar = (C23106i) C23107j.f63462d.createBuilder();
            String str = yVar.f63478c;
            iVar.copyOnWrite();
            C23107j jVar = (C23107j) iVar.instance;
            str.getClass();
            jVar.f63464a |= 1;
            jVar.f63465b = str;
            C63088z A = C63088z.m96139A(protoParcelable.mo28513b());
            iVar.copyOnWrite();
            C23107j jVar2 = (C23107j) iVar.instance;
            jVar2.f63464a |= 2;
            jVar2.f63466c = A;
            lpVar.copyOnWrite();
            C88005lq lqVar = (C88005lq) lpVar.instance;
            C23107j jVar3 = (C23107j) iVar.build();
            jVar3.getClass();
            lqVar.f237994b = jVar3;
            lqVar.f237993a |= 1;
            C88005lq lqVar2 = (C88005lq) lpVar.build();
            lcVar.copyOnWrite();
            C88012lx lxVar = (C88012lx) lcVar.instance;
            lqVar2.getClass();
            lxVar.f238014c = lqVar2;
            lxVar.f238013b = 4;
            Bundle bundle = new Bundle();
            bundle.putParcelable(HierarchyState.class.getCanonicalName(), hierarchyState);
            m146730f(lcVar, bundle);
        }
    }

    /* renamed from: c */
    public final void mo28355c(String str, String str2, String str3, Parcelable parcelable) {
        if (this.f251933c) {
            C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
            C87992ld ldVar = (C87992ld) C87993le.f237961e.createBuilder();
            ldVar.copyOnWrite();
            C87993le leVar = (C87993le) ldVar.instance;
            str.getClass();
            leVar.f237963a |= 1;
            leVar.f237964b = str;
            ldVar.copyOnWrite();
            C87993le leVar2 = (C87993le) ldVar.instance;
            str2.getClass();
            leVar2.f237963a |= 2;
            leVar2.f237965c = str2;
            ldVar.copyOnWrite();
            C87993le leVar3 = (C87993le) ldVar.instance;
            str3.getClass();
            leVar3.f237963a |= 4;
            leVar3.f237966d = str3;
            lcVar.copyOnWrite();
            C88012lx lxVar = (C88012lx) lcVar.instance;
            C87993le leVar4 = (C87993le) ldVar.build();
            leVar4.getClass();
            lxVar.f238014c = leVar4;
            lxVar.f238013b = 2;
            m146730f(lcVar, parcelable);
        }
    }

    /* renamed from: d */
    public final void mo28356d(boolean z) {
        this.f251933c = z;
    }

    /* renamed from: e */
    public final void mo28357e(C23129y yVar, ProtoParcelable protoParcelable) {
        if (this.f251933c) {
            C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
            C88006lr lrVar = (C88006lr) C88007ls.f237995c.createBuilder();
            C23106i iVar = (C23106i) C23107j.f63462d.createBuilder();
            String str = yVar.f63478c;
            iVar.copyOnWrite();
            C23107j jVar = (C23107j) iVar.instance;
            str.getClass();
            jVar.f63464a |= 1;
            jVar.f63465b = str;
            C63088z A = C63088z.m96139A(protoParcelable.mo28513b());
            iVar.copyOnWrite();
            C23107j jVar2 = (C23107j) iVar.instance;
            jVar2.f63464a |= 2;
            jVar2.f63466c = A;
            lrVar.copyOnWrite();
            C88007ls lsVar = (C88007ls) lrVar.instance;
            C23107j jVar3 = (C23107j) iVar.build();
            jVar3.getClass();
            lsVar.f237998b = jVar3;
            lsVar.f237997a |= 1;
            lcVar.copyOnWrite();
            C88012lx lxVar = (C88012lx) lcVar.instance;
            C88007ls lsVar2 = (C88007ls) lrVar.build();
            lsVar2.getClass();
            lxVar.f238014c = lsVar2;
            lxVar.f238013b = 3;
            m146730f(lcVar, (Parcelable) null);
        }
    }
}
