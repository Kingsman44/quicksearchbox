package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;

/* compiled from: PG */
public final class AutoValue_GroupMetadata extends C$AutoValue_GroupMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42249ab();

    /* renamed from: h */
    private static final ClassLoader f110687h = AutoValue_GroupMetadata.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_GroupMetadata(android.os.Parcel r12) {
        /*
            r11 = this;
            byte r0 = r12.readByte()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0011
            int r0 = r12.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90833j(r0)
            java.lang.ClassLoader r0 = f110687h
            java.lang.Object r3 = r12.readValue(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            long r6 = r12.readLong()
            java.lang.String r8 = r12.readString()
            android.os.Parcelable r0 = r12.readParcelable(r0)
            r9 = r0
            com.google.android.libraries.social.populous.core.PeopleApiAffinity r9 = (com.google.android.libraries.social.populous.core.PeopleApiAffinity) r9
            byte r0 = r12.readByte()
            if (r0 != r2) goto L_0x004a
            java.lang.Class<com.google.android.libraries.social.populous.core.dc> r0 = com.google.android.libraries.social.populous.core.C42331dc.class
            com.google.common.b.gu r0 = com.google.android.libraries.social.populous.android.p3287a.C42162a.m74078b(r12, r0)
            r1 = 0
            com.google.android.libraries.social.populous.core.dc[] r1 = new com.google.android.libraries.social.populous.core.C42331dc[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.libraries.social.populous.core.dc[] r0 = (com.google.android.libraries.social.populous.core.C42331dc[]) r0
            com.google.common.b.ij r1 = com.google.common.p4522b.C58528ij.m90008H(r0)
        L_0x004a:
            r10 = r1
            r3 = r11
            r3.<init>(r4, r5, r6, r8, r9, r10)
            int r12 = r12.readInt()
            r11.f110775g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_GroupMetadata.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f110597a.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar = this.f110597a;
        if (axVar.mo56113h()) {
            parcel.writeInt(((Integer) axVar.mo56107c()).intValue());
        }
        parcel.writeValue(Boolean.valueOf(this.f110598b));
        parcel.writeLong(this.f110599c);
        parcel.writeString(this.f110600d);
        parcel.writeParcelable(this.f110601e, 0);
        parcel.writeByte(this.f110602f == null ? (byte) 0 : 1);
        C58528ij ijVar = this.f110602f;
        if (ijVar != null) {
            C42162a.m74081e(parcel, Arrays.asList((C42331dc[]) ijVar.toArray(new C42331dc[0])));
        }
        parcel.writeInt(this.f110775g);
    }

    public AutoValue_GroupMetadata(C58833ax axVar, boolean z, long j, String str, PeopleApiAffinity peopleApiAffinity, C58528ij ijVar) {
        super(axVar, z, j, str, peopleApiAffinity, ijVar);
    }
}
