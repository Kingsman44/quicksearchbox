package com.google.android.libraries.lens.view.gleam;

import android.os.Trace;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.gleam.fa */
/* compiled from: PG */
final class C26581fa {

    /* renamed from: a */
    public static final long f72455a = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: b */
    public static final long f72456b = TimeUnit.MILLISECONDS.toMicros(15);

    /* renamed from: c */
    public static final long f72457c = TimeUnit.MILLISECONDS.toMicros(150);

    /* renamed from: d */
    public final C21370a f72458d;

    /* renamed from: e */
    public final ArrayDeque f72459e = new ArrayDeque();

    /* renamed from: f */
    public final boolean f72460f;

    /* renamed from: g */
    public long f72461g = 0;

    /* renamed from: h */
    public long f72462h = 0;

    /* renamed from: i */
    public boolean f72463i = false;

    /* renamed from: j */
    public long f72464j = 0;

    /* renamed from: k */
    public C28097c f72465k = null;

    /* renamed from: l */
    private final C26531di f72466l;

    static {
        C58974d.m91135i("RenderCadenceManager");
    }

    public C26581fa(C21370a aVar, C26531di diVar, boolean z) {
        this.f72458d = aVar;
        this.f72466l = diVar;
        this.f72460f = z;
    }

    /* renamed from: a */
    public final void mo31840a(long j) {
        while (!this.f72459e.isEmpty() && ((C28097c) this.f72459e.element()).f76484b <= j) {
            this.f72465k = (C28097c) this.f72459e.remove();
            mo31841b(false);
        }
    }

    /* renamed from: b */
    public final void mo31841b(boolean z) {
        if (!this.f72460f) {
            z = !z;
        }
        C28097c cVar = this.f72465k;
        if (cVar != null && z) {
            mo31842c(cVar);
        }
    }

    /* renamed from: c */
    public final void mo31842c(C28097c cVar) {
        C26540dr drVar = this.f72466l.f72321a;
        Trace.beginSection("updateGleamAndCameraViews");
        C26539dq b = drVar.mo31809b(cVar.mo33559b(), true);
        if (b.f72330b) {
            drVar.f72359z = C58833ax.m90834k(cVar);
        } else if (!b.f72329a) {
            drVar.f72359z = C58836b.f156633a;
            drVar.mo31815h(cVar);
        } else {
            drVar.f72359z = C58836b.f156633a;
            drVar.mo31813f(cVar);
        }
        Trace.endSection();
    }
}
