package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState$TypeFilter;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.p10717f.p10720c.C142627a;
import com.google.p4184bj.p4189b.C55883b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class BeaconStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142939b();

    /* renamed from: a */
    public final ArrayList f387837a;

    /* compiled from: PG */
    public final class BeaconInfoImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C142938a();

        /* renamed from: a */
        public final String f387838a;

        /* renamed from: b */
        public final String f387839b;

        /* renamed from: c */
        public final byte[] f387840c;

        public BeaconInfoImpl(String str, String str2, byte[] bArr) {
            C143919bh.m233969l(str);
            this.f387838a = str;
            C143919bh.m233969l(str2);
            this.f387839b = str2;
            this.f387840c = bArr;
        }

        public final String toString() {
            String str = new String(this.f387840c);
            String str2 = this.f387838a;
            String str3 = this.f387839b;
            return "(" + str2 + ", " + str3 + ", " + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234106y(parcel, 2, this.f387838a);
            C143947c.m234106y(parcel, 3, this.f387839b);
            C143947c.m234094m(parcel, 4, this.f387840c);
            C143947c.m234083b(parcel, a);
        }
    }

    /* compiled from: PG */
    public class TypeFilterImpl extends BeaconState$TypeFilter {
        public static final Parcelable.Creator CREATOR = new C142951n();

        /* renamed from: a */
        public final C55883b f387841a;

        public TypeFilterImpl(byte[] bArr) {
            C55883b bVar;
            try {
                bVar = (C55883b) C62942bv.parseFrom((C62942bv) C55883b.f148708d, bArr, C62921ba.m95368a());
            } catch (C62974ct unused) {
                C142627a.m231237b("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
                bVar = null;
            }
            C143919bh.m233958a(bVar);
            this.f387841a = bVar;
        }

        /* renamed from: a */
        public final byte[] mo117834a() {
            if (this.f387841a.f148712c.mo59031d() == 0) {
                return null;
            }
            return this.f387841a.f148712c.mo59174N();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeFilterImpl)) {
                return false;
            }
            TypeFilterImpl typeFilterImpl = (TypeFilterImpl) obj;
            return TextUtils.equals(this.f387841a.f148710a, typeFilterImpl.f387841a.f148710a) && TextUtils.equals(this.f387841a.f148711b, typeFilterImpl.f387841a.f148711b) && Arrays.equals(mo117834a(), typeFilterImpl.mo117834a());
        }

        public final int hashCode() {
            Object[] objArr = new Object[3];
            C55883b bVar = this.f387841a;
            int i = 0;
            objArr[0] = bVar.f148710a;
            objArr[1] = bVar.f148711b;
            if (mo117834a() != null) {
                i = Arrays.hashCode(mo117834a());
            }
            objArr[2] = Integer.valueOf(i);
            return Arrays.hashCode(objArr);
        }

        public final String toString() {
            String str;
            byte[] a = mo117834a();
            C55883b bVar = this.f387841a;
            String str2 = bVar.f148710a;
            String str3 = bVar.f148711b;
            if (a == null) {
                str = "null";
            } else {
                str = new String(a);
            }
            return "(" + str2 + "," + str3 + "," + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234094m(parcel, 2, this.f387841a.toByteArray());
            C143947c.m234083b(parcel, a);
        }
    }

    public BeaconStateImpl(ArrayList arrayList) {
        this.f387837a = arrayList;
    }

    public final String toString() {
        ArrayList arrayList = this.f387837a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder("BeaconState: ");
        ArrayList arrayList2 = this.f387837a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sb.append((BeaconInfoImpl) arrayList2.get(i));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f387837a);
        C143947c.m234083b(parcel, a);
    }
}
