package com.google.android.apps.gsa.search.core.udc;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60652xv;
import com.google.common.p4552o.C60653xw;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.udc.ag */
/* compiled from: PG */
final class C87203ag implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C87204ah.f235611a.mo56226d()).mo56382g(th)).mo56372aa(9369)).mo56386p("Error getting cached settings");
        C60652xv xvVar = (C60652xv) C60653xw.f164546e.createBuilder();
        if (th instanceof C87223s) {
            int i = ((C87223s) th).f235646a;
            xvVar.copyOnWrite();
            C60653xw xwVar = (C60653xw) xvVar.instance;
            xwVar.f164548a |= 2;
            xwVar.f164550c = i;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 589;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60653xw xwVar2 = (C60653xw) xvVar.build();
        xwVar2.getClass();
        ufVar2.f164100aG = xwVar2;
        ufVar2.f164250e |= 8192;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C87197aa aaVar = (C87197aa) obj;
    }
}
