package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10081a;

import android.content.ComponentName;
import android.content.Context;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.c */
/* compiled from: PG */
public final class C132577c {

    /* renamed from: a */
    private static final C59071e f361805a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.c");

    /* renamed from: b */
    private static final C58528ij f361806b = C58528ij.m90015O("bramble", "Cheetah", "redfin", "Redfin 64-bit only", "sunfish", "barbet", "Raven", "Oriole", "oriole", "Panther", "Pipit", "Slider", "Whitefin", "Retrofinl", "Retrofin");

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r3.booleanValue() != false) goto L_0x006a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m215541a() {
        /*
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Pixel"
            boolean r0 = r0.startsWith(r1)
            java.lang.String r1 = "WeatherWidgetAvailabilityUtils"
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r0 != 0) goto L_0x0040
            com.google.common.b.ij r0 = f361806b
            java.lang.String r6 = android.os.Build.MODEL
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0021
            goto L_0x0040
        L_0x0021:
            com.google.common.f.e r0 = f361805a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r6, r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r6 = 39756(0x9b4c, float:5.571E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r6 = "#isAnyPixel: Isn't Pixel but: %s"
            java.lang.String r7 = android.os.Build.MODEL
            r0.mo56389s(r6, r7)
            r0 = r5
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0069
            boolean r0 = androidx.core.p094f.C1888a.m5149c()
            if (r0 == 0) goto L_0x004e
            goto L_0x0062
        L_0x004e:
            com.google.common.f.e r0 = f361805a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            java.lang.String r1 = "#isAtLeastAndroidS: At least Android S is required."
            r3 = 39757(0x9b4d, float:5.5711E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            r3 = r5
        L_0x0062:
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10081a.C132577c.m215541a():java.lang.Boolean");
    }

    /* renamed from: b */
    public static void m215542b(Context context, boolean z) {
        int i = true != z ? 2 : 1;
        C58485gu o = C58485gu.m89847o("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver", "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.FreeformWeatherWidget_Receiver");
        int i2 = ((C58724pq) o).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (String) o.get(i3)), i, 1);
        }
    }
}
