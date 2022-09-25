package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.dm */
/* compiled from: PG */
public final class C145314dm extends C8848a implements C145316do {
    public C145314dm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: e */
    public final String mo120855e(AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, appMetadata);
        Parcel gT = mo17261gT(11, gA);
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo120856f(AppMetadata appMetadata, boolean z) {
        throw null;
    }

    /* renamed from: g */
    public final List mo120857g(String str, String str2, AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23497f(gA, appMetadata);
        Parcel gT = mo17261gT(16, gA);
        ArrayList createTypedArrayList = gT.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        gT.recycle();
        return createTypedArrayList;
    }

    /* renamed from: h */
    public final List mo120858h(String str, String str2, String str3) {
        Parcel gA = mo17260gA();
        gA.writeString((String) null);
        gA.writeString(str2);
        gA.writeString(str3);
        Parcel gT = mo17261gT(17, gA);
        ArrayList createTypedArrayList = gT.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        gT.recycle();
        return createTypedArrayList;
    }

    /* renamed from: i */
    public final List mo120859i(String str, String str2, boolean z, AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23495d(gA, z);
        C8850c.m23497f(gA, appMetadata);
        Parcel gT = mo17261gT(14, gA);
        ArrayList createTypedArrayList = gT.createTypedArrayList(UserAttributeParcel.CREATOR);
        gT.recycle();
        return createTypedArrayList;
    }

    /* renamed from: j */
    public final List mo120860j(String str, String str2, String str3, boolean z) {
        Parcel gA = mo17260gA();
        gA.writeString((String) null);
        gA.writeString(str2);
        gA.writeString(str3);
        C8850c.m23495d(gA, z);
        Parcel gT = mo17261gT(15, gA);
        ArrayList createTypedArrayList = gT.createTypedArrayList(UserAttributeParcel.CREATOR);
        gT.recycle();
        return createTypedArrayList;
    }

    /* renamed from: k */
    public final void mo120861k(AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, appMetadata);
        mo17262he(4, gA);
    }

    /* renamed from: l */
    public final void mo120862l(EventParcel eventParcel, AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, eventParcel);
        C8850c.m23497f(gA, appMetadata);
        mo17262he(1, gA);
    }

    /* renamed from: m */
    public final void mo120863m(EventParcel eventParcel, String str, String str2) {
        throw null;
    }

    /* renamed from: n */
    public final void mo120864n(AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, appMetadata);
        mo17262he(18, gA);
    }

    /* renamed from: o */
    public final void mo120865o(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, conditionalUserPropertyParcel);
        C8850c.m23497f(gA, appMetadata);
        mo17262he(12, gA);
    }

    /* renamed from: p */
    public final void mo120866p(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        throw null;
    }

    /* renamed from: q */
    public final void mo120867q(AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, appMetadata);
        mo17262he(20, gA);
    }

    /* renamed from: r */
    public final void mo120868r(long j, String str, String str2, String str3) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        mo17262he(10, gA);
    }

    /* renamed from: s */
    public final void mo120869s(Bundle bundle, AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        C8850c.m23497f(gA, appMetadata);
        mo17262he(19, gA);
    }

    /* renamed from: t */
    public final void mo120870t(AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, appMetadata);
        mo17262he(6, gA);
    }

    /* renamed from: u */
    public final void mo120871u(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, userAttributeParcel);
        C8850c.m23497f(gA, appMetadata);
        mo17262he(2, gA);
    }

    /* renamed from: v */
    public final byte[] mo120872v(EventParcel eventParcel, String str) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, eventParcel);
        gA.writeString(str);
        Parcel gT = mo17261gT(9, gA);
        byte[] createByteArray = gT.createByteArray();
        gT.recycle();
        return createByteArray;
    }
}
