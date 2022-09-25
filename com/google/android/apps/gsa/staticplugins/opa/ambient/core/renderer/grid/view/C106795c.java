package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.GridLayout;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.c */
/* compiled from: PG */
public final class C106795c extends GridLayout.LayoutParams {

    /* renamed from: a */
    int f297612a;

    /* renamed from: b */
    int f297613b;

    /* renamed from: c */
    int f297614c;

    /* renamed from: d */
    C106794b f297615d;

    /* renamed from: e */
    C106794b f297616e;

    /* renamed from: f */
    C106794b f297617f;

    /* renamed from: g */
    C106794b f297618g;

    public C106795c() {
        this.f297612a = 1;
        this.f297613b = 1;
        this.f297614c = 1;
    }

    /* renamed from: e */
    private final void m177553e() {
        this.f297612a = 1;
        this.f297613b = 1;
        this.f297614c = 1;
    }

    /* renamed from: a */
    public final void mo95666a(int i, int i2) {
        this.f297612a = i;
        this.f297613b = i2;
        this.f297614c = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo95667b(int i, int i2, float f) {
        this.f297616e = new C106794b(i, i2, f);
        int i3 = ReorderingGridLayout.f297596b;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo95668c(int i, float f) {
        this.f297615d = new C106794b(i, 1, f);
        int i2 = ReorderingGridLayout.f297596b;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo95669d(int i) {
        this.f297614c = i;
        C106794b bVar = this.f297616e;
        if (bVar != null) {
            bVar.f297610b = i;
        }
    }

    public C106795c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C106793a.f297608b);
        mo95666a(obtainStyledAttributes.getInt(1, this.f297613b), obtainStyledAttributes.getInt(0, 1));
        obtainStyledAttributes.recycle();
    }

    public C106795c(GridLayout.LayoutParams layoutParams) {
        super(layoutParams);
        m177553e();
    }

    public C106795c(GridLayout.Spec spec, GridLayout.Spec spec2, C106795c cVar) {
        super(spec, spec2);
        if (cVar != null) {
            this.f297612a = cVar.f297612a;
            this.f297613b = cVar.f297613b;
            this.f297614c = cVar.f297614c;
            return;
        }
        m177553e();
    }
}
