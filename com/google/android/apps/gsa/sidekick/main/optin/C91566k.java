package com.google.android.apps.gsa.sidekick.main.optin;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23965o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60476rh;
import com.google.common.p4552o.C60479rk;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p375ai.p378b.C7891nu;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.k */
/* compiled from: PG */
public final class C91566k extends C23965o {

    /* renamed from: a */
    public static final C59071e f255407a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.optin.k");

    /* renamed from: b */
    public C91563h f255408b;

    /* renamed from: a */
    public final void mo29375a(int i) {
        int i2;
        C58976aa aaVar = C58975e.f156826a;
        C91563h hVar = this.f255408b;
        C59071e eVar = OptInActivity.f255358l;
        OptInActivity optInActivity = hVar.f255405b;
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = 3;
            if (i3 != 1) {
                i2 = i3 != 2 ? i3 != 3 ? 6 : 5 : 4;
            }
        } else {
            i2 = 2;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1440;
        C60476rh rhVar = (C60476rh) C60479rk.f163679g.createBuilder();
        rhVar.copyOnWrite();
        C60479rk rkVar = (C60479rk) rhVar.instance;
        rkVar.f163682b = 1;
        rkVar.f163681a |= 1;
        rhVar.copyOnWrite();
        C60479rk rkVar2 = (C60479rk) rhVar.instance;
        rkVar2.f163683c = i2 - 1;
        rkVar2.f163681a = 2 | rkVar2.f163681a;
        int i4 = optInActivity.f255372M;
        if (i4 != 0) {
            rhVar.copyOnWrite();
            C60479rk rkVar3 = (C60479rk) rhVar.instance;
            rkVar3.f163681a |= 4;
            rkVar3.f163684d = i4;
            C7891nu nuVar = optInActivity.f255382n;
            rhVar.copyOnWrite();
            C60479rk rkVar4 = (C60479rk) rhVar.instance;
            rkVar4.f163685e = nuVar.f27730O;
            rkVar4.f163681a |= 8;
            rhVar.copyOnWrite();
            C60479rk rkVar5 = (C60479rk) rhVar.instance;
            rkVar5.f163681a |= 16;
            rkVar5.f163686f = 1;
            C60479rk rkVar6 = (C60479rk) rhVar.build();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            rkVar6.getClass();
            ufVar2.f164200cA = rkVar6;
            ufVar2.f164255j |= 1048576;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            hVar.f255405b.mo85934B();
            if (i3 == 0 || i3 == 4) {
                C91563h hVar2 = this.f255408b;
                hVar2.f255405b.f255366G.mo80843c(hVar2.f255404a);
                return;
            }
            return;
        }
        throw null;
    }
}
