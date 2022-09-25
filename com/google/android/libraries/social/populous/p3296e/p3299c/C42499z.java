package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.os.CancellationSignal;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60826bg;
import java.io.Closeable;

/* renamed from: com.google.android.libraries.social.populous.e.c.z */
/* compiled from: PG */
final class C42499z implements Closeable, C60803ak {

    /* renamed from: a */
    private final CancellationSignal f111457a = new CancellationSignal();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23284a(C60812at atVar) {
        atVar.mo57268a(this, C60826bg.f164896a);
        return this.f111457a;
    }

    public final void close() {
        this.f111457a.cancel();
    }
}
