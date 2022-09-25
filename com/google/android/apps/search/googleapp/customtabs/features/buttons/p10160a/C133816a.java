package com.google.android.apps.search.googleapp.customtabs.features.buttons.p10160a;

import com.google.android.apps.search.googleapp.customtabs.p10152d.C133749j;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133720f;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133721g;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133734t;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133739y;
import com.google.android.apps.search.googleapp.saves.p10388b.C137193a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.lang.ref.WeakReference;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.a.a */
/* compiled from: PG */
public final class C133816a implements C137193a {

    /* renamed from: a */
    private final C133749j f364486a;

    public C133816a(C133749j jVar) {
        this.f364486a = jVar;
    }

    /* renamed from: a */
    public final void mo111406a(String str, boolean z) {
        C133731q qVar;
        C133739y a = this.f364486a.mo111383a();
        if (a != null) {
            C58480gp e = C58485gu.m89837e();
            for (Integer num : a.f364261d) {
                WeakReference weakReference = (WeakReference) a.f364260c.get(num);
                if (!(weakReference == null || (qVar = (C133731q) weakReference.get()) == null)) {
                    e.mo55395g(qVar);
                }
            }
            C58485gu f = e.mo55394f();
            int i = ((C58724pq) f).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C133731q qVar2 = (C133731q) f.get(i2);
                if (qVar2.f364241j) {
                    Stream stream = Collection.EL.stream(qVar2.f364238g);
                    Class<C133821f> cls = C133821f.class;
                    Objects.requireNonNull(cls);
                    Stream filter = stream.filter(new C133720f(cls));
                    Objects.requireNonNull(cls);
                    C133821f fVar = (C133821f) ((C133734t) filter.map(new C133721g(cls)).findFirst().orElse(null));
                    if (fVar != null) {
                        C60870cx b = fVar.f364496e.mo57305b(C47810es.m84965e(new C133819d(fVar, str, z)), fVar.f364495d);
                        C60845bz bzVar = C133821f.f364493b;
                        C60856cj.m92911t(b, C47810es.m84974n(bzVar), fVar.f364495d);
                    }
                }
            }
        }
    }
}
