package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ad */
/* compiled from: PG */
public final /* synthetic */ class C132585ad implements C69626l {

    /* renamed from: a */
    public final /* synthetic */ Context f361825a;

    /* renamed from: b */
    public final /* synthetic */ boolean f361826b;

    /* renamed from: c */
    public final /* synthetic */ int f361827c;

    /* renamed from: d */
    public final /* synthetic */ C132655r f361828d;

    /* renamed from: e */
    public final /* synthetic */ boolean f361829e;

    /* renamed from: f */
    public final /* synthetic */ C132613bc f361830f;

    public /* synthetic */ C132585ad(Context context, boolean z, int i, C132655r rVar, boolean z2, C132613bc bcVar) {
        this.f361825a = context;
        this.f361826b = z;
        this.f361827c = i;
        this.f361828d = rVar;
        this.f361829e = z2;
        this.f361830f = bcVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x013e, code lost:
        if (true != android.text.format.DateFormat.is24HourFormat(r1)) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r7.f396088b < r1.getResources().getDimensionPixelSize(r2.f361849h)) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0196  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5761a(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            android.content.Context r1 = r0.f361825a
            boolean r2 = r0.f361826b
            int r3 = r0.f361827c
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.r r4 = r0.f361828d
            boolean r5 = r0.f361829e
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.bc r6 = r0.f361830f
            r7 = r27
            com.google.android.libraries.a.c.c.b r7 = (com.google.android.libraries.p10908a.p10911c.p10914c.C146644b) r7
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r2 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132590ai.m215558b(r7, r1, r2)
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r8 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.MINI
            if (r2 != r8) goto L_0x0040
            int r8 = r7.f396087a
            int r9 = r2.f361848g
            android.content.res.Resources r10 = r1.getResources()
            int r9 = r10.getDimensionPixelSize(r9)
            if (r8 < r9) goto L_0x0036
            int r8 = r7.f396088b
            int r9 = r2.f361849h
            android.content.res.Resources r10 = r1.getResources()
            int r9 = r10.getDimensionPixelSize(r9)
            if (r8 >= r9) goto L_0x0040
        L_0x0036:
            r8 = 0
            r2 = r3
            r3 = r4
            r4 = r8
            android.widget.RemoteViews r1 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132590ai.m215557a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03a6
        L_0x0040:
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            java.lang.String r9 = r1.getPackageName()
            int r10 = r2.f361850i
            r8.<init>(r9, r10)
            r11 = 8
            r12 = 0
            if (r4 == 0) goto L_0x0358
            com.google.assistant.s.a.gt r13 = r4.f362004a
            com.google.assistant.s.a.gq r14 = r13.f139577k
            if (r14 != 0) goto L_0x0058
            com.google.assistant.s.a.gq r14 = com.google.assistant.p3994s.p3995a.C53242gq.f139546f
        L_0x0058:
            java.lang.String r14 = r14.f139550c
            com.google.protobuf.cq r13 = r13.f139569c
            java.lang.Object r13 = r13.get(r12)
            com.google.assistant.s.a.ge r13 = (com.google.assistant.p3994s.p3995a.C53230ge) r13
            java.lang.String r15 = r13.f139507c
            java.lang.String r10 = r13.f139509e
            java.lang.String r13 = r13.f139508d
            r9 = 2131429151(0x7f0b071f, float:1.8479967E38)
            r8.setViewVisibility(r9, r11)
            r9 = 2131429149(0x7f0b071d, float:1.8479963E38)
            r8.setTextViewText(r9, r14)
            java.lang.String r9 = java.lang.String.valueOf(r15)
            java.lang.String r14 = "°"
            java.lang.String r9 = r9.concat(r14)
            r15 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r8.setTextViewText(r15, r9)
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.String r9 = r9.concat(r14)
            r10 = 2131429161(0x7f0b0729, float:1.8479987E38)
            r8.setTextViewText(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r13)
            java.lang.String r9 = r9.concat(r14)
            r10 = 2131429160(0x7f0b0728, float:1.8479985E38)
            r8.setTextViewText(r10, r9)
            r9 = 2131429121(0x7f0b0701, float:1.8479906E38)
            android.graphics.Bitmap r10 = r4.f362005b
            r8.setImageViewBitmap(r9, r10)
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132590ai.m215561e(r8, r12)
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r9 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.MEDIUM
            java.lang.String r10 = "EEEE"
            java.lang.String r13 = "24"
            java.lang.String r15 = "12"
            java.lang.String r12 = "time_12_24"
            java.lang.String r11 = "zoneId: %s"
            java.lang.String r0 = "WeatherWidgetHourFormatter"
            java.lang.String r16 = "HH:mm"
            r17 = r7
            java.lang.String r18 = "ha"
            r7 = 2131429124(0x7f0b0704, float:1.8479912E38)
            if (r2 == r9) goto L_0x00d8
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r9 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.LARGE
            if (r2 != r9) goto L_0x00c9
            goto L_0x00d8
        L_0x00c9:
            r19 = r3
            r20 = r5
            r21 = r6
            r22 = r10
            r23 = r13
        L_0x00d3:
            r9 = r14
            r25 = r15
            goto L_0x021e
        L_0x00d8:
            r8.removeAllViews(r7)
            r9 = 8
            r8.setViewVisibility(r7, r9)
            com.google.assistant.s.a.gt r9 = r4.f362004a
            com.google.protobuf.cq r7 = r9.f139569c
            r19 = r3
            r3 = 0
            java.lang.Object r7 = r7.get(r3)
            com.google.assistant.s.a.ge r7 = (com.google.assistant.p3994s.p3995a.C53230ge) r7
            java.lang.String r3 = r7.f139506b
            r7 = 2131429123(0x7f0b0703, float:1.847991E38)
            r8.setTextViewText(r7, r3)
            r3 = 2131429155(0x7f0b0723, float:1.8479975E38)
            java.lang.String r7 = r9.f139576j
            r8.setTextViewText(r3, r7)
            j$.time.ZoneId r3 = p3186j$.time.ZoneId.systemDefault()
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132653p.f362003a
            com.google.common.f.x r7 = r7.mo56224b()
            r20 = r5
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r5, r0)
            r5 = 39702(0x9b16, float:5.5634E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r5)).mo56389s(r11, r3)
            j$.time.format.DateTimeFormatterBuilder r5 = new j$.time.format.DateTimeFormatterBuilder
            r5.<init>()
            android.content.ContentResolver r7 = r1.getContentResolver()
            java.lang.String r7 = android.provider.Settings.System.getString(r7, r12)
            boolean r21 = r15.equals(r7)
            if (r21 == 0) goto L_0x012c
            r21 = r6
        L_0x0129:
            r6 = r18
            goto L_0x0141
        L_0x012c:
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x0137
            r21 = r6
        L_0x0134:
            r6 = r16
            goto L_0x0141
        L_0x0137:
            boolean r7 = android.text.format.DateFormat.is24HourFormat(r1)
            r21 = r6
            r6 = 1
            if (r6 == r7) goto L_0x0134
            goto L_0x0129
        L_0x0141:
            j$.time.format.DateTimeFormatterBuilder r5 = r5.appendPattern(r6)
            java.util.Locale r6 = java.util.Locale.getDefault()
            j$.time.format.DateTimeFormatter r5 = r5.toFormatter(r6)
            j$.time.format.DateTimeFormatterBuilder r6 = new j$.time.format.DateTimeFormatterBuilder
            r6.<init>()
            j$.time.format.DateTimeFormatterBuilder r6 = r6.appendPattern(r10)
            java.util.Locale r7 = java.util.Locale.getDefault()
            r6.toFormatter(r7)
            com.google.assistant.s.a.gi r6 = r9.f139573g
            if (r6 != 0) goto L_0x0163
            com.google.assistant.s.a.gi r6 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
        L_0x0163:
            com.google.cg.d r6 = r6.f139526b
            if (r6 != 0) goto L_0x0169
            com.google.cg.d r6 = com.google.p4479cg.C58072d.f155218d
        L_0x0169:
            j$.time.LocalDate r6 = com.google.p4479cg.p4480a.C58068e.m88826d(r6)
            com.google.assistant.s.a.gi r7 = r9.f139573g
            if (r7 != 0) goto L_0x0173
            com.google.assistant.s.a.gi r7 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
        L_0x0173:
            int r7 = r7.f139527c
            r22 = r10
            r10 = 0
            j$.time.LocalDateTime r6 = r6.atTime(r7, r10)
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132590ai.f361852a
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r10 = "startDateTime: %s"
            r23 = r13
            r13 = 39715(0x9b23, float:5.5653E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r13)).mo56389s(r10, r6)
            r7 = 2131429131(0x7f0b070b, float:1.8479926E38)
            r8.removeAllViews(r7)
            r10 = 0
        L_0x0193:
            r13 = 4
            if (r10 >= r13) goto L_0x00d3
            com.google.assistant.s.a.gi r13 = r9.f139573g
            if (r13 != 0) goto L_0x019c
            com.google.assistant.s.a.gi r13 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
        L_0x019c:
            com.google.protobuf.cq r13 = r13.f139528d
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x00d3
            java.util.List r13 = r4.f362006c
            int r13 = r13.size()
            if (r10 < r13) goto L_0x01ae
            goto L_0x00d3
        L_0x01ae:
            com.google.assistant.s.a.gi r13 = r9.f139573g
            if (r13 != 0) goto L_0x01b4
            com.google.assistant.s.a.gi r13 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
        L_0x01b4:
            com.google.protobuf.cq r13 = r13.f139528d
            java.lang.Object r13 = r13.get(r10)
            com.google.assistant.s.a.gs r13 = (com.google.assistant.p3994s.p3995a.C53244gs) r13
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            r24 = r9
            java.lang.String r9 = r1.getPackageName()
            r25 = r15
            r15 = 2131624404(0x7f0e01d4, float:1.8875987E38)
            r7.<init>(r9, r15)
            java.util.List r9 = r4.f362006c
            java.lang.Object r9 = r9.get(r10)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            r15 = 2131429139(0x7f0b0713, float:1.8479942E38)
            r7.setImageViewBitmap(r15, r9)
            java.lang.String r9 = r13.f139557c
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r9.concat(r14)
            r13 = 2131429144(0x7f0b0718, float:1.8479952E38)
            r7.setTextViewText(r13, r9)
            r9 = r14
            long r13 = (long) r10
            j$.time.LocalDateTime r13 = r6.plusHours(r13)
            j$.time.ZoneOffset r14 = p3186j$.time.ZoneOffset.UTC
            j$.time.ZonedDateTime r13 = r13.atZone(r14)
            j$.time.Instant r13 = r13.toInstant()
            j$.time.ZonedDateTime r13 = r13.atZone(r3)
            j$.time.LocalDateTime r13 = r13.mo43202c()
            java.lang.String r13 = r13.format(r5)
            r14 = 2131429135(0x7f0b070f, float:1.8479934E38)
            r7.setTextViewText(r14, r13)
            r13 = 2131429131(0x7f0b070b, float:1.8479926E38)
            r8.addView(r13, r7)
            int r10 = r10 + 1
            r14 = r9
            r9 = r24
            r15 = r25
            r7 = 2131429131(0x7f0b070b, float:1.8479926E38)
            goto L_0x0193
        L_0x021e:
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r3 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.LARGE
            if (r2 != r3) goto L_0x031e
            r3 = 2131429124(0x7f0b0704, float:1.8479912E38)
            r5 = 0
            r8.setViewVisibility(r3, r5)
            com.google.assistant.s.a.gt r3 = r4.f362004a
            j$.time.ZoneId r5 = p3186j$.time.ZoneId.systemDefault()
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132653p.f362003a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r0)
            r0 = 39702(0x9b16, float:5.5634E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56389s(r11, r5)
            j$.time.format.DateTimeFormatterBuilder r0 = new j$.time.format.DateTimeFormatterBuilder
            r0.<init>()
            android.content.ContentResolver r5 = r1.getContentResolver()
            java.lang.String r5 = android.provider.Settings.System.getString(r5, r12)
            r6 = r25
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0258
        L_0x0255:
            r5 = r18
            goto L_0x026b
        L_0x0258:
            r6 = r23
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0263
        L_0x0260:
            r5 = r16
            goto L_0x026b
        L_0x0263:
            boolean r5 = android.text.format.DateFormat.is24HourFormat(r1)
            r6 = 1
            if (r6 == r5) goto L_0x0260
            goto L_0x0255
        L_0x026b:
            j$.time.format.DateTimeFormatterBuilder r0 = r0.appendPattern(r5)
            java.util.Locale r5 = java.util.Locale.getDefault()
            r0.toFormatter(r5)
            j$.time.format.DateTimeFormatterBuilder r0 = new j$.time.format.DateTimeFormatterBuilder
            r0.<init>()
            r5 = r22
            j$.time.format.DateTimeFormatterBuilder r0 = r0.appendPattern(r5)
            java.util.Locale r5 = java.util.Locale.getDefault()
            j$.time.format.DateTimeFormatter r0 = r0.toFormatter(r5)
            int r5 = r3.f139567a
            r6 = 2
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0296
            com.google.cg.d r5 = r3.f139570d
            if (r5 != 0) goto L_0x02a2
            com.google.cg.d r5 = com.google.p4479cg.C58072d.f155218d
            goto L_0x02a2
        L_0x0296:
            com.google.assistant.s.a.gi r5 = r3.f139573g
            if (r5 != 0) goto L_0x029c
            com.google.assistant.s.a.gi r5 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
        L_0x029c:
            com.google.cg.d r5 = r5.f139526b
            if (r5 != 0) goto L_0x02a2
            com.google.cg.d r5 = com.google.p4479cg.C58072d.f155218d
        L_0x02a2:
            j$.time.LocalDate r5 = com.google.p4479cg.p4480a.C58068e.m88826d(r5)
            j$.time.LocalDateTime r5 = r5.atStartOfDay()
            r7 = 2131429124(0x7f0b0704, float:1.8479912E38)
            r8.removeAllViews(r7)
            r7 = 0
        L_0x02b1:
            if (r7 >= r6) goto L_0x031e
            int r7 = r7 + 1
            com.google.protobuf.cq r10 = r3.f139569c
            int r10 = r10.size()
            if (r7 >= r10) goto L_0x031e
            java.util.List r10 = r4.f362007d
            int r10 = r10.size()
            if (r7 < r10) goto L_0x02c6
            goto L_0x031e
        L_0x02c6:
            com.google.protobuf.cq r10 = r3.f139569c
            java.lang.Object r10 = r10.get(r7)
            com.google.assistant.s.a.ge r10 = (com.google.assistant.p3994s.p3995a.C53230ge) r10
            android.widget.RemoteViews r11 = new android.widget.RemoteViews
            java.lang.String r12 = r1.getPackageName()
            r13 = 2131624403(0x7f0e01d3, float:1.8875985E38)
            r11.<init>(r12, r13)
            long r12 = (long) r7
            j$.time.LocalDateTime r12 = r5.plusDays(r12)
            java.lang.String r12 = r12.format(r0)
            r13 = 2131429129(0x7f0b0709, float:1.8479922E38)
            r11.setTextViewText(r13, r12)
            java.util.List r12 = r4.f362007d
            java.lang.Object r12 = r12.get(r7)
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            r13 = 2131429125(0x7f0b0705, float:1.8479914E38)
            r11.setImageViewBitmap(r13, r12)
            java.lang.String r12 = r10.f139508d
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r12.concat(r9)
            r13 = 2131429127(0x7f0b0707, float:1.8479918E38)
            r11.setTextViewText(r13, r12)
            java.lang.String r10 = r10.f139509e
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r10.concat(r9)
            r12 = 2131429128(0x7f0b0708, float:1.847992E38)
            r11.setTextViewText(r12, r10)
            r10 = 2131429124(0x7f0b0704, float:1.8479912E38)
            r8.addView(r10, r11)
            goto L_0x02b1
        L_0x031e:
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r0 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.MEDIUM
            if (r2 != r0) goto L_0x0329
            r0 = 7
            r3 = r21
            r3.mo110841c(r0)
            goto L_0x0342
        L_0x0329:
            r3 = r21
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r0 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.LARGE
            if (r2 != r0) goto L_0x0335
            r0 = 8
            r3.mo110841c(r0)
            goto L_0x0342
        L_0x0335:
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r0 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.MINI
            if (r2 != r0) goto L_0x033e
            r0 = 5
            r3.mo110841c(r0)
            goto L_0x0342
        L_0x033e:
            r0 = 6
            r3.mo110841c(r0)
        L_0x0342:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver"
            r3 = r19
            r4 = r20
            android.app.PendingIntent r0 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132614bd.m215598b(r1, r4, r0, r3)
            r3 = 2131429122(0x7f0b0702, float:1.8479908E38)
            r8.setOnClickPendingIntent(r3, r0)
            r3 = 16908288(0x1020000, float:2.387723E-38)
            r8.setOnClickPendingIntent(r3, r0)
            goto L_0x035f
        L_0x0358:
            r17 = r7
            r0 = 8
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132590ai.m215561e(r8, r0)
        L_0x035f:
            boolean r0 = androidx.core.p094f.C1888a.m5149c()
            if (r0 != 0) goto L_0x0366
            goto L_0x03a5
        L_0x0366:
            r0 = r17
            int r3 = r0.f396087a
            int r4 = r2.f361846e
            android.content.res.Resources r5 = r1.getResources()
            int r4 = r5.getDimensionPixelSize(r4)
            int r3 = java.lang.Math.min(r3, r4)
            int r0 = r0.f396088b
            int r4 = r2.f361847f
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r4)
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ag r1 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132588ag.SQUARE
            if (r2 != r1) goto L_0x0391
            int r3 = java.lang.Math.min(r0, r3)
            r0 = r3
        L_0x0391:
            float r1 = (float) r3
            r2 = 16908288(0x1020000, float:2.387723E-38)
            r3 = 0
            r8.setViewLayoutWidth(r2, r1, r3)
            float r0 = (float) r0
            r8.setViewLayoutHeight(r2, r0, r3)
            r2 = 2131429122(0x7f0b0702, float:1.8479908E38)
            r8.setViewLayoutWidth(r2, r1, r3)
            r8.setViewLayoutHeight(r2, r0, r3)
        L_0x03a5:
            r1 = r8
        L_0x03a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132585ad.mo5761a(java.lang.Object):java.lang.Object");
    }
}
