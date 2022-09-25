package com.google.android.libraries.home.coreui.topappbar;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.MaterialToolbar;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class BottomSheetTopAppBar extends MaterialToolbar {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BottomSheetTopAppBar(Context context) {
        this(context, (AttributeSet) null, 2, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetTopAppBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2423x(java.lang.CharSequence r8) {
        /*
            r7 = this;
            super.mo2423x(r8)
            java.lang.CharSequence r0 = r7.f1957q
            r1 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0038
        L_0x0009:
            h.l.k r2 = androidx.core.p098j.C2050bp.m5609a(r7)
            java.util.Iterator r2 = r2.mo5191a()
            r3 = r1
        L_0x0012:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r2.next()
            r5 = r4
            android.view.View r5 = (android.view.View) r5
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x0012
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.CharSequence r5 = r5.getText()
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r0)
            if (r5 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0012
        L_0x0031:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0038
            r1 = r3
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0038:
            if (r1 == 0) goto L_0x003e
            r0 = 2
            r1.setImportantForAccessibility(r0)
        L_0x003e:
            android.content.Context r0 = r7.getContext()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r8 != 0) goto L_0x0049
            java.lang.String r8 = ""
        L_0x0049:
            r2 = 0
            r1[r2] = r8
            r8 = 2132093007(0x7f15284f, float:1.9826427E38)
            java.lang.String r8 = r0.getString(r8, r1)
            r7.mo2416q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.coreui.topappbar.BottomSheetTopAppBar.mo2423x(java.lang.CharSequence):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetTopAppBar(Context context, AttributeSet attributeSet, int i, C69659i iVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
