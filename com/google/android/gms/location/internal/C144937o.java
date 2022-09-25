package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146045y;

/* renamed from: com.google.android.gms.location.internal.o */
/* compiled from: PG */
public final /* synthetic */ class C144937o implements C146045y {

    /* renamed from: a */
    public final /* synthetic */ C144918ag f391889a;

    /* renamed from: b */
    public final /* synthetic */ C143782cc f391890b;

    public /* synthetic */ C144937o(C144918ag agVar, C143782cc ccVar) {
        this.f391889a = agVar;
        this.f391890b = ccVar;
    }

    /* renamed from: a */
    public final void mo37391a() {
        try {
            this.f391889a.mo120419m(this.f391890b, true, new C146010af());
        } catch (RemoteException unused) {
        }
    }
}
