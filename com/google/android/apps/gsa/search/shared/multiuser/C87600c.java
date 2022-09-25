package com.google.android.apps.gsa.search.shared.multiuser;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.c */
/* compiled from: PG */
public abstract class C87600c extends C8849b implements C87601d {
    public C87600c() {
        super("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo81738g();
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo81737f((Bitmap) C8850c.m23492a(parcel, Bitmap.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
            enforceNoDataAvail(parcel);
            mo81736e(createTypedArrayList);
        }
        return true;
    }
}
