package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.view.p2070an.C25429ba;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27981d;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27891h;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27815ac;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27804f;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.i */
/* compiled from: PG */
public final class C27953i {

    /* renamed from: d */
    private static final C58974d f76107d = C58974d.m91135i("HybridEligibilityHelper");

    /* renamed from: a */
    public final C27981d f76108a;

    /* renamed from: b */
    public final C27815ac f76109b;

    /* renamed from: c */
    public final C27804f f76110c;

    /* renamed from: e */
    private final C25429ba f76111e;

    /* renamed from: f */
    private final boolean f76112f;

    /* renamed from: g */
    private final long f76113g;

    public C27953i(C27981d dVar, C25429ba baVar, C27815ac acVar, C27804f fVar, boolean z, long j) {
        this.f76108a = dVar;
        this.f76111e = baVar;
        this.f76109b = acVar;
        this.f76110c = fVar;
        this.f76112f = z;
        this.f76113g = j;
    }

    /* renamed from: a */
    public static C27952h m52034a(C60870cx cxVar) {
        if (!cxVar.isDone()) {
            return C27952h.m52032b();
        }
        try {
            return new C27945a(C58833ax.m90834k((C27891h) C60856cj.m92909r(cxVar)));
        } catch (CancellationException | ExecutionException e) {
            ((C58970a) ((C58970a) f76107d.mo56226d()).mo56372aa(50120)).mo56389s("Hybrid eligibility not confirmed: %s", e.getMessage());
            return C27952h.m52032b();
        }
    }

    /* renamed from: b */
    public final boolean mo33429b(C56280cg cgVar) {
        if (this.f76112f && C28130s.m52412c(cgVar, C56306df.TRANSLATE)) {
            return true;
        }
        if (!Collection.EL.stream(cgVar.f149994a).anyMatch(new C27951g(this)) || this.f76111e.mo30480a() < this.f76113g) {
            return false;
        }
        return true;
    }
}
