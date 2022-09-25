package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120508e;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120692g;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a.C120678r;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33441a;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33444d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.C68286a;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.bb */
/* compiled from: PG */
public final class C119973bb {

    /* renamed from: a */
    public static final C59071e f334083a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.d.a.bb");

    /* renamed from: b */
    public final C120692g f334084b;

    /* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.bb$a */
    /* compiled from: PG */
    interface C119974a {
        /* renamed from: b */
        C119954ak mo104594b();

        /* renamed from: d */
        C120508e mo104595d();
    }

    public C119973bb(C120692g gVar) {
        this.f334084b = gVar;
    }

    /* renamed from: b */
    public static void m198875b(C120678r rVar) {
        ((C119974a) C68286a.m98629a(rVar.f335645b.f89543a, C119974a.class)).mo104594b().f334043a.mo19974a(C37176a.f96923bo);
        C2169h.m6027a(new C33444d(((C33441a) C68286a.m98629a(rVar.f335645b.f89543a, C33441a.class)).mo38846j())).cancel(false);
        C58976aa aaVar = C58975e.f156826a;
        String str = rVar.f335644a.f333767a;
    }

    /* renamed from: a */
    public final void mo104593a(Consumer consumer) {
        ((Optional) this.f334084b.mo104877b().f332586a.get()).ifPresent(consumer);
    }
}
