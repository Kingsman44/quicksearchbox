package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.p4242bp.p4243a.p4244a.C56127a;
import com.google.p4242bp.p4243a.p4244a.C56128b;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.d */
/* compiled from: PG */
public final class C93390d {
    public C93390d() {
    }

    public C93390d(byte[] bArr) {
    }

    /* renamed from: a */
    public static final C56127a m153638a(ActionData actionData, String str, Query query) {
        String str2;
        C56127a aVar = (C56127a) C56128b.f149531j.createBuilder();
        if (str != null) {
            aVar.copyOnWrite();
            C56128b bVar = (C56128b) aVar.instance;
            bVar.f149533a |= 1;
            bVar.f149534b = str;
        }
        if (!(actionData == null || (str2 = actionData.f236000j) == null)) {
            aVar.copyOnWrite();
            C56128b bVar2 = (C56128b) aVar.instance;
            bVar2.f149533a |= 4;
            bVar2.f149535c = str2;
        }
        String b = C39191a.m68623b(query.f252751I);
        int i = 8;
        if (b != null) {
            aVar.copyOnWrite();
            C56128b bVar3 = (C56128b) aVar.instance;
            bVar3.f149533a |= 8;
            bVar3.f149536d = b;
        }
        if (query.mo84412cs() || query.mo84413ct()) {
            amo amo = query.f252760R;
            if (amo.ANDROID_AUTO_PHONE.equals(amo)) {
                i = 16;
            } else if (amo.ANDROID_AUTO_PROJECTED.equals(amo)) {
                i = 17;
            }
        } else if (!query.mo84420dA() || !query.mo84337bV()) {
            i = query.mo84326bK() ? 7 : query.mo84403cj() ? 13 : 2;
        } else if (query.mo84459dm()) {
            i = 9;
        } else if (query.mo84450de()) {
            i = 18;
        } else {
            i = query.mo84463dq() ? 5 : 19;
        }
        aVar.copyOnWrite();
        C56128b bVar4 = (C56128b) aVar.instance;
        bVar4.f149539g = i - 1;
        bVar4.f149533a |= 128;
        boolean bP = query.mo84331bP();
        aVar.copyOnWrite();
        C56128b bVar5 = (C56128b) aVar.instance;
        bVar5.f149533a |= 256;
        bVar5.f149540h = bP;
        int i2 = query.f252784w;
        aVar.copyOnWrite();
        C56128b bVar6 = (C56128b) aVar.instance;
        bVar6.f149533a |= 512;
        bVar6.f149541i = i2;
        return aVar;
    }

    /* renamed from: b */
    public static final void m153639b(C56128b bVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 622;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        bVar.getClass();
        ufVar2.f164101aH = bVar;
        ufVar2.f164250e |= 524288;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
