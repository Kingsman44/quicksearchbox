package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.ac */
/* compiled from: PG */
public final class C84123ac extends C8848a implements C84125ae {
    public C84123ac(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IRichImageViewer");
    }

    /* renamed from: a */
    public final Intent mo77553a(String str, String str2, int i, String str3, String str4) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeInt(i);
        gA.writeString(str3);
        gA.writeString(str4);
        Parcel gT = mo17261gT(1, gA);
        Intent intent = (Intent) C8850c.m23492a(gT, Intent.CREATOR);
        gT.recycle();
        return intent;
    }
}
