package com.google.android.gms.facs.cache;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.facs.cache.p10794a.C144170a;
import com.google.android.gms.facs.cache.p10794a.C144173d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;
import com.google.p4184bj.p4193c.p4197c.C55964bk;

/* renamed from: com.google.android.gms.facs.cache.f */
/* compiled from: PG */
public final /* synthetic */ class C144178f implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C55964bk f390489a;

    /* renamed from: b */
    public final /* synthetic */ FacsCacheCallOptions f390490b;

    public /* synthetic */ C144178f(C55964bk bkVar, FacsCacheCallOptions facsCacheCallOptions) {
        this.f390489a = bkVar;
        this.f390490b = facsCacheCallOptions;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C55964bk bkVar = this.f390489a;
        FacsCacheCallOptions facsCacheCallOptions = this.f390490b;
        C144181i iVar = new C144181i((C146010af) obj2);
        C144173d dVar = (C144173d) ((C144170a) obj).mo119451G();
        byte[] byteArray = bkVar.toByteArray();
        Parcel gA = dVar.mo17260gA();
        C8850c.m23499h(gA, iVar);
        gA.writeByteArray(byteArray);
        C8850c.m23497f(gA, facsCacheCallOptions);
        dVar.mo17262he(2, gA);
    }
}
