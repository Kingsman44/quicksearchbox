package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.by;
import com.google.android.apps.gsa.assistant.settings.features.av.co;
import com.google.android.apps.gsa.assistant.settings.features.av.dg;
import com.google.android.apps.gsa.assistant.settings.features.av.di;
import com.google.android.apps.gsa.assistant.settings.features.av.dj;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72866ao;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72883t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3861at.C49892cw;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.al */
/* compiled from: PG */
final class C10108al implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10107ak f34414a;

    public C10108al(C10107ak akVar) {
        this.f34414a = akVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        acx acx;
        C72883t tVar = (C72883t) bVar;
        C10107ak akVar = this.f34414a;
        int a = C72866ao.m107597a(tVar.mo64584a().d);
        if (a == 0) {
            a = 1;
        }
        int b = tVar.mo64585b();
        if (a == 18) {
            if (b == 3) {
                dn dnVar = akVar.f34405c;
                String str = akVar.f34404b;
                ar a2 = C10107ak.m24927a();
                C58485gu n = C58485gu.m89846n(str);
                List list = (List) Collection.EL.stream(n).map(new dg(dnVar)).filter(di.a).map(dj.a).map(co.a).collect(Collectors.toList());
                if (list.isEmpty()) {
                    acx = null;
                } else {
                    acw acw = (acw) acx.f128971H.createBuilder();
                    C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
                    daVar.mo53370a(list);
                    acw.copyOnWrite();
                    acx acx2 = (acx) acw.instance;
                    C49898db dbVar = (C49898db) daVar.build();
                    dbVar.getClass();
                    acx2.f128991h = dbVar;
                    acx2.f128984a |= 32;
                    acx = (acx) acw.build();
                }
                C49892cw cwVar = (C49892cw) C49893cx.f129688b.createBuilder();
                cwVar.mo53369a((List) Collection.EL.stream(dnVar.c.f129690a).map(new by(n)).collect(Collectors.toList()));
                dnVar.c = (C49893cx) cwVar.build();
                dnVar.h(acx, a2);
            } else if (b == 2) {
                akVar.f34405c.s(akVar.f34404b, true, C10107ak.m24927a());
            }
        }
        akVar.mo18248d();
        return C47392e.f123115a;
    }
}
