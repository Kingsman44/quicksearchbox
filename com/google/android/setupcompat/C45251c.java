package com.google.android.setupcompat;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.internal.C45257e;
import com.google.android.setupcompat.internal.C45258f;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.C45273c;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.android.setupcompat.logging.p3551a.C45271a;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3550b.C45244a;
import com.google.android.setupcompat.p3550b.C45245b;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45277d;
import com.google.android.setupcompat.template.C45281h;
import com.google.android.setupcompat.template.C45282i;

/* renamed from: com.google.android.setupcompat.c */
/* compiled from: PG */
public class C45251c extends TemplateLayout {

    /* renamed from: e */
    private static final C45245b f118184e = new C45245b("PartnerCustomizationLayout");

    /* renamed from: a */
    public Activity f118185a;

    /* renamed from: b */
    final ViewTreeObserver.OnWindowFocusChangeListener f118186b;

    /* renamed from: f */
    private boolean f118187f;

    /* renamed from: g */
    private boolean f118188g;

    /* renamed from: h */
    private boolean f118189h;

    public C45251c(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: a */
    public static Activity m80608a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m80608a(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    /* renamed from: m */
    private void m80609m(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45252d.f118192c, i, 0);
            boolean z = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
            if (z) {
                setSystemUiVisibility(1024);
            }
            mo49131l(C45281h.class, new C45281h(this, this.f118185a.getWindow(), attributeSet, i));
            mo49131l(C45282i.class, new C45282i(this, this.f118185a.getWindow()));
            mo49131l(C45275b.class, new C45275b(this, attributeSet, i));
            C45282i iVar = (C45282i) mo49129j(C45282i.class);
            TypedArray obtainStyledAttributes2 = iVar.f118297a.getContext().obtainStyledAttributes(attributeSet, C45252d.f118194e, i, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            iVar.f118301e = color;
            if (iVar.f118298b != null) {
                if (iVar.f118299c && !iVar.f118300d) {
                    Context context = iVar.f118297a.getContext();
                    color = C45240c.m80574e(context).mo49100b(context, C45238a.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                iVar.f118298b.setNavigationBarColor(color);
            }
            Window window = iVar.f118298b;
            boolean z2 = obtainStyledAttributes2.getBoolean(0, window == null || (window.getDecorView().getSystemUiVisibility() & 16) == 16);
            if (iVar.f118298b != null) {
                if (iVar.f118299c) {
                    Context context2 = iVar.f118297a.getContext();
                    z2 = C45240c.m80574e(context2).mo49105j(context2, C45238a.CONFIG_LIGHT_NAVIGATION_BAR, false);
                }
                if (z2) {
                    iVar.f118298b.getDecorView().setSystemUiVisibility(16 | iVar.f118298b.getDecorView().getSystemUiVisibility());
                } else {
                    iVar.f118298b.getDecorView().setSystemUiVisibility(iVar.f118298b.getDecorView().getSystemUiVisibility() & -17);
                }
            }
            TypedArray obtainStyledAttributes3 = iVar.f118297a.getContext().obtainStyledAttributes(new int[]{16844141});
            int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
            if (iVar.f118298b != null) {
                if (iVar.f118299c) {
                    Context context3 = iVar.f118297a.getContext();
                    if (C45240c.m80574e(context3).mo49107l(C45238a.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR)) {
                        color2 = C45240c.m80574e(context3).mo49100b(context3, C45238a.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR);
                    }
                }
                iVar.f118298b.setNavigationBarDividerColor(color2);
            }
            obtainStyledAttributes3.recycle();
            obtainStyledAttributes2.recycle();
            this.f118185a.getWindow().addFlags(LinearLayoutManager.INVALID_OFFSET);
            this.f118185a.getWindow().clearFlags(67108864);
            this.f118185a.getWindow().clearFlags(134217728);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo49117b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.partner_customization_layout;
        }
        return mo49128i(layoutInflater, 0, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ViewGroup mo49118c(int i) {
        if (i == 0) {
            i = R.id.suc_layout_content;
        }
        return (ViewGroup) findViewById(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo49119d(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.f118187f = true;
        Activity a = m80608a(getContext());
        this.f118185a = a;
        boolean b = C45250g.m80606b(a.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45252d.f118192c, i, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            f118184e.mo49113c("Attribute sucUsePartnerResource not found in ".concat(String.valueOf(String.valueOf(this.f118185a.getComponentName()))));
        }
        if (!b && !obtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.f118187f = z;
        this.f118189h = obtainStyledAttributes.hasValue(0);
        this.f118188g = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        C45245b bVar = f118184e;
        String simpleName = this.f118185a.getClass().getSimpleName();
        boolean z2 = this.f118187f;
        boolean z3 = this.f118189h;
        boolean z4 = this.f118188g;
        bVar.mo49111a("activity=" + simpleName + " isSetupFlow=" + b + " enablePartnerResourceLoading=true usePartnerResourceAttr=" + z2 + " useDynamicColor=" + z3 + " useFullDynamicColorAttr=" + z4);
    }

    /* renamed from: e */
    public final boolean mo49120e() {
        return this.f118189h && C45244a.m80595a() && C45240c.m80574e(getContext()).mo49106k();
    }

    /* renamed from: f */
    public final boolean mo49121f() {
        return this.f118187f && C45240c.m80574e(getContext()).mo49106k();
    }

    /* renamed from: g */
    public final boolean mo49122g() {
        return mo49120e() && this.f118188g;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C45257e.m80625a(this.f118185a);
        if (C45250g.m80606b(this.f118185a.getIntent())) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.f118186b);
        }
        C45275b bVar = (C45275b) mo49129j(C45275b.class);
        bVar.f118270j.mo49165b(bVar.mo49178i(), false);
        bVar.f118270j.mo49166c(bVar.mo49179j(), false);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        PersistableBundle persistableBundle2;
        super.onDetachedFromWindow();
        if (C45250g.m80606b(this.f118185a.getIntent())) {
            C45275b bVar = (C45275b) mo49129j(C45275b.class);
            C45271a aVar = bVar.f118270j;
            boolean i = bVar.mo49178i();
            boolean j = bVar.mo49179j();
            aVar.f118255a = C45271a.m80653a(aVar.f118255a, i);
            aVar.f118256b = C45271a.m80653a(aVar.f118256b, j);
            C45277d dVar = bVar.f118265e;
            C45277d dVar2 = bVar.f118266f;
            if (dVar != null) {
                persistableBundle = dVar.mo49182a("PrimaryFooterButton");
            } else {
                persistableBundle = PersistableBundle.EMPTY;
            }
            if (dVar2 != null) {
                persistableBundle2 = dVar2.mo49182a("SecondaryFooterButton");
            } else {
                persistableBundle2 = PersistableBundle.EMPTY;
            }
            C45271a aVar2 = bVar.f118270j;
            PersistableBundle persistableBundle3 = new PersistableBundle();
            persistableBundle3.putString("PrimaryButtonVisibility", aVar2.f118255a);
            persistableBundle3.putString("SecondaryButtonVisibility", aVar2.f118256b);
            C45273c.m80657a(getContext(), CustomEvent.m80650a(MetricKey.m80652b("SetupCompatMetrics", this.f118185a), C45258f.m80627b(persistableBundle3, persistableBundle, persistableBundle2)));
        }
        getViewTreeObserver().removeOnWindowFocusChangeListener(this.f118186b);
    }

    public C45251c(Context context, int i) {
        this(context, i, 0);
    }

    public C45251c(Context context, int i, int i2) {
        super(context, i, i2);
        this.f118186b = new C45243b(this);
        m80609m((AttributeSet) null, R.attr.sucLayoutTheme);
    }

    public C45251c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f118186b = new C45243b(this);
        m80609m(attributeSet, R.attr.sucLayoutTheme);
    }

    public C45251c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118186b = new C45243b(this);
        m80609m(attributeSet, i);
    }
}
