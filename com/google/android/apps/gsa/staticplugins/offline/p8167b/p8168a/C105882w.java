package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import java.util.Locale;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.w */
/* compiled from: PG */
public final class C105882w {
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        if (r4 != false) goto L_0x0125;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.util.concurrent.C60870cx m176382a(com.google.android.apps.gsa.p5851g.p5853e.C74527h r9, com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105872m r10, java.util.Set r11) {
        /*
            com.google.common.base.ax r0 = r9.mo70833a()
            java.util.Locale r1 = r9.mo70836d()
            com.google.common.base.ax r0 = m176383b(r0, r1)
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x0021
            java.util.Locale r1 = r9.mo70836d()
            java.lang.Object r0 = r0.mo56107c()
            java.util.Locale r0 = (java.util.Locale) r0
            java.util.Locale r9 = r9.mo70836d()
            goto L_0x0062
        L_0x0021:
            com.google.common.base.ax r0 = r9.mo70834b()
            java.util.Locale r1 = r9.mo70836d()
            com.google.common.base.ax r0 = m176383b(r0, r1)
            com.google.common.base.ax r1 = r9.mo70835c()
            java.util.Locale r2 = r9.mo70836d()
            com.google.common.base.ax r1 = m176383b(r1, r2)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r0 = r0.mo56107c()
            java.util.Locale r0 = (java.util.Locale) r0
            goto L_0x004a
        L_0x0046:
            java.util.Locale r0 = r9.mo70836d()
        L_0x004a:
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x0057
            java.lang.Object r1 = r1.mo56107c()
            java.util.Locale r1 = (java.util.Locale) r1
            goto L_0x005b
        L_0x0057:
            java.util.Locale r1 = r9.mo70836d()
        L_0x005b:
            java.util.Locale r9 = r9.mo70836d()
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0062:
            boolean r2 = m176384c(r1, r11)
            if (r2 == 0) goto L_0x0136
            boolean r11 = m176384c(r0, r11)
            if (r11 != 0) goto L_0x0070
            goto L_0x0136
        L_0x0070:
            boolean r11 = m176385d(r1, r9)
            if (r11 == 0) goto L_0x0084
            boolean r11 = m176385d(r0, r9)
            if (r11 != 0) goto L_0x007d
            goto L_0x0084
        L_0x007d:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        L_0x0084:
            java.lang.String r11 = r1.getLanguage()
            java.lang.String r2 = r0.getLanguage()
            boolean r3 = androidx.core.p094f.C1888a.m5149c()
            if (r3 == 0) goto L_0x012f
            com.google.android.apps.gsa.staticplugins.offline.b.a.q r10 = r10.f295500a
            boolean r3 = androidx.core.p094f.C1888a.m5149c()
            if (r3 == 0) goto L_0x00ad
            android.content.Context r10 = r10.f295506a
            java.lang.Class<android.view.translation.TranslationManager> r3 = android.view.translation.TranslationManager.class
            java.lang.Object r10 = r10.getSystemService(r3)
            android.view.translation.TranslationManager r10 = (android.view.translation.TranslationManager) r10
            if (r10 == 0) goto L_0x00ad
            r3 = 1000(0x3e8, float:1.401E-42)
            java.util.Set r10 = r10.getOnDeviceTranslationCapabilities(r3, r3)
            goto L_0x00af
        L_0x00ad:
            com.google.common.b.pz r10 = com.google.common.p4522b.C58733pz.f156496a
        L_0x00af:
            java.util.Locale r11 = java.util.Locale.forLanguageTag(r11)
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r2)
            java.util.Iterator r10 = r10.iterator()
            r3 = 0
            r4 = 0
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0120
            java.lang.Object r5 = r10.next()
            android.view.translation.TranslationCapability r5 = (android.view.translation.TranslationCapability) r5
            int r6 = r5.getState()
            r7 = 3
            if (r6 != r7) goto L_0x00bd
            android.view.translation.TranslationSpec r6 = r5.getSourceSpec()
            android.icu.util.ULocale r6 = r6.getLocale()
            java.util.Locale r6 = r6.toLocale()
            android.view.translation.TranslationSpec r5 = r5.getTargetSpec()
            android.icu.util.ULocale r5 = r5.getLocale()
            java.util.Locale r5 = r5.toLocale()
            boolean r7 = r11.equals(r6)
            if (r7 == 0) goto L_0x00f4
            boolean r7 = r2.equals(r5)
            if (r7 != 0) goto L_0x0125
        L_0x00f4:
            boolean r7 = r11.equals(r5)
            if (r7 == 0) goto L_0x0101
            boolean r7 = r2.equals(r6)
            if (r7 == 0) goto L_0x0101
            goto L_0x0125
        L_0x0101:
            java.util.Locale r7 = java.util.Locale.ENGLISH
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0114
            java.util.Locale r7 = java.util.Locale.ENGLISH
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r6 = 0
            goto L_0x0115
        L_0x0114:
            r6 = r5
        L_0x0115:
            boolean r5 = r11.equals(r6)
            r3 = r3 | r5
            boolean r5 = r2.equals(r6)
            r4 = r4 | r5
            goto L_0x00bd
        L_0x0120:
            if (r3 == 0) goto L_0x012f
            if (r4 != 0) goto L_0x0125
            goto L_0x012f
        L_0x0125:
            com.google.android.apps.gsa.staticplugins.offline.b.a.b r10 = new com.google.android.apps.gsa.staticplugins.offline.b.a.b
            r10.<init>(r1, r0, r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x0131
        L_0x012f:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
        L_0x0131:
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        L_0x0136:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105882w.m176382a(com.google.android.apps.gsa.g.e.h, com.google.android.apps.gsa.staticplugins.offline.b.a.m, java.util.Set):com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.base.C58833ax m176383b(com.google.common.base.C58833ax r4, java.util.Locale r5) {
        /*
            boolean r0 = r4.mo56113h()
            if (r0 != 0) goto L_0x0009
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        L_0x0009:
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            com.google.common.b.hd r0 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105867h.f295479a
            com.google.common.b.ij r0 = r0.keySet()
            com.google.common.b.sl r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r1)
            com.google.common.b.hd r3 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105867h.f295479a
            java.lang.Object r1 = r3.get(r1)
            com.google.common.b.ij r1 = (com.google.common.p4522b.C58528ij) r1
            r1.getClass()
            boolean r1 = r1.contains(r4)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r4)
            java.lang.String r3 = r2.getDisplayLanguage(r5)
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r4)
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r3 = r2.getDisplayLanguage(r3)
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0019
        L_0x0061:
            java.lang.String r4 = r2.getCountry()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = r2.getLanguage()
            java.lang.String r0 = r5.getLanguage()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r5 = r2
        L_0x007b:
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r5)
            return r4
        L_0x0080:
            java.util.Locale r4 = java.util.Locale.forLanguageTag(r4)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105882w.m176383b(com.google.common.base.ax, java.util.Locale):com.google.common.base.ax");
    }

    /* renamed from: c */
    private static boolean m176384c(Locale locale, Set set) {
        return Collection.EL.stream(set).anyMatch(new C105880u(locale));
    }

    /* renamed from: d */
    private static boolean m176385d(Locale locale, Locale locale2) {
        return locale.getLanguage().equals(locale2.getLanguage());
    }
}
