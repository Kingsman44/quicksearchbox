package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.C0678gm;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.C2124k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30261f;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.common.C30906af;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bx */
/* compiled from: PG */
public final class C30753bx extends C30718ap {

    /* renamed from: g */
    public final ImageView f83001g;

    /* renamed from: h */
    private final C63644b f83002h;

    /* renamed from: i */
    private final TextView f83003i;

    /* renamed from: j */
    private final ImageView f83004j;

    /* renamed from: k */
    private final ImageView f83005k = ((ImageView) findViewById(R.id.super_g));

    /* renamed from: l */
    private boolean f83006l;

    /* renamed from: m */
    private FrameLayout f83007m;

    /* renamed from: n */
    private C30158c f83008n;

    /* renamed from: o */
    private C30306o f83009o;

    /* renamed from: p */
    private boolean f83010p;

    public C30753bx(Context context) {
        super(context, (AttributeSet) null, R.attr.ogAccountMenuStyle, R.layout.popover_account_menu);
        TextView textView = (TextView) findViewById(R.id.choose_an_account_stand_alone);
        this.f83003i = textView;
        ImageView imageView = (ImageView) findViewById(R.id.google_logo);
        this.f83004j = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.close_button);
        this.f83001g = imageView2;
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 1;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 8;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a = 8 | bVar3.f172121a;
        this.f83002h = (C63644b) aVar.build();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C30747br.f82992a, R.attr.ogAccountMenuStyle, 2132149621);
        try {
            imageView.setImageDrawable(C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd)));
            textView.setTextColor(obtainStyledAttributes.getColor(16, 0));
            C2124k.m5892c(imageView2, C30906af.m57697a(context, obtainStyledAttributes, 11));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    private static void m57440j(View view, boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.weight = true != z ? 1.0f : 0.0f;
        layoutParams.height = true != z ? 0 : -2;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    /* renamed from: k */
    private final void m57441k() {
        if (this.f83006l) {
            ImageView imageView = this.f83004j;
            int i = 8;
            if (this.f83010p && C30281j.m56319c(this.f83009o.f81934a.f81883d) != null) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: l */
    private final void m57442l() {
        if (this.f83006l) {
            Object c = C30281j.m56319c(this.f83009o.f81934a.f81883d);
            if (c == null || !this.f83008n.mo35558i(c)) {
                this.f83005k.setVisibility(8);
            } else {
                this.f83005k.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C63644b mo35801a() {
        return this.f83002h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo36413c() {
        if (this.f83007m == null) {
            this.f83007m = (FrameLayout) findViewById(R.id.account_menu_header);
        }
        return this.f83007m;
    }

    /* renamed from: e */
    public final void mo36415e(C30305n nVar, C30261f fVar) {
        this.f83008n = nVar.mo35852b();
        this.f83009o = nVar.mo35858i();
        this.f83006l = nVar.mo35859j().mo36090b().mo36101a();
        super.mo36415e(nVar, fVar);
    }

    /* renamed from: g */
    public final void mo36417g(int i) {
        float f = (float) i;
        this.f83010p = f >= mo36412b();
        m57441k();
        m57442l();
        float min = Math.min(Math.max(f - mo36412b(), 0.0f) / ((float) this.f83005k.getHeight()), 1.0f);
        this.f83004j.setAlpha(min);
        this.f83005k.setAlpha(1.0f - min);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo36418h() {
        super.mo36418h();
        Object c = C30281j.m56319c(this.f83009o.f81934a.f81883d);
        int i = 8;
        this.f83003i.setVisibility(c != null ? 8 : 0);
        m57441k();
        m57442l();
        this.f82930b.mo36387a();
        SelectedAccountHeaderView selectedAccountHeaderView = this.f82929a;
        if (c != null) {
            i = 0;
        }
        selectedAccountHeaderView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo36452i(boolean z) {
        AccountMenuBodyView accountMenuBodyView = this.f82930b;
        accountMenuBodyView.f82881c = z;
        boolean z2 = !z;
        m57440j(accountMenuBodyView, z2);
        this.f82931c.mo5314i(z);
        m57440j(this.f82931c, z2);
    }
}
