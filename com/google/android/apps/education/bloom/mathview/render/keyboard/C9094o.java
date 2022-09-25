package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.o */
/* compiled from: PG */
final class C9094o implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C9097r f31356a;

    /* renamed from: b */
    final /* synthetic */ View f31357b;

    /* renamed from: c */
    final /* synthetic */ int f31358c;

    public C9094o(C9097r rVar, View view, int i) {
        this.f31356a = rVar;
        this.f31357b = view;
        this.f31358c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00df A[LOOP:2: B:25:0x00d9->B:27:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r14) {
        /*
            r13 = this;
            int r14 = r14.getId()
            com.google.android.apps.education.bloom.mathview.render.keyboard.r r0 = r13.f31356a
            int r1 = r0.mo17407a()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r14 != r1) goto L_0x0098
            android.view.ContextThemeWrapper r14 = new android.view.ContextThemeWrapper
            android.view.View r1 = r0.itemView
            android.content.Context r1 = r1.getContext()
            r5 = 2132149755(0x7f1605fb, float:1.9941525E38)
            r14.<init>(r1, r5)
            java.util.List r1 = r0.f31362d
            if (r1 == 0) goto L_0x0098
            boolean r6 = r1.isEmpty()
            if (r4 != r6) goto L_0x0028
            r1 = r2
        L_0x0028:
            if (r1 == 0) goto L_0x0098
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = p5462h.p5463a.C69540x.m100804k(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L_0x003a:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x009a
            java.lang.Object r8 = r1.next()
            int r9 = r7 + 1
            if (r7 >= 0) goto L_0x004b
            p5462h.p5463a.C69540x.m100952j()
        L_0x004b:
            com.google.apps.d.a.u r8 = (com.google.apps.p3589d.p3590a.C45704u) r8
            android.support.v7.widget.AppCompatImageButton r10 = new android.support.v7.widget.AppCompatImageButton
            r10.<init>(r14, r2, r5)
        L_0x0052:
            java.util.List r11 = r0.f31363e
            int r11 = r11.size()
            if (r7 < r11) goto L_0x0068
            java.util.List r11 = r0.f31363e
            int r12 = android.view.View.generateViewId()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            goto L_0x0052
        L_0x0068:
            java.util.List r11 = r0.f31363e
            java.lang.Object r7 = r11.get(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r10.setId(r7)
            com.google.android.apps.education.bloom.mathview.render.keyboard.i r7 = com.google.android.apps.education.bloom.mathview.render.keyboard.C9088i.f31339a
            r7.mo17406b(r10, r8)
            com.google.android.apps.education.bloom.mathview.render.keyboard.f r7 = com.google.android.apps.education.bloom.mathview.render.keyboard.C9085f.f31334a
            int r7 = r10.getId()
            java.lang.String r8 = r8.mo49750c()
            java.lang.String r11 = "stat.latex()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r11)
            com.google.android.apps.education.bloom.mathview.render.keyboard.C9085f.m23623c(r7, r8)
            com.google.android.apps.education.bloom.mathview.render.keyboard.q r7 = r0.f31365g
            r10.addOnAttachStateChangeListener(r7)
            r6.add(r10)
            r7 = r9
            goto L_0x003a
        L_0x0098:
            h.a.am r6 = p5462h.p5463a.C69496am.f185918a
        L_0x009a:
            android.view.View r14 = r13.f31357b
            android.content.Context r14 = r14.getContext()
            java.lang.String r0 = "child.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r0)
            int r0 = r13.f31358c
            com.google.android.apps.education.bloom.mathview.render.keyboard.r r1 = r13.f31356a
            com.google.android.apps.education.bloom.mathview.render.keyboard.n r5 = new com.google.android.apps.education.bloom.mathview.render.keyboard.n
            android.view.View r7 = r13.f31357b
            r5.<init>(r7)
            r7 = 2131626289(0x7f0e0931, float:1.887981E38)
            android.view.View r2 = android.view.View.inflate(r14, r7, r2)
            r7 = 2131434226(0x7f0b1af2, float:1.849026E38)
            android.view.View r7 = r2.findViewById(r7)
            android.widget.GridLayout r7 = (android.widget.GridLayout) r7
            boolean r8 = r6.isEmpty()
            java.lang.String r9 = "gridLayout"
            if (r8 == 0) goto L_0x00d2
            if (r0 <= 0) goto L_0x00d2
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r14)
            r6.inflate(r0, r7, r4)
            goto L_0x00e9
        L_0x00d2:
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)
            java.util.Iterator r0 = r6.iterator()
        L_0x00d9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00e9
            java.lang.Object r6 = r0.next()
            android.view.View r6 = (android.view.View) r6
            r7.addView(r6)
            goto L_0x00d9
        L_0x00e9:
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            r6 = -2
            r0.<init>(r2, r6, r6, r4)
            android.content.res.Resources r2 = r14.getResources()
            r6 = 2131169290(0x7f07100a, float:1.7952906E38)
            float r2 = r2.getDimension(r6)
            r0.setElevation(r2)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)
            int r2 = r7.getChildCount()
            r6 = 0
        L_0x0105:
            if (r6 >= r2) goto L_0x0124
            android.view.View r8 = r7.getChildAt(r6)
            java.lang.String r9 = "getChildAt(index)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            r5.mo5761a(r8)
            boolean r9 = r8.isClickable()
            if (r9 == 0) goto L_0x0121
            com.google.android.apps.education.bloom.mathview.render.keyboard.ag r9 = new com.google.android.apps.education.bloom.mathview.render.keyboard.ag
            r9.<init>(r1, r8, r14, r0)
            r8.setOnClickListener(r9)
        L_0x0121:
            int r6 = r6 + 1
            goto L_0x0105
        L_0x0124:
            android.view.View r14 = r0.getContentView()
            r14.measure(r3, r3)
            android.view.View r14 = r13.f31357b
            int r1 = r14.getHeight()
            int r1 = -r1
            android.view.View r2 = r0.getContentView()
            int r2 = r2.getMeasuredHeight()
            int r1 = r1 - r2
            float r2 = r0.getElevation()
            int r2 = (int) r2
            int r1 = r1 - r2
            r2 = 49
            r0.showAsDropDown(r14, r3, r1, r2)
            com.google.android.apps.education.bloom.mathview.render.keyboard.m r14 = new com.google.android.apps.education.bloom.mathview.render.keyboard.m
            com.google.android.apps.education.bloom.mathview.render.keyboard.r r1 = r13.f31356a
            r14.<init>(r1)
            r0.setOnDismissListener(r14)
            com.google.android.apps.education.bloom.mathview.render.keyboard.r r14 = r13.f31356a
            r14.mo17414c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.education.bloom.mathview.render.keyboard.C9094o.onLongClick(android.view.View):boolean");
    }
}
