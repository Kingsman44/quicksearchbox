package com.google.android.setupcompat.template;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.C45252d;
import com.google.android.setupcompat.internal.C45256d;
import com.google.android.setupcompat.internal.C45259g;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.p3551a.C45271a;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.setupcompat.template.b */
/* compiled from: PG */
public class C45275b implements C45280g {

    /* renamed from: a */
    final boolean f118261a;

    /* renamed from: b */
    final boolean f118262b;

    /* renamed from: c */
    final boolean f118263c;

    /* renamed from: d */
    public LinearLayout f118264d;

    /* renamed from: e */
    public C45277d f118265e;

    /* renamed from: f */
    public C45277d f118266f;

    /* renamed from: g */
    int f118267g;

    /* renamed from: h */
    int f118268h;

    /* renamed from: i */
    final int f118269i;

    /* renamed from: j */
    public final C45271a f118270j;

    /* renamed from: k */
    private final Context f118271k;

    /* renamed from: l */
    private final ViewStub f118272l;

    /* renamed from: m */
    private int f118273m;

    /* renamed from: n */
    private int f118274n;

    /* renamed from: o */
    private int f118275o;

    /* renamed from: p */
    private int f118276p;

    /* renamed from: q */
    private final int f118277q;

    /* renamed from: r */
    private final int f118278r;

    /* renamed from: s */
    private boolean f118279s = false;

    static {
        new AtomicInteger(1);
    }

    public C45275b(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        C45271a aVar = new C45271a();
        this.f118270j = aVar;
        Context context = templateLayout.getContext();
        this.f118271k = context;
        this.f118272l = (ViewStub) templateLayout.mo49127h(R.id.suc_layout_footer);
        C45279f.f118292a.clear();
        C45251c cVar = (C45251c) templateLayout;
        this.f118261a = cVar.mo49121f();
        this.f118262b = cVar.mo49120e();
        this.f118263c = cVar.mo49122g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45252d.f118190a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.f118269i = dimensionPixelSize;
        this.f118275o = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.f118276p = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
        this.f118267g = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f118268h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f118277q = obtainStyledAttributes.getColor(12, 0);
        this.f118278r = obtainStyledAttributes.getColor(14, 0);
        int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(15, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            mo49176g(C45278e.m80678a(resourceId2, context), false);
            aVar.mo49165b(true, true);
        }
        if (resourceId != 0) {
            mo49175f(C45278e.m80678a(resourceId, context));
            aVar.mo49166c(true, true);
        }
    }

    /* renamed from: k */
    private final int m80658k(C45277d dVar, int i, C45238a aVar) {
        int i2 = dVar.f118288d;
        if (i2 != 0 && !this.f118261a) {
            i = i2;
        }
        if (this.f118261a) {
            return C45240c.m80574e(this.f118271k).mo49100b(this.f118271k, aVar) == 0 ? 2132150097 : 2132150096;
        }
        return i;
    }

    /* renamed from: l */
    private final LinearLayout m80659l() {
        int a;
        if (this.f118264d == null) {
            if (this.f118272l != null) {
                this.f118272l.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.f118271k, 2132150099)));
                this.f118272l.setLayoutResource(R.layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.f118272l.inflate();
                this.f118264d = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(this.f118267g, this.f118275o, this.f118268h, this.f118276p);
                    if (mo49177h()) {
                        linearLayout.setGravity(8388629);
                    }
                }
                LinearLayout linearLayout2 = this.f118264d;
                if (linearLayout2 != null && this.f118261a) {
                    if (!this.f118263c) {
                        linearLayout2.setBackgroundColor(C45240c.m80574e(this.f118271k).mo49100b(this.f118271k, C45238a.CONFIG_FOOTER_BAR_BG_COLOR));
                    }
                    if (C45240c.m80574e(this.f118271k).mo49107l(C45238a.CONFIG_FOOTER_BUTTON_PADDING_TOP)) {
                        this.f118275o = (int) C45240c.m80574e(this.f118271k).mo49099a(this.f118271k, C45238a.CONFIG_FOOTER_BUTTON_PADDING_TOP, 0.0f);
                    }
                    if (C45240c.m80574e(this.f118271k).mo49107l(C45238a.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM)) {
                        this.f118276p = (int) C45240c.m80574e(this.f118271k).mo49099a(this.f118271k, C45238a.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM, 0.0f);
                    }
                    if (C45240c.m80574e(this.f118271k).mo49107l(C45238a.CONFIG_FOOTER_BAR_PADDING_START)) {
                        this.f118267g = (int) C45240c.m80574e(this.f118271k).mo49099a(this.f118271k, C45238a.CONFIG_FOOTER_BAR_PADDING_START, 0.0f);
                    }
                    if (C45240c.m80574e(this.f118271k).mo49107l(C45238a.CONFIG_FOOTER_BAR_PADDING_END)) {
                        this.f118268h = (int) C45240c.m80574e(this.f118271k).mo49099a(this.f118271k, C45238a.CONFIG_FOOTER_BAR_PADDING_END, 0.0f);
                    }
                    linearLayout2.setPadding(this.f118267g, this.f118275o, this.f118268h, this.f118276p);
                    if (C45240c.m80574e(this.f118271k).mo49107l(C45238a.CONFIG_FOOTER_BAR_MIN_HEIGHT) && (a = (int) C45240c.m80574e(this.f118271k).mo49099a(this.f118271k, C45238a.CONFIG_FOOTER_BAR_MIN_HEIGHT, 0.0f)) > 0) {
                        linearLayout2.setMinimumHeight(a);
                    }
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.f118264d;
    }

    /* renamed from: m */
    private static C45238a m80660m(int i) {
        switch (i) {
            case 1:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return C45238a.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    /* renamed from: n */
    private final FooterActionButton m80661n(C45277d dVar, C45256d dVar2) {
        FooterActionButton footerActionButton = (FooterActionButton) LayoutInflater.from(new ContextThemeWrapper(this.f118271k, dVar2.f118216n)).inflate(R.layout.suc_button, (ViewGroup) null, false);
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(dVar.f118286b);
        footerActionButton.setOnClickListener(dVar);
        footerActionButton.setVisibility(dVar.f118287c);
        footerActionButton.setEnabled(true);
        footerActionButton.f118257a = dVar;
        dVar.f118289e = new C45274a(this, footerActionButton.getId());
        return footerActionButton;
    }

    /* renamed from: o */
    private final void m80662o(Button button, C45256d dVar) {
        if (this.f118261a) {
            C45279f.m80680a(this.f118271k, button, this.f118262b, button.getId() == this.f118273m, dVar);
            if (!this.f118262b) {
                C45238a aVar = dVar.f118208f;
                C45238a aVar2 = dVar.f118206d;
                if (button.isEnabled()) {
                    C45279f.m80684e(this.f118271k, button, aVar);
                } else {
                    C45279f.m80683d(this.f118271k, button, aVar2);
                }
            }
        }
    }

    /* renamed from: p */
    private final void m80663p() {
        LinearLayout l = m80659l();
        View view = new View(this.f118271k);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        view.setVisibility(4);
        l.addView(view);
    }

    /* renamed from: a */
    public final Button mo49170a() {
        LinearLayout linearLayout = this.f118264d;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.f118273m);
    }

    /* renamed from: b */
    public final Button mo49171b() {
        LinearLayout linearLayout = this.f118264d;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.f118274n);
    }

    /* renamed from: c */
    public final void mo49172c() {
        Button a = mo49170a();
        Button b = mo49171b();
        boolean z = true;
        int i = 0;
        boolean z2 = a != null && a.getVisibility() == 0;
        if (b == null || b.getVisibility() != 0) {
            z = false;
        }
        LinearLayout linearLayout = this.f118264d;
        if (linearLayout != null) {
            if (!z2 && !z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo49173d(Button button, int i) {
        if (!this.f118262b && i != 0) {
            C45279f.m80682c(button, i);
        }
        this.f118264d.addView(button);
        mo49172c();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49174e() {
        /*
            r9 = this;
            android.widget.LinearLayout r0 = r9.m80659l()
            android.widget.Button r1 = r9.mo49170a()
            android.widget.Button r2 = r9.mo49171b()
            r0.removeAllViews()
            boolean r3 = r9.f118279s
            r4 = 0
            if (r3 != 0) goto L_0x0016
        L_0x0014:
            r3 = 0
            goto L_0x0048
        L_0x0016:
            android.content.Context r3 = r9.f118271k
            com.google.android.setupcompat.p3549a.C45240c.m80574e(r3)
            android.content.Context r3 = r9.f118271k
            android.os.Bundle r5 = com.google.android.setupcompat.p3549a.C45240c.f118162f
            java.lang.String r6 = "isNeutralButtonStyleEnabled"
            if (r5 != 0) goto L_0x003d
            r5 = 0
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0033 }
            android.net.Uri r7 = com.google.android.setupcompat.p3549a.C45240c.m80573d()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0033 }
            android.os.Bundle r3 = r3.call(r7, r6, r5, r5)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0033 }
            com.google.android.setupcompat.p3549a.C45240c.f118162f = r3     // Catch:{ IllegalArgumentException | SecurityException -> 0x0033 }
            goto L_0x003d
        L_0x0033:
            java.lang.String r3 = com.google.android.setupcompat.p3549a.C45240c.f118157a
            java.lang.String r6 = "Neutral button style supporting status unknown; return as false."
            android.util.Log.w(r3, r6)
            com.google.android.setupcompat.p3549a.C45240c.f118162f = r5
            goto L_0x0014
        L_0x003d:
            android.os.Bundle r3 = com.google.android.setupcompat.p3549a.C45240c.f118162f
            if (r3 == 0) goto L_0x0014
            boolean r3 = r3.getBoolean(r6, r4)
            if (r3 == 0) goto L_0x0014
            r3 = 1
        L_0x0048:
            android.content.Context r5 = r9.f118271k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r6 = 2
            if (r5 != r6) goto L_0x0062
            if (r3 == 0) goto L_0x0062
            boolean r5 = r9.mo49177h()
            if (r5 == 0) goto L_0x0062
            r9.m80663p()
        L_0x0062:
            if (r2 == 0) goto L_0x0080
            boolean r5 = r9.f118279s
            if (r5 == 0) goto L_0x007d
            int r5 = r0.getPaddingRight()
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingBottom()
            if (r0 == 0) goto L_0x007d
            r0.setPadding(r5, r6, r7, r8)
        L_0x007d:
            r0.addView(r2)
        L_0x0080:
            boolean r5 = r9.mo49177h()
            if (r5 != 0) goto L_0x0089
            r9.m80663p()
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            r0.addView(r1)
        L_0x008e:
            if (r1 == 0) goto L_0x00b4
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x0095
            goto L_0x00b4
        L_0x0095:
            r1.measure(r4, r4)
            int r0 = r1.getMeasuredWidth()
            r2.measure(r4, r4)
            int r3 = r2.getMeasuredWidth()
            int r0 = java.lang.Math.max(r0, r3)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r1.width = r0
            return
        L_0x00b4:
            r0 = 0
            r3 = -2
            if (r1 == 0) goto L_0x00c7
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            if (r4 == 0) goto L_0x00c7
            r4.width = r3
            r4.weight = r0
            r1.setLayoutParams(r4)
        L_0x00c7:
            if (r2 == 0) goto L_0x00d8
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x00d8
            r1.width = r3
            r1.weight = r0
            r2.setLayoutParams(r1)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupcompat.template.C45275b.mo49174e():void");
    }

    /* renamed from: f */
    public final void mo49175f(C45277d dVar) {
        C45277d dVar2 = dVar;
        C45259g.m80633b("setPrimaryButton");
        m80659l();
        C45256d dVar3 = new C45256d(m80658k(dVar2, 2132150096, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR), C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR, C45238a.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, C45238a.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR, m80660m(dVar2.f118285a), C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START, C45238a.CONFIG_FOOTER_BUTTON_TEXT_SIZE, C45238a.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, C45238a.CONFIG_FOOTER_BUTTON_FONT_FAMILY, C45238a.CONFIG_FOOTER_BUTTON_TEXT_STYLE, C45238a.CONFIG_FOOTER_BUTTON_RADIUS, C45238a.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
        FooterActionButton n = m80661n(dVar2, dVar3);
        this.f118273m = n.getId();
        n.f118258b = true;
        this.f118265e = dVar2;
        mo49173d(n, this.f118277q);
        m80662o(n, dVar3);
        mo49174e();
    }

    /* renamed from: g */
    public final void mo49176g(C45277d dVar, boolean z) {
        C45238a aVar;
        C45238a aVar2;
        C45238a aVar3;
        C45238a aVar4;
        C45277d dVar2 = dVar;
        boolean z2 = z;
        C45259g.m80633b("setSecondaryButton");
        this.f118279s = z2;
        m80659l();
        int i = z2 ? 2132150096 : 2132150097;
        if (z2) {
            aVar = C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
        } else {
            aVar = C45238a.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
        }
        int k = m80658k(dVar2, i, aVar);
        if (z2) {
            aVar2 = C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
        } else {
            aVar2 = C45238a.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
        }
        C45238a aVar5 = aVar2;
        C45238a aVar6 = C45238a.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
        C45238a aVar7 = C45238a.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
        if (z2) {
            aVar3 = C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR;
        } else {
            aVar3 = C45238a.CONFIG_FOOTER_SECONDARY_BUTTON_DISABLED_TEXT_COLOR;
        }
        C45238a aVar8 = aVar3;
        C45238a m = m80660m(dVar2.f118285a);
        C45238a aVar9 = C45238a.CONFIG_FOOTER_BUTTON_RADIUS;
        C45238a aVar10 = C45238a.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
        if (z2) {
            aVar4 = C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
        } else {
            aVar4 = C45238a.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
        }
        C45256d dVar3 = new C45256d(k, aVar5, aVar6, aVar7, aVar8, m, aVar4, C45238a.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START, C45238a.CONFIG_FOOTER_BUTTON_TEXT_SIZE, C45238a.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, C45238a.CONFIG_FOOTER_BUTTON_FONT_FAMILY, C45238a.CONFIG_FOOTER_BUTTON_TEXT_STYLE, aVar9, aVar10);
        FooterActionButton n = m80661n(dVar2, dVar3);
        this.f118274n = n.getId();
        n.f118258b = z2;
        this.f118266f = dVar2;
        mo49173d(n, this.f118278r);
        m80662o(n, dVar3);
        mo49174e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo49177h() {
        if (C45240c.m80574e(this.f118271k).mo49107l(C45238a.CONFIG_FOOTER_BUTTON_ALIGNED_END)) {
            return C45240c.m80574e(this.f118271k).mo49105j(this.f118271k, C45238a.CONFIG_FOOTER_BUTTON_ALIGNED_END, false);
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo49178i() {
        return mo49170a() != null && mo49170a().getVisibility() == 0;
    }

    /* renamed from: j */
    public final boolean mo49179j() {
        return mo49171b() != null && mo49171b().getVisibility() == 0;
    }
}
