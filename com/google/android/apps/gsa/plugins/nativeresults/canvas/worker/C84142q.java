package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.q */
/* compiled from: PG */
public final class C84142q extends C8848a implements C84144s {
    public C84142q(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IFetcher");
    }

    /* renamed from: b */
    public final String mo77574b() {
        Parcel gT = mo17261gT(4, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: c */
    public final String mo77575c() {
        Parcel gT = mo17261gT(5, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo77577g(int i, C84147v vVar, Uri uri, boolean z, Map map) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        C8850c.m23499h(gA, vVar);
        C8850c.m23497f(gA, uri);
        gA.writeByteArray((byte[]) null);
        C8850c.m23495d(gA, z);
        gA.writeMap(map);
        mo17262he(2, gA);
    }
}
