package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class MdpFlexTimeWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145544r();

    /* renamed from: a */
    public final String f393478a;

    /* renamed from: b */
    public final String f393479b;

    /* renamed from: c */
    public final String f393480c;

    /* renamed from: d */
    public final int f393481d;

    public MdpFlexTimeWindow(String str, String str2, String str3, int i) {
        this.f393478a = str;
        this.f393479b = str2;
        this.f393480c = str3;
        this.f393481d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpFlexTimeWindow mdpFlexTimeWindow = (MdpFlexTimeWindow) obj;
            return C143912ba.m233950b(this.f393478a, mdpFlexTimeWindow.f393478a) && C143912ba.m233950b(this.f393479b, mdpFlexTimeWindow.f393479b) && C143912ba.m233950b(this.f393480c, mdpFlexTimeWindow.f393480c) && C143912ba.m233950b(Integer.valueOf(this.f393481d), Integer.valueOf(mdpFlexTimeWindow.f393481d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393478a, this.f393479b, this.f393480c, Integer.valueOf(this.f393481d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("RecurrenceType", this.f393478a, arrayList);
        C143910az.m233947b("StartTime", this.f393479b, arrayList);
        C143910az.m233947b("EndTime", this.f393480c, arrayList);
        C143910az.m233947b("DiscountPercentage", Integer.valueOf(this.f393481d), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393478a);
        C143947c.m234106y(parcel, 2, this.f393479b);
        C143947c.m234106y(parcel, 3, this.f393480c);
        C143947c.m234089h(parcel, 4, this.f393481d);
        C143947c.m234083b(parcel, a);
    }
}
