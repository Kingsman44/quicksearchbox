package com.google.android.gms.p10725a.p10726a.p10728b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.p10725a.p10726a.p10727a.C142666a;
import com.google.android.gms.p10725a.p10726a.p10727a.C142667b;
import com.google.android.gms.p10725a.p10726a.p10728b.p10729a.C142669a;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.gms.p10793f.C144167l;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.a.a.b.a */
/* compiled from: PG */
public final class C142668a {

    /* renamed from: a */
    public C142666a f387150a;

    protected C142668a() {
    }

    @Deprecated
    /* renamed from: a */
    public final String mo117450a(Context context, String str) {
        C142666a aVar = this.f387150a;
        C144166k kVar = new C144166k(context);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23499h(gA, kVar);
        gA.writeString(str);
        Parcel gT = aVar.mo17261gT(8, gA);
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo117451b(MotionEvent motionEvent) {
        C142666a aVar = this.f387150a;
        C144166k kVar = new C144166k(motionEvent);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23499h(gA, kVar);
        aVar.mo17262he(9, gA);
    }

    @Deprecated
    public C142668a(String str, Context context) {
        C142666a aVar;
        C144166k kVar = new C144166k(context);
        try {
            C142667b bVar = (C142667b) C142669a.f387151a.mo119700b(context);
            Parcel gA = bVar.mo17260gA();
            gA.writeString(str);
            C8850c.m23499h(gA, kVar);
            Parcel gT = bVar.mo17261gT(2, gA);
            IBinder readStrongBinder = gT.readStrongBinder();
            gT.recycle();
            if (readStrongBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                if (queryLocalInterface instanceof C142666a) {
                    aVar = (C142666a) queryLocalInterface;
                } else {
                    aVar = new C142666a(readStrongBinder);
                }
            }
            this.f387150a = aVar;
        } catch (RemoteException | C144167l unused) {
            throw new C144022y();
        }
    }
}
