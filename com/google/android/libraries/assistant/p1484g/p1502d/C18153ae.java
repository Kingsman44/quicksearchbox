package com.google.android.libraries.assistant.p1484g.p1502d;

import android.app.DirectAction;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.g.d.ae */
/* compiled from: PG */
public final class C18153ae extends C8848a implements C18155ag {
    public C18153ae(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.assistant.directactions.sender.ISystemDirectActionsProxy");
    }

    /* renamed from: e */
    public final void mo23639e(DirectAction directAction, Bundle bundle, C18149aa aaVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, directAction);
        C8850c.m23497f(gA, bundle);
        C8850c.m23499h(gA, aaVar);
        mo17263hf(1, gA);
    }

    /* renamed from: f */
    public final void mo23640f(int i, C18152ad adVar) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        C8850c.m23499h(gA, adVar);
        mo17263hf(2, gA);
    }
}
