package com.google.android.play.core.p3534f;

import android.util.Log;
import java.util.Set;

/* renamed from: com.google.android.play.core.f.r */
/* compiled from: PG */
final class C45110r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Set f117780a;

    /* renamed from: b */
    final /* synthetic */ C45111s f117781b;

    public C45110r(C45111s sVar, Set set) {
        this.f117781b = sVar;
        this.f117780a = set;
    }

    public final void run() {
        try {
            this.f117781b.mo48944b(this.f117780a);
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
