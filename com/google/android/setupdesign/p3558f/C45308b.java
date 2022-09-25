package com.google.android.setupdesign.p3558f;

import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.p198v.p199a.p200a.C4261t;
import com.google.android.setupcompat.p3550b.C45244a;

/* renamed from: com.google.android.setupdesign.f.b */
/* compiled from: PG */
public final class C45308b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f118361a;

    public C45308b(ImageView imageView) {
        this.f118361a = imageView;
    }

    public final boolean onPreDraw() {
        this.f118361a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (!C45244a.m80595a() || this.f118361a.getDrawable() == null || (this.f118361a.getDrawable() instanceof VectorDrawable) || (this.f118361a.getDrawable() instanceof C4261t)) {
            return true;
        }
        if (!Build.TYPE.equals("userdebug") && !Build.TYPE.equals("eng")) {
            return true;
        }
        Log.w("HeaderAreaStyler", "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(String.valueOf(this.f118361a.getContext().getPackageName())));
        return true;
    }
}
