package com.google.android.apps.gsa.staticplugins.p7816dl.p7819c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.state.p6872d.C86906a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99649af;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99651b;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99652c;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99660k;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99673x;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.c.k */
/* compiled from: PG */
public final class C99686k implements C23113i {

    /* renamed from: a */
    private final C99684i f278958a;

    public C99686k(C99684i iVar) {
        this.f278958a = iVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SharedMinusOneEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onRetryClicked")) {
                C99649af afVar = (C99649af) this.f278958a;
                String b = afVar.f278852j.mo83230b(afVar.f278844b, (String) ((C99652c) afVar.f278843a).f278891k.f63720e);
                if (b == null || !afVar.f278848f.mo79746e(C90138q.f251839m)) {
                    afVar.mo91551k();
                } else {
                    afVar.mo91548h(b);
                }
            } else if (str.equals("onTabClicked_com.google.android.apps.gsa.staticplugins.sharedminusone.shared.SharedMinusOneModel.SelectedTab")) {
                C99688m mVar = (C99688m) new C23259d(C99688m.values()).f63738a[pVar.f63472a.getInt("selectedTab")];
                C99684i iVar = this.f278958a;
                C99688m mVar2 = C99688m.PARTNER_TAB;
                boolean z = mVar == mVar2;
                C99649af afVar2 = (C99649af) iVar;
                afVar2.mo91549i(mVar);
                C86906a aVar = afVar2.f278851i;
                int i = mVar == mVar2 ? 1379 : 1378;
                C58976aa aaVar = C58975e.f156826a;
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = i;
                int i2 = aVar.f234689c;
                if (!(i2 == Integer.MAX_VALUE || i2 == 0)) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    ufVar2.f164253h |= C89885b.HTTP_VALUE;
                    ufVar2.f164152bF = i2;
                }
                int i3 = aVar.f234690d;
                if (!(i3 == Integer.MAX_VALUE || i3 == 0)) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    ufVar3.f164253h |= 524288;
                    ufVar3.f164153bG = i3;
                }
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                if (z && !((C99652c) afVar2.f278843a).f278890j.mo28631l()) {
                    afVar2.mo91547f();
                }
                if (((C99652c) afVar2.f278843a).f278890j.mo28631l()) {
                    C99673x xVar = (C99673x) ((C99652c) afVar2.f278843a).f278890j.mo28620a();
                    xVar.getClass();
                    ((C99651b) xVar.f278937c).f278878e.mo28651e(new C99660k(z));
                }
                afVar2.mo91553m();
            }
        }
    }
}
