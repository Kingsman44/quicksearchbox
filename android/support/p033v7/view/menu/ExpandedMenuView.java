package android.support.p033v7.view.menu;

import android.content.Context;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
/* compiled from: PG */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, C0476p, C0454ah {

    /* renamed from: a */
    private static final int[] f1516a = {16842964, 16843049};

    /* renamed from: b */
    private C0477q f1517b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public final void mo1454a(C0477q qVar) {
        this.f1517b = qVar;
    }

    /* renamed from: b */
    public final boolean mo1455b(C0480t tVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1517b.mo1680z((C0480t) getAdapter().getItem(i), (C0452af) null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0735ip f = C0735ip.m2473f(context, attributeSet, f1516a, i, 0);
        if (f.f2596b.hasValue(0)) {
            setBackgroundDrawable(f.mo3246b(0));
        }
        if (f.f2596b.hasValue(1)) {
            setDivider(f.mo3246b(1));
        }
        f.f2596b.recycle();
    }
}
