package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class DevicePersonalizedPlaceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145972j();

    /* renamed from: a */
    public final long f394567a;

    /* renamed from: b */
    public final List f394568b;

    /* renamed from: c */
    public final List f394569c;

    /* compiled from: PG */
    public class DeviceInteractionTypeSummary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145962i();

        /* renamed from: a */
        public final int f394570a;

        /* renamed from: b */
        public final int f394571b;

        /* renamed from: c */
        public final List f394572c;

        public DeviceInteractionTypeSummary(int i, int i2, List list) {
            this.f394570a = i;
            this.f394571b = i2;
            this.f394572c = list;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 1, this.f394570a);
            C143947c.m234089h(parcel, 2, this.f394571b);
            C143947c.m234103v(parcel, 3, this.f394572c);
            C143947c.m234083b(parcel, a);
        }
    }

    /* compiled from: PG */
    public class PersonalPlace extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145978p();

        /* renamed from: a */
        public final int f394573a;

        /* renamed from: b */
        public final int f394574b;

        /* renamed from: c */
        public final int f394575c;

        public PersonalPlace(int i, int i2, int i3) {
            this.f394573a = i;
            this.f394574b = i2;
            this.f394575c = i3;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 1, this.f394573a);
            C143947c.m234089h(parcel, 2, this.f394574b);
            C143947c.m234089h(parcel, 3, this.f394575c);
            C143947c.m234083b(parcel, a);
        }
    }

    public DevicePersonalizedPlaceInfo(long j, List list, List list2) {
        this.f394567a = j;
        this.f394568b = list;
        this.f394569c = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f394567a);
        C143947c.m234080C(parcel, 2, this.f394568b);
        C143947c.m234080C(parcel, 3, this.f394569c);
        C143947c.m234083b(parcel, a);
    }
}
