package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84428aj;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84429ak;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.gcoreclient.p1753c.C21451a;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55036dm;
import com.google.p4152bb.p4153a.C55037dn;
import com.google.p4152bb.p4153a.C55038do;
import com.google.p4152bb.p4153a.C55041dr;
import com.google.p4152bb.p4153a.C55042ds;
import com.google.p4152bb.p4153a.C55043dt;
import com.google.p4152bb.p4153a.C55044du;
import com.google.p4152bb.p4153a.C55047dx;
import com.google.speech.grammar.pumpkin.C66528t;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.k */
/* compiled from: PG */
public final class C98541k extends C66528t {

    /* renamed from: a */
    private static final C59071e f275157a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.k");

    /* renamed from: b */
    private final C68214a f275158b;

    /* renamed from: c */
    private final C68214a f275159c;

    /* renamed from: d */
    private final C68214a f275160d;

    /* renamed from: e */
    private final String f275161e;

    /* renamed from: f */
    private final String f275162f;

    /* renamed from: g */
    private C84428aj f275163g;

    /* renamed from: h */
    private C55047dx f275164h;

    /* renamed from: i */
    private final C86124t f275165i;

    public C98541k(C68214a aVar, String str, C68214a aVar2, C68214a aVar3, C86124t tVar) {
        this.f275158b = aVar;
        this.f275161e = "semantic#" + str + ";name";
        this.f275162f = str;
        this.f275159c = aVar2;
        this.f275160d = aVar3;
        this.f275165i = tVar;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C89949q.m146523g(1201);
        if (this.f275165i.mo79746e(C90086ek.f250436dB)) {
            return 0.5f;
        }
        if (this.f275163g == null) {
            C58833ax axVar = (C58833ax) this.f275158b.mo27525b();
            if (!axVar.mo56113h()) {
                ((C59052c) ((C59052c) f275157a.mo56225c()).mo56372aa(30798)).mo56386p("Could not get Icing connection, initIcingParams failed.");
            } else {
                this.f275163g = new C84428aj((C84425ag) axVar.mo56107c());
                C55036dm dmVar = (C55036dm) C55047dx.f144820j.createBuilder();
                dmVar.copyOnWrite();
                C55047dx dxVar = (C55047dx) dmVar.instance;
                dxVar.f144823a |= 1;
                dxVar.f144826d = 5;
                C55037dn dnVar = (C55037dn) C55038do.f144799f.createBuilder();
                String str2 = this.f275162f;
                dnVar.copyOnWrite();
                C55038do doVar = (C55038do) dnVar.instance;
                str2.getClass();
                doVar.f144801a |= 1;
                doVar.f144802b = str2;
                dnVar.copyOnWrite();
                C55038do doVar2 = (C55038do) dnVar.instance;
                doVar2.f144801a |= 2;
                doVar2.f144803c = "name";
                dmVar.copyOnWrite();
                C55047dx dxVar2 = (C55047dx) dmVar.instance;
                C55038do doVar3 = (C55038do) dnVar.build();
                doVar3.getClass();
                dxVar2.mo54176a();
                dxVar2.f144824b.add(doVar3);
                C55041dr drVar = (C55041dr) C55042ds.f144811b.createBuilder();
                C55043dt dtVar = (C55043dt) C55044du.f144814d.createBuilder();
                dtVar.copyOnWrite();
                C55044du duVar = (C55044du) dtVar.instance;
                duVar.f144816a |= 1;
                duVar.f144817b = 0;
                drVar.mo54175a(dtVar);
                dmVar.mo54174a(drVar);
                dmVar.copyOnWrite();
                C55047dx dxVar3 = (C55047dx) dmVar.instance;
                dxVar3.f144823a |= 2;
                dxVar3.f144827e = false;
                this.f275164h = (C55047dx) dmVar.build();
            }
        }
        C55036dm dmVar2 = (C55036dm) this.f275164h.toBuilder();
        dmVar2.copyOnWrite();
        ((C55047dx) dmVar2.instance).f144825c = C55047dx.emptyProtobufList();
        C55041dr drVar2 = (C55041dr) C55042ds.f144811b.createBuilder();
        C55043dt dtVar2 = (C55043dt) C55044du.f144814d.createBuilder();
        dtVar2.copyOnWrite();
        C55044du duVar2 = (C55044du) dtVar2.instance;
        str.getClass();
        duVar2.f144816a |= 2;
        duVar2.f144818c = str;
        drVar2.mo54175a(dtVar2);
        dmVar2.mo54174a(drVar2);
        this.f275164h = (C55047dx) dmVar2.build();
        C84429ak akVar = new C84429ak(this.f275164h, this.f275159c, this.f275160d, 0);
        C21479b a = this.f275163g.mo78007a(akVar.mo78008a(), "com.google.android.music", (String) null, akVar);
        if (a == null) {
            return 0.0f;
        }
        C21451a b = a.mo26953b();
        while (b.hasNext()) {
            if (str.equalsIgnoreCase(((C21454b) b.next()).f59905a.mo117712h(this.f275161e))) {
                return C98555y.m163249a(str);
            }
        }
        return 0.0f;
    }
}
