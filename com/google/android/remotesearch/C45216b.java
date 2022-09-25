package com.google.android.remotesearch;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.remotesearch.b */
/* compiled from: PG */
public final class C45216b extends C8848a implements IInterface {
    public C45216b(IBinder iBinder) {
        super(iBinder, "com.google.android.remotesearch.IRemoteSearchCallback");
    }

    /* renamed from: e */
    public final void mo49069e(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(5, gA);
    }

    /* renamed from: f */
    public final void mo49070f(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(4, gA);
    }

    /* renamed from: g */
    public final void mo49071g(Uri uri) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, uri);
        C8850c.m23495d(gA, false);
        gA.writeByteArray((byte[]) null);
        mo17263hf(8, gA);
    }
}
