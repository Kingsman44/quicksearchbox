package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.b */
/* compiled from: PG */
public final /* synthetic */ class C115577b implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ MediaItemInfoPageRenderer f320607a;

    public /* synthetic */ C115577b(MediaItemInfoPageRenderer mediaItemInfoPageRenderer) {
        this.f320607a = mediaItemInfoPageRenderer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r2 != false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0168  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28366a(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.MediaItemInfoPageRenderer r0 = r11.f320607a
            com.google.assistant.e.j.hz r12 = (com.google.assistant.p3897e.p3921j.C52174hz) r12
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.f320528s = r12
            com.google.assistant.e.j.wo r12 = r12.f136897d
            if (r12 != 0) goto L_0x000e
            com.google.assistant.e.j.wo r12 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x000e:
            android.widget.TextView r1 = r0.f320515f
            java.lang.String r2 = r12.f137998e
            r1.setText(r2)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ThumbnailView r1 = r0.f320526q
            java.lang.String r2 = r12.f138000g
            com.google.assistant.e.c.c.dc r3 = r12.f138004k
            if (r3 != 0) goto L_0x001f
            com.google.assistant.e.c.c.dc r3 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x001f:
            com.google.android.libraries.gsa.k.g r4 = r0.f320513d
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ah r5 = r0.f320514e
            r1.mo102127a(r2, r3, r4, r5)
            r0.mo102084e(r12)
            java.lang.String r1 = r12.f138000g
            boolean r1 = r1.isEmpty()
            java.lang.String r2 = r12.f138006m
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r12.f138000g
            r4.append(r1)
            if (r2 == 0) goto L_0x005e
            android.content.Context r1 = r0.f320510a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132090372(0x7f151e04, float:1.9821082E38)
            java.lang.String r1 = r1.getString(r2)
            r4.append(r1)
            goto L_0x0059
        L_0x0057:
            if (r2 == 0) goto L_0x005e
        L_0x0059:
            java.lang.String r1 = r12.f138006m
            r4.append(r1)
        L_0x005e:
            java.lang.String r1 = r4.toString()
            android.widget.TextView r2 = r0.f320522m
            com.google.android.libraries.logging.j r2 = com.google.android.libraries.logging.C28295m.m52915a(r2)
            boolean r4 = r1.isEmpty()
            r5 = 8
            r6 = 0
            if (r4 != 0) goto L_0x00b0
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            int r7 = r12.f137994a
            r7 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = r12.f138006m
            int r7 = r7.length()
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.MediaItemInfoPageRenderer$URLSpanNoUnderline r8 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.MediaItemInfoPageRenderer$URLSpanNoUnderline
            java.lang.String r9 = r12.f138007n
            r8.<init>(r9)
            int r9 = r1.length()
            int r9 = r9 - r7
            int r1 = r1.length()
            r7 = 33
            r4.setSpan(r8, r9, r1, r7)
            android.widget.TextView r1 = r0.f320522m
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r7)
        L_0x00a0:
            android.widget.TextView r1 = r0.f320522m
            r1.setText(r4)
            android.widget.TextView r1 = r0.f320522m
            r1.setVisibility(r6)
            if (r2 == 0) goto L_0x00bb
            r2.mo33794h(r3)
            goto L_0x00bb
        L_0x00b0:
            android.widget.TextView r1 = r0.f320522m
            r1.setVisibility(r5)
            if (r2 == 0) goto L_0x00bb
            r1 = 2
            r2.mo33794h(r1)
        L_0x00bb:
            int r1 = r12.f137994a
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x00f4
            com.google.assistant.e.j.qp r1 = r12.f138005l
            if (r1 != 0) goto L_0x00c7
            com.google.assistant.e.j.qp r1 = com.google.assistant.p3897e.p3921j.C52407qp.f137523d
        L_0x00c7:
            long r1 = r1.f137526b
            r7 = 0
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f4
            android.widget.TextView r1 = r0.f320521l
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.google.assistant.e.j.qp r4 = r12.f138005l
            if (r4 != 0) goto L_0x00d9
            com.google.assistant.e.j.qp r4 = com.google.assistant.p3897e.p3921j.C52407qp.f137523d
        L_0x00d9:
            long r7 = r4.f137526b
            long r7 = r2.toMillis(r7)
            com.google.android.libraries.f.a r2 = r0.f320512c
            long r9 = r2.mo26870b()
            android.content.Context r2 = r0.f320510a
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115625am.m191766a(r7, r9, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f320521l
            r1.setVisibility(r6)
            goto L_0x00f9
        L_0x00f4:
            android.widget.TextView r1 = r0.f320521l
            r1.setVisibility(r5)
        L_0x00f9:
            int r1 = r12.f137994a
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0114
            int r1 = r12.f138008o
            if (r1 <= 0) goto L_0x0114
            android.widget.TextView r2 = r0.f320520k
            long r7 = (long) r1
            java.lang.String r1 = android.text.format.DateUtils.formatElapsedTime(r7)
            r2.setText(r1)
            android.widget.TextView r1 = r0.f320520k
            r1.setVisibility(r6)
            goto L_0x0119
        L_0x0114:
            android.widget.TextView r1 = r0.f320520k
            r1.setVisibility(r5)
        L_0x0119:
            java.lang.String r1 = r12.f138002i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012e
            android.widget.TextView r1 = r0.f320518i
            java.lang.String r2 = r12.f138002i
            r1.setText(r2)
            android.view.View r1 = r0.f320525p
            r1.setVisibility(r6)
            goto L_0x0133
        L_0x012e:
            android.view.View r1 = r0.f320525p
            r1.setVisibility(r5)
        L_0x0133:
            java.lang.String r1 = r12.f138001h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0168
            java.lang.String r1 = r12.f138000g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0168
            android.widget.TextView r1 = r0.f320516g
            android.content.Context r2 = r0.f320510a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r12.f138000g
            r3[r6] = r4
            r4 = 2132090370(0x7f151e02, float:1.9821078E38)
            java.lang.String r2 = r2.getString(r4, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f320517h
            java.lang.String r12 = r12.f138001h
            r1.setText(r12)
            android.view.View r12 = r0.f320524o
            r12.setVisibility(r6)
            return
        L_0x0168:
            android.view.View r12 = r0.f320524o
            r12.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.C115577b.mo28366a(java.lang.Object):void");
    }
}
