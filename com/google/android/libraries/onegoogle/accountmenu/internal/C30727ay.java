package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30261f;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.ay */
/* compiled from: PG */
public class C30727ay extends C30718ap {

    /* renamed from: i */
    private static final String f82944i;

    /* renamed from: j */
    private static final String f82945j;

    /* renamed from: g */
    protected final ViewGroup f82946g;

    /* renamed from: h */
    public AnimatorSet f82947h;

    /* renamed from: k */
    private final MyAccountChip f82948k;

    /* renamed from: l */
    private boolean f82949l;

    /* renamed from: m */
    private C30305n f82950m;

    /* renamed from: n */
    private C30306o f82951n;

    /* renamed from: o */
    private final C30282k f82952o;

    static {
        Class<C30727ay> cls = C30727ay.class;
        f82944i = String.valueOf(cls.getName()).concat(".superState");
        f82945j = String.valueOf(cls.getName()).concat(".expanded");
    }

    public C30727ay(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: j */
    private final void m57412j() {
        if (!this.f82949l) {
            C30306o oVar = this.f82951n;
            oVar.f81934a.f81880a.add(this.f82952o);
            this.f82949l = true;
            mo36418h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C63644b mo35801a() {
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 6;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 7;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a |= 8;
        return (C63644b) aVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo36413c() {
        return this.f82929a;
    }

    /* renamed from: e */
    public final void mo36415e(C30305n nVar, C30261f fVar) {
        this.f82950m = nVar;
        this.f82951n = nVar.mo35858i();
        if (nVar.mo35859j().mo36093e()) {
            this.f82948k.setVisibility(0);
            this.f82930b.f82882d = false;
        } else {
            this.f82948k.setVisibility(8);
            this.f82930b.f82882d = true;
        }
        nVar.mo35864o().mo35821a(this, 75244);
        this.f82948k.mo36389e(nVar, mo35801a(), new C30720ar());
        super.mo36415e(nVar, fVar);
        if (C2043bi.m5569aw(this)) {
            m57412j();
        }
    }

    /* renamed from: g */
    public final void mo36417g(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo36418h() {
        super.mo36418h();
        AccountMenuBodyView accountMenuBodyView = this.f82930b;
        int i = 8;
        if (this.f82929a.f82899h && !this.f82951n.f81934a.mo35794b().isEmpty()) {
            i = 0;
        }
        accountMenuBodyView.setVisibility(i);
        if (this.f82950m.mo35859j().mo36093e()) {
            this.f82948k.mo36390f();
            SelectedAccountHeaderView selectedAccountHeaderView = this.f82929a;
            int i2 = this.f82948k.getVisibility() == 0 ? R.dimen.account_menu_header_signed_in_bottom_padding_with_chip : R.dimen.account_menu_header_signed_in_bottom_padding;
            View view = selectedAccountHeaderView.f82893b;
            view.setPadding(view.getPaddingLeft(), selectedAccountHeaderView.f82893b.getPaddingTop(), selectedAccountHeaderView.f82893b.getPaddingRight(), selectedAccountHeaderView.getResources().getDimensionPixelSize(i2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo36425i() {
        float f;
        if (!this.f82951n.f81934a.mo35794b().isEmpty()) {
            this.f82931c.scrollTo(0, 0);
            ViewGroup viewGroup = (ViewGroup) this.f82930b.getParent();
            ArrayList arrayList = new ArrayList();
            for (int indexOfChild = viewGroup.indexOfChild(this.f82930b); indexOfChild < viewGroup.getChildCount(); indexOfChild++) {
                arrayList.add(viewGroup.getChildAt(indexOfChild));
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            for (int indexOfChild2 = viewGroup2.indexOfChild(viewGroup) + 1; indexOfChild2 < viewGroup2.getChildCount(); indexOfChild2++) {
                arrayList.add(viewGroup2.getChildAt(indexOfChild2));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration((long) getResources().getInteger(17694720));
            this.f82930b.measure(-1, -2);
            float measuredHeight = (float) this.f82930b.getMeasuredHeight();
            float translationY = this.f82930b.getTranslationY();
            ArrayList arrayList2 = new ArrayList();
            SelectedAccountHeaderView selectedAccountHeaderView = this.f82929a;
            boolean z = !selectedAccountHeaderView.f82899h;
            selectedAccountHeaderView.mo36393d(z);
            this.f82948k.f82887b = true != this.f82929a.f82899h ? 14 : 1;
            if (z) {
                f = 0.0f;
                if (translationY == 0.0f) {
                    translationY = -measuredHeight;
                }
                animatorSet.addListener(new C30724av(this));
            } else {
                f = -measuredHeight;
                animatorSet.addListener(new C30725aw(this, arrayList));
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(ObjectAnimator.ofFloat((View) arrayList.get(i), "translationY", new float[]{translationY, f}));
            }
            animatorSet.playTogether(arrayList2);
            animatorSet.addListener(new C30726ax(this));
            AnimatorSet animatorSet2 = this.f82947h;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f82947h = animatorSet;
            animatorSet.start();
            C30898c cVar = this.f82933e;
            Object c = C30281j.m56319c(this.f82951n.f81934a.f81883d);
            C63643a aVar = (C63643a) mo35801a().toBuilder();
            int i2 = true != this.f82929a.f82899h ? 38 : 37;
            aVar.copyOnWrite();
            C63644b bVar = (C63644b) aVar.instance;
            bVar.f172122b = i2 - 1;
            bVar.f172121a |= 1;
            cVar.mo35875a(c, (C63644b) aVar.build());
            super.mo36418h();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f82951n != null) {
            m57412j();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        C30306o oVar = this.f82951n;
        if (oVar != null) {
            oVar.f81934a.f81880a.remove(this.f82952o);
            this.f82949l = false;
        }
        this.f82929a.f82898g.setOnClickListener((View.OnClickListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C30305n nVar = this.f82950m;
        if (nVar != null && nVar.mo35859j().mo36093e()) {
            this.f82948k.f82886a.mo36594b(View.MeasureSpec.getSize(i));
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(f82944i);
            this.f82929a.mo36393d(bundle.getBoolean(f82945j));
            if (this.f82951n != null) {
                mo36418h();
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f82944i, super.onSaveInstanceState());
        bundle.putBoolean(f82945j, this.f82929a.f82899h);
        return bundle;
    }

    public C30727ay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountMenuStyle);
    }

    public C30727ay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.layout.embedded_account_menu);
        this.f82947h = null;
        this.f82952o = new C30723au(this);
        mo36416f();
        this.f82946g = (ViewGroup) findViewById(R.id.container);
        this.f82929a.setOnClickListener(new C30719aq(this));
        MyAccountChip myAccountChip = (MyAccountChip) findViewById(R.id.header_my_account);
        this.f82948k = myAccountChip;
        myAccountChip.f82887b = 14;
    }
}
