package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.n */
/* compiled from: PG */
public final class C0768n extends AppCompatImageView implements C0772r {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f2658a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0768n(ActionMenuPresenter actionMenuPresenter, Context context) {
        super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
        this.f2658a = actionMenuPresenter;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C0751je.m2535a(this, getContentDescription());
        setOnTouchListener(new C0767m(this, this));
    }

    /* renamed from: c */
    public final boolean mo1443c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo1444d() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2658a.mo1889o();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C1929b.m5224e(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
