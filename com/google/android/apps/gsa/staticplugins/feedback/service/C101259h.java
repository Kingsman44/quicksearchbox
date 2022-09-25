package com.google.android.apps.gsa.staticplugins.feedback.service;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.service.h */
/* compiled from: PG */
public abstract class C101259h extends C8849b implements C101260i {
    public C101259h() {
        super("com.google.android.apps.gsa.staticplugins.feedback.service.IFeedbackPreferencesAccessor");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                boolean d = mo92203d();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, d);
                return true;
            case 2:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo92201b(i3);
                return true;
            case 3:
                String a = mo92200a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 4:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo92202c(readString);
                return true;
            case 5:
                boolean e = mo92204e();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, e);
                return true;
            case 6:
                boolean f = mo92205f();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, f);
                return true;
            default:
                return false;
        }
    }
}
