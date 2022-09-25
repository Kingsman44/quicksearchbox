package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.x */
/* compiled from: PG */
public final class C88840x extends Drawable {

    /* renamed from: d */
    private static final int[] f240522d = {R.color.quantum_googred500, R.color.quantum_pink500, R.color.quantum_purple500, R.color.quantum_deeppurple500, R.color.quantum_indigo500, R.color.quantum_googblue500, R.color.quantum_lightblue500, R.color.quantum_cyan500, R.color.quantum_teal500, R.color.quantum_googgreen500, R.color.quantum_lightgreen500, R.color.quantum_lime500, R.color.quantum_yellow500, R.color.quantum_googyellow500, R.color.quantum_orange500, R.color.quantum_deeporange500, R.color.quantum_brown500, R.color.quantum_grey500, R.color.quantum_bluegrey500};

    /* renamed from: e */
    private static final int[] f240523e = new int[19];

    /* renamed from: f */
    private static final Rect f240524f = new Rect();

    /* renamed from: a */
    public int f240525a;

    /* renamed from: b */
    public int f240526b;

    /* renamed from: c */
    public boolean f240527c;

    /* renamed from: g */
    private final Paint f240528g;

    /* renamed from: h */
    private final Paint f240529h;

    /* renamed from: i */
    private final Paint f240530i;

    /* renamed from: j */
    private final Resources f240531j;

    /* renamed from: k */
    private String f240532k;

    /* renamed from: l */
    private int f240533l = PrivateKeyType.INVALID;

    /* renamed from: m */
    private boolean f240534m = true;

    /* renamed from: n */
    private int f240535n;

    /* renamed from: o */
    private Bitmap f240536o;

    public C88840x(Resources resources) {
        Paint paint = new Paint();
        this.f240528g = paint;
        Paint paint2 = new Paint();
        this.f240529h = paint2;
        Paint paint3 = new Paint();
        this.f240530i = paint3;
        this.f240531j = resources;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setTypeface(Typeface.create("sans-serif", 0));
        paint2.setAlpha(PrivateKeyType.INVALID);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint3.setFilterBitmap(true);
        paint3.setAntiAlias(true);
    }

    /* renamed from: a */
    public final void mo82620a(String str) {
        String str2 = null;
        String trim = str != null ? str.trim() : null;
        boolean z = true;
        if (!TextUtils.isEmpty(trim)) {
            int codePointAt = trim.codePointAt(0);
            if (Character.isLetter(codePointAt)) {
                str2 = trim.substring(0, 1).toUpperCase(Locale.getDefault());
            } else if (Character.isIdeographic(codePointAt)) {
                str2 = trim.substring(0, Character.charCount(trim.codePointAt(0)));
            }
        }
        boolean z2 = !TextUtils.equals(this.f240532k, str2);
        this.f240532k = str2;
        int hashCode = (str != null ? str.hashCode() : 0) % 19;
        if (hashCode < 0) {
            hashCode += 19;
        }
        int[] iArr = f240523e;
        int i = iArr[hashCode];
        if (i == 0) {
            i = this.f240531j.getColor(f240522d[hashCode]);
            iArr[hashCode] = i;
        }
        this.f240528g.setColor(i);
        if (this.f240535n == i) {
            z = false;
        }
        this.f240535n = i;
        if (z2 || z) {
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo82621b() {
        boolean z = this.f240534m;
        this.f240534m = true;
        if (!z) {
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            int alpha = this.f240528g.getAlpha();
            this.f240528g.setAlpha((int) (((float) alpha) * (((float) this.f240533l) / 255.0f)));
            if (this.f240534m) {
                if (this.f240527c) {
                    i = this.f240525a;
                } else {
                    i = bounds.width();
                }
                canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) i) / 2.0f, this.f240528g);
            } else if (this.f240527c) {
                canvas.drawRect(bounds.exactCenterX() - (((float) this.f240525a) / 2.0f), bounds.exactCenterY() - (((float) this.f240526b) / 2.0f), bounds.exactCenterX() + (((float) this.f240525a) / 2.0f), bounds.exactCenterY() + (((float) this.f240526b) / 2.0f), this.f240528g);
            } else {
                canvas.drawRect(bounds, this.f240528g);
            }
            this.f240528g.setAlpha(alpha);
            String str = this.f240532k;
            if (str != null) {
                Paint paint = this.f240529h;
                Rect rect = f240524f;
                paint.getTextBounds(str, 0, 1, rect);
                int alpha2 = this.f240529h.getAlpha();
                this.f240529h.setAlpha((int) (((float) alpha2) * (((float) this.f240533l) / 255.0f)));
                canvas.drawText(this.f240532k, bounds.exactCenterX(), bounds.exactCenterY() + (((float) rect.height()) / 2.0f), this.f240529h);
                this.f240529h.setAlpha(alpha2);
                return;
            }
            int alpha3 = this.f240530i.getAlpha();
            this.f240530i.setAlpha((int) (((float) alpha3) * (((float) this.f240533l) / 255.0f)));
            if (this.f240536o == null) {
                this.f240536o = BitmapFactory.decodeResource(this.f240531j, R.drawable.quantum_ic_person_white_48);
            }
            canvas.drawBitmap(this.f240536o, (Rect) null, new Rect((int) (bounds.exactCenterX() - ((((float) bounds.width()) * 0.6f) / 2.0f)), (int) (bounds.exactCenterY() - ((((float) bounds.height()) * 0.6f) / 2.0f)), (int) (bounds.exactCenterX() + ((((float) bounds.width()) * 0.6f) / 2.0f)), (int) (bounds.exactCenterY() + ((((float) bounds.height()) * 0.6f) / 2.0f))), this.f240530i);
            this.f240530i.setAlpha(alpha3);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f240529h.setTextSize(((float) rect.width()) * 0.6f);
    }

    public final void setAlpha(int i) {
        int i2 = this.f240533l;
        this.f240533l = i;
        if (i2 != i) {
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f240528g.setColorFilter(colorFilter);
        this.f240529h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
