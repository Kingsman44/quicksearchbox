package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.v */
/* compiled from: PG */
final class C120414v implements C120392a {

    /* renamed from: a */
    final /* synthetic */ C60870cx f334925a;

    /* renamed from: b */
    final /* synthetic */ Optional f334926b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f334927c;

    /* renamed from: d */
    final /* synthetic */ C37402bg f334928d;

    /* renamed from: e */
    final /* synthetic */ C120416x f334929e;

    public C120414v(C120416x xVar, C60870cx cxVar, Optional optional, C60870cx cxVar2, C37402bg bgVar) {
        this.f334929e = xVar;
        this.f334925a = cxVar;
        this.f334926b = optional;
        this.f334927c = cxVar2;
        this.f334928d = bgVar;
    }

    /* renamed from: a */
    public final C120507d mo104739a() {
        return this.f334929e.f334936e;
    }

    /* renamed from: b */
    public final C60870cx mo104740b() {
        return this.f334927c;
    }

    /* renamed from: c */
    public final C60870cx mo104741c() {
        return this.f334925a;
    }

    public final void close() {
        C59104x b = C120416x.f334932a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
        ((C59052c) ((C59052c) b).mo56372aa(35446)).mo56386p("Session#close");
        this.f334928d.mo20354a();
        this.f334927c.cancel(false);
    }

    /* renamed from: d */
    public final Optional mo104743d() {
        return this.f334926b;
    }
}
