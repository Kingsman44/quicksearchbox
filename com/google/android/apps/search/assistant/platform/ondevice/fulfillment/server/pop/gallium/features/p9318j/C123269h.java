package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9318j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4985f.p5030q.C65132cx;
import com.google.protos.p5129p.p5130a.C65715an;
import com.google.protos.p5129p.p5130a.C65716ao;
import com.google.protos.p5129p.p5130a.C65733r;
import com.google.protos.p5129p.p5130a.C65740y;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.j.h */
/* compiled from: PG */
public final class C123269h implements C65132cx {

    /* renamed from: a */
    public static final C59071e f340998a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.j.h");

    /* renamed from: b */
    public final C60887da f340999b;

    /* renamed from: d */
    private final Supplier f341000d;

    public C123269h(Supplier supplier, C60887da daVar) {
        this.f341000d = supplier;
        this.f340999b = daVar;
    }

    /* renamed from: e */
    private static String m202616e(C65716ao aoVar) {
        int a = C65715an.m96779a(aoVar.f178539b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 3) {
            return BuildConfig.FLAVOR;
        }
        if (i == 4) {
            return aoVar.f178540c;
        }
        throw new GellerException(C62722b.INVALID_ARGUMENT, "Unsupported ID type.");
    }

    /* renamed from: a */
    public final C60870cx mo59342a() {
        return C60856cj.m92899h(new GellerException(C62722b.UNIMPLEMENTED, "deleteFromGellerStorage is unimplemented from the Gallium service."));
    }

    /* renamed from: b */
    public final C60870cx mo59343b(C65733r rVar) {
        try {
            C65716ao aoVar = rVar.f178577a;
            if (aoVar == null) {
                aoVar = C65716ao.f178536d;
            }
            return C60922j.m93045h((C60870cx) this.f341000d.get(), C47810es.m84966f(new C123263b(this, m202616e(aoVar), rVar)), this.f340999b);
        } catch (GellerException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo59344c(C65740y yVar) {
        try {
            C65716ao aoVar = yVar.f178594a;
            if (aoVar == null) {
                aoVar = C65716ao.f178536d;
            }
            return C60922j.m93045h((C60870cx) this.f341000d.get(), C47810es.m84966f(new C123266e(this, m202616e(aoVar), yVar)), this.f340999b);
        } catch (GellerException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: d */
    public final C60870cx mo59345d() {
        return C60856cj.m92899h(new GellerException(C62722b.UNIMPLEMENTED, "writeToGellerStorage is unimplemented from the Gallium service."));
    }
}
