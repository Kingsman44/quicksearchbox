package com.google.android.hotword.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.hotword.service.g */
/* compiled from: PG */
public final class C146589g extends C8848a implements C146591i {
    public C146589g(IBinder iBinder) {
        super(iBinder, "com.google.android.hotword.service.IHotwordService");
    }

    /* renamed from: a */
    public final HotwordInformation mo123389a() {
        Parcel gT = mo17261gT(10, mo17260gA());
        HotwordInformation hotwordInformation = (HotwordInformation) C8850c.m23492a(gT, HotwordInformation.CREATOR);
        gT.recycle();
        return hotwordInformation;
    }

    /* renamed from: b */
    public final HotwordSettings mo123390b() {
        throw null;
    }

    /* renamed from: c */
    public final String mo123391c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo123392d() {
        mo17262he(12, mo17260gA());
    }

    /* renamed from: e */
    public final void mo123393e(String str, boolean z) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23495d(gA, z);
        mo17262he(1, gA);
    }

    /* renamed from: g */
    public final void mo123395g(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17262he(3, gA);
    }

    /* renamed from: h */
    public final void mo123396h(int i, boolean z, String str) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        C8850c.m23495d(gA, z);
        gA.writeString(str);
        mo17262he(11, gA);
    }

    /* renamed from: i */
    public final boolean mo123397i() {
        throw null;
    }

    /* renamed from: j */
    public final boolean mo123398j() {
        Parcel gT = mo17261gT(4, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
