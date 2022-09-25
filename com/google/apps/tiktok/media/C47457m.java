package com.google.apps.tiktok.media;

import com.bumptech.glide.C5514ad;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.media.m */
/* compiled from: PG */
public final /* synthetic */ class C47457m implements C69464a {

    /* renamed from: a */
    public final /* synthetic */ C47458n f123233a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f123234b;

    public /* synthetic */ C47457m(C47458n nVar, C69464a aVar) {
        this.f123233a = nVar;
        this.f123234b = aVar;
    }

    /* renamed from: b */
    public final Object mo17428b() {
        C47573bx w;
        C47458n nVar = this.f123233a;
        C69464a aVar = this.f123234b;
        C47573bx a = nVar.f123235a.mo51387a("GlideApp.with");
        try {
            w = C47831fm.m85028w();
            C5514ad adVar = (C5514ad) aVar.mo17428b();
            w.close();
            a.close();
            return adVar;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                C47456l.m84430a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
