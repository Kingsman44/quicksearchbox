package com.google.android.libraries.p1623at.p1624a;

import android.util.Log;

/* renamed from: com.google.android.libraries.at.a.h */
/* compiled from: PG */
public final class C19465h {
    /* renamed from: a */
    public static final void m37151a(C19458a aVar) {
        try {
            C19466i iVar = (C19466i) Class.forName("gen_binder.root.RootModule$Generated").newInstance();
            boolean z = aVar.f54402d;
            aVar.f54401c.add(iVar);
            iVar.mo24653b();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", e2);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Binder", 5)) {
                Log.w("Binder", "To use Binder more efficiently, your android_binary target should include \"//java/com/google/android/libraries/stitch/binder:rootmodule\" in srcs.");
            }
        }
        synchronized (aVar) {
            if (aVar.f54403e instanceof C19467j) {
                aVar.f54403e = new C19462e();
            }
        }
    }
}
