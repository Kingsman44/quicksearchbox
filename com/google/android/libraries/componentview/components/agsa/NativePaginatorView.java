package com.google.android.libraries.componentview.components.agsa;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
public class NativePaginatorView extends CardView {

    /* renamed from: g */
    public final Context f55464g;

    /* renamed from: h */
    public TextView f55465h;

    /* renamed from: i */
    public View f55466i;

    /* renamed from: j */
    public View f55467j;

    /* renamed from: k */
    public View f55468k;

    /* renamed from: l */
    public int f55469l;

    /* renamed from: m */
    public boolean f55470m;

    /* renamed from: n */
    public String f55471n;

    /* renamed from: o */
    public String f55472o;

    /* renamed from: p */
    public C19879r f55473p;

    public NativePaginatorView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        C19884w wVar = new C19884w(this);
        setOnTouchListener(wVar);
        setOnClickListener(wVar);
    }

    public NativePaginatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativePaginatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55471n = "Next";
        this.f55472o = "Page %1$d";
        this.f55464g = context;
    }
}
