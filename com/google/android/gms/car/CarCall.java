package com.google.android.gms.car;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class CarCall extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143098aj();

    /* renamed from: a */
    public final int f387931a;

    /* renamed from: b */
    public CarCall f387932b;

    /* renamed from: c */
    public List f387933c;

    /* renamed from: d */
    public String f387934d;

    /* renamed from: e */
    public int f387935e;

    /* renamed from: f */
    public Details f387936f;
    @Deprecated

    /* renamed from: g */
    public boolean f387937g;

    /* renamed from: h */
    public List f387938h;

    /* renamed from: i */
    public List f387939i;

    /* compiled from: PG */
    public class Details extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C143099ak();

        /* renamed from: a */
        public Uri f387940a;

        /* renamed from: b */
        public String f387941b;

        /* renamed from: c */
        public String f387942c;

        /* renamed from: d */
        public long f387943d;
        @Deprecated

        /* renamed from: e */
        public Uri f387944e;
        @Deprecated

        /* renamed from: f */
        public Uri f387945f;

        /* renamed from: g */
        public int f387946g;

        /* renamed from: h */
        public PhoneAccountHandle f387947h;

        /* renamed from: i */
        public int f387948i;

        /* renamed from: j */
        public Bundle f387949j;

        /* renamed from: k */
        public Bundle f387950k;

        /* renamed from: l */
        public int f387951l;

        /* renamed from: m */
        public GatewayInfo f387952m;

        public Details() {
        }

        public Details(Uri uri, String str, String str2, long j, Uri uri2, Uri uri3, int i, PhoneAccountHandle phoneAccountHandle, int i2, Bundle bundle, Bundle bundle2, int i3, GatewayInfo gatewayInfo) {
            this.f387940a = uri;
            this.f387941b = str;
            this.f387942c = str2;
            this.f387943d = j;
            this.f387944e = uri2;
            this.f387945f = uri3;
            this.f387946g = i;
            this.f387947h = phoneAccountHandle;
            this.f387948i = i2;
            this.f387949j = bundle;
            this.f387950k = bundle2;
            this.f387951l = i3;
            this.f387952m = gatewayInfo;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f387940a);
            String str = this.f387941b;
            String str2 = this.f387942c;
            long j = this.f387943d;
            String valueOf2 = String.valueOf(this.f387944e);
            String valueOf3 = String.valueOf(this.f387945f);
            int i = this.f387946g;
            String valueOf4 = String.valueOf(this.f387947h);
            int i2 = this.f387948i;
            String valueOf5 = String.valueOf(this.f387949j);
            String valueOf6 = String.valueOf(this.f387950k);
            int i3 = this.f387951l;
            String valueOf7 = String.valueOf(this.f387952m);
            return "Details{handle=" + valueOf + ", callerDisplayName='" + str + "', disconnectCause='" + str2 + "', connectTimeMillis=" + j + ", gatewayInfoOriginal=" + valueOf2 + ", gatewayInfoGateway=" + valueOf3 + ", callCapabilities=" + i + ", accountHandle=" + valueOf4 + ", callProperties=" + i2 + ", extras=" + valueOf5 + ", intentExtras=" + valueOf6 + ", videoState=" + i3 + ", gatewayInfo=" + valueOf7 + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234105x(parcel, 1, this.f387940a, i);
            C143947c.m234106y(parcel, 2, this.f387941b);
            C143947c.m234106y(parcel, 3, this.f387942c);
            C143947c.m234090i(parcel, 4, this.f387943d);
            C143947c.m234105x(parcel, 5, this.f387944e, i);
            C143947c.m234105x(parcel, 6, this.f387945f, i);
            C143947c.m234089h(parcel, 7, this.f387946g);
            C143947c.m234105x(parcel, 8, this.f387947h, i);
            C143947c.m234089h(parcel, 9, this.f387948i);
            C143947c.m234093l(parcel, 10, this.f387949j);
            C143947c.m234093l(parcel, 11, this.f387950k);
            C143947c.m234089h(parcel, 12, this.f387951l);
            C143947c.m234105x(parcel, 13, this.f387952m, i);
            C143947c.m234083b(parcel, a);
        }
    }

    public CarCall(int i, CarCall carCall, List list, String str, int i2, Details details, boolean z, List list2, List list3) {
        this.f387931a = i;
        this.f387932b = carCall;
        this.f387933c = list;
        this.f387934d = str;
        this.f387935e = i2;
        this.f387936f = details;
        this.f387937g = z;
        this.f387938h = list2;
        this.f387939i = list3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CarCall) && this.f387931a == ((CarCall) obj).f387931a;
    }

    public final int hashCode() {
        return this.f387931a;
    }

    public final String toString() {
        int i = this.f387931a;
        String valueOf = String.valueOf(this.f387932b);
        String valueOf2 = String.valueOf(this.f387933c);
        String str = this.f387934d;
        int i2 = this.f387935e;
        String valueOf3 = String.valueOf(this.f387936f);
        boolean z = this.f387937g;
        String valueOf4 = String.valueOf(this.f387938h);
        String valueOf5 = String.valueOf(this.f387939i);
        return "CarCall{id=" + i + ", parent=" + valueOf + ", cannedTextResponses=" + valueOf2 + ", remainingPostDialSequence='" + str + "', state=" + i2 + ", details=" + valueOf3 + ", hasChildren=" + z + ", children=" + valueOf4 + ", conferenceableCalls=" + valueOf5 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387931a);
        C143947c.m234105x(parcel, 2, this.f387932b, i);
        C143947c.m234078A(parcel, 3, this.f387933c);
        C143947c.m234106y(parcel, 4, this.f387934d);
        C143947c.m234089h(parcel, 5, this.f387935e);
        C143947c.m234105x(parcel, 6, this.f387936f, i);
        C143947c.m234084c(parcel, 7, this.f387937g);
        C143947c.m234080C(parcel, 8, this.f387938h);
        C143947c.m234080C(parcel, 9, this.f387939i);
        C143947c.m234083b(parcel, a);
    }
}
