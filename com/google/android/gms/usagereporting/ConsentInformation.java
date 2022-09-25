package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146090b();

    /* renamed from: a */
    public boolean f394791a;

    /* renamed from: b */
    public boolean f394792b;

    /* renamed from: c */
    private List f394793c;

    /* compiled from: PG */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C146074a();

        /* renamed from: a */
        public final String f394794a;

        /* renamed from: b */
        public final byte[] f394795b;

        /* renamed from: c */
        public List f394796c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            ArrayList arrayList;
            this.f394794a = str;
            this.f394795b = bArr;
            if (list != null) {
                arrayList = new ArrayList(list);
            }
            this.f394796c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return C143912ba.m233950b(this.f394794a, accountConsentInformation.f394794a) && C143912ba.m233950b(this.f394795b, accountConsentInformation.f394795b) && C143912ba.m233950b(this.f394796c, accountConsentInformation.f394796c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f394794a, this.f394795b, this.f394796c});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234106y(parcel, 1, this.f394794a);
            C143947c.m234094m(parcel, 2, this.f394795b);
            C143947c.m234100s(parcel, 3, new ArrayList(this.f394796c));
            C143947c.m234083b(parcel, a);
        }
    }

    static {
        new ConsentInformation((List) null, false, false);
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.f394793c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.f394791a = z;
        this.f394792b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return C143912ba.m233950b(this.f394793c, consentInformation.f394793c) && C143912ba.m233950b(Boolean.valueOf(this.f394791a), Boolean.valueOf(consentInformation.f394791a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394793c, Boolean.valueOf(this.f394791a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, new ArrayList(this.f394793c));
        C143947c.m234084c(parcel, 2, this.f394791a);
        C143947c.m234084c(parcel, 3, this.f394792b);
        C143947c.m234083b(parcel, a);
    }
}
