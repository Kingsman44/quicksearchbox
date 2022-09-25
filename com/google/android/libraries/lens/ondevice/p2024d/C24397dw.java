package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24555at;
import com.google.android.libraries.lens.ondevice.p2034k.C24735hk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62336de;
import com.google.lens.p4701g.C62337df;
import com.google.lens.p4701g.C62338dg;
import com.google.lens.p4701g.C62339dh;

/* renamed from: com.google.android.libraries.lens.ondevice.d.dw */
/* compiled from: PG */
public final class C24397dw implements C24419m {

    /* renamed from: a */
    private final C24555at f66808a;

    /* renamed from: b */
    private final C24735hk f66809b;

    public C24397dw(C24555at atVar, C24735hk hkVar) {
        this.f66808a = atVar;
        this.f66809b = hkVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24398dx.f66810b.mo56224b()).mo56372aa(48778)).mo56386p("Running Translate Text Cascade");
        C62338dg dgVar = (C62338dg) C62339dh.f168294b.createBuilder();
        if (fVar.mo29812d().mo56113h()) {
            for (int i = 0; i < ((C58485gu) fVar.mo29812d().mo56107c()).size(); i++) {
                C62336de deVar = (C62336de) C62337df.f168289d.createBuilder();
                deVar.copyOnWrite();
                C62337df dfVar = (C62337df) deVar.instance;
                dfVar.f168291a |= 1;
                dfVar.f168292b = "paragraph_" + i;
                String str = (String) ((C58485gu) fVar.mo29812d().mo56107c()).get(i);
                deVar.copyOnWrite();
                C62337df dfVar2 = (C62337df) deVar.instance;
                str.getClass();
                dfVar2.f168291a |= 2;
                dfVar2.f168293c = str;
                C62337df dfVar3 = (C62337df) deVar.build();
                dgVar.copyOnWrite();
                C62339dh dhVar = (C62339dh) dgVar.instance;
                dfVar3.getClass();
                dhVar.mo58493a();
                dhVar.f168296a.add(dfVar3);
            }
        }
        C24555at atVar = this.f66808a;
        atVar.getClass();
        this.f66809b.getClass();
        C62339dh dhVar2 = (C62339dh) dgVar.build();
        dhVar2.getClass();
        C60870cx gq = new C24332bl(dVar, atVar, dhVar2).f66649a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29854n(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
