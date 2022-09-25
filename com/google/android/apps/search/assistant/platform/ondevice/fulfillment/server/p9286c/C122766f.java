package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122399ar;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.c.f */
/* compiled from: PG */
public final class C122766f implements C122762b {

    /* renamed from: a */
    public static final C59071e f340082a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.c.f");

    /* renamed from: b */
    public final Set f340083b = new HashSet();

    /* renamed from: c */
    private final Executor f340084c;

    public C122766f(Executor executor) {
        this.f340084c = executor;
    }

    /* renamed from: a */
    public final synchronized void mo105733a(C122761a aVar) {
        this.f340083b.add(aVar);
    }

    /* renamed from: b */
    public final void mo105734b(C122399ar arVar) {
        C65753ak b = C65753ak.m96797b(arVar.f339336a);
        if (b == null) {
            ((C59052c) ((C59052c) f340082a.mo56226d()).mo56372aa(34931)).mo56387q("Invalid corpus number %s. Ignoring update", arVar.f339336a);
            return;
        }
        C122763c cVar = new C122763c(this, b);
        C123047cn.m202382b(C60856cj.m92903l(C47810es.m84977q(cVar), this.f340084c), C122764d.f340080a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final synchronized void mo105735c(C122761a aVar) {
        this.f340083b.remove(aVar);
    }
}
