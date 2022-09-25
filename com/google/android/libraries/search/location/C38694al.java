package com.google.android.libraries.search.location;

import com.google.android.gms.awareness.C142928c;
import com.google.android.gms.awareness.C142929d;
import com.google.android.gms.awareness.snapshot.C142937a;
import com.google.android.gms.awareness.snapshot.internal.C142945h;
import com.google.android.gms.awareness.snapshot.internal.C142946i;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.al */
/* compiled from: PG */
public final /* synthetic */ class C38694al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38695am f102170a;

    /* renamed from: b */
    public final /* synthetic */ C39226b f102171b;

    /* renamed from: c */
    public final /* synthetic */ C142929d f102172c;

    public /* synthetic */ C38694al(C38695am amVar, C39226b bVar, C142929d dVar) {
        this.f102170a = amVar;
        this.f102171b = bVar;
        this.f102172c = dVar;
    }

    public final C60870cx apply(Object obj) {
        C38695am amVar = this.f102170a;
        C39226b bVar = this.f102171b;
        C142929d dVar = this.f102172c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92899h(new C38608a());
        }
        C143851w wVar = C142928c.m231885d(C39239a.m68666a(amVar.f102173a, bVar), dVar).f389929D;
        C142946i iVar = new C142946i(wVar);
        wVar.mo119159d(iVar);
        return C43205e.m76192b(C143918bg.m233955a(new C142945h(iVar), new C142937a()));
    }
}
