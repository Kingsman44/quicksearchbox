package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117090b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.w */
/* compiled from: PG */
public final class C117182w extends C22939d {

    /* renamed from: a */
    public static final C59071e f325282a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.a.d.w");

    /* renamed from: k */
    private static final float[][] f325283k = {new float[]{1.0f, 0.2f}, new float[]{1.0f, 1.0f}, new float[]{0.2f, 1.0f}};

    /* renamed from: b */
    public RadioButton f325284b;

    /* renamed from: c */
    public RadioButton f325285c;

    /* renamed from: d */
    public RadioButton f325286d;

    /* renamed from: e */
    public RadioButton f325287e;

    /* renamed from: f */
    public View f325288f;

    /* renamed from: g */
    public View f325289g;

    /* renamed from: h */
    public SeekBar f325290h;

    /* renamed from: i */
    public SeekBar f325291i;

    /* renamed from: j */
    public boolean f325292j;

    /* renamed from: l */
    private final Context f325293l;

    /* renamed from: m */
    private final C117090b f325294m;

    /* renamed from: n */
    private Bitmap f325295n;

    /* renamed from: o */
    private Bitmap f325296o;

    public C117182w(C22945j jVar, C117090b bVar, Context context) {
        super(jVar);
        this.f325293l = context;
        this.f325294m = bVar;
    }

    /* renamed from: k */
    public static final void m194749k(RadioButton radioButton, int i) {
        radioButton.setChecked(((Integer) Objects.requireNonNull((Integer) radioButton.getTag())).intValue() == i);
    }

    /* renamed from: l */
    private static final int m194750l(Bitmap bitmap, double d) {
        int width = bitmap.getWidth();
        double d2 = (double) width;
        Double.isNaN(d2);
        int i = (int) (d2 * d);
        int i2 = width - 1;
        if (i > i2) {
            i = i2;
        }
        return bitmap.getPixel(i, 0);
    }

    /* renamed from: e */
    public final Bundle mo103170e() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_CUSTOM_HUE", this.f325290h.getProgress());
        bundle.putInt("KEY_CUSTOM_SATURATION_VALUE", this.f325291i.getProgress());
        Bitmap bitmap = this.f325296o;
        if (bitmap != null) {
            double progress = (double) this.f325291i.getProgress();
            double max = (double) this.f325291i.getMax();
            Double.isNaN(progress);
            Double.isNaN(max);
            i = m194750l(bitmap, progress / max);
        } else {
            i = -1;
        }
        bundle.putInt("KEY_CUSTOM_COLOR", i);
        return bundle;
    }

    /* renamed from: g */
    public final void mo103171g() {
        if (!this.f325292j) {
            if (((Integer) ((C23249a) this.f325294m.mo103129b()).mo28725a()).intValue() == 1 && this.f325296o != null) {
                this.f63126Q.mo28345s("CUSTOM_COLOR_CHANGED", "CUSTOM_COLOR_CHANGED", mo103170e());
            }
            mo103172h();
        }
    }

    /* renamed from: h */
    public final void mo103172h() {
        int dimension = (int) this.f325293l.getResources().getDimension(R.dimen.customized_color_button_border_width);
        int intValue = ((Integer) ((C23249a) this.f325294m.mo103130c()).mo28725a()).intValue();
        Drawable[] children = ((DrawableContainer.DrawableContainerState) ((StateListDrawable) this.f325287e.getBackground()).getConstantState()).getChildren();
        for (Drawable drawable : children) {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof GradientDrawable) {
                        ((GradientDrawable) drawable2).setStroke(dimension, intValue);
                    }
                }
            }
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f325293l).inflate(R.layout.color_menu, (ViewGroup) null, false);
        mo28295iC(linearLayout);
        this.f325295n = BitmapFactory.decodeResource(this.f325293l.getResources(), R.drawable.rainbow_bar);
        this.f325284b = (RadioButton) linearLayout.findViewById(R.id.color_theme_color);
        this.f325285c = (RadioButton) linearLayout.findViewById(R.id.color_theme_mono_light);
        this.f325286d = (RadioButton) linearLayout.findViewById(R.id.color_theme_mono_dark);
        this.f325287e = (RadioButton) linearLayout.findViewById(R.id.color_theme_custom);
        this.f325288f = linearLayout.findViewById(R.id.theme_panel_background);
        this.f325289g = linearLayout.findViewById(R.id.custom_color_panel);
        this.f325290h = (SeekBar) linearLayout.findViewById(R.id.hue_slider);
        this.f325291i = (SeekBar) linearLayout.findViewById(R.id.saturation_brightness_slider);
        linearLayout.findViewById(R.id.close_button).setOnClickListener(new C117178s(this));
        C117179t tVar = new C117179t(this);
        this.f325284b.setTag(0);
        this.f325285c.setTag(1);
        this.f325286d.setTag(2);
        this.f325287e.setTag(3);
        this.f325284b.setOnClickListener(tVar);
        this.f325285c.setOnClickListener(tVar);
        this.f325286d.setOnClickListener(tVar);
        this.f325287e.setOnClickListener(tVar);
        this.f325290h.setOnSeekBarChangeListener(new C117180u(this));
        this.f325291i.setOnSeekBarChangeListener(new C117181v(this));
        ((C23249a) this.f325294m.mo103133f()).mo28726b(new C117172m(this));
        ((C23249a) this.f325294m.mo103129b()).mo28726b(new C117174o(this));
        ((C23249a) this.f325294m.mo103131d()).mo28726b(new C117175p(this));
        ((C23249a) this.f325294m.mo103132e()).mo28726b(new C117176q(this));
        ((C23249a) this.f325294m.mo103130c()).mo28726b(new C117177r(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        int intValue = ((Integer) ((C23249a) this.f325294m.mo103130c()).mo28725a()).intValue();
        float[] fArr = new float[3];
        Color.colorToHSV(intValue, fArr);
        int i = 0;
        float f = fArr[0];
        float[] fArr2 = new float[3];
        int max = this.f325290h.getMax();
        double d = Double.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= max) {
                i2 = i3;
                break;
            }
            Bitmap bitmap = this.f325295n;
            double d2 = (double) i2;
            double d3 = (double) max;
            Double.isNaN(d2);
            Double.isNaN(d3);
            Color.colorToHSV(m194750l(bitmap, d2 / d3), fArr2);
            double abs = (double) Math.abs(f - fArr2[0]);
            if (abs < d) {
                if (abs == C59203do.f157270a) {
                    break;
                }
                i3 = i2;
                d = abs;
            }
            i2++;
        }
        this.f325292j = true;
        this.f325290h.setProgress(i2);
        mo103173j();
        this.f325292j = false;
        this.f325290h.setProgress(i2);
        int max2 = this.f325291i.getMax();
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (true) {
            if (i >= max2) {
                i = i5;
                break;
            }
            Bitmap bitmap2 = this.f325296o;
            double d4 = (double) i;
            double d5 = (double) max2;
            Double.isNaN(d4);
            Double.isNaN(d5);
            int abs2 = Math.abs(m194750l(bitmap2, d4 / d5) - intValue);
            if (abs2 < i4) {
                if (abs2 == 0) {
                    break;
                }
                i5 = i;
                i4 = abs2;
            }
            i++;
        }
        this.f325291i.setProgress(i);
    }

    /* renamed from: j */
    public final void mo103173j() {
        Bitmap bitmap = this.f325295n;
        double progress = (double) this.f325290h.getProgress();
        double max = (double) this.f325290h.getMax();
        Double.isNaN(progress);
        Double.isNaN(max);
        int l = m194750l(bitmap, progress / max);
        int measuredWidth = this.f325291i.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = 800;
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float[] fArr = new float[3];
        Color.colorToHSV(l, fArr);
        int[] iArr = new int[3];
        for (int i = 0; i < 3; i++) {
            float[] fArr2 = f325283k[i];
            fArr[1] = fArr2[0];
            fArr[2] = fArr2[1];
            iArr[i] = Color.HSVToColor(fArr);
        }
        float f = (float) measuredWidth;
        LinearGradient linearGradient = new LinearGradient(0.0f, 1.0f, f, 1.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, f, 1.0f, paint);
        this.f325296o = createBitmap;
        int dimension = (int) this.f325293l.getResources().getDimension(R.dimen.color_slider_inset);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new BitmapDrawable(this.f325293l.getResources(), this.f325296o)});
        layerDrawable.setLayerInset(0, 0, dimension, 0, dimension);
        this.f325291i.setProgressDrawable(layerDrawable);
        mo103171g();
    }
}
