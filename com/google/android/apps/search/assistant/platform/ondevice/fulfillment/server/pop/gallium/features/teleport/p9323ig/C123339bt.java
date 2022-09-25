package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9291g.C122883a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122960l;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122998as;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122999at;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bt */
/* compiled from: PG */
public final class C123339bt implements C122883a, C123340bu {

    /* renamed from: a */
    public static final C59071e f341096a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bt");

    /* renamed from: b */
    public volatile C122999at f341097b;

    /* renamed from: c */
    private final boolean f341098c;

    /* renamed from: d */
    private final C122959k f341099d;

    public C123339bt(C122960l lVar, C42813k kVar, C123511q qVar, C123460gf gfVar, String str, boolean z, boolean z2, Executor executor) {
        C122959k e = lVar.mo105802e();
        this.f341099d = e;
        C123334bo boVar = new C123334bo(new C123333bn(e, kVar, Locale.forLanguageTag(str), qVar, gfVar, executor));
        this.f341097b = m202704a(boVar.f341087a);
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        this.f341098c = z3;
        if (z3) {
            e.mo105795d(new C123336bq(this, boVar));
        }
    }

    /* renamed from: a */
    static /* synthetic */ C122999at m202704a(C122998as asVar) {
        return new C122999at(asVar, C123337br.f341094a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo105728b() {
        if (!this.f341098c) {
            return C60866ct.f164955a;
        }
        C60870cx b = this.f341097b.mo105816b();
        C123332bm bmVar = C123332bm.f341080a;
        return C60922j.m93044g(b, C47810es.m84963c(bmVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo105991c() {
        return this.f341097b.mo105816b();
    }
}
