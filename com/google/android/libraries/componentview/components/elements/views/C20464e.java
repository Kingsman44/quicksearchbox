package com.google.android.libraries.componentview.components.elements.views;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.elements.views.e */
/* compiled from: PG */
final class C20464e implements C20463d {

    /* renamed from: a */
    private final int f57570a;

    /* renamed from: b */
    private int f57571b = 0;

    /* renamed from: c */
    private View f57572c;

    /* renamed from: d */
    private final List f57573d;

    /* renamed from: e */
    private final boolean f57574e;

    public C20464e(int i, boolean z) {
        this.f57570a = i;
        this.f57574e = z;
        this.f57573d = new ArrayList(3);
    }

    /* renamed from: a */
    public final void mo25407a(View view) {
        if (mo25409c()) {
            return;
        }
        if (view.getMeasuredWidth() <= this.f57570a / 4) {
            this.f57573d.add(view);
            this.f57571b++;
        } else if (this.f57572c == null && view.getMeasuredWidth() <= this.f57570a / 2) {
            this.f57572c = view;
            this.f57571b++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25408b(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            android.view.View r0 = r5.f57572c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0017
            java.util.List r3 = r5.f57573d
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.util.List r4 = r5.f57573d
            java.lang.Object r1 = r4.get(r1)
            android.view.View r1 = (android.view.View) r1
            goto L_0x0031
        L_0x0017:
            java.util.List r0 = r5.f57573d
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            java.util.List r3 = r5.f57573d
            java.lang.Object r1 = r3.get(r1)
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            java.util.List r1 = r5.f57573d
            r4 = 2
            java.lang.Object r1 = r1.get(r4)
            android.view.View r1 = (android.view.View) r1
        L_0x0031:
            r0.setVisibility(r2)
            r3.setVisibility(r2)
            r1.setVisibility(r2)
            boolean r2 = r5.f57574e
            if (r2 == 0) goto L_0x0052
            int r2 = r5.f57570a
            int r4 = r2 / 2
            int r4 = r8 - r4
            int r2 = r2 / 4
            int r2 = r4 - r2
            r0.layout(r4, r7, r8, r9)
            r3.layout(r2, r7, r4, r9)
            r1.layout(r6, r7, r2, r9)
            return
        L_0x0052:
            int r2 = r5.f57570a
            int r4 = r2 / 2
            int r4 = r4 + r6
            int r2 = r2 / 4
            int r2 = r2 + r4
            r0.layout(r6, r7, r4, r9)
            r3.layout(r4, r7, r2, r9)
            r1.layout(r2, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.elements.views.C20464e.mo25408b(int, int, int, int):void");
    }

    /* renamed from: c */
    public final boolean mo25409c() {
        return this.f57571b == 3;
    }
}
