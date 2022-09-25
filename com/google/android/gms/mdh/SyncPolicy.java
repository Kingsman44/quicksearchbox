package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SyncPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145031h();

    /* renamed from: a */
    public static final SyncPolicy f392028a = new C145030g().mo120557a();

    /* renamed from: b */
    public static final SyncPolicy f392029b;

    /* renamed from: c */
    public int f392030c;

    /* renamed from: d */
    public SyncSubPolicy f392031d;

    /* renamed from: e */
    public SyncSubPolicy f392032e;

    /* renamed from: f */
    public SyncSubPolicy f392033f;

    /* renamed from: g */
    public SyncSubPolicy f392034g;

    /* renamed from: h */
    public Integer f392035h;

    /* renamed from: i */
    public boolean f392036i;

    /* renamed from: j */
    public boolean f392037j;

    static {
        C145030g gVar = new C145030g();
        gVar.f392048a = 0;
        f392029b = gVar.mo120557a();
    }

    public SyncPolicy(int i, SyncSubPolicy syncSubPolicy, SyncSubPolicy syncSubPolicy2, SyncSubPolicy syncSubPolicy3, SyncSubPolicy syncSubPolicy4, Integer num, boolean z, boolean z2) {
        this.f392030c = i;
        this.f392031d = syncSubPolicy;
        this.f392032e = syncSubPolicy2;
        this.f392033f = syncSubPolicy3;
        this.f392034g = syncSubPolicy4;
        this.f392035h = num;
        this.f392036i = z;
        this.f392037j = z2;
    }

    /* renamed from: a */
    public static C145030g m235678a() {
        return new C145030g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncPolicy)) {
            return false;
        }
        SyncPolicy syncPolicy = (SyncPolicy) obj;
        if (this.f392030c != syncPolicy.f392030c || this.f392036i != syncPolicy.f392036i || this.f392037j != syncPolicy.f392037j || !this.f392031d.equals(syncPolicy.f392031d) || !this.f392032e.equals(syncPolicy.f392032e) || !this.f392033f.equals(syncPolicy.f392033f) || !this.f392034g.equals(syncPolicy.f392034g)) {
            return false;
        }
        Integer num = this.f392035h;
        if (num != null) {
            return num.equals(syncPolicy.f392035h);
        }
        return syncPolicy.f392035h == null;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f392030c * 31) + this.f392031d.hashCode()) * 31) + this.f392032e.hashCode()) * 31) + this.f392033f.hashCode()) * 31) + this.f392034g.hashCode()) * 31;
        Integer num = this.f392035h;
        return ((((hashCode + (num != null ? num.hashCode() : 0)) * 31) + (this.f392036i ? 1 : 0)) * 31) + (this.f392037j ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f392030c);
        C143947c.m234105x(parcel, 2, this.f392031d, i);
        C143947c.m234105x(parcel, 3, this.f392032e, i);
        C143947c.m234105x(parcel, 4, this.f392033f, i);
        C143947c.m234105x(parcel, 5, this.f392034g, i);
        C143947c.m234101t(parcel, 6, this.f392035h);
        C143947c.m234084c(parcel, 7, this.f392036i);
        C143947c.m234084c(parcel, 8, this.f392037j);
        C143947c.m234083b(parcel, a);
    }
}
