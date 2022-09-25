package com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a;

import com.google.android.gms.wallet.firstparty.C146349a;
import com.google.android.gms.wallet.firstparty.p10886b.C146354c;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.ab.a.b.a.d */
/* compiled from: PG */
public final class C21422d {
    /* renamed from: a */
    public static final /* bridge */ /* synthetic */ void m40539a(byte[] bArr, C21428f fVar) {
        C146349a aVar = fVar.f59889a;
        if (aVar instanceof C146354c) {
            ((C146354c) aVar).f395377c.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            return;
        }
        throw new ClassCastException("baseIntentBuilder should be an instance of UpdateInstrumentIntentBuilder.");
    }
}
