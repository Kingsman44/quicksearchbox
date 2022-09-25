package com.airbnb.lottie.p238c.p241c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4826ad;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p237b.C4840b;
import com.airbnb.lottie.p245f.C4947d;
import com.airbnb.lottie.p245f.C4954k;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.c.d */
/* compiled from: PG */
public final class C4880d extends C4878b {

    /* renamed from: h */
    private final Paint f15565h = new C4781a(3);

    /* renamed from: i */
    private final Rect f15566i = new Rect();

    /* renamed from: j */
    private final Rect f15567j = new Rect();

    /* renamed from: k */
    private C4807f f15568k;

    /* renamed from: l */
    private C4807f f15569l;

    public C4880d(C4825ac acVar, C4882f fVar) {
        super(acVar, fVar);
    }

    /* renamed from: p */
    private final Bitmap m13558p() {
        C4840b bVar;
        Context context;
        C4807f fVar = this.f15569l;
        if (fVar != null) {
            C4958c cVar = ((C4822u) fVar).f15301d;
            C4957b bVar2 = cVar.f15746b;
            Bitmap bitmap = (Bitmap) cVar.mo9900a();
            if (bitmap != null) {
                return bitmap;
            }
        }
        String str = this.f15541c.f15575f;
        C4825ac acVar = this.f15540b;
        if (acVar.getCallback() == null) {
            bVar = null;
        } else {
            C4840b bVar3 = acVar.f15347g;
            if (bVar3 != null) {
                Drawable.Callback callback = acVar.getCallback();
                if (callback != null && (callback instanceof View)) {
                    context = ((View) callback).getContext();
                } else {
                    context = null;
                }
                if (!(context == null && bVar3.f15416a == null) && !bVar3.f15416a.equals(context)) {
                    acVar.f15347g = null;
                }
            }
            if (acVar.f15347g == null) {
                acVar.f15347g = new C4840b(acVar.getCallback(), acVar.f15348h, acVar.f15341a.f15754c);
            }
            bVar = acVar.f15347g;
        }
        if (bVar != null) {
            C4826ad adVar = (C4826ad) bVar.f15418c.get(str);
            if (adVar == null) {
                return null;
            }
            Bitmap bitmap2 = adVar.f15361e;
            if (bitmap2 != null) {
                return bitmap2;
            }
            String str2 = adVar.f15360d;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
                try {
                    if (!TextUtils.isEmpty(bVar.f15417b)) {
                        try {
                            Bitmap e = C4954k.m13722e(BitmapFactory.decodeStream(bVar.f15416a.getAssets().open(bVar.f15417b + str2), (Rect) null, options), adVar.f15357a, adVar.f15358b);
                            bVar.mo9796a(str, e);
                            return e;
                        } catch (IllegalArgumentException e2) {
                            C4947d.m13696a("Unable to decode image.", e2);
                            return null;
                        }
                    } else {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                } catch (IOException e3) {
                    C4947d.m13696a("Unable to open asset.", e3);
                    return null;
                }
            } else {
                try {
                    byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    bVar.mo9796a(str, decodeByteArray);
                    return decodeByteArray;
                } catch (IllegalArgumentException e4) {
                    C4947d.m13696a("data URL did not have correct base64 format.", e4);
                    return null;
                }
            }
        } else {
            C4964k kVar = acVar.f15341a;
            C4826ad adVar2 = kVar == null ? null : (C4826ad) kVar.f15754c.get(str);
            if (adVar2 == null) {
                return null;
            }
            return adVar2.f15361e;
        }
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        this.f15545g.mo9754e(obj, cVar);
        if (obj == C4829ag.f15366E) {
            this.f15568k = new C4822u(cVar);
        } else if (obj == C4829ag.f15369H) {
            this.f15569l = new C4822u(cVar);
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        super.mo9716c(rectF, matrix, z);
        Bitmap p = m13558p();
        if (p != null) {
            rectF.set(0.0f, 0.0f, ((float) p.getWidth()) * C4954k.m13718a(), ((float) p.getHeight()) * C4954k.m13718a());
            this.f15539a.mapRect(rectF);
        }
    }

    /* renamed from: i */
    public final void mo9812i(Canvas canvas, Matrix matrix, int i) {
        Bitmap p = m13558p();
        if (p != null && !p.isRecycled()) {
            float a = C4954k.m13718a();
            this.f15565h.setAlpha(i);
            C4807f fVar = this.f15568k;
            if (fVar != null) {
                Paint paint = this.f15565h;
                C4958c cVar = ((C4822u) fVar).f15301d;
                C4957b bVar = cVar.f15746b;
                paint.setColorFilter((ColorFilter) cVar.mo9900a());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f15566i.set(0, 0, p.getWidth(), p.getHeight());
            this.f15567j.set(0, 0, (int) (((float) p.getWidth()) * a), (int) (((float) p.getHeight()) * a));
            canvas.drawBitmap(p, this.f15566i, this.f15567j, this.f15565h);
            canvas.restore();
        }
    }
}
