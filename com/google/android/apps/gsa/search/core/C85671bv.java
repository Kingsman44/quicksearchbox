package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.PersonShortcut;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.search.core.bv */
/* compiled from: PG */
public final class C85671bv extends C85669bt {

    /* renamed from: d */
    private static final C59071e f231597d = C59071e.m91332i("com.google.android.apps.gsa.search.core.bv");

    /* renamed from: b */
    public final C90929bz f231598b;

    /* renamed from: c */
    public final C86338r f231599c;

    public C85671bv(C86338r rVar, C90929bz bzVar) {
        C85668bs bsVar;
        this.f231599c = rVar;
        this.f231598b = bzVar;
        C58976aa aaVar = C58975e.f156826a;
        byte[] e = rVar.mo80079e("person_shortcut_info", (byte[]) null);
        if (e == null) {
            bsVar = C85668bs.f231592b;
        } else {
            try {
                bsVar = (C85668bs) C62942bv.parseFrom((C62942bv) C85668bs.f231592b, e, C62921ba.m95368a());
            } catch (C62974ct e2) {
                C59104x d = f231597d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PersonShortcutSettingsM");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(7477)).mo56386p("Failed to load PersonShortcutInfo");
                int i = C90755l.f253831a;
                bsVar = C85668bs.f231592b;
            }
        }
        if (bsVar.f231594a.size() != 0) {
            for (C85667br brVar : bsVar.f231594a) {
                C87515c a = C87515c.m142148a(brVar.f231585b);
                if (a == null) {
                    a = C87515c.PERSON;
                }
                this.f231595a.add(new PersonShortcut(a, brVar.f231586c, brVar.f231587d, brVar.f231588e, brVar.f231589f, brVar.f231590g, brVar.f231591h));
            }
        }
    }

    /* renamed from: e */
    public final void mo79202e() {
        C58976aa aaVar = C58975e.f156826a;
        C85665bp bpVar = (C85665bp) C85668bs.f231592b.createBuilder();
        for (PersonShortcut personShortcut : this.f231595a) {
            C85666bq bqVar = (C85666bq) C85667br.f231582i.createBuilder();
            String name = personShortcut.f236402e.name();
            bqVar.copyOnWrite();
            C85667br brVar = (C85667br) bqVar.instance;
            name.getClass();
            brVar.f231584a = 1 | brVar.f231584a;
            brVar.f231585b = name;
            String str = personShortcut.f236403f;
            bqVar.copyOnWrite();
            C85667br brVar2 = (C85667br) bqVar.instance;
            str.getClass();
            brVar2.f231584a |= 2;
            brVar2.f231586c = str;
            String str2 = personShortcut.f236404g;
            if (str2 != null) {
                bqVar.copyOnWrite();
                C85667br brVar3 = (C85667br) bqVar.instance;
                brVar3.f231584a |= 4;
                brVar3.f231587d = str2;
            }
            long j = personShortcut.f236398a;
            bqVar.copyOnWrite();
            C85667br brVar4 = (C85667br) bqVar.instance;
            brVar4.f231584a |= 8;
            brVar4.f231588e = j;
            long j2 = personShortcut.f236399b;
            bqVar.copyOnWrite();
            C85667br brVar5 = (C85667br) bqVar.instance;
            brVar5.f231584a |= 16;
            brVar5.f231589f = j2;
            String str3 = personShortcut.f236400c;
            if (str3 != null) {
                bqVar.copyOnWrite();
                C85667br brVar6 = (C85667br) bqVar.instance;
                brVar6.f231584a |= 32;
                brVar6.f231590g = str3;
            }
            String str4 = personShortcut.f236401d;
            if (str4 != null) {
                bqVar.copyOnWrite();
                C85667br brVar7 = (C85667br) bqVar.instance;
                brVar7.f231584a |= 64;
                brVar7.f231591h = str4;
            }
            C85667br brVar8 = (C85667br) bqVar.build();
            bpVar.copyOnWrite();
            C85668bs bsVar = (C85668bs) bpVar.instance;
            brVar8.getClass();
            C62971cq cqVar = bsVar.f231594a;
            if (!cqVar.mo58948c()) {
                bsVar.f231594a = C62942bv.mutableCopy(cqVar);
            }
            bsVar.f231594a.add(brVar8);
        }
        new C85670bu(this).mo85242e((C85668bs) bpVar.build());
    }
}
