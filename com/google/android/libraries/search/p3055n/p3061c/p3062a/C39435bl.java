package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39501f;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39504i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39510o;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39511p;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39512q;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39513r;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39514s;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.n.c.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C39435bl implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103816a;

    /* renamed from: b */
    public final /* synthetic */ boolean f103817b;

    /* renamed from: c */
    public final /* synthetic */ String f103818c;

    /* renamed from: d */
    public final /* synthetic */ boolean f103819d;

    public /* synthetic */ C39435bl(C39479cu cuVar, boolean z, String str, boolean z2) {
        this.f103816a = cuVar;
        this.f103817b = z;
        this.f103818c = str;
        this.f103819d = z2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39479cu cuVar = this.f103816a;
        boolean z = this.f103817b;
        String str = this.f103818c;
        boolean z2 = this.f103819d;
        C39501f fVar = cuVar.f103957h;
        C39510o oVar = (C39510o) C39514s.f104043d.createBuilder();
        oVar.copyOnWrite();
        C39514s sVar = (C39514s) oVar.instance;
        sVar.f104045a |= 1;
        sVar.f104046b = z;
        C39511p pVar = (C39511p) C39513r.f104037e.createBuilder();
        pVar.copyOnWrite();
        C39513r rVar = (C39513r) pVar.instance;
        rVar.f104040b = C39512q.m68937a(4);
        rVar.f104039a |= 1;
        pVar.copyOnWrite();
        C39513r rVar2 = (C39513r) pVar.instance;
        rVar2.f104039a |= 2;
        rVar2.f104041c = str;
        pVar.copyOnWrite();
        C39513r rVar3 = (C39513r) pVar.instance;
        rVar3.f104039a |= 4;
        rVar3.f104042d = z2;
        oVar.copyOnWrite();
        C39514s sVar2 = (C39514s) oVar.instance;
        C39513r rVar4 = (C39513r) pVar.build();
        rVar4.getClass();
        sVar2.f104047c = rVar4;
        sVar2.f104045a |= 2;
        return C70876o.m103760a(fVar.f189039a.mo39510a(C39504i.m68927b(), fVar.f189040b), (C39514s) oVar.build());
    }
}
