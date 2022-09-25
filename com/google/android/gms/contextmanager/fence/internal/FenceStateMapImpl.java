package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144043k();

    /* renamed from: a */
    public final Map f390282a = new HashMap();

    public FenceStateMapImpl(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f390282a.put(str, (FenceStateImpl) C143948d.m234108a((byte[]) C143919bh.m233958a(bundle.getByteArray(str)), FenceStateImpl.CREATOR));
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f390282a.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), C143948d.m234110c((FenceStateImpl) entry.getValue()));
        }
        C143947c.m234093l(parcel, 2, bundle);
        C143947c.m234083b(parcel, a);
    }
}
