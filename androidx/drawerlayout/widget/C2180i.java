package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: androidx.drawerlayout.widget.i */
/* compiled from: PG */
public final class C2180i extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f6189a = 0;

    /* renamed from: b */
    float f6190b;

    /* renamed from: c */
    boolean f6191c;

    /* renamed from: d */
    int f6192d;

    public C2180i() {
        super(-1, -1);
    }

    public C2180i(byte[] bArr) {
        this();
    }

    public C2180i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f6146a);
        this.f6189a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C2180i(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C2180i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C2180i(C2180i iVar) {
        super(iVar);
        this.f6189a = iVar.f6189a;
    }
}
