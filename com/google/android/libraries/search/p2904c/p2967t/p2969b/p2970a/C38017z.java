package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2916e.C37558e;
import com.google.android.libraries.search.p2904c.p2928g.C37619d;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2942m.p2944b.C37875c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.t.b.a.z */
/* compiled from: PG */
public final class C38017z implements C38010s {

    /* renamed from: d */
    private static final C59071e f100718d = C59071e.m91332i("com.google.android.libraries.search.c.t.b.a.z");

    /* renamed from: a */
    public final C37987ag f100719a;

    /* renamed from: b */
    public final C37875c f100720b;

    /* renamed from: c */
    public final C58833ax f100721c;

    /* renamed from: e */
    private final C37619d f100722e;

    /* renamed from: f */
    private final C37360ay f100723f;

    /* renamed from: g */
    private final Executor f100724g;

    public C38017z(C37619d dVar, C37987ag agVar, C37875c cVar, C58833ax axVar, C37360ay ayVar, Executor executor) {
        this.f100722e = dVar;
        this.f100719a = agVar;
        this.f100720b = cVar;
        this.f100721c = axVar;
        this.f100723f = ayVar;
        this.f100724g = executor;
    }

    /* renamed from: a */
    public final C37360ay mo41194a() {
        return this.f100723f;
    }

    /* renamed from: b */
    public final C37558e mo41195b() {
        return this.f100719a.f100635b.mo41003b();
    }

    /* renamed from: c */
    public final C58833ax mo41196c() {
        return this.f100721c;
    }

    /* renamed from: d */
    public final C60870cx mo41197d(C37565ef efVar) {
        return this.f100719a.mo41190a(efVar);
    }

    /* renamed from: e */
    public final C60870cx mo41198e() {
        return this.f100719a.f100636c;
    }

    /* renamed from: f */
    public final C60870cx mo41199f(int i) {
        C59104x b = f100718d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.SrcAccessor");
        ((C59052c) ((C59052c) b).mo56372aa(52939)).mo56387q("#audio# handover audio source(handOffOffset(%d bytes))", i);
        C58833ax b2 = this.f100722e.mo41032a().mo56106b(new C38011t(i));
        C58833ax b3 = this.f100722e.f99969h.mo56106b(new C38012u(i));
        C37563ed edVar = C37563ed.OPENED_SEAMLESSLY;
        return C60856cj.m92900i(C37846as.m66798d(b2, b3, C37846as.m66804j(edVar), C58833ax.m90834k(this.f100720b.f100423b)));
    }

    /* renamed from: g */
    public final C60870cx mo41200g() {
        return C60922j.m93045h(this.f100719a.mo41191b(), C47810es.m84966f(new C38016y(this, this.f100722e)), this.f100724g);
    }
}
