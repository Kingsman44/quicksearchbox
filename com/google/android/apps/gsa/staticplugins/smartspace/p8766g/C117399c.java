package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.smartspace.C92117m;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.c */
/* compiled from: PG */
final class C117399c extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117400d f325897a;

    /* renamed from: b */
    private final C92117m f325898b;

    /* renamed from: c */
    private final SettableFuture f325899c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117399c(C117400d dVar, C92117m mVar, SettableFuture settableFuture) {
        super("SmartspaceBirthdayIH");
        this.f325897a = dVar;
        this.f325898b = mVar;
        this.f325899c = settableFuture;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C50818do a = this.f325897a.mo103288a(this.f325898b);
            if (a == null) {
                this.f325899c.mo57356n(new C117383a());
                return;
            }
            this.f325899c.mo57356n(new C117383a(a, ((BitmapDrawable) drawable).getBitmap()));
        }
    }
}
