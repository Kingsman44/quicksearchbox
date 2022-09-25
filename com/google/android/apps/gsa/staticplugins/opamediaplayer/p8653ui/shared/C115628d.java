package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.d */
/* compiled from: PG */
public final class C115628d extends C115640p {

    /* renamed from: a */
    public final C115648x f320759a;

    /* renamed from: b */
    private final Context f320760b;

    /* renamed from: c */
    private final TextView f320761c;

    /* renamed from: d */
    private final TextView f320762d;

    /* renamed from: e */
    private final ImageButton f320763e;

    /* renamed from: f */
    private final LinearLayout f320764f;

    /* renamed from: g */
    private final ThumbnailView f320765g;

    /* renamed from: h */
    private final C21370a f320766h;

    /* renamed from: i */
    private final C22871g f320767i;

    /* renamed from: j */
    private final C115620ah f320768j;

    public C115628d(View view, Context context, C21370a aVar, C22871g gVar, C115620ah ahVar, C115648x xVar) {
        super(view);
        this.f320760b = context;
        this.f320766h = aVar;
        this.f320767i = gVar;
        this.f320768j = ahVar;
        this.f320759a = xVar;
        this.f320761c = (TextView) view.findViewById(R.id.media_item_title);
        this.f320762d = (TextView) view.findViewById(R.id.media_item_subtitle);
        this.f320763e = (ImageButton) view.findViewById(R.id.media_item_info_button);
        this.f320764f = (LinearLayout) view.findViewById(R.id.media_item);
        this.f320765g = (ThumbnailView) view.findViewById(R.id.media_item_thumbnail);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102131a(int r8, com.google.assistant.p3897e.p3921j.C52174hz r9, com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j r10) {
        /*
            r7 = this;
            com.google.assistant.e.j.wo r0 = r9.f136897d
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.j.wo r0 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0006:
            java.lang.String r1 = r0.f137998e
            android.widget.TextView r2 = r7.f320761c
            r2.setText(r1)
            int r2 = r0.f137994a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0032
            com.google.assistant.e.j.qp r2 = r0.f138005l
            if (r2 != 0) goto L_0x0019
            com.google.assistant.e.j.qp r2 = com.google.assistant.p3897e.p3921j.C52407qp.f137523d
        L_0x0019:
            long r2 = r2.f137526b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r4.toMillis(r2)
            com.google.android.libraries.f.a r4 = r7.f320766h
            long r4 = r4.mo26870b()
            android.content.Context r6 = r7.f320760b
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115625am.m191766a(r2, r4, r6)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0034
        L_0x0032:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0034:
            java.lang.String r3 = r0.f138000g
            boolean r3 = r3.isEmpty()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0059
            int r3 = r0.f137996c
            r6 = 18
            if (r3 != r6) goto L_0x0049
            java.lang.Object r3 = r0.f137997d
            com.google.assistant.e.j.wu r3 = (com.google.assistant.p3897e.p3921j.C52574wu) r3
            goto L_0x004b
        L_0x0049:
            com.google.assistant.e.j.wu r3 = com.google.assistant.p3897e.p3921j.C52574wu.f138026h
        L_0x004b:
            int r3 = r3.f138029b
            int r3 = com.google.assistant.p3897e.p3921j.C52571wr.m86651a(r3)
            if (r3 != 0) goto L_0x0055
        L_0x0053:
            r3 = 1
            goto L_0x005a
        L_0x0055:
            r6 = 2
            if (r3 == r6) goto L_0x0059
            goto L_0x0053
        L_0x0059:
            r3 = 0
        L_0x005a:
            boolean r6 = r2.mo56113h()
            if (r6 == 0) goto L_0x0067
            java.lang.Object r2 = r2.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0069
        L_0x0067:
            java.lang.String r2 = ""
        L_0x0069:
            if (r6 == 0) goto L_0x0077
            if (r3 == 0) goto L_0x0077
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r6 = " • "
            java.lang.String r2 = r2.concat(r6)
        L_0x0077:
            if (r3 == 0) goto L_0x0087
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r0.f138000g
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
        L_0x0087:
            android.widget.TextView r3 = r7.f320762d
            r3.setText(r2)
            android.widget.ImageButton r2 = r7.f320763e
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.b r3 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.b
            r3.<init>(r7, r8)
            r2.setOnClickListener(r3)
            android.widget.ImageButton r2 = r7.f320763e
            android.content.Context r3 = r7.f320760b
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r1
            r5 = 2132090427(0x7f151e3b, float:1.9821194E38)
            java.lang.String r3 = r3.getString(r5, r4)
            r2.setContentDescription(r3)
            android.view.View r2 = r7.itemView
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.c r3 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.c
            r3.<init>(r7, r8)
            r2.setOnClickListener(r3)
            com.google.common.base.ax r8 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b.m191567a(r9)
            boolean r9 = r8.mo56113h()
            if (r9 == 0) goto L_0x00e1
            java.lang.Object r8 = r8.mo56107c()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r10.f320319n
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00e1
            android.widget.LinearLayout r8 = r7.f320764f
            android.content.Context r9 = r7.f320760b
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131103244(0x7f060e0c, float:1.7818949E38)
            int r9 = r9.getColor(r10)
            r8.setBackgroundColor(r9)
            goto L_0x00f3
        L_0x00e1:
            android.widget.LinearLayout r8 = r7.f320764f
            android.content.Context r9 = r7.f320760b
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131103243(0x7f060e0b, float:1.7818947E38)
            int r9 = r9.getColor(r10)
            r8.setBackgroundColor(r9)
        L_0x00f3:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ThumbnailView r8 = r7.f320765g
            com.google.assistant.e.c.c.dc r9 = r0.f138004k
            if (r9 != 0) goto L_0x00fb
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00fb:
            com.google.android.libraries.gsa.k.g r10 = r7.f320767i
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ah r0 = r7.f320768j
            r8.mo102127a(r1, r9, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115628d.mo102131a(int, com.google.assistant.e.j.hz, com.google.android.apps.gsa.staticplugins.opamediaplayer.f.j):void");
    }
}
