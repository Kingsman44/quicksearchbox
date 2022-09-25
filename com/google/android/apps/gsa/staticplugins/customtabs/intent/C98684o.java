package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98597ab;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60490rv;
import com.google.common.p4552o.C60492rx;
import com.google.common.p4552o.C60494rz;
import com.google.common.p4552o.C60496sa;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.o */
/* compiled from: PG */
public final class C98684o {

    /* renamed from: a */
    public final C98597ab f275662a;

    public C98684o(C98597ab abVar) {
        this.f275662a = abVar;
    }

    /* renamed from: a */
    public static final C60555uf m163471a(Intent intent, C60492rx rxVar) {
        C60490rv rvVar = (C60490rv) C60496sa.f163764k.createBuilder();
        rvVar.copyOnWrite();
        C60496sa saVar = (C60496sa) rvVar.instance;
        saVar.f163768c = rxVar.f163738q;
        saVar.f163766a |= 2;
        if (intent.hasExtra("com.google.android.apps.gsa.customtabs.SOURCE")) {
            C60494rz a = C60494rz.m92598a(intent.getIntExtra("com.google.android.apps.gsa.customtabs.SOURCE", 0));
            rvVar.copyOnWrite();
            C60496sa saVar2 = (C60496sa) rvVar.instance;
            saVar2.f163769d = a.f163762v;
            saVar2.f163766a |= 4;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 624;
        long nextLong = C90719ac.f253778a.f253779b.nextLong();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 16;
        ufVar2.f164261p = nextLong;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60496sa saVar3 = (C60496sa) rvVar.build();
        saVar3.getClass();
        ufVar3.f164103aJ = saVar3;
        ufVar3.f164250e |= 33554432;
        C58833ax a2 = C89917a.m146440a(intent);
        if (a2.mo56113h()) {
            long longValue = ((Long) a2.mo56107c()).longValue();
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164252g |= 268435456;
            ufVar4.f164192bt = longValue;
        }
        return (C60555uf) tzVar.build();
    }
}
