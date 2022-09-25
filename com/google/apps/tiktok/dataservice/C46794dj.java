package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.dj */
/* compiled from: PG */
abstract class C46794dj {

    /* renamed from: a */
    public static final C46792di f122160a = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        /* renamed from: b */
        public final void mo18078b(Object obj) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        /* renamed from: c */
        public final void mo18079c() {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }
    };

    /* renamed from: a */
    public abstract long mo50725a();

    /* renamed from: b */
    public abstract C46792di mo50726b();

    /* renamed from: c */
    public abstract C58833ax mo50727c();

    /* renamed from: d */
    public abstract C58833ax mo50728d();

    /* renamed from: e */
    public abstract boolean mo50729e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C46794dj mo50807f(C46768cl clVar) {
        return new C46684ab(mo50725a(), mo50726b(), mo50729e(), C58833ax.m90834k(clVar), C58833ax.m90834k(clVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C46794dj mo50808g(boolean z) {
        C58838bb.m90884s(mo50726b() instanceof C46685ac, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        C58838bb.m90884s(z != mo50729e(), "Double-open or double-close on background fetch callbacks.");
        return new C46684ab(mo50725a(), mo50726b(), z, mo50728d(), mo50727c());
    }
}
