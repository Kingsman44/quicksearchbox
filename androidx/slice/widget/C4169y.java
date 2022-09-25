package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4094a;
import com.google.android.googlequicksearchbox.R;
import java.util.Set;

/* renamed from: androidx.slice.widget.y */
/* compiled from: PG */
public final class C4169y extends C4129ag {

    /* renamed from: a */
    private C4154j f13482a;

    /* renamed from: b */
    private SliceItem f13483b;

    /* renamed from: c */
    private IconCompat f13484c;

    /* renamed from: d */
    private Set f13485d;

    /* renamed from: e */
    private final int f13486e;

    /* renamed from: f */
    private final int f13487f;

    public C4169y(Context context) {
        super(context);
        Resources resources = getResources();
        this.f13487f = resources.getDimensionPixelSize(R.dimen.abc_slice_icon_size);
        this.f13486e = resources.getDimensionPixelSize(R.dimen.abc_slice_shortcut_size);
    }

    /* renamed from: f */
    public final void mo8642f() {
        this.f13482a = null;
        this.f13483b = null;
        this.f13484c = null;
        setBackground((Drawable) null);
        removeAllViews();
    }

    /* renamed from: fq */
    public final Set mo8698fq() {
        return this.f13485d;
    }

    /* renamed from: ft */
    public final void mo8701ft(Set set) {
        this.f13485d = set;
    }

    /* renamed from: fx */
    public final void mo8705fx(C4154j jVar) {
        ImageView.ScaleType scaleType;
        mo8642f();
        this.f13482a = jVar;
        if (jVar != null) {
            C4094a c = jVar.mo8744c(getContext());
            this.f13483b = c.f13106a;
            this.f13484c = c.f13107b;
            boolean z = c.f13108c == 0;
            SliceItem sliceItem = this.f13482a.f13269n;
            int a = sliceItem != null ? sliceItem.mo8593a() : -1;
            if (a == -1) {
                a = C4144av.m11881a(getContext(), 16843829);
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            C1929b.m5225f(shapeDrawable, a);
            ImageView imageView = new ImageView(getContext());
            if (this.f13484c != null && z) {
                imageView.setBackground(shapeDrawable);
            }
            addView(imageView);
            if (this.f13484c != null) {
                int i = z ? this.f13487f : this.f13486e;
                Context context = getContext();
                IconCompat iconCompat = this.f13484c;
                boolean z2 = !z;
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageDrawable(iconCompat.mo5075d(context));
                if (z2) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = ImageView.ScaleType.CENTER_INSIDE;
                }
                imageView2.setScaleType(scaleType);
                addView(imageView2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
                if (z2) {
                    Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    imageView2.layout(0, 0, i, i);
                    imageView2.draw(canvas);
                    imageView2.setImageBitmap(C4144av.m11882b(createBitmap));
                } else {
                    imageView2.setColorFilter(-1);
                }
                layoutParams.width = i;
                layoutParams.height = i;
                layoutParams.gravity = 17;
                setClickable(true);
            } else {
                setClickable(false);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.gravity = 17;
            setLayoutParams(layoutParams2);
        }
    }

    public final boolean performClick() {
        if (this.f13482a == null) {
            return false;
        }
        if (!callOnClick()) {
            try {
                SliceItem sliceItem = this.f13483b;
                if (sliceItem != null) {
                    sliceItem.mo8599g((Context) null, (Intent) null);
                    C4141as asVar = this.f13256o;
                    if (asVar != null) {
                        C4147c cVar = new C4147c(3, 1, -1, 0);
                        SliceItem sliceItem2 = this.f13483b;
                        if (sliceItem2 == null) {
                            sliceItem2 = this.f13482a.f13268m;
                        }
                        asVar.mo8726b(cVar, sliceItem2);
                    }
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("ShortcutView", "PendingIntent for slice cannot be sent", e);
            }
        }
        return true;
    }
}
