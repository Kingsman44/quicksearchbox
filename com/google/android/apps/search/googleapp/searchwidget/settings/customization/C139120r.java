package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.SeekBar;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.r */
/* compiled from: PG */
public final class C139120r {

    /* renamed from: g */
    private static final float[][] f378349g = {new float[]{1.0f, 0.2f}, new float[]{1.0f, 1.0f}, new float[]{0.2f, 1.0f}};

    /* renamed from: a */
    public final Context f378350a;

    /* renamed from: b */
    public final C28306ab f378351b;

    /* renamed from: c */
    public final C47770dh f378352c;

    /* renamed from: d */
    public final C139093br f378353d;

    /* renamed from: e */
    public C139080be f378354e;

    /* renamed from: f */
    public Bitmap f378355f = Bitmap.createBitmap(800, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: h */
    private final C139045c f378356h;

    public C139120r(C139117o oVar, C28306ab abVar, C47770dh dhVar, C139045c cVar, C139093br brVar, C139080be beVar) {
        this.f378350a = oVar.getContext();
        this.f378351b = abVar;
        this.f378352c = dhVar;
        this.f378356h = cVar;
        this.f378353d = brVar;
        this.f378354e = beVar;
    }

    /* renamed from: a */
    public static int m225980a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        double d = (double) width;
        double d2 = (double) i;
        double d3 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        int i3 = (int) (d * (d2 / d3));
        int i4 = width - 1;
        if (i3 > i4) {
            i3 = i4;
        }
        return bitmap.getPixel(i3, 0);
    }

    /* renamed from: b */
    public final void mo114741b(int i, SeekBar seekBar) {
        int measuredWidth = seekBar.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = 800;
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        int[] iArr = new int[3];
        for (int i2 = 0; i2 < 3; i2++) {
            float[] fArr2 = f378349g[i2];
            fArr[1] = fArr2[0];
            fArr[2] = fArr2[1];
            iArr[i2] = Color.HSVToColor(fArr);
        }
        float f = (float) measuredWidth;
        LinearGradient linearGradient = new LinearGradient(0.0f, 1.0f, f, 1.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, f, 1.0f, paint);
        this.f378355f = createBitmap;
        int dimension = (int) this.f378350a.getResources().getDimension(R.dimen.googleapp_color_slider_inset);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new BitmapDrawable(this.f378350a.getResources(), this.f378355f)});
        layerDrawable.setLayerInset(0, 0, dimension, 0, dimension);
        seekBar.setProgressDrawable(layerDrawable);
    }

    /* renamed from: c */
    public final void mo114742c(int i) {
        C139074az azVar = this.f378354e.f378255f;
        if (azVar == null) {
            azVar = C139074az.f378227d;
        }
        C139070av avVar = (C139070av) this.f378354e.toBuilder();
        C139073ay ayVar = (C139073ay) azVar.toBuilder();
        C139079bd bdVar = C139079bd.CUSTOM_COLOR;
        ayVar.copyOnWrite();
        C139074az azVar2 = (C139074az) ayVar.instance;
        azVar2.f378230b = bdVar.f378247f;
        azVar2.f378229a |= 1;
        ayVar.copyOnWrite();
        C139074az azVar3 = (C139074az) ayVar.instance;
        azVar3.f378229a |= 2;
        azVar3.f378231c = i;
        avVar.copyOnWrite();
        C139080be beVar = (C139080be) avVar.instance;
        C139074az azVar4 = (C139074az) ayVar.build();
        azVar4.getClass();
        beVar.f378255f = azVar4;
        beVar.f378250a |= 16;
        C139080be beVar2 = (C139080be) avVar.build();
        this.f378354e = beVar2;
        this.f378356h.mo114666a(beVar2);
    }
}
