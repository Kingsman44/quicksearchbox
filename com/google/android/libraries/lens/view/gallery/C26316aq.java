package com.google.android.libraries.lens.view.gallery;

import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59928cj;
import com.google.common.p4552o.p4563i.C59930cl;

/* renamed from: com.google.android.libraries.lens.view.gallery.aq */
/* compiled from: PG */
public final class C26316aq {

    /* renamed from: a */
    private final C25504aj f71534a;

    /* renamed from: b */
    private final C28448r f71535b;

    /* renamed from: c */
    private final C25684e f71536c;

    /* renamed from: d */
    private final C25225bd f71537d;

    public C26316aq(C25504aj ajVar, C28448r rVar, C25684e eVar, C25225bd bdVar) {
        this.f71534a = ajVar;
        this.f71535b = rVar;
        this.f71536c = eVar;
        this.f71537d = bdVar;
    }

    /* renamed from: a */
    public final void mo31515a() {
        int i;
        C25504aj ajVar = this.f71534a;
        if (ajVar.mo30536f(ajVar.mo30532b())) {
            i = 4;
        } else {
            i = this.f71537d.mo30357m() ? 7 : 8;
        }
        C28448r rVar = this.f71535b;
        C28446p a = C28447q.m53152a(126855);
        C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
        C59928cj cjVar = (C59928cj) C59930cl.f161974c.createBuilder();
        cjVar.copyOnWrite();
        C59930cl clVar = (C59930cl) cjVar.instance;
        clVar.f161977b = i - 1;
        clVar.f161976a |= 1;
        bhVar.copyOnWrite();
        C59900bi biVar = (C59900bi) bhVar.instance;
        C59930cl clVar2 = (C59930cl) cjVar.build();
        clVar2.getClass();
        biVar.f161898f = clVar2;
        biVar.f161893a |= 1024;
        a.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
        a.mo33898b(C45954d.m82060a(this.f71536c.f69824a));
        rVar.mo33855a(a.mo33897a());
    }
}
