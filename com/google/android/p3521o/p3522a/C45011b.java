package com.google.android.p3521o.p3522a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.o.a.b */
/* compiled from: PG */
public abstract class C45011b extends C8849b implements C45012c {
    public C45011b() {
        super("com.google.android.systemui.statusbar.INotificationVoiceReplyServiceCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean i3 = C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo48846b(i3);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo48847c(readInt, readInt2);
        } else if (i != 3) {
            return false;
        } else {
            boolean i4 = C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo48845a(i4);
        }
        return true;
    }
}
