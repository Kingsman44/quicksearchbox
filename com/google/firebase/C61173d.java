package com.google.firebase;

import android.util.Log;
import com.google.android.gms.common.api.internal.C143822k;
import com.google.firebase.p4610c.C61133g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.d */
/* compiled from: PG */
final class C61173d implements C143822k {

    /* renamed from: a */
    public static final AtomicReference f165514a = new AtomicReference();

    /* renamed from: a */
    public final void mo57734a(boolean z) {
        synchronized (C61204g.f165553a) {
            Iterator it = new ArrayList(C61204g.f165554b.values()).iterator();
            while (it.hasNext()) {
                C61204g gVar = (C61204g) it.next();
                if (gVar.f165559g.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    for (C61126c cVar : gVar.f165562j) {
                        C61204g gVar2 = cVar.f165445a;
                        if (!z) {
                            ((C61133g) gVar2.f165561i.mo57687a()).mo57700c();
                        }
                    }
                }
            }
        }
    }
}
