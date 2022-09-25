package com.google.android.apps.gsa.nga.api;

import android.os.Parcel;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.nga.api.m */
/* compiled from: PG */
public abstract class C74733m extends C8849b implements C74734n {
    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo71116e((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
        return true;
    }
}
