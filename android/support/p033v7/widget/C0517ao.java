package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ao */
/* compiled from: PG */
public final class C0517ao extends RatingBar {

    /* renamed from: a */
    private final C0515am f2071a;

    public C0517ao(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C0730ik.m2467d(this, getContext());
        C0515am amVar = new C0515am(this);
        this.f2071a = amVar;
        amVar.mo2512b(attributeSet, R.attr.ratingBarStyle);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f2071a.f2065a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
