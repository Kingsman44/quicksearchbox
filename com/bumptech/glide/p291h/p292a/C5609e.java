package com.bumptech.glide.p291h.p292a;

import android.util.Log;
import androidx.core.p097i.C1971f;

/* renamed from: com.bumptech.glide.h.a.e */
/* compiled from: PG */
public final class C5609e implements C1971f {

    /* renamed from: a */
    private final C5608d f16943a;

    /* renamed from: b */
    private final C5611g f16944b;

    /* renamed from: c */
    private final C1971f f16945c;

    public C5609e(C1971f fVar, C5608d dVar, C5611g gVar) {
        this.f16945c = fVar;
        this.f16943a = dVar;
        this.f16944b = gVar;
    }

    /* renamed from: a */
    public final Object mo5126a() {
        Object a = this.f16945c.mo5126a();
        if (a == null) {
            a = this.f16943a.mo12054a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(a.getClass()))));
            }
        }
        if (a instanceof C5610f) {
            ((C5610f) a).mo12055fC().mo12056a(false);
        }
        return a;
    }

    /* renamed from: b */
    public final boolean mo5127b(Object obj) {
        if (obj instanceof C5610f) {
            ((C5610f) obj).mo12055fC().mo12056a(true);
        }
        this.f16944b.mo12053a(obj);
        return this.f16945c.mo5127b(obj);
    }
}
