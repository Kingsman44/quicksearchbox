package com.google.android.libraries.web.shared.keys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;

/* compiled from: PG */
public final class ParcelableCallbackKeyMultimap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C44098b();

    /* renamed from: a */
    private final C58512hu f114780a;

    public ParcelableCallbackKeyMultimap(Parcel parcel) {
        C58506ho hoVar = new C58506ho();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            try {
                String readString = parcel.readString();
                C58893dc.m90996a(readString);
                Class<?> cls = Class.forName(readString);
                String readString2 = parcel.readString();
                C58893dc.m90996a(readString2);
                hoVar.mo55456j(cls, Class.forName(readString2));
                i++;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("ParcelableCallbackKeyMultimap should only be created from a parcel it wrote.", e);
            }
        }
        this.f114780a = hoVar.mo55453g();
    }

    public ParcelableCallbackKeyMultimap(C58512hu huVar) {
        this.f114780a = huVar;
    }

    /* renamed from: a */
    public final C58528ij mo47067a(Class cls) {
        return C58528ij.m90006F(this.f114780a.mo55423a(cls));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f114780a.size);
        Collection.EL.stream(this.f114780a.mo54948A()).forEach(new C44097a(parcel));
    }
}
