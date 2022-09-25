package com.google.android.libraries.onegoogle.p2378b.p2379a;

import android.graphics.Bitmap;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.onegoogle.b.a.l */
/* compiled from: PG */
final class C30823l implements C5930e {

    /* renamed from: a */
    final /* synthetic */ C30824m f83155a;

    /* renamed from: b */
    private final C30821j f83156b;

    /* renamed from: c */
    private C60870cx f83157c;

    /* renamed from: d */
    private final int f83158d;

    public C30823l(C30824m mVar, C30821j jVar, int i) {
        this.f83155a = mVar;
        this.f83156b = jVar;
        this.f83158d = i;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return Bitmap.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
        C60870cx cxVar = this.f83157c;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f83157c = null;
        }
    }

    /* renamed from: d */
    public final void mo11924d() {
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        C60870cx e = this.f83155a.f83159a.mo36641e(this.f83156b.mo36519b().mo36522b(), this.f83158d);
        this.f83157c = e;
        C30822k kVar = new C30822k(dVar);
        C60856cj.m92911t(e, C47810es.m84974n(kVar), C60826bg.f164896a);
    }
}
