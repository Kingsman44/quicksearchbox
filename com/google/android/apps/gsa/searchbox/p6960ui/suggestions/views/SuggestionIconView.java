package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionIconView */
/* compiled from: PG */
public class SuggestionIconView extends ImageView implements C88800ak {

    /* renamed from: a */
    public static final C59071e f240374a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionIconView");

    /* renamed from: b */
    public static final int f240375b = Color.rgb(173, 173, 173);

    /* renamed from: c */
    public int f240376c;

    /* renamed from: d */
    public int f240377d;

    /* renamed from: e */
    public boolean f240378e;

    /* renamed from: f */
    public int f240379f;

    /* renamed from: g */
    public int f240380g;

    /* renamed from: h */
    public C88799aj f240381h;

    /* renamed from: i */
    public C60870cx f240382i;

    /* renamed from: j */
    private int f240383j;

    /* renamed from: k */
    private int f240384k;

    /* renamed from: l */
    private ImageView.ScaleType f240385l;

    /* renamed from: m */
    private C88821e f240386m;

    /* renamed from: n */
    private int f240387n;

    /* renamed from: o */
    private RectF f240388o;

    /* renamed from: p */
    private Path f240389p;

    /* renamed from: q */
    private C90953s f240390q;

    public SuggestionIconView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: m */
    private final int m144097m(int i) {
        return (int) ((((float) i) * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: n */
    private final C88821e m144098n() {
        if (this.f240386m == null) {
            this.f240386m = new C88821e(this, new C88801al(this));
        }
        return this.f240386m;
    }

    /* renamed from: o */
    private final void m144099o(int i, boolean z, ImageView.ScaleType scaleType) {
        m144100p(false, i, PorterDuff.Mode.SRC_IN, z, (String) null, scaleType);
    }

    /* renamed from: p */
    private final void m144100p(boolean z, int i, PorterDuff.Mode mode, boolean z2, String str, ImageView.ScaleType scaleType) {
        mo82569l();
        float f = 0.0f;
        if (z && C91115n.m148875g()) {
            f = 180.0f;
        }
        setRotationY(f);
        if (i == 0) {
            setColorFilter((ColorFilter) null);
        } else {
            setColorFilter(i, mode);
        }
        setScaleType(scaleType);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            setCropToPadding(true);
        } else {
            setCropToPadding(false);
        }
        setClickable(z2);
        setContentDescription(str);
    }

    /* renamed from: a */
    public final void mo82558a(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (i != layoutParams.width) {
            layoutParams.width = i;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo82559b() {
        setVisibility(4);
    }

    /* renamed from: c */
    public final void mo82560c() {
        mo82569l();
        setVisibility(4);
    }

    /* renamed from: d */
    public final void mo82561d(int i, int i2, boolean z) {
        if (this.f240387n == String.valueOf(i).hashCode()) {
            setVisibility(0);
            return;
        }
        this.f240378e = false;
        this.f240379f = 0;
        setPadding(this.f240376c, this.f240384k, this.f240377d, this.f240383j);
        C88821e n = m144098n();
        m144099o(i2, z, this.f240385l);
        Drawable drawable = getContext().getResources().getDrawable(i);
        n.f240478b = null;
        n.mo82610c(drawable, (Uri) null);
        this.f240387n = String.valueOf(i).hashCode();
    }

    /* renamed from: e */
    public final void mo82562e(int i, int i2, String str) {
        if (this.f240387n == String.valueOf(i).hashCode()) {
            setContentDescription(str);
            setVisibility(0);
            return;
        }
        this.f240378e = false;
        this.f240379f = 0;
        setPadding(this.f240376c, this.f240384k, this.f240377d, this.f240383j);
        m144100p(true, i2, PorterDuff.Mode.SRC_IN, true, str, this.f240385l);
        C88821e n = m144098n();
        Drawable drawable = getContext().getResources().getDrawable(i);
        n.f240478b = null;
        n.mo82610c(drawable, (Uri) null);
        this.f240387n = String.valueOf(i).hashCode();
    }

    /* renamed from: f */
    public final void mo82563f(Drawable drawable, int i) {
        this.f240387n = 0;
        if (i != -1) {
            int m = m144097m(i);
            setPadding(m, m, m, m);
        } else {
            setPadding(this.f240376c, this.f240384k, this.f240377d, this.f240383j);
        }
        this.f240378e = false;
        this.f240379f = 0;
        C88821e n = m144098n();
        m144099o(0, false, this.f240385l);
        n.f240478b = null;
        n.mo82610c(drawable, (Uri) null);
    }

    /* renamed from: g */
    public final void mo82564g(String str, String str2, C88705f fVar) {
        mo82565h(str, str2, fVar, false, this.f240385l);
    }

    /* renamed from: h */
    public final void mo82565h(String str, String str2, C88705f fVar, boolean z, ImageView.ScaleType scaleType) {
        int i = 0;
        if (TextUtils.isEmpty(str) || this.f240387n != str.hashCode()) {
            setPadding(this.f240376c, this.f240384k, this.f240377d, this.f240383j);
            this.f240378e = z;
            this.f240379f = 0;
            C88821e n = m144098n();
            m144099o(0, false, scaleType);
            n.mo82609b(str, str2, fVar, false);
            if (str != null) {
                i = str.hashCode();
            }
            this.f240387n = i;
            return;
        }
        setVisibility(0);
    }

    /* renamed from: i */
    public final void mo82566i(String str) {
        this.f240387n = 0;
        setVisibility(0);
        C88840x xVar = new C88840x(getContext().getResources());
        xVar.mo82620a(str);
        xVar.mo82621b();
        this.f240378e = true;
        setCropToPadding(true);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setImageDrawable(xVar);
        setClickable(false);
    }

    /* renamed from: j */
    public final void mo82567j(String str, C88705f fVar, String str2, ImageView.ScaleType scaleType, int i) {
        mo82568k(str, fVar, str2, scaleType, 5, 0, i, 0, 0);
    }

    /* renamed from: k */
    public final void mo82568k(String str, C88705f fVar, String str2, ImageView.ScaleType scaleType, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int hashCode = str.hashCode();
        if (this.f240387n == hashCode) {
            setVisibility(0);
            return;
        }
        C88705f fVar2 = fVar;
        C60870cx b = fVar.mo82428b(Uri.parse(str));
        int m = m144097m(i);
        setPadding(m, m, m, m);
        this.f240378e = false;
        this.f240379f = R.dimen.image_icon_corner_radius;
        float f = (float) m;
        this.f240388o = new RectF(f, f, (float) (getLayoutParams().width - m), (float) (getLayoutParams().height - m));
        this.f240389p = new Path();
        m144100p(false, 0, PorterDuff.Mode.SRC_ATOP, false, (String) null, scaleType);
        C88821e n = m144098n();
        if (!b.isDone() && !str2.isEmpty()) {
            C88727aj ajVar = new C88727aj(getContext());
            if (str2.startsWith(C33259r.f88929b)) {
                i6 = C88727aj.m143702g(str2);
            } else {
                i6 = Color.parseColor(str2);
            }
            ShapeDrawable l = ajVar.mo82462l(false);
            l.getPaint().setColor(i6);
            int i7 = (int) ((ajVar.f239997b.getResources().getDisplayMetrics().density * 46.0f) + 0.5f);
            l.setIntrinsicHeight(i7);
            l.setIntrinsicWidth(i7);
            n.f240478b = null;
            n.mo82610c(l, (Uri) null);
        }
        this.f240382i = b;
        this.f240380g = hashCode;
        C88802am amVar = new C88802am(this, hashCode, i3, i4, n, i2, i5);
        this.f240390q = amVar;
        fVar.mo82427a().mo85428r(b, "sb.u.IconView.ImageCallback", amVar);
        this.f240387n = hashCode;
    }

    /* renamed from: l */
    public final void mo82569l() {
        C60870cx cxVar = this.f240382i;
        if (cxVar != null && !cxVar.isDone()) {
            this.f240382i.cancel(true);
            this.f240382i = null;
            this.f240387n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f240379f != 0) {
            float dimension = getContext().getResources().getDimension(this.f240379f);
            this.f240389p.addRoundRect(this.f240388o, dimension, dimension, Path.Direction.CW);
            canvas.clipPath(this.f240389p);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f240376c = getPaddingLeft();
        this.f240377d = getPaddingRight();
        this.f240383j = getPaddingBottom();
        this.f240384k = getPaddingTop();
        this.f240385l = getScaleType();
    }

    public final void setVisibility(int i) {
        C88799aj ajVar = this.f240381h;
        if (ajVar != null) {
            ajVar.mo82591a(this, i);
        }
        super.setVisibility(i);
    }

    public SuggestionIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SuggestionIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f240387n = 0;
        this.f240378e = false;
        this.f240379f = 0;
    }
}
