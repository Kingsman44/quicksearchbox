package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52174hz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ac */
/* compiled from: PG */
public final class C115615ac extends C115640p {

    /* renamed from: a */
    public final C115648x f320723a;

    /* renamed from: b */
    private final Context f320724b;

    /* renamed from: c */
    private final TextView f320725c;

    /* renamed from: d */
    private final TextView f320726d;

    /* renamed from: e */
    private final ImageButton f320727e;

    /* renamed from: f */
    private final ThumbnailView f320728f;

    /* renamed from: g */
    private final C21370a f320729g;

    /* renamed from: h */
    private final C22871g f320730h;

    /* renamed from: i */
    private final C115620ah f320731i;

    /* renamed from: j */
    private final ImageView f320732j;

    /* renamed from: k */
    private final ImageView f320733k;

    /* renamed from: l */
    private final ProgressBar f320734l;

    public C115615ac(View view, Context context, C21370a aVar, C22871g gVar, C115620ah ahVar, C115648x xVar) {
        super(view);
        this.f320724b = context;
        this.f320729g = aVar;
        this.f320730h = gVar;
        this.f320731i = ahVar;
        this.f320723a = xVar;
        this.f320725c = (TextView) view.findViewById(R.id.media_item_title);
        this.f320726d = (TextView) view.findViewById(R.id.media_item_subtitle);
        this.f320727e = (ImageButton) view.findViewById(R.id.media_item_info_button);
        this.f320728f = (ThumbnailView) view.findViewById(R.id.media_item_thumbnail);
        this.f320732j = (ImageView) view.findViewById(R.id.media_item_equalizer_animation);
        this.f320734l = (ProgressBar) view.findViewById(R.id.buffering_spinner);
        this.f320733k = (ImageView) view.findViewById(R.id.media_item_equalizer_background);
    }

    /* renamed from: a */
    public final void mo102131a(int i, C52174hz hzVar, C115466j jVar) {
        mo102132b(i, hzVar, jVar, (C28293k) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102132b(int r12, com.google.assistant.p3897e.p3921j.C52174hz r13, com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j r14, com.google.android.libraries.logging.C28293k r15) {
        /*
            r11 = this;
            com.google.assistant.e.j.wo r0 = r13.f136897d
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.j.wo r0 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0006:
            android.widget.TextView r1 = r11.f320725c
            java.lang.String r2 = r0.f137998e
            r1.setText(r2)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ThumbnailView r1 = r11.f320728f
            java.lang.String r2 = r0.f138000g
            com.google.assistant.e.c.c.dc r3 = r0.f138004k
            if (r3 != 0) goto L_0x0017
            com.google.assistant.e.c.c.dc r3 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0017:
            com.google.android.libraries.gsa.k.g r4 = r11.f320730h
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ah r5 = r11.f320731i
            r1.mo102127a(r2, r3, r4, r5)
            android.widget.TextView r1 = r11.f320726d
            int r2 = r0.f137994a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0045
            com.google.assistant.e.j.qp r2 = r0.f138005l
            if (r2 != 0) goto L_0x002c
            com.google.assistant.e.j.qp r2 = com.google.assistant.p3897e.p3921j.C52407qp.f137523d
        L_0x002c:
            long r2 = r2.f137526b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r4.toMillis(r2)
            com.google.android.libraries.f.a r4 = r11.f320729g
            long r4 = r4.mo26870b()
            android.content.Context r6 = r11.f320724b
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115625am.m191766a(r2, r4, r6)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0047
        L_0x0045:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0047:
            java.lang.String r3 = r0.f138000g
            boolean r3 = r3.isEmpty()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x006c
            int r3 = r0.f137996c
            r6 = 18
            if (r3 != r6) goto L_0x005c
            java.lang.Object r3 = r0.f137997d
            com.google.assistant.e.j.wu r3 = (com.google.assistant.p3897e.p3921j.C52574wu) r3
            goto L_0x005e
        L_0x005c:
            com.google.assistant.e.j.wu r3 = com.google.assistant.p3897e.p3921j.C52574wu.f138026h
        L_0x005e:
            int r3 = r3.f138029b
            int r3 = com.google.assistant.p3897e.p3921j.C52571wr.m86651a(r3)
            if (r3 != 0) goto L_0x0068
        L_0x0066:
            r3 = 1
            goto L_0x006d
        L_0x0068:
            r6 = 2
            if (r3 == r6) goto L_0x006c
            goto L_0x0066
        L_0x006c:
            r3 = 0
        L_0x006d:
            boolean r6 = r2.mo56113h()
            int r7 = r0.f137994a
            r8 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x007e
            int r7 = r0.f138008o
            if (r7 <= 0) goto L_0x007e
            r7 = 1
            goto L_0x007f
        L_0x007e:
            r7 = 0
        L_0x007f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            if (r6 == 0) goto L_0x008f
            java.lang.Object r2 = r2.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            r8.append(r2)
        L_0x008f:
            java.lang.String r2 = " • "
            if (r6 == 0) goto L_0x0098
            if (r7 == 0) goto L_0x0098
            r8.append(r2)
        L_0x0098:
            if (r7 == 0) goto L_0x00a4
            int r9 = r0.f138008o
            long r9 = (long) r9
            java.lang.String r9 = android.text.format.DateUtils.formatElapsedTime(r9)
            r8.append(r9)
        L_0x00a4:
            if (r3 == 0) goto L_0x00b2
            if (r7 != 0) goto L_0x00aa
            if (r6 == 0) goto L_0x00ad
        L_0x00aa:
            r8.append(r2)
        L_0x00ad:
            java.lang.String r2 = r0.f138000g
            r8.append(r2)
        L_0x00b2:
            java.lang.String r2 = r8.toString()
            r1.setText(r2)
            android.widget.ImageButton r1 = r11.f320727e
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.aa r2 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.aa
            r2.<init>(r11, r12, r14)
            r1.setOnClickListener(r2)
            android.widget.ImageButton r1 = r11.f320727e
            android.content.Context r2 = r11.f320724b
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f137998e
            r3[r5] = r0
            r0 = 2132090427(0x7f151e3b, float:1.9821194E38)
            java.lang.String r0 = r2.getString(r0, r3)
            r1.setContentDescription(r0)
            android.view.View r0 = r11.itemView
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ab r1 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ab
            r1.<init>(r11, r12, r14)
            r0.setOnClickListener(r1)
            com.google.common.base.ax r12 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b.m191567a(r13)
            boolean r13 = r12.mo56113h()
            if (r13 == 0) goto L_0x00fe
            java.lang.Object r12 = r12.mo56107c()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r14.f320319n
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            if (r15 == 0) goto L_0x0145
            com.google.android.libraries.logging.a r15 = (com.google.android.libraries.logging.C28257a) r15
            java.util.List r12 = r15.f76909b
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x010c
            goto L_0x0145
        L_0x010c:
            java.util.List r12 = r15.f76909b
            java.lang.Object r12 = r12.get(r5)
            com.google.android.libraries.logging.k r12 = (com.google.android.libraries.logging.C28293k) r12
            com.google.android.libraries.logging.j r13 = r12.mo33745a()
            if (r13 == 0) goto L_0x0145
            android.view.View r15 = r11.itemView
            r0 = 5
            r13.mo33795i(r0)
            com.google.android.libraries.logging.C28295m.m52919e(r15, r13)
            java.util.List r13 = r12.mo33746b()
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0145
            java.util.List r12 = r12.mo33746b()
            java.lang.Object r12 = r12.get(r5)
            com.google.android.libraries.logging.k r12 = (com.google.android.libraries.logging.C28293k) r12
            com.google.android.libraries.logging.j r12 = r12.mo33745a()
            if (r12 == 0) goto L_0x0145
            android.widget.ImageButton r13 = r11.f320727e
            r12.mo33795i(r0)
            com.google.android.libraries.logging.C28295m.m52919e(r13, r12)
        L_0x0145:
            android.widget.ImageView r12 = r11.f320732j
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            android.graphics.drawable.AnimationDrawable r12 = (android.graphics.drawable.AnimationDrawable) r12
            r13 = 8
            if (r4 != 0) goto L_0x016e
            android.widget.TextView r14 = r11.f320725c
            android.content.Context r15 = r11.f320724b
            r0 = 2132149546(0x7f16052a, float:1.9941101E38)
            r14.setTextAppearance(r15, r0)
            android.widget.ImageView r14 = r11.f320732j
            r14.setVisibility(r13)
            android.widget.ImageView r14 = r11.f320733k
            r14.setVisibility(r13)
            android.widget.ProgressBar r14 = r11.f320734l
            r14.setVisibility(r13)
            r12.stop()
            return
        L_0x016e:
            android.widget.TextView r15 = r11.f320725c
            android.content.Context r0 = r11.f320724b
            r1 = 2132149545(0x7f160529, float:1.99411E38)
            r15.setTextAppearance(r0, r1)
            boolean r15 = r14.f320311f
            if (r15 == 0) goto L_0x0199
            android.widget.ProgressBar r12 = r11.f320734l
            r12.setVisibility(r5)
            android.widget.ProgressBar r12 = r11.f320734l
            android.content.Context r14 = r11.f320724b
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2132090396(0x7f151e1c, float:1.982113E38)
            java.lang.String r14 = r14.getString(r15)
            r12.setContentDescription(r14)
            android.widget.ImageView r12 = r11.f320732j
            r12.setVisibility(r13)
            goto L_0x01e0
        L_0x0199:
            boolean r15 = r14.f320310e
            if (r15 == 0) goto L_0x01bd
            android.widget.ProgressBar r14 = r11.f320734l
            r14.setVisibility(r13)
            android.widget.ImageView r13 = r11.f320732j
            android.content.Context r14 = r11.f320724b
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2132090398(0x7f151e1e, float:1.9821135E38)
            java.lang.String r14 = r14.getString(r15)
            r13.setContentDescription(r14)
            r12.start()
            android.widget.ImageView r12 = r11.f320732j
            r12.setVisibility(r5)
            goto L_0x01e0
        L_0x01bd:
            boolean r14 = r14.f320309d
            if (r14 == 0) goto L_0x01e0
            android.widget.ProgressBar r14 = r11.f320734l
            r14.setVisibility(r13)
            android.widget.ImageView r13 = r11.f320732j
            android.content.Context r14 = r11.f320724b
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2132090397(0x7f151e1d, float:1.9821133E38)
            java.lang.String r14 = r14.getString(r15)
            r13.setContentDescription(r14)
            r12.stop()
            android.widget.ImageView r12 = r11.f320732j
            r12.setVisibility(r5)
        L_0x01e0:
            android.widget.ImageView r12 = r11.f320733k
            r12.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115615ac.mo102132b(int, com.google.assistant.e.j.hz, com.google.android.apps.gsa.staticplugins.opamediaplayer.f.j, com.google.android.libraries.logging.k):void");
    }
}
