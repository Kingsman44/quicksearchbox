package android.support.p033v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.C0587dc;
import android.support.p033v7.widget.C0751je;
import android.support.p033v7.widget.C0772r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
/* compiled from: PG */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, C0453ag, C0772r {

    /* renamed from: a */
    C0480t f1506a;

    /* renamed from: b */
    public C0476p f1507b;

    /* renamed from: c */
    public C0463c f1508c;

    /* renamed from: d */
    private CharSequence f1509d;

    /* renamed from: e */
    private Drawable f1510e;

    /* renamed from: f */
    private C0587dc f1511f;

    /* renamed from: g */
    private boolean f1512g;

    /* renamed from: h */
    private int f1513h;

    /* renamed from: i */
    private int f1514i;

    /* renamed from: j */
    private int f1515j;

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    private final void m1453g() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1509d);
        if (this.f1510e != null && ((this.f1506a.f1694m & 4) != 4 || !this.f1512g)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f1509d : null);
        CharSequence charSequence3 = this.f1506a.f1692k;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f1506a.f1685d;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence3);
        }
        CharSequence charSequence4 = this.f1506a.f1693l;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z3) {
                charSequence2 = this.f1506a.f1685d;
            }
            C0751je.m2535a(this, charSequence2);
            return;
        }
        C0751je.m2535a(this, charSequence4);
    }

    /* renamed from: h */
    private final boolean m1454h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    /* renamed from: a */
    public final C0480t mo1441a() {
        return this.f1506a;
    }

    /* renamed from: b */
    public final boolean mo1442b() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: c */
    public final boolean mo1443c() {
        return mo1442b();
    }

    /* renamed from: d */
    public final boolean mo1444d() {
        return mo1442b() && this.f1506a.getIcon() == null;
    }

    /* renamed from: e */
    public final boolean mo1445e() {
        return true;
    }

    /* renamed from: f */
    public final void mo1446f(C0480t tVar) {
        this.f1506a = tVar;
        Drawable icon = tVar.getIcon();
        this.f1510e = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f1515j;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, (Drawable) null, (Drawable) null, (Drawable) null);
        m1453g();
        this.f1509d = tVar.mo1685f(this);
        m1453g();
        setId(tVar.f1682a);
        if (true != tVar.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(tVar.isEnabled());
        if (tVar.hasSubMenu() && this.f1511f == null) {
            this.f1511f = new C0462b(this);
        }
    }

    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final void onClick(View view) {
        C0476p pVar = this.f1507b;
        if (pVar != null) {
            pVar.mo1455b(this.f1506a);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1512g = m1454h();
        m1453g();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean b = mo1442b();
        if (b && (i4 = this.f1514i) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f1513h);
        } else {
            i3 = this.f1513h;
        }
        if (mode != 1073741824 && this.f1513h > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!b && this.f1510e != null) {
            super.setPadding((getMeasuredWidth() - this.f1510e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0587dc dcVar;
        if (!this.f1506a.hasSubMenu() || (dcVar = this.f1511f) == null || !dcVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1514i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1512g = m1454h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338a.f1067c, i, 0);
        this.f1513h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1515j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1514i = -1;
        setSaveEnabled(false);
    }
}
