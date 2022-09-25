package com.google.android.libraries.assistant.p1356b.p1359b.p1360a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.b.b.a.e */
/* compiled from: PG */
public abstract class C16924e extends C8849b implements C16925f {
    public C16924e() {
        super("com.google.android.libraries.assistant.ambient.dynamic.service.IAmbientModeSessionCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo23089a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
