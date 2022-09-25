package com.google.android.libraries.lens.view.gleam.region;

import android.graphics.RectF;
import android.util.Size;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.p2078at.C25498ad;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.k */
/* compiled from: PG */
public final class C26620k implements C26615f {

    /* renamed from: a */
    public final C26618i f72588a;

    /* renamed from: b */
    final C25499ae f72589b;

    /* renamed from: c */
    public final C60888db f72590c;

    /* renamed from: d */
    public final C46439e f72591d;

    /* renamed from: e */
    public final C26621a f72592e = new C26621a();

    /* renamed from: f */
    public RegionView f72593f;

    /* renamed from: g */
    public C60872cz f72594g;

    /* renamed from: h */
    private final C26586ff f72595h;

    /* renamed from: i */
    private final boolean f72596i;

    /* renamed from: com.google.android.libraries.lens.view.gleam.region.k$a */
    /* compiled from: PG */
    final class C26621a implements C46440f {
        public C26621a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            RectF rectF = (RectF) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            if (C26620k.this.f72593f.mo31882h().equals((RectF) obj)) {
                C47393f.m84236g(new C26616g(true), C26620k.this.f72588a);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C26620k(C26618i iVar, C26586ff ffVar, C25499ae aeVar, C60888db dbVar, boolean z, C46439e eVar) {
        this.f72588a = iVar;
        this.f72595h = ffVar;
        this.f72589b = aeVar;
        this.f72590c = dbVar;
        this.f72591d = eVar;
        this.f72596i = z;
    }

    /* renamed from: a */
    public final RectF mo31903a() {
        C58833ax axVar;
        C26586ff ffVar = this.f72595h;
        RectF b = ffVar.mo31850b(ffVar.mo31849a(ffVar.f72475b), C25980d.EDUCATION);
        RegionView regionView = this.f72593f;
        Size size = regionView.f72547f;
        if (this.f72596i) {
            axVar = C58836b.f156633a;
        } else {
            axVar = regionView.f72548g;
        }
        return C26625o.m49191a(b, size, axVar);
    }

    /* renamed from: b */
    public final void mo31904b(C58833ax axVar) {
        if (axVar.mo56113h()) {
            mo31905c(C26614e.m49159f((RectF) axVar.mo56107c()).mo31892a());
        } else {
            C26613d f = C26614e.m49159f(mo31903a());
            f.mo31893b(true);
            mo31905c(f.mo31892a());
        }
        C47393f.m84236g(new C26616g(false), this.f72588a);
    }

    /* renamed from: c */
    public final void mo31905c(C26614e eVar) {
        this.f72593f.mo31886m(eVar);
        this.f72589b.mo30528a(C25498ad.REGION);
    }
}
