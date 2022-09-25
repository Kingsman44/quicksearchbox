package com.google.android.libraries.lens.view.connectivity;

/* renamed from: com.google.android.libraries.lens.view.connectivity.a */
/* compiled from: PG */
public final /* synthetic */ class C25747a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25748b f70011a;

    public /* synthetic */ C25747a(C25748b bVar) {
        this.f70011a = bVar;
    }

    public final void run() {
        LensConnectivityManager lensConnectivityManager = this.f70011a.f70012a;
        if (lensConnectivityManager.f70006b != null) {
            lensConnectivityManager.mo30906j();
        }
    }
}
