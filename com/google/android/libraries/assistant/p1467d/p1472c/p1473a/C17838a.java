package com.google.android.libraries.assistant.p1467d.p1472c.p1473a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.libraries.assistant.d.c.a.a */
/* compiled from: PG */
public final class C17838a extends C8848a implements C17840c {
    public C17838a(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
    }

    /* renamed from: a */
    public final void mo23477a(byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        mo17263hf(1, gA);
    }

    /* renamed from: b */
    public final void mo23478b(IBinder iBinder) {
        Parcel gA = mo17260gA();
        gA.writeStrongBinder(iBinder);
        mo17263hf(2, gA);
    }
}
