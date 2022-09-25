package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class SessionContextRuleSet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42335dg();

    /* renamed from: a */
    public static final SessionContextRuleSet f110817a = new SessionContextRuleSet(0, 0);

    /* renamed from: b */
    public final int f110818b;

    /* renamed from: c */
    public final int f110819c;

    public SessionContextRuleSet(int i, int i2) {
        this.f110818b = i;
        this.f110819c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionContextRuleSet) {
            SessionContextRuleSet sessionContextRuleSet = (SessionContextRuleSet) obj;
            return this.f110818b == sessionContextRuleSet.f110818b && this.f110819c == sessionContextRuleSet.f110819c;
        }
    }

    public final int hashCode() {
        return ((this.f110818b ^ 1000003) * 1000003) ^ this.f110819c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110818b);
        parcel.writeInt(this.f110819c);
    }
}
