package com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a;

import com.google.android.gms.wallet.firstparty.C146349a;
import com.google.android.gms.wallet.firstparty.p10887pm.C146362a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.ab.a.d.a.b */
/* compiled from: PG */
public final class C21440b {
    /* renamed from: a */
    public static final void m40558a(C21442d dVar, C21428f fVar) {
        C146349a aVar = fVar.f59889a;
        if (aVar instanceof C146362a) {
            ((C146362a) aVar).f395377c.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", dVar.f59897a);
            return;
        }
        throw new ClassCastException("baseIntentBuilder should be an instance of PurchaseManagerIntentBuilder.");
    }
}
