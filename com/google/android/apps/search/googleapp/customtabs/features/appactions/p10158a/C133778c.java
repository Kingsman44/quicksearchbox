package com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a;

import android.net.Uri;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.a.c */
/* compiled from: PG */
public final /* synthetic */ class C133778c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133781f f364393a;

    public /* synthetic */ C133778c(C133781f fVar) {
        this.f364393a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C133781f fVar = this.f364393a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return C47633f.m84733g(C5528f.m14300b(C5528f.m14299a(fVar.f364406e.mo51286a().mo11864b().mo12445g(Uri.parse((String) optional.get()))))).mo51515h(C133776a.f364391a, fVar.f364407f).mo51513e(Exception.class, C133777b.f364392a, fVar.f364407f);
    }
}
