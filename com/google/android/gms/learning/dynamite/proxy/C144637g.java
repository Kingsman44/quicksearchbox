package com.google.android.gms.learning.dynamite.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.g */
/* compiled from: PG */
public final class C144637g extends C8848a implements C144639i {
    public C144637g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
    }

    /* renamed from: a */
    public final void mo120088a(C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, buVar);
        mo17263hf(3, gA);
    }

    /* renamed from: c */
    public final void mo120090c(C144642l lVar, int i) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, lVar);
        gA.writeInt(i);
        mo17263hf(2, gA);
    }
}
