package com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1743a.p1744a;

import com.google.android.gms.wallet.firstparty.C146349a;
import com.google.android.gms.wallet.firstparty.p10885a.C146350a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.ab.a.a.a.b */
/* compiled from: PG */
public final class C21418b {
    /* renamed from: a */
    public static final void m40537a(byte[] bArr, C21428f fVar) {
        C146349a aVar = fVar.f59889a;
        if (aVar instanceof C146350a) {
            ((C146350a) aVar).f395377c.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
            return;
        }
        throw new ClassCastException("baseIntentBuilder should be an instance of InitializeAddressCollectionIntentBuilder.");
    }
}
