package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6387k.p6388a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80671b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.f */
/* compiled from: PG */
public final /* synthetic */ class C81833f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C80671b f223797a;

    public /* synthetic */ C81833f(C80671b bVar) {
        this.f223797a = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80671b bVar = this.f223797a;
        C58485gu d = bVar.mo74415d();
        Bitmap a = bVar.mo74413a();
        C58480gp e = C58485gu.m89837e();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            RectF rectF = (RectF) d.get(i);
            e.mo55395g(Bitmap.createBitmap(a, (int) (rectF.left * ((float) a.getWidth())), (int) (rectF.top * ((float) a.getHeight())), (int) ((rectF.right - rectF.left) * ((float) a.getWidth())), (int) ((rectF.bottom - rectF.top) * ((float) a.getHeight()))));
        }
        return e.mo55394f();
    }
}
