package com.google.android.apps.gsa.shared.search.doodle;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.common.p4526f.C59052c;
import com.google.p337aa.p338a.C6600b;
import com.google.p337aa.p338a.C6604f;

/* renamed from: com.google.android.apps.gsa.shared.search.doodle.a */
/* compiled from: PG */
final class C90495a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int readInt = parcel.readInt();
        Query query = (Query) parcel2.readParcelable(Query.class.getClassLoader());
        int readInt2 = parcel.readInt();
        int a = C6604f.m17999a(parcel.readInt());
        String readString = parcel.readString();
        readString.getClass();
        String readString2 = parcel.readString();
        readString2.getClass();
        String readString3 = parcel.readString();
        readString3.getClass();
        String readString4 = parcel.readString();
        readString4.getClass();
        int readInt3 = parcel.readInt();
        String readString5 = parcel.readString();
        readString5.getClass();
        int readInt4 = parcel.readInt();
        String readString6 = parcel.readString();
        readString6.getClass();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        Uri uri = (Uri) parcel2.readParcelable(Uri.class.getClassLoader());
        long readLong = parcel.readLong();
        int readInt8 = parcel.readInt();
        String readString7 = parcel.readString();
        readString7.getClass();
        Bundle bundle = (Bundle) parcel2.readParcelable(Bundle.class.getClassLoader());
        boolean z = parcel.readByte() != 0;
        boolean z2 = parcel.readByte() != 0;
        String readString8 = parcel.readString();
        readString8.getClass();
        int readInt9 = parcel.readInt();
        int a2 = C6600b.m17998a(parcel.readInt());
        int a3 = C6600b.m17998a(parcel.readInt());
        String readString9 = parcel.readString();
        readString9.getClass();
        int readInt10 = parcel.readInt();
        String readString10 = parcel.readString();
        readString10.getClass();
        int readInt11 = parcel.readInt();
        int readInt12 = parcel.readInt();
        int readInt13 = parcel.readInt();
        int a4 = C6600b.m17998a(parcel.readInt());
        String readString11 = parcel.readString();
        readString11.getClass();
        int readInt14 = parcel.readInt();
        int readInt15 = parcel.readInt();
        int readInt16 = parcel.readInt();
        int a5 = C6600b.m17998a(parcel.readInt());
        int i = readInt6;
        if (a3 == 0) {
            a3 = 1;
        }
        int i2 = a2 == 0 ? 1 : a2;
        if (a4 == 0) {
            a4 = 1;
        }
        if (a5 == 0) {
            a5 = 1;
        }
        DoodleData doodleData = r1;
        DoodleData doodleData2 = new DoodleData(readInt, query, readInt2, a, readString, readString2, readString3, readString4, readInt3, readString5, readInt4, readString6, readInt5, i, readInt7, a3, uri, readLong, readInt8, readString7, bundle, z, z2, readString8, readInt9, i2, readString9, readInt10, readString10, readInt11, readInt12, readInt13, a4, readString11, readInt14, readInt15, readInt16, a5);
        DoodleData doodleData3 = doodleData;
        doodleData3.f252958x = C23338c.m43772d(parcel);
        try {
            doodleData3.f252957w = C23338c.m43773e(parcel);
        } catch (RemoteException unused) {
            doodleData3.f252957w = null;
        }
        try {
            doodleData3.f252920A = C23338c.m43773e(parcel);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) DoodleData.f252919a.mo56225c()).mo56382g(e)).mo56372aa(11026)).mo56386p("Error reading CrushinatedAnimation bytes from parcel.");
        }
        return doodleData3;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DoodleData[i];
    }
}
