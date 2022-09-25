package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.p10795a.C144190a;
import com.google.android.gms.feedback.p10795a.C144196d;
import com.google.android.gms.feedback.p10795a.p10796a.C144191a;
import com.google.android.gms.feedback.p10795a.p10797b.C144194a;
import com.google.android.p10905k.C146607f;
import com.google.android.p10905k.C146609h;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.feedback.f */
/* compiled from: PG */
final class C144201f extends C144204i {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f390612a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144201f(C143851w wVar, FeedbackOptions feedbackOptions) {
        super(wVar);
        this.f390612a = feedbackOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144190a aVar = (C144190a) bVar;
        FeedbackOptions feedbackOptions = this.f390612a;
        C144191a.m234432d(feedbackOptions);
        C146609h hVar = C144194a.f390600a;
        String str = hVar.f395980b;
        if (((C146607f) hVar).mo123402a().booleanValue()) {
            C144196d dVar = (C144196d) aVar.mo119451G();
            Parcel gA = dVar.mo17260gA();
            C8850c.m23497f(gA, feedbackOptions);
            Parcel gT = dVar.mo17261gT(7, gA);
            C8850c.m23500i(gT);
            gT.recycle();
        } else {
            C144196d dVar2 = (C144196d) aVar.mo119451G();
            ErrorReport errorReport = new ErrorReport(feedbackOptions, aVar.f390594a.getCacheDir());
            Parcel gA2 = dVar2.mo17260gA();
            C8850c.m23497f(gA2, errorReport);
            Parcel gT2 = dVar2.mo17261gT(3, gA2);
            C8850c.m23500i(gT2);
            gT2.recycle();
        }
        mo119112p(Status.f389615a);
    }
}
