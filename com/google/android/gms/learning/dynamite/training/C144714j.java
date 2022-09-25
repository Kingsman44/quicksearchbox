package com.google.android.gms.learning.dynamite.training;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.training.j */
/* compiled from: PG */
public final class C144714j extends C8848a implements C144716l {
    public C144714j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
    }

    /* renamed from: e */
    public final void mo120157e() {
        mo17263hf(3, mo17260gA());
    }

    /* renamed from: f */
    public final void mo120158f(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, byte[] bArr, C144719o oVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        gA.writeInt(i);
        C8850c.m23495d(gA, z);
        C8850c.m23495d(gA, z2);
        C8850c.m23495d(gA, z3);
        gA.writeByteArray(bArr);
        C8850c.m23499h(gA, oVar);
        mo17263hf(2, gA);
    }

    /* renamed from: g */
    public final void mo120159g(String str, String str2, String str3, String str4, boolean z, boolean z2, byte[] bArr, C144719o oVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        gA.writeString(str4);
        C8850c.m23495d(gA, z);
        C8850c.m23495d(gA, z2);
        gA.writeByteArray(bArr);
        C8850c.m23499h(gA, oVar);
        mo17263hf(5, gA);
    }
}
