package org.chromium.p5643b.p5644a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: org.chromium.b.a.p */
/* compiled from: PG */
public abstract class C72357p extends C8849b implements C72358q {
    public C72357p() {
        super("org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String[] createStringArray = parcel.createStringArray();
            enforceNoDataAvail(parcel);
            mo63816a(createStringArray);
        } else if (i == 2) {
            parcel.readString();
            enforceNoDataAvail(parcel);
            mo63817b();
        } else if (i == 3) {
            parcel.readString();
            parcel.readString();
            enforceNoDataAvail(parcel);
            mo63819d();
        } else if (i != 4) {
            return false;
        } else {
            parcel.readString();
            parcel.readString();
            enforceNoDataAvail(parcel);
            mo63818c();
        }
        parcel2.writeNoException();
        return true;
    }
}
