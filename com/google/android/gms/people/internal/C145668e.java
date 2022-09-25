package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.people.internal.e */
/* compiled from: PG */
public final class C145668e extends C8848a implements IInterface {
    public C145668e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    /* renamed from: e */
    public final void mo121715e(C145667d dVar, boolean z, int i) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, dVar);
        C8850c.m23495d(gA, z);
        gA.writeString((String) null);
        gA.writeString((String) null);
        gA.writeInt(i);
        Parcel gT = mo17261gT(11, gA);
        Bundle bundle = (Bundle) C8850c.m23492a(gT, Bundle.CREATOR);
        gT.recycle();
    }
}
