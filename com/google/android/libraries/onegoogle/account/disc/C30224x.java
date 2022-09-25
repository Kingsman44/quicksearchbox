package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.p2378b.C30811a;
import com.google.android.libraries.onegoogle.p2378b.C30827d;
import com.google.android.libraries.onegoogle.p2378b.C30828e;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4522b.C58485gu;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.x */
/* compiled from: PG */
final class C30224x {

    /* renamed from: a */
    public final WeakReference f81702a;

    /* renamed from: b */
    public final Object f81703b;

    /* renamed from: c */
    public final C30828e f81704c;

    /* renamed from: d */
    public final C30158c f81705d;

    /* renamed from: e */
    public boolean f81706e;

    /* renamed from: f */
    private final Executor f81707f;

    /* renamed from: a */
    public final Bitmap mo35693a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        C58485gu guVar = ((C30811a) this.f81704c).f83139c;
        if (guVar != null && !guVar.isEmpty()) {
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C30827d dVar = C30827d.f83167a;
                if (((C30827d) guVar.get(i)).ordinal() == 0) {
                    Map map = C30225y.f81708a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int min = Math.min(width, height);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    float f = (float) (min / 2);
                    canvas.drawCircle(f, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (float) ((min - width) / 2), (float) ((min - height) / 2), paint);
                    bitmap = createBitmap;
                }
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public final void mo35694b() {
        C19559g.m37304c();
        ImageView imageView = (ImageView) this.f81702a.get();
        if (!this.f81706e && imageView != null) {
            C30225y.m56158c(imageView, (C30224x) null);
        }
    }

    /* renamed from: c */
    public final void mo35695c(Runnable runnable) {
        if (C19559g.m37305d(Thread.currentThread())) {
            this.f81707f.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: d */
    public final void mo35696d(Drawable drawable, boolean z) {
        ImageView imageView = (ImageView) this.f81702a.get();
        if (!this.f81706e && imageView != null) {
            C30223w wVar = new C30223w(this, drawable, z);
            imageView.addOnAttachStateChangeListener(wVar);
            if (C2043bi.m5569aw(imageView)) {
                imageView.post(new C30217q(wVar, imageView));
            }
        }
    }

    public C30224x(Object obj, C30828e eVar, ImageView imageView, Executor executor, C30158c cVar) {
        imageView.getClass();
        this.f81702a = new WeakReference(imageView);
        this.f81704c = eVar;
        this.f81703b = obj;
        this.f81707f = executor;
        this.f81705d = cVar;
    }
}
