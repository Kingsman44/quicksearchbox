package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.C52227jy;
import com.google.common.p4526f.C59071e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gv */
/* compiled from: PG */
public final class C108387gv extends C108232bc {

    /* renamed from: a */
    public static final C59071e f301461a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.gv");

    /* renamed from: D */
    public final List f301462D = new ArrayList();

    /* renamed from: E */
    final List f301463E = new ArrayList();

    /* renamed from: F */
    boolean f301464F;

    /* renamed from: G */
    public final double[] f301465G;

    /* renamed from: H */
    public final int f301466H;

    /* renamed from: I */
    public final ArrayDeque f301467I;

    /* renamed from: J */
    public final Object f301468J = new Object();

    /* renamed from: K */
    final AccessibilityManager f301469K;

    /* renamed from: L */
    public final List f301470L = new ArrayList();

    /* renamed from: M */
    public final List f301471M = new ArrayList();

    /* renamed from: N */
    final C107129a f301472N;

    /* renamed from: b */
    public final Context f301473b;

    /* renamed from: c */
    public final List f301474c;

    /* renamed from: d */
    public final C108388gw f301475d;

    /* renamed from: e */
    public final C91189au f301476e;

    /* renamed from: f */
    public final C22871g f301477f;

    /* renamed from: g */
    public final C86124t f301478g;

    /* renamed from: h */
    public final C52227jy f301479h;

    public C108387gv(Context context, List list, C108388gw gwVar, C91189au auVar, C22871g gVar, C52227jy jyVar, C107129a aVar, C86124t tVar) {
        super((byte[]) null);
        this.f301473b = context;
        this.f301474c = list;
        this.f301475d = gwVar;
        this.f301476e = auVar;
        this.f301477f = gVar;
        this.f301479h = jyVar;
        this.f301472N = aVar;
        this.f301478g = tVar;
        this.f301465G = new double[3];
        this.f301466H = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_horizontal_padding);
        this.f301467I = new ArrayDeque();
        this.f301469K = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* renamed from: f */
    private final void m180155f() {
        for (int i = 0; i < this.f301463E.size(); i++) {
            SelectionBadge selectionBadge = (SelectionBadge) this.f301463E.get(i);
            if (this.f301464F) {
                selectionBadge.setVisibility(0);
            } else {
                if (selectionBadge.isChecked()) {
                    selectionBadge.toggle();
                }
                selectionBadge.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo96828b(String str) {
        AccessibilityManager accessibilityManager = this.f301469K;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(this.f301473b.getPackageName());
            obtain.getText().add(str);
            this.f301469K.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: c */
    public final boolean mo96829c() {
        if (!this.f301464F) {
            return false;
        }
        this.f301464F = false;
        m180155f();
        return true;
    }

    /* renamed from: e */
    public final void mo96830e() {
        if (!this.f301464F) {
            this.f301464F = true;
            m180155f();
        }
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 0;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 20;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        ViewGroup viewGroup = blVar.f301060J;
        for (int i = 0; i < 3; i++) {
            LinearLayout linearLayout = new LinearLayout(this.f301473b);
            linearLayout.setOrientation(1);
            int i2 = this.f301466H;
            linearLayout.setPadding(i2, 0, i2, 0);
            viewGroup.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
            this.f301462D.add(linearLayout);
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C108385gt(this, viewGroup));
        C107129a aVar = this.f301472N;
        aVar.f298207b = true;
        aVar.mo95793b();
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        this.f301475d.mo95798c();
        blVar.f301060J.removeAllViews();
    }
}
