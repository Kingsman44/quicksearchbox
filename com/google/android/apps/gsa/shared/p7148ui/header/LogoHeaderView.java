package com.google.android.apps.gsa.shared.p7148ui.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.search.doodle.C90496b;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a.C93993q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.LogoHeaderView */
/* compiled from: PG */
public class LogoHeaderView extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: A */
    private boolean f253626A;

    /* renamed from: B */
    private boolean f253627B;

    /* renamed from: C */
    private final C90696i f253628C;

    /* renamed from: a */
    public final ValueAnimator f253629a;

    /* renamed from: b */
    public final ValueAnimator f253630b;

    /* renamed from: c */
    final int f253631c;

    /* renamed from: d */
    public final List f253632d;

    /* renamed from: e */
    public View f253633e;

    /* renamed from: f */
    public ImageView f253634f;

    /* renamed from: g */
    public BitmapDrawable f253635g;

    /* renamed from: h */
    int f253636h;

    /* renamed from: i */
    int f253637i;

    /* renamed from: j */
    public C90496b f253638j;

    /* renamed from: k */
    public boolean f253639k;

    /* renamed from: l */
    public int f253640l;

    /* renamed from: m */
    public boolean f253641m;

    /* renamed from: n */
    public boolean f253642n;

    /* renamed from: o */
    public boolean f253643o;

    /* renamed from: p */
    public float f253644p;

    /* renamed from: q */
    public float f253645q;

    /* renamed from: r */
    private final int f253646r;

    /* renamed from: s */
    private C90694g f253647s;

    /* renamed from: t */
    private View f253648t;

    /* renamed from: u */
    private LayerDrawable f253649u;

    /* renamed from: v */
    private int f253650v;

    /* renamed from: w */
    private int f253651w;

    /* renamed from: x */
    private Rect f253652x;

    /* renamed from: y */
    private int f253653y;

    /* renamed from: z */
    private boolean f253654z;

    public LogoHeaderView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: h */
    private final void m148071h() {
        if (this.f253633e == null) {
            View inflate = ((ViewStub) findViewById(true != this.f253641m ? R.id.logo_header_logo_view_stub : R.id.logo_header_white_logo_stub)).inflate();
            inflate.getClass();
            this.f253633e = inflate;
            C28295m.m52919e(inflate, new C28292j(53));
        }
    }

    /* renamed from: a */
    public final int mo84995a() {
        return Math.round(this.f253644p * ((float) this.f253646r));
    }

    /* renamed from: b */
    public final View mo84996b() {
        m148071h();
        View view = this.f253633e;
        view.getClass();
        return view;
    }

    /* renamed from: c */
    public final void mo84997c(Rect rect) {
        this.f253652x = rect;
        View b = mo84996b();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.srp_logo_margin_left);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b.getLayoutParams();
        marginLayoutParams.leftMargin = dimensionPixelSize + rect.left;
        marginLayoutParams.rightMargin = rect.right;
        b.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: e */
    public final void mo84999e(BitmapDrawable bitmapDrawable, int i, int i2, int i3, int i4) {
        int i5;
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        this.f253637i = i;
        this.f253636h = i2 != 0 ? i2 : this.f253631c;
        this.f253650v = i3;
        this.f253651w = i4;
        this.f253635g = bitmapDrawable2;
        boolean z = getMeasuredHeight() == 0;
        this.f253654z = z;
        if (bitmapDrawable2 != null && !z && this.f253634f != null) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.srp_doodle_image_height);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.srp_doodle_gradient_height);
            Bitmap bitmap = bitmapDrawable.getBitmap();
            BitmapDrawable bitmapDrawable3 = new BitmapDrawable(resources, Bitmap.createScaledBitmap(bitmap, (int) Math.floor((double) (((float) bitmap.getWidth()) * (((float) dimensionPixelSize) / ((float) bitmap.getHeight())))), dimensionPixelSize, true));
            bitmapDrawable3.setGravity(49);
            ColorDrawable colorDrawable = new ColorDrawable(this.f253637i);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f253637i, Color.argb(0, Color.red(this.f253637i), Color.green(this.f253637i), Color.blue(this.f253637i))});
            gradientDrawable.setSize(getMeasuredWidth(), dimensionPixelSize2);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, gradientDrawable, bitmapDrawable3});
            this.f253649u = layerDrawable;
            if (this.f253639k) {
                int i6 = this.f253640l;
                dimensionPixelSize += i6;
                i5 = i6;
            } else {
                i5 = 0;
            }
            layerDrawable.setLayerInset(2, this.f253652x.left, i5, this.f253652x.right, 0);
            this.f253649u.setLayerInset(0, 0, 0, 0, dimensionPixelSize2);
            this.f253649u.setLayerInset(1, 0, dimensionPixelSize, 0, 0);
            this.f253634f.setImageDrawable(this.f253649u);
        }
    }

    /* renamed from: f */
    public final void mo85000f(float f, float f2) {
        View view;
        float k = C91115n.m148879k(0.0f, 1.0f, 0.8f, f);
        float k2 = C91115n.m148879k(0.6f, 1.0f, 0.0f, Math.min(f, f2));
        if (this.f253648t == null) {
            m148071h();
            if (this.f253641m) {
                view = findViewById(R.id.logo_header_white_logo);
                view.getClass();
            } else {
                view = findViewById(R.id.logo_header_logo_view);
                view.getClass();
            }
            this.f253648t = view;
        }
        View view2 = this.f253648t;
        view2.setScaleX(k);
        view2.setScaleY(k);
        setAlpha(k2);
        if (Math.min(f, f2) > 1.0E-6f) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
        if (Math.abs(this.f253644p - f) > 1.0E-6f) {
            this.f253644p = f;
            int a = mo84995a();
            for (C93993q qVar : this.f253632d) {
                qVar.f262516a.mo88269f(a);
            }
        }
        this.f253645q = f2;
    }

    /* renamed from: g */
    public final void mo85001g(int i, boolean z) {
        int i2 = this.f253653y;
        this.f253653y = i;
        C90694g gVar = this.f253647s;
        if (gVar == null) {
            this.f253626A = true;
            this.f253627B = z;
            return;
        }
        if (i != 0) {
            gVar.mo85012a(mo84996b(), this.f253631c, z);
        } else {
            gVar.mo85012a(this.f253634f, this.f253636h, z);
        }
        if (this.f253642n && i2 != i) {
            mo84998d();
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C90696i iVar = this.f253628C;
        iVar.f253700b = this.f253645q;
        iVar.f253699a = this.f253644p;
        ValueAnimator valueAnimator2 = this.f253630b;
        if (valueAnimator == valueAnimator2) {
            iVar.f253700b = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
        } else {
            ValueAnimator valueAnimator3 = this.f253629a;
            if (valueAnimator == valueAnimator3) {
                iVar.f253699a = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
            }
        }
        removeCallbacks(this.f253628C);
        post(this.f253628C);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.srp_doodle);
        imageView.getClass();
        this.f253634f = imageView;
        this.f253638j = new C90496b();
        setVisibility(4);
        View findViewById = findViewById(R.id.srp_header_fader);
        findViewById.getClass();
        this.f253647s = new C90694g(findViewById);
        if (this.f253626A) {
            this.f253626A = false;
            mo85001g(this.f253653y, this.f253627B);
            this.f253627B = false;
        }
        C28295m.m52919e(findViewById(R.id.logo_header), new C28292j(26518));
        ImageView imageView2 = this.f253634f;
        C28292j jVar = new C28292j(61);
        jVar.mo33795i(5);
        C28295m.m52919e(imageView2, jVar);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f253654z) {
            mo84999e(this.f253635g, this.f253637i, this.f253636h, this.f253650v, this.f253651w);
        }
    }

    public LogoHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    public final void mo84998d() {
        View view;
        C90496b bVar = this.f253638j;
        if (this.f253653y == 0) {
            view = this.f253634f;
        } else {
            view = mo84996b();
        }
        bVar.mo84538a(view, this.f253650v, this.f253651w);
    }

    public LogoHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f253632d = new ArrayList();
        this.f253650v = 0;
        this.f253651w = 0;
        this.f253641m = false;
        this.f253642n = false;
        this.f253643o = true;
        this.f253653y = 2;
        this.f253628C = new C90696i(this);
        this.f253644p = 0.0f;
        this.f253645q = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f});
        this.f253629a = ofFloat;
        ofFloat.setDuration(200);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f253645q});
        this.f253630b = ofFloat2;
        ofFloat2.setDuration(200);
        ofFloat.addUpdateListener(this);
        ofFloat2.addUpdateListener(this);
        this.f253631c = getResources().getColor(R.color.quantum_grey600);
        this.f253646r = getResources().getDimensionPixelSize(R.dimen.srp_logo_header_height);
    }
}
