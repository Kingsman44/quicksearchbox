package com.google.android.apps.gsa.staticplugins.opa.samson.p8444p;

import androidx.lifecycle.LiveData;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.p.b */
/* compiled from: PG */
public final class C110310b extends LiveData {

    /* renamed from: h */
    public final long f307447h;

    /* renamed from: i */
    public final C21370a f307448i;

    /* renamed from: j */
    public final C22871g f307449j;

    /* renamed from: k */
    public final C22862b f307450k = new C110309a(this);

    /* renamed from: l */
    public C60870cx f307451l;

    public C110310b(long j, C21370a aVar, C22871g gVar) {
        this.f307448i = aVar;
        this.f307447h = j;
        this.f307449j = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        this.f307451l = this.f307449j.mo28204d("TIMER_LIVE_DATA", this.f307447h, this.f307450k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        C60870cx cxVar = this.f307451l;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }
}
