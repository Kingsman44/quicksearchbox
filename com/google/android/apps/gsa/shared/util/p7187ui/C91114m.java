package com.google.android.apps.gsa.shared.util.p7187ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.p176n.p177a.C3795f;
import androidx.p176n.p177a.C3797h;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.m */
/* compiled from: PG */
public class C91114m {

    /* renamed from: b */
    private static final double f254426b = m148866d(-1);

    /* renamed from: a */
    public final C91113l f254427a;

    /* renamed from: c */
    private final double f254428c;

    public C91114m(boolean z, C91113l lVar) {
        this.f254428c = true != z ? 2.0d : 4.5d;
        this.f254427a = lVar;
    }

    /* renamed from: a */
    private static double m148865a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        double d2 = d / 255.0d;
        return d2 <= 0.03928d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
    }

    /* renamed from: d */
    private static double m148866d(int i) {
        return (m148865a(Color.red(i)) * 0.2126d) + (m148865a(Color.green(i)) * 0.7152d) + (m148865a(Color.blue(i)) * 0.0722d);
    }

    /* renamed from: b */
    public final void mo85383b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f254427a.mo85382a((Integer) null);
            return;
        }
        C91112k kVar = new C91112k(this);
        C3795f fVar = new C3795f(bitmap);
        fVar.f12234a = 16;
        fVar.mo8024b(kVar);
    }

    /* renamed from: c */
    public final boolean mo85384c(C3797h hVar) {
        if (hVar == null) {
            return false;
        }
        int i = hVar.f12238a;
        if ((f254426b + 0.05d) / (m148866d(i) + 0.05d) < this.f254428c) {
            return false;
        }
        this.f254427a.mo85382a(Integer.valueOf(i));
        return true;
    }
}
