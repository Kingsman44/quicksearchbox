package android.support.p033v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C1938k;

/* renamed from: android.support.v7.widget.am */
/* compiled from: PG */
class C0515am {

    /* renamed from: b */
    private static final int[] f2064b = {16843067, 16843068};

    /* renamed from: a */
    public Bitmap f2065a;

    /* renamed from: c */
    private final ProgressBar f2066c;

    public C0515am(ProgressBar progressBar) {
        this.f2066c = progressBar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo2511a(Drawable drawable, boolean z) {
        if (drawable instanceof C1938k) {
            C1938k kVar = (C1938k) drawable;
            Drawable a = kVar.mo5095a();
            if (a != null) {
                mo2511a(a, z);
                kVar.mo5096b();
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = mo2511a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2065a == null) {
                this.f2065a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: b */
    public void mo2512b(AttributeSet attributeSet, int i) {
        C0735ip f = C0735ip.m2473f(this.f2066c.getContext(), attributeSet, f2064b, i, 0);
        Drawable c = f.mo3247c(0);
        if (c != null) {
            ProgressBar progressBar = this.f2066c;
            if (c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a = mo2511a(animationDrawable.getFrame(i2), true);
                    a.setLevel(10000);
                    animationDrawable2.addFrame(a, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                c = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(c);
        }
        Drawable c2 = f.mo3247c(1);
        if (c2 != null) {
            this.f2066c.setProgressDrawable(mo2511a(c2, false));
        }
        f.f2596b.recycle();
    }
}
