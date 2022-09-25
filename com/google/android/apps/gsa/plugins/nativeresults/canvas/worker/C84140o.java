package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.o */
/* compiled from: PG */
public abstract class C84140o extends C8849b implements C84141p {
    public C84140o() {
        super("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.ICanvasWorkerBinder");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            C84144s a = mo77559a();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, a);
            return true;
        } else if (i == 3) {
            C84122ab c = mo77561c();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, c);
            return true;
        } else if (i == 4) {
            C84150y b = mo77560b();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, b);
            return true;
        } else if (i != 8) {
            return false;
        } else {
            C84125ae d = mo77562d();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, d);
            return true;
        }
    }
}
