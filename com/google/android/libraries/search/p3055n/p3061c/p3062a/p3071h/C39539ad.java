package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import android.content.Context;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.h.ad */
/* compiled from: PG */
public final /* synthetic */ class C39539ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f104103a;

    public /* synthetic */ C39539ad(Context context) {
        this.f104103a = context;
    }

    public final Object call() {
        String absolutePath = this.f104103a.getCacheDir().getAbsolutePath();
        C58976aa aaVar = C58975e.f156826a;
        return String.valueOf(absolutePath).concat("/soda-hotword");
    }
}
