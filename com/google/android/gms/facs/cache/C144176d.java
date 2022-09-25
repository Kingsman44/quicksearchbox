package com.google.android.gms.facs.cache;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.facs.cache.p10794a.C144170a;
import com.google.android.gms.facs.cache.p10794a.C144173d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.facs.cache.d */
/* compiled from: PG */
public final /* synthetic */ class C144176d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ FacsCacheCallOptions f390487a;

    public /* synthetic */ C144176d(FacsCacheCallOptions facsCacheCallOptions) {
        this.f390487a = facsCacheCallOptions;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        FacsCacheCallOptions facsCacheCallOptions = this.f390487a;
        C144182j jVar = new C144182j((C146010af) obj2);
        C144173d dVar = (C144173d) ((C144170a) obj).mo119451G();
        Parcel gA = dVar.mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23497f(gA, facsCacheCallOptions);
        dVar.mo17262he(3, gA);
    }
}
