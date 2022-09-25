package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PlaceCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145979q();

    /* renamed from: a */
    public final Identifier f394587a;

    /* renamed from: b */
    public final int f394588b;

    /* renamed from: c */
    public final float f394589c;
    @Deprecated

    /* renamed from: d */
    public final float f394590d;

    /* renamed from: e */
    public final Point f394591e;

    /* compiled from: PG */
    public class Identifier extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145975m();

        /* renamed from: a */
        public final long f394592a;

        public Identifier(long j) {
            this.f394592a = j;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234090i(parcel, 1, this.f394592a);
            C143947c.m234083b(parcel, a);
        }
    }

    /* compiled from: PG */
    public class Point extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145983u();

        /* renamed from: a */
        public final int f394593a;

        /* renamed from: b */
        public final int f394594b;

        public Point(int i, int i2) {
            this.f394593a = i;
            this.f394594b = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 1, this.f394593a);
            C143947c.m234089h(parcel, 2, this.f394594b);
            C143947c.m234083b(parcel, a);
        }
    }

    public PlaceCandidate(Identifier identifier, int i, float f, float f2, Point point) {
        this.f394587a = identifier;
        this.f394588b = i;
        this.f394589c = f;
        this.f394590d = f2;
        this.f394591e = point;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394587a, i);
        C143947c.m234089h(parcel, 2, this.f394588b);
        C143947c.m234087f(parcel, 3, this.f394589c);
        C143947c.m234087f(parcel, 4, this.f394590d);
        C143947c.m234105x(parcel, 5, this.f394591e, i);
        C143947c.m234083b(parcel, a);
    }
}
