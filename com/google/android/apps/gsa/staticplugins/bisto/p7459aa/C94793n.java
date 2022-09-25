package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60232lf;
import com.google.common.p4552o.C60234lh;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.n */
/* compiled from: PG */
public final /* synthetic */ class C94793n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94794o f265051a;

    /* renamed from: b */
    public final /* synthetic */ String f265052b;

    /* renamed from: c */
    public final /* synthetic */ long f265053c;

    /* renamed from: d */
    public final /* synthetic */ long f265054d;

    public /* synthetic */ C94793n(C94794o oVar, String str, long j, long j2) {
        this.f265051a = oVar;
        this.f265052b = str;
        this.f265053c = j;
        this.f265054d = j2;
    }

    public final void run() {
        C94794o oVar = this.f265051a;
        String str = this.f265052b;
        long j = this.f265053c;
        long j2 = this.f265054d;
        C60291nd ndVar = (C60291nd) C60292ne.f163113l.createBuilder();
        for (String i : C58869cf.m90936b(new C58903m(' ')).mo56153g(str)) {
            List i2 = C58869cf.m90936b(new C58903m('/')).mo56155i(i);
            if (i2.size() > 1) {
                if (((String) i2.get(0)).equals("AWD")) {
                    String str2 = (String) i2.get(1);
                    ndVar.copyOnWrite();
                    C60292ne neVar = (C60292ne) ndVar.instance;
                    str2.getClass();
                    neVar.f163115a |= 128;
                    neVar.f163120f = str2;
                    C58976aa aaVar = C58975e.f156826a;
                    i2.get(1);
                } else if (((String) i2.get(0)).equals("AW")) {
                    String str3 = (String) i2.get(1);
                    ndVar.copyOnWrite();
                    C60292ne neVar2 = (C60292ne) ndVar.instance;
                    str3.getClass();
                    neVar2.f163115a |= 16;
                    neVar2.f163117c = str3;
                    C58976aa aaVar2 = C58975e.f156826a;
                    i2.get(1);
                }
            }
        }
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        String c = oVar.f265057d.mo83548c("user_group_name");
        if (c != null) {
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            nmVar.f163147a |= 1048576;
            nmVar.f163157k = c;
        }
        C60292ne neVar3 = (C60292ne) ndVar.build();
        nkVar.copyOnWrite();
        C60300nm nmVar2 = (C60300nm) nkVar.instance;
        neVar3.getClass();
        nmVar2.f163151e = neVar3;
        nmVar2.f163147a |= 512;
        C60232lf lfVar = (C60232lf) C60234lh.f162963e.createBuilder();
        lfVar.copyOnWrite();
        C60234lh lhVar = (C60234lh) lfVar.instance;
        lhVar.f162966b = 5;
        lhVar.f162965a |= 1;
        String b = C39191a.m68623b(j);
        lfVar.copyOnWrite();
        C60234lh lhVar2 = (C60234lh) lfVar.instance;
        b.getClass();
        lhVar2.f162965a |= 2;
        lhVar2.f162967c = b;
        lfVar.copyOnWrite();
        C60234lh lhVar3 = (C60234lh) lfVar.instance;
        lhVar3.f162965a |= 4;
        lhVar3.f162968d = j2;
        nkVar.copyOnWrite();
        C60300nm nmVar3 = (C60300nm) nkVar.instance;
        C60234lh lhVar4 = (C60234lh) lfVar.build();
        lhVar4.getClass();
        nmVar3.f163143D = lhVar4;
        nmVar3.f163148b |= 4096;
        C95307m.m157553j((C60300nm) nkVar.build());
    }
}
