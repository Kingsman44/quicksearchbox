package com.google.android.libraries.lens.view.education;

import android.view.ViewGroup;
import com.google.android.libraries.lens.view.p2057ag.C25101c;
import com.google.android.libraries.lens.view.p2057ag.C25102d;

/* renamed from: com.google.android.libraries.lens.view.education.o */
/* compiled from: PG */
public final class C25785o extends C25772b {

    /* renamed from: d */
    private final C25102d f70055d;

    public C25785o(ViewGroup viewGroup, C25779i iVar, C25102d dVar) {
        super(new C25784n(viewGroup), iVar);
        this.f70055d = dVar;
    }

    /* renamed from: c */
    private final void m47592c() {
        this.f70055d.mo30258b(C25101c.LENS_START);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((com.google.android.libraries.lens.view.education.C25784n) r13.f70042a).f70040d.setText(r15);
        r13.f70042a.mo30917a(4);
        r14 = r13.f70044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0119, code lost:
        if (r14 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x011b, code lost:
        r14.mo30928a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0122, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0123, code lost:
        m47592c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0127, code lost:
        throw r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0108 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30929b(java.util.List r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.libraries.lens.view.ag.d r0 = r13.f70055d
            com.google.android.libraries.lens.view.ag.c r1 = com.google.android.libraries.lens.view.p2057ag.C25101c.PANEL_HEADER
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.android.libraries.lens.view.d.a r0 = r0.mo30257a(r1)
            java.lang.Object r0 = r0.mo3842a()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            r1 = 0
            android.graphics.Typeface r2 = android.graphics.Typeface.defaultFromStyle(r1)
            java.lang.Object r0 = r0.mo56109e(r2)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            com.google.android.libraries.lens.view.education.a r2 = r13.f70042a
            r3 = r2
            com.google.android.libraries.lens.view.education.n r3 = (com.google.android.libraries.lens.view.education.C25784n) r3
            android.widget.TextView r3 = r3.f70053e
            android.view.ViewGroup r2 = r2.f70037a
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r14)
            com.google.android.libraries.lens.view.education.k r5 = com.google.android.libraries.lens.view.education.C25781k.f70050a
            j$.util.stream.Stream r4 = r4.map(r5)
            java.lang.String r5 = " "
            j$.util.stream.Collector r5 = p3186j$.util.stream.Collectors.joining(r5)
            java.lang.Object r4 = r4.collect(r5)
            java.lang.String r4 = (java.lang.String) r4
            r3.setText(r4)
            if (r0 == 0) goto L_0x00e3
            r4 = 0
            r5 = 0
        L_0x0043:
            int r6 = r14.size()     // Catch:{ all -> 0x0108 }
            if (r4 >= r6) goto L_0x00e3
            java.lang.Object r6 = r14.get(r4)     // Catch:{ all -> 0x0108 }
            com.google.lens.j.dw r6 = (com.google.lens.p4707j.C62500dw) r6     // Catch:{ all -> 0x0108 }
            java.lang.String r7 = r6.f168735c     // Catch:{ all -> 0x0108 }
            int r7 = r7.length()     // Catch:{ all -> 0x0108 }
            int r6 = r6.f168734b     // Catch:{ all -> 0x0108 }
            int r6 = com.google.lens.p4707j.C62502dy.m94789a(r6)     // Catch:{ all -> 0x0108 }
            if (r6 != 0) goto L_0x005f
            goto L_0x00de
        L_0x005f:
            r8 = 3
            if (r6 != r8) goto L_0x00de
            int r6 = r5 + r4
            int r8 = r6 + r7
            com.google.android.q.a.a r9 = new com.google.android.q.a.a     // Catch:{ all -> 0x0108 }
            android.content.res.Resources r10 = r2.getResources()     // Catch:{ all -> 0x0108 }
            r11 = 2131169336(0x7f071038, float:1.7953E38)
            float r10 = r10.getDimension(r11)     // Catch:{ all -> 0x0108 }
            android.content.Context r11 = r13.mo30920a()     // Catch:{ all -> 0x0108 }
            r12 = 2131104266(0x7f06120a, float:1.7821022E38)
            int r11 = androidx.core.content.C1878d.m5128a(r11, r12)     // Catch:{ all -> 0x0108 }
            r12 = 16
            r9.<init>(r10, r1, r11, r12)     // Catch:{ all -> 0x0108 }
            java.lang.CharSequence r10 = r3.getText()     // Catch:{ all -> 0x0108 }
            java.lang.String r11 = "view.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)     // Catch:{ all -> 0x0108 }
            java.lang.CharSequence r10 = r10.subSequence(r6, r8)     // Catch:{ all -> 0x0108 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0108 }
            com.google.apps.d.a.x r11 = r9.mo49031a()     // Catch:{ all -> 0x0108 }
            com.google.apps.d.a.ac r10 = com.google.apps.p3589d.p3590a.C45683ab.m81368a(r10, r11)     // Catch:{ all -> 0x0108 }
            float r9 = r9.f117959a     // Catch:{ all -> 0x0108 }
            com.google.android.q.a.d r11 = new com.google.android.q.a.d     // Catch:{ all -> 0x0108 }
            r11.<init>(r9)     // Catch:{ all -> 0x0108 }
            android.graphics.Paint r9 = new android.graphics.Paint     // Catch:{ all -> 0x0108 }
            r9.<init>()     // Catch:{ all -> 0x0108 }
            android.content.res.ColorStateList r12 = r3.getTextColors()     // Catch:{ all -> 0x0108 }
            int r12 = r12.getDefaultColor()     // Catch:{ all -> 0x0108 }
            r9.setColor(r12)     // Catch:{ all -> 0x0108 }
            r11.mo49045j(r9)     // Catch:{ all -> 0x0108 }
            r11.mo49044i(r10)     // Catch:{ all -> 0x0108 }
            r11.mo49047l(r0)     // Catch:{ all -> 0x0108 }
            int r9 = r11.getIntrinsicWidth()     // Catch:{ all -> 0x0108 }
            int r10 = r11.getIntrinsicHeight()     // Catch:{ all -> 0x0108 }
            r11.setBounds(r1, r1, r9, r10)     // Catch:{ all -> 0x0108 }
            java.lang.CharSequence r9 = r3.getText()     // Catch:{ all -> 0x0108 }
            android.text.SpannableString r9 = android.text.SpannableString.valueOf(r9)     // Catch:{ all -> 0x0108 }
            com.google.android.q.a.e r10 = new com.google.android.q.a.e     // Catch:{ all -> 0x0108 }
            r10.<init>(r11)     // Catch:{ all -> 0x0108 }
            r11 = 33
            r9.setSpan(r10, r6, r8, r11)     // Catch:{ all -> 0x0108 }
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ all -> 0x0108 }
            r3.setText(r9, r6)     // Catch:{ all -> 0x0108 }
        L_0x00de:
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto L_0x0043
        L_0x00e3:
            com.google.android.libraries.lens.view.education.a r14 = r13.f70042a     // Catch:{ all -> 0x0108 }
            r0 = 2
            r14.mo30917a(r0)     // Catch:{ all -> 0x0108 }
            com.google.android.libraries.lens.view.education.a r14 = r13.f70042a     // Catch:{ all -> 0x0108 }
            com.google.android.libraries.lens.view.education.n r14 = (com.google.android.libraries.lens.view.education.C25784n) r14     // Catch:{ all -> 0x0108 }
            android.widget.TextView r14 = r14.f70053e     // Catch:{ all -> 0x0108 }
            r14.requestLayout()     // Catch:{ all -> 0x0108 }
            com.google.android.libraries.lens.view.education.a r14 = r13.f70042a     // Catch:{ all -> 0x0108 }
            com.google.android.libraries.lens.view.education.n r14 = (com.google.android.libraries.lens.view.education.C25784n) r14     // Catch:{ all -> 0x0108 }
            android.widget.TextView r14 = r14.f70053e     // Catch:{ all -> 0x0108 }
            android.view.ViewTreeObserver r14 = r14.getViewTreeObserver()     // Catch:{ all -> 0x0108 }
            com.google.android.libraries.lens.view.education.m r0 = new com.google.android.libraries.lens.view.education.m     // Catch:{ all -> 0x0108 }
            r0.<init>(r13)     // Catch:{ all -> 0x0108 }
            r14.addOnGlobalLayoutListener(r0)     // Catch:{ all -> 0x0108 }
            r13.m47592c()
            return
        L_0x0108:
            com.google.android.libraries.lens.view.education.a r14 = r13.f70042a     // Catch:{ all -> 0x0122 }
            com.google.android.libraries.lens.view.education.n r14 = (com.google.android.libraries.lens.view.education.C25784n) r14     // Catch:{ all -> 0x0122 }
            android.widget.TextView r14 = r14.f70040d     // Catch:{ all -> 0x0122 }
            r14.setText(r15)     // Catch:{ all -> 0x0122 }
            com.google.android.libraries.lens.view.education.a r14 = r13.f70042a     // Catch:{ all -> 0x0122 }
            r15 = 4
            r14.mo30917a(r15)     // Catch:{ all -> 0x0122 }
            com.google.android.libraries.lens.view.education.e r14 = r13.f70044c     // Catch:{ all -> 0x0122 }
            if (r14 == 0) goto L_0x011e
            r14.mo30928a()     // Catch:{ all -> 0x0122 }
        L_0x011e:
            r13.m47592c()
            return
        L_0x0122:
            r14 = move-exception
            r13.m47592c()
            goto L_0x0128
        L_0x0127:
            throw r14
        L_0x0128:
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.education.C25785o.mo30929b(java.util.List, java.lang.String):void");
    }
}
