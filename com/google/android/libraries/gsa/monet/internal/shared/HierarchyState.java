package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23099b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;

/* compiled from: PG */
public final class HierarchyState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23044i();

    /* renamed from: a */
    public final C23088b f63364a;

    /* renamed from: b */
    public final C23099b f63365b;

    public HierarchyState(Parcel parcel) {
        try {
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            this.f63365b = (C23099b) C62942bv.parseFrom((C62942bv) C23099b.f63440e, createByteArray);
            this.f63364a = new C23088b(parcel.createTypedArrayList(FeatureStateSnapshot.CREATOR));
        } catch (C62974ct e) {
            throw new IllegalStateException(e);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f63365b.toByteArray());
        parcel.writeTypedList(this.f63364a);
    }

    public HierarchyState(List list, C23099b bVar) {
        this.f63364a = new C23088b(list);
        this.f63365b = bVar;
    }
}
