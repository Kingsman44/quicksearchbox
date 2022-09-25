package com.google.android.apps.search.lens;

import android.app.Activity;
import com.google.android.libraries.lens.view.C27458o;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.search.lens.j */
/* compiled from: PG */
public final class C139934j implements C68220f {
    /* renamed from: a */
    public static C27458o m227570a(Activity activity) {
        if (activity instanceof C139924b) {
            C27458o w = ((C139924b) activity).mo115341w();
            w.getClass();
            return w;
        }
        throw new IllegalStateException("Attempt to inject LensViewFragment in unsupported Activity");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
