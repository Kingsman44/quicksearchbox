package com.google.assistant.p3931f.p3942e.p3943a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.assistant.f.e.a.a */
/* compiled from: PG */
public class C52921a extends C8849b implements IInterface {
    public C52921a() {
        super("com.google.assistant.appactions.widgets.pinappwidget.IPinAppWidgetCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C8850c.m23500i(parcel);
        enforceNoDataAvail(parcel);
        parcel2.writeNoException();
        return true;
    }
}
