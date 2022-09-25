package com.google.android.libraries.componentview.services.p1701a.p1702a;

import com.bumptech.glide.load.data.C5929d;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20578be;
import com.google.common.util.concurrent.C60845bz;
import java.io.ByteArrayInputStream;

/* renamed from: com.google.android.libraries.componentview.services.a.a.c */
/* compiled from: PG */
final class C20530c implements C60845bz {

    /* renamed from: a */
    final C5929d f57674a;

    public C20530c(C5929d dVar) {
        this.f57674a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C20520h.m38497b(6, "ImageDataFetcher", th, "Fetch failed ", C19742a.IMAGE_FETCH_ERROR, null);
        this.f57674a.mo12183f((Object) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C20578be beVar = (C20578be) obj;
        if (beVar == null || !beVar.f57759c) {
            C20520h.m38497b(6, "ImageDataFetcher", (Throwable) null, "Fetch failed with no response ", C19742a.IMAGE_LOADING_ERROR, null);
            this.f57674a.mo12183f((Object) null);
            return;
        }
        this.f57674a.mo12183f(new ByteArrayInputStream(beVar.f57758b));
    }
}
