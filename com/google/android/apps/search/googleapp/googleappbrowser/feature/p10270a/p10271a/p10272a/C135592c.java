package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C135592c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C135593d f369331a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f369332b;

    /* renamed from: c */
    public final /* synthetic */ RectF f369333c;

    /* renamed from: d */
    public final /* synthetic */ RectF[] f369334d;

    public /* synthetic */ C135592c(C135593d dVar, Bitmap bitmap, RectF rectF, RectF[] rectFArr) {
        this.f369331a = dVar;
        this.f369332b = bitmap;
        this.f369333c = rectF;
        this.f369334d = rectFArr;
    }

    public final void onClick(View view) {
        C135593d dVar = this.f369331a;
        Bitmap bitmap = this.f369332b;
        RectF rectF = this.f369333c;
        RectF[] rectFArr = this.f369334d;
        dVar.f369336a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C135593d.m219837c(bitmap, rectF, view.getContext(), rectFArr, dVar.f369337b);
    }
}
