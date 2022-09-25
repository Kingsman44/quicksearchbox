package com.google.android.libraries.material.opensearchbar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.p035b.p036a.C0407b;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.Toolbar;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.C1769b;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.graphics.drawable.C1931d;
import androidx.core.p098j.C2043bi;
import androidx.customview.view.AbsSavedState;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.C44735bg;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.internal.C44751k;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.p3508e.C44654a;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public class OpenSearchView extends FrameLayout implements C1769b {

    /* renamed from: a */
    final View f77599a;

    /* renamed from: b */
    final ClippableRoundedCornerLayout f77600b;

    /* renamed from: c */
    final View f77601c;

    /* renamed from: d */
    final View f77602d;

    /* renamed from: e */
    final FrameLayout f77603e;

    /* renamed from: f */
    final FrameLayout f77604f;

    /* renamed from: g */
    final MaterialToolbar f77605g;

    /* renamed from: h */
    final Toolbar f77606h;

    /* renamed from: i */
    final TextView f77607i;

    /* renamed from: j */
    public final EditText f77608j;

    /* renamed from: k */
    final ImageButton f77609k;

    /* renamed from: l */
    final View f77610l;

    /* renamed from: m */
    final TouchObserverFrameLayout f77611m;

    /* renamed from: n */
    public final C28571z f77612n;

    /* renamed from: o */
    public OpenSearchBar f77613o;

    /* renamed from: p */
    public boolean f77614p;

    /* renamed from: q */
    public boolean f77615q;

    /* renamed from: r */
    public int f77616r;

    /* renamed from: s */
    private final boolean f77617s;

    /* renamed from: t */
    private final C44654a f77618t;

    /* renamed from: u */
    private final Set f77619u;

    /* renamed from: v */
    private int f77620v;

    /* renamed from: w */
    private boolean f77621w;

    /* renamed from: x */
    private Map f77622x;

    /* compiled from: PG */
    public class Behavior extends C1770c {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            OpenSearchView openSearchView = (OpenSearchView) view;
            if (openSearchView.f77613o != null || !(view2 instanceof OpenSearchBar)) {
                return false;
            }
            openSearchView.mo34108j((OpenSearchBar) view2);
            return false;
        }
    }

    public OpenSearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: m */
    private final float m53411m() {
        OpenSearchBar openSearchBar = this.f77613o;
        if (openSearchBar == null) {
            return getResources().getDimension(R.dimen.google_opensearchview_elevation);
        }
        C44779j jVar = openSearchBar.f77588F;
        if (jVar != null) {
            return jVar.f116741C.f116732o;
        }
        return C2043bi.m5533a(openSearchBar);
    }

    /* renamed from: n */
    private final void m53412n(float f) {
        C44654a aVar = this.f77618t;
        if (aVar != null && this.f77601c != null) {
            this.f77601c.setBackgroundColor(aVar.mo47887b(aVar.f116338b, f));
        }
    }

    /* renamed from: o */
    private final void m53413o(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f77600b.getId()) != null) {
                    m53413o((ViewGroup) childAt, z);
                } else if (!z) {
                    Map map = this.f77622x;
                    if (map != null && map.containsKey(childAt)) {
                        C2043bi.m5551ae(childAt, ((Integer) this.f77622x.get(childAt)).intValue());
                    }
                } else {
                    this.f77622x.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C2043bi.m5551ae(childAt, 4);
                }
            }
        }
    }

    /* renamed from: p */
    private final void m53414p() {
        ImageButton b = C44735bg.m79303b(this.f77605g);
        if (b != null) {
            int i = this.f77600b.getVisibility() == 0 ? 1 : 0;
            Drawable a = C1931d.m5231a(b.getDrawable());
            if (a instanceof C0407b) {
                ((C0407b) a).mo1371b((float) i);
            }
            if (a instanceof C44751k) {
                ((C44751k) a).mo48077a((float) i);
            }
        }
    }

    /* renamed from: a */
    public final C1770c mo4952a() {
        return new Behavior();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f77617s) {
            this.f77611m.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo34100b(C28559n nVar) {
        this.f77619u.add(nVar);
    }

    /* renamed from: c */
    public final void mo34101c() {
        this.f77608j.clearFocus();
        C44741bm.m79314g(this.f77608j, false);
    }

    /* renamed from: d */
    public final void mo34102d() {
        this.f77608j.setText(BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34104f() {
        if (this.f77621w) {
            this.f77608j.post(new C28553h(this));
        }
    }

    /* renamed from: g */
    public final void mo34105g(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.f77622x = new HashMap(viewGroup.getChildCount());
        }
        m53413o(viewGroup, z);
        if (!z) {
            this.f77622x = null;
        }
    }

    /* renamed from: h */
    public final void mo34106h(Window window) {
        if (window != null) {
            this.f77620v = window.getAttributes().softInputMode;
        }
    }

    /* renamed from: i */
    public final void mo34107i(int i) {
        if (this.f77602d.getLayoutParams().height != i) {
            this.f77602d.getLayoutParams().height = i;
            this.f77602d.requestLayout();
        }
    }

    /* renamed from: j */
    public final void mo34108j(OpenSearchBar openSearchBar) {
        this.f77613o = openSearchBar;
        this.f77612n.f77657e = openSearchBar;
        if (openSearchBar != null) {
            openSearchBar.setOnClickListener(new C28551f(this));
        }
        MaterialToolbar materialToolbar = this.f77605g;
        if (materialToolbar != null && !(C1931d.m5231a(materialToolbar.mo2391e()) instanceof C0407b)) {
            if (this.f77613o == null) {
                this.f77605g.mo2417r(R.drawable.quantum_gm_ic_arrow_back_vd_theme_24);
            } else {
                Drawable mutate = C0678gm.m2375e().mo3100c(getContext(), R.drawable.quantum_gm_ic_arrow_back_vd_theme_24).mutate();
                Integer num = this.f77605g.f115726B;
                if (num != null) {
                    C1929b.m5225f(mutate, num.intValue());
                }
                this.f77605g.mo2418s(new C44751k(this.f77613o.mo2391e(), mutate));
                m53414p();
            }
        }
        m53412n(m53411m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo34109k() {
        return this.f77620v == 48;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79412c(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinishInflate() {
        /*
            r8 = this;
            super.onFinishInflate()
            android.content.Context r0 = r8.getContext()
            android.app.Activity r0 = com.google.android.material.internal.C44748h.m79352a(r0)
            if (r0 == 0) goto L_0x0043
            android.view.Window r0 = r0.getWindow()
            r8.mo34106h(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x003a
        L_0x001a:
            android.view.WindowManager$LayoutParams r3 = r0.getAttributes()
            int r4 = r3.flags
            int r3 = r3.flags
            r5 = 512(0x200, float:7.175E-43)
            r3 = r3 & r5
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r6 = 768(0x300, float:1.076E-42)
            r0 = r0 & r6
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r7
            if (r4 == r7) goto L_0x0039
            if (r3 == r5) goto L_0x0039
            if (r0 != r6) goto L_0x0018
        L_0x0039:
            r0 = 1
        L_0x003a:
            android.view.View r3 = r8.f77602d
            if (r2 == r0) goto L_0x0040
            r1 = 8
        L_0x0040:
            r3.setVisibility(r1)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.opensearchbar.OpenSearchView.onFinishInflate():void");
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        this.f77608j.setText(savedState.f77623a);
        int i = savedState.f77624b;
        boolean z = true;
        int i2 = 0;
        boolean z2 = i == 0;
        if (this.f77600b.getVisibility() != 0) {
            z = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f77600b;
        if (i != 0) {
            i2 = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i2);
        m53414p();
        if (z != z2) {
            mo34105g(z2);
        }
        mo34110l(i == 0 ? 4 : 2);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        String str;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = this.f77608j.getText();
        if (text == null) {
            str = null;
        } else {
            str = text.toString();
        }
        savedState.f77623a = str;
        savedState.f77624b = this.f77600b.getVisibility();
        return savedState;
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        m53412n(f);
    }

    public OpenSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchViewStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo34110l(int i) {
        int i2 = this.f77616r;
        if (i2 == 0) {
            throw null;
        } else if (i2 != i) {
            this.f77616r = i;
            for (C28559n a : new LinkedHashSet(this.f77619u)) {
                a.mo18126a(i2, i);
            }
        }
    }

    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C28558m();

        /* renamed from: a */
        String f77623a;

        /* renamed from: b */
        int f77624b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f77623a = parcel.readString();
            this.f77624b = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeString(this.f77623a);
            parcel.writeInt(this.f77624b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenSearchView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r2 = r21
            r4 = r22
            r1 = 2132151371(0x7f160c4b, float:1.9944803E38)
            r3 = r20
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r3, r2, r4, r1)
            r0.<init>(r1, r2, r4)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f77619u = r1
            r1 = 16
            r0.f77620v = r1
            r7 = 2
            r0.f77616r = r7
            android.content.Context r8 = r19.getContext()
            int[] r3 = com.google.android.libraries.material.opensearchbar.C28546aa.f77626b
            r5 = 2132151371(0x7f160c4b, float:1.9944803E38)
            r9 = 0
            int[] r6 = new int[r9]
            r1 = r8
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            r2 = 6
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = r1.getResourceId(r9, r3)
            r5 = 1
            java.lang.String r6 = r1.getString(r5)
            java.lang.String r7 = r1.getString(r7)
            r10 = 8
            java.lang.String r11 = r1.getString(r10)
            r12 = 9
            boolean r12 = r1.getBoolean(r12, r9)
            r13 = 4
            boolean r13 = r1.getBoolean(r13, r5)
            r0.f77614p = r13
            r13 = 3
            boolean r13 = r1.getBoolean(r13, r5)
            r0.f77615q = r13
            r13 = 7
            boolean r13 = r1.getBoolean(r13, r9)
            r14 = 5
            boolean r14 = r1.getBoolean(r14, r5)
            r0.f77621w = r14
            r1.recycle()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r14 = 2131626282(0x7f0e092a, float:1.8879796E38)
            r1.inflate(r14, r0)
            r0.f77617s = r5
            r1 = 2131434187(0x7f0b1acb, float:1.849018E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.f77599a = r1
            r1 = 2131434186(0x7f0b1aca, float:1.8490179E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = (com.google.android.material.internal.ClippableRoundedCornerLayout) r1
            r0.f77600b = r1
            r14 = 2131434179(0x7f0b1ac3, float:1.8490165E38)
            android.view.View r14 = r0.findViewById(r14)
            r0.f77601c = r14
            r14 = 2131434189(0x7f0b1acd, float:1.8490185E38)
            android.view.View r14 = r0.findViewById(r14)
            r0.f77602d = r14
            r15 = 2131434185(0x7f0b1ac9, float:1.8490177E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            r0.f77603e = r15
            r10 = 2131434191(0x7f0b1acf, float:1.8490189E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r0.f77604f = r10
            r10 = 2131434190(0x7f0b1ace, float:1.8490187E38)
            android.view.View r10 = r0.findViewById(r10)
            com.google.android.material.appbar.MaterialToolbar r10 = (com.google.android.material.appbar.MaterialToolbar) r10
            r0.f77605g = r10
            r5 = 2131434183(0x7f0b1ac7, float:1.8490173E38)
            android.view.View r5 = r0.findViewById(r5)
            android.support.v7.widget.Toolbar r5 = (android.support.p033v7.widget.Toolbar) r5
            r0.f77606h = r5
            r5 = 2131434188(0x7f0b1acc, float:1.8490183E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f77607i = r5
            r9 = 2131434184(0x7f0b1ac8, float:1.8490175E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0.f77608j = r9
            r3 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r0.f77609k = r3
            r16 = r14
            r14 = 2131434182(0x7f0b1ac6, float:1.849017E38)
            android.view.View r14 = r0.findViewById(r14)
            r0.f77610l = r14
            r17 = r14
            r14 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r14 = r0.findViewById(r14)
            com.google.android.material.internal.TouchObserverFrameLayout r14 = (com.google.android.material.internal.TouchObserverFrameLayout) r14
            r0.f77611m = r14
            r18 = r14
            com.google.android.libraries.material.opensearchbar.z r14 = new com.google.android.libraries.material.opensearchbar.z
            r14.<init>(r0)
            r0.f77612n = r14
            com.google.android.material.e.a r14 = new com.google.android.material.e.a
            r14.<init>(r8)
            r0.f77618t = r14
            com.google.android.libraries.material.opensearchbar.d r8 = com.google.android.libraries.material.opensearchbar.C28549d.f77628a
            r1.setOnTouchListener(r8)
            float r1 = r19.m53411m()
            r0.m53412n(r1)
            r1 = -1
            if (r2 == r1) goto L_0x0137
            android.content.Context r1 = r19.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r8 = 0
            android.view.View r1 = r1.inflate(r2, r15, r8)
            r15.addView(r1)
            r15.setVisibility(r8)
            goto L_0x0138
        L_0x0137:
            r8 = 0
        L_0x0138:
            r5.setText(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r2 = 1
            if (r2 == r1) goto L_0x0144
            r1 = 0
            goto L_0x0146
        L_0x0144:
            r1 = 8
        L_0x0146:
            r5.setVisibility(r1)
            r1 = -1
            if (r4 == r1) goto L_0x014f
            r9.setTextAppearance(r4)
        L_0x014f:
            r9.setText(r6)
            r9.setHint(r7)
            r1 = 2130969124(0x7f040224, float:1.7546921E38)
            if (r13 == 0) goto L_0x015f
            r2 = 0
            r10.mo2418s(r2)
            goto L_0x017c
        L_0x015f:
            com.google.android.libraries.material.opensearchbar.c r2 = new com.google.android.libraries.material.opensearchbar.c
            r2.<init>(r0)
            r10.mo2419t(r2)
            if (r12 == 0) goto L_0x017c
            android.support.v7.b.a.b r2 = new android.support.v7.b.a.b
            android.content.Context r4 = r19.getContext()
            r2.<init>(r4)
            int r4 = com.google.android.material.p3505b.C44535e.m78719b(r0, r1)
            r2.mo1370a(r4)
            r10.mo2418s(r2)
        L_0x017c:
            com.google.android.libraries.material.opensearchbar.g r2 = new com.google.android.libraries.material.opensearchbar.g
            r2.<init>(r0)
            r3.setOnClickListener(r2)
            com.google.android.libraries.material.opensearchbar.l r2 = new com.google.android.libraries.material.opensearchbar.l
            r2.<init>(r0)
            r9.addTextChangedListener(r2)
            int r1 = com.google.android.material.p3505b.C44535e.m78719b(r0, r1)
            r2 = 1106562252(0x41f4cccc, float:30.599998)
            int r2 = java.lang.Math.round(r2)
            int r1 = androidx.core.graphics.C1924a.m5189h(r1, r2)
            r2 = r17
            r2.setBackgroundColor(r1)
            com.google.android.libraries.material.opensearchbar.j r1 = new com.google.android.libraries.material.opensearchbar.j
            r1.<init>(r0)
            r14 = r18
            r14.f116526a = r1
            com.google.android.libraries.material.opensearchbar.e r1 = new com.google.android.libraries.material.opensearchbar.e
            r1.<init>(r0)
            com.google.android.material.internal.C44741bm.m79313f(r10, r1)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r3 = r1.leftMargin
            int r4 = r1.rightMargin
            com.google.android.libraries.material.opensearchbar.i r5 = new com.google.android.libraries.material.opensearchbar.i
            r5.<init>(r1, r3, r4)
            androidx.core.p098j.C2043bi.m5555ai(r2, r5)
            android.content.res.Resources r1 = r19.getResources()
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            java.lang.String r4 = "status_bar_height"
            int r1 = r1.getIdentifier(r4, r2, r3)
            if (r1 <= 0) goto L_0x01dc
            android.content.res.Resources r2 = r19.getResources()
            int r9 = r2.getDimensionPixelSize(r1)
            goto L_0x01dd
        L_0x01dc:
            r9 = 0
        L_0x01dd:
            r0.mo34107i(r9)
            com.google.android.libraries.material.opensearchbar.k r1 = new com.google.android.libraries.material.opensearchbar.k
            r1.<init>(r0)
            r2 = r16
            androidx.core.p098j.C2043bi.m5555ai(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.opensearchbar.OpenSearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public final void mo34103e() {
        int i = this.f77616r;
        if (i == 0) {
            throw null;
        } else if (i != 2 && i != 1) {
            C28571z zVar = this.f77612n;
            if (zVar.f77657e != null) {
                OpenSearchView openSearchView = zVar.f77653a;
                if (openSearchView.mo34109k()) {
                    openSearchView.mo34101c();
                }
                AnimatorSet a = zVar.mo34148a(false);
                a.addListener(new C28567v(zVar));
                a.start();
            } else {
                OpenSearchView openSearchView2 = zVar.f77653a;
                if (openSearchView2.mo34109k()) {
                    openSearchView2.mo34101c();
                }
                AnimatorSet b = zVar.mo34149b(false);
                b.addListener(new C28569x(zVar));
                b.start();
            }
            mo34105g(false);
        }
    }
}
