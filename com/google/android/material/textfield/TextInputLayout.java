package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.C0506ad;
import android.support.p033v7.widget.C0571cn;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import androidx.core.p096h.C1950c;
import androidx.core.p098j.C2043bi;
import androidx.customview.view.AbsSavedState;
import androidx.p197u.C4199aj;
import androidx.p197u.C4230o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.internal.C44747g;
import com.google.android.material.internal.C44749i;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.p3515l.C44773d;
import com.google.android.material.p3515l.C44778i;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.NetError;

/* compiled from: PG */
public class TextInputLayout extends LinearLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f117258t = 0;

    /* renamed from: u */
    private static final int[][] f117259u = {new int[]{16842919}, new int[0]};

    /* renamed from: A */
    private int f117260A;

    /* renamed from: B */
    private int f117261B;

    /* renamed from: C */
    private int f117262C;

    /* renamed from: D */
    private TextView f117263D;

    /* renamed from: E */
    private ColorStateList f117264E;

    /* renamed from: F */
    private int f117265F;

    /* renamed from: G */
    private C4230o f117266G;

    /* renamed from: H */
    private C4230o f117267H;

    /* renamed from: I */
    private ColorStateList f117268I;

    /* renamed from: J */
    private ColorStateList f117269J;

    /* renamed from: K */
    private boolean f117270K;

    /* renamed from: L */
    private CharSequence f117271L;

    /* renamed from: M */
    private C44779j f117272M;

    /* renamed from: N */
    private C44779j f117273N;

    /* renamed from: O */
    private StateListDrawable f117274O;

    /* renamed from: P */
    private boolean f117275P;

    /* renamed from: Q */
    private C44779j f117276Q;

    /* renamed from: R */
    private C44779j f117277R;

    /* renamed from: S */
    private C44785p f117278S;

    /* renamed from: T */
    private boolean f117279T;

    /* renamed from: U */
    private final int f117280U;

    /* renamed from: V */
    private int f117281V;

    /* renamed from: W */
    private int f117282W;

    /* renamed from: a */
    public final C44931al f117283a;

    /* renamed from: aa */
    private int f117284aa;

    /* renamed from: ab */
    private int f117285ab;

    /* renamed from: ac */
    private int f117286ac;

    /* renamed from: ad */
    private int f117287ad;

    /* renamed from: ae */
    private final Rect f117288ae;

    /* renamed from: af */
    private final Rect f117289af;

    /* renamed from: ag */
    private final RectF f117290ag;

    /* renamed from: ah */
    private Drawable f117291ah;

    /* renamed from: ai */
    private int f117292ai;

    /* renamed from: aj */
    private Drawable f117293aj;

    /* renamed from: ak */
    private int f117294ak;

    /* renamed from: al */
    private Drawable f117295al;

    /* renamed from: am */
    private int f117296am;

    /* renamed from: an */
    private int f117297an;

    /* renamed from: ao */
    private int f117298ao;

    /* renamed from: ap */
    private ColorStateList f117299ap;

    /* renamed from: aq */
    private int f117300aq;

    /* renamed from: ar */
    private int f117301ar;

    /* renamed from: as */
    private int f117302as;

    /* renamed from: at */
    private int f117303at;

    /* renamed from: au */
    private int f117304au;

    /* renamed from: av */
    private boolean f117305av;

    /* renamed from: aw */
    private ValueAnimator f117306aw;

    /* renamed from: ax */
    private boolean f117307ax;

    /* renamed from: b */
    public final C44962y f117308b;

    /* renamed from: c */
    public EditText f117309c;

    /* renamed from: d */
    public final C44923ad f117310d;

    /* renamed from: e */
    boolean f117311e;

    /* renamed from: f */
    public int f117312f;

    /* renamed from: g */
    public boolean f117313g;

    /* renamed from: h */
    public TextView f117314h;

    /* renamed from: i */
    public CharSequence f117315i;

    /* renamed from: j */
    public boolean f117316j;

    /* renamed from: k */
    public boolean f117317k;

    /* renamed from: l */
    public int f117318l;

    /* renamed from: m */
    public final LinkedHashSet f117319m;

    /* renamed from: n */
    public ColorStateList f117320n;

    /* renamed from: o */
    public ColorStateList f117321o;

    /* renamed from: p */
    public boolean f117322p;

    /* renamed from: q */
    final C44747g f117323q;

    /* renamed from: r */
    public boolean f117324r;

    /* renamed from: s */
    public boolean f117325s;

    /* renamed from: v */
    private final FrameLayout f117326v;

    /* renamed from: w */
    private CharSequence f117327w;

    /* renamed from: x */
    private int f117328x;

    /* renamed from: y */
    private int f117329y;

    /* renamed from: z */
    private int f117330z;

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final int m79753A(int i, boolean z) {
        int compoundPaddingRight = i - this.f117309c.getCompoundPaddingRight();
        C44931al alVar = this.f117283a;
        return (alVar.f117385b == null || !z) ? compoundPaddingRight : compoundPaddingRight + (alVar.f117384a.getMeasuredWidth() - this.f117283a.f117384a.getPaddingRight());
    }

    /* renamed from: B */
    private final Drawable m79754B() {
        if (this.f117273N == null) {
            this.f117273N = m79756D(true);
        }
        return this.f117273N;
    }

    /* renamed from: C */
    private final C4230o m79755C() {
        C4230o oVar = new C4230o();
        oVar.f13592b = (long) C44693c.m79225a(getContext(), R.attr.motionDurationShort2, 87);
        oVar.f13593c = C44688a.m79217a(getContext(), R.attr.motionEasingLinearInterpolator, C44497b.f115650a);
        return oVar;
    }

    /* renamed from: D */
    private final C44779j m79756D(boolean z) {
        float f;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = true != z ? 0.0f : dimensionPixelOffset;
        EditText editText = this.f117309c;
        if (editText instanceof C44926ag) {
            f = ((C44926ag) editText).f117371b;
        } else {
            f = (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C44784o oVar = new C44784o();
        oVar.mo48144c(f2);
        oVar.mo48145d(f2);
        oVar.mo48142a(dimensionPixelOffset);
        oVar.mo48143b(dimensionPixelOffset);
        C44785p pVar = new C44785p(oVar);
        C44779j O = C44779j.m79382O(getContext(), f);
        O.mo47555l(pVar);
        C44778i iVar = O.f116741C;
        if (iVar.f116726i == null) {
            iVar.f116726i = new Rect();
        }
        O.f116741C.f116726i.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        O.invalidateSelf();
        return O;
    }

    /* renamed from: E */
    private final void m79757E() {
        ColorStateList colorStateList;
        C44779j jVar = this.f117272M;
        if (jVar != null) {
            C44785p pVar = jVar.f116741C.f116718a;
            C44785p pVar2 = this.f117278S;
            if (pVar != pVar2) {
                jVar.mo47555l(pVar2);
            }
            if (this.f117318l == 2 && m79769Q()) {
                this.f117272M.mo48127Y((float) this.f117282W, this.f117286ac);
            }
            int i = this.f117287ad;
            if (this.f117318l == 1) {
                i = C1924a.m5188g(this.f117287ad, C44535e.m78720c(getContext(), R.attr.colorSurface, 0));
            }
            this.f117287ad = i;
            this.f117272M.mo48124V(ColorStateList.valueOf(i));
            C44779j jVar2 = this.f117276Q;
            if (!(jVar2 == null || this.f117277R == null)) {
                if (m79769Q()) {
                    if (this.f117309c.isFocused()) {
                        colorStateList = ColorStateList.valueOf(this.f117296am);
                    } else {
                        colorStateList = ColorStateList.valueOf(this.f117286ac);
                    }
                    jVar2.mo48124V(colorStateList);
                    this.f117277R.mo48124V(ColorStateList.valueOf(this.f117286ac));
                }
                invalidate();
            }
            mo48493t();
        }
    }

    /* renamed from: F */
    private final void m79758F() {
        if (m79770R()) {
            ((C44947j) this.f117272M).mo48569a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: G */
    private final void m79759G() {
        TextView textView = this.f117263D;
        if (textView != null && this.f117316j) {
            textView.setText((CharSequence) null);
            C4199aj.m12054b(this.f117326v, this.f117267H);
            this.f117263D.setVisibility(4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m79761I() {
        /*
            r11 = this;
            boolean r0 = r11.m79770R()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r11.f117290ag
            com.google.android.material.internal.g r1 = r11.f117323q
            android.widget.EditText r2 = r11.f117309c
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r11.f117309c
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.f116660k
            boolean r4 = r1.mo48073r(r4)
            r1.f116661l = r4
            r5 = 1
            r6 = 17
            r7 = 5
            r8 = 8388613(0x800005, float:1.175495E-38)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r3 == r6) goto L_0x0057
            r10 = r3 & 7
            if (r10 != r5) goto L_0x002f
            goto L_0x0057
        L_0x002f:
            r10 = r3 & r8
            if (r10 == r8) goto L_0x0047
            r10 = r3 & 5
            if (r10 != r7) goto L_0x0038
            goto L_0x0047
        L_0x0038:
            if (r4 == 0) goto L_0x0042
            android.graphics.Rect r4 = r1.f116655f
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.f116667r
            goto L_0x005c
        L_0x0042:
            android.graphics.Rect r4 = r1.f116655f
            int r4 = r4.left
            goto L_0x004d
        L_0x0047:
            if (r4 == 0) goto L_0x004f
            android.graphics.Rect r4 = r1.f116655f
            int r4 = r4.left
        L_0x004d:
            float r4 = (float) r4
            goto L_0x005d
        L_0x004f:
            android.graphics.Rect r4 = r1.f116655f
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.f116667r
            goto L_0x005c
        L_0x0057:
            float r4 = (float) r2
            float r4 = r4 / r9
            float r10 = r1.f116667r
            float r10 = r10 / r9
        L_0x005c:
            float r4 = r4 - r10
        L_0x005d:
            android.graphics.Rect r10 = r1.f116655f
            int r10 = r10.left
            float r10 = (float) r10
            float r4 = java.lang.Math.max(r4, r10)
            r0.left = r4
            android.graphics.Rect r4 = r1.f116655f
            int r4 = r4.top
            float r4 = (float) r4
            r0.top = r4
            if (r3 == r6) goto L_0x009c
            r4 = r3 & 7
            if (r4 != r5) goto L_0x0076
            goto L_0x009c
        L_0x0076:
            r2 = r3 & r8
            if (r2 == r8) goto L_0x008d
            r2 = r3 & 5
            if (r2 != r7) goto L_0x007f
            goto L_0x008d
        L_0x007f:
            boolean r2 = r1.f116661l
            if (r2 == 0) goto L_0x0088
            android.graphics.Rect r2 = r1.f116655f
            int r2 = r2.right
            goto L_0x009a
        L_0x0088:
            float r2 = r0.left
            float r3 = r1.f116667r
            goto L_0x00a1
        L_0x008d:
            boolean r2 = r1.f116661l
            if (r2 == 0) goto L_0x0096
            float r2 = r0.left
            float r3 = r1.f116667r
            goto L_0x00a1
        L_0x0096:
            android.graphics.Rect r2 = r1.f116655f
            int r2 = r2.right
        L_0x009a:
            float r2 = (float) r2
            goto L_0x00a2
        L_0x009c:
            float r2 = (float) r2
            float r2 = r2 / r9
            float r3 = r1.f116667r
            float r3 = r3 / r9
        L_0x00a1:
            float r2 = r2 + r3
        L_0x00a2:
            android.graphics.Rect r3 = r1.f116655f
            int r3 = r3.right
            float r3 = (float) r3
            float r2 = java.lang.Math.min(r2, r3)
            r0.right = r2
            android.graphics.Rect r2 = r1.f116655f
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.mo48057b()
            float r2 = r2 + r1
            r0.bottom = r2
            float r1 = r0.width()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0103
            float r1 = r0.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00cb
            goto L_0x0103
        L_0x00cb:
            float r1 = r0.left
            int r2 = r11.f117280U
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            int r2 = r11.f117280U
            float r2 = (float) r2
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r11.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r11.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r9
            float r2 = r2 - r3
            int r3 = r11.f117282W
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            com.google.android.material.l.j r1 = r11.f117272M
            com.google.android.material.textfield.j r1 = (com.google.android.material.textfield.C44947j) r1
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.mo48569a(r2, r3, r4, r0)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m79761I():void");
    }

    /* renamed from: J */
    private static void m79762J(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m79762J((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: K */
    private final void m79763K(boolean z) {
        if (this.f117316j != z) {
            if (z) {
                TextView textView = this.f117263D;
                if (textView != null) {
                    this.f117326v.addView(textView);
                    this.f117263D.setVisibility(0);
                }
            } else {
                TextView textView2 = this.f117263D;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.f117263D = null;
            }
            this.f117316j = z;
        }
    }

    /* renamed from: L */
    private final void m79764L() {
        if (this.f117314h != null) {
            EditText editText = this.f117309c;
            mo48490r(editText == null ? null : editText.getText());
        }
    }

    /* renamed from: M */
    private final void m79765M() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f117314h;
        if (textView != null) {
            if (this.f117313g) {
                i = this.f117261B;
            } else {
                i = this.f117262C;
            }
            mo48489q(textView, i);
            if (!this.f117313g && (colorStateList2 = this.f117268I) != null) {
                this.f117314h.setTextColor(colorStateList2);
            }
            if (this.f117313g && (colorStateList = this.f117269J) != null) {
                this.f117314h.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: N */
    private final void m79766N() {
        if (this.f117318l != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f117326v.getLayoutParams();
            int y = m79773y();
            if (y != layoutParams.topMargin) {
                layoutParams.topMargin = y;
                this.f117326v.requestLayout();
            }
        }
    }

    /* renamed from: O */
    private final void m79767O() {
        EditText editText = this.f117309c;
        mo48495v(editText == null ? null : editText.getText());
    }

    /* renamed from: P */
    private final void m79768P(boolean z, boolean z2) {
        int defaultColor = this.f117299ap.getDefaultColor();
        int colorForState = this.f117299ap.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f117299ap.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f117286ac = colorForState2;
        } else if (z2) {
            this.f117286ac = colorForState;
        } else {
            this.f117286ac = defaultColor;
        }
    }

    /* renamed from: Q */
    private final boolean m79769Q() {
        return this.f117282W >= 0 && this.f117286ac != 0;
    }

    /* renamed from: R */
    private final boolean m79770R() {
        return this.f117270K && !TextUtils.isEmpty(this.f117271L) && (this.f117272M instanceof C44947j);
    }

    /* renamed from: S */
    private final boolean m79771S() {
        return this.f117318l == 1 && this.f117309c.getMinLines() <= 1;
    }

    /* renamed from: a */
    static /* synthetic */ int m79772a(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* renamed from: y */
    private final int m79773y() {
        float b;
        if (!this.f117270K) {
            return 0;
        }
        int i = this.f117318l;
        if (i == 0) {
            b = this.f117323q.mo48057b();
        } else if (i != 2) {
            return 0;
        } else {
            b = this.f117323q.mo48057b() / 2.0f;
        }
        return (int) b;
    }

    /* renamed from: z */
    private final int m79774z(int i, boolean z) {
        int compoundPaddingLeft = i + this.f117309c.getCompoundPaddingLeft();
        C44931al alVar = this.f117283a;
        return (alVar.f117385b == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - alVar.f117384a.getMeasuredWidth()) + this.f117283a.f117384a.getPaddingLeft();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
            this.f117326v.addView(view, layoutParams2);
            this.f117326v.setLayoutParams(layoutParams);
            m79766N();
            EditText editText = (EditText) view;
            if (this.f117309c == null) {
                if (this.f117308b.f117446e != 3 && !(editText instanceof TextInputEditText)) {
                    Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
                }
                this.f117309c = editText;
                int i2 = this.f117328x;
                if (i2 != -1) {
                    mo48478l(i2);
                } else {
                    mo48479m(this.f117330z);
                }
                int i3 = this.f117329y;
                if (i3 != -1) {
                    mo48476j(i3);
                } else {
                    mo48477k(this.f117260A);
                }
                this.f117275P = false;
                m79760H();
                C44936aq aqVar = new C44936aq(this);
                EditText editText2 = this.f117309c;
                if (editText2 != null) {
                    C2043bi.m5526T(editText2, aqVar);
                }
                C44747g gVar = this.f117323q;
                Typeface typeface = this.f117309c.getTypeface();
                boolean s = gVar.mo48074s(typeface);
                boolean t = gVar.mo48075t(typeface);
                if (s || t) {
                    gVar.mo48061f(false);
                }
                this.f117323q.mo48070o(this.f117309c.getTextSize());
                C44747g gVar2 = this.f117323q;
                float letterSpacing = this.f117309c.getLetterSpacing();
                if (gVar2.f116666q != letterSpacing) {
                    gVar2.f116666q = letterSpacing;
                    gVar2.mo48061f(false);
                }
                int gravity = this.f117309c.getGravity();
                this.f117323q.mo48066k((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                this.f117323q.mo48069n(gravity);
                this.f117309c.addTextChangedListener(new C44932am(this));
                if (this.f117320n == null) {
                    this.f117320n = this.f117309c.getHintTextColors();
                }
                if (this.f117270K) {
                    if (TextUtils.isEmpty(this.f117271L)) {
                        CharSequence hint = this.f117309c.getHint();
                        this.f117327w = hint;
                        mo48474h(hint);
                        this.f117309c.setHint((CharSequence) null);
                    }
                    this.f117317k = true;
                }
                if (this.f117314h != null) {
                    mo48490r(this.f117309c.getText());
                }
                mo48491s();
                this.f117310d.mo48505c();
                this.f117283a.bringToFront();
                this.f117308b.bringToFront();
                Iterator it = this.f117319m.iterator();
                while (it.hasNext()) {
                    ((C44959v) it.next()).mo48588a(this);
                }
                this.f117308b.mo48605o();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                mo48494u(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final CharSequence mo48463b() {
        C44923ad adVar = this.f117310d;
        if (adVar.f117345f) {
            return adVar.f117344e;
        }
        return null;
    }

    /* renamed from: c */
    public final CharSequence mo48464c() {
        if (this.f117270K) {
            return this.f117271L;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48465d(float f) {
        if (this.f117323q.f116636a != f) {
            if (this.f117306aw == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f117306aw = valueAnimator;
                valueAnimator.setInterpolator(C44688a.m79217a(getContext(), R.attr.motionEasingEmphasizedInterpolator, C44497b.f115651b));
                this.f117306aw.setDuration((long) C44693c.m79225a(getContext(), R.attr.motionDurationMedium4, 167));
                this.f117306aw.addUpdateListener(new C44935ap(this));
            }
            this.f117306aw.setFloatValues(new float[]{this.f117323q.f116636a, f});
            this.f117306aw.start();
        }
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f117309c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f117327w != null) {
            boolean z = this.f117317k;
            this.f117317k = false;
            CharSequence hint = editText.getHint();
            this.f117309c.setHint(this.f117327w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f117309c.setHint(hint);
                this.f117317k = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f117326v.getChildCount());
            for (int i2 = 0; i2 < this.f117326v.getChildCount(); i2++) {
                View childAt = this.f117326v.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f117309c) {
                    newChild.setHint(mo48464c());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f117325s = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f117325s = false;
    }

    public final void draw(Canvas canvas) {
        C44779j jVar;
        super.draw(canvas);
        if (this.f117270K) {
            this.f117323q.mo48058c(canvas);
        }
        if (this.f117277R != null && (jVar = this.f117276Q) != null) {
            jVar.draw(canvas);
            if (this.f117309c.isFocused()) {
                Rect bounds = this.f117277R.getBounds();
                Rect bounds2 = this.f117276Q.getBounds();
                float f = this.f117323q.f116636a;
                int centerX = bounds2.centerX();
                bounds.left = C44497b.m78599c(centerX, bounds2.left, f);
                bounds.right = C44497b.m78599c(centerX, bounds2.right, f);
                this.f117277R.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (!this.f117307ax) {
            boolean z = true;
            this.f117307ax = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C44747g gVar = this.f117323q;
            boolean u = gVar != null ? gVar.mo48076u(drawableState) : false;
            if (this.f117309c != null) {
                if (!C2043bi.m5570ax(this) || !isEnabled()) {
                    z = false;
                }
                mo48494u(z, false);
            }
            mo48491s();
            mo48496w();
            if (u) {
                invalidate();
            }
            this.f117307ax = false;
        }
    }

    /* renamed from: e */
    public final void mo48470e(CharSequence charSequence) {
        if (!this.f117310d.f117345f) {
            if (!TextUtils.isEmpty(charSequence)) {
                this.f117310d.mo48510h(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C44923ad adVar = this.f117310d;
            adVar.mo48506d();
            adVar.f117344e = charSequence;
            adVar.f117346g.setText(charSequence);
            int i = adVar.f117342c;
            if (i != 1) {
                adVar.f117343d = 1;
            }
            adVar.mo48516n(i, adVar.f117343d, adVar.mo48518p(adVar.f117346g, charSequence));
            return;
        }
        this.f117310d.mo48507e();
    }

    /* renamed from: f */
    public final void mo48471f(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C44923ad adVar = this.f117310d;
            if (adVar.f117348i) {
                adVar.mo48514l(false);
                return;
            }
            return;
        }
        C44923ad adVar2 = this.f117310d;
        if (!adVar2.f117348i) {
            adVar2.mo48514l(true);
        }
        C44923ad adVar3 = this.f117310d;
        adVar3.mo48506d();
        adVar3.f117347h = charSequence;
        adVar3.f117349j.setText(charSequence);
        int i = adVar3.f117342c;
        if (i != 2) {
            adVar3.f117343d = 2;
        }
        adVar3.mo48516n(i, adVar3.f117343d, adVar3.mo48518p(adVar3.f117349j, charSequence));
    }

    /* renamed from: g */
    public final void mo48472g(int i) {
        mo48474h(i != 0 ? getResources().getText(i) : null);
    }

    public final int getBaseline() {
        EditText editText = this.f117309c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m79773y();
        }
        return super.getBaseline();
    }

    /* renamed from: h */
    public final void mo48474h(CharSequence charSequence) {
        if (this.f117270K) {
            if (!TextUtils.equals(charSequence, this.f117271L)) {
                this.f117271L = charSequence;
                this.f117323q.mo48072q(charSequence);
                if (!this.f117322p) {
                    m79761I();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    /* renamed from: i */
    public final void mo48475i(int i) {
        this.f117323q.mo48064i(i);
        this.f117321o = this.f117323q.f116657h;
        if (this.f117309c != null) {
            mo48494u(false, false);
            m79766N();
        }
    }

    /* renamed from: j */
    public final void mo48476j(int i) {
        this.f117329y = i;
        EditText editText = this.f117309c;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    /* renamed from: k */
    public final void mo48477k(int i) {
        this.f117260A = i;
        EditText editText = this.f117309c;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    /* renamed from: l */
    public final void mo48478l(int i) {
        this.f117328x = i;
        EditText editText = this.f117309c;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    /* renamed from: m */
    public final void mo48479m(int i) {
        this.f117330z = i;
        EditText editText = this.f117309c;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    /* renamed from: n */
    public final void mo48480n(CharSequence charSequence) {
        if (this.f117263D == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f117263D = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            C2043bi.m5551ae(this.f117263D, 2);
            C4230o C = m79755C();
            this.f117266G = C;
            C.f13591a = 67;
            this.f117267H = m79755C();
            mo48481o(this.f117265F);
            mo48488p(this.f117264E);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m79763K(false);
        } else {
            if (!this.f117316j) {
                m79763K(true);
            }
            this.f117315i = charSequence;
        }
        m79767O();
    }

    /* renamed from: o */
    public final void mo48481o(int i) {
        this.f117265F = i;
        TextView textView = this.f117263D;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f117323q.mo48060e(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f117309c;
        if (editText != null) {
            Rect rect = this.f117288ae;
            C44749i.m79353a(this, editText, rect);
            if (this.f117276Q != null) {
                this.f117276Q.setBounds(rect.left, rect.bottom - this.f117284aa, rect.right, rect.bottom);
            }
            if (this.f117277R != null) {
                this.f117277R.setBounds(rect.left, rect.bottom - this.f117285ab, rect.right, rect.bottom);
            }
            if (this.f117270K) {
                this.f117323q.mo48070o(this.f117309c.getTextSize());
                int gravity = this.f117309c.getGravity();
                this.f117323q.mo48066k((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                this.f117323q.mo48069n(gravity);
                C44747g gVar = this.f117323q;
                if (this.f117309c != null) {
                    Rect rect2 = this.f117289af;
                    boolean j = C44741bm.m79317j(this);
                    rect2.bottom = rect.bottom;
                    int i7 = this.f117318l;
                    if (i7 == 1) {
                        rect2.left = m79774z(rect.left, j);
                        rect2.top = rect.top + this.f117281V;
                        rect2.right = m79753A(rect.right, j);
                    } else if (i7 != 2) {
                        rect2.left = m79774z(rect.left, j);
                        rect2.top = getPaddingTop();
                        rect2.right = m79753A(rect.right, j);
                    } else {
                        rect2.left = rect.left + this.f117309c.getPaddingLeft();
                        rect2.top = rect.top - m79773y();
                        rect2.right = rect.right - this.f117309c.getPaddingRight();
                    }
                    gVar.mo48063h(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    C44747g gVar2 = this.f117323q;
                    if (this.f117309c != null) {
                        Rect rect3 = this.f117289af;
                        gVar2.mo48059d(gVar2.f116663n);
                        float f = -gVar2.f116663n.ascent();
                        rect3.left = rect.left + this.f117309c.getCompoundPaddingLeft();
                        if (m79771S()) {
                            i5 = (int) (((float) rect.centerY()) - (f / 2.0f));
                        } else {
                            i5 = rect.top + this.f117309c.getCompoundPaddingTop();
                        }
                        rect3.top = i5;
                        rect3.right = rect.right - this.f117309c.getCompoundPaddingRight();
                        if (m79771S()) {
                            i6 = (int) (((float) rect3.top) + f);
                        } else {
                            i6 = rect.bottom - this.f117309c.getCompoundPaddingBottom();
                        }
                        rect3.bottom = i6;
                        gVar2.mo48067l(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        this.f117323q.mo48061f(false);
                        if (m79770R() && !this.f117322p) {
                            m79761I();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f117309c != null && this.f117309c.getMeasuredHeight() < (max = Math.max(this.f117308b.getMeasuredHeight(), this.f117283a.getMeasuredHeight()))) {
            this.f117309c.setMinimumHeight(max);
            z = true;
        }
        boolean x = mo48497x();
        if (z || x) {
            this.f117309c.post(new C44934ao(this));
        }
        if (!(this.f117263D == null || (editText = this.f117309c) == null)) {
            this.f117263D.setGravity(editText.getGravity());
            this.f117263D.setPadding(this.f117309c.getCompoundPaddingLeft(), this.f117309c.getCompoundPaddingTop(), this.f117309c.getCompoundPaddingRight(), this.f117309c.getCompoundPaddingBottom());
        }
        this.f117308b.mo48605o();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        mo48470e(savedState.f117331a);
        if (savedState.f117332b) {
            post(new C44933an(this));
        }
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.f117279T) {
            float a = this.f117278S.f116784f.mo48107a(this.f117290ag);
            float a2 = this.f117278S.f116785g.mo48107a(this.f117290ag);
            float a3 = this.f117278S.f116787i.mo48107a(this.f117290ag);
            float a4 = this.f117278S.f116786h.mo48107a(this.f117290ag);
            C44785p pVar = this.f117278S;
            C44773d dVar = pVar.f116780b;
            C44773d dVar2 = pVar.f116781c;
            C44773d dVar3 = pVar.f116783e;
            C44773d dVar4 = pVar.f116782d;
            C44784o oVar = new C44784o();
            oVar.f116767a = dVar2;
            C44784o.m79416j(dVar2);
            oVar.f116768b = dVar;
            C44784o.m79416j(dVar);
            oVar.f116770d = dVar4;
            C44784o.m79416j(dVar4);
            oVar.f116769c = dVar3;
            C44784o.m79416j(dVar3);
            oVar.mo48144c(a2);
            oVar.mo48145d(a);
            oVar.mo48142a(a4);
            oVar.mo48143b(a3);
            C44785p pVar2 = new C44785p(oVar);
            this.f117279T = z;
            C44779j jVar = this.f117272M;
            if (jVar != null && jVar.f116741C.f116718a != pVar2) {
                this.f117278S = pVar2;
                m79757E();
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C44923ad adVar = this.f117310d;
        if (adVar.mo48517o(adVar.f117343d)) {
            savedState.f117331a = mo48463b();
        }
        C44962y yVar = this.f117308b;
        boolean z = false;
        if (yVar.mo48607q() && yVar.f117445d.f116510a) {
            z = true;
        }
        savedState.f117332b = z;
        return savedState;
    }

    /* renamed from: p */
    public final void mo48488p(ColorStateList colorStateList) {
        if (this.f117264E != colorStateList) {
            this.f117264E = colorStateList;
            TextView textView = this.f117263D;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo48489q(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132150288);
        textView.setTextColor(C1878d.m5128a(getContext(), R.color.design_error));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo48490r(Editable editable) {
        int a = m79772a(editable);
        boolean z = this.f117313g;
        int i = this.f117312f;
        if (i == -1) {
            this.f117314h.setText(String.valueOf(a));
            this.f117314h.setContentDescription((CharSequence) null);
            this.f117313g = false;
        } else {
            this.f117313g = a > i;
            Context context = getContext();
            TextView textView = this.f117314h;
            int i2 = this.f117312f;
            int i3 = true != this.f117313g ? R.string.character_counter_content_description : R.string.character_counter_overflowed_content_description;
            Integer valueOf = Integer.valueOf(a);
            textView.setContentDescription(context.getString(i3, new Object[]{valueOf, Integer.valueOf(i2)}));
            if (z != this.f117313g) {
                m79765M();
            }
            C1950c a2 = C1950c.m5272a();
            this.f117314h.setText(a2.mo5101f(getContext().getString(R.string.character_counter_pattern, new Object[]{valueOf, Integer.valueOf(this.f117312f)}), a2.f5867d));
        }
        if (this.f117309c != null && z != this.f117313g) {
            mo48494u(false, false);
            mo48496w();
            mo48491s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo48491s() {
        Drawable background;
        TextView textView;
        EditText editText = this.f117309c;
        if (editText != null && this.f117318l == 0 && (background = editText.getBackground()) != null) {
            Rect rect = C0571cn.f2215a;
            Drawable mutate = background.mutate();
            C44923ad adVar = this.f117310d;
            if (adVar.mo48517o(adVar.f117343d)) {
                mutate.setColorFilter(C0506ad.m1894b(this.f117310d.mo48503a(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f117313g || (textView = this.f117314h) == null) {
                mutate.clearColorFilter();
                this.f117309c.refreshDrawableState();
            } else {
                mutate.setColorFilter(C0506ad.m1894b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void setEnabled(boolean z) {
        m79762J(this, z);
        super.setEnabled(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo48493t() {
        Drawable drawable;
        EditText editText = this.f117309c;
        if (editText != null && this.f117272M != null) {
            if ((this.f117275P || editText.getBackground() == null) && this.f117318l != 0) {
                EditText editText2 = this.f117309c;
                if (!(editText2 instanceof AutoCompleteTextView) || C44957t.m79883a(editText2)) {
                    drawable = this.f117272M;
                } else {
                    int b = C44535e.m78719b(this.f117309c, R.attr.colorControlHighlight);
                    int i = this.f117318l;
                    if (i == 2) {
                        Context context = getContext();
                        C44779j jVar = this.f117272M;
                        int[][] iArr = f117259u;
                        int e = C44535e.m78722e(context, C44693c.m79227c(context, R.attr.colorSurface, "TextInputLayout"));
                        C44779j jVar2 = new C44779j(jVar.f116741C.f116718a);
                        int d = C44535e.m78721d(b, e, 0.1f);
                        jVar2.mo48124V(new ColorStateList(iArr, new int[]{d, 0}));
                        jVar2.setTintList(ColorStateList.valueOf(e));
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{d, e});
                        C44779j jVar3 = new C44779j(jVar.f116741C.f116718a);
                        jVar3.setTintList(ColorStateList.valueOf(-1));
                        drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
                    } else if (i == 1) {
                        C44779j jVar4 = this.f117272M;
                        int i2 = this.f117287ad;
                        drawable = new RippleDrawable(new ColorStateList(f117259u, new int[]{C44535e.m78721d(b, i2, 0.1f), i2}), jVar4, jVar4);
                    } else {
                        drawable = null;
                    }
                }
                C2043bi.m5530X(editText2, drawable);
                this.f117275P = true;
            }
        }
    }

    /* renamed from: u */
    public final void mo48494u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f117309c;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f117309c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f117320n;
        if (colorStateList2 != null) {
            this.f117323q.mo48062g(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f117320n;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f117304au);
            } else {
                i = this.f117304au;
            }
            this.f117323q.mo48062g(ColorStateList.valueOf(i));
        } else {
            C44923ad adVar = this.f117310d;
            if (adVar.mo48517o(adVar.f117343d)) {
                C44747g gVar = this.f117323q;
                TextView textView2 = this.f117310d.f117346g;
                gVar.mo48062g(textView2 != null ? textView2.getTextColors() : null);
            } else if (this.f117313g && (textView = this.f117314h) != null) {
                this.f117323q.mo48062g(textView.getTextColors());
            } else if (z4 && (colorStateList = this.f117321o) != null) {
                this.f117323q.mo48065j(colorStateList);
            }
        }
        if (z3 || !this.f117305av || (isEnabled() && z4)) {
            if (z2 || this.f117322p) {
                ValueAnimator valueAnimator = this.f117306aw;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f117306aw.cancel();
                }
                if (!z || !this.f117324r) {
                    this.f117323q.mo48071p(1.0f);
                } else {
                    mo48465d(1.0f);
                }
                this.f117322p = false;
                if (m79770R()) {
                    m79761I();
                }
                m79767O();
                C44931al alVar = this.f117283a;
                alVar.f117387d = false;
                alVar.mo48544e();
                C44962y yVar = this.f117308b;
                yVar.f117451j = false;
                yVar.mo48606p();
            }
        } else if (z2 || !this.f117322p) {
            ValueAnimator valueAnimator2 = this.f117306aw;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f117306aw.cancel();
            }
            if (!z || !this.f117324r) {
                this.f117323q.mo48071p(0.0f);
            } else {
                mo48465d(0.0f);
            }
            if (m79770R() && !((C44947j) this.f117272M).f117412a.isEmpty()) {
                m79758F();
            }
            this.f117322p = true;
            m79759G();
            C44931al alVar2 = this.f117283a;
            alVar2.f117387d = true;
            alVar2.mo48544e();
            C44962y yVar2 = this.f117308b;
            yVar2.f117451j = true;
            yVar2.mo48606p();
        }
    }

    /* renamed from: v */
    public final void mo48495v(Editable editable) {
        if (m79772a(editable) != 0 || this.f117322p) {
            m79759G();
        } else if (this.f117263D != null && this.f117316j && !TextUtils.isEmpty(this.f117315i)) {
            this.f117263D.setText(this.f117315i);
            C4199aj.m12054b(this.f117326v, this.f117266G);
            this.f117263D.setVisibility(0);
            this.f117263D.bringToFront();
            announceForAccessibility(this.f117315i);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r8.f117309c;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48496w() {
        /*
            r8 = this;
            com.google.android.material.l.j r0 = r8.f117272M
            if (r0 == 0) goto L_0x017d
            int r0 = r8.f117318l
            if (r0 != 0) goto L_0x000a
            goto L_0x017d
        L_0x000a:
            boolean r0 = r8.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r8.f117309c
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r8.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r8.f117309c
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            com.google.android.material.textfield.ad r4 = r8.f117310d
            int r5 = r4.f117343d
            boolean r4 = r4.mo48517o(r5)
            if (r4 != 0) goto L_0x0046
            android.widget.TextView r4 = r8.f117314h
            if (r4 == 0) goto L_0x0047
            boolean r4 = r8.f117313g
            if (r4 == 0) goto L_0x0047
        L_0x0046:
            r1 = 1
        L_0x0047:
            boolean r4 = r8.isEnabled()
            if (r4 != 0) goto L_0x0052
            int r4 = r8.f117304au
            r8.f117286ac = r4
            goto L_0x0091
        L_0x0052:
            com.google.android.material.textfield.ad r4 = r8.f117310d
            int r5 = r4.f117343d
            boolean r4 = r4.mo48517o(r5)
            if (r4 == 0) goto L_0x006d
            android.content.res.ColorStateList r4 = r8.f117299ap
            if (r4 == 0) goto L_0x0064
            r8.m79768P(r0, r3)
            goto L_0x0091
        L_0x0064:
            com.google.android.material.textfield.ad r4 = r8.f117310d
            int r4 = r4.mo48503a()
            r8.f117286ac = r4
            goto L_0x0091
        L_0x006d:
            boolean r4 = r8.f117313g
            if (r4 == 0) goto L_0x0082
            android.widget.TextView r4 = r8.f117314h
            if (r4 == 0) goto L_0x0082
            android.content.res.ColorStateList r5 = r8.f117299ap
            if (r5 == 0) goto L_0x007d
            r8.m79768P(r0, r3)
            goto L_0x0091
        L_0x007d:
            int r4 = r4.getCurrentTextColor()
            goto L_0x0086
        L_0x0082:
            if (r0 == 0) goto L_0x0089
            int r4 = r8.f117298ao
        L_0x0086:
            r8.f117286ac = r4
            goto L_0x0091
        L_0x0089:
            if (r3 == 0) goto L_0x008e
            int r4 = r8.f117297an
            goto L_0x0086
        L_0x008e:
            int r4 = r8.f117296am
            goto L_0x0086
        L_0x0091:
            android.content.Context r4 = r8.getContext()
            r5 = 2130969073(0x7f0401f1, float:1.7546818E38)
            android.util.TypedValue r5 = com.google.android.material.p3512i.C44693c.m79226b(r4, r5)
            r6 = 0
            if (r5 != 0) goto L_0x00a0
            goto L_0x00b5
        L_0x00a0:
            int r7 = r5.resourceId
            if (r7 == 0) goto L_0x00ab
            int r5 = r5.resourceId
            android.content.res.ColorStateList r6 = androidx.core.content.C1882h.m5138d(r4, r5)
            goto L_0x00b5
        L_0x00ab:
            int r4 = r5.data
            if (r4 == 0) goto L_0x00b5
            int r4 = r5.data
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r4)
        L_0x00b5:
            android.widget.EditText r4 = r8.f117309c
            if (r4 == 0) goto L_0x00d7
            android.graphics.drawable.Drawable r4 = r4.getTextCursorDrawable()
            if (r4 == 0) goto L_0x00d7
            if (r6 != 0) goto L_0x00c2
            goto L_0x00d7
        L_0x00c2:
            android.widget.EditText r4 = r8.f117309c
            android.graphics.drawable.Drawable r4 = r4.getTextCursorDrawable()
            if (r1 == 0) goto L_0x00d4
            android.content.res.ColorStateList r6 = r8.f117299ap
            if (r6 != 0) goto L_0x00d4
            int r1 = r8.f117286ac
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r1)
        L_0x00d4:
            androidx.core.graphics.drawable.C1929b.m5226g(r4, r6)
        L_0x00d7:
            com.google.android.material.textfield.y r1 = r8.f117308b
            r1.mo48604n()
            com.google.android.material.textfield.TextInputLayout r4 = r1.f117442a
            com.google.android.material.internal.CheckableImageButton r5 = r1.f117443b
            android.content.res.ColorStateList r6 = r1.f117444c
            com.google.android.material.textfield.C44920aa.m79800c(r4, r5, r6)
            r1.mo48593c()
            com.google.android.material.textfield.z r4 = r1.mo48591a()
            boolean r4 = r4.mo48585u()
            if (r4 == 0) goto L_0x012c
            com.google.android.material.textfield.TextInputLayout r4 = r1.f117442a
            com.google.android.material.textfield.ad r4 = r4.f117310d
            int r5 = r4.f117343d
            boolean r4 = r4.mo48517o(r5)
            if (r4 == 0) goto L_0x0121
            com.google.android.material.internal.CheckableImageButton r4 = r1.f117445d
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x0121
            com.google.android.material.internal.CheckableImageButton r4 = r1.f117445d
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            android.graphics.drawable.Drawable r4 = r4.mutate()
            com.google.android.material.textfield.TextInputLayout r5 = r1.f117442a
            com.google.android.material.textfield.ad r5 = r5.f117310d
            int r5 = r5.mo48503a()
            androidx.core.graphics.drawable.C1929b.m5225f(r4, r5)
            com.google.android.material.internal.CheckableImageButton r1 = r1.f117445d
            r1.setImageDrawable(r4)
            goto L_0x012c
        L_0x0121:
            com.google.android.material.textfield.TextInputLayout r4 = r1.f117442a
            com.google.android.material.internal.CheckableImageButton r5 = r1.f117445d
            android.content.res.ColorStateList r6 = r1.f117447f
            android.graphics.PorterDuff$Mode r1 = r1.f117448g
            com.google.android.material.textfield.C44920aa.m79799b(r4, r5, r6, r1)
        L_0x012c:
            com.google.android.material.textfield.al r1 = r8.f117283a
            r1.mo48540a()
            int r1 = r8.f117318l
            r4 = 2
            if (r1 != r4) goto L_0x015b
            int r1 = r8.f117282W
            if (r0 == 0) goto L_0x0145
            boolean r4 = r8.isEnabled()
            if (r4 == 0) goto L_0x0145
            int r4 = r8.f117285ab
            r8.f117282W = r4
            goto L_0x0149
        L_0x0145:
            int r4 = r8.f117284aa
            r8.f117282W = r4
        L_0x0149:
            if (r4 == r1) goto L_0x015b
            boolean r1 = r8.m79770R()
            if (r1 == 0) goto L_0x015b
            boolean r1 = r8.f117322p
            if (r1 != 0) goto L_0x015b
            r8.m79758F()
            r8.m79761I()
        L_0x015b:
            int r1 = r8.f117318l
            if (r1 != r2) goto L_0x017a
            boolean r1 = r8.isEnabled()
            if (r1 != 0) goto L_0x016a
            int r0 = r8.f117301ar
            r8.f117287ad = r0
            goto L_0x017a
        L_0x016a:
            if (r3 == 0) goto L_0x0171
            if (r0 != 0) goto L_0x0171
            int r0 = r8.f117303at
            goto L_0x0178
        L_0x0171:
            if (r0 == 0) goto L_0x0176
            int r0 = r8.f117302as
            goto L_0x0178
        L_0x0176:
            int r0 = r8.f117300aq
        L_0x0178:
            r8.f117287ad = r0
        L_0x017a:
            r8.m79757E()
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo48496w():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.f117384a.getVisibility() == 0) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48497x() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f117309c
            r1 = 0
            if (r0 == 0) goto L_0x0143
            com.google.android.material.textfield.al r0 = r10.f117283a
            com.google.android.material.internal.CheckableImageButton r0 = r0.f117386c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0021
            com.google.android.material.textfield.al r0 = r10.f117283a
            java.lang.CharSequence r6 = r0.f117385b
            if (r6 == 0) goto L_0x0062
            android.widget.TextView r0 = r0.f117384a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0062
        L_0x0021:
            com.google.android.material.textfield.al r0 = r10.f117283a
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0062
            com.google.android.material.textfield.al r0 = r10.f117283a
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f117309c
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f117291ah
            if (r6 == 0) goto L_0x003e
            int r6 = r10.f117292ai
            if (r6 == r0) goto L_0x004a
        L_0x003e:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f117291ah = r6
            r10.f117292ai = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x004a:
            android.widget.EditText r0 = r10.f117309c
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C2134u.m5916h(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f117291ah
            if (r6 == r7) goto L_0x007b
            android.widget.EditText r6 = r10.f117309c
            r8 = r0[r5]
            r9 = r0[r2]
            r0 = r0[r3]
            androidx.core.widget.C2134u.m5912d(r6, r7, r8, r9, r0)
            goto L_0x0079
        L_0x0062:
            android.graphics.drawable.Drawable r0 = r10.f117291ah
            if (r0 == 0) goto L_0x007b
            android.widget.EditText r0 = r10.f117309c
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C2134u.m5916h(r0)
            android.widget.EditText r6 = r10.f117309c
            r7 = r0[r5]
            r8 = r0[r2]
            r0 = r0[r3]
            androidx.core.widget.C2134u.m5912d(r6, r4, r7, r8, r0)
            r10.f117291ah = r4
        L_0x0079:
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            com.google.android.material.textfield.y r6 = r10.f117308b
            boolean r6 = r6.mo48609s()
            if (r6 != 0) goto L_0x009a
            com.google.android.material.textfield.y r6 = r10.f117308b
            boolean r6 = r6.mo48607q()
            if (r6 == 0) goto L_0x0094
            com.google.android.material.textfield.y r6 = r10.f117308b
            boolean r6 = r6.mo48608r()
            if (r6 != 0) goto L_0x009a
        L_0x0094:
            com.google.android.material.textfield.y r6 = r10.f117308b
            java.lang.CharSequence r6 = r6.f117449h
            if (r6 == 0) goto L_0x011f
        L_0x009a:
            com.google.android.material.textfield.y r6 = r10.f117308b
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x011f
            com.google.android.material.textfield.y r6 = r10.f117308b
            android.widget.TextView r6 = r6.f117450i
            int r6 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f117309c
            int r7 = r7.getPaddingRight()
            int r6 = r6 - r7
            com.google.android.material.textfield.y r7 = r10.f117308b
            boolean r8 = r7.mo48609s()
            if (r8 == 0) goto L_0x00bc
            com.google.android.material.internal.CheckableImageButton r4 = r7.f117443b
            goto L_0x00ca
        L_0x00bc:
            boolean r8 = r7.mo48607q()
            if (r8 == 0) goto L_0x00ca
            boolean r8 = r7.mo48608r()
            if (r8 == 0) goto L_0x00ca
            com.google.android.material.internal.CheckableImageButton r4 = r7.f117445d
        L_0x00ca:
            if (r4 == 0) goto L_0x00dc
            int r7 = r4.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = androidx.core.p098j.C2104s.m5790c(r4)
            int r6 = r6 + r4
        L_0x00dc:
            android.widget.EditText r4 = r10.f117309c
            android.graphics.drawable.Drawable[] r4 = androidx.core.widget.C2134u.m5916h(r4)
            android.graphics.drawable.Drawable r7 = r10.f117293aj
            if (r7 == 0) goto L_0x00fd
            int r8 = r10.f117294ak
            if (r8 == r6) goto L_0x00fd
            r10.f117294ak = r6
            r7.setBounds(r1, r1, r6, r5)
            android.widget.EditText r0 = r10.f117309c
            r1 = r4[r1]
            r2 = r4[r5]
            android.graphics.drawable.Drawable r6 = r10.f117293aj
            r3 = r4[r3]
            androidx.core.widget.C2134u.m5912d(r0, r1, r2, r6, r3)
            goto L_0x0142
        L_0x00fd:
            if (r7 != 0) goto L_0x010b
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f117293aj = r7
            r10.f117294ak = r6
            r7.setBounds(r1, r1, r6, r5)
        L_0x010b:
            r2 = r4[r2]
            android.graphics.drawable.Drawable r6 = r10.f117293aj
            if (r2 == r6) goto L_0x0141
            r10.f117295al = r2
            android.widget.EditText r0 = r10.f117309c
            r1 = r4[r1]
            r2 = r4[r5]
            r3 = r4[r3]
            androidx.core.widget.C2134u.m5912d(r0, r1, r2, r6, r3)
            goto L_0x0142
        L_0x011f:
            android.graphics.drawable.Drawable r6 = r10.f117293aj
            if (r6 == 0) goto L_0x0141
            android.widget.EditText r6 = r10.f117309c
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C2134u.m5916h(r6)
            r2 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f117293aj
            if (r2 != r7) goto L_0x013d
            android.widget.EditText r0 = r10.f117309c
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f117295al
            r3 = r6[r3]
            androidx.core.widget.C2134u.m5912d(r0, r1, r2, r7, r3)
            goto L_0x013e
        L_0x013d:
            r5 = r0
        L_0x013e:
            r10.f117293aj = r4
            goto L_0x0142
        L_0x0141:
            r5 = r0
        L_0x0142:
            return r5
        L_0x0143:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo48497x():boolean");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C44938as();

        /* renamed from: a */
        CharSequence f117331a;

        /* renamed from: b */
        boolean f117332b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f117331a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f117332b = parcel.readInt() != 1 ? false : true;
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String valueOf = String.valueOf(this.f117331a);
            return "TextInputLayout.SavedState{" + hexString + " error=" + valueOf + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            TextUtils.writeToParcel(this.f117331a, parcel, i);
            parcel.writeInt(this.f117332b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r7 = r21
            r8 = r22
            r9 = 2132151255(0x7f160bd7, float:1.9944568E38)
            r1 = r20
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f117328x = r10
            r0.f117329y = r10
            r0.f117330z = r10
            r0.f117260A = r10
            com.google.android.material.textfield.ad r11 = new com.google.android.material.textfield.ad
            r11.<init>(r0)
            r0.f117310d = r11
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f117288ae = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f117289af = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f117290ag = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f117319m = r1
            com.google.android.material.internal.g r12 = new com.google.android.material.internal.g
            r12.<init>(r0)
            r0.f117323q = r12
            android.content.Context r13 = r19.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r15 = 0
            r0.setWillNotDraw(r15)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f117326v = r6
            r6.setAddStatesFromChildren(r14)
            android.animation.TimeInterpolator r1 = com.google.android.material.p3504a.C44497b.f115650a
            r12.f116665p = r1
            r12.mo48061f(r15)
            android.animation.TimeInterpolator r1 = com.google.android.material.p3504a.C44497b.f115650a
            r12.f116664o = r1
            r12.mo48061f(r15)
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r12.mo48066k(r1)
            int[] r3 = com.google.android.material.textfield.C44930ak.f117383c
            r5 = 5
            int[] r4 = new int[r5]
            r4 = {22, 20, 37, 42, 46} // fill-array
            r16 = 2132151255(0x7f160bd7, float:1.9944568E38)
            r1 = r13
            r2 = r21
            r17 = r4
            r4 = r22
            r15 = 5
            r5 = r16
            r18 = r6
            r6 = r17
            android.support.v7.widget.ip r1 = com.google.android.material.internal.C44733be.m79296b(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.al r2 = new com.google.android.material.textfield.al
            r2.<init>(r0, r1)
            r0.f117283a = r2
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 45
            boolean r3 = r3.getBoolean(r4, r14)
            r0.f117270K = r3
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 4
            java.lang.CharSequence r3 = r3.getText(r4)
            r0.mo48474h(r3)
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 44
            boolean r3 = r3.getBoolean(r4, r14)
            r0.f117324r = r3
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 39
            boolean r3 = r3.getBoolean(r4, r14)
            r0.f117305av = r3
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 6
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x00d1
            android.content.res.TypedArray r3 = r1.f2596b
            int r3 = r3.getInt(r4, r10)
            r0.mo48478l(r3)
            goto L_0x00e3
        L_0x00d1:
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 3
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x00e3
            android.content.res.TypedArray r3 = r1.f2596b
            int r3 = r3.getDimensionPixelSize(r4, r10)
            r0.mo48479m(r3)
        L_0x00e3:
            android.content.res.TypedArray r3 = r1.f2596b
            boolean r3 = r3.hasValue(r15)
            r4 = 2
            if (r3 == 0) goto L_0x00f6
            android.content.res.TypedArray r3 = r1.f2596b
            int r3 = r3.getInt(r15, r10)
            r0.mo48476j(r3)
            goto L_0x0107
        L_0x00f6:
            android.content.res.TypedArray r3 = r1.f2596b
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x0107
            android.content.res.TypedArray r3 = r1.f2596b
            int r3 = r3.getDimensionPixelSize(r4, r10)
            r0.mo48477k(r3)
        L_0x0107:
            com.google.android.material.l.o r3 = com.google.android.material.p3515l.C44785p.m79428e(r13, r7, r8, r9)
            com.google.android.material.l.p r5 = new com.google.android.material.l.p
            r5.<init>(r3)
            r0.f117278S = r5
            android.content.res.Resources r3 = r13.getResources()
            r5 = 2131170539(0x7f0714eb, float:1.795544E38)
            int r3 = r3.getDimensionPixelOffset(r5)
            r0.f117280U = r3
            android.content.res.TypedArray r3 = r1.f2596b
            r5 = 9
            r6 = 0
            int r3 = r3.getDimensionPixelOffset(r5, r6)
            r0.f117281V = r3
            android.content.res.Resources r3 = r13.getResources()
            r5 = 2131170540(0x7f0714ec, float:1.7955441E38)
            int r3 = r3.getDimensionPixelSize(r5)
            android.content.res.TypedArray r5 = r1.f2596b
            r6 = 16
            int r3 = r5.getDimensionPixelSize(r6, r3)
            r0.f117284aa = r3
            android.content.res.Resources r3 = r13.getResources()
            r5 = 2131170541(0x7f0714ed, float:1.7955443E38)
            int r3 = r3.getDimensionPixelSize(r5)
            android.content.res.TypedArray r5 = r1.f2596b
            r6 = 17
            int r3 = r5.getDimensionPixelSize(r6, r3)
            r0.f117285ab = r3
            int r3 = r0.f117284aa
            r0.f117282W = r3
            r3 = 13
            float r3 = r1.mo3248g(r3)
            r5 = 12
            float r5 = r1.mo3248g(r5)
            r6 = 10
            float r6 = r1.mo3248g(r6)
            r7 = 11
            float r7 = r1.mo3248g(r7)
            com.google.android.material.l.p r8 = r0.f117278S
            com.google.android.material.l.o r9 = new com.google.android.material.l.o
            r9.<init>(r8)
            r8 = 0
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x017f
            r9.mo48144c(r3)
        L_0x017f:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0186
            r9.mo48145d(r5)
        L_0x0186:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x018d
            r9.mo48143b(r6)
        L_0x018d:
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0194
            r9.mo48142a(r7)
        L_0x0194:
            com.google.android.material.l.p r3 = new com.google.android.material.l.p
            r3.<init>(r9)
            r0.f117278S = r3
            r3 = 7
            android.content.res.ColorStateList r3 = com.google.android.material.p3512i.C44694d.m79231c(r13, r1, r3)
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01f9
            int r6 = r3.getDefaultColor()
            r0.f117300aq = r6
            r0.f117287ad = r6
            boolean r6 = r3.isStateful()
            if (r6 == 0) goto L_0x01d5
            int[] r6 = new int[r14]
            r7 = 0
            r6[r7] = r5
            int r6 = r3.getColorForState(r6, r10)
            r0.f117301ar = r6
            int[] r6 = new int[r4]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r3.getColorForState(r6, r10)
            r0.f117302as = r6
            int[] r6 = new int[r4]
            r6 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r6, r10)
            r0.f117303at = r3
            goto L_0x0204
        L_0x01d5:
            int r3 = r0.f117300aq
            r0.f117302as = r3
            r3 = 2131103120(0x7f060d90, float:1.7818697E38)
            android.content.res.ColorStateList r3 = androidx.core.content.C1882h.m5138d(r13, r3)
            int[] r6 = new int[r14]
            r7 = 0
            r6[r7] = r5
            int r6 = r3.getColorForState(r6, r10)
            r0.f117301ar = r6
            int[] r6 = new int[r14]
            r8 = 16843623(0x1010367, float:2.3696E-38)
            r6[r7] = r8
            int r3 = r3.getColorForState(r6, r10)
            r0.f117303at = r3
            goto L_0x0204
        L_0x01f9:
            r7 = 0
            r0.f117287ad = r7
            r0.f117300aq = r7
            r0.f117301ar = r7
            r0.f117302as = r7
            r0.f117303at = r7
        L_0x0204:
            android.content.res.TypedArray r3 = r1.f2596b
            boolean r3 = r3.hasValue(r14)
            if (r3 == 0) goto L_0x0214
            android.content.res.ColorStateList r3 = r1.mo3245a(r14)
            r0.f117321o = r3
            r0.f117320n = r3
        L_0x0214:
            r3 = 14
            android.content.res.ColorStateList r6 = com.google.android.material.p3512i.C44694d.m79231c(r13, r1, r3)
            android.content.res.TypedArray r7 = r1.f2596b
            r8 = 0
            int r3 = r7.getColor(r3, r8)
            r0.f117298ao = r3
            r3 = 2131103147(0x7f060dab, float:1.7818752E38)
            int r3 = androidx.core.content.C1878d.m5128a(r13, r3)
            r0.f117296am = r3
            r3 = 2131103148(0x7f060dac, float:1.7818754E38)
            int r3 = androidx.core.content.C1878d.m5128a(r13, r3)
            r0.f117304au = r3
            r3 = 2131103151(0x7f060daf, float:1.781876E38)
            int r3 = androidx.core.content.C1878d.m5128a(r13, r3)
            r0.f117297an = r3
            if (r6 == 0) goto L_0x027f
            boolean r3 = r6.isStateful()
            if (r3 == 0) goto L_0x026e
            int r3 = r6.getDefaultColor()
            r0.f117296am = r3
            int[] r3 = new int[r14]
            r7 = 0
            r3[r7] = r5
            int r3 = r6.getColorForState(r3, r10)
            r0.f117304au = r3
            int[] r3 = new int[r4]
            r3 = {16843623, 16842910} // fill-array
            int r3 = r6.getColorForState(r3, r10)
            r0.f117297an = r3
            int[] r3 = new int[r4]
            r3 = {16842908, 16842910} // fill-array
            int r3 = r6.getColorForState(r3, r10)
            r0.f117298ao = r3
            goto L_0x027c
        L_0x026e:
            int r3 = r0.f117298ao
            int r5 = r6.getDefaultColor()
            if (r3 == r5) goto L_0x027c
            int r3 = r6.getDefaultColor()
            r0.f117298ao = r3
        L_0x027c:
            r19.mo48496w()
        L_0x027f:
            android.content.res.TypedArray r3 = r1.f2596b
            r5 = 15
            boolean r3 = r3.hasValue(r5)
            if (r3 == 0) goto L_0x0296
            android.content.res.ColorStateList r3 = com.google.android.material.p3512i.C44694d.m79231c(r13, r1, r5)
            android.content.res.ColorStateList r5 = r0.f117299ap
            if (r5 == r3) goto L_0x0296
            r0.f117299ap = r3
            r19.mo48496w()
        L_0x0296:
            android.content.res.TypedArray r3 = r1.f2596b
            r5 = 46
            int r3 = r3.getResourceId(r5, r10)
            if (r3 == r10) goto L_0x02ab
            android.content.res.TypedArray r3 = r1.f2596b
            r6 = 0
            int r3 = r3.getResourceId(r5, r6)
            r0.mo48475i(r3)
            goto L_0x02ac
        L_0x02ab:
            r6 = 0
        L_0x02ac:
            android.content.res.TypedArray r3 = r1.f2596b
            r5 = 37
            int r3 = r3.getResourceId(r5, r6)
            android.content.res.TypedArray r5 = r1.f2596b
            r7 = 32
            java.lang.CharSequence r5 = r5.getText(r7)
            android.content.res.TypedArray r7 = r1.f2596b
            r8 = 33
            boolean r7 = r7.getBoolean(r8, r6)
            android.content.res.TypedArray r8 = r1.f2596b
            r9 = 42
            int r8 = r8.getResourceId(r9, r6)
            android.content.res.TypedArray r9 = r1.f2596b
            r13 = 41
            boolean r9 = r9.getBoolean(r13, r6)
            android.content.res.TypedArray r13 = r1.f2596b
            r15 = 40
            java.lang.CharSequence r13 = r13.getText(r15)
            android.content.res.TypedArray r15 = r1.f2596b
            r4 = 54
            int r4 = r15.getResourceId(r4, r6)
            android.content.res.TypedArray r15 = r1.f2596b
            r14 = 53
            java.lang.CharSequence r14 = r15.getText(r14)
            android.content.res.TypedArray r15 = r1.f2596b
            r10 = 18
            boolean r10 = r15.getBoolean(r10, r6)
            android.content.res.TypedArray r6 = r1.f2596b
            r15 = 19
            r21 = r13
            r13 = -1
            int r6 = r6.getInt(r15, r13)
            int r15 = r0.f117312f
            if (r15 == r6) goto L_0x0311
            if (r6 <= 0) goto L_0x0308
            r0.f117312f = r6
            goto L_0x030a
        L_0x0308:
            r0.f117312f = r13
        L_0x030a:
            boolean r6 = r0.f117311e
            if (r6 == 0) goto L_0x0311
            r19.m79764L()
        L_0x0311:
            android.content.res.TypedArray r6 = r1.f2596b
            r13 = 22
            r15 = 0
            int r6 = r6.getResourceId(r13, r15)
            r0.f117262C = r6
            android.content.res.TypedArray r6 = r1.f2596b
            r13 = 20
            int r6 = r6.getResourceId(r13, r15)
            r0.f117261B = r6
            android.content.res.TypedArray r6 = r1.f2596b
            r13 = 8
            int r6 = r6.getInt(r13, r15)
            int r13 = r0.f117318l
            if (r6 != r13) goto L_0x0333
            goto L_0x033c
        L_0x0333:
            r0.f117318l = r6
            android.widget.EditText r6 = r0.f117309c
            if (r6 == 0) goto L_0x033c
            r19.m79760H()
        L_0x033c:
            r11.mo48509g(r5)
            r11.mo48513k(r8)
            r11.mo48511i(r3)
            r0.mo48480n(r14)
            r0.mo48481o(r4)
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 38
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x035c
            android.content.res.ColorStateList r3 = r1.mo3245a(r4)
            r11.mo48512j(r3)
        L_0x035c:
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 43
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x036d
            android.content.res.ColorStateList r3 = r1.mo3245a(r4)
            r11.mo48515m(r3)
        L_0x036d:
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 47
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x0390
            android.content.res.ColorStateList r3 = r1.mo3245a(r4)
            android.content.res.ColorStateList r4 = r0.f117321o
            if (r4 == r3) goto L_0x0390
            android.content.res.ColorStateList r4 = r0.f117320n
            if (r4 != 0) goto L_0x0386
            r12.mo48065j(r3)
        L_0x0386:
            r0.f117321o = r3
            android.widget.EditText r3 = r0.f117309c
            if (r3 == 0) goto L_0x0390
            r3 = 0
            r0.mo48494u(r3, r3)
        L_0x0390:
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 23
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x03a7
            android.content.res.ColorStateList r3 = r1.mo3245a(r4)
            android.content.res.ColorStateList r4 = r0.f117268I
            if (r4 == r3) goto L_0x03a7
            r0.f117268I = r3
            r19.m79765M()
        L_0x03a7:
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 21
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x03be
            android.content.res.ColorStateList r3 = r1.mo3245a(r4)
            android.content.res.ColorStateList r4 = r0.f117269J
            if (r4 == r3) goto L_0x03be
            r0.f117269J = r3
            r19.m79765M()
        L_0x03be:
            android.content.res.TypedArray r3 = r1.f2596b
            r4 = 55
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L_0x03cf
            android.content.res.ColorStateList r3 = r1.mo3245a(r4)
            r0.mo48488p(r3)
        L_0x03cf:
            com.google.android.material.textfield.y r3 = new com.google.android.material.textfield.y
            r3.<init>(r0, r1)
            r0.f117308b = r3
            android.content.res.TypedArray r4 = r1.f2596b
            r5 = 1
            r6 = 0
            boolean r4 = r4.getBoolean(r6, r5)
            android.content.res.TypedArray r1 = r1.f2596b
            r1.recycle()
            r1 = 2
            androidx.core.p098j.C2043bi.m5551ae(r0, r1)
            androidx.core.p098j.C2043bi.m5552af(r0, r5)
            r1 = r18
            r1.addView(r2)
            r1.addView(r3)
            r0.addView(r1)
            m79762J(r0, r4)
            super.setEnabled(r4)
            r11.mo48514l(r9)
            r11.mo48510h(r7)
            boolean r1 = r0.f117311e
            if (r1 == r10) goto L_0x044c
            if (r10 == 0) goto L_0x0441
            android.support.v7.widget.AppCompatTextView r1 = new android.support.v7.widget.AppCompatTextView
            android.content.Context r2 = r19.getContext()
            r1.<init>(r2)
            r0.f117314h = r1
            r2 = 2131436531(0x7f0b23f3, float:1.8494935E38)
            r1.setId(r2)
            android.widget.TextView r1 = r0.f117314h
            r2 = 1
            r1.setMaxLines(r2)
            android.widget.TextView r1 = r0.f117314h
            r2 = 2
            r11.mo48504b(r1, r2)
            android.widget.TextView r1 = r0.f117314h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.content.res.Resources r2 = r19.getResources()
            r3 = 2131170542(0x7f0714ee, float:1.7955445E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            androidx.core.p098j.C2104s.m5794g(r1, r2)
            r19.m79765M()
            r19.m79764L()
            goto L_0x044a
        L_0x0441:
            android.widget.TextView r1 = r0.f117314h
            r2 = 2
            r11.mo48508f(r1, r2)
            r1 = 0
            r0.f117314h = r1
        L_0x044a:
            r0.f117311e = r10
        L_0x044c:
            r1 = r21
            r0.mo48471f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: H */
    private final void m79760H() {
        int i = this.f117318l;
        if (i == 0) {
            this.f117272M = null;
            this.f117276Q = null;
            this.f117277R = null;
        } else if (i == 1) {
            this.f117272M = new C44779j(this.f117278S);
            this.f117276Q = new C44779j();
            this.f117277R = new C44779j();
        } else if (i == 2) {
            if (!this.f117270K || (this.f117272M instanceof C44947j)) {
                this.f117272M = new C44779j(this.f117278S);
            } else {
                this.f117272M = new C44947j(this.f117278S);
            }
            this.f117276Q = null;
            this.f117277R = null;
        } else {
            throw new IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        mo48493t();
        mo48496w();
        if (this.f117318l == 1) {
            if (C44694d.m79234f(getContext())) {
                this.f117281V = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (C44694d.m79233e(getContext())) {
                this.f117281V = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f117309c != null && this.f117318l == 1) {
            if (C44694d.m79234f(getContext())) {
                EditText editText = this.f117309c;
                C2043bi.m5556aj(editText, C2043bi.m5583l(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), C2043bi.m5582k(this.f117309c), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C44694d.m79233e(getContext())) {
                EditText editText2 = this.f117309c;
                C2043bi.m5556aj(editText2, C2043bi.m5583l(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), C2043bi.m5582k(this.f117309c), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f117318l != 0) {
            m79766N();
        }
        EditText editText3 = this.f117309c;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.f117318l;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(m79754B());
                } else if (i2 == 1) {
                    if (this.f117274O == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.f117274O = stateListDrawable;
                        stateListDrawable.addState(new int[]{16842922}, m79754B());
                        this.f117274O.addState(new int[0], m79756D(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.f117274O);
                }
            }
        }
    }
}
