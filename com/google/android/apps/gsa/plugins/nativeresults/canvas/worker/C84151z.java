package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.z */
/* compiled from: PG */
public final class C84151z extends C8848a implements C84122ab {
    public C84151z(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.INavigator");
    }

    /* renamed from: a */
    public final void mo77551a(int i, Intent intent) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        C8850c.m23497f(gA, intent);
        mo17262he(3, gA);
    }

    /* renamed from: d */
    public final void mo77552d(int i, String str, boolean z, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        gA.writeString(str);
        C8850c.m23495d(gA, z);
        C8850c.m23497f(gA, bundle);
        mo17262he(2, gA);
    }
}
