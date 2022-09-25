package com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.C30123b;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import com.google.common.base.C58833ax;
import kotlinx.coroutines.C71803m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.b.a.e */
/* compiled from: PG */
public final class C30122e implements C30123b {

    /* renamed from: a */
    public final Context f81482a;

    /* renamed from: b */
    public final C58833ax f81483b;

    /* renamed from: c */
    private final C69585o f81484c;

    public C30122e(Context context, C69585o oVar, C58833ax axVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f81482a = context;
        this.f81484c = oVar;
        this.f81483b = axVar;
    }

    /* renamed from: a */
    public final Object mo35519a(int i, C69577g gVar) {
        Object a = C71803m.m105040a(this.f81484c, new C30119b(this, i, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo35520b(int i, C69577g gVar) {
        return C71803m.m105040a(this.f81484c, new C30120c(this, i, (C69577g) null), gVar);
    }

    /* renamed from: c */
    public final Object mo35521c(C30040c cVar, AccountRepresentation accountRepresentation, Bundle bundle, Long l, C69577g gVar) {
        return C71803m.m105040a(this.f81484c, new C30121d(cVar, this, accountRepresentation, bundle, l, (C69577g) null), gVar);
    }
}
