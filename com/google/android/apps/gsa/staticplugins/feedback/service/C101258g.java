package com.google.android.apps.gsa.staticplugins.feedback.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.service.g */
/* compiled from: PG */
public final class C101258g extends C8848a implements C101260i {
    public C101258g(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.staticplugins.feedback.service.IFeedbackPreferencesAccessor");
    }

    /* renamed from: a */
    public final String mo92200a() {
        Parcel gT = mo17261gT(3, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo92201b(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17263hf(2, gA);
    }

    /* renamed from: c */
    public final void mo92202c(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        mo17263hf(4, gA);
    }

    /* renamed from: d */
    public final boolean mo92203d() {
        Parcel gT = mo17261gT(1, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: e */
    public final boolean mo92204e() {
        Parcel gT = mo17261gT(5, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: f */
    public final boolean mo92205f() {
        Parcel gT = mo17261gT(6, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
