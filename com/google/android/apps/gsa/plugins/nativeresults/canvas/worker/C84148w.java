package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.w */
/* compiled from: PG */
public final class C84148w extends C8848a implements C84150y {
    public C84148w(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.ILogger");
    }

    /* renamed from: a */
    public final void mo77563a(byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo77564b(AgsaLogData agsaLogData) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, agsaLogData);
        mo17262he(1, gA);
    }

    /* renamed from: c */
    public final void mo77565c(int i, Bundle bundle) {
        throw null;
    }

    /* renamed from: d */
    public final void mo77566d(int i, int i2, Bundle bundle, byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        gA.writeInt(i2);
        C8850c.m23497f(gA, bundle);
        gA.writeByteArray(bArr);
        mo17262he(7, gA);
    }

    /* renamed from: e */
    public final void mo77567e(int i, int i2) {
        throw null;
    }

    /* renamed from: f */
    public final void mo77568f(Query query, long j, long j2, long j3, long j4, byte[] bArr) {
        throw null;
    }

    /* renamed from: g */
    public final void mo77569g(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        mo17262he(4, gA);
    }

    /* renamed from: h */
    public final void mo77570h(String str, String str2, String str3, Map map) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        gA.writeMap(map);
        mo17262he(3, gA);
    }

    /* renamed from: i */
    public final void mo77571i(byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        mo17262he(6, gA);
    }
}
