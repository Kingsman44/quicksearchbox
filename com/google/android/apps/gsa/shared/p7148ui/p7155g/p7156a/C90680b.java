package com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1936i;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a.b */
/* compiled from: PG */
final class C90680b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ ImageView f253576a;

    /* renamed from: b */
    final /* synthetic */ Context f253577b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f253578c;

    /* renamed from: d */
    final /* synthetic */ Drawable f253579d;

    /* renamed from: e */
    final /* synthetic */ String f253580e;

    public C90680b(ImageView imageView, Context context, AtomicBoolean atomicBoolean, Drawable drawable, String str) {
        this.f253576a = imageView;
        this.f253577b = context;
        this.f253578c = atomicBoolean;
        this.f253579d = drawable;
        this.f253580e = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C90682d.m148050b(this.f253576a, this.f253579d);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            try {
                ImageView imageView = this.f253576a;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    if (drawable.getIntrinsicWidth() > 0) {
                        if (drawable.getIntrinsicHeight() > 0) {
                            bitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap2);
                            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawable.draw(canvas);
                            bitmap = bitmap2;
                        }
                    }
                    bitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap2);
                    drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
                    drawable.draw(canvas2);
                    bitmap = bitmap2;
                }
                C1936i iVar = new C1936i(this.f253577b.getResources(), bitmap);
                iVar.mo5083d();
                imageView.setImageDrawable(iVar);
                this.f253578c.set(true);
            } catch (Exception unused) {
                ((C59052c) ((C59052c) C90682d.f253584a.mo56225c()).mo56372aa(11302)).mo56389s("Failed when loading url : %s", this.f253580e);
                C90682d.m148050b(this.f253576a, this.f253579d);
            }
        } else {
            C90682d.m148050b(this.f253576a, this.f253579d);
        }
    }
}
