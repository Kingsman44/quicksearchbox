package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.libraries.componentview.services.application.C20578be;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.charset.Charset;

/* compiled from: PG */
public class ParcelableFetcherResponse extends C20578be implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C84126af();

    /* renamed from: g */
    private static final C59071e f229050g = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.ParcelableFetcherResponse");

    public ParcelableFetcherResponse() {
    }

    public ParcelableFetcherResponse(Parcel parcel) {
        boolean z = parcel.readInt() > 0;
        this.f57759c = z;
        if (z) {
            try {
                this.f57758b = C23338c.m43773e(parcel);
                String readString = parcel.readString();
                if (readString != null) {
                    this.f57757a = Charset.forName(readString);
                }
                this.f57760d = parcel.readInt();
                this.f57762f = parcel.readString();
            } catch (RemoteException e) {
                this.f57759c = false;
                C59104x c = f229050g.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ParcelableFetcherRespon");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7064)).mo56386p("Large data read failed.");
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f57759c ? 1 : 0);
        if (this.f57759c) {
            C23338c.m43770b(parcel, this.f57758b);
            Charset charset = this.f57757a;
            parcel.writeString(charset != null ? charset.name() : null);
            parcel.writeInt(this.f57760d);
            parcel.writeString(this.f57762f);
        }
    }
}
