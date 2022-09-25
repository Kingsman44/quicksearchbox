package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.nowcards.p8116f.C104898x;
import com.google.android.libraries.p2460r.p2461a.p2462a.p2463a.C32049a;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32052b;
import com.google.android.libraries.p2460r.p2464b.p2467c.C32055a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32059b;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32060c;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32062e;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32063f;

/* renamed from: com.google.android.libraries.r.c.aq */
/* compiled from: PG */
public final class C32086aq {

    /* renamed from: a */
    final C32059b f86157a;

    /* renamed from: b */
    C32127e f86158b = null;

    /* renamed from: c */
    private final C32049a f86159c;

    /* renamed from: d */
    private final C32060c f86160d;

    /* renamed from: e */
    private final C32063f f86161e;

    /* renamed from: f */
    private final boolean f86162f;

    /* renamed from: g */
    private final C32055a f86163g;

    public C32086aq(C32049a aVar, C32059b bVar, C32060c cVar, C32063f fVar, C32055a aVar2, boolean z) {
        this.f86159c = aVar;
        this.f86157a = bVar;
        this.f86160d = cVar;
        this.f86161e = fVar;
        this.f86163g = aVar2;
        this.f86162f = z;
    }

    /* renamed from: a */
    public final C32145w mo37865a(C32052b bVar, C32058a aVar, C32062e eVar, Context context, C104898x xVar) {
        C32127e eVar2 = this.f86158b;
        if (eVar2 == null || eVar2.f86272a != context) {
            this.f86158b = new C32127e(context, bVar, new C32072ac(this.f86157a, this.f86160d, xVar), this.f86162f);
        }
        return new C32146x(context, this.f86158b, aVar, eVar, this.f86159c);
    }
}
