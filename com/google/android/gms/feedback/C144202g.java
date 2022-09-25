package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.p10795a.C144190a;
import com.google.android.gms.feedback.p10795a.C144196d;
import com.google.android.gms.feedback.p10795a.p10796a.C144191a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.feedback.g */
/* compiled from: PG */
final class C144202g extends C144204i {

    /* renamed from: a */
    final /* synthetic */ Bundle f390613a;

    /* renamed from: d */
    final /* synthetic */ long f390614d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144202g(C143851w wVar, Bundle bundle, long j) {
        super(wVar);
        this.f390613a = bundle;
        this.f390614d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144190a aVar = (C144190a) bVar;
        try {
            Bundle bundle = this.f390613a;
            long j = this.f390614d;
            C144191a.m234431c(bundle);
            C144196d dVar = (C144196d) aVar.mo119451G();
            Parcel gA = dVar.mo17260gA();
            C8850c.m23497f(gA, bundle);
            gA.writeLong(j);
            dVar.mo17262he(4, gA);
            mo119112p(Status.f389615a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            mo119110m(C144205j.f390618a);
        }
    }
}
