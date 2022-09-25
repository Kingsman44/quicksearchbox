package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.p2203m.p2204a.C28487a;

/* compiled from: PG */
public class AccountMenuBodyView extends LinearLayout {

    /* renamed from: a */
    public final RecyclerView f82879a;

    /* renamed from: b */
    public final MyAccountChip f82880b;

    /* renamed from: c */
    public boolean f82881c;

    /* renamed from: d */
    public boolean f82882d;

    /* renamed from: e */
    public C30306o f82883e;

    /* renamed from: f */
    private final boolean f82884f;

    /* renamed from: g */
    private final C30775s f82885g;

    public AccountMenuBodyView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo36387a() {
        if (this.f82882d) {
            this.f82880b.mo36390f();
        } else {
            this.f82880b.setVisibility(8);
        }
        this.f82885g.f83069a = this.f82884f ? 2 : C30281j.m56319c(this.f82883e.f81934a.f81883d) != null ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f82880b.f82886a.mo36594b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    public AccountMenuBodyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountMenuStyle);
    }

    /* JADX INFO: finally extract failed */
    public AccountMenuBodyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82881c = true;
        this.f82882d = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(true != new C30643a(context).f82739h ? R.layout.account_menu_body_small_disc : R.layout.account_menu_body, this, true);
        this.f82880b = (MyAccountChip) findViewById(R.id.my_account);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accounts_list);
        this.f82879a = recyclerView;
        recyclerView.getScrollingChildHelper().mo5279a(false);
        recyclerView.setFocusableInTouchMode(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C30747br.f82993b, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.f82884f = z;
            obtainStyledAttributes.recycle();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_menu_indented_content_margin_start);
            int a = C28487a.m53260a(context, R.attr.colorHairline);
            Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.og_list_divider);
            C30905ae.m57696b(c, a);
            C30775s sVar = new C30775s(c, dimensionPixelSize);
            this.f82885g = sVar;
            if (z) {
                sVar.f83069a = 2;
            }
            recyclerView.addItemDecoration$ar$ds(sVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
