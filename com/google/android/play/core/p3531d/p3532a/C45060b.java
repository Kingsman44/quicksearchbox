package com.google.android.play.core.p3531d.p3532a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.play.core.d.a.b */
/* compiled from: PG */
public abstract class C45060b extends C8849b implements C45061c {
    public C45060b() {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
        enforceNoDataAvail(parcel);
        mo48898a();
        return true;
    }
}
