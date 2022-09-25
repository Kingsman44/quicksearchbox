package com.google.android.libraries.lens.view.p2049a;

import android.os.Bundle;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.view.a.d */
/* compiled from: PG */
public final class C24950d implements C68220f {
    /* renamed from: a */
    public static C58833ax m46180a(Bundle bundle, C24948b bVar) {
        C58833ax axVar;
        if (bundle == null || !bundle.containsKey("LensAccountName")) {
            try {
                axVar = (C58833ax) C60856cj.m92909r(bVar.mo30189a());
            } catch (IllegalStateException | ExecutionException e) {
                throw new IllegalStateException("Failed to get account name; did you attempt to inject outside of LensViewFragment?", e);
            }
        } else {
            axVar = C58833ax.m90833j(bundle.getString("LensAccountName"));
        }
        C68225k.m98532d(axVar);
        return axVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
