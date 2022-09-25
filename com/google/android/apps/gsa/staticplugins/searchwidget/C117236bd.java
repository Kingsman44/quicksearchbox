package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bd */
/* compiled from: PG */
public final /* synthetic */ class C117236bd implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117239bg f325446a;

    /* renamed from: b */
    public final /* synthetic */ C89283z f325447b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f325448c;

    /* renamed from: d */
    public final /* synthetic */ int f325449d;

    /* renamed from: e */
    public final /* synthetic */ boolean f325450e;

    /* renamed from: f */
    public final /* synthetic */ int f325451f;

    public /* synthetic */ C117236bd(C117239bg bgVar, C89283z zVar, Bundle bundle, int i, boolean z, int i2) {
        this.f325446a = bgVar;
        this.f325447b = zVar;
        this.f325448c = bundle;
        this.f325449d = i;
        this.f325450e = z;
        this.f325451f = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0063, code lost:
        r1 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r9.f242083i);
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            com.google.android.apps.gsa.staticplugins.searchwidget.bg r8 = r0.f325446a
            com.google.android.apps.gsa.shared.aq.z r9 = r0.f325447b
            android.os.Bundle r10 = r0.f325448c
            int r1 = r0.f325449d
            boolean r11 = r0.f325450e
            int r12 = r0.f325451f
            r13 = r22
            android.widget.RemoteViews r13 = (android.widget.RemoteViews) r13
            if (r13 == 0) goto L_0x03f1
            r2 = 2131435642(0x7f0b207a, float:1.8493132E38)
            r14 = 8
            r13.setViewVisibility(r2, r14)
            r2 = 2131435638(0x7f0b2076, float:1.8493124E38)
            r13.setViewVisibility(r2, r14)
            r15 = 2131435651(0x7f0b2083, float:1.849315E38)
            r13.setViewVisibility(r15, r14)
            int r2 = r8.mo103209b(r9, r10, r12)
            r7 = 0
            r13.setViewVisibility(r2, r7)
            r6 = 2131435646(0x7f0b207e, float:1.849314E38)
            r5 = 2131435644(0x7f0b207c, float:1.8493136E38)
            r4 = 1
            if (r1 != r4) goto L_0x005f
            r1 = 2131232768(0x7f080800, float:1.8081655E38)
            r13.setImageViewResource(r5, r1)
            android.content.Context r2 = r8.f325458d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132082825(0x7f150089, float:1.9805775E38)
            java.lang.String r2 = r2.getString(r3)
            r13.setContentDescription(r5, r2)
            r13.setImageViewResource(r6, r1)
            android.content.Context r1 = r8.f325458d
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r3)
            r13.setContentDescription(r6, r1)
        L_0x005f:
            boolean r1 = r9.f242079e
            if (r1 == 0) goto L_0x0070
            int r1 = r9.f242083i
            int r1 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r1)
            if (r1 != 0) goto L_0x006d
        L_0x006b:
            r1 = 0
            goto L_0x0072
        L_0x006d:
            if (r1 != r4) goto L_0x0070
            goto L_0x006b
        L_0x0070:
            r1 = 8
        L_0x0072:
            r2 = 2131435643(0x7f0b207b, float:1.8493134E38)
            r13.setViewVisibility(r2, r1)
            int r1 = r9.f242075a
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            java.lang.String r3 = "setImageAlpha"
            java.lang.String r15 = "setBackgroundResource"
            r6 = 2131435647(0x7f0b207f, float:1.8493142E38)
            r2 = 2
            java.lang.String r7 = "setColorFilter"
            if (r1 == 0) goto L_0x0191
            int r1 = r8.mo103208a(r10, r12)
            if (r1 == r4) goto L_0x0094
            if (r1 == r2) goto L_0x0092
            r1 = 0
            goto L_0x0095
        L_0x0092:
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 2
        L_0x0095:
            com.google.android.apps.gsa.shared.aq.u r2 = r9.f242082h
            if (r2 != 0) goto L_0x009b
            com.google.android.apps.gsa.shared.aq.u r2 = com.google.android.apps.gsa.shared.p6995aq.C89278u.f242057g
        L_0x009b:
            r13.setViewVisibility(r5, r14)
            r13.setViewVisibility(r6, r14)
            if (r1 != 0) goto L_0x00ad
            r18 = r3
            r20 = r7
            r1 = 2131435644(0x7f0b207c, float:1.8493136E38)
            r14 = 0
            goto L_0x0221
        L_0x00ad:
            r6 = 2131435633(0x7f0b2071, float:1.8493114E38)
            r14 = 0
            r13.setViewVisibility(r6, r14)
            int r6 = r9.f242075a
            r6 = r6 & 8192(0x2000, float:1.14794E-41)
            r14 = 2131435634(0x7f0b2072, float:1.8493116E38)
            if (r6 == 0) goto L_0x0125
            com.google.android.apps.gsa.shared.aq.u r6 = r9.f242082h
            if (r6 != 0) goto L_0x00c3
            com.google.android.apps.gsa.shared.aq.u r6 = com.google.android.apps.gsa.shared.p6995aq.C89278u.f242057g
        L_0x00c3:
            boolean r5 = r6.f242062d
            if (r4 == r5) goto L_0x00ca
            r5 = 8
            goto L_0x00cb
        L_0x00ca:
            r5 = 0
        L_0x00cb:
            r13.setViewVisibility(r14, r5)
            boolean r5 = r6.f242063e
            if (r5 == 0) goto L_0x00e0
            int r5 = r6.f242059a
            r16 = r5 & 1
            if (r16 == 0) goto L_0x00e0
            r14 = 2
            r5 = r5 & r14
            if (r5 == 0) goto L_0x00e0
            if (r1 != r14) goto L_0x00e0
            r5 = 0
            goto L_0x00e2
        L_0x00e0:
            r5 = 8
        L_0x00e2:
            r14 = 2131435636(0x7f0b2074, float:1.849312E38)
            r13.setViewVisibility(r14, r5)
            int r5 = r9.f242083i
            int r14 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r5)
            if (r14 != 0) goto L_0x00f5
        L_0x00f0:
            r4 = 0
        L_0x00f1:
            r5 = 2131435634(0x7f0b2072, float:1.8493116E38)
            goto L_0x0108
        L_0x00f5:
            if (r14 != r4) goto L_0x00f8
            goto L_0x00f0
        L_0x00f8:
            android.content.Context r14 = r8.f325458d
            int r5 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r5)
            if (r5 != 0) goto L_0x0101
            r5 = 1
        L_0x0101:
            int r4 = r9.f242087m
            int r4 = com.google.android.apps.gsa.staticplugins.searchwidget.C117243bk.m194851b(r14, r5, r4)
            goto L_0x00f1
        L_0x0108:
            r13.setInt(r5, r7, r4)
            r14 = 2131435636(0x7f0b2074, float:1.849312E38)
            r13.setInt(r14, r7, r4)
            int r4 = r6.f242059a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x011a
            int r4 = r6.f242064f
            goto L_0x011c
        L_0x011a:
            r4 = 41
        L_0x011c:
            r13.setInt(r5, r3, r4)
            r13.setInt(r14, r3, r4)
            r4 = 8
            goto L_0x0133
        L_0x0125:
            r4 = 8
            r5 = 2131435634(0x7f0b2072, float:1.8493116E38)
            r14 = 2131435636(0x7f0b2074, float:1.849312E38)
            r13.setViewVisibility(r5, r4)
            r13.setViewVisibility(r14, r4)
        L_0x0133:
            r5 = 2131435637(0x7f0b2075, float:1.8493122E38)
            r13.setViewVisibility(r5, r4)
            r5 = 2131435635(0x7f0b2073, float:1.8493118E38)
            r13.setViewVisibility(r5, r4)
            int r4 = r2.f242059a
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0168
            com.google.android.apps.gsa.shared.aq.t r4 = r2.f242061c
            if (r4 != 0) goto L_0x014b
            com.google.android.apps.gsa.shared.aq.t r4 = com.google.android.apps.gsa.shared.p6995aq.C89277t.f242049g
        L_0x014b:
            r6 = r4
            r4 = 2131435637(0x7f0b2075, float:1.8493122E38)
            r14 = 12
            r17 = r1
            r1 = r8
            r5 = r2
            r2 = r13
            r18 = r3
            r3 = r4
            r4 = r9
            r19 = r5
            r5 = r6
            r6 = r14
            r20 = r7
            r14 = 0
            r7 = r11
            r1.mo103211d(r2, r3, r4, r5, r6, r7)
            r2 = r19
            goto L_0x016f
        L_0x0168:
            r17 = r1
            r18 = r3
            r20 = r7
            r14 = 0
        L_0x016f:
            int r1 = r2.f242059a
            r7 = 1
            r1 = r1 & r7
            if (r1 == 0) goto L_0x018c
            r4 = r17
            if (r4 <= r7) goto L_0x018c
            com.google.android.apps.gsa.shared.aq.t r1 = r2.f242060b
            if (r1 != 0) goto L_0x017f
            com.google.android.apps.gsa.shared.aq.t r1 = com.google.android.apps.gsa.shared.p6995aq.C89277t.f242049g
        L_0x017f:
            r5 = r1
            r3 = 2131435635(0x7f0b2073, float:1.8493118E38)
            r6 = 11
            r1 = r8
            r2 = r13
            r4 = r9
            r7 = r11
            r1.mo103211d(r2, r3, r4, r5, r6, r7)
        L_0x018c:
            r1 = 2131435644(0x7f0b207c, float:1.8493136E38)
            goto L_0x0221
        L_0x0191:
            r18 = r3
            r20 = r7
            r1 = 2131435633(0x7f0b2071, float:1.8493114E38)
            r2 = 8
            r14 = 0
            r13.setViewVisibility(r1, r2)
            r1 = 2131435644(0x7f0b207c, float:1.8493136E38)
            r13.setViewVisibility(r1, r14)
            boolean r2 = r8.mo103212e(r10)
            if (r2 == 0) goto L_0x0213
            com.google.android.apps.gsa.search.core.i.t r2 = r8.f325456b
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250610aH
            java.lang.String r2 = r2.mo79758x(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x01c5
            android.content.Context r2 = r8.f325458d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132092195(0x7f152523, float:1.982478E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x01c5:
            r3 = 2131435645(0x7f0b207d, float:1.8493138E38)
            r13.setTextViewText(r3, r2)
            android.content.Context r2 = r8.f325458d
            boolean r2 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r2)
            if (r2 == 0) goto L_0x01ef
            r2 = 2131435648(0x7f0b2080, float:1.8493144E38)
            r4 = 2131235402(0x7f08124a, float:1.8086997E38)
            r13.setInt(r2, r15, r4)
            android.content.Context r2 = r8.f325458d
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131103900(0x7f06109c, float:1.782028E38)
            int r2 = r2.getColor(r4)
            java.lang.String r4 = "setTextColor"
            r13.setInt(r3, r4, r2)
            goto L_0x020a
        L_0x01ef:
            r2 = 2131435648(0x7f0b2080, float:1.8493144E38)
            r4 = 2131235401(0x7f081249, float:1.8086995E38)
            r13.setInt(r2, r15, r4)
            android.content.Context r2 = r8.f325458d
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131103899(0x7f06109b, float:1.7820277E38)
            int r2 = r2.getColor(r4)
            java.lang.String r4 = "setTextColor"
            r13.setInt(r3, r4, r2)
        L_0x020a:
            r2 = 8
            r13.setViewVisibility(r1, r2)
            r13.setViewVisibility(r6, r14)
            goto L_0x0215
        L_0x0213:
            r2 = 8
        L_0x0215:
            boolean r3 = r8.mo103212e(r10)
            if (r3 != 0) goto L_0x0221
            r13.setViewVisibility(r6, r2)
            r13.setViewVisibility(r1, r14)
        L_0x0221:
            int r2 = r9.f242083i
            int r3 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r2)
            if (r3 != 0) goto L_0x0230
            r5 = r20
            r3 = 2131435646(0x7f0b207e, float:1.849314E38)
            r4 = 1
            goto L_0x025a
        L_0x0230:
            r4 = 1
            if (r3 == r4) goto L_0x0255
            android.content.Context r3 = r8.f325458d
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r2)
            if (r2 != 0) goto L_0x023c
            r2 = 1
        L_0x023c:
            int r5 = r9.f242087m
            int r2 = com.google.android.apps.gsa.staticplugins.searchwidget.C117243bk.m194851b(r3, r2, r5)
            int r3 = r8.mo103209b(r9, r10, r12)
            r5 = r20
            r13.setInt(r3, r5, r2)
            r13.setInt(r1, r5, r2)
            r3 = 2131435646(0x7f0b207e, float:1.849314E38)
            r13.setInt(r3, r5, r2)
            goto L_0x0267
        L_0x0255:
            r5 = r20
            r3 = 2131435646(0x7f0b207e, float:1.849314E38)
        L_0x025a:
            int r2 = r8.mo103209b(r9, r10, r12)
            r13.setInt(r2, r5, r14)
            r13.setInt(r1, r5, r14)
            r13.setInt(r3, r5, r14)
        L_0x0267:
            android.content.Context r1 = r8.f325458d
            int r2 = r9.f242083i
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r2)
            if (r2 != 0) goto L_0x0272
            r2 = 1
        L_0x0272:
            int r3 = r9.f242087m
            java.lang.String r6 = r9.f242085k
            r7 = 4
            r11 = 3
            if (r2 != r7) goto L_0x0281
            r2 = 4
            int r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117243bk.m194851b(r1, r2, r3)
        L_0x027f:
            r3 = 2
            goto L_0x02b4
        L_0x0281:
            if (r2 != r11) goto L_0x028f
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131103906(0x7f0610a2, float:1.7820291E38)
            int r1 = r1.getColor(r2)
            goto L_0x027f
        L_0x028f:
            r3 = 2
            if (r2 != r3) goto L_0x029e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131103907(0x7f0610a3, float:1.7820293E38)
            int r1 = r1.getColor(r2)
            goto L_0x02b4
        L_0x029e:
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x02a9
            int r1 = android.graphics.Color.parseColor(r6)
            goto L_0x02b4
        L_0x02a9:
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131103905(0x7f0610a1, float:1.782029E38)
            int r1 = r1.getColor(r2)
        L_0x02b4:
            r2 = 2131435650(0x7f0b2082, float:1.8493148E38)
            r13.setTextColor(r2, r1)
            boolean r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194764l(r10)
            int r2 = r9.f242077c
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r2)
            if (r2 != 0) goto L_0x02c7
            r2 = 1
        L_0x02c7:
            int r2 = r2 + -1
            if (r2 == r4) goto L_0x02d5
            if (r2 == r3) goto L_0x02d1
            r2 = 2131235389(0x7f08123d, float:1.808697E38)
            goto L_0x02d8
        L_0x02d1:
            r2 = 2131235388(0x7f08123c, float:1.8086969E38)
            goto L_0x02d8
        L_0x02d5:
            r2 = 2131235390(0x7f08123e, float:1.8086973E38)
        L_0x02d8:
            r6 = 2131435627(0x7f0b206b, float:1.8493102E38)
            r13.setImageViewResource(r6, r2)
            if (r1 == 0) goto L_0x0300
            int r1 = r9.f242077c
            int r1 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r1)
            if (r1 != 0) goto L_0x02e9
            r1 = 1
        L_0x02e9:
            int r1 = r1 + -1
            if (r1 == r4) goto L_0x02f7
            if (r1 == r3) goto L_0x02f3
            r1 = 2131235395(0x7f081243, float:1.8086983E38)
            goto L_0x02fa
        L_0x02f3:
            r1 = 2131235394(0x7f081242, float:1.808698E38)
            goto L_0x02fa
        L_0x02f7:
            r1 = 2131235396(0x7f081244, float:1.8086985E38)
        L_0x02fa:
            r2 = 2131435629(0x7f0b206d, float:1.8493106E38)
            r13.setInt(r2, r15, r1)
        L_0x0300:
            int r1 = r9.f242077c
            int r1 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r1)
            if (r1 != 0) goto L_0x0309
            r1 = 1
        L_0x0309:
            int r1 = r1 + -1
            if (r1 == r4) goto L_0x0317
            if (r1 == r3) goto L_0x0313
            r1 = 2131232303(0x7f08062f, float:1.8080711E38)
            goto L_0x031a
        L_0x0313:
            r1 = 2131232302(0x7f08062e, float:1.808071E38)
            goto L_0x031a
        L_0x0317:
            r1 = 2131232304(0x7f080630, float:1.8080713E38)
        L_0x031a:
            r2 = 2131435628(0x7f0b206c, float:1.8493104E38)
            r13.setImageViewResource(r2, r1)
            int r1 = r9.f242083i
            int r7 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r1)
            if (r7 != 0) goto L_0x0329
            goto L_0x0343
        L_0x0329:
            if (r7 == r4) goto L_0x0343
            android.content.Context r7 = r8.f325458d
            int r1 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r1)
            if (r1 != 0) goto L_0x0334
            r1 = 1
        L_0x0334:
            int r15 = r9.f242087m
            java.lang.String r14 = ""
            int r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117243bk.m194850a(r7, r1, r15, r14)
            r13.setInt(r6, r5, r1)
            r13.setInt(r2, r5, r1)
            goto L_0x0359
        L_0x0343:
            int r1 = r9.f242075a
            r7 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r7
            if (r1 == 0) goto L_0x0352
            java.lang.String r1 = r9.f242084j
            int r7 = android.graphics.Color.parseColor(r1)
            goto L_0x0353
        L_0x0352:
            r7 = 0
        L_0x0353:
            r13.setInt(r6, r5, r7)
            r13.setInt(r2, r5, r7)
        L_0x0359:
            int r1 = r9.f242076b
            r2 = r18
            r13.setInt(r6, r2, r1)
            com.google.android.apps.gsa.search.core.preferences.r r1 = r8.f325457c
            java.lang.String r2 = "search_widget_doodle_preference"
            boolean r1 = r1.getBoolean(r2, r4)
            if (r1 != 0) goto L_0x036c
            goto L_0x03f1
        L_0x036c:
            com.google.android.apps.gsa.search.core.preferences.r r1 = r8.f325457c
            java.lang.String r2 = "search_widget_doodle_image"
            r5 = 0
            byte[] r1 = r1.mo80079e(r2, r5)
            if (r1 == 0) goto L_0x03de
            int r2 = r8.mo103208a(r10, r12)
            if (r2 != r4) goto L_0x03de
            int r2 = r9.f242083i
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89272o.m145215a(r2)
            if (r2 != 0) goto L_0x0386
            goto L_0x0388
        L_0x0386:
            if (r2 != r4) goto L_0x03de
        L_0x0388:
            int r2 = r9.f242077c
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r2)
            if (r2 != 0) goto L_0x0391
            goto L_0x03de
        L_0x0391:
            if (r2 != r11) goto L_0x03de
            int r2 = r9.f242078d
            int r4 = com.google.android.apps.gsa.shared.p6995aq.C89280w.m145217a(r2)
            if (r4 != 0) goto L_0x039c
            goto L_0x039e
        L_0x039c:
            if (r4 == r3) goto L_0x03a6
        L_0x039e:
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89280w.m145217a(r2)
            if (r2 == 0) goto L_0x03de
            if (r2 != r11) goto L_0x03de
        L_0x03a6:
            int r2 = r1.length
            r3 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r2)
            com.google.android.apps.gsa.search.core.preferences.r r2 = r8.f325457c
            java.lang.String r3 = "search_widget_doodle_alt_text"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)
            if (r2 != 0) goto L_0x03c4
            android.content.Context r2 = r8.f325458d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132082814(0x7f15007e, float:1.9805753E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x03c4:
            r3 = 2131435651(0x7f0b2083, float:1.849315E38)
            r13.setImageViewBitmap(r3, r1)
            int r1 = r8.mo103209b(r9, r10, r12)
            r4 = 8
            r13.setViewVisibility(r1, r4)
            r1 = 0
            r13.setViewVisibility(r3, r1)
            r1 = 2131435639(0x7f0b2077, float:1.8493126E38)
            r13.setContentDescription(r1, r2)
            goto L_0x03f1
        L_0x03de:
            android.content.Context r1 = r8.f325458d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132082814(0x7f15007e, float:1.9805753E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 2131435639(0x7f0b2077, float:1.8493126E38)
            r13.setContentDescription(r2, r1)
        L_0x03f1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117236bd.mo17879a(java.lang.Object):java.lang.Object");
    }
}
