package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.C4268a;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.RtlAwareViewPager */
/* compiled from: PG */
public class RtlAwareViewPager extends ViewPager {

    /* renamed from: i */
    private C4268a f285515i;

    /* renamed from: j */
    private C102343bp f285516j;

    public RtlAwareViewPager(Context context) {
        super(context);
    }

    /* renamed from: y */
    private final int m169593y(int i) {
        C102343bp bpVar = this.f285516j;
        return bpVar != null ? bpVar.mo93149b(i) : i;
    }

    /* renamed from: a */
    public final int mo9122a() {
        return m169593y(this.f13819c);
    }

    /* renamed from: b */
    public final C4268a mo9126b() {
        return this.f285515i;
    }

    /* renamed from: k */
    public final void mo9146k(C4268a aVar) {
        C102343bp bpVar = this.f285516j;
        if (bpVar != null) {
            C4268a aVar2 = bpVar.f285626c;
            aVar2.f13843a.unregisterObserver(bpVar.f285627d);
        }
        this.f285515i = aVar;
        C102343bp bpVar2 = new C102343bp(aVar);
        this.f285516j = bpVar2;
        super.mo9146k(bpVar2);
    }

    /* renamed from: l */
    public final void mo9147l(int i) {
        super.mo9147l(m169593y(i));
    }

    /* renamed from: m */
    public final void mo9148m(int i, boolean z) {
        super.mo9148m(m169593y(i), z);
    }

    public RtlAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
