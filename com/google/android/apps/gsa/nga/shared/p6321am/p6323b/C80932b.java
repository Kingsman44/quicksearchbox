package com.google.android.apps.gsa.nga.shared.p6321am.p6323b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C90736at;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.b.b */
/* compiled from: PG */
public final /* synthetic */ class C80932b implements C90736at {

    /* renamed from: a */
    public final /* synthetic */ C90736at f221904a;

    /* renamed from: b */
    public final /* synthetic */ View f221905b;

    /* renamed from: c */
    public final /* synthetic */ Handler f221906c;

    public /* synthetic */ C80932b(C90736at atVar, View view, Handler handler) {
        this.f221904a = atVar;
        this.f221905b = view;
        this.f221906c = handler;
    }

    /* renamed from: a */
    public final void mo17700a(Object obj) {
        C90736at atVar = this.f221904a;
        View view = this.f221905b;
        Handler handler = this.f221906c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            atVar.mo17700a(bitmap);
        } else {
            C80934d.m128787a(view, atVar, handler);
        }
    }
}
