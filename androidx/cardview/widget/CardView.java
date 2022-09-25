package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.cardview.C1585a;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class CardView extends FrameLayout {

    /* renamed from: e */
    public static final C1587b f4339e = new C1587b();

    /* renamed from: g */
    private static final int[] f4340g = {16842801};

    /* renamed from: a */
    public boolean f4341a;

    /* renamed from: b */
    public boolean f4342b;

    /* renamed from: c */
    public final Rect f4343c;

    /* renamed from: d */
    final Rect f4344d;

    /* renamed from: f */
    public final C1586a f4345f;

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public void mo4473c(int i) {
        C1586a aVar = this.f4345f;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C1588c cVar = (C1588c) aVar.f4346a;
        cVar.mo4481a(valueOf);
        cVar.invalidateSelf();
    }

    /* renamed from: d */
    public void mo4474d(float f) {
        this.f4345f.f4347b.setElevation(f);
    }

    /* renamed from: e */
    public void mo4475e(float f) {
        C1588c cVar = (C1588c) this.f4345f.f4346a;
        if (f != cVar.f4348a) {
            cVar.f4348a = f;
            cVar.mo4482b((Rect) null);
            cVar.invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo4476f() {
        if (!this.f4341a) {
            this.f4341a = true;
            C1586a aVar = this.f4345f;
            C1587b.m4206b(aVar, ((C1588c) aVar.f4346a).f4349b);
        }
    }

    /* renamed from: ii */
    public final float mo4477ii() {
        return ((C1588c) this.f4345f.f4346a).f4349b;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        int i2;
        Rect rect = new Rect();
        this.f4343c = rect;
        this.f4344d = new Rect();
        C1586a aVar = new C1586a(this);
        this.f4345f = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1585a.f4338a, i, R.style.CardView);
        C2043bi.m5525S(this, context, C1585a.f4338a, attributeSet, obtainStyledAttributes, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4340g);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i2 = getResources().getColor(R.color.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f4341a = obtainStyledAttributes.getBoolean(7, false);
        this.f4342b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1588c cVar = new C1588c(colorStateList, dimension);
        aVar.f4346a = cVar;
        aVar.f4347b.setBackgroundDrawable(cVar);
        CardView cardView = aVar.f4347b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        C1587b.m4206b(aVar, dimension3);
    }
}
