package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7178p.C91071a;
import com.google.android.apps.gsa.shared.util.p7178p.C91072b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.WebImageView */
/* compiled from: PG */
public class WebImageView extends ImageView implements C91072b {

    /* renamed from: f */
    public static final C59071e f227351f = C59071e.m91332i("com.google.android.apps.gsa.now.shared.ui.WebImageView");

    /* renamed from: a */
    private C60870cx f227352a;

    /* renamed from: b */
    private C83422k f227353b;

    /* renamed from: c */
    private boolean f227354c;

    /* renamed from: d */
    private Uri f227355d;

    /* renamed from: e */
    private C91189au f227356e;

    /* renamed from: g */
    public C91071a f227357g;

    /* renamed from: h */
    public C83423l f227358h;

    /* renamed from: i */
    public boolean f227359i;

    /* renamed from: j */
    public double f227360j;

    /* renamed from: k */
    public boolean f227361k;

    /* renamed from: l */
    public boolean f227362l;

    /* renamed from: m */
    private final int f227363m;

    /* renamed from: n */
    private int f227364n;

    /* renamed from: o */
    private boolean f227365o;

    /* renamed from: com.google.android.apps.gsa.now.shared.ui.WebImageView$a */
    /* compiled from: PG */
    public interface C83411a {
        /* renamed from: pW */
        void mo76742pW(WebImageView webImageView);
    }

    public WebImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final boolean m132787a() {
        return (this.f227355d == null || this.f227356e == null) ? false : true;
    }

    /* renamed from: c */
    private final boolean mo76727c() {
        C91189au auVar;
        C22872h.m42743c(C0826b.class);
        Uri uri = this.f227355d;
        if (uri == null || (auVar = this.f227356e) == null) {
            return false;
        }
        mo76737h(uri, auVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo76711b() {
        if (m132787a()) {
            setImageDrawable((Drawable) null);
        }
        C60870cx cxVar = this.f227352a;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f227362l = true;
            this.f227352a = null;
        }
        C83422k kVar = this.f227353b;
        if (kVar != null) {
            kVar.f227394a = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (this.f227364n == -1) {
            super.drawableStateChanged();
            return;
        }
        for (int i : getDrawableState()) {
            if (i == 16842919 || i == 16842908) {
                setColorFilter(this.f227364n);
                return;
            }
        }
        setColorFilter((ColorFilter) null);
    }

    /* renamed from: e */
    public final String mo76734e() {
        Uri uri = this.f227355d;
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    /* renamed from: f */
    public final void mo76735f() {
        C22872h.m42743c(C0826b.class);
        if (m132787a()) {
            C58976aa aaVar = C58975e.f156826a;
            mo76711b();
            setImageDrawable((Drawable) null);
            this.f227365o = true;
        }
    }

    /* renamed from: g */
    public final void mo76736g() {
        if (this.f227354c) {
            setBackgroundColor(0);
        }
    }

    /* renamed from: h */
    public final void mo76737h(Uri uri, C91189au auVar) {
        Uri uri2;
        if (this.f227362l || (uri2 = this.f227355d) == null || !uri2.equals(uri)) {
            this.f227355d = uri;
            this.f227356e = auVar;
            C58976aa aaVar = C58975e.f156826a;
            setImageDrawable((Drawable) null);
            mo76711b();
            if (uri != null && auVar != null) {
                C60870cx d = auVar.mo85417d(uri);
                this.f227359i = d.isDone();
                if (!d.isDone()) {
                    setImageDrawable((Drawable) null);
                }
                this.f227352a = d;
                this.f227362l = false;
                C83422k kVar = new C83422k(this);
                this.f227353b = kVar;
                auVar.mo85428r(d, "WebImageView.ImageCallback", kVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo76738i(String str, C91189au auVar) {
        mo76737h(!TextUtils.isEmpty(str) ? Uri.parse(str) : null, auVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (this.f227362l) {
            mo76727c();
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        mo76711b();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f227365o) {
            boolean c = mo76727c();
            if (c) {
                C58976aa aaVar = C58975e.f156826a;
            }
            this.f227365o = !c;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f227360j != C59203do.f157270a) {
            if (View.MeasureSpec.getMode(i) == 0) {
                C59104x d = f227351f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "WebImageView");
                ((C59052c) ((C59052c) d).mo56372aa(6670)).mo56386p("fixedAspectRatio set, but neither width nor height is restricted.");
            } else {
                double d2 = this.f227360j;
                int i3 = this.f227363m;
                int suggestedMinimumWidth = getSuggestedMinimumWidth();
                int maxHeight = getMaxHeight();
                if (View.MeasureSpec.getMode(i) != 0) {
                    int size = View.MeasureSpec.getSize(i);
                    double d3 = (double) size;
                    Double.isNaN(d3);
                    int i4 = (int) (d3 * d2);
                    if (View.MeasureSpec.getMode(i2) != 0) {
                        maxHeight = Math.min(maxHeight, View.MeasureSpec.getSize(i2));
                    }
                    if (maxHeight < i4) {
                        setScrollY((i3 * (i4 - maxHeight)) / 2);
                        i4 = maxHeight;
                    }
                    setMeasuredDimension(size, Math.max(suggestedMinimumWidth, i4));
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setImageResource(int i) {
        mo76737h((Uri) null, (C91189au) null);
        super.setImageResource(i);
    }

    public WebImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f227362l = false;
        ((C83411a) C47266f.m84076a(context.getApplicationContext(), C83411a.class)).mo76742pW(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C83415d.f227388d, i, 0);
        this.f227360j = (double) obtainStyledAttributes.getFloat(0, 0.0f);
        this.f227363m = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.getBoolean(4, true) && getBackground() == null) {
            setBackgroundColor(context.getResources().getColor(R.color.web_image_view_placeholder));
            this.f227354c = true;
        }
        this.f227364n = obtainStyledAttributes.getColor(3, -1);
        this.f227361k = obtainStyledAttributes.getBoolean(1, false);
        this.f227365o = false;
        obtainStyledAttributes.recycle();
        this.f227357g.mo85337a(this);
    }
}
