package com.google.android.gms.droidguard;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.droidguard.internal.C144123c;
import com.google.android.gms.droidguard.internal.C144128h;
import com.google.android.gms.droidguard.internal.C144135o;
import com.google.android.libraries.phenotype.client.C31654aj;

/* renamed from: com.google.android.gms.droidguard.a */
/* compiled from: PG */
public final class C144099a {

    /* renamed from: a */
    public final C144128h f390378a;

    public C144099a(Context context) {
        C31654aj.m58985d(context);
        this.f390378a = new C144128h(context);
    }

    /* renamed from: a */
    public final C144112b mo119653a() {
        Object obj;
        C144128h hVar = this.f390378a;
        C144123c cVar = new C144123c(hVar);
        C144135o oVar = hVar.f390425a;
        C143919bh.m233965h("This method must not be called on the main thread.");
        oVar.mo119683b(cVar);
        try {
            obj = cVar.f390404a.mo119661a((long) cVar.f390437e.mo119651a());
            if (obj == null) {
                int a = cVar.f390437e.mo119651a();
                obj = cVar.mo119672a("timeout: " + a + " ms", (Throwable) null);
            }
        } catch (InterruptedException e) {
            int a2 = cVar.f390437e.mo119651a();
            obj = cVar.mo119672a("takeWithTimeout(" + a2 + ") got interrupted", e);
        }
        return (C144112b) obj;
    }
}
