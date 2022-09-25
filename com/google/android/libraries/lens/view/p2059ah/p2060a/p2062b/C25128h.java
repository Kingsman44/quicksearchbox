package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.p1994b.C24067a;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.p2056af.C25057bb;
import com.google.android.libraries.lens.view.p2159q.C27608bb;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.h */
/* compiled from: PG */
final class C25128h implements C47352j {

    /* renamed from: a */
    public static final C58974d f68427a = C58974d.m91135i("BCBackgroundLanguageSynclet");

    /* renamed from: b */
    public final Context f68428b;

    /* renamed from: c */
    public final C60887da f68429c;

    /* renamed from: d */
    public final C24067a f68430d;

    /* renamed from: e */
    public final C27608bb f68431e;

    /* renamed from: f */
    public final C26034j f68432f;

    /* renamed from: g */
    final C24450e f68433g = new C25127g(this);

    /* renamed from: h */
    public final C25057bb f68434h;

    /* renamed from: i */
    private final boolean f68435i;

    public C25128h(Context context, boolean z, C60887da daVar, C24067a aVar, C27608bb bbVar, C26034j jVar, C25057bb bbVar2) {
        this.f68428b = context;
        this.f68435i = z;
        this.f68429c = daVar;
        this.f68430d = aVar;
        this.f68431e = bbVar;
        this.f68432f = jVar;
        this.f68434h = bbVar2;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f68435i) {
            ((C58970a) ((C58970a) f68427a.mo56224b()).mo56372aa(49815)).mo56386p("Bluechip background sync singleton flag not enabled.");
            return C60856cj.m92900i(false);
        }
        C60870cx d = C28122k.m52404d(this.f68428b, this.f68429c);
        C25123c cVar = new C25123c(this);
        return C60922j.m93045h(d, C47810es.m84966f(cVar), this.f68429c);
    }
}
