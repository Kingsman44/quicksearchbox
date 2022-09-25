package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6387k.p6388a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.m */
/* compiled from: PG */
final class C81840m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RectF f223825a;

    /* renamed from: b */
    final /* synthetic */ Bitmap f223826b;

    /* renamed from: c */
    final /* synthetic */ RectF[] f223827c;

    /* renamed from: d */
    final /* synthetic */ C81841n f223828d;

    public C81840m(C81841n nVar, RectF rectF, Bitmap bitmap, RectF[] rectFArr) {
        this.f223828d = nVar;
        this.f223825a = rectF;
        this.f223826b = bitmap;
        this.f223827c = rectFArr;
    }

    public final void onClick(View view) {
        ((C81993bc) this.f223828d.f223835f.get()).mo75430a(view);
        this.f223828d.mo75368c(this.f223825a, this.f223826b, this.f223827c);
    }
}
