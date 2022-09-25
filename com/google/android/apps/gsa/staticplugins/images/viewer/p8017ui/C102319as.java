package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65935m;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.as */
/* compiled from: PG */
final class C102319as extends C102372n {

    /* renamed from: g */
    boolean f285560g = false;

    /* renamed from: h */
    boolean f285561h = false;

    /* renamed from: i */
    final /* synthetic */ ImageViewerPage f285562i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102319as(ImageViewerPage imageViewerPage) {
        super(imageViewerPage.getContext());
        this.f285562i = imageViewerPage;
    }

    /* renamed from: a */
    public final boolean mo93120a(float f, float f2) {
        this.f285560g = true;
        ImageViewerPage imageViewerPage = this.f285562i;
        if (imageViewerPage.f285470q == 1.0f) {
            imageViewerPage.f285475v.addUpdateListener(new C102380v(imageViewerPage, f, f2));
            imageViewerPage.f285475v.start();
            if (this.f285562i.getScrollY() > 0) {
                this.f285562i.smoothScrollTo(0, 0);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo93121b(float f, float f2, float f3) {
        if (this.f285562i.f285456c.getVisibility() == 0) {
            return false;
        }
        return this.f285562i.mo93082m(f, f2, f3);
    }

    /* renamed from: c */
    public final boolean mo93122c(float f, float f2) {
        ValueAnimator valueAnimator = this.f285562i.f285476w;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            return false;
        }
        ImageViewerPage imageViewerPage = this.f285562i;
        int i = imageViewerPage.f285466m;
        float f3 = imageViewerPage.f285470q;
        int width = imageViewerPage.getWidth();
        ImageViewerPage imageViewerPage2 = this.f285562i;
        if (((float) i) * f3 <= ((float) width)) {
            f = 0.0f;
        }
        return imageViewerPage2.mo93083n(f, f2);
    }

    /* renamed from: d */
    public final boolean mo93123d() {
        ImageViewerPage imageViewerPage = this.f285562i;
        if (imageViewerPage.f285470q == 1.0f && !this.f285561h && !imageViewerPage.f285471r && imageViewerPage.f285454a.f285690l) {
            C65930h hVar = imageViewerPage.f285455b;
            C62940bt r1 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r1);
            if (hVar.f169962ag.mo58857o(r1.f169971d)) {
                ImageViewerPage imageViewerPage2 = this.f285562i;
                imageViewerPage2.f285456c.setVisibility(0);
                C102359ce.m169678a(imageViewerPage2.f285456c);
                C102374p.m169702b(imageViewerPage2.f285456c);
                imageViewerPage2.f285456c.animate().alpha(1.0f).setDuration(150).setInterpolator(imageViewerPage2.f285478y).start();
                imageViewerPage2.f285460g.animate().alpha(0.0f).setDuration(150).withEndAction(new C102382x(imageViewerPage2)).setInterpolator(imageViewerPage2.f285478y).start();
            }
        }
        this.f285561h = false;
        this.f285562i.f285471r = false;
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        ImageViewerPage imageViewerPage = this.f285562i;
        AlertDialog.Builder builder = imageViewerPage.f285454a.f285684f;
        if (!this.f285560g && imageViewerPage.f285456c.getVisibility() != 0) {
            ImageViewerPage imageViewerPage2 = this.f285562i;
            if (imageViewerPage2.f285454a.f285690l) {
                C65930h hVar = imageViewerPage2.f285455b;
                C62940bt r2 = C62942bv.checkIsLite(C65935m.f179324d);
                hVar.mo58887l(r2);
                if (!hVar.f169962ag.mo58857o(r2.f169971d) && motionEvent.getY() <= this.f285562i.mo93071a()) {
                    this.f285562i.requestDisallowInterceptTouchEvent(true);
                    ArrayList arrayList = new ArrayList(Arrays.asList(this.f285562i.getResources().getStringArray(R.array.images_viewer_longpress_menu_options)));
                    C65928f fVar = this.f285562i.f285455b.f179305d;
                    if (fVar == null) {
                        fVar = C65928f.f179293f;
                    }
                    if (!ImageViewerPage.m169571c(fVar.f179296b).toLowerCase(Locale.getDefault()).startsWith("http")) {
                        arrayList.remove(this.f285562i.getResources().getString(R.string.images_longpress_menu_download));
                    }
                    AlertDialog create = builder.setTitle(this.f285562i.getContext().getString(C102346bs.m169661a())).setItems((CharSequence[]) arrayList.toArray(new String[0]), new C102318ar(this, arrayList)).create();
                    Window window = create.getWindow();
                    if (window != null) {
                        window.addFlags(2);
                        window.setDimAmount(0.5f);
                    }
                    try {
                        create.show();
                        C102331bd bdVar = this.f285562i.f285454a.f285685g;
                        bdVar.f285593a.mo93134a(bdVar.f285594b);
                    } catch (WindowManager.BadTokenException unused) {
                    }
                }
            }
        }
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f285560g = true;
        this.f285562i.f285474u.cancel();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ImageViewerPage imageViewerPage = this.f285562i;
        if (!imageViewerPage.f285454a.f285689k) {
            return;
        }
        if (imageViewerPage.mo93081l()) {
            this.f285562i.mo93078i();
        } else {
            this.f285562i.mo93080k(true);
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ImageViewerPage imageViewerPage = this.f285562i;
        if (imageViewerPage.f285470q > 1.0f) {
            imageViewerPage.f285474u.start();
            this.f285561h = true;
        } else if (imageViewerPage.f285456c.getVisibility() == 0) {
            ImageViewerPage imageViewerPage2 = this.f285562i;
            if (imageViewerPage2.f285456c.getVisibility() != 8) {
                imageViewerPage2.f285456c.animate().alpha(0.0f).setDuration(150).withEndAction(new C102381w(imageViewerPage2)).setInterpolator(imageViewerPage2.f285478y).start();
                imageViewerPage2.f285460g.setVisibility(0);
                imageViewerPage2.f285460g.animate().alpha(1.0f).setDuration(150).setInterpolator(imageViewerPage2.f285478y).start();
            }
            this.f285562i.f285471r = true;
        }
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f285676f.cancel();
        }
        this.f285672b.onTouchEvent(motionEvent);
        this.f285671a.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f285560g) {
            ImageViewerPage imageViewerPage = this.f285562i;
            if (imageViewerPage.f285470q < 1.6f && !imageViewerPage.f285475v.isRunning() && !this.f285562i.f285474u.isRunning()) {
                this.f285562i.f285474u.start();
            }
            this.f285560g = false;
        }
        boolean z = motionEvent.getPointerCount() > 1;
        boolean z2 = motionEvent.getY() <= this.f285562i.mo93071a();
        ImageViewerPage imageViewerPage2 = this.f285562i;
        float f = imageViewerPage2.f285470q;
        if (z2 && z && imageViewerPage2.getScrollY() > 0 && this.f285562i.f285456c.getVisibility() != 0) {
            this.f285562i.smoothScrollTo(0, 0);
        }
        if (!z && f <= 1.0f) {
            return z2;
        }
        this.f285562i.requestDisallowInterceptTouchEvent(true);
        return true;
    }
}
