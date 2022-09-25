package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;
import p3186j$.util.Objects;

/* compiled from: PG */
public class AppWearDetailsParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146508h();

    /* renamed from: a */
    public final boolean f395548a;

    /* renamed from: b */
    public final List f395549b;

    public AppWearDetailsParcelable(boolean z, List list) {
        this.f395548a = z;
        this.f395549b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppWearDetailsParcelable appWearDetailsParcelable = (AppWearDetailsParcelable) obj;
            return this.f395548a == appWearDetailsParcelable.f395548a && Objects.equals(this.f395549b, appWearDetailsParcelable.f395549b);
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f395548a), this.f395549b);
    }

    public final String toString() {
        boolean z = this.f395548a;
        String valueOf = String.valueOf(this.f395549b);
        return "AppWearDetailsParcelable{isWatchface=" + z + ", watchfaceCategories=" + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f395548a);
        C143947c.m234078A(parcel, 2, this.f395549b);
        C143947c.m234083b(parcel, a);
    }
}
