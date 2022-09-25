package com.google.android.gms.mdns.p10847a;

import android.os.Parcel;
import com.google.android.gms.mdns.MdnsServiceInfo;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mdns.a.b */
/* compiled from: PG */
public abstract class C145100b extends C8849b implements C145101c {
    public C145100b() {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo120624e((MdnsServiceInfo) C8850c.m23492a(parcel, MdnsServiceInfo.CREATOR));
                return true;
            case 2:
                enforceNoDataAvail(parcel);
                mo120626g((MdnsServiceInfo) C8850c.m23492a(parcel, MdnsServiceInfo.CREATOR));
                return true;
            case 3:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo120625f(readString);
                return true;
            case 4:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo120623d(readInt);
                return true;
            case 5:
                mo120622c();
                return true;
            case 6:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo120620a(createStringArrayList, readInt2);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo120621b(readInt3, readInt4);
                return true;
            default:
                return false;
        }
    }
}
