package com.google.android.apps.gsa.nowoverlayservice;

import com.google.android.libraries.gsa.p1859d.p1861b.C22766l;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.n */
/* compiled from: PG */
public final /* synthetic */ class C83541n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C83553y f227767a;

    /* renamed from: b */
    public final /* synthetic */ C22766l f227768b;

    public /* synthetic */ C83541n(C83553y yVar, C22766l lVar) {
        this.f227767a = yVar;
        this.f227768b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05e1, code lost:
        r19 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[Catch:{ Exception -> 0x061b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[Catch:{ Exception -> 0x061b }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x060a A[Catch:{ Exception -> 0x0615 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x060b A[Catch:{ Exception -> 0x0615 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x066c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r0 = "backgroundColor"
            java.lang.String r2 = "GLCOC"
            com.google.android.apps.gsa.nowoverlayservice.y r3 = r1.f227767a
            com.google.android.libraries.gsa.d.b.l r4 = r1.f227768b
            com.google.android.apps.gsa.shared.search.Query r5 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r6 = 0
            r7 = 1
            byte[] r8 = r4.f62649a     // Catch:{ Exception -> 0x0624 }
            com.google.android.apps.gsa.nowoverlayservice.b.h r9 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83460h.f227521d     // Catch:{ Exception -> 0x0624 }
            com.google.protobuf.bv r8 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r8)     // Catch:{ Exception -> 0x0624 }
            com.google.android.apps.gsa.nowoverlayservice.b.h r8 = (com.google.android.apps.gsa.nowoverlayservice.p6423b.C83460h) r8     // Catch:{ Exception -> 0x0624 }
            com.google.android.apps.gsa.shared.search.Query r9 = com.google.android.apps.gsa.shared.search.Query.f252741b     // Catch:{ Exception -> 0x0624 }
            r10 = 2
            if (r8 == 0) goto L_0x004d
            int r11 = r8.f227523a     // Catch:{ Exception -> 0x0624 }
            r11 = r11 & r10
            if (r11 == 0) goto L_0x0028
            java.lang.String r11 = r8.f227525c     // Catch:{ Exception -> 0x0624 }
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84268aE(r11, r6)     // Catch:{ Exception -> 0x0624 }
        L_0x0028:
            int r11 = r8.f227523a     // Catch:{ Exception -> 0x0624 }
            r11 = r11 & r7
            if (r11 == 0) goto L_0x004d
            com.google.android.apps.gsa.nowoverlayservice.b.f r11 = r8.f227524b     // Catch:{ Exception -> 0x0624 }
            if (r11 != 0) goto L_0x0033
            com.google.android.apps.gsa.nowoverlayservice.b.f r11 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83458f.f227499u     // Catch:{ Exception -> 0x0624 }
        L_0x0033:
            boolean r11 = r11.f227516p     // Catch:{ Exception -> 0x0624 }
            if (r11 == 0) goto L_0x003c
            com.google.android.apps.gsa.shared.search.Query r5 = r9.mo84248K()     // Catch:{ Exception -> 0x0624 }
            goto L_0x004e
        L_0x003c:
            com.google.android.apps.gsa.shared.search.f r9 = r9.mo84480i()     // Catch:{ Exception -> 0x0624 }
            r11 = 0
            r13 = 262144(0x40000, double:1.295163E-318)
            r9.mo84572d(r11, r13)     // Catch:{ Exception -> 0x0624 }
            com.google.android.apps.gsa.shared.search.Query r5 = r9.mo84568a()     // Catch:{ Exception -> 0x0624 }
            goto L_0x004e
        L_0x004d:
            r5 = r9
        L_0x004e:
            com.google.android.apps.gsa.nowoverlayservice.b.f r8 = r8.f227524b     // Catch:{ Exception -> 0x061b }
            if (r8 != 0) goto L_0x0054
            com.google.android.apps.gsa.nowoverlayservice.b.f r8 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83458f.f227499u     // Catch:{ Exception -> 0x061b }
        L_0x0054:
            android.os.Bundle r4 = r4.f62650b     // Catch:{ Exception -> 0x061b }
            if (r8 == 0) goto L_0x05e4
            if (r4 != 0) goto L_0x005c
            goto L_0x05e4
        L_0x005c:
            com.google.android.apps.gsa.searchplate.a r9 = r3.f227852w     // Catch:{ Exception -> 0x061b }
            if (r9 == 0) goto L_0x0065
            r11 = 255(0xff, float:3.57E-43)
            r9.mo82738c(r11)     // Catch:{ Exception -> 0x061b }
        L_0x0065:
            com.google.android.apps.gsa.nowoverlayservice.bb r9 = r3.f227841l     // Catch:{ Exception -> 0x061b }
            android.view.View r11 = r3.f227798N     // Catch:{ Exception -> 0x061b }
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11     // Catch:{ Exception -> 0x061b }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x061b }
            android.content.Context r12 = r9.f227551b     // Catch:{ Exception -> 0x061b }
            android.content.res.Resources r12 = r12.getResources()     // Catch:{ Exception -> 0x061b }
            boolean r13 = r8.f227516p     // Catch:{ Exception -> 0x061b }
            r9.f227542H = r13     // Catch:{ Exception -> 0x061b }
            com.google.android.apps.gsa.nowoverlayservice.be r13 = r9.f227554e     // Catch:{ Exception -> 0x061b }
            com.google.android.apps.gsa.search.shared.overlay.SearchOverlayLayout r13 = r13.f236776F     // Catch:{ Exception -> 0x061b }
            r14 = 2131432711(0x7f0b1507, float:1.8487187E38)
            android.view.View r14 = r11.findViewById(r14)     // Catch:{ Exception -> 0x061b }
            r9.f227545K = r7     // Catch:{ Exception -> 0x061b }
            android.view.View r15 = r9.f227574y     // Catch:{ Exception -> 0x061b }
            r10 = 0
            r15.setOnTouchListener(r10)     // Catch:{ Exception -> 0x061b }
            com.google.android.apps.gsa.nowoverlayservice.be r15 = r9.f227554e     // Catch:{ Exception -> 0x061b }
            r15.f227587i = r7     // Catch:{ Exception -> 0x061b }
            boolean r10 = r9.f227542H     // Catch:{ Exception -> 0x061b }
            r15.f227588j = r10     // Catch:{ Exception -> 0x061b }
            int r10 = r8.f227502b     // Catch:{ Exception -> 0x061b }
            boolean r15 = r8.f227503c     // Catch:{ Exception -> 0x061b }
            r9.f227543I = r15     // Catch:{ Exception -> 0x061b }
            if (r15 == 0) goto L_0x00a2
            r15 = 2131103877(0x7f061085, float:1.7820233E38)
            int r15 = r12.getColor(r15)     // Catch:{ Exception -> 0x061b }
            goto L_0x00a9
        L_0x00a2:
            r15 = 2131103878(0x7f061086, float:1.7820235E38)
            int r15 = r12.getColor(r15)     // Catch:{ Exception -> 0x061b }
        L_0x00a9:
            int r15 = androidx.core.graphics.C1924a.m5188g(r15, r10)     // Catch:{ Exception -> 0x061b }
            r9.f227541G = r15     // Catch:{ Exception -> 0x061b }
            android.content.Context r15 = r9.f227551b     // Catch:{ Exception -> 0x061b }
            boolean r15 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r15)     // Catch:{ Exception -> 0x061b }
            if (r15 == 0) goto L_0x00c0
            r15 = 2131099855(0x7f0600cf, float:1.7812075E38)
            int r15 = r12.getColor(r15)     // Catch:{ Exception -> 0x061b }
            r9.f227541G = r15     // Catch:{ Exception -> 0x061b }
        L_0x00c0:
            android.widget.LinearLayout r15 = r9.f227565p     // Catch:{ Exception -> 0x061b }
            r7 = 0
            if (r15 == 0) goto L_0x00c8
            r15.setTranslationY(r7)     // Catch:{ Exception -> 0x061b }
        L_0x00c8:
            java.lang.String r15 = r8.f227504d     // Catch:{ Exception -> 0x061b }
            android.os.Parcelable r15 = r4.getParcelable(r15)     // Catch:{ Exception -> 0x061b }
            android.widget.RemoteViews r15 = (android.widget.RemoteViews) r15     // Catch:{ Exception -> 0x061b }
            java.lang.String r7 = r8.f227514n     // Catch:{ Exception -> 0x061b }
            android.os.Parcelable r7 = r4.getParcelable(r7)     // Catch:{ Exception -> 0x061b }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ Exception -> 0x061b }
            com.google.protobuf.cq r6 = r8.f227509i     // Catch:{ Exception -> 0x061b }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x061b }
            if (r6 != 0) goto L_0x0103
            com.google.protobuf.cq r6 = r8.f227509i     // Catch:{ Exception -> 0x061b }
            r1 = 0
            java.lang.Object r6 = r6.get(r1)     // Catch:{ Exception -> 0x061b }
            com.google.android.apps.gsa.nowoverlayservice.b.d r6 = (com.google.android.apps.gsa.nowoverlayservice.p6423b.C83456d) r6     // Catch:{ Exception -> 0x061b }
            java.lang.String r1 = r6.f227496c     // Catch:{ Exception -> 0x061b }
            android.os.Parcelable r1 = r4.getParcelable(r1)     // Catch:{ Exception -> 0x061b }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ Exception -> 0x061b }
            if (r1 == 0) goto L_0x0103
            int r6 = r1.getWidth()     // Catch:{ Exception -> 0x061b }
            int r1 = r1.getHeight()     // Catch:{ Exception -> 0x061b }
            r18 = r5
            r28 = r6
            r6 = r1
            r1 = r28
            goto L_0x0107
        L_0x0103:
            r18 = r5
            r1 = 0
            r6 = 0
        L_0x0107:
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = r8.f227507g     // Catch:{ Exception -> 0x05e0 }
            if (r5 != 0) goto L_0x010d
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x05e0 }
        L_0x010d:
            int r5 = r5.f227488b     // Catch:{ Exception -> 0x05e0 }
            r19 = r3
            com.google.android.apps.gsa.nowoverlayservice.b.b r3 = r8.f227506f     // Catch:{ Exception -> 0x05de }
            if (r3 != 0) goto L_0x011e
            com.google.android.apps.gsa.nowoverlayservice.b.b r20 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x05de }
            r28 = r20
            r20 = r2
            r2 = r28
            goto L_0x0121
        L_0x011e:
            r20 = r2
            r2 = r3
        L_0x0121:
            int r2 = r2.f227488b     // Catch:{ Exception -> 0x05db }
            int r5 = r5 - r2
            if (r3 != 0) goto L_0x012e
            com.google.android.apps.gsa.nowoverlayservice.b.b r3 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
            goto L_0x012e
        L_0x0129:
            r0 = move-exception
            r2 = r20
            goto L_0x0620
        L_0x012e:
            int r2 = r3.f227490d     // Catch:{ Exception -> 0x05db }
            int r5 = r5 - r2
            if (r5 <= 0) goto L_0x0137
            r2 = 1
            int r3 = r5 >> 1
            goto L_0x013e
        L_0x0137:
            r2 = 2131171282(0x7f0717d2, float:1.7956946E38)
            int r3 = r12.getDimensionPixelSize(r2)     // Catch:{ Exception -> 0x05db }
        L_0x013e:
            android.content.res.Configuration r2 = r12.getConfiguration()     // Catch:{ Exception -> 0x05db }
            int r2 = r2.orientation     // Catch:{ Exception -> 0x05db }
            r5 = 2
            if (r2 != r5) goto L_0x0149
            r2 = 1
            goto L_0x014a
        L_0x0149:
            r2 = 0
        L_0x014a:
            if (r2 == 0) goto L_0x014e
            r5 = 0
            goto L_0x0156
        L_0x014e:
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = r8.f227506f     // Catch:{ Exception -> 0x05db }
            if (r5 != 0) goto L_0x0154
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0154:
            int r5 = r5.f227487a     // Catch:{ Exception -> 0x05db }
        L_0x0156:
            if (r2 == 0) goto L_0x0181
            r21 = r5
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = r8.f227506f     // Catch:{ Exception -> 0x0129 }
            if (r5 != 0) goto L_0x0167
            com.google.android.apps.gsa.nowoverlayservice.b.b r22 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
            r28 = r22
            r22 = r6
            r6 = r28
            goto L_0x016a
        L_0x0167:
            r22 = r6
            r6 = r5
        L_0x016a:
            int r6 = r6.f227487a     // Catch:{ Exception -> 0x0129 }
            if (r5 != 0) goto L_0x0170
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0170:
            int r5 = r5.f227489c     // Catch:{ Exception -> 0x0129 }
            android.view.ViewGroup$LayoutParams r23 = r13.getLayoutParams()     // Catch:{ Exception -> 0x0129 }
            r24 = r1
            r1 = r23
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch:{ Exception -> 0x0129 }
            r1.leftMargin = r6     // Catch:{ Exception -> 0x0129 }
            r1.width = r5     // Catch:{ Exception -> 0x0129 }
            goto L_0x0187
        L_0x0181:
            r24 = r1
            r21 = r5
            r22 = r6
        L_0x0187:
            android.view.View r1 = r9.f227574y     // Catch:{ Exception -> 0x05db }
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ Exception -> 0x05db }
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch:{ Exception -> 0x05db }
            android.content.Context r5 = r9.f227551b     // Catch:{ Exception -> 0x05db }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x05db }
            android.view.WindowInsets r6 = r11.getRootWindowInsets()     // Catch:{ Exception -> 0x05db }
            if (r6 != 0) goto L_0x01c1
            android.content.Context r6 = r9.f227551b     // Catch:{ Exception -> 0x0129 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x0129 }
            r23 = r15
            java.lang.String r15 = "status_bar_height"
            r25 = r10
            java.lang.String r10 = "dimen"
            r26 = r0
            java.lang.String r0 = "android"
            int r0 = r6.getIdentifier(r15, r10, r0)     // Catch:{ Exception -> 0x0129 }
            if (r0 != 0) goto L_0x01b6
            r0 = 2131172257(0x7f071ba1, float:1.7958924E38)
        L_0x01b6:
            android.content.Context r6 = r9.f227551b     // Catch:{ Exception -> 0x0129 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x0129 }
            int r0 = r6.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x0129 }
            goto L_0x01cf
        L_0x01c1:
            r26 = r0
            r25 = r10
            r23 = r15
            android.view.WindowInsets r0 = r11.getRootWindowInsets()     // Catch:{ Exception -> 0x05db }
            int r0 = r0.getSystemWindowInsetTop()     // Catch:{ Exception -> 0x05db }
        L_0x01cf:
            r6 = 2131171905(0x7f071a41, float:1.795821E38)
            int r6 = r5.getDimensionPixelSize(r6)     // Catch:{ Exception -> 0x05db }
            int r6 = java.lang.Math.abs(r6)     // Catch:{ Exception -> 0x05db }
            r10 = 2131172670(0x7f071d3e, float:1.7959761E38)
            int r15 = r5.getDimensionPixelSize(r10)     // Catch:{ Exception -> 0x05db }
            int r15 = java.lang.Math.abs(r15)     // Catch:{ Exception -> 0x05db }
            com.google.android.apps.gsa.nowoverlayservice.b.b r10 = r8.f227510j     // Catch:{ Exception -> 0x05db }
            if (r10 != 0) goto L_0x01f2
            com.google.android.apps.gsa.nowoverlayservice.b.b r27 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
            r28 = r27
            r27 = r13
            r13 = r28
            goto L_0x01f5
        L_0x01f2:
            r27 = r13
            r13 = r10
        L_0x01f5:
            int r13 = r13.f227490d     // Catch:{ Exception -> 0x05db }
            int r15 = r15 - r13
            boolean r13 = r9.f227542H     // Catch:{ Exception -> 0x05db }
            if (r13 == 0) goto L_0x0204
            if (r10 != 0) goto L_0x0200
            com.google.android.apps.gsa.nowoverlayservice.b.b r10 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0200:
            int r5 = r10.f227488b     // Catch:{ Exception -> 0x0129 }
            int r5 = r5 - r0
            goto L_0x020f
        L_0x0204:
            r0 = 2131169341(0x7f07103d, float:1.795301E38)
            int r0 = r5.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x05db }
            int r5 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x05db }
        L_0x020f:
            int r5 = r5 - r6
            r0 = 2
            int r15 = r15 / r0
            int r5 = r5 - r15
            r1.topMargin = r5     // Catch:{ Exception -> 0x05db }
            boolean r0 = r9.f227542H     // Catch:{ Exception -> 0x05db }
            r1 = 4
            if (r0 == 0) goto L_0x03ba
            r0 = 1111(0x457, float:1.557E-42)
            com.google.common.o.uf r0 = r9.mo76794b(r0)     // Catch:{ Exception -> 0x0129 }
            r5 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r5, r5, r5)     // Catch:{ Exception -> 0x0129 }
            r5 = 0
            r9.mo76795c(r8, r5)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.be r0 = r9.f227554e     // Catch:{ Exception -> 0x0129 }
            java.lang.String r5 = "and.gsa.launcher.allapps.appssearch"
            r6 = 1
            r0.mo81818n(r5, r6)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r0 = r8.f227515o     // Catch:{ Exception -> 0x0129 }
            if (r0 != 0) goto L_0x0236
            com.google.android.apps.gsa.nowoverlayservice.b.b r0 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0236:
            int r0 = r0.f227488b     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = r8.f227506f     // Catch:{ Exception -> 0x0129 }
            if (r5 != 0) goto L_0x023f
            com.google.android.apps.gsa.nowoverlayservice.b.b r6 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
            goto L_0x0240
        L_0x023f:
            r6 = r5
        L_0x0240:
            int r6 = r6.f227488b     // Catch:{ Exception -> 0x0129 }
            if (r5 != 0) goto L_0x0246
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0246:
            int r5 = r5.f227490d     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r10 = r8.f227510j     // Catch:{ Exception -> 0x0129 }
            if (r10 != 0) goto L_0x024f
            com.google.android.apps.gsa.nowoverlayservice.b.b r13 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
            goto L_0x0250
        L_0x024f:
            r13 = r10
        L_0x0250:
            int r13 = r13.f227488b     // Catch:{ Exception -> 0x0129 }
            if (r10 != 0) goto L_0x0256
            com.google.android.apps.gsa.nowoverlayservice.b.b r10 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0256:
            int r10 = r10.f227490d     // Catch:{ Exception -> 0x0129 }
            r15 = 2
            int r10 = r10 / r15
            int r13 = r13 + r10
            r10 = 2131172670(0x7f071d3e, float:1.7959761E38)
            int r10 = r12.getDimensionPixelSize(r10)     // Catch:{ Exception -> 0x0129 }
            int r10 = r10 / r15
            int r13 = r13 + r10
            int r10 = r0 - r13
            r9.f227539E = r10     // Catch:{ Exception -> 0x0129 }
            if (r6 < r0) goto L_0x026c
            r0 = 1
            goto L_0x026d
        L_0x026c:
            r0 = 0
        L_0x026d:
            r9.f227538D = r0     // Catch:{ Exception -> 0x0129 }
            int r5 = r5 + r3
            r0 = 2131171945(0x7f071a69, float:1.795829E38)
            int r0 = r12.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x0129 }
            int r5 = r5 - r0
            r9.f227540F = r5     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r0 = r8.f227506f     // Catch:{ Exception -> 0x0129 }
            if (r0 != 0) goto L_0x0280
            com.google.android.apps.gsa.nowoverlayservice.b.b r0 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0280:
            int r0 = r0.f227487a     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = r8.f227515o     // Catch:{ Exception -> 0x0129 }
            if (r5 != 0) goto L_0x0288
            com.google.android.apps.gsa.nowoverlayservice.b.b r5 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0288:
            int r5 = r5.f227487a     // Catch:{ Exception -> 0x0129 }
            android.widget.LinearLayout r6 = r9.f227565p     // Catch:{ Exception -> 0x0129 }
            if (r6 == 0) goto L_0x02af
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r6 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            if (r6 != 0) goto L_0x029d
            r6 = 2131434530(0x7f0b1c22, float:1.8490877E38)
            android.view.View r6 = r11.findViewById(r6)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r6 = (com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView) r6     // Catch:{ Exception -> 0x0129 }
            r9.f227536B = r6     // Catch:{ Exception -> 0x0129 }
        L_0x029d:
            if (r2 == 0) goto L_0x02af
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r2 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch:{ Exception -> 0x0129 }
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2     // Catch:{ Exception -> 0x0129 }
            int r5 = r5 - r0
            r2.leftMargin = r5     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r0 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            r0.setLayoutParams(r2)     // Catch:{ Exception -> 0x0129 }
        L_0x02af:
            r9.f227537C = r7     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r0 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            if (r0 == 0) goto L_0x02dd
            boolean r2 = r9.f227538D     // Catch:{ Exception -> 0x0129 }
            if (r2 == 0) goto L_0x02ca
            android.graphics.Bitmap r0 = r9.f227537C     // Catch:{ Exception -> 0x0129 }
            android.graphics.Bitmap r0 = r9.mo76793a(r0)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r2 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            r2.getClass()
            r2.f227397a = r0     // Catch:{ Exception -> 0x0129 }
            r2.invalidate()     // Catch:{ Exception -> 0x0129 }
            goto L_0x02d1
        L_0x02ca:
            android.graphics.Bitmap r2 = r9.f227537C     // Catch:{ Exception -> 0x0129 }
            r0.f227397a = r2     // Catch:{ Exception -> 0x0129 }
            r0.invalidate()     // Catch:{ Exception -> 0x0129 }
        L_0x02d1:
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r0 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            r2 = 0
            r0.setAlpha(r2)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.LauncherPreviewBitmapView r0 = r9.f227536B     // Catch:{ Exception -> 0x0129 }
            r2 = 0
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x0129 }
        L_0x02dd:
            java.lang.String r0 = r8.f227511k     // Catch:{ Exception -> 0x0129 }
            android.os.Parcelable r0 = r4.getParcelable(r0)     // Catch:{ Exception -> 0x0129 }
            android.widget.RemoteViews r0 = (android.widget.RemoteViews) r0     // Catch:{ Exception -> 0x0129 }
            if (r0 == 0) goto L_0x03b4
            android.content.Context r2 = r9.f227551b     // Catch:{ Exception -> 0x0129 }
            android.view.View r0 = r0.apply(r2, r11)     // Catch:{ Exception -> 0x0129 }
            r9.f227573x = r0     // Catch:{ Exception -> 0x0129 }
            android.view.View r0 = r9.f227573x     // Catch:{ Exception -> 0x0129 }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ Exception -> 0x0129 }
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = r8.f227510j     // Catch:{ Exception -> 0x0129 }
            if (r2 != 0) goto L_0x02fd
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x02fd:
            int r2 = r2.f227488b     // Catch:{ Exception -> 0x0129 }
            r0.topMargin = r2     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = r8.f227510j     // Catch:{ Exception -> 0x0129 }
            if (r2 != 0) goto L_0x0307
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0307:
            int r2 = r2.f227490d     // Catch:{ Exception -> 0x0129 }
            r0.height = r2     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = r8.f227510j     // Catch:{ Exception -> 0x0129 }
            if (r2 != 0) goto L_0x0311
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0311:
            int r2 = r2.f227489c     // Catch:{ Exception -> 0x0129 }
            r0.width = r2     // Catch:{ Exception -> 0x0129 }
            r0 = 2131432702(0x7f0b14fe, float:1.8487169E38)
            android.view.View r0 = r11.findViewById(r0)     // Catch:{ Exception -> 0x0129 }
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch:{ Exception -> 0x0129 }
            r0.removeAllViews()     // Catch:{ Exception -> 0x0129 }
            android.view.View r2 = r9.f227573x     // Catch:{ Exception -> 0x0129 }
            r0.addView(r2)     // Catch:{ Exception -> 0x0129 }
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()     // Catch:{ Exception -> 0x0129 }
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = r8.f227510j     // Catch:{ Exception -> 0x0129 }
            if (r2 != 0) goto L_0x0332
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x0332:
            int r2 = r2.f227487a     // Catch:{ Exception -> 0x0129 }
            r0.leftMargin = r2     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = r8.f227510j     // Catch:{ Exception -> 0x0129 }
            if (r2 != 0) goto L_0x033c
            com.google.android.apps.gsa.nowoverlayservice.b.b r2 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0129 }
        L_0x033c:
            int r2 = r2.f227489c     // Catch:{ Exception -> 0x0129 }
            r0.width = r2     // Catch:{ Exception -> 0x0129 }
            int r0 = r8.f227512l     // Catch:{ Exception -> 0x0129 }
            android.view.View r0 = r14.findViewById(r0)     // Catch:{ Exception -> 0x0129 }
            int r2 = r8.f227501a     // Catch:{ Exception -> 0x0129 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0353
            int r2 = r8.f227513m     // Catch:{ Exception -> 0x0129 }
            android.view.View r10 = r14.findViewById(r2)     // Catch:{ Exception -> 0x0129 }
            goto L_0x0354
        L_0x0353:
            r10 = 0
        L_0x0354:
            r27.bringToFront()     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.search.shared.overlay.b r2 = r9.f227553d     // Catch:{ Exception -> 0x0129 }
            r2.getClass()
            r5 = r27
            r2.mo76779d(r11, r5)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.bi r2 = r9.f227569t     // Catch:{ Exception -> 0x0129 }
            r2.getClass()
            android.view.View r5 = r9.f227573x     // Catch:{ Exception -> 0x0129 }
            r2.f227605h = r5     // Catch:{ Exception -> 0x0129 }
            r5 = 1
            android.animation.AnimatorSet r6 = r2.mo76815a(r5)     // Catch:{ Exception -> 0x0129 }
            r2.f227600c = r6     // Catch:{ Exception -> 0x0129 }
            r5 = 0
            android.animation.AnimatorSet r6 = r2.mo76815a(r5)     // Catch:{ Exception -> 0x0129 }
            r2.f227599b = r6     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.bi r2 = r9.f227569t     // Catch:{ Exception -> 0x0129 }
            r2.f227603f = r0     // Catch:{ Exception -> 0x0129 }
            android.view.View r0 = r2.f227603f     // Catch:{ Exception -> 0x0129 }
            r2 = 0
            r0.setAlpha(r2)     // Catch:{ Exception -> 0x0129 }
            com.google.android.apps.gsa.nowoverlayservice.bi r0 = r9.f227569t     // Catch:{ Exception -> 0x0129 }
            r0.f227604g = r10     // Catch:{ Exception -> 0x0129 }
            android.view.View r0 = r0.f227604g     // Catch:{ Exception -> 0x0129 }
            if (r0 == 0) goto L_0x038d
            r0.setAlpha(r2)     // Catch:{ Exception -> 0x0129 }
        L_0x038d:
            int r0 = r9.f227541G     // Catch:{ Exception -> 0x0129 }
            boolean r2 = r9.f227543I     // Catch:{ Exception -> 0x0129 }
            r5 = 1
            if (r5 == r2) goto L_0x0396
            r2 = r0
            goto L_0x0398
        L_0x0396:
            r2 = r25
        L_0x0398:
            r6 = 2
            int[] r7 = new int[r6]     // Catch:{ Exception -> 0x0129 }
            r10 = 0
            r7[r10] = r2     // Catch:{ Exception -> 0x0129 }
            r7[r5] = r0     // Catch:{ Exception -> 0x0129 }
            r2 = r26
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofArgb(r11, r2, r7)     // Catch:{ Exception -> 0x0129 }
            r9.f227570u = r7     // Catch:{ Exception -> 0x0129 }
            int[] r7 = new int[r6]     // Catch:{ Exception -> 0x0129 }
            r7[r10] = r0     // Catch:{ Exception -> 0x0129 }
            r7[r5] = r25     // Catch:{ Exception -> 0x0129 }
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofArgb(r11, r2, r7)     // Catch:{ Exception -> 0x0129 }
            r9.f227571v = r0     // Catch:{ Exception -> 0x0129 }
        L_0x03b4:
            r0 = 0
            r2 = 1
            r5 = 0
            r7 = 0
            goto L_0x047c
        L_0x03ba:
            boolean r0 = r8.f227517q     // Catch:{ Exception -> 0x05db }
            int r2 = r8.f227518r     // Catch:{ Exception -> 0x05db }
            int r2 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83464l.m132860a(r2)     // Catch:{ Exception -> 0x05db }
            if (r2 != 0) goto L_0x03c5
            r2 = 1
        L_0x03c5:
            int r5 = r8.f227519s     // Catch:{ Exception -> 0x05db }
            int r6 = r9.f227541G     // Catch:{ Exception -> 0x05db }
            r11.setBackgroundColor(r6)     // Catch:{ Exception -> 0x05db }
            r6 = 1110(0x456, float:1.555E-42)
            com.google.common.o.uf r6 = r9.mo76794b(r6)     // Catch:{ Exception -> 0x05db }
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ Exception -> 0x05db }
            com.google.common.o.tz r6 = (com.google.common.p4552o.C60548tz) r6     // Catch:{ Exception -> 0x05db }
            int r7 = r8.f227501a     // Catch:{ Exception -> 0x05db }
            r10 = r7 & 16384(0x4000, float:2.2959E-41)
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r10 == 0) goto L_0x0445
            r10 = 32768(0x8000, float:4.5918E-41)
            r10 = r10 & r7
            if (r10 == 0) goto L_0x0445
            r10 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 & r10
            if (r7 == 0) goto L_0x0445
            com.google.common.o.wl r7 = com.google.common.p4552o.C60615wl.f164447e     // Catch:{ Exception -> 0x0129 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ Exception -> 0x0129 }
            com.google.common.o.wk r7 = (com.google.common.p4552o.C60614wk) r7     // Catch:{ Exception -> 0x0129 }
            boolean r10 = r8.f227517q     // Catch:{ Exception -> 0x0129 }
            r7.copyOnWrite()     // Catch:{ Exception -> 0x0129 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ Exception -> 0x0129 }
            com.google.common.o.wl r12 = (com.google.common.p4552o.C60615wl) r12     // Catch:{ Exception -> 0x0129 }
            int r13 = r12.f164449a     // Catch:{ Exception -> 0x0129 }
            r14 = 1
            r13 = r13 | r14
            r12.f164449a = r13     // Catch:{ Exception -> 0x0129 }
            r12.f164450b = r10     // Catch:{ Exception -> 0x0129 }
            int r10 = r8.f227518r     // Catch:{ Exception -> 0x0129 }
            int r10 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83464l.m132860a(r10)     // Catch:{ Exception -> 0x0129 }
            if (r10 != 0) goto L_0x040d
            r10 = 1
        L_0x040d:
            int r10 = r10 + -1
            r7.copyOnWrite()     // Catch:{ Exception -> 0x0129 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ Exception -> 0x0129 }
            com.google.common.o.wl r12 = (com.google.common.p4552o.C60615wl) r12     // Catch:{ Exception -> 0x0129 }
            int r13 = r12.f164449a     // Catch:{ Exception -> 0x0129 }
            r14 = 2
            r13 = r13 | r14
            r12.f164449a = r13     // Catch:{ Exception -> 0x0129 }
            r12.f164451c = r10     // Catch:{ Exception -> 0x0129 }
            int r10 = r8.f227519s     // Catch:{ Exception -> 0x0129 }
            r7.copyOnWrite()     // Catch:{ Exception -> 0x0129 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ Exception -> 0x0129 }
            com.google.common.o.wl r12 = (com.google.common.p4552o.C60615wl) r12     // Catch:{ Exception -> 0x0129 }
            int r13 = r12.f164449a     // Catch:{ Exception -> 0x0129 }
            r13 = r13 | r1
            r12.f164449a = r13     // Catch:{ Exception -> 0x0129 }
            r12.f164452d = r10     // Catch:{ Exception -> 0x0129 }
            r6.copyOnWrite()     // Catch:{ Exception -> 0x0129 }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ Exception -> 0x0129 }
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10     // Catch:{ Exception -> 0x0129 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ Exception -> 0x0129 }
            com.google.common.o.wl r7 = (com.google.common.p4552o.C60615wl) r7     // Catch:{ Exception -> 0x0129 }
            r7.getClass()     // Catch:{ Exception -> 0x0129 }
            r10.f164170bX = r7     // Catch:{ Exception -> 0x0129 }
            int r7 = r10.f164254i     // Catch:{ Exception -> 0x0129 }
            r7 = r7 | r11
            r10.f164254i = r7     // Catch:{ Exception -> 0x0129 }
        L_0x0445:
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ Exception -> 0x05db }
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6     // Catch:{ Exception -> 0x05db }
            r7 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r6, r7, r7, r7)     // Catch:{ Exception -> 0x05db }
            r6 = 1
            r9.mo76795c(r8, r6)     // Catch:{ Exception -> 0x05db }
            int r6 = r8.f227501a     // Catch:{ Exception -> 0x05db }
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0466
            int r6 = r8.f227520t     // Catch:{ Exception -> 0x0129 }
            int r6 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83462j.m132859a(r6)     // Catch:{ Exception -> 0x0129 }
            if (r6 != 0) goto L_0x0461
            goto L_0x0466
        L_0x0461:
            if (r6 != r1) goto L_0x0466
            java.lang.String r6 = "and.gsa.launcher.shelf.appssearch"
            goto L_0x0468
        L_0x0466:
            java.lang.String r6 = "and.gsa.launcher.homescreen.appssearch"
        L_0x0468:
            com.google.android.apps.gsa.nowoverlayservice.be r7 = r9.f227554e     // Catch:{ Exception -> 0x05db }
            r10 = 1
            r7.mo81818n(r6, r10)     // Catch:{ Exception -> 0x05db }
            com.google.android.apps.gsa.nowoverlayservice.bi r6 = r9.f227569t     // Catch:{ Exception -> 0x05db }
            r6.getClass()
            r6.mo76816b()     // Catch:{ Exception -> 0x05db }
            com.google.android.apps.gsa.nowoverlayservice.bi r6 = r9.f227569t     // Catch:{ Exception -> 0x05db }
            r7 = 0
            r6.mo76817c(r7, r7)     // Catch:{ Exception -> 0x0617 }
        L_0x047c:
            int r6 = r8.f227508h     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r10 = r8.f227506f     // Catch:{ Exception -> 0x0617 }
            if (r10 != 0) goto L_0x0485
            com.google.android.apps.gsa.nowoverlayservice.b.b r11 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0617 }
            goto L_0x0486
        L_0x0485:
            r11 = r10
        L_0x0486:
            int r11 = r11.f227489c     // Catch:{ Exception -> 0x0617 }
            if (r10 != 0) goto L_0x048c
            com.google.android.apps.gsa.nowoverlayservice.b.b r10 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ Exception -> 0x0617 }
        L_0x048c:
            int r10 = r10.f227490d     // Catch:{ Exception -> 0x0617 }
            int r12 = r9.f227541G     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.nowoverlayservice.be r13 = r9.f227554e     // Catch:{ Exception -> 0x0617 }
            r15 = r23
            r13.f227578a = r15     // Catch:{ Exception -> 0x0617 }
            r13.f227579b = r6     // Catch:{ Exception -> 0x0617 }
            r13.f227581c = r11     // Catch:{ Exception -> 0x0617 }
            r13.f227582d = r10     // Catch:{ Exception -> 0x0617 }
            r6 = r24
            r13.f227583e = r6     // Catch:{ Exception -> 0x0617 }
            r6 = r22
            r13.f227584f = r6     // Catch:{ Exception -> 0x0617 }
            r6 = r21
            r13.f227585g = r6     // Catch:{ Exception -> 0x0617 }
            r13.f227586h = r3     // Catch:{ Exception -> 0x0617 }
            r13.f227590l = r12     // Catch:{ Exception -> 0x0617 }
            r13.mo81779L()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.bu r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.PIXEL_SEARCH_STARTED     // Catch:{ Exception -> 0x0617 }
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r6)     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r3 = r3.mo82013a()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.nowoverlayservice.be r6 = r9.f227554e     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.aa r6 = r6.f236773C     // Catch:{ Exception -> 0x0617 }
            r6.mo81937i(r3)     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.nowoverlayservice.be r3 = r9.f227554e     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.searchbox.client.gsa.ui.i r3 = r3.f236787Q     // Catch:{ Exception -> 0x0617 }
            if (r3 == 0) goto L_0x04d0
            boolean r6 = r3.mo82303E()     // Catch:{ Exception -> 0x0617 }
            if (r6 == 0) goto L_0x04d0
            r3.mo82316y()     // Catch:{ Exception -> 0x0617 }
        L_0x04d0:
            java.lang.String r3 = r8.f227505e     // Catch:{ Exception -> 0x0617 }
            android.os.Parcelable r3 = r4.getParcelable(r3)     // Catch:{ Exception -> 0x0617 }
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3     // Catch:{ Exception -> 0x0617 }
            if (r3 == 0) goto L_0x04de
            com.google.android.apps.gsa.nowoverlayservice.be r6 = r9.f227554e     // Catch:{ Exception -> 0x0617 }
            r6.f227591m = r3     // Catch:{ Exception -> 0x0617 }
        L_0x04de:
            com.google.protobuf.cq r3 = r8.f227509i     // Catch:{ Exception -> 0x0617 }
            java.lang.String r6 = r8.f227505e     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr.f238341g     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rq r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88167rq) r8     // Catch:{ Exception -> 0x0617 }
            r10 = 0
        L_0x04eb:
            int r11 = r3.size()     // Catch:{ Exception -> 0x0617 }
            if (r10 >= r11) goto L_0x0579
            java.lang.Object r11 = r3.get(r10)     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.nowoverlayservice.b.d r11 = (com.google.android.apps.gsa.nowoverlayservice.p6423b.C83456d) r11     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.ro r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro.f238333f     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rn r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88164rn) r12     // Catch:{ Exception -> 0x0617 }
            java.lang.String r13 = r11.f227494a     // Catch:{ Exception -> 0x0617 }
            r12.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.ro r14 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro) r14     // Catch:{ Exception -> 0x0617 }
            r13.getClass()     // Catch:{ Exception -> 0x0617 }
            int r15 = r14.f238335a     // Catch:{ Exception -> 0x0617 }
            r17 = 1
            r15 = r15 | 1
            r14.f238335a = r15     // Catch:{ Exception -> 0x0617 }
            r14.f238336b = r13     // Catch:{ Exception -> 0x0617 }
            java.lang.String r13 = r11.f227495b     // Catch:{ Exception -> 0x0617 }
            r12.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.ro r14 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro) r14     // Catch:{ Exception -> 0x0617 }
            r13.getClass()     // Catch:{ Exception -> 0x0617 }
            int r15 = r14.f238335a     // Catch:{ Exception -> 0x0617 }
            r16 = 2
            r15 = r15 | 2
            r14.f238335a = r15     // Catch:{ Exception -> 0x0617 }
            r14.f238337c = r13     // Catch:{ Exception -> 0x0617 }
            java.lang.String r13 = r11.f227496c     // Catch:{ Exception -> 0x0617 }
            r12.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.ro r14 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro) r14     // Catch:{ Exception -> 0x0617 }
            r13.getClass()     // Catch:{ Exception -> 0x0617 }
            int r15 = r14.f238335a     // Catch:{ Exception -> 0x0617 }
            r15 = r15 | r1
            r14.f238335a = r15     // Catch:{ Exception -> 0x0617 }
            r14.f238338d = r13     // Catch:{ Exception -> 0x0617 }
            java.lang.String r11 = r11.f227497d     // Catch:{ Exception -> 0x0617 }
            r12.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.ro r13 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro) r13     // Catch:{ Exception -> 0x0617 }
            r11.getClass()     // Catch:{ Exception -> 0x0617 }
            int r14 = r13.f238335a     // Catch:{ Exception -> 0x0617 }
            r14 = r14 | 8
            r13.f238335a = r14     // Catch:{ Exception -> 0x0617 }
            r13.f238339e = r11     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r11 = r12.build()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.ro r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro) r11     // Catch:{ Exception -> 0x0617 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r12 = r8.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr) r12     // Catch:{ Exception -> 0x0617 }
            r11.getClass()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.cq r13 = r12.f238344b     // Catch:{ Exception -> 0x0617 }
            boolean r14 = r13.mo58948c()     // Catch:{ Exception -> 0x0617 }
            if (r14 != 0) goto L_0x0570
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)     // Catch:{ Exception -> 0x0617 }
            r12.f238344b = r13     // Catch:{ Exception -> 0x0617 }
        L_0x0570:
            com.google.protobuf.cq r12 = r12.f238344b     // Catch:{ Exception -> 0x0617 }
            r12.add(r11)     // Catch:{ Exception -> 0x0617 }
            int r10 = r10 + 1
            goto L_0x04eb
        L_0x0579:
            r8.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r3 = r8.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr) r3     // Catch:{ Exception -> 0x0617 }
            r6.getClass()     // Catch:{ Exception -> 0x0617 }
            int r10 = r3.f238343a     // Catch:{ Exception -> 0x0617 }
            r11 = 1
            r10 = r10 | r11
            r3.f238343a = r10     // Catch:{ Exception -> 0x0617 }
            r3.f238345c = r6     // Catch:{ Exception -> 0x0617 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r3 = r8.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr) r3     // Catch:{ Exception -> 0x0617 }
            int r6 = r3.f238343a     // Catch:{ Exception -> 0x0617 }
            r10 = 2
            r6 = r6 | r10
            r3.f238343a = r6     // Catch:{ Exception -> 0x0617 }
            r3.f238346d = r0     // Catch:{ Exception -> 0x0617 }
            int r2 = r2 + -1
            r8.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr) r0     // Catch:{ Exception -> 0x0617 }
            int r3 = r0.f238343a     // Catch:{ Exception -> 0x0617 }
            r1 = r1 | r3
            r0.f238343a = r1     // Catch:{ Exception -> 0x0617 }
            r0.f238347e = r2     // Catch:{ Exception -> 0x0617 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr) r0     // Catch:{ Exception -> 0x0617 }
            int r1 = r0.f238343a     // Catch:{ Exception -> 0x0617 }
            r1 = r1 | 8
            r0.f238343a = r1     // Catch:{ Exception -> 0x0617 }
            r0.f238348f = r5     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.j r0 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.bu r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.PIXEL_APPS     // Catch:{ Exception -> 0x0617 }
            r0.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r1)     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bt r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88166rp.f238340a     // Catch:{ Exception -> 0x0617 }
            com.google.protobuf.bv r2 = r8.build()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.b.rr r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr) r2     // Catch:{ Exception -> 0x0617 }
            r0.mo82014b(r1, r2)     // Catch:{ Exception -> 0x0617 }
            r0.mo82015c(r4)     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r0.mo82013a()     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.nowoverlayservice.be r1 = r9.f227554e     // Catch:{ Exception -> 0x0617 }
            com.google.android.apps.gsa.search.shared.service.aa r1 = r1.f236773C     // Catch:{ Exception -> 0x0617 }
            r1.mo81937i(r0)     // Catch:{ Exception -> 0x0617 }
            r6 = 1
            goto L_0x0610
        L_0x05db:
            r0 = move-exception
            r7 = 0
            goto L_0x0618
        L_0x05de:
            r0 = move-exception
            goto L_0x0620
        L_0x05e0:
            r0 = move-exception
            r19 = r3
            goto L_0x0620
        L_0x05e4:
            r20 = r2
            r19 = r3
            r18 = r5
            r7 = 0
            com.google.common.f.e r0 = com.google.android.apps.gsa.nowoverlayservice.C83553y.f227783a     // Catch:{ Exception -> 0x0617 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ Exception -> 0x0617 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0617 }
            r2 = r20
            r0.mo56378ag(r1, r2)     // Catch:{ Exception -> 0x0615 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0615 }
            r1 = 6716(0x1a3c, float:9.411E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ Exception -> 0x0615 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0615 }
            java.lang.String r1 = "%s is null"
            java.lang.String r3 = "PixelAppsSearchConfig"
            java.lang.String r4 = "options"
            if (r8 != 0) goto L_0x060b
            goto L_0x060c
        L_0x060b:
            r3 = r4
        L_0x060c:
            r0.mo56389s(r1, r3)     // Catch:{ Exception -> 0x0615 }
            r6 = 0
        L_0x0610:
            r5 = r18
            r1 = r19
            goto L_0x063d
        L_0x0615:
            r0 = move-exception
            goto L_0x0621
        L_0x0617:
            r0 = move-exception
        L_0x0618:
            r2 = r20
            goto L_0x0621
        L_0x061b:
            r0 = move-exception
            r19 = r3
            r18 = r5
        L_0x0620:
            r7 = 0
        L_0x0621:
            r5 = r18
            goto L_0x0628
        L_0x0624:
            r0 = move-exception
            r19 = r3
            r7 = 0
        L_0x0628:
            com.google.common.f.e r1 = com.google.android.apps.gsa.nowoverlayservice.C83553y.f227783a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Bad config."
            r3 = 6710(0x1a36, float:9.403E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            r1 = r19
            r6 = 0
        L_0x063d:
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r1.f227849t
            r2 = 1
            r0.mo81827w(r5, r2)
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r1.f227849t
            r0.mo81820p(r2)
            if (r6 == 0) goto L_0x066c
            com.google.android.apps.gsa.nowoverlayservice.bb r0 = r1.f227841l
            android.view.View r1 = r1.f227798N
            com.google.android.apps.gsa.search.shared.overlay.b r2 = r0.f227553d
            r2.getClass()
            r2 = 2131435591(0x7f0b2047, float:1.8493028E38)
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.google.android.apps.gsa.search.shared.overlay.b r3 = r0.f227553d
            r3.mo76779d(r1, r2)
            r2 = 2131433504(0x7f0b1820, float:1.8488796E38)
            android.view.View r1 = r1.findViewById(r2)
            r0.mo76800i(r1)
            return
        L_0x066c:
            com.google.android.apps.gsa.nowoverlayservice.bb r0 = r1.f227841l
            r0.mo76801j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nowoverlayservice.C83541n.run():void");
    }
}
