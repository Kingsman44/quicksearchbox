package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22823b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65924b;
import com.google.protos.p5146w.p5147a.p5148a.C65927e;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ImageViewerPage */
/* compiled from: PG */
public class ImageViewerPage extends ScrollView {

    /* renamed from: A */
    private ImageView f285439A;

    /* renamed from: B */
    private View f285440B;

    /* renamed from: C */
    private View f285441C;

    /* renamed from: D */
    private int f285442D;

    /* renamed from: E */
    private float f285443E;

    /* renamed from: F */
    private float f285444F;

    /* renamed from: G */
    private float f285445G;

    /* renamed from: H */
    private float f285446H = 1.0f;

    /* renamed from: I */
    private Matrix f285447I = new Matrix();

    /* renamed from: J */
    private float f285448J = 0.0f;

    /* renamed from: K */
    private float f285449K = 0.0f;

    /* renamed from: L */
    private boolean f285450L = false;

    /* renamed from: M */
    private boolean f285451M = false;

    /* renamed from: N */
    private float f285452N = 0.0f;

    /* renamed from: O */
    private final C22823b f285453O = new C22823b(new C102307ag(this));

    /* renamed from: a */
    public C102374p f285454a;

    /* renamed from: b */
    public C65930h f285455b;

    /* renamed from: c */
    public ActionsOverlay f285456c;

    /* renamed from: d */
    public DetailsView f285457d;

    /* renamed from: e */
    public ImageView f285458e;

    /* renamed from: f */
    public RelatedContentHeader f285459f;

    /* renamed from: g */
    public View f285460g;

    /* renamed from: h */
    public ImageView f285461h;

    /* renamed from: i */
    public View f285462i;

    /* renamed from: j */
    public View f285463j;

    /* renamed from: k */
    public int f285464k;

    /* renamed from: l */
    public int f285465l;

    /* renamed from: m */
    public int f285466m;

    /* renamed from: n */
    public float f285467n;

    /* renamed from: o */
    public float f285468o = 0.0f;

    /* renamed from: p */
    public float f285469p = 0.0f;

    /* renamed from: q */
    public float f285470q = 1.0f;

    /* renamed from: r */
    public boolean f285471r = false;

    /* renamed from: s */
    public C65949b f285472s;

    /* renamed from: t */
    public final Runnable f285473t = new C102384z(this);

    /* renamed from: u */
    public ValueAnimator f285474u;

    /* renamed from: v */
    public ValueAnimator f285475v;

    /* renamed from: w */
    public ValueAnimator f285476w;

    /* renamed from: x */
    public final DecelerateInterpolator f285477x = new DecelerateInterpolator();

    /* renamed from: y */
    public final AccelerateDecelerateInterpolator f285478y = new AccelerateDecelerateInterpolator();

    /* renamed from: z */
    public final ArgbEvaluator f285479z = new ArgbEvaluator();

    public ImageViewerPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public static String m169571c(String str) {
        return str.startsWith("//") ? "http:".concat(String.valueOf(str)) : str;
    }

    /* renamed from: o */
    private final float m169572o() {
        return ((float) this.f285442D) * this.f285470q;
    }

    /* renamed from: p */
    private final C91196ba m169573p(C65928f fVar) {
        int i = true != this.f285454a.f285691m ? 2048 : 512;
        C91193ay q = C91196ba.m149039q();
        C91222n nVar = (C91222n) q;
        nVar.f254620a = m169571c(fVar.f179296b);
        nVar.f254621b = new Size(Math.min(fVar.f179298d, i), Math.min(fVar.f179297c, i));
        return q.mo85445c();
    }

    /* renamed from: q */
    private final void m169574q() {
        float[] fArr = {0.0f, 0.0f};
        this.f285447I.mapPoints(fArr);
        this.f285443E = fArr[0];
        this.f285467n = fArr[1];
        int i = this.f285466m;
        float f = this.f285446H;
        float[] fArr2 = {((float) i) / f, ((float) this.f285442D) / f};
        this.f285447I.mapPoints(fArr2);
        this.f285444F = fArr2[0];
        this.f285445G = fArr2[1];
    }

    /* renamed from: a */
    public final float mo93071a() {
        return this.f285454a.f285689k ? (float) getHeight() : this.f285452N;
    }

    /* renamed from: b */
    public final int mo93072b() {
        if (this.f285454a.f285689k) {
            return getResources().getColor(R.color.monet_viewer_fullscreen_background);
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo93073d() {
        int i;
        float width = (float) getWidth();
        if (this.f285454a.f285689k) {
            i = getHeight();
        } else {
            i = (int) (((float) getHeight()) * 0.8f);
        }
        float f = (float) i;
        double height = (double) getHeight();
        Double.isNaN(height);
        float f2 = (float) (height * 0.2d);
        float f3 = width / ((float) this.f285464k);
        this.f285446H = f3;
        int i2 = (int) width;
        this.f285466m = i2;
        int i3 = (int) (((float) this.f285465l) * f3);
        this.f285442D = i3;
        float f4 = (float) i3;
        if (f4 > f) {
            float f5 = f / f4;
            this.f285442D = (int) f;
            this.f285466m = (int) (((float) i2) * f5);
            this.f285446H = f3 * f5;
        }
        this.f285448J = ((float) (getWidth() - this.f285466m)) / 2.0f;
        int height2 = getHeight();
        int i4 = this.f285442D;
        float f6 = (float) ((height2 - i4) / 2);
        float max = Math.max(0.0f, (f2 - ((float) i4)) / 2.0f);
        if (true != this.f285454a.f285689k) {
            f6 = max;
        }
        this.f285449K = f6;
        this.f285452N = Math.max((float) this.f285442D, f2);
        this.f285456c.getLayoutParams().height = (int) this.f285452N;
        this.f285456c.requestLayout();
        this.f285457d.setPadding(0, (int) this.f285452N, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo93074e() {
        float f = getResources().getDisplayMetrics().density;
        RelatedContentHeader relatedContentHeader = this.f285459f;
        if (relatedContentHeader != null) {
            relatedContentHeader.f285503b.f285437c = (int) (((float) getWidth()) / f);
            C65949b bVar = this.f285472s;
            if (bVar != null) {
                RelatedContentHeader relatedContentHeader2 = this.f285459f;
                if (relatedContentHeader2.f285508g == null) {
                    relatedContentHeader2.f285508g = bVar;
                    relatedContentHeader2.post(new C102335bh(relatedContentHeader2, bVar));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo93075f() {
        Object obj;
        Object obj2;
        if (!this.f285451M) {
            boolean z = true;
            this.f285451M = true;
            C65930h hVar = this.f285455b;
            C62940bt r2 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r2);
            boolean o = hVar.f169962ag.mo58857o(r2.f169971d);
            C91196ba baVar = null;
            if (o) {
                C65930h hVar2 = this.f285455b;
                C62940bt r3 = C62942bv.checkIsLite(C65937o.f179333l);
                hVar2.mo58887l(r3);
                Object l = hVar2.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj2 = r3.f169969b;
                } else {
                    obj2 = r3.mo58889c(l);
                }
                String str = ((C65937o) obj2).f179342h;
                if (!str.isEmpty()) {
                    C65927e eVar = (C65927e) C65928f.f179293f.createBuilder();
                    eVar.copyOnWrite();
                    C65928f fVar = (C65928f) eVar.instance;
                    str.getClass();
                    fVar.f179295a |= 1;
                    fVar.f179296b = str;
                    C65928f fVar2 = this.f285455b.f179304c;
                    if (fVar2 == null) {
                        fVar2 = C65928f.f179293f;
                    }
                    int i = fVar2.f179298d;
                    eVar.copyOnWrite();
                    C65928f fVar3 = (C65928f) eVar.instance;
                    fVar3.f179295a |= 4;
                    fVar3.f179298d = (int) (((float) i) * 2.5f);
                    C65928f fVar4 = this.f285455b.f179304c;
                    if (fVar4 == null) {
                        fVar4 = C65928f.f179293f;
                    }
                    int i2 = fVar4.f179297c;
                    eVar.copyOnWrite();
                    C65928f fVar5 = (C65928f) eVar.instance;
                    fVar5.f179295a |= 2;
                    fVar5.f179297c = (int) (((float) i2) * 2.5f);
                    baVar = m169573p((C65928f) eVar.build());
                }
            }
            if (baVar == null) {
                C65928f fVar6 = this.f285455b.f179305d;
                if (fVar6 == null) {
                    fVar6 = C65928f.f179293f;
                }
                if (!fVar6.f179296b.isEmpty()) {
                    if (!this.f285454a.f285689k) {
                        C65930h hVar3 = this.f285455b;
                        C65928f fVar7 = hVar3.f179305d;
                        int i3 = (fVar7 == null ? C65928f.f179293f : fVar7).f179298d;
                        if (fVar7 == null) {
                            fVar7 = C65928f.f179293f;
                        }
                        int i4 = i3 * fVar7.f179297c;
                        C62940bt r22 = C62942bv.checkIsLite(C65924b.f179284e);
                        hVar3.mo58887l(r22);
                        if (hVar3.f169962ag.mo58857o(r22.f169971d)) {
                            C65930h hVar4 = this.f285455b;
                            C62940bt r23 = C62942bv.checkIsLite(C65924b.f179284e);
                            hVar4.mo58887l(r23);
                            Object l2 = hVar4.f169962ag.mo58854l(r23.f169971d);
                            if (l2 == null) {
                                obj = r23.f169969b;
                            } else {
                                obj = r23.mo58889c(l2);
                            }
                            C65924b bVar = (C65924b) obj;
                            if ((bVar.f179286a & 4) != 0) {
                                long a = C102369k.m169696a(bVar.f179288c);
                                long j = true != this.f285454a.f285691m ? 5242880 : 2097152;
                                if (a <= 0 || a > j) {
                                    z = false;
                                }
                            }
                        }
                        if (i4 > 4194304 || !z) {
                            return;
                        }
                    }
                    C65928f fVar8 = this.f285455b.f179305d;
                    if (fVar8 == null) {
                        fVar8 = C65928f.f179293f;
                    }
                    baVar = m169573p(fVar8);
                } else {
                    return;
                }
            }
            C102374p pVar = this.f285454a;
            pVar.f285683e.mo28211k(pVar.f285680b.mo85420h(baVar, this.f285458e), "Full size image load callback", new C102315ao(this));
        }
    }

    /* renamed from: g */
    public final void mo93076g(int i) {
        View view = this.f285454a.f285687i;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: h */
    public final void mo93077h(boolean z) {
        ImageView imageView;
        if (z) {
            imageView = this.f285458e;
        } else {
            imageView = this.f285461h;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return;
        }
        if (z || !this.f285450L) {
            this.f285450L = z;
            this.f285439A.setVisibility(4);
            ImageView imageView2 = z ? this.f285458e : this.f285461h;
            this.f285439A = imageView2;
            imageView2.setVisibility(0);
            this.f285464k = drawable.getIntrinsicWidth();
            this.f285465l = drawable.getIntrinsicHeight();
            mo93073d();
            Matrix matrix = new Matrix();
            this.f285447I = matrix;
            float f = this.f285446H * this.f285470q;
            matrix.setScale(f, f);
            this.f285447I.postTranslate(this.f285443E, this.f285467n);
            this.f285439A.setImageMatrix(this.f285447I);
            mo93080k(false);
            mo93079j();
            this.f285439A.invalidate();
            if (z) {
                ImageView imageView3 = this.f285458e;
                Context context = getContext();
                if (C102362d.f285661a == null) {
                    Bitmap createBitmap = Bitmap.createBitmap(80, 80, Bitmap.Config.ARGB_8888);
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(578254711);
                    Paint paint2 = new Paint();
                    paint2.setColor(-1);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawRect(0.0f, 0.0f, 80.0f, 80.0f, paint2);
                    Rect rect = new Rect(0, 0, 40, 40);
                    canvas.drawRect(rect, paint);
                    rect.offset(40, 40);
                    canvas.drawRect(rect, paint);
                    C102362d.f285661a = new BitmapDrawable(context.getResources(), createBitmap);
                    C102362d.f285661a.setTileModeX(Shader.TileMode.REPEAT);
                    C102362d.f285661a.setTileModeY(Shader.TileMode.REPEAT);
                }
                imageView3.setBackground(C102362d.f285661a);
            }
        }
    }

    /* renamed from: i */
    public final void mo93078i() {
        int height = getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f285467n, (((float) height) - m169572o()) / 2.0f});
        ofFloat.setDuration(175);
        ofFloat.setInterpolator(this.f285477x);
        ofFloat.addUpdateListener(new C102317aq(this));
        ofFloat.start();
    }

    /* renamed from: j */
    public final void mo93079j() {
        m169574q();
        Rect rect = new Rect();
        new RectF(this.f285443E, this.f285467n, this.f285444F, this.f285445G).round(rect);
        C2043bi.m5547aa(this.f285439A, rect);
    }

    /* renamed from: k */
    public final boolean mo93080k(boolean z) {
        float f;
        float f2;
        ValueAnimator valueAnimator = this.f285476w;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            return false;
        }
        m169574q();
        float f3 = (float) this.f285466m;
        float max = Math.max(0.0f, this.f285448J - (((this.f285470q * f3) - f3) / 2.0f));
        float f4 = (float) this.f285442D;
        float max2 = Math.max(0.0f, this.f285449K - (((this.f285470q * f4) - f4) / 2.0f));
        float max3 = Math.max(0.0f, this.f285443E - max);
        float max4 = Math.max(0.0f, (((float) getWidth()) - this.f285444F) - max);
        float max5 = Math.max(0.0f, this.f285467n - max2);
        if (this.f285454a.f285689k) {
            f = ((float) getHeight()) - max2;
            f2 = this.f285445G;
        } else {
            f = this.f285452N - max2;
            f2 = this.f285445G;
        }
        float max6 = Math.max(0.0f, f - f2);
        float f5 = max4 - max3;
        this.f285447I.postTranslate(f5, 0.0f);
        this.f285439A.setImageMatrix(this.f285447I);
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, max6 - max5});
            this.f285476w = ofFloat;
            ofFloat.setDuration(175);
            this.f285476w.setInterpolator(this.f285477x);
            this.f285476w.addUpdateListener(new C102316ap(this));
            this.f285476w.start();
        } else {
            this.f285447I.postTranslate(0.0f, max6 - max5);
            this.f285439A.setImageMatrix(this.f285447I);
        }
        mo93079j();
        if (Math.abs(f5) <= 0.0f || Math.abs(max6 - max5) <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo93081l() {
        return m169572o() < ((float) getHeight());
    }

    /* renamed from: m */
    public final boolean mo93082m(float f, float f2, float f3) {
        if (f > 1.0f && this.f285470q * this.f285446H > 8.0f) {
            return false;
        }
        this.f285470q *= f;
        this.f285447I.postScale(f, f, f2, f3);
        if (f < 1.0f && this.f285470q < 1.0f) {
            Matrix matrix = this.f285447I;
            float f4 = this.f285446H;
            matrix.setScale(f4, f4);
            this.f285470q = 1.0f;
        }
        if (!this.f285454a.f285689k) {
            this.f285440B.setAlpha(Math.min(0.75f, this.f285470q - 4.0f));
        }
        this.f285468o = f2;
        this.f285469p = f3;
        this.f285439A.setImageMatrix(this.f285447I);
        mo93080k(false);
        this.f285439A.invalidate();
        return true;
    }

    /* renamed from: n */
    public final boolean mo93083n(float f, float f2) {
        this.f285447I.postTranslate(-f, -f2);
        if (!mo93080k(false)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C65928f fVar = this.f285455b.f179304c;
        if (fVar == null) {
            fVar = C65928f.f179293f;
        }
        if (!fVar.f179296b.isEmpty()) {
            C102374p pVar = this.f285454a;
            C22871g gVar = pVar.f285683e;
            C91189au auVar = pVar.f285680b;
            C65928f fVar2 = this.f285455b.f179304c;
            if (fVar2 == null) {
                fVar2 = C65928f.f179293f;
            }
            gVar.mo28211k(auVar.mo85420h(m169573p(fVar2), this.f285461h), "Thumbnail load callback", new C102313am(this));
        }
        if (this.f285454a.f285689k) {
            mo93075f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f285458e.setBackground((Drawable) null);
        this.f285454a.f285680b.mo85429s(this.f285458e);
        this.f285450L = false;
        this.f285451M = false;
        mo93077h(false);
        this.f285454a.f285680b.mo85429s(this.f285461h);
        RelatedContentHeader relatedContentHeader = this.f285459f;
        if (relatedContentHeader.f285509h) {
            relatedContentHeader.f285502a.setVisibility(8);
            LinearLayout linearLayout = relatedContentHeader.f285504c;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            for (ImageView s : relatedContentHeader.f285510i.keySet()) {
                relatedContentHeader.f285505d.f285680b.mo85429s(s);
            }
            relatedContentHeader.f285509h = false;
            relatedContentHeader.mo93096a();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnTouchListener(this.f285453O);
        this.f285456c = (ActionsOverlay) findViewById(R.id.actions_overlay_container);
        this.f285457d = (DetailsView) findViewById(R.id.image_viewer_details);
        this.f285440B = findViewById(R.id.image_viewer_details_shade);
        this.f285441C = findViewById(R.id.image_viewer_images_frame);
        this.f285458e = (ImageView) findViewById(R.id.image_viewer_original_image);
        this.f285459f = (RelatedContentHeader) findViewById(R.id.image_viewer_related_content);
        this.f285461h = (ImageView) findViewById(R.id.image_viewer_page_thumbnail);
        this.f285441C.setOnTouchListener(new C102319as(this));
        int i = getResources().getDisplayMetrics().heightPixels;
        this.f285461h.getLayoutParams().height = i;
        this.f285458e.getLayoutParams().height = i;
        this.f285439A = this.f285461h;
        C102374p.m169702b(this.f285440B);
        C102374p.m169702b(this.f285461h);
        C102374p.m169702b(this.f285441C);
        this.f285460g = this.f285457d.findViewById(R.id.image_viewer_share_save_layout);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.99f, 0.5f});
        this.f285474u = ofFloat;
        ofFloat.setDuration(350);
        this.f285474u.setInterpolator(this.f285478y);
        this.f285474u.addUpdateListener(new C102383y(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.01f, 1.15f});
        this.f285475v = ofFloat2;
        ofFloat2.setDuration(175);
        this.f285475v.setInterpolator(this.f285478y);
        this.f285475v.addListener(new C102308ah(this));
        ActionsOverlay actionsOverlay = this.f285456c;
        C28292j jVar = new C28292j(38360);
        jVar.mo33794h(2);
        C28295m.m52919e(actionsOverlay, jVar);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f285453O.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C102374p pVar = this.f285454a;
        if (!pVar.f285693o && i2 > i4) {
            pVar.f285686h.mo93141h(this.f285459f, 22, (String) null, (String) null);
            pVar.f285693o = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f285461h.getLayoutParams().height = getHeight();
        this.f285458e.getLayoutParams().height = getHeight();
        requestLayout();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f285454a.f285689k && super.onTouchEvent(motionEvent);
    }
}
