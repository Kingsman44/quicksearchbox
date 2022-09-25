package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.t */
/* compiled from: PG */
final class C26193t extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C26197x f71174a;

    public C26193t(C26197x xVar) {
        this.f71174a = xVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lens_translate_filter_language_item, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo18114b(android.view.View r20, java.lang.Object r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            com.google.android.libraries.lens.view.filters.translation.languagepicker.ab r0 = (com.google.android.libraries.lens.view.filters.translation.languagepicker.C26133ab) r0
            com.google.android.libraries.lens.view.filters.translation.languagepicker.m r2 = new com.google.android.libraries.lens.view.filters.translation.languagepicker.m
            r3 = r20
            r2.<init>(r3)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.ae r0 = (com.google.android.libraries.lens.view.filters.translation.languagepicker.C26136ae) r0
            com.google.android.libraries.lens.view.filters.translation.languagepicker.x r3 = r1.f71174a
            android.widget.TextView r4 = r2.f71155a
            com.google.common.base.ax r5 = r0.mo31364d()
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x0022
            java.lang.String r3 = r0.mo31366f()
            goto L_0x0058
        L_0x0022:
            com.google.common.base.ax r5 = r0.mo31364d()
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.libraries.lens.view.filters.translation.languagepicker.aa r5 = (com.google.android.libraries.lens.view.filters.translation.languagepicker.C26132aa) r5
            int r5 = r5.mo31352b()
            com.google.common.base.ax r6 = r0.mo31364d()
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.libraries.lens.view.filters.translation.languagepicker.aa r6 = (com.google.android.libraries.lens.view.filters.translation.languagepicker.C26132aa) r6
            int r6 = r6.mo31351a()
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            java.lang.String r8 = r0.mo31366f()
            r7.<init>(r8)
            android.text.style.TextAppearanceSpan r8 = new android.text.style.TextAppearanceSpan
            android.content.Context r3 = r3.f71177a
            r9 = 2132149364(0x7f160474, float:1.9940732E38)
            r8.<init>(r3, r9)
            int r6 = r6 + r5
            r3 = 33
            r7.setSpan(r8, r5, r6, r3)
            r3 = r7
        L_0x0058:
            r4.setText(r3)
            com.google.common.base.ax r3 = r0.mo31365e()
            boolean r3 = r3.mo56113h()
            r4 = 8
            r5 = 0
            if (r3 == 0) goto L_0x007d
            android.widget.TextView r3 = r2.f71156b
            com.google.common.base.ax r6 = r0.mo31365e()
            java.lang.Object r6 = r6.mo56107c()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r3.setText(r6)
            android.widget.TextView r3 = r2.f71156b
            r3.setVisibility(r5)
            goto L_0x0082
        L_0x007d:
            android.widget.TextView r3 = r2.f71156b
            r3.setVisibility(r4)
        L_0x0082:
            boolean r3 = r0.mo31371k()
            android.widget.ImageView r6 = r2.f71157c
            r7 = 1
            if (r7 == r3) goto L_0x008e
            r8 = 8
            goto L_0x008f
        L_0x008e:
            r8 = 0
        L_0x008f:
            r6.setVisibility(r8)
            android.widget.ImageView r6 = r2.f71157c
            r6.setSelected(r3)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.x r3 = r1.f71174a
            com.google.apps.tiktok.tracing.ag r3 = r3.f71182f
            java.lang.String r6 = "Translate binders"
            com.google.apps.tiktok.tracing.bx r3 = r3.mo51387a(r6)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.x r6 = r1.f71174a     // Catch:{ all -> 0x031d }
            boolean r8 = r0.mo31372l()     // Catch:{ all -> 0x031d }
            if (r8 != 0) goto L_0x00af
            android.widget.LinearLayout r6 = r2.f71162h     // Catch:{ all -> 0x031d }
            r6.setVisibility(r4)     // Catch:{ all -> 0x031d }
            goto L_0x00e7
        L_0x00af:
            android.widget.LinearLayout r8 = r2.f71162h     // Catch:{ all -> 0x031d }
            r8.setVisibility(r5)     // Catch:{ all -> 0x031d }
            android.widget.ImageButton r8 = r2.f71163i     // Catch:{ all -> 0x031d }
            com.google.apps.tiktok.tracing.dh r9 = r6.f71181e     // Catch:{ all -> 0x031d }
            com.google.android.libraries.lens.view.filters.translation.languagepicker.q r10 = new com.google.android.libraries.lens.view.filters.translation.languagepicker.q     // Catch:{ all -> 0x031d }
            r10.<init>(r6, r2)     // Catch:{ all -> 0x031d }
            com.google.apps.tiktok.tracing.co r11 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x031d }
            java.lang.String r12 = "Close tooltip"
            r11.<init>(r9, r12, r10)     // Catch:{ all -> 0x031d }
            r8.setOnClickListener(r11)     // Catch:{ all -> 0x031d }
            android.widget.ImageButton r8 = r2.f71163i     // Catch:{ all -> 0x031d }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ all -> 0x031d }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ all -> 0x031d }
            r9 = 1103101952(0x41c00000, float:24.0)
            float r8 = android.util.TypedValue.applyDimension(r7, r9, r8)     // Catch:{ all -> 0x031d }
            int r8 = (int) r8     // Catch:{ all -> 0x031d }
            android.widget.ImageButton r9 = r2.f71163i     // Catch:{ all -> 0x031d }
            com.google.android.libraries.lens.view.filters.translation.languagepicker.r r10 = new com.google.android.libraries.lens.view.filters.translation.languagepicker.r     // Catch:{ all -> 0x031d }
            r10.<init>(r2, r8)     // Catch:{ all -> 0x031d }
            r9.addOnLayoutChangeListener(r10)     // Catch:{ all -> 0x031d }
            com.google.android.libraries.lens.view.filters.translation.ax r6 = r6.f71179c     // Catch:{ all -> 0x031d }
            r6.mo31254i()     // Catch:{ all -> 0x031d }
        L_0x00e7:
            r3.close()
            boolean r3 = r0.mo31369i()
            android.view.ViewGroup r6 = r2.f71161g
            r6.setEnabled(r3)
            android.widget.TextView r6 = r2.f71155a
            r6.setEnabled(r3)
            android.widget.TextView r6 = r2.f71156b
            r6.setEnabled(r3)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.DownloadButtonLayout r3 = r2.f71160f
            com.google.android.libraries.lens.view.filters.translation.languagepicker.i r3 = r3.mo17754z()
            com.google.android.libraries.lens.view.am.c r6 = r0.mo31362b()
            com.google.common.base.ax r8 = r0.mo31363c()
            java.util.Locale r9 = r0.mo31368h()
            com.google.android.libraries.lens.view.filters.translation.languagepicker.x r10 = r1.f71174a
            com.google.android.libraries.lens.view.filters.translation.languagepicker.bf r10 = r10.f71190n
            com.google.android.material.progressindicator.CircularProgressIndicator r11 = r3.f71146e
            r11.setVisibility(r4)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.DownloadButtonLayout r11 = r3.f71150i
            r11.setVisibility(r5)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.DownloadStateImageView r11 = r3.f71152k
            r11.f71000a = r6
            r11.refreshDrawableState()
            com.google.android.libraries.lens.view.am.c r11 = com.google.android.libraries.lens.view.p2069am.C25327c.UNKNOWN
            int r11 = r6.ordinal()
            r12 = 0
            r14 = 4
            r15 = 3
            r4 = 2
            if (r11 == 0) goto L_0x01a1
            r5 = 6
            if (r11 == r5) goto L_0x01a1
            if (r11 == r4) goto L_0x0196
            if (r11 == r15) goto L_0x0196
            if (r11 == r14) goto L_0x013d
        L_0x013a:
            r12 = 8
            goto L_0x01a8
        L_0x013d:
            com.google.android.material.progressindicator.CircularProgressIndicator r5 = r3.f71146e
            r5.mo48278i()
            com.google.android.material.progressindicator.CircularProgressIndicator r5 = r3.f71146e
            r5.setIndeterminate(r7)
            boolean r5 = r8.mo56113h()
            if (r5 == 0) goto L_0x013a
            java.lang.Object r5 = r8.mo56107c()
            com.google.android.libraries.lens.view.am.b r5 = (com.google.android.libraries.lens.view.p2069am.C25319b) r5
            long r14 = r5.f68890a
            java.lang.Object r5 = r8.mo56107c()
            com.google.android.libraries.lens.view.am.b r5 = (com.google.android.libraries.lens.view.p2069am.C25319b) r5
            long r4 = r5.f68891b
            int r16 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r16 > 0) goto L_0x0178
            com.google.common.f.e r14 = com.google.android.libraries.lens.view.filters.translation.languagepicker.C26182i.f71142a
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            r15 = 49404(0xc0fc, float:6.923E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r15)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            java.lang.String r15 = "Received invalid value for total download size: %d bytes"
            r14.mo56388r(r15, r4)
            goto L_0x013a
        L_0x0178:
            com.google.android.material.progressindicator.CircularProgressIndicator r11 = r3.f71146e
            r12 = 0
            r11.setIndeterminate(r12)
            int r11 = r3.f71143b
            com.google.android.material.progressindicator.CircularProgressIndicator r12 = r3.f71146e
            double r13 = (double) r14
            double r4 = (double) r4
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r4)
            double r13 = r13 / r4
            double r4 = (double) r11
            java.lang.Double.isNaN(r4)
            double r13 = r13 * r4
            int r4 = (int) r13
            r12.mo48254h(r4, r7)
            goto L_0x013a
        L_0x0196:
            com.google.android.material.progressindicator.CircularProgressIndicator r4 = r3.f71146e
            r4.mo48278i()
            com.google.android.material.progressindicator.CircularProgressIndicator r4 = r3.f71146e
            r4.setIndeterminate(r7)
            goto L_0x013a
        L_0x01a1:
            com.google.android.libraries.lens.view.filters.translation.languagepicker.DownloadButtonLayout r4 = r3.f71150i
            r12 = 8
            r4.setVisibility(r12)
        L_0x01a8:
            int r4 = r6.ordinal()
            r5 = 7
            r11 = 2
            if (r4 == r11) goto L_0x0217
            r11 = 3
            if (r4 == r11) goto L_0x020c
            r11 = 4
            if (r4 == r11) goto L_0x01c6
            if (r4 == r5) goto L_0x01bb
        L_0x01b8:
            r8 = r6
            r4 = 0
            goto L_0x0221
        L_0x01bb:
            android.content.Context r4 = r3.f71144c
            r8 = 2132089084(0x7f1518fc, float:1.981847E38)
            java.lang.String r4 = r4.getString(r8)
            r8 = r6
            goto L_0x0221
        L_0x01c6:
            boolean r4 = r8.mo56113h()
            if (r4 == 0) goto L_0x01b8
            java.lang.Object r4 = r8.mo56107c()
            com.google.android.libraries.lens.view.am.b r4 = (com.google.android.libraries.lens.view.p2069am.C25319b) r4
            long r14 = r4.f68890a
            java.lang.Object r4 = r8.mo56107c()
            com.google.android.libraries.lens.view.am.b r4 = (com.google.android.libraries.lens.view.p2069am.C25319b) r4
            long r11 = r4.f68891b
            r17 = 0
            int r4 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x01e3
            goto L_0x01b8
        L_0x01e3:
            android.content.Context r4 = r3.f71144c
            r8 = 2
            java.lang.Object[] r13 = new java.lang.Object[r8]
            double r14 = (double) r14
            r8 = r6
            double r5 = (double) r11
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r5)
            double r14 = r14 / r5
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r14 = r14 * r5
            int r5 = (int) r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r13[r6] = r5
            java.lang.String r5 = android.text.format.Formatter.formatShortFileSize(r4, r11)
            r13[r7] = r5
            r5 = 2132089085(0x7f1518fd, float:1.9818472E38)
            java.lang.String r4 = r4.getString(r5, r13)
            goto L_0x0221
        L_0x020c:
            r8 = r6
            android.content.Context r4 = r3.f71144c
            r5 = 2132089087(0x7f1518ff, float:1.9818476E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0221
        L_0x0217:
            r8 = r6
            android.content.Context r4 = r3.f71144c
            r5 = 2132089086(0x7f1518fe, float:1.9818474E38)
            java.lang.String r4 = r4.getString(r5)
        L_0x0221:
            android.widget.TextView r5 = r3.f71145d
            if (r4 != 0) goto L_0x0228
            r6 = 8
            goto L_0x0229
        L_0x0228:
            r6 = 0
        L_0x0229:
            r5.setVisibility(r6)
            android.widget.TextView r5 = r3.f71145d
            r5.setText(r4)
            android.view.View r4 = r3.f71153l
            com.google.android.libraries.logging.ve.ab r5 = r3.f71147f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r11 = 2131432592(0x7f0b1490, float:1.8486946E38)
            java.lang.Object r12 = r4.getTag(r11)
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x024f
            com.google.android.libraries.logging.p2185ve.C28306ab.m52929e(r4)
            r6 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            r4.setTag(r11, r12)
        L_0x024f:
            int r6 = r8.ordinal()
            r12 = 5
            if (r6 == r7) goto L_0x027e
            r11 = 2
            if (r6 == r11) goto L_0x0277
            r11 = 3
            if (r6 == r11) goto L_0x0270
            r11 = 4
            if (r6 == r11) goto L_0x0269
            if (r6 == r12) goto L_0x0262
            goto L_0x0284
        L_0x0262:
            r6 = 105039(0x19a4f, float:1.47191E-40)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.C26182i.m48348a(r4, r6, r5)
            goto L_0x0284
        L_0x0269:
            r6 = 105040(0x19a50, float:1.47192E-40)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.C26182i.m48348a(r4, r6, r5)
            goto L_0x0284
        L_0x0270:
            r6 = 145865(0x239c9, float:2.044E-40)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.C26182i.m48348a(r4, r6, r5)
            goto L_0x0284
        L_0x0277:
            r6 = 119595(0x1d32b, float:1.67588E-40)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.C26182i.m48348a(r4, r6, r5)
            goto L_0x0284
        L_0x027e:
            r6 = 104299(0x1976b, float:1.46154E-40)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.C26182i.m48348a(r4, r6, r5)
        L_0x0284:
            android.view.View r4 = r3.f71153l
            com.google.android.libraries.lens.view.filters.translation.r r5 = r3.f71149h
            java.lang.String r5 = r5.mo31434d(r9)
            int r6 = r8.ordinal()
            if (r6 == r7) goto L_0x02a2
            r13 = 2
            if (r6 == r13) goto L_0x02b3
            r13 = 3
            if (r6 == r13) goto L_0x02b3
            r11 = 4
            if (r6 == r11) goto L_0x02b3
            if (r6 == r12) goto L_0x02a4
            r11 = 7
            if (r6 == r11) goto L_0x02a2
            r13 = 0
            goto L_0x02cf
        L_0x02a2:
            r12 = 0
            goto L_0x02c2
        L_0x02a4:
            android.content.Context r6 = r3.f71144c
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r12 = 0
            r11[r12] = r5
            r5 = 2132089096(0x7f151908, float:1.9818494E38)
            java.lang.String r13 = r6.getString(r5, r11)
            goto L_0x02cf
        L_0x02b3:
            r12 = 0
            android.content.Context r6 = r3.f71144c
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r12] = r5
            r5 = 2132089042(0x7f1518d2, float:1.9818385E38)
            java.lang.String r13 = r6.getString(r5, r11)
            goto L_0x02cf
        L_0x02c2:
            android.content.Context r6 = r3.f71144c
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r12] = r5
            r5 = 2132089058(0x7f1518e2, float:1.9818417E38)
            java.lang.String r13 = r6.getString(r5, r11)
        L_0x02cf:
            r4.setContentDescription(r13)
            android.view.View r4 = r3.f71153l
            com.google.android.libraries.lens.view.filters.translation.languagepicker.h r5 = new com.google.android.libraries.lens.view.filters.translation.languagepicker.h
            r5.<init>(r3, r9, r8, r10)
            r4.setOnClickListener(r5)
            java.util.Locale r3 = r0.mo31368h()
            java.util.Locale r4 = com.google.android.libraries.lens.view.filters.translation.C26217r.f71251a
            boolean r3 = r3.equals(r4)
            android.widget.ImageView r4 = r2.f71158d
            if (r7 == r3) goto L_0x02ed
            r12 = 8
            goto L_0x02ee
        L_0x02ed:
            r12 = 0
        L_0x02ee:
            r4.setVisibility(r12)
            com.google.android.libraries.lens.view.filters.translation.languagepicker.x r4 = r1.f71174a
            android.view.ViewGroup r5 = r2.f71161g
            if (r7 == r3) goto L_0x02f9
            r3 = 0
            goto L_0x02fb
        L_0x02f9:
            r3 = 8
        L_0x02fb:
            r4.mo31420c(r5, r3)
            android.view.ViewGroup r3 = r2.f71161g
            boolean r4 = r0.mo31371k()
            r3.setActivated(r4)
            android.view.ViewGroup r2 = r2.f71161g
            com.google.android.libraries.lens.view.filters.translation.languagepicker.x r3 = r1.f71174a
            com.google.apps.tiktok.tracing.dh r3 = r3.f71181e
            com.google.android.libraries.lens.view.filters.translation.languagepicker.s r4 = new com.google.android.libraries.lens.view.filters.translation.languagepicker.s
            r4.<init>(r1, r0)
            com.google.apps.tiktok.tracing.co r0 = new com.google.apps.tiktok.tracing.co
            java.lang.String r5 = "Click language"
            r0.<init>(r3, r5, r4)
            r2.setOnClickListener(r0)
            return
        L_0x031d:
            r0 = move-exception
            r2 = r0
            r3.close()     // Catch:{ all -> 0x0323 }
            goto L_0x033b
        L_0x0323:
            r0 = move-exception
            r3 = r0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x033b }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x033b }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x033b }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x033b }
            r4[r5] = r3     // Catch:{ Exception -> 0x033b }
            r0.invoke(r2, r4)     // Catch:{ Exception -> 0x033b }
        L_0x033b:
            goto L_0x033d
        L_0x033c:
            throw r2
        L_0x033d:
            goto L_0x033c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.filters.translation.languagepicker.C26193t.mo18114b(android.view.View, java.lang.Object):void");
    }
}
