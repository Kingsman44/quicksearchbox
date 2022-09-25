package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.p */
/* compiled from: PG */
public final class C144812p extends C8848a implements C144814r {
    public C144812p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
    }

    public final void cancelJobsByType(int i, C143773bu buVar) {
        Parcel gA = mo17260gA();
        gA.writeInt(0);
        C8850c.m23499h(gA, buVar);
        mo17262he(2, gA);
    }

    public final boolean init(C144165j jVar, C144165j jVar2, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(1, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
