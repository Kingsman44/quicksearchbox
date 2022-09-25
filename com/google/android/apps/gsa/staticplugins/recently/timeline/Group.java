package com.google.android.apps.gsa.staticplugins.recently.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;

/* compiled from: PG */
public class Group implements Parcelable, Iterable {
    public static final Parcelable.Creator CREATOR = new C116198a();

    /* renamed from: i */
    private static final C59071e f322169i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.timeline.Group");

    /* renamed from: a */
    public final String f322170a;

    /* renamed from: b */
    public final String f322171b;

    /* renamed from: c */
    public final long f322172c;

    /* renamed from: d */
    public final int f322173d;

    /* renamed from: e */
    public final boolean f322174e;

    /* renamed from: f */
    public final boolean f322175f;

    /* renamed from: g */
    public final boolean f322176g;

    /* renamed from: h */
    public final C22845p[] f322177h;

    public Group(Parcel parcel) {
        C22845p pVar;
        this.f322170a = parcel.readString();
        this.f322171b = parcel.readString();
        this.f322172c = parcel.readLong();
        this.f322173d = parcel.readInt();
        boolean z = true;
        this.f322174e = parcel.readInt() != 0;
        this.f322175f = parcel.readInt() != 0;
        this.f322176g = parcel.readInt() == 0 ? false : z;
        int readInt = parcel.readInt();
        C22845p[] pVarArr = new C22845p[readInt];
        for (int i = 0; i < readInt; i++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            try {
                pVar = (C22845p) C62942bv.parseFrom((C62942bv) C22845p.f62890o, bArr);
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f322169i.mo56226d()).mo56382g(e)).mo56372aa(30948)).mo56386p("Could not parse parceled recently entry proto!");
                int i2 = C90755l.f253831a;
                pVar = C22845p.f62890o;
            }
            pVarArr[i] = pVar;
        }
        this.f322177h = pVarArr;
    }

    public Group(String str, String str2, long j, int i, boolean z, boolean z2, boolean z3, C22845p[] pVarArr) {
        this.f322170a = str;
        this.f322171b = str2;
        this.f322172c = j;
        this.f322173d = i;
        this.f322174e = z;
        this.f322175f = z2;
        this.f322176g = z3;
        this.f322177h = pVarArr;
    }

    /* renamed from: a */
    public final boolean mo102543a(C22845p pVar) {
        for (C22845p pVar2 : this.f322177h) {
            if (pVar2.f62893b == pVar.f62893b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo102544b(Group group) {
        if (!this.f322170a.equals(group.f322170a)) {
            return false;
        }
        for (C22845p pVar : this.f322177h) {
            for (C22845p pVar2 : group.f322177h) {
                if (pVar.f62893b == pVar2.f62893b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final Iterator iterator() {
        return new C116199b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f322170a);
        parcel.writeString(this.f322171b);
        parcel.writeLong(this.f322172c);
        parcel.writeInt(this.f322173d);
        parcel.writeInt(this.f322174e ? 1 : 0);
        parcel.writeInt(this.f322175f ? 1 : 0);
        parcel.writeInt(this.f322176g ? 1 : 0);
        parcel.writeInt(r0);
        for (C22845p byteArray : this.f322177h) {
            byte[] byteArray2 = byteArray.toByteArray();
            parcel.writeInt(byteArray2.length);
            parcel.writeByteArray(byteArray2);
        }
    }
}
