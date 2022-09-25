package com.google.android.libraries.lens.sdk.p2047d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.lens.sdk.d.a */
/* compiled from: PG */
public final class C24931a extends C8848a implements C24933c {
    public C24931a(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.lens.sdk.shared.ILensService");
    }

    /* renamed from: a */
    public final void mo30146a(C24936f fVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, fVar);
        mo17262he(2, gA);
    }

    /* renamed from: b */
    public final void mo30147b() {
        mo17262he(3, mo17260gA());
    }

    /* renamed from: c */
    public final void mo30148c(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17262he(1, gA);
    }
}
