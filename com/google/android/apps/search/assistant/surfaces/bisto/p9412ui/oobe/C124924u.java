package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124673cl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124682cu;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124683cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.u */
/* compiled from: PG */
public final class C124924u implements C124922s {

    /* renamed from: a */
    public final C124659by f344671a;

    /* renamed from: b */
    private final C124669ch f344672b;

    /* renamed from: c */
    private final C60887da f344673c;

    public C124924u(C124669ch chVar, C124659by byVar, C60887da daVar) {
        this.f344672b = chVar;
        this.f344671a = byVar;
        this.f344673c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo106719a(String str) {
        C124669ch chVar = this.f344672b;
        C124682cu cuVar = (C124682cu) C124683cv.f343976c.createBuilder();
        cuVar.copyOnWrite();
        C124683cv cvVar = (C124683cv) cuVar.instance;
        str.getClass();
        cvVar.f343978a |= 1;
        cvVar.f343979b = str;
        return C60922j.m93045h(C70876o.m103760a(chVar.f189039a.mo39510a(C124673cl.m204366d(), chVar.f189040b), (C124683cv) cuVar.build()), C47810es.m84966f(new C124923t(this, str)), this.f344673c);
    }
}
