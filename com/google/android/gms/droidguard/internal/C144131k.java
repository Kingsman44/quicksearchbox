package com.google.android.gms.droidguard.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.droidguard.internal.k */
/* compiled from: PG */
public final /* synthetic */ class C144131k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C144132l f390430a;

    public /* synthetic */ C144131k(C144132l lVar) {
        this.f390430a = lVar;
    }

    public final void run() {
        C144132l lVar = this.f390430a;
        if (lVar.f390433c != null) {
            try {
                C144136p pVar = lVar.f390433c;
                pVar.mo17263hf(3, pVar.mo17260gA());
            } catch (Exception unused) {
                Log.e("DGHandleImpl", "Error while closing handle.");
            }
            lVar.f390433c = null;
            C144135o oVar = lVar.f390431a;
            oVar.f390441a--;
            oVar.mo119684f();
        }
    }
}
