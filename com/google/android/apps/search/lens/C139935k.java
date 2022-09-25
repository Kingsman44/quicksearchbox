package com.google.android.apps.search.lens;

import android.app.Activity;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.lens.k */
/* compiled from: PG */
public final class C139935k implements C68220f {
    /* renamed from: a */
    public static C27228h m227572a(Activity activity) {
        if (activity instanceof C139924b) {
            C27228h hVar = ((C139924b) activity).f380369l;
            C68225k.m98532d(hVar);
            return hVar;
        }
        throw new IllegalStateException("Attempt to inject ExternalImageData in unsupported Activity");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
