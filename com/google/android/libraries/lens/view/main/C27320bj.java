package com.google.android.libraries.lens.view.main;

import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.main.bj */
/* compiled from: PG */
public final class C27320bj implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            throw new IllegalStateException("Failed to handle prefetch image", th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
    }
}
