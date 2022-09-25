package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1752k;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44782m;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.material.timepicker.q */
/* compiled from: PG */
class C44993q extends ConstraintLayout {

    /* renamed from: a */
    private final Runnable f117582a;

    /* renamed from: b */
    private C44779j f117583b;

    /* renamed from: f */
    public int f117584f;

    public C44993q(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m79973a() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f117582a);
            handler.post(this.f117582a);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C2043bi.m5574c());
        }
        m79973a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33195b() {
        int i;
        C1756o oVar = new C1756o();
        oVar.mo4889i(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(((float) this.f117584f) * 0.66f);
            } else {
                i = this.f117584f;
            }
            float f = 0.0f;
            for (View id : list) {
                C1752k kVar = oVar.mo4885e(id.getId()).f5342e;
                kVar.f5348B = R.id.circle_center;
                kVar.f5349C = i;
                kVar.f5350D = f;
                f += 360.0f / ((float) list.size());
            }
        }
        oVar.mo4888h(this);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo33195b();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m79973a();
    }

    public final void setBackgroundColor(int i) {
        this.f117583b.mo48124V(ColorStateList.valueOf(i));
    }

    public C44993q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C44993q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C44779j jVar = new C44779j();
        this.f117583b = jVar;
        C44782m mVar = new C44782m(0.5f);
        C44784o oVar = new C44784o(jVar.f116741C.f116718a);
        oVar.mo48147f(mVar);
        jVar.mo47555l(new C44785p(oVar));
        this.f117583b.mo48124V(ColorStateList.valueOf(-1));
        C2043bi.m5530X(this, this.f117583b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44991o.f117580d, i, 0);
        this.f117584f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f117582a = new C44992p(this);
        obtainStyledAttributes.recycle();
    }
}
