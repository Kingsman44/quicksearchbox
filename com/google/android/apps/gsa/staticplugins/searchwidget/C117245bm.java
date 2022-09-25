package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bm */
/* compiled from: PG */
public final /* synthetic */ class C117245bm implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C117251bs f325482a;

    /* renamed from: b */
    public final /* synthetic */ Intent f325483b;

    public /* synthetic */ C117245bm(C117251bs bsVar, Intent intent) {
        this.f325482a = bsVar;
        this.f325483b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a0, code lost:
        if (r6.f242043c.equals(r5.f242043c) != false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03b8, code lost:
        if (r7 > (r5 - 1)) goto L_0x03ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x047a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.gsa.staticplugins.searchwidget.bs r1 = r0.f325482a
            android.content.Intent r2 = r0.f325483b
            com.google.android.apps.gsa.staticplugins.searchwidget.as r11 = r1.f325494g
            android.content.Context r1 = r1.f325491b
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.f325347a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "SearchWidgetFlow"
            r3.mo56378ag(r4, r5)
            r4 = 32708(0x7fc4, float:4.5834E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "SearchWidget:handleIntent(%s)"
            r3.mo56389s(r4, r2)
            java.lang.String r3 = r2.getAction()
            r3.getClass()
            com.google.common.b.ij r4 = com.google.android.apps.gsa.shared.p6995aq.C89257aa.f242020b
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L_0x0045
            com.google.android.apps.gsa.search.core.ag.a.e r4 = r11.f325361o
            boolean r4 = r4.mo78098al()
            if (r4 == 0) goto L_0x00a3
            com.google.common.b.ij r4 = com.google.android.apps.gsa.shared.p6995aq.C89257aa.f242021c
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x00a3
        L_0x0045:
            com.google.android.apps.gsa.search.core.ag.a.e r3 = r11.f325361o
            boolean r3 = r3.mo78102ap()
            if (r3 == 0) goto L_0x0065
            boolean r3 = r11.mo103191j(r2)
            if (r3 != 0) goto L_0x0065
            com.google.android.apps.gsa.staticplugins.searchwidget.bi r3 = r11.f325348b
            com.google.android.apps.gsa.shared.aq.z r3 = r3.mo103214a()
            com.google.android.apps.gsa.staticplugins.searchwidget.bi r4 = r11.f325348b
            com.google.android.apps.gsa.shared.aq.z r4 = r4.mo103215b()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0079
        L_0x0065:
            com.google.android.apps.gsa.search.core.ag.a.e r3 = r11.f325361o
            boolean r3 = r3.mo78098al()
            if (r3 == 0) goto L_0x0073
            boolean r3 = r11.mo103191j(r2)
            if (r3 != 0) goto L_0x0079
        L_0x0073:
            boolean r3 = r11.mo103193o()
            if (r3 == 0) goto L_0x00a3
        L_0x0079:
            com.google.android.apps.gsa.staticplugins.searchwidget.bw r3 = r11.f325362p
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r4 = r3.f325502b
            com.google.common.util.concurrent.cx r4 = r4.mo79697b()
            com.google.android.apps.gsa.staticplugins.searchwidget.bu r5 = new com.google.android.apps.gsa.staticplugins.searchwidget.bu
            r5.<init>(r3)
            com.google.common.util.concurrent.da r3 = r3.f325503c
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r3)
            com.google.android.apps.gsa.staticplugins.searchwidget.af r4 = new com.google.android.apps.gsa.staticplugins.searchwidget.af
            r4.<init>(r1, r2)
            dagger.a r1 = r11.f325360n
            java.lang.Object r1 = r1.mo27525b()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r3, r4, r1)
            goto L_0x04c7
        L_0x00a3:
            java.lang.String r3 = r2.getAction()
            java.lang.String r4 = "android.appwidget.action.APPWIDGET_UPDATE"
            boolean r4 = r4.equals(r3)
            java.lang.String r6 = "appWidgetIds"
            if (r4 == 0) goto L_0x00ca
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x027a
            int[] r2 = r2.getIntArray(r6)
            if (r2 == 0) goto L_0x027a
            int r3 = r2.length
            if (r3 <= 0) goto L_0x027a
            android.appwidget.AppWidgetManager r3 = android.appwidget.AppWidgetManager.getInstance(r1)
            com.google.common.util.concurrent.cx r1 = r11.mo103185d(r1, r3, r2)
            goto L_0x04c7
        L_0x00ca:
            java.lang.String r4 = "android.appwidget.action.APPWIDGET_DELETED"
            boolean r4 = r4.equals(r3)
            java.lang.String r7 = "appWidgetId"
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L_0x013f
            android.os.Bundle r1 = r2.getExtras()
            if (r1 == 0) goto L_0x027a
            boolean r2 = r1.containsKey(r7)
            if (r2 == 0) goto L_0x027a
            int r1 = r1.getInt(r7)
            int[] r2 = new int[r9]
            r2[r8] = r1
            com.google.android.apps.gsa.search.core.ag.a.e r1 = r11.f325361o
            boolean r1 = r1.mo78061F()
            if (r1 == 0) goto L_0x00f6
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04c7
        L_0x00f6:
            com.google.android.apps.gsa.shared.aq.aa r1 = r11.f325355i
            int[] r1 = r1.mo83225r(r2)
            int r2 = r1.length
            if (r2 != r9) goto L_0x011f
            r2 = r1[r8]
            java.util.Set r3 = r11.mo103187f()
            if (r3 == 0) goto L_0x011f
            java.lang.String r2 = java.lang.Integer.toString(r2)
            boolean r2 = r3.remove(r2)
            if (r2 == 0) goto L_0x011f
            com.google.android.apps.gsa.search.core.preferences.r r2 = r11.f325349c
            com.google.android.apps.gsa.search.core.preferences.q r2 = r2.mo80076b()
            java.lang.String r4 = "home_screen_widget_ids"
            r2.mo80074i(r4, r3)
            r2.apply()
        L_0x011f:
            com.google.android.apps.gsa.staticplugins.searchwidget.ba r2 = r11.f325354h
            com.google.android.apps.gsa.search.core.i.t r3 = r2.f325427d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246666T
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0138
            com.google.common.util.concurrent.da r3 = r2.f325430g
            com.google.android.apps.gsa.staticplugins.searchwidget.ay r4 = new com.google.android.apps.gsa.staticplugins.searchwidget.ay
            r4.<init>(r2, r1)
            com.google.common.util.concurrent.cx r1 = r3.mo19399b(r4)
            goto L_0x04c7
        L_0x0138:
            r2.mo103204c(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04c7
        L_0x013f:
            java.lang.String r4 = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS"
            boolean r4 = r4.equals(r3)
            r10 = 2
            if (r4 == 0) goto L_0x018f
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x027a
            boolean r3 = r2.containsKey(r7)
            if (r3 == 0) goto L_0x027a
            java.lang.String r3 = "appWidgetOptions"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L_0x027a
            int r4 = r2.getInt(r7)
            r2.getBundle(r3)
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r1)
            int[] r3 = new int[r9]
            r3[r8] = r4
            com.google.common.util.concurrent.cx r1 = r11.mo103186e(r1, r2, r3, r8)
            com.google.common.o.qy r2 = com.google.common.p4552o.C60462qy.UPDATED_OPTIONS_CHANGED
            com.google.common.util.concurrent.cx r2 = r11.mo103183b(r3, r2)
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r10]
            r3[r8] = r1
            r3[r9] = r2
            com.google.common.util.concurrent.cf r1 = com.google.common.util.concurrent.C60856cj.m92895d(r3)
            com.google.android.apps.gsa.staticplugins.searchwidget.an r2 = com.google.android.apps.gsa.staticplugins.searchwidget.C117199an.f325337a
            dagger.a r3 = r11.f325360n
            java.lang.Object r3 = r3.mo27525b()
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            com.google.common.util.concurrent.cx r1 = r1.mo57334a(r2, r3)
            goto L_0x04c7
        L_0x018f:
            java.lang.String r4 = "android.appwidget.action.APPWIDGET_ENABLED"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0206
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.f325347a
            com.google.common.f.x r1 = r1.mo56224b()
            r2 = 32716(0x7fcc, float:4.5845E-41)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "SearchWidget:onEnabled"
            android.databinding.C0118a.m108p(r1, r4, r2, r3, r5)
            com.google.android.apps.gsa.shared.aq.aa r1 = r11.f325355i
            int[] r1 = r1.mo83227t()
            int r2 = r1.length
            if (r2 <= r9) goto L_0x01c9
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.f325347a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            r4 = 32717(0x7fcd, float:4.5846E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "SearchWidget:onEnabled:%d widget ids exist"
            r3.mo56387q(r4, r2)
        L_0x01c9:
            com.google.android.apps.gsa.search.core.ag.a.e r2 = r11.f325361o
            boolean r2 = r2.mo78061F()
            if (r2 == 0) goto L_0x01d4
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x01dc
        L_0x01d4:
            com.google.android.apps.gsa.staticplugins.searchwidget.ba r2 = r11.f325354h
            com.google.common.o.qy r3 = com.google.common.p4552o.C60462qy.PROVIDER_ENABLED
            com.google.common.util.concurrent.cx r1 = r2.mo103206f(r3, r1)
        L_0x01dc:
            com.google.android.libraries.storage.protostore.ab r2 = r11.f325357k
            com.google.android.apps.gsa.staticplugins.searchwidget.ar r3 = com.google.android.apps.gsa.staticplugins.searchwidget.C117203ar.f325346a
            dagger.a r4 = r11.f325360n
            java.lang.Object r4 = r4.mo27525b()
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            com.google.common.util.concurrent.cx r2 = r2.mo46039a(r3, r4)
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r10]
            r3[r8] = r2
            r3[r9] = r1
            com.google.common.util.concurrent.cf r1 = com.google.common.util.concurrent.C60856cj.m92895d(r3)
            com.google.android.apps.gsa.staticplugins.searchwidget.ae r2 = com.google.android.apps.gsa.staticplugins.searchwidget.C117190ae.f325317a
            dagger.a r3 = r11.f325360n
            java.lang.Object r3 = r3.mo27525b()
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            com.google.common.util.concurrent.cx r1 = r1.mo57334a(r2, r3)
            goto L_0x04c7
        L_0x0206:
            java.lang.String r4 = "android.appwidget.action.APPWIDGET_DISABLED"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0253
            com.google.android.apps.gsa.staticplugins.searchwidget.ba r1 = r11.f325354h
            com.google.common.o.qy r2 = com.google.common.p4552o.C60462qy.PROVIDER_DISABLED
            int[] r3 = new int[r8]
            com.google.common.util.concurrent.cx r1 = r1.mo103206f(r2, r3)
            com.google.android.apps.gsa.search.core.preferences.r r2 = r11.f325349c
            com.google.android.apps.gsa.search.core.preferences.q r2 = r2.mo80076b()
            java.lang.String r3 = "search_widget_present"
            r2.mo80067b(r3, r8)
            r2.apply()
            com.google.android.libraries.storage.protostore.ab r2 = r11.f325357k
            com.google.android.apps.gsa.staticplugins.searchwidget.ak r3 = new com.google.android.apps.gsa.staticplugins.searchwidget.ak
            r3.<init>(r11)
            dagger.a r4 = r11.f325360n
            java.lang.Object r4 = r4.mo27525b()
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            com.google.common.util.concurrent.cx r2 = r2.mo46039a(r3, r4)
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r10]
            r3[r8] = r2
            r3[r9] = r1
            com.google.common.util.concurrent.cf r1 = com.google.common.util.concurrent.C60856cj.m92895d(r3)
            com.google.android.apps.gsa.staticplugins.searchwidget.al r2 = com.google.android.apps.gsa.staticplugins.searchwidget.C117197al.f325335a
            dagger.a r3 = r11.f325360n
            java.lang.Object r3 = r3.mo27525b()
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            com.google.common.util.concurrent.cx r1 = r1.mo57334a(r2, r3)
            goto L_0x04c7
        L_0x0253:
            java.lang.String r4 = "android.appwidget.action.APPWIDGET_RESTORED"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x027e
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x027a
            java.lang.String r3 = "appWidgetOldIds"
            int[] r3 = r2.getIntArray(r3)
            int[] r2 = r2.getIntArray(r6)
            if (r3 == 0) goto L_0x027a
            int r3 = r3.length
            if (r3 <= 0) goto L_0x027a
            android.appwidget.AppWidgetManager r3 = android.appwidget.AppWidgetManager.getInstance(r1)
            com.google.common.util.concurrent.cx r1 = r11.mo103185d(r1, r3, r2)
            goto L_0x04c7
        L_0x027a:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04c7
        L_0x027e:
            java.lang.String r4 = "com.google.android.finsky.intent.action.UPDATE_DSE"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "Selectable search provider widget choice selection is disabled"
            if (r4 == 0) goto L_0x02c4
            dagger.a r2 = r11.f325358l
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_RECEIVED
            r2.mo83702b(r3)
            com.google.android.apps.gsa.shared.aq.aa r2 = r11.f325355i
            boolean r2 = r2.mo83220l()
            if (r2 != 0) goto L_0x02b9
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.f325347a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 32710(0x7fc6, float:4.5836E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r5)
            dagger.a r1 = r11.f325358l
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_DISABLED
            r1.mo83702b(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04c7
        L_0x02b9:
            com.google.android.apps.gsa.staticplugins.searchwidget.ba r2 = r11.f325354h
            r2.mo103203b(r9)
            com.google.common.util.concurrent.cx r1 = r11.mo103184c(r1, r9)
            goto L_0x04c7
        L_0x02c4:
            java.lang.String r4 = "com.google.android.finsky.intent.action.UPDATE_DSE_APP_STATE"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x033d
            dagger.a r3 = r11.f325358l
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_RECEIVED
            r3.mo83702b(r4)
            com.google.android.apps.gsa.shared.aq.aa r3 = r11.f325355i
            boolean r3 = r3.mo83220l()
            if (r3 != 0) goto L_0x02fd
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.f325347a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 32709(0x7fc5, float:4.5835E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r5)
            dagger.a r1 = r11.f325358l
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_DISABLED
            r1.mo83702b(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04c7
        L_0x02fd:
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x0320
            java.lang.String r3 = "is_install"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L_0x0320
            boolean r2 = r2.getBoolean(r3)
            if (r2 != 0) goto L_0x031d
            r11.mo103189h(r8)
            com.google.android.apps.gsa.shared.aq.aa r2 = r11.f325355i
            r2.mo83219k()
            r2.mo83218j()
            goto L_0x0320
        L_0x031d:
            r11.mo103189h(r9)
        L_0x0320:
            dagger.a r2 = r11.f325358l
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_COMPLETED
            r2.mo83702b(r3)
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r1)
            com.google.android.apps.gsa.shared.aq.aa r3 = r11.f325355i
            int[] r3 = r3.mo83226s()
            com.google.common.util.concurrent.cx r1 = r11.mo103185d(r1, r2, r3)
            goto L_0x04c7
        L_0x033d:
            java.lang.String r3 = r2.getAction()
            android.appwidget.AppWidgetManager r4 = android.appwidget.AppWidgetManager.getInstance(r1)
            java.lang.String r5 = "hint-text-update-context"
            boolean r6 = r2.hasExtra(r5)
            r7 = 0
            if (r6 == 0) goto L_0x0364
            byte[] r5 = r2.getByteArrayExtra(r5)     // Catch:{ ct -> 0x0363 }
            if (r5 != 0) goto L_0x0355
            goto L_0x0364
        L_0x0355:
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0363 }
            com.google.android.apps.gsa.shared.aq.j r10 = com.google.android.apps.gsa.shared.p6995aq.C89267j.f242039f     // Catch:{ ct -> 0x0363 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (byte[]) r5, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x0363 }
            com.google.android.apps.gsa.shared.aq.j r5 = (com.google.android.apps.gsa.shared.p6995aq.C89267j) r5     // Catch:{ ct -> 0x0363 }
            r6 = r5
            goto L_0x0365
        L_0x0363:
        L_0x0364:
            r6 = r7
        L_0x0365:
            com.google.android.apps.gsa.shared.aq.j r5 = r11.mo103182a()
            if (r5 != 0) goto L_0x036c
            goto L_0x03ba
        L_0x036c:
            if (r6 != 0) goto L_0x0370
            goto L_0x04c5
        L_0x0370:
            int r7 = r6.f242044d
            int r7 = com.google.android.apps.gsa.shared.p6995aq.C89264g.m145212a(r7)
            if (r7 != 0) goto L_0x0379
            r7 = 1
        L_0x0379:
            int r10 = r5.f242044d
            int r10 = com.google.android.apps.gsa.shared.p6995aq.C89264g.m145212a(r10)
            if (r10 != 0) goto L_0x0382
            r10 = 1
        L_0x0382:
            if (r7 != r10) goto L_0x03a2
            int r7 = r6.f242042b
            int r7 = com.google.android.apps.gsa.shared.p6995aq.C89266i.m145213a(r7)
            if (r7 != 0) goto L_0x038d
            r7 = 1
        L_0x038d:
            int r10 = r5.f242042b
            int r10 = com.google.android.apps.gsa.shared.p6995aq.C89266i.m145213a(r10)
            if (r10 != 0) goto L_0x0396
            r10 = 1
        L_0x0396:
            if (r7 != r10) goto L_0x03a2
            java.lang.String r7 = r6.f242043c
            java.lang.String r10 = r5.f242043c
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x03ba
        L_0x03a2:
            int r7 = r6.f242042b
            int r7 = com.google.android.apps.gsa.shared.p6995aq.C89266i.m145213a(r7)
            if (r7 != 0) goto L_0x03ab
            r7 = 1
        L_0x03ab:
            int r7 = r7 + -1
            int r5 = r5.f242042b
            int r5 = com.google.android.apps.gsa.shared.p6995aq.C89266i.m145213a(r5)
            if (r5 != 0) goto L_0x03b6
            r5 = 1
        L_0x03b6:
            int r5 = r5 + -1
            if (r7 <= r5) goto L_0x04c5
        L_0x03ba:
            com.google.android.apps.gsa.search.core.i.t r5 = r11.f325350d
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246664R
            long r12 = r5.mo79743a(r7)
            if (r6 == 0) goto L_0x03d1
            int r5 = r6.f242045e
            long r14 = (long) r5
            r16 = 0
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x03d1
            long r12 = java.lang.Math.min(r14, r12)
        L_0x03d1:
            java.lang.String r5 = "update-hint"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x047a
            java.lang.String r5 = "hint-texts"
            boolean r7 = r2.hasExtra(r5)
            if (r7 == 0) goto L_0x047a
            java.lang.String r7 = "alternative-small-hint-texts"
            boolean r10 = r2.hasExtra(r7)
            if (r10 == 0) goto L_0x047a
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.ArrayList r3 = r2.getStringArrayListExtra(r5)
            r10.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayList r2 = r2.getStringArrayListExtra(r7)
            r3.<init>(r2)
            com.google.android.apps.gsa.staticplugins.searchwidget.x r2 = r11.f325352f
            boolean r2 = r2.mo103248k(r10, r3)
            if (r2 == 0) goto L_0x04aa
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x0420
            int r2 = r10.size()
            if (r2 != r9) goto L_0x041e
            java.lang.String r2 = ""
            java.lang.Object r2 = com.google.common.p4522b.C58557jl.m90130k(r10, r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x041e
            goto L_0x0420
        L_0x041e:
            r7 = 0
            goto L_0x0421
        L_0x0420:
            r7 = 1
        L_0x0421:
            if (r6 == 0) goto L_0x0430
            int r2 = r6.f242042b
            int r2 = com.google.android.apps.gsa.shared.p6995aq.C89266i.m145213a(r2)
            if (r2 != 0) goto L_0x042c
            goto L_0x0430
        L_0x042c:
            if (r2 == r9) goto L_0x0430
            r2 = 1
            goto L_0x0431
        L_0x0430:
            r2 = 0
        L_0x0431:
            if (r7 != 0) goto L_0x044b
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f325350d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246733p
            boolean r3 = r3.mo79746e(r5)
            if (r3 == 0) goto L_0x044b
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f325350d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246583x
            boolean r3 = r3.mo79746e(r5)
            if (r3 != 0) goto L_0x0449
            if (r2 == 0) goto L_0x044b
        L_0x0449:
            r5 = 1
            goto L_0x044c
        L_0x044b:
            r5 = 0
        L_0x044c:
            if (r5 == 0) goto L_0x045b
            dagger.a r2 = r11.f325358l
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HINT_TEXT_RENDER_START
            r2.mo83702b(r3)
        L_0x045b:
            com.google.android.apps.gsa.shared.aq.aa r2 = r11.f325355i
            int[] r2 = r2.mo83227t()
            com.google.common.util.concurrent.cx r1 = r11.mo103186e(r1, r4, r2, r9)
            com.google.android.apps.gsa.staticplugins.searchwidget.ad r2 = new com.google.android.apps.gsa.staticplugins.searchwidget.ad
            r3 = r2
            r4 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8, r10)
            dagger.a r3 = r11.f325360n
            java.lang.Object r3 = r3.mo27525b()
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, r2, r3)
            goto L_0x04c7
        L_0x047a:
            java.lang.String r5 = "update-widget-intent"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x04ad
            java.lang.String r5 = "update-widget"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x048b
            goto L_0x04ad
        L_0x048b:
            java.lang.String r4 = "com.google.android.apps.gsa.searchwidget.SHOW_WIDGET_CUSTOMIZATION"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x04aa
            com.google.android.apps.gsa.staticplugins.searchwidget.bi r3 = r11.f325348b
            com.google.android.apps.gsa.shared.aq.z r3 = r3.mo103214a()
            java.lang.String r4 = "widget-customization-source-key"
            java.lang.String r2 = r2.getStringExtra(r4)
            if (r2 != 0) goto L_0x04a3
            java.lang.String r2 = "unknown"
        L_0x04a3:
            android.content.Intent r2 = com.google.android.apps.gsa.shared.p6995aq.C89257aa.m145192d(r3, r2)
            r1.startActivity(r2)
        L_0x04aa:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04c7
        L_0x04ad:
            java.lang.String r3 = "update_widget_customization"
            boolean r2 = r2.hasExtra(r3)
            if (r2 == 0) goto L_0x04ba
            com.google.android.apps.search.googleapp.searchwidget.j r2 = r11.f325363q
            r2.mo114659a()
        L_0x04ba:
            com.google.android.apps.gsa.shared.aq.aa r2 = r11.f325355i
            int[] r2 = r2.mo83226s()
            com.google.common.util.concurrent.cx r1 = r11.mo103186e(r1, r4, r2, r8)
            goto L_0x04c7
        L_0x04c5:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x04c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117245bm.mo17947a():java.lang.Object");
    }
}
