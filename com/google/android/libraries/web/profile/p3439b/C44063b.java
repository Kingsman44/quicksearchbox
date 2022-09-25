package com.google.android.libraries.web.profile.p3439b;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60845bz;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61366ah;
import java.util.List;

/* renamed from: com.google.android.libraries.web.profile.b.b */
/* compiled from: PG */
final class C44063b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f114726a;

    /* renamed from: b */
    final /* synthetic */ C44064c f114727b;

    public C44063b(C44064c cVar, String str) {
        this.f114727b = cVar;
        this.f114726a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List g = ((C61366ah) obj).f165945a.mo55277g(C61362ad.m93870b("Set-Cookie"));
        if (!g.isEmpty()) {
            C46459k.m82829b(this.f114727b.f114729b.mo47014c(this.f114726a, g), "Failed to set cookies", new Object[0]);
        }
    }
}
