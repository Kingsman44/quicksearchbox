package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8489m;

import com.google.android.apps.gsa.location.d;
import com.google.android.apps.gsa.location.e;
import com.google.android.apps.gsa.location.p5873a.C74632a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.p2437b.C31861q;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.m.i */
/* compiled from: PG */
public final class C111233i extends C112473ar {

    /* renamed from: a */
    public static final C59071e f309541a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.m.i");

    /* renamed from: b */
    public final C21370a f309542b;

    /* renamed from: c */
    private final C68214a f309543c;

    /* renamed from: d */
    private final C113425ff f309544d;

    /* renamed from: e */
    private final e f309545e;

    public C111233i(C68214a aVar, C21370a aVar2, C113425ff ffVar, e eVar) {
        this.f309543c = aVar;
        this.f309542b = aVar2;
        this.f309544d = ffVar;
        this.f309545e = eVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.MINUTES.toMillis(15);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        if (((Optional) this.f309543c.mo27525b()).isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return m186307l(this.f309542b);
        } else if (!this.f309544d.mo100141g()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return m186307l(this.f309542b);
        } else {
            C31861q c = C31861q.m59267c(C58485gu.m89847o(Place.Field.NAME, Place.Field.TYPES)).mo37449c();
            return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C60922j.m93045h(((C74632a) ((C58847bk) this.f309545e.a).f156646a).mo71010a(), new d((C31863s) ((Optional) this.f309543c.mo27525b()).get(), c, C39226b.TAG_CLASSIC_ASSISTANT_TAPAS), C60826bg.f164896a)), new C111231g(this), C60826bg.f164896a), Exception.class, C111232h.f309540a, C60826bg.f164896a);
        }
    }

    /* renamed from: m */
    public final long mo99046m() {
        return TimeUnit.MINUTES.toMillis(15);
    }
}
