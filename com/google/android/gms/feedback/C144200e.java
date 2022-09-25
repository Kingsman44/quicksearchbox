package com.google.android.gms.feedback;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.p10795a.C144190a;
import com.google.android.gms.feedback.p10795a.C144193b;
import com.google.android.gms.feedback.p10795a.C144195c;
import com.google.android.gms.feedback.p10795a.C144196d;
import com.google.android.gms.feedback.p10795a.p10796a.C144191a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.feedback.e */
/* compiled from: PG */
final class C144200e extends C144204i {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f390609a;

    /* renamed from: d */
    final /* synthetic */ Context f390610d;

    /* renamed from: e */
    final /* synthetic */ long f390611e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144200e(C143851w wVar, FeedbackOptions feedbackOptions, Context context, long j) {
        super(wVar);
        this.f390609a = feedbackOptions;
        this.f390610d = context;
        this.f390611e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144189a aVar;
        C144190a aVar2 = (C144190a) bVar;
        FeedbackOptions feedbackOptions = this.f390609a;
        if (feedbackOptions == null || (aVar = feedbackOptions.f390581r) == null) {
            C144191a.m234432d(feedbackOptions);
            aVar2.mo119732m(feedbackOptions);
            C144196d dVar = (C144196d) aVar2.mo119451G();
            ErrorReport errorReport = new ErrorReport(feedbackOptions, aVar2.f390594a.getCacheDir());
            Parcel gA = dVar.mo17260gA();
            C8850c.m23497f(gA, errorReport);
            Parcel gT = dVar.mo17261gT(1, gA);
            C8850c.m23500i(gT);
            gT.recycle();
            mo119112p(Status.f389615a);
            return;
        }
        Context context = this.f390610d;
        long j = this.f390611e;
        C144191a.m234433e(new C144193b(context, aVar, j));
        C144191a.m234433e(new C144195c(context, aVar, j));
        FeedbackOptions feedbackOptions2 = this.f390609a;
        long j2 = this.f390611e;
        C144191a.m234432d(feedbackOptions2);
        aVar2.mo119732m(feedbackOptions2);
        C144196d dVar2 = (C144196d) aVar2.mo119451G();
        ErrorReport errorReport2 = new ErrorReport(feedbackOptions2, aVar2.f390594a.getCacheDir());
        Parcel gA2 = dVar2.mo17260gA();
        C8850c.m23497f(gA2, errorReport2);
        gA2.writeLong(j2);
        dVar2.mo17263hf(6, gA2);
        mo119112p(Status.f389615a);
    }
}
