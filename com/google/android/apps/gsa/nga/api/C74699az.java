package com.google.android.apps.gsa.nga.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.nga.api.az */
/* compiled from: PG */
public abstract class C74699az extends C8849b implements C74701ba {
    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo71056h((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo71055g((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
        } else if (i == 3) {
            mo71053e();
        } else if (i != 4) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo71054f((Configuration) C8850c.m23492a(parcel, Configuration.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
