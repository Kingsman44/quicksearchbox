package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: com.google.android.gms.learning.internal.training.j */
/* compiled from: PG */
public final class C144806j extends C8848a implements C144808l {
    public C144806j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }

    /* renamed from: a */
    public final int mo120230a() {
        Parcel gT = mo17261gT(2, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final void mo120231b(InAppTrainerOptions inAppTrainerOptions, boolean z, List list, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, inAppTrainerOptions);
        C8850c.m23495d(gA, true);
        gA.writeTypedList(list);
        C8850c.m23499h(gA, buVar);
        mo17263hf(3, gA);
    }
}
