package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.q */
/* compiled from: PG */
public final class C88496q extends C8848a implements C88498s {
    public C88496q(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.service.ISearchServiceUiCallback");
    }

    /* renamed from: e */
    public final void mo82016e(ServiceEventData serviceEventData) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, serviceEventData);
        mo17263hf(1, gA);
    }

    /* renamed from: f */
    public final void mo82017f(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(2, gA);
    }
}
