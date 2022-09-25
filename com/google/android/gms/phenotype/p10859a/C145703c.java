package com.google.android.gms.phenotype.p10859a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.phenotype.a.c */
/* compiled from: PG */
public final class C145703c extends C8848a implements IInterface {
    public C145703c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    /* renamed from: e */
    public final void mo121877e(C145702b bVar, String str) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, bVar);
        gA.writeString(str);
        mo17262he(5, gA);
    }

    /* renamed from: f */
    public final void mo121878f(C145702b bVar, String str, String str2, String str3) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, bVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        mo17262he(11, gA);
    }

    /* renamed from: g */
    public final void mo121879g(C145702b bVar, String str, int i, String[] strArr, byte[] bArr) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, bVar);
        gA.writeString(str);
        gA.writeInt(i);
        gA.writeStringArray(strArr);
        gA.writeByteArray(bArr);
        mo17262he(1, gA);
    }

    /* renamed from: h */
    public final void mo121880h(C145702b bVar, String str, int i, String[] strArr, byte[] bArr, String str2) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, bVar);
        gA.writeString(str);
        gA.writeInt(i);
        gA.writeStringArray(strArr);
        gA.writeByteArray(bArr);
        gA.writeString(str2);
        gA.writeString((String) null);
        mo17262he(13, gA);
    }

    /* renamed from: i */
    public final void mo121881i(C145702b bVar, String str, int i, String[] strArr, int[] iArr) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, bVar);
        gA.writeString(str);
        gA.writeInt(i);
        gA.writeStringArray(strArr);
        gA.writeIntArray(iArr);
        gA.writeByteArray((byte[]) null);
        mo17262he(2, gA);
    }
}
