package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.g */
/* compiled from: PG */
public abstract class C143973g extends C8849b implements C143974h {
    public C143973g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo119513a((ModuleInstallStatusUpdate) C8850c.m23492a(parcel, ModuleInstallStatusUpdate.CREATOR));
        return true;
    }
}
