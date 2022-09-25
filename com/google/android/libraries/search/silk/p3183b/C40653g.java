package com.google.android.libraries.search.silk.p3183b;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.search.silk.b.g */
/* compiled from: PG */
public final class C40653g implements C40652f {
    /* renamed from: a */
    public final C60870cx mo42583a(C47215a aVar, int i, String... strArr) {
        C40649c cVar = (C40649c) aVar.mo51122q().f634a.mo671c("silk.permissions.PermissionsFragment");
        if (cVar == null) {
            cVar = new C40649c();
            C68324h.m98669f(cVar);
            C0154a aVar2 = new C0154a(aVar.mo51122q());
            aVar2.mo685r(cVar, "silk.permissions.PermissionsFragment");
            aVar2.mo509f();
        }
        C40650d f = cVar.mo17754z();
        C40655i a = f.mo42582a();
        Fragment fragment = f.f106669a;
        if (a.f106671a != null) {
            return C60856cj.m92899h(new C40651e());
        }
        a.f106672b = i;
        fragment.requestPermissions(strArr, i);
        return C2169h.m6027a(new C40654h(a));
    }
}
