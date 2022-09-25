package com.google.android.apps.search.assistant.surfaces.dictation.service.p9483u;

import com.google.android.apps.gsa.binaries.satin.app.asb;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121126d;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.u.i */
/* compiled from: PG */
public final class C126366i implements C126359b {

    /* renamed from: a */
    public static final C59071e f348059a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.u.i");

    /* renamed from: b */
    public final ExecutorService f348060b;

    /* renamed from: c */
    public final asb f348061c;

    /* renamed from: d */
    private final C32240a f348062d;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.u.i$a */
    /* compiled from: PG */
    public interface C126367a {
        /* renamed from: fM */
        C38469m mo107568fM();

        /* renamed from: nN */
        C121126d mo107569nN();
    }

    public C126366i(asb asb, C32240a aVar, ExecutorService executorService) {
        this.f348061c = asb;
        this.f348062d = aVar;
        this.f348060b = executorService;
    }

    /* renamed from: a */
    public final C60870cx mo107567a() {
        return C47633f.m84733g(this.f348062d.f86461a.mo104411a(C126367a.class)).mo51516i(new C126360c(this), this.f348060b).mo51516i(new C126361d(this), this.f348060b).mo51515h(new C126362e(this), this.f348060b);
    }
}
