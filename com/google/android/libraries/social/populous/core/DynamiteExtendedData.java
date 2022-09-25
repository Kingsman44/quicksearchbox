package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* compiled from: PG */
public abstract class DynamiteExtendedData implements Parcelable {

    /* compiled from: PG */
    public final class OrganizationInfo implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C42285bk();

        /* renamed from: a */
        private final CustomerInfo f110768a;

        /* renamed from: b */
        private final ConsumerInfo f110769b;

        /* compiled from: PG */
        public final class ConsumerInfo implements Parcelable {
            public static final Parcelable.Creator CREATOR = new C42286bl();

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return obj == this || (obj instanceof ConsumerInfo);
            }

            public final int hashCode() {
                return 1000003;
            }

            public final void writeToParcel(Parcel parcel, int i) {
            }
        }

        /* compiled from: PG */
        public final class CustomerInfo implements Parcelable {
            public static final Parcelable.Creator CREATOR = new C42287bm();

            /* renamed from: a */
            private final CustomerId f110770a;

            /* compiled from: PG */
            public final class CustomerId implements Parcelable {
                public static final Parcelable.Creator CREATOR = new C42288bn();

                /* renamed from: a */
                private final String f110771a;

                public CustomerId(String str) {
                    this.f110771a = str;
                }

                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (obj instanceof CustomerId) {
                        return C58832aw.m90831a(this.f110771a, ((CustomerId) obj).f110771a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return Arrays.hashCode(new Object[]{this.f110771a});
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.f110771a);
                }
            }

            public CustomerInfo(CustomerId customerId) {
                this.f110770a = customerId;
            }

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof CustomerInfo) {
                    return C58832aw.m90831a(this.f110770a, ((CustomerInfo) obj).f110770a);
                }
                return false;
            }

            public final int hashCode() {
                return Arrays.hashCode(new Object[]{this.f110770a});
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f110770a, i);
            }
        }

        public OrganizationInfo(CustomerInfo customerInfo, ConsumerInfo consumerInfo) {
            this.f110768a = customerInfo;
            this.f110769b = consumerInfo;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof OrganizationInfo) {
                OrganizationInfo organizationInfo = (OrganizationInfo) obj;
                return C58832aw.m90831a(this.f110769b, organizationInfo.f110769b) && C58832aw.m90831a(this.f110768a, organizationInfo.f110768a);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f110769b, this.f110768a});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f110768a, i);
            parcel.writeParcelable(this.f110769b, i);
        }
    }

    /* renamed from: a */
    public abstract OrganizationInfo mo44964a();

    /* renamed from: b */
    public abstract Long mo44965b();

    /* renamed from: c */
    public abstract String mo44966c();

    /* renamed from: d */
    public abstract String mo44967d();

    /* renamed from: e */
    public abstract String mo44968e();

    /* renamed from: f */
    public abstract int mo44970f();

    /* renamed from: g */
    public abstract int mo44971g();

    /* renamed from: h */
    public abstract int mo44972h();
}
