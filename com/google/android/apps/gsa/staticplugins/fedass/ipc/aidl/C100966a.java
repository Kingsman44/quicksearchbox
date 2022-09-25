package com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.a */
/* compiled from: PG */
public final class C100966a extends C8848a implements C100968c {
    public C100966a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationService");
    }

    /* renamed from: e */
    public final void mo92117e(String str, C100971f fVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23499h(gA, fVar);
        mo17263hf(4, gA);
    }

    /* renamed from: f */
    public final void mo92118f(String str, C100971f fVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23499h(gA, fVar);
        mo17263hf(3, gA);
    }

    /* renamed from: g */
    public final void mo92119g(String str, boolean z, C100971f fVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23495d(gA, z);
        C8850c.m23499h(gA, fVar);
        mo17263hf(1, gA);
    }

    /* renamed from: h */
    public final void mo92120h(C100971f fVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, fVar);
        mo17263hf(2, gA);
    }
}
