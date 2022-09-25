package com.google.android.gms.googlehelp.internal.common;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.l */
/* compiled from: PG */
final class C144317l extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f390857a;

    /* renamed from: d */
    final /* synthetic */ Bundle f390858d;

    /* renamed from: e */
    final /* synthetic */ long f390859e;

    /* renamed from: f */
    final /* synthetic */ GoogleHelp f390860f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144317l(C143851w wVar, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(wVar);
        this.f390857a = feedbackOptions;
        this.f390858d = bundle;
        this.f390859e = j;
        this.f390860f = googleHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        try {
            FeedbackOptions feedbackOptions = this.f390857a;
            Bundle bundle = this.f390858d;
            long j = this.f390859e;
            GoogleHelp googleHelp = this.f390860f;
            C144316k kVar = new C144316k(this);
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, feedbackOptions);
            C8850c.m23497f(gA, bundle);
            gA.writeLong(j);
            C8850c.m23497f(gA, googleHelp);
            C8850c.m23499h(gA, kVar);
            ahVar.mo17263hf(10, gA);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            mo119110m(C144296ab.f390830a);
        }
    }
}
