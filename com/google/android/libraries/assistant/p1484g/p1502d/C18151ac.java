package com.google.android.libraries.assistant.p1484g.p1502d;

import android.app.DirectAction;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.g.d.ac */
/* compiled from: PG */
public abstract class C18151ac extends C8849b implements C18152ad {
    public C18151ac() {
        super("com.google.android.libraries.assistant.directactions.sender.IRequestDirectActionsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(DirectAction.CREATOR);
        enforceNoDataAvail(parcel);
        mo20095a(createTypedArrayList);
        return true;
    }
}
