package com.google.android.libraries.abuse.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p335a.p336a.C6582d;
import com.google.p335a.p336a.C6588j;
import com.google.p335a.p336a.C6594p;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;

/* compiled from: PG */
public class ReportAbuseCardConfigParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C146756y();

    /* renamed from: a */
    public final String f396175a;

    /* renamed from: b */
    public final ArrayList f396176b;

    /* renamed from: c */
    public final ArrayList f396177c;

    /* renamed from: d */
    public final C6588j f396178d;

    /* renamed from: e */
    public final boolean f396179e;

    /* renamed from: f */
    public final int f396180f;

    /* renamed from: g */
    public int f396181g;

    /* renamed from: h */
    public ButtonState f396182h;

    /* compiled from: PG */
    public class ButtonState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C146757z();

        /* renamed from: a */
        public int f396183a;

        /* renamed from: b */
        public int f396184b;

        /* renamed from: c */
        public String f396185c;

        public ButtonState(int i, int i2, String str) {
            this.f396183a = i;
            this.f396184b = i2;
            this.f396185c = str;
        }

        public ButtonState(Parcel parcel) {
            this.f396183a = parcel.readInt();
            this.f396184b = parcel.readInt();
            this.f396185c = parcel.readString();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f396183a);
            parcel.writeInt(this.f396184b);
            parcel.writeString(this.f396185c);
        }
    }

    public ReportAbuseCardConfigParcel(Parcel parcel) {
        this.f396175a = parcel.readString();
        int readInt = parcel.readInt();
        this.f396176b = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f396176b.add((C6594p) C62942bv.parseFrom((C62942bv) C6594p.f19600j, parcel.createByteArray()));
        }
        int readInt2 = parcel.readInt();
        this.f396177c = new ArrayList(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f396177c.add((C6582d) C62942bv.parseFrom((C62942bv) C6582d.f19571g, parcel.createByteArray()));
        }
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray.length != 0) {
            this.f396178d = (C6588j) C62942bv.parseFrom((C62942bv) C6588j.f19586g, createByteArray);
        } else {
            this.f396178d = null;
        }
        this.f396179e = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        this.f396180f = parcel.readInt();
        this.f396181g = parcel.readInt();
        this.f396182h = (ButtonState) parcel.readParcelable(ButtonState.class.getClassLoader());
    }

    public ReportAbuseCardConfigParcel(String str, ArrayList arrayList, ArrayList arrayList2, C6588j jVar, int i, int i2, boolean z) {
        this.f396175a = str;
        this.f396176b = arrayList;
        this.f396177c = arrayList2;
        this.f396178d = jVar;
        this.f396180f = i;
        this.f396181g = i2;
        this.f396179e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f396175a);
        parcel.writeInt(this.f396176b.size());
        ArrayList arrayList = this.f396176b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(((C6594p) arrayList.get(i2)).toByteArray());
        }
        parcel.writeInt(this.f396177c.size());
        ArrayList arrayList2 = this.f396177c;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            parcel.writeByteArray(((C6582d) arrayList2.get(i3)).toByteArray());
        }
        C6588j jVar = this.f396178d;
        if (jVar == null) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(jVar.toByteArray());
        }
        parcel.writeValue(Boolean.valueOf(this.f396179e));
        parcel.writeInt(this.f396180f);
        parcel.writeInt(this.f396181g);
        parcel.writeParcelable(this.f396182h, i);
    }
}
