package com.google.android.libraries.gcoreclient.p1796t.p1797a;

import android.os.Parcel;
import com.google.android.gms.mobiledataplan.consent.C145520a;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.t.a.s */
/* compiled from: PG */
public final class C21689s extends C21655a {

    /* renamed from: a */
    private final ConsentAgreementText f60013a;

    public C21689s(ConsentAgreementText consentAgreementText) {
        this.f60013a = consentAgreementText;
    }

    /* renamed from: a */
    public final int mo27045a() {
        return this.f60013a.f393544g;
    }

    /* renamed from: b */
    public final byte[] mo27046b() {
        Parcel obtain = Parcel.obtain();
        C145520a.m236590a(this.f60013a, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
