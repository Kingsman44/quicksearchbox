package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.app.Activity;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.p6502ae.C84464e;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.r */
/* compiled from: PG */
final class C98023r extends C88987b {

    /* renamed from: b */
    private static final C58485gu f273703b = C58485gu.m89848p("use_recently", "use_custom_tabs", "relationships");

    /* renamed from: c */
    private final Activity f273704c;

    /* renamed from: d */
    private final C84418a f273705d;

    /* renamed from: e */
    private final C84464e f273706e;

    /* renamed from: f */
    private final C86124t f273707f;

    /* renamed from: g */
    private final C86127w f273708g;

    /* renamed from: h */
    private final C97986bj f273709h;

    /* renamed from: i */
    private final C98020o f273710i;

    /* renamed from: j */
    private final C98005cb f273711j;

    /* renamed from: k */
    private final C98007cd f273712k;

    public C98023r(Activity activity, C84418a aVar, C84464e eVar, C86127w wVar, C97986bj bjVar, C98020o oVar, C98005cb cbVar, C86124t tVar, C98007cd cdVar) {
        this.f273704c = activity;
        this.f273705d = aVar;
        this.f273706e = eVar;
        this.f273708g = wVar;
        this.f273709h = bjVar;
        this.f273710i = oVar;
        this.f273707f = tVar;
        this.f273711j = cbVar;
        this.f273712k = cdVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.settingsui.C88990e mo82939a(android.preference.Preference r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getKey()
            com.google.common.b.gu r1 = f273703b
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0013
            com.google.android.apps.gsa.staticplugins.cm.bj r0 = r6.f273709h
            com.google.android.apps.gsa.settingsui.e r7 = r0.mo82939a(r7)
            return r7
        L_0x0013:
            int r7 = r0.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r7) {
                case -1450764363: goto L_0x0047;
                case 462857737: goto L_0x003d;
                case 830144380: goto L_0x0033;
                case 1078465683: goto L_0x0029;
                case 1346233661: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0051
        L_0x001f:
            java.lang.String r7 = "search_widget_doodle_preference"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0051
            r7 = 4
            goto L_0x0052
        L_0x0029:
            java.lang.String r7 = "suggest_trends_enabled"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0051
            r7 = 2
            goto L_0x0052
        L_0x0033:
            java.lang.String r7 = "personal_search_results_preference"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0051
            r7 = 0
            goto L_0x0052
        L_0x003d:
            java.lang.String r7 = "show_interest_feed_preference"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0051
            r7 = 1
            goto L_0x0052
        L_0x0047:
            java.lang.String r7 = "search_video_preview_autoplay"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0051
            r7 = 3
            goto L_0x0052
        L_0x0051:
            r7 = -1
        L_0x0052:
            if (r7 == 0) goto L_0x006f
            if (r7 == r4) goto L_0x006c
            if (r7 == r3) goto L_0x0064
            if (r7 == r2) goto L_0x0061
            if (r7 == r1) goto L_0x005e
            r7 = 0
            return r7
        L_0x005e:
            com.google.android.apps.gsa.staticplugins.cm.cd r7 = r6.f273712k
            return r7
        L_0x0061:
            com.google.android.apps.gsa.staticplugins.cm.cb r7 = r6.f273711j
            return r7
        L_0x0064:
            com.google.android.apps.gsa.staticplugins.cm.bz r7 = new com.google.android.apps.gsa.staticplugins.cm.bz
            android.app.Activity r0 = r6.f273704c
            r7.<init>(r0)
            return r7
        L_0x006c:
            com.google.android.apps.gsa.staticplugins.cm.o r7 = r6.f273710i
            return r7
        L_0x006f:
            com.google.android.apps.gsa.staticplugins.cm.bx r7 = new com.google.android.apps.gsa.staticplugins.cm.bx
            android.app.Activity r1 = r6.f273704c
            com.google.android.apps.gsa.search.core.ae.a.a r2 = r6.f273705d
            com.google.android.apps.gsa.search.core.ae.e r3 = r6.f273706e
            com.google.android.apps.gsa.search.core.i.w r4 = r6.f273708g
            com.google.android.apps.gsa.search.core.i.t r5 = r6.f273707f
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7681cm.C98023r.mo82939a(android.preference.Preference):com.google.android.apps.gsa.settingsui.e");
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        String key = preference.getKey();
        if ("feed_data_saver_preference".equals(key)) {
            this.f273710i.mo82941c(preference);
        } else if (!"signed_out_search".equals(key)) {
            super.mo82941c(preference);
        }
    }
}
