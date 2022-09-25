package com.google.android.libraries.p10922ab;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.ab.d */
/* compiled from: PG */
public final class C146708d extends C8848a implements C146710f {
    public C146708d(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.launcherclient.ILauncherOverlayCallback");
    }

    /* renamed from: a */
    public final void mo28128a(float f) {
        Parcel gA = mo17260gA();
        gA.writeFloat(f);
        mo17263hf(1, gA);
    }

    /* renamed from: b */
    public final void mo28129b(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(2, gA);
    }

    /* renamed from: c */
    public final void mo28130c(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17263hf(3, gA);
    }
}
