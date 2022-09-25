package com.google.android.apps.gsa.sidekick.main.p7216k;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.sidekick.main.k.h */
/* compiled from: PG */
public final class C91454h {

    /* renamed from: a */
    public static final C59071e f255084a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.k.h");

    /* renamed from: b */
    public final C68214a f255085b;

    /* renamed from: c */
    public final C68214a f255086c;

    /* renamed from: d */
    public final C68214a f255087d;

    /* renamed from: e */
    public final C68214a f255088e;

    /* renamed from: f */
    public final C68214a f255089f;

    /* renamed from: g */
    public final C68214a f255090g;

    /* renamed from: h */
    public final C68214a f255091h;

    /* renamed from: i */
    public final C68214a f255092i;

    /* renamed from: j */
    public final C68214a f255093j;

    /* renamed from: k */
    public final C68214a f255094k;

    /* renamed from: l */
    public final C90926bw f255095l = new C90926bw(C118826c.f331422a);

    /* renamed from: m */
    private final C68214a f255096m;

    /* renamed from: n */
    private final C68214a f255097n;

    /* renamed from: o */
    private final C68214a f255098o;

    /* renamed from: p */
    private final Object f255099p = new Object();

    /* renamed from: q */
    private final EnumMap f255100q = new EnumMap(C8142xb.class);

    public C91454h(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13) {
        this.f255096m = aVar;
        this.f255085b = aVar2;
        this.f255097n = aVar3;
        this.f255098o = aVar9;
        this.f255086c = aVar11;
        this.f255087d = aVar5;
        this.f255088e = aVar8;
        this.f255089f = aVar6;
        this.f255090g = aVar4;
        this.f255091h = aVar10;
        this.f255092i = aVar12;
        this.f255093j = aVar7;
        this.f255094k = aVar13;
    }

    /* renamed from: a */
    public final void mo85808a(int i, C8142xb xbVar) {
        int intValue;
        synchronized (this.f255099p) {
            Integer num = (Integer) this.f255100q.get(xbVar);
            if (num == null) {
                num = -1;
            }
            intValue = num.intValue();
            this.f255100q.put(xbVar, Integer.valueOf(i));
        }
        C58976aa aaVar = C58975e.f156826a;
        if (i == 3) {
            if (intValue != 3) {
                mo85809b(((C22871g) this.f255096m.mo27525b()).mo28201a("updateLastSessionTime", new C91447a(this, ((C21370a) this.f255098o.mo27525b()).mo26870b())), "updateLastSessionTime");
            }
        } else if (i == 0 && ((C85651bb) this.f255090g.mo27525b()).mo79141N()) {
            mo85809b(this.f255095l.mo85235a(new C91448b(this, xbVar)), "handleContainerVisibilityChange");
        }
    }

    /* renamed from: b */
    public final void mo85809b(C60870cx cxVar, String str) {
        C90875ai.m148465b(new C91450d(), cxVar, (C22871g) this.f255097n.mo27525b(), "AppOpenRefreshHandler").mo85223a(new C91451e(str));
    }
}
