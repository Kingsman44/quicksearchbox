package com.google.android.gms.languageprofile.p10819a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguageFluency;
import com.google.android.gms.languageprofile.LanguagePreference;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.languageprofile.a.a */
/* compiled from: PG */
public abstract class C144437a extends C8849b implements C144438b {
    public C144437a() {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            parcel.readString();
            enforceNoDataAvail(parcel);
            mo119916c();
        } else if (i == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(LanguagePreference.CREATOR);
            enforceNoDataAvail(parcel);
            mo119914a((Status) C8850c.m23492a(parcel, Status.CREATOR), createTypedArrayList);
        } else if (i == 3) {
            Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            parcel.createTypedArrayList(LanguageFluency.CREATOR);
            enforceNoDataAvail(parcel);
            mo119917d();
        } else if (i != 4) {
            return false;
        } else {
            Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            parcel.readArrayList(C8850c.f30763a);
            enforceNoDataAvail(parcel);
            mo119915b();
        }
        return true;
    }
}
