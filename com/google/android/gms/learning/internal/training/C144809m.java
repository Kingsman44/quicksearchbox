package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.m */
/* compiled from: PG */
public final class C144809m extends C8848a implements C144811o {
    public C144809m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainer");
    }

    public final boolean initV26(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(6, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final boolean initW24(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(7, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final boolean initY2020W18(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(8, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final boolean initY2020W30(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(9, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final boolean initY2020W36(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(10, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final boolean initY2021W30(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        throw null;
    }

    public final boolean initY2022W24(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23499h(gA, buVar);
        Parcel gT = mo17261gT(12, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final void start(int i, C143773bu buVar) {
        Parcel gA = mo17260gA();
        gA.writeInt(0);
        C8850c.m23499h(gA, buVar);
        mo17262he(3, gA);
    }

    public final void stop(C143773bu buVar) {
        throw null;
    }
}
