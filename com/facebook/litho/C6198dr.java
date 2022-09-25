package com.facebook.litho;

import android.view.View;
import com.facebook.p313c.C6051j;

/* renamed from: com.facebook.litho.dr */
/* compiled from: PG */
public final class C6198dr {

    /* renamed from: a */
    final int f18340a;

    /* renamed from: b */
    boolean f18341b;

    /* renamed from: c */
    String f18342c;

    public C6198dr(Object obj) {
        this.f18340a = m16448a(obj);
    }

    /* renamed from: a */
    static int m16448a(Object obj) {
        if (!(obj instanceof View)) {
            return 0;
        }
        View view = (View) obj;
        boolean isClickable = view.isClickable();
        if (view.isLongClickable()) {
            isClickable |= true;
        }
        if (view.isFocusable()) {
            isClickable |= true;
        }
        if (view.isEnabled()) {
            isClickable |= true;
        }
        if (view.isSelected()) {
            isClickable |= true;
        }
        int layerType = view.getLayerType();
        if (layerType == 0) {
            return isClickable ? 1 : 0;
        }
        if (layerType == 1) {
            return isClickable | true ? 1 : 0;
        }
        if (layerType == 2) {
            return isClickable | true ? 1 : 0;
        }
        throw new IllegalArgumentException("Unhandled layer type encountered.");
    }

    /* renamed from: b */
    static C6198dr m16449b(C6051j jVar) {
        Object obj = jVar.f17807e;
        if (obj instanceof C6198dr) {
            return (C6198dr) obj;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }
}
