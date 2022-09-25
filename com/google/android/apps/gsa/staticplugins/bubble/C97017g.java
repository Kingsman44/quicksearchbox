package com.google.android.apps.gsa.staticplugins.bubble;

import com.google.android.apps.gsa.staticplugins.bubble.mvc.C97049b;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60567ur;
import com.google.common.p4552o.C60570uu;
import com.google.common.p4552o.p4559e.C59743a;
import java.util.LinkedHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.g */
/* compiled from: PG */
public final class C97017g {

    /* renamed from: a */
    public static final C59071e f271135a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.g");

    /* renamed from: b */
    public final LinkedHashMap f271136b = new LinkedHashMap();

    /* renamed from: c */
    public final C21370a f271137c;

    /* renamed from: d */
    public long f271138d;

    public C97017g(C21370a aVar) {
        this.f271137c = aVar;
    }

    /* renamed from: a */
    public final void mo90391a(C97040c cVar, boolean z) {
        C97049b bVar = (C97049b) this.f271136b.remove(cVar);
        if (bVar != null) {
            C60567ur urVar = (C60567ur) C60570uu.f164299i.createBuilder();
            int b = C97042e.m160626b(cVar.mo90392a());
            urVar.copyOnWrite();
            C60570uu uuVar = (C60570uu) urVar.instance;
            uuVar.f164304d = b - 1;
            uuVar.f164301a |= 8;
            int i = bVar.f271181f;
            urVar.copyOnWrite();
            C60570uu uuVar2 = (C60570uu) urVar.instance;
            uuVar2.f164301a |= 128;
            uuVar2.f164308h = i;
            long b2 = bVar.f271182g.mo26870b();
            long j = bVar.f271184i;
            urVar.copyOnWrite();
            C60570uu uuVar3 = (C60570uu) urVar.instance;
            uuVar3.f164301a |= 16;
            uuVar3.f164305e = b2 - j;
            if (this.f271136b.size() == 1) {
                long b3 = this.f271137c.mo26870b();
                long j2 = this.f271138d;
                urVar.copyOnWrite();
                C60570uu uuVar4 = (C60570uu) urVar.instance;
                uuVar4.f164301a |= 32;
                uuVar4.f164306f = b3 - j2;
            }
            if (z) {
                urVar.copyOnWrite();
                C60570uu uuVar5 = (C60570uu) urVar.instance;
                uuVar5.f164301a |= 64;
                uuVar5.f164307g = true;
            }
            C97042e.m160625a(C59743a.LIVE_RESULTS_BUBBLE_DISMISS_EVENT.f161421ts, (C60570uu) urVar.build());
            bVar.mo90407a();
        }
    }
}
