package com.google.android.apps.search.googleapp.customtabs.p10152d;

import com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.q */
/* compiled from: PG */
public final class C133756q {

    /* renamed from: a */
    public static final C59071e f364302a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.d.q");

    /* renamed from: b */
    public final C133745f f364303b;

    /* renamed from: c */
    public final C60888db f364304c;

    /* renamed from: d */
    public final Set f364305d;

    /* renamed from: e */
    public final Object f364306e = new Object();

    /* renamed from: f */
    public final C37215b f364307f;

    /* renamed from: g */
    public final boolean f364308g;

    /* renamed from: h */
    public final Runnable f364309h = new C133752m(this);

    /* renamed from: i */
    public C60870cx f364310i = null;

    /* renamed from: j */
    private final C133678ac f364311j;

    public C133756q(C133678ac acVar, C60888db dbVar, C133745f fVar, Set set, C37215b bVar, boolean z) {
        this.f364311j = acVar;
        this.f364303b = fVar;
        this.f364304c = dbVar;
        this.f364305d = set;
        this.f364307f = bVar;
        this.f364308g = z;
    }

    /* renamed from: a */
    public final C60870cx mo111386a() {
        C60870cx j;
        synchronized (this.f364306e) {
            if (this.f364310i == null) {
                if (this.f364308g) {
                    this.f364307f.mo19974a(C37182a.f98198iF);
                }
                C47633f f = C47633f.m84733g(this.f364311j.f364126e.mo50395b()).mo51516i(new C133750k(this), this.f364304c).mo51514f(Throwable.class, new C133751l(this), this.f364304c);
                this.f364310i = f;
                C133755p pVar = new C133755p(this);
                C60856cj.m92911t(f, C47810es.m84974n(pVar), this.f364304c);
            }
            j = C60856cj.m92901j(this.f364310i);
        }
        return j;
    }

    /* renamed from: b */
    public final void mo111387b() {
        synchronized (this.f364306e) {
            C60870cx cxVar = this.f364310i;
            if (cxVar != null) {
                C133754o oVar = new C133754o(this);
                C60856cj.m92911t(cxVar, C47810es.m84974n(oVar), this.f364304c);
                this.f364310i = null;
            }
        }
    }
}
