package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9102c.p9103a;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120610a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120643b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C120602a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C59071e f335447a;

    /* renamed from: b */
    public final /* synthetic */ C120580d f335448b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f335449c;

    /* renamed from: d */
    public final /* synthetic */ Executor f335450d;

    public /* synthetic */ C120602a(C59071e eVar, C120580d dVar, C60870cx cxVar, Executor executor) {
        this.f335447a = eVar;
        this.f335448b = dVar;
        this.f335449c = cxVar;
        this.f335450d = executor;
    }

    public final C60870cx apply(Object obj) {
        C59071e eVar = this.f335447a;
        C120580d dVar = this.f335448b;
        C60870cx cxVar = this.f335449c;
        Executor executor = this.f335450d;
        C120643b bVar = (C120643b) obj;
        C120610a aVar = C120610a.HIGH_QUALITY;
        int ordinal = bVar.mo104856c().ordinal();
        if (ordinal == 0) {
            return C60856cj.m92900i(new C120606e(bVar, eVar, dVar, cxVar, executor));
        }
        if (ordinal == 1) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35526)).mo56386p("#hybridFulfill: On-device fulfillment result is not selected because on-device MDA failed. Using online result");
            dVar.mo104850f(C120578b.ONLINE);
            return cxVar;
        } else if (ordinal == 2) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35527)).mo56386p("#hybridFulfill: On-device fulfillment result is not selected because on-device MDA lost. Using online result");
            dVar.mo104851g(C120578b.ONLINE);
            return cxVar;
        } else if (ordinal == 3) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35528)).mo56386p("#hybridFulfill: On-device fulfillment result is not selected because on-device MDA is disabled. Using online result");
            dVar.mo104849e(C120578b.ONLINE);
            return cxVar;
        } else if (ordinal == 4) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35529)).mo56386p("#hybridFulfill: On-device fulfillment result is not high-quality. Using online result");
            dVar.mo104848d(C120578b.ONLINE);
            return cxVar;
        } else {
            throw new IllegalStateException("Unexpected value: ".concat(String.valueOf(String.valueOf(bVar.mo104856c()))));
        }
    }
}
