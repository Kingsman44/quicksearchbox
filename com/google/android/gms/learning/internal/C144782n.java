package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.n */
/* compiled from: PG */
public final class C144782n extends C8848a implements C144784p {
    public C144782n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    /* renamed from: a */
    public final void mo120186a(String str, C144165j jVar, C144165j jVar2, C144781m mVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23499h(gA, mVar);
        mo17262he(2, gA);
    }

    /* renamed from: b */
    public final void mo120187b(String str, C144165j jVar, C144165j jVar2, C144781m mVar, C144165j jVar3) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23499h(gA, mVar);
        C8850c.m23499h(gA, jVar3);
        mo17262he(4, gA);
    }

    /* renamed from: c */
    public final boolean mo120188c() {
        Parcel gT = mo17261gT(3, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
