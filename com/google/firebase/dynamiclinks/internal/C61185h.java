package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.internal.C143810dd;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.firebase.dynamiclinks.internal.h */
/* compiled from: PG */
public final class C61185h extends C143810dd {

    /* renamed from: a */
    private final Bundle f165534a;

    public C61185h(Bundle bundle) {
        super((Feature[]) null, false, 13202);
        this.f165534a = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo57751a(C143717b bVar, C146010af afVar) {
        C61181d dVar = (C61181d) bVar;
        C61184g gVar = new C61184g(afVar);
        Bundle bundle = this.f165534a;
        try {
            C61189l lVar = (C61189l) dVar.mo119451G();
            Parcel gA = lVar.mo17260gA();
            C8850c.m23499h(gA, gVar);
            C8850c.m23497f(gA, bundle);
            lVar.mo17262he(2, gA);
        } catch (RemoteException unused) {
        }
    }
}
