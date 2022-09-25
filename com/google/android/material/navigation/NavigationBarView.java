package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.view.C0442j;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141241b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: a */
    public final C44820g f116864a;

    /* renamed from: b */
    public final C44822i f116865b;

    /* renamed from: c */
    public final NavigationBarPresenter f116866c;

    /* renamed from: d */
    public C44825l f116867d;

    /* renamed from: e */
    public C141241b f116868e;

    /* renamed from: f */
    private MenuInflater f116869f;

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C44965a.m79936a(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f116866c = navigationBarPresenter;
        Context context2 = getContext();
        C0735ip b = C44733be.m79296b(context2, attributeSet, C44831r.f116961b, i, i2, 10, 9);
        C44820g gVar = new C44820g(context2, getClass(), mo47496a());
        this.f116864a = gVar;
        C44822i b2 = mo47497b(context2);
        this.f116865b = b2;
        navigationBarPresenter.f116858a = b2;
        navigationBarPresenter.f116860c = 1;
        b2.f116954w = navigationBarPresenter;
        gVar.mo1655f(navigationBarPresenter, gVar.f1650a);
        navigationBarPresenter.mo1520c(getContext(), gVar);
        if (b.f2596b.hasValue(5)) {
            b2.mo48232e(b.mo3245a(5));
        } else {
            b2.mo48232e(b2.mo48234g());
        }
        int dimensionPixelSize = b.f2596b.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size));
        b2.f116938g = dimensionPixelSize;
        C44819f[] fVarArr = b2.f116935d;
        if (fVarArr != null) {
            for (C44819f p : fVarArr) {
                p.mo48217p(dimensionPixelSize);
            }
        }
        if (b.f2596b.hasValue(10)) {
            int resourceId = b.f2596b.getResourceId(10, 0);
            C44822i iVar = this.f116865b;
            iVar.f116940i = resourceId;
            C44819f[] fVarArr2 = iVar.f116935d;
            if (fVarArr2 != null) {
                for (C44819f fVar : fVarArr2) {
                    fVar.mo48226x(resourceId);
                    ColorStateList colorStateList = iVar.f116939h;
                    if (colorStateList != null) {
                        fVar.mo48227y(colorStateList);
                    }
                }
            }
        }
        if (b.f2596b.hasValue(9)) {
            int resourceId2 = b.f2596b.getResourceId(9, 0);
            C44822i iVar2 = this.f116865b;
            iVar2.f116941j = resourceId2;
            C44819f[] fVarArr3 = iVar2.f116935d;
            if (fVarArr3 != null) {
                for (C44819f fVar2 : fVarArr3) {
                    fVar2.mo48225w(resourceId2);
                    ColorStateList colorStateList2 = iVar2.f116939h;
                    if (colorStateList2 != null) {
                        fVar2.mo48227y(colorStateList2);
                    }
                }
            }
        }
        if (b.f2596b.hasValue(11)) {
            ColorStateList a = b.mo3245a(11);
            C44822i iVar3 = this.f116865b;
            iVar3.f116939h = a;
            C44819f[] fVarArr4 = iVar3.f116935d;
            if (fVarArr4 != null) {
                for (C44819f y : fVarArr4) {
                    y.mo48227y(a);
                }
            }
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C44779j jVar = new C44779j();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                jVar.mo48124V(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            jVar.mo48121S(context2);
            C2043bi.m5530X(this, jVar);
        }
        if (b.f2596b.hasValue(7)) {
            int dimensionPixelSize2 = b.f2596b.getDimensionPixelSize(7, 0);
            C44822i iVar4 = this.f116865b;
            iVar4.f116945n = dimensionPixelSize2;
            C44819f[] fVarArr5 = iVar4.f116935d;
            if (fVarArr5 != null) {
                for (C44819f t : fVarArr5) {
                    t.mo48222t(dimensionPixelSize2);
                }
            }
        }
        if (b.f2596b.hasValue(6)) {
            int dimensionPixelSize3 = b.f2596b.getDimensionPixelSize(6, 0);
            C44822i iVar5 = this.f116865b;
            iVar5.f116946o = dimensionPixelSize3;
            C44819f[] fVarArr6 = iVar5.f116935d;
            if (fVarArr6 != null) {
                for (C44819f s : fVarArr6) {
                    s.mo48220s(dimensionPixelSize3);
                }
            }
        }
        if (b.f2596b.hasValue(1)) {
            float dimensionPixelSize4 = (float) b.f2596b.getDimensionPixelSize(1, 0);
            super.setElevation(dimensionPixelSize4);
            C44780k.m79411b(this, dimensionPixelSize4);
        }
        C1929b.m5226g(getBackground().mutate(), C44694d.m79231c(context2, b, 0));
        int integer = b.f2596b.getInteger(12, -1);
        C44822i iVar6 = this.f116865b;
        if (iVar6.f116934c != integer) {
            iVar6.f116934c = integer;
            this.f116866c.mo1546f(false);
        }
        int resourceId3 = b.f2596b.getResourceId(3, 0);
        if (resourceId3 != 0) {
            C44822i iVar7 = this.f116865b;
            iVar7.f116943l = resourceId3;
            C44819f[] fVarArr7 = iVar7.f116935d;
            if (fVarArr7 != null) {
                for (C44819f r : fVarArr7) {
                    r.mo48219r(resourceId3);
                }
            }
        } else {
            ColorStateList c = C44694d.m79231c(context2, b, 8);
            C44822i iVar8 = this.f116865b;
            iVar8.f116942k = c;
            C44819f[] fVarArr8 = iVar8.f116935d;
            if (fVarArr8 != null) {
                for (C44819f fVar3 : fVarArr8) {
                    fVar3.f116902b = c;
                    fVar3.mo48203g();
                }
            }
        }
        int resourceId4 = b.f2596b.getResourceId(2, 0);
        if (resourceId4 != 0) {
            C44822i iVar9 = this.f116865b;
            iVar9.f116947p = true;
            C44819f[] fVarArr9 = iVar9.f116935d;
            if (fVarArr9 != null) {
                for (C44819f i3 : fVarArr9) {
                    i3.mo48207i(true);
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId4, C44831r.f116960a);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            C44822i iVar10 = this.f116865b;
            iVar10.f116948q = dimensionPixelSize5;
            C44819f[] fVarArr10 = iVar10.f116935d;
            if (fVarArr10 != null) {
                for (C44819f m : fVarArr10) {
                    m.mo48211m(dimensionPixelSize5);
                }
            }
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            C44822i iVar11 = this.f116865b;
            iVar11.f116949r = dimensionPixelSize6;
            C44819f[] fVarArr11 = iVar11.f116935d;
            if (fVarArr11 != null) {
                for (C44819f j : fVarArr11) {
                    j.mo48208j(dimensionPixelSize6);
                }
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            C44822i iVar12 = this.f116865b;
            iVar12.f116950s = dimensionPixelOffset;
            C44819f[] fVarArr12 = iVar12.f116935d;
            if (fVarArr12 != null) {
                for (C44819f k : fVarArr12) {
                    k.mo48209k(dimensionPixelOffset);
                }
            }
            ColorStateList b3 = C44694d.m79230b(context2, obtainStyledAttributes, 2);
            C44822i iVar13 = this.f116865b;
            iVar13.f116953v = b3;
            C44819f[] fVarArr13 = iVar13.f116935d;
            if (fVarArr13 != null) {
                for (C44819f h : fVarArr13) {
                    h.mo48206h(iVar13.mo48230c());
                }
            }
            C44785p pVar = new C44785p(C44785p.m79427d(context2, obtainStyledAttributes.getResourceId(4, 0), 0));
            C44822i iVar14 = this.f116865b;
            iVar14.f116951t = pVar;
            C44819f[] fVarArr14 = iVar14.f116935d;
            if (fVarArr14 != null) {
                for (C44819f h2 : fVarArr14) {
                    h2.mo48206h(iVar14.mo48230c());
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (b.f2596b.hasValue(13)) {
            mo48181c(b.f2596b.getResourceId(13, 0));
        }
        b.f2596b.recycle();
        addView(this.f116865b);
        this.f116864a.f1651b = new C44824k(this);
    }

    /* renamed from: a */
    public abstract int mo47496a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C44822i mo47497b(Context context);

    /* renamed from: c */
    public final void mo48181c(int i) {
        this.f116866c.f116859b = true;
        if (this.f116869f == null) {
            this.f116869f = new C0442j(getContext());
        }
        this.f116869f.inflate(i, this.f116864a);
        NavigationBarPresenter navigationBarPresenter = this.f116866c;
        navigationBarPresenter.f116859b = false;
        navigationBarPresenter.mo1546f(true);
    }

    /* renamed from: d */
    public final void mo48182d(int i) {
        MenuItem findItem = this.f116864a.findItem(i);
        if (findItem != null && !this.f116864a.mo1680z(findItem, this.f116866c, 0)) {
            findItem.setChecked(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79412c(this);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        this.f116864a.mo1659h(savedState.f116870a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f116870a = new Bundle();
        this.f116864a.mo1661i(savedState.f116870a);
        return savedState;
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44780k.m79411b(this, f);
    }

    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C44826m();

        /* renamed from: a */
        Bundle f116870a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f116870a = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeBundle(this.f116870a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
